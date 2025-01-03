import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class DayTen{
  public static int chipExchange(String filename){
    try{
      File file = new File(filename);
      Scanner instructions = new Scanner(file);
      String line, step, outputnum;
      ArrayList<String> listInstructions = new ArrayList<String>();
      ArrayList<Integer> listBots = new ArrayList<Integer>();
      ArrayList<Integer> chip1List = new ArrayList<Integer>();
      ArrayList<Integer> chip2List = new ArrayList<Integer>();
      ArrayList<String> chipin012 = new ArrayList<String>();
      int value, botID, i = 0, chip1, chip2, botIDrecieve;
      while (instructions.hasNextLine()){
        line = instructions.nextLine();
        listInstructions.add(line);
      }

      while (i < listInstructions.size()){
        step = listInstructions.get(i);
        if (step.substring(0,5).equals("value")){
          value = Integer.parseInt(step.substring(step.indexOf(" ") + 1, step.indexOf("g") - 1));
          botID = Integer.parseInt(step.substring(step.indexOf("bot") + 4));
          if (listBots.contains(botID)){
            if (chip1List.get(listBots.indexOf(botID)) == -1){
              chip1List.set(listBots.indexOf(botID), value);
            }
            else{
              chip2List.set(listBots.indexOf(botID), value);
            }
          }
          else{
            addBot(listBots, chip1List, chip2List, value, botID);
          }
          listInstructions.remove(i);
          i--;
        }

        else{
          botID = Integer.parseInt(step.substring(4, step.indexOf("g") - 1));
          if (listBots.contains(botID)){
            chip1 = chip1List.get(listBots.indexOf(botID));
            chip2 = chip2List.get(listBots.indexOf(botID));


            if (chip1 != -1 && chip2 != -1){
              if ((chip1 == 17 && chip2 == 61) || (chip1 == 61 && chip2 == 17)){
                System.out.println(botID + " is responsible for comparing the 61 and 17 chips.");
              }
              if (chip1 < chip2){
                if (step.charAt(step.indexOf("low") + 7) == 'b'){
                  botIDrecieve = Integer.parseInt(step.substring(step.indexOf("low") + 11, step.indexOf("and") - 1));
                  giving(listBots, chip1List, chip2List, chip1, botID, botIDrecieve);
                }
                else{
                  chip1List.set(listBots.indexOf(botID), -1);
                  outputnum = step.substring(step.indexOf("output") + 7, step.indexOf("and") - 1);
                  if (outputnum.equals("0") || outputnum.equals("1") || outputnum.equals("2")){
                    chipin012.add(Integer.toString(chip1));
                    System.out.println(outputnum);
                  }
                }

                if (step.charAt(step.indexOf("high") + 8) == 'b'){
                  botIDrecieve = Integer.parseInt(step.substring(step.indexOf("high") + 12));
                  giving(listBots, chip1List, chip2List, chip2, botID, botIDrecieve);
                }
                else{
                  chip2List.set(listBots.indexOf(botID), -1);
                  outputnum = step.substring(step.indexOf("output") + 7, step.indexOf("and") - 1);
                  if (outputnum.equals("0") || outputnum.equals("1") || outputnum.equals("2")){
                    chipin012.add(Integer.toString(chip2));
                    System.out.println(outputnum);
                  }
                }
              }
              else{
                if (step.charAt(step.indexOf("low") + 7) == 'b'){
                  botIDrecieve = Integer.parseInt(step.substring(step.indexOf("low") + 11, step.indexOf("and") - 1));
                  giving(listBots, chip1List, chip2List, chip2, botID, botIDrecieve);
                }
                else{
                  chip2List.set(listBots.indexOf(botID), -1);
                  outputnum = step.substring(step.indexOf("output") + 7, step.indexOf("and") - 1);
                  if (outputnum.equals("0") || outputnum.equals("1") || outputnum.equals("2")){
                    chipin012.add(Integer.toString(chip2));
                    System.out.println(outputnum);
                  }
                }

                if (step.charAt(step.indexOf("high") + 8) == 'b'){
                  botIDrecieve = Integer.parseInt(step.substring(step.indexOf("high") + 12));
                  giving(listBots, chip1List, chip2List, chip1, botID, botIDrecieve);
                }
                else{
                  chip1List.set(listBots.indexOf(botID), -1);
                  outputnum = step.substring(step.indexOf("output") + 7, step.indexOf("and") - 1);
                  if (outputnum.equals("0") || outputnum.equals("1") || outputnum.equals("2")){
                    chipin012.add(Integer.toString(chip1));
                    System.out.println(outputnum);
                  }
                }
              }
              listInstructions.remove(i);
              i--;
            }


          }
          else{
            addBot(listBots, chip1List, chip2List, -1, botID);
          }
        }
        i++;
        if (i == listInstructions.size()){
          i = 0;
        }
      }


      instructions.close();

      return Integer.parseInt(chipin012.get(0)) * Integer.parseInt(chipin012.get(1)) * Integer.parseInt(chipin012.get(2));
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void addBot(ArrayList<Integer> listBots, ArrayList<Integer> chip1List, ArrayList<Integer> chip2List, int value, int botID){
    listBots.add(botID);
    chip1List.add(value);
    chip2List.add(-1);
  }

  public static void giving(ArrayList<Integer> listBots, ArrayList<Integer> chip1List, ArrayList<Integer> chip2List, int value, int botID, int botIDrecieve){
    if (chip1List.get(listBots.indexOf(botIDrecieve)) == -1){
      chip1List.set(listBots.indexOf(botIDrecieve), value);
    }
    else{
      chip2List.set(listBots.indexOf(botIDrecieve), value);
    }

    if (chip1List.get(listBots.indexOf(botID)) == value){
      chip1List.set(listBots.indexOf(botID), -1);
    }
    else{
      chip2List.set(listBots.indexOf(botID), -1);
    }
  }

  public static void main(String[]args){
    System.out.println(chipExchange("inputDayTen.txt"));
  }
}
