package allClasses.collection;

import allClasses.classInf.Worker;

import java.util.LinkedHashSet;

public class Collection {
    public static final LinkedHashSet<Worker> collection = new LinkedHashSet<>();
    public static final String type = "LinkedHashSet";
    public void clear() {
        collection.clear();
    }

    public static void addWorker(Worker worker){
        Collection.collection.add(worker);
    }
    public static String getType() {
        return type;
    }

    public LinkedHashSet<Worker> getCollection() {
        return Collection.collection;
    }

}
