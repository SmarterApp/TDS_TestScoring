/*************************************************************************
 * Educational Online Test Delivery System
 * Copyright (c) 2014 American Institutes for Research
 *
 * Distributed under the AIR Open Source License, Version 1.0
 * See accompanying file AIR-License-1_0.txt or at 
 * http://www.smarterapp.org/documents/American_Institutes_for_Research_Open_Source_Software_License.pdf
 *************************************************************************/

package scoringengine.configuredtests;

import scoringengine.ScoringEngineException;

/**
 * @author mpatel
 *
 */
public class ParameterValue
{
  int parameterPosition;

  String indexType;

  String index;

  String type;

  String value;
  
  
  public int getParameterPosition () {
    return parameterPosition;
  }


  public String getIndexType () {
    return indexType;
  }


  public String getIndex () {
    return index;
  }


  public String getType () {
    return type;
  }


  public String getValue () {
    return value;
  }


  public ParameterValue(int parameterPosition, String indexType, String index, String type, String value) throws ScoringEngineException
  {
      if (indexType != "" && indexType.toLowerCase() != "int" && indexType.toLowerCase() != "String")
          throw new ScoringEngineException("IndexType must be empty or 'int' or 'String', not '" + indexType + "'");
      this.parameterPosition = parameterPosition;
      this.indexType = indexType;
      this.index = index;
      this.type = type;
      this.value = value;
  }
}
