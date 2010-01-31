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

/**
 * @author Joel Ossher (jossher@uci.edu)
 */
public class ImportEX implements ModelEX {
  private String imported;
  private boolean isStatic;
  private boolean onDemand;
  private String file;
  private String offset;
  private String length;

  protected ImportEX(String imported, boolean isStatic, boolean onDemand, String file, String offset, String length) {
    this.imported = imported;
    this.isStatic = isStatic;
    this.onDemand = onDemand;
    this.file = file;
    this.offset = offset;
    this.length = length;
  }
  
  public String getImported() {
    return imported;
  }

  public boolean isStatic() {
    return isStatic;
  }
  
  public boolean isOnDemand() {
    return onDemand;
  }
  
  public String getFile() {
    return file;
  }
  
  public String getOffset() {
    return offset;
  }
  
  public String getLength() {
    return length;
  }
  
  public String toString() {
    return imported + " " + file;
  }
}
