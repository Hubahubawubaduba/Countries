//Author: Jackson Hammack
//Date Created: 1/9/25
//Purpose: To play a "fun" geography based quiz with the user.


public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String capital;
  private String language;
  private String jpg;
  // add constructors
  public Country(){
    name = "";
    capital = "";
    language = "";
    jpg = "";
  }
  public Country(String n, String c, String l, String j){
    name = n;
    capital = c;
    language = l;
    jpg = j;
  }
  // Write accessor/get methods for each instance variable that returns it.
  public String getName(){
    return name;
  }
  public String getCapital(){
    return capital;
  }
  public String getLanguage(){
    return language;
  }
  public String getJpg(){
    return jpg;
  }
  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
  public String toString(){
    return "The capital of " + name + " is " + capital + " and its primary language is " + language + ".";
  }


  
}