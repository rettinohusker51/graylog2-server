import Reflux from 'reflux';

import UserNotification from 'util/UserNotification';
import URLUtils from 'util/URLUtils';
import ApiRoutes from 'routing/ApiRoutes';
import fetch from 'logic/rest/FetchProvider';

import IndexerClusterActions from 'actions/indexers/IndexerClusterActions';

const IndexerClusterStore = Reflux.createStore({
  listenables: [IndexerClusterActions],
  state: {},
  init() {
    Promise.all([
      this.health().then((health) => {
        this.state.health = health;
      }),
      this.name().then((response) => {
        this.state.name = response.name;
      })
    ]).then(() => this.trigger(this.state));
  },
  getInitialState() {
    return this.state;
  },
  health() {
    const url = URLUtils.qualifyUrl(ApiRoutes.IndexerClusterApiController.health().url);
    const promise = fetch('GET', url);

    IndexerClusterActions.health.promise(promise);

    return promise;
  },
  name() {
    const url = URLUtils.qualifyUrl(ApiRoutes.IndexerClusterApiController.name().url);
    const promise = fetch('GET', url);

    IndexerClusterActions.name.promise(promise);

    return promise;
  },
});

export default IndexerClusterStore;
