/*************************************************************************
 * Educational Online Test Delivery System
 * Copyright (c) 2014 American Institutes for Research
 *
 * Distributed under the AIR Open Source License, Version 1.0
 * See accompanying file AIR-License-1_0.txt or at 
 * http://www.smarterapp.org/documents/American_Institutes_for_Research_Open_Source_Software_License.pdf
 *************************************************************************/

package scoringengine.configuredtests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import scoringengine.ScoringEngineException;

/**
 * @author mpatel
 *
 */
public class ComputationSpec
{
  String measureLabel = "";
  String measureOf = "";
  String computationRule = "";
  List<String> computationLocations = new ArrayList<String>();
  Map<Integer, List<ParameterValue>> parameterValues = new HashMap<Integer, List<ParameterValue>>();

  public String getMeasureLabel () {
    return measureLabel;
  }

  public String getMeasureOf () {
    return measureOf;
  }

  public String getComputationRule () {
    return computationRule;
  }

  public List<String> getComputationLocations () {
    return computationLocations;
  }

  public Map<Integer, List<ParameterValue>> getParameterValues () {
    return parameterValues;
  }

  public ComputationSpec(String measureLabel, String measureOf, String computationRule)
  {
      this.measureLabel = measureLabel;
      this.measureOf = measureOf;
      this.computationRule = computationRule;
  }
  
  public void AddParameter(int parameterPosition, String indexType, String index, String type, String value) throws ScoringEngineException
  {
      if (parameterPosition != -1)
      {
          if (!parameterValues.containsKey(parameterPosition)) {
            parameterValues.put (parameterPosition,new ArrayList<ParameterValue>());
          }
          parameterValues.get (parameterPosition).add(new ParameterValue(parameterPosition, indexType, index, type, value));
      }
  }

  public void AddComputationLocation(String location)
  {
      computationLocations.add(location);
  }

  public boolean HasComputationLocation(String location)
  {
      for (String loc : computationLocations){
          if (loc.equalsIgnoreCase (location)) {
            return true;
          }
      }
      return false;
  }
}
