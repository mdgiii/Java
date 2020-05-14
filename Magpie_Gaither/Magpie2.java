class Magpie2
{
   /**
   * Get a default greeting 
   * @return a greeting
   */
   public String getGreeting()
   {
      return "Hello, let's talk.";
   }
 
   /**
   * Gives a response to a user statement
   *
   * @param statement
   *            the user statement
   * @return 
   *            a response based on the rules given
   */
   public String getResponse(String statement)
   {
      String response = "";
      String trimedResponse = statement.trim();

      statement = statement.toLowerCase();
      if (statement.indexOf("no") >= 0)
      {
         response = "Why so negative?";
        }
      
      else if (statement.indexOf("mother") >= 0
         || statement.indexOf("father") >= 0
         || statement.indexOf("sister") >= 0
         || statement.indexOf("brother") >= 0)
      {
         response = "Tell me more about your family.";
      }
      else if (statement.indexOf("dog") >= 0
         || statement.indexOf("cat") >= 0)
         {
           response = "Tell me more about your pets.";
            }
      else if (statement.indexOf("mr.") >= 0
            || statement.indexOf("mrs.") >= 0 
            || statement.indexOf("ms.") >= 0)
         {
           response = "They sound like a good teacher.";
            }
      else if (statement.indexOf("car") >= 0)
         {
           response = "What model of car do you have?";
            }
      else if (statement.indexOf("news") >= 0)
         {
           response = "You can find local news at krcrtv.com.";
            }
      else if (statement.indexOf("you") >= 0)
         {
           response = "I am a chatbot called MagPie, programmed by Michael Gaither III.";
            }
      else if (trimedResponse.length() == 0)
      {
          response = "Say something, please.";
      }
      else
      {
         response = getRandomResponse();
      }
    
      return response;
   }// end of getResponse method

   /**
   * Pick a default response to use if nothing else fits.
   * @return 
   *      a non-committal string
   */
   private String getRandomResponse()
   {
      final int NUMBER_OF_RESPONSES = 6;
      double r = Math.random();
      int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
      String response = "";
    
      if (whichResponse == 0)
      {
         response = "Interesting, tell me more.";
      }
      else if (whichResponse == 1)
      {
         response = "Hmmm.";
      }
      else if (whichResponse == 2)
      {
         response = "Do you really think so?";
      }
      else if (whichResponse == 3)
      {
         response = "You don't say.";
      }
      else if (whichResponse == 4)
      {
         response = "Why is that?";
      }
      else if (whichResponse == 5)
      {
         response = "I didn't catch that.";
      }

      return response;
   }// end of getRandomResponse method
 
}// end of Magpie2 class


