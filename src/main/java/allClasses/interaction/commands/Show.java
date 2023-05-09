package allClasses.interaction.commands;


import allClasses.classInf.Worker;
import allClasses.collection.Collection;

import javax.swing.text.html.ListView;
import java.util.Arrays;
import java.util.LinkedHashSet;

import static allClasses.collection.Collection.collection;

public class  Show extends AbstractCommand {
    @Override
    public String getInfo() {
        return getName() + "\t-\tвывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }

    public static void execute() {
        if(collection.size()!=0) {
            Worker[] outArray = {};
            outArray = collection.toArray(new Worker[collection.size()]);
            System.out.println(Arrays.toString(outArray));
        }else{
            System.out.println("Коллекция пуста");
        }
    }

}
