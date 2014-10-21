/*******************************************************************************
 * Educational Online Test Delivery System 
 * Copyright (c) 2014 American Institutes for Research
 *  
 * Distributed under the AIR Open Source License, Version 1.0 
 * See accompanying file AIR-License-1_0.txt or at
 * http://www.smarterapp.org/documents/American_Institutes_for_Research_Open_Source_Software_License.pdf
 ******************************************************************************/
package scoringengine;

import java.util.Date;


/**
 * @author mpatel
 *
 */
public class Scorer
{
  private TestCollection tc;

  public Scorer(TestCollection tc)
  {
      this.tc = tc;
  }

  public TestCollection GetTestCollection()
  {
      return tc;
  }
  
  private Date getMinDate() {
    return new Date(0L);
  }

  /// <summary>
  /// For TDS
  /// </summary>
  /// <param name="testName"></param>
  /// <param name="testScoreString"></param>
  /// <param name="testEndDate"></param>
  /// <param name="rowSeparator"></param>
  /// <param name="colSeparator"></param>
  /// <returns></returns>
  public String testScore(String testName, String testScoreString, Date testEndDate, char rowSeparator, char colSeparator, String status)
  {
      return testScore(testName, testScoreString, testEndDate, rowSeparator, colSeparator, status, "", "", getMinDate(), TestMode.Online);
  }

  public String testScore(String testName, String testScoreString, Date testEndDate, char rowSeparator, char colSeparator, String status, TestMode mode)
  {
      return testScore(testName, testScoreString, testEndDate, rowSeparator, colSeparator, status, "", "", getMinDate(), mode);
  }

  public String testScore(String testName, String testScoreString, Date testEndDate, char rowSeparator, char colSeparator, String status, String enrolledGrade)
  {
      return testScore(testName, testScoreString, testEndDate, rowSeparator, colSeparator, status, enrolledGrade, "", getMinDate(), TestMode.Online);
  }

  public String testScore(String testName, String testScoreString, Date testEndDate, char rowSeparator, char colSeparator, String status, String enrolledGrade, String form)
  {
      return testScore(testName, testScoreString, testEndDate, rowSeparator, colSeparator, status, enrolledGrade, form, getMinDate(), TestMode.Online);
  }

