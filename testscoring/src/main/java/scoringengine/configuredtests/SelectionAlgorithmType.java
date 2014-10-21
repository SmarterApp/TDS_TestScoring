/*************************************************************************
 * Educational Online Test Delivery System
 * Copyright (c) 2014 American Institutes for Research
 *
 * Distributed under the AIR Open Source License, Version 1.0
 * See accompanying file AIR-License-1_0.txt or at 
 * http://www.smarterapp.org/documents/American_Institutes_for_Research_Open_Source_Software_License.pdf
 *************************************************************************/

package scoringengine.configuredtests;

/**
 * @author mpatel
 *
 */
public enum SelectionAlgorithmType {
  
  FixedForm(0),
  
  Adaptive(1),
  
  Virtual(2);
  
  private int value;
  
  SelectionAlgorithmType(int testModeValue) {
    value = testModeValue;
  }

  public int getValue () {
    return value;
  }
  
}
