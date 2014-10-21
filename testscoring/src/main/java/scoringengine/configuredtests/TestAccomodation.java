/*************************************************************************
 * Educational Online Test Delivery System Copyright (c) 2014 American
 * Institutes for Research
 * 
 * Distributed under the AIR Open Source License, Version 1.0 See accompanying
 * file AIR-License-1_0.txt or at
 * http://www.smarterapp.org/documents/American_Institutes_for_Research_Open_Source_Software_License.pdf
 *************************************************************************/

package scoringengine.configuredtests;

import scoringengine.ScoringEngineException;

/**
 * @author mpatel
 * 
 */
public class TestAccomodation
{

  private String code = "";

  private String type = "";

  private String description = "";

  private int segment;

  private String source = "";
  
  private boolean multipleSelect = false;

  
  public String getSource () {
    return source;
  }

  public void setSource (String source) {
    this.source = source;
  }

  public String getCode () {
    return code;
  }

  public String getType () {
    return type;
  }

  public String getDescription () {
    return description;
  }

  public int getSegment () {
    return segment;
  }

  public boolean isMultipleSelect () {
    return multipleSelect;
  }

  public TestAccomodation()
  {
    
  }

  public TestAccomodation (String type, String description, String code, int segment, String source, int multipleSelect) throws ScoringEngineException
  {
    this.type = type;
    this.description = description;
    this.code = code;
    this.segment = segment;
    this.source = source;
    if (multipleSelect == 0)
      this.multipleSelect = false;
    else if (multipleSelect == 1)
      this.multipleSelect = true;
    else
      throw new ScoringEngineException ("multipleSelect for accomodations must be 0 or 1");
  }

}