  public String testScore(String testName, String testScoreString, Date testEndDate, char rowSeparator, char colSeparator, String status, String enrolledGrade, String form, Date dateForceCompleted, TestMode mode)
  {
      return "Overall:RawScore:6/22:";
      //return "0";
          /*// first check whether anything is going to be scored...
          boolean toScore = false;
          if (tc.getTestScoring ().containsKey(testName)){
              for (ComputationSpec comp : tc.getTestScoring ().get (testName)) {
                  if (comp.HasComputationLocation(tc.getEnvironment ())) {
                      toScore = true;
                  }
              }
          }
          if (!toScore)
              return "";

          List<ItemScore> testScores = new ArrayList<ItemScore>();

          char[] innerSeparator = { colSeparator };
          for (String response: testScoreString.split(String.valueOf (rowSeparator)))
          {
              String[] responseParts = response.split(String.valueOf (innerSeparator));
              if (responseParts.length < 2 || responseParts.length > 4)
                  throw new ScoringEngineException("Can't parse response " + response);

              String itemName = responseParts[0];
              TestItem ti = tc.FindItem(testName, itemName);
              if (ti == null)
                  throw new ScoringEngineException("No item '" + itemName + "' on test '" + testName + "'");
              double score;
              boolean isSelected = true;
              if (responseParts[1].length () == 0)
              {
                  // this was added for DE-Alt: non-selected items will come as blank scores to the TestScoringEngine
                  score = 0;
                  isSelected = false;
              }
              else
              {
                  try
                  {
                      score = Double.parseDouble (responseParts[1]);
                  }
                  catch (Exception e)
                  {
                      throw new ScoringEngineException("Can't parse score value from response: " + response);
                  }
              }

              String dimension = "";
              boolean isFT = ti.isFieldTest ();
              if (responseParts.length == 3)
              {
                  // either old item:score:dimension or new item:score:itemUse
                  String fieldTestIndicator = responseParts[2];
                  if (fieldTestIndicator == "OP")
                      isFT = false;
                  else if (fieldTestIndicator == "FT")
                      isFT = true;
                  else
                  {
                      // OK, must be dimension
                      dimension = responseParts[2];
                      // keep FT status from ItemBank
                  }
              }
              else if (responseParts.length == 4)
              {
                  String fieldTestIndicator = responseParts[2];
                  if (fieldTestIndicator == "OP")
                      isFT = false;
                  else if (fieldTestIndicator == "FT")
                      isFT = true;
                  else
                      throw new ScoringEngineException("Field test indicator must be either 'OP' or 'FT', not '" + fieldTestIndicator + "'");
                  dimension = responseParts[3];
              }

              TestItemScoreInfo si = ti.GetScoreInfo(dimension);
              if (si == null)
                  throw new ScoringEngineException("Item '" + itemName + "' does not have dimension '" + dimension + "'");
              ItemScore ir = new ItemScore(ti, si, score, isSelected, isFT);
              // request from Larry: if item wasn't scored (e.g. grid or NL item scoring failed), score will be -1, just
              // ignore this item but still compute overall scores (needed for starting ability for next opportunity).
              // Include FT items so that we can get item counts right
              // Include "treat as not presented" items to get DCAS-Alt attemptedness rules correct (treat-as-not-presented items count towards attemptedness)
              if (score != -1 || isFT || ir.TreatAsNotPresented())
              {
                  testScores.Add(ir);
              }
          }

      Map<String, Map<String, MeasureValue>> measureValues = ApplyComputationRules(testName, enrolledGrade, new HashMap<String, Map<String, MeasureValue>>(), testScores, testEndDate, status, form, dateForceCompleted, mode);

      String scores = "";
      foreach (Map<String, MeasureValue> measures in measureValues.Values)
      {
          foreach (MeasureValue measureValue in measures.Values)
          {
              scores = scores + measureValue.TDSValue(colSeparator) + rowSeparator;
          }
      }

      if (scores.length > 0)
      {
          scores = scores.Remove(scores.length - 1);
      }

      return scores;*/
  }


