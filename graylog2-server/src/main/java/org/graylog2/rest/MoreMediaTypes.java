/**
 * This file is part of Graylog.
 *
 * Graylog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.graylog2.rest;

import javax.ws.rs.core.MediaType;

public abstract class MoreMediaTypes {
    /**
     * A {@code String} constant representing {@value #APPLICATION_SCHEMA_JSON} media type.
     */
    public final static String APPLICATION_SCHEMA_JSON = "application/schema+json";
    /**
     * A {@link MediaType} constant representing {@value #APPLICATION_SCHEMA_JSON} media type.
     *
     * @see <a href="http://json-schema.org/latest/json-schema-core.html">JSON Schema</a>
     */
    public final static MediaType APPLICATION_SCHEMA_JSON_TYPE = new MediaType("application", "schema+json");
}
