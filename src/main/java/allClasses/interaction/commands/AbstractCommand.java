package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import interfaces.Executable;
import interfaces.Informationable;
import interfaces.Nameble;

public abstract class  AbstractCommand implements Informationable, Nameble {
    @Override
    public String getName() {
        return this.getClass().getSimpleName().toLowerCase();
    }
}

