package allClasses.classInf;


import java.util.LinkedHashSet;

public class Workers {

    private LinkedHashSet<Worker> workers = null;

    public LinkedHashSet<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(LinkedHashSet<Worker> workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "workers=" + workers +
                '}';
    }
}

