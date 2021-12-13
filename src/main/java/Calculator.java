import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Calculator {

    public void operations(ArrayList<String> listOfInstructions){
        int applyPosition = listOfInstructions.size()-1;
        String applyLine = listOfInstructions.get(applyPosition);
        int apply = getApply(applyLine);
        int result = apply;

        //If the file only contains the apply line
        if(listOfInstructions.size() == 1){
            System.out.println(result);
        }else{
            //If the file has multiple instructions
            for (int i = 0; i <= listOfInstructions.size()-2 ; i++){

                String operation = listOfInstructions.get(i).split(" ")[0].toLowerCase();
                String term = listOfInstructions.get(i).split(" ")[1];

                switch (operation){
                    case "add":
                        System.out.println("add");
                        break;
                    case "multiply":
                        System.out.println("multiply");
                        break;
                    case "subtract":
                        System.out.println("subtract");
                        break;
                    case "divide":
                        System.out.println("divide");
                        break;
                    default:
                        System.out.println("There seems to be something wrong with the file.");
                }
            }
            System.out.println("Result = " + result);

        }
    }


    public int getApply(String applyLine){
        String[] strings = applyLine.split(" ");
        return parseInt(strings[1]);
    }
}
