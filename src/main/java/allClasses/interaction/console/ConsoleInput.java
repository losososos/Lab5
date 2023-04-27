package allClasses.interaction.console;

import allClasses.classInf.*;

public class  ConsoleInput {
    ScannerInput scanner = new ScannerInput();
    public Worker readWorker(){
        Worker worker = null;
        while (worker==null){
                worker = new Worker(
                        readWorker().getName(),
                        readWorker().getSalary(),
                        readWorker().getPosition(),
                        readWorker().getStatus(),
                        readWorker().getStartDate(),
                        readWorker().getPerson().getBirthday(),
                        readWorker().getPerson().getEyeColor(),
                        readWorker().getPerson().getWeight(),
                        readWorker().getPerson().getNationality(),
                        readWorker().getCoordinates().getX(),
                        readWorker().getCoordinates().getY()
                );
        }
        return worker;
    }
    public Worker updateWorker(Worker worker) {
        worker.setName(readWorker().getName());
        worker.setSalary(readWorker().getSalary());
        worker.setPosition(readWorker().getPosition());
        worker.setStatus(readWorker().getStatus());
        worker.setCreationDate(readWorker().getCreationDate());
        worker.setStartDate(readWorker().getStartDate());
        return worker;
    }

}
