/* 
 * Sourcerer: an infrastructure for large-scale source code analysis.
 * Copyright (C) by contributors. See CONTRIBUTORS.txt for full list.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package edu.uci.ics.sourcerer.util.io.properties;

import java.io.InputStream;

import edu.uci.ics.sourcerer.util.io.Property;

/**
 * @author Joel Ossher (jossher@uci.edu)
 */
public class StreamProperty extends Property<InputStream> {
  public StreamProperty(String name, String category, String description) {
    super(name, category, description);
  }
  
  @Override
  public String getType() {
    return "InputStream";
  }
  
  @Override
  protected InputStream parseString(String value) {
    return null;
  }
}
