/*******************************************************************************
 * Educational Online Test Delivery System 
 * Copyright (c) 2014 American Institutes for Research
 *  
 * Distributed under the AIR Open Source License, Version 1.0 
 * See accompanying file AIR-License-1_0.txt or at
 * http://www.smarterapp.org/documents/American_Institutes_for_Research_Open_Source_Software_License.pdf
 ******************************************************************************/
package scoringengine;

import java.util.HashMap;
import java.util.Map;

import scoringengine.configuredtests.TestBlueprint;

/**
 * @author mpatel
 *
 */

//TODO mpatel - implement All Methods of class
public class TestCollection
{
  
  private Map<String, TestBlueprint> _tests = new HashMap<String, TestBlueprint>();
  
  public TestCollection(String itemBankConnectionString, String environment, boolean loadAllTests) 
  {
//    this(itemBankConnectionString, environment, loadAllTests, null);
  }
  
  
  public boolean hasTest(String testName)
  {
   
      return false;
  }
  

  /// <summary>
  /// Original signature so as not to break existing clients; will load conversion tables for all clients.
  /// </summary>
//  [Obsolete("Use overload that takes clientName.  This version will load for all clients.", false)]
  public void loadConversionTables()
  {
    loadConversionTables("");
  }
  
  /// <summary>
  /// Loads conversion tables on demand
  /// TODO: this may go away if we add a mapping table between conversion tables
  /// and tests.  Then we can load the conversion tables when the test is loaded.
  /// </summary>
  public void loadConversionTables(String clientName)
  {
  }
  
  public void deleteTest(String testName)
  {
    
  }
  
/// <summary>
  /// Loads configuration data for the specified test
  /// </summary>
  /// <param name="testName"></param>
  public void loadTest(String testName)
  {
  }
  
}