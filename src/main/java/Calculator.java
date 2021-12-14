import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Calculator {

    public void operations(ArrayList<String> instructions){
        Operation operationHandler = new Operation();

        int applyPosition = instructions.size()-1;
        String applyLine = instructions.get(applyPosition);
        int apply = parseApply(applyLine);
        int result = apply;

        for (int i = 0; i <= instructions.size()-2 ; i++){

            String operation = instructions.get(i).split(" ")[0].toLowerCase();
            int term = parseInt(instructions.get(i).split(" ")[1]);

            switch (operation){
                case "add":
                    result = operationHandler.add(result, term);
                    break;
                case "multiply":
                    result = operationHandler.multiply(result, term);
                    break;
                case "subtract":
                    result = operationHandler.subtract(result, term);
                    break;
                case "divide":
                    result = operationHandler.divide(result, term);
                    break;
                default:
                    System.out.println("There seems to be something wrong with the file.");
            }
        }
        System.out.println("Result = " + result);
    }


    public int parseApply(String applyLine){
        String[] strings = applyLine.split(" ");
        return parseInt(strings[1]);
    }
}
