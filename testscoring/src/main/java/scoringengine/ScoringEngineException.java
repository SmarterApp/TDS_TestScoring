/*************************************************************************
 * Educational Online Test Delivery System
 * Copyright (c) 2014 American Institutes for Research
 *
 * Distributed under the AIR Open Source License, Version 1.0
 * See accompanying file AIR-License-1_0.txt or at 
 * http://www.smarterapp.org/documents/American_Institutes_for_Research_Open_Source_Software_License.pdf
 *************************************************************************/

package scoringengine;

/**
 * @author mpatel
 *
 */
public class ScoringEngineException extends Exception
{

  /**
   * 
   */
  private static final long serialVersionUID = -5699812449806044682L;

  /**
   * 
   */
  public ScoringEngineException () {
    super ();
  }

  /**
   * @param message
   * @param cause
   * @param enableSuppression
   * @param writableStackTrace
   */
  public ScoringEngineException (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super (message, cause, enableSuppression, writableStackTrace);
  }

  /**
   * @param message
   * @param cause
   */
  public ScoringEngineException (String message, Throwable cause) {
    super (message, cause);
  }

  /**
   * @param message
   */
  public ScoringEngineException (String message) {
    super (message);
  }

  /**
   * @param cause
   */
  public ScoringEngineException (Throwable cause) {
    super (cause);
  }

}
