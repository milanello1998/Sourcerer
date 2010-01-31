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
package edu.uci.ics.sourcerer.model.extracted;

import java.util.Collection;

/**
 * @author Joel Ossher (jossher@uci.edu)
 */
public class UsedJarEX implements ModelEX {
  private String hash;
  private Collection<String> missingTypes;
  
  protected UsedJarEX(String hash, Collection<String> missingTypes) {
    this.hash = hash;
    this.missingTypes = missingTypes;
  }
  
  public String getHash() {
    return hash;
  }
  
  public Collection<String> getMissingTypes() {
    return missingTypes;
  }
}
