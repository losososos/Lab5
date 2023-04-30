package allClasses.interaction.console;

import allClasses.classInf.*;

public class  ConsoleInput {
    public static Worker readWorker(){
        Worker worker = null;
        while (worker==null){
                worker = new Worker(
                        InputManager.declareName(),
                        InputManager.declareSalary(),
                        EnumManager.positionChoose(),
                        EnumManager.statusChoose(),
                        InputManager.declareStartDate(),
                        InputManager.declareBirthday(),
                        EnumManager.colorChoose(),
                        InputManager.declareWeight(),
                        EnumManager.countryChoose(),
                        InputManager.declareX(),
                        InputManager.declareY()
                );
        }
        return worker;
    }
//    public Worker updateWorker(Worker worker) {
//        worker.setName(readWorker().getName());
//        worker.setSalary(readWorker().getSalary());
//        worker.setPosition(readWorker().getPosition());
//        worker.setStatus(readWorker().getStatus());
//        worker.setCreationDate(readWorker().getCreationDate());
//        worker.setStartDate(readWorker().getStartDate());
//        return worker;
//    }

}
