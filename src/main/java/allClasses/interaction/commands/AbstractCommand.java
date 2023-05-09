package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import interfaces.Executable;
import interfaces.Informationable;
import interfaces.Nameble;

public abstract class  AbstractCommand implements Informationable, Nameble {

    public boolean isNeedInput() {
        return false;
    }

    public boolean hasTransferData() {
        return false;
    }
    @Override
    public String getName() {
        return this.getClass().getSimpleName().toLowerCase();
    }
}

