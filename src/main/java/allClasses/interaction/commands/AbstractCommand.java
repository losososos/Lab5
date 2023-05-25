package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import allClasses.interaction.console.CommandCaller;
import interfaces.Informationable;
import interfaces.Nameble;

public abstract class  AbstractCommand implements Informationable, Nameble {
    @Override
    public String getName() {
        return camelToSnake(this.getClass().getSimpleName());
    }

    public static String camelToSnake(String string)
    {
        String result = "";


        char c = string.charAt(0);
        result = result + Character.toLowerCase(c);

        for (int i = 1; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isUpperCase(ch)) {
                result = result + '_';
                result
                        = result
                        + Character.toLowerCase(ch);
            }
            else {
                result = result + ch;
            }
        }
        return result;
    }
}

