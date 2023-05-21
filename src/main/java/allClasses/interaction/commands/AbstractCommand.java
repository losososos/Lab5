package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import allClasses.interaction.console.CommandCaller;
import interfaces.Executable;
import interfaces.Informationable;
import interfaces.Nameble;

public abstract class  AbstractCommand implements Informationable, Nameble {
    @Override
    public String getName() {
        return this.getClass().getSimpleName().toLowerCase();
    }
}