 /* public Map<String, Map<String, MeasureValue>> ApplyComputationRules(String testName, String enrolledGrade, List<ItemScore> testScores, Date testDate, String status, String form)
  {
      return ApplyComputationRules(testName, enrolledGrade, new HashMap<String, Map<String, MeasureValue>>(), testScores, testDate, status, form, getMinDate(), TestMode.Online);
  }

  public Map<String, Map<String, MeasureValue>> ApplyComputationRules(String testName, Map<String, Map<String, MeasureValue>> measuresIn, List<ItemScore> testScores, Date testDate, String status)
  {
      return ApplyComputationRules(testName, "", measuresIn, testScores, testDate, status, "", getMinDate(), TestMode.Online);
  }

  public Map<String, Map<String, MeasureValue>> ApplyComputationRules(String testName, String enrolledGrade, Map<String, Map<String, MeasureValue>> measuresIn, List<ItemScore> testScores, Date testDate, String status, String form)
  {
      return ApplyComputationRules(testName, "", measuresIn, testScores, testDate, status, form, getMinDate(), TestMode.Online);
  }

  public Map<String, Map<String, MeasureValue>> ApplyComputationRules(String testName, String enrolledGrade, Map<String, Map<String, MeasureValue>> measuresIn, List<ItemScore> testScores, Date testDate, String status, String form, Date forceCompletionDate, TestMode mode)
  {
      Map<String, String> results = new HashMap<String,String>();
      SpecificComputationRules rules = new SpecificComputationRules(testName, status, enrolledGrade, form, measuresIn, testScores, testDate, tc, forceCompletionDate, mode);

      if (tc.TestScoring.ContainsKey(testName))
      {
          foreach (ComputationSpec comp in tc.TestScoring[testName])
          {
    if (comp.HasComputationLocation(tc.Environment))
              {
                  Type classType = typeof(SpecificComputationRules);
                  MethodInfo computationMethod = classType.GetMethod(comp.ComputationRule);
                  if (computationMethod == null)
                      throw new ScoringEngineException("No method called " + comp.ComputationRule + " in the SpecificComputationRules class");

                  Object[] args = new Object[computationMethod.GetParameters().length];
                  args[0] = comp.MeasureOf;
                  args[1] = comp.MeasureLabel;
                  for (int i = 2; i < args.length; i++)
                  {
                      List<ParameterValue> par = comp.ParameterValues[i - 1];
                      if (par[0].IndexType == "")
                      {
                          switch (par[0].Type.ToLower())
                          {
                              case "int":
                                  args[i] = Integer.(par[0].Value);
                                  break;
                              case "double":
                                  args[i] = Convert.ToDouble(par[0].Value);
                                  break;
                              case "String":
                                  args[i] = par[0].Value;
                                  break;
                          }
                      }
                      else if (par[0].IndexType.ToLower() == "int")
                      {
                          Map<Integer, Integer> tmpI = new HashMap<Integer, Integer>();
                          Map<Integer, Double> tmpD = new HashMap<Integer, Double>();
                          Map<Integer, String> tmpS = new HashMap<Integer, String>();
                          //switch (type)
                          //{
                          //    case "int":
                          //        args[i] = new HashMap<Integer, Integer>();
                          //        break;
                          //    case "double":
                          //        args[i] = new HashMap<Integer, Double>();
                          //        break;
                          //    case "String":
                          //        args[i] = new HashMap<Integer, String>();
                          //        break;
                          //}
                          //foreach (ParameterValue pr in par)
                          //{
                          //    int index = Convert.ToInt32(pr.Index);
                          //    switch (pr.Type.ToLower())
                          //    {
                          //        case "int":
                          //            args[i][index] = Convert.ToInt32(pr.Value);
                          //            break;
                          //        case "double":
                          //            args[i][index] = Convert.ToDouble(pr.Value);
                          //            break;
                          //        case "String":
                          //            args[i][index] = pr.Value;
                          //            break;
                          //    }
                          //}
                          for (ParameterValue pr : par)
                          {
                              int index = Convert.ToInt32(pr.Index);
                              switch (pr.Type.ToLower())
                              {
                                  case "int":
                                      tmpI[index] = Convert.ToInt32(pr.Value);
                                      break;
                                  case "double":
                                      tmpD[index] = Convert.ToDouble(pr.Value);
                                      break;
                                  case "String":
                                      tmpS[index] = pr.Value;
                                      break;
                              }
                          }
                          switch (par[0].Type.ToLower())
                          {
                              case "int":
                                  args[i] = tmpI;
                                  break;
                              case "double":
                                  args[i] = tmpD;
                                  break;
                              case "String":
                                  args[i] = tmpS;
                                  break;
                          }
                      }
                      else if (par[0].IndexType.ToLower() == "String")
                      {
                          Map<String, Integer> tmpI = new HashMap<String, Integer>();
                          Map<String, Double> tmpD = new HashMap<String, Double>();
                          Map<String, String> tmpS = new HashMap<String, String>();

                          for (ParameterValue pr : par)
                          {
                              String index = pr.Index;
                              switch (pr.Type.ToLower())
                              {
                                  case "int":
                                      tmpI[index] = Convert.ToInt32(pr.Value);
                                      break;
                                  case "double":
                                      tmpD[index] = Convert.ToDouble(pr.Value);
                                      break;
                                  case "String":
                                      tmpS[index] = pr.Value;
                                      break;
                              }
                          }
                          switch (par[0].Type.ToLower())
                          {
                              case "int":
                                  args[i] = tmpI;
                                  break;
                              case "double":
                                  args[i] = tmpD;
                                  break;
                              case "String":
                                  args[i] = tmpS;
                                  break;
                          }

                      }
                  }

                  try
                  {
                      results[comp.MeasureLabel] = (String)computationMethod.Invoke(rules, args);
                  }
                  catch (Exception e)
                  {
                      throw new ScoringEngineException("Error during application of computation rule " + comp.ComputationRule + ", measureOf " + comp.MeasureOf + ", measureLabel " + comp.MeasureLabel + ". Error: " + e.InnerException.Message, e.InnerException);
                  }
              }
          }
      }
      
      return rules.MeasureValues;
  }*/

}
