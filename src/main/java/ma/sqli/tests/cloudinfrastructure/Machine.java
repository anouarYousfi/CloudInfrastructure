package ma.sqli.tests.cloudinfrastructure;

import ma.sqli.tests.cloudinfrastructure.machinestates.InactiveState;
import ma.sqli.tests.cloudinfrastructure.machinestates.RunningState;
import ma.sqli.tests.cloudinfrastructure.machinestates.StoppedState;


public class Machine {
    public String getName() {
        return name;
    }

    private String name;
    private String operatingSystem;
    private String diskSize;
    private String memory;

    public MachineState getMachineState() {
        return machineState;
    }

    public void setMachineState(MachineState machineState) {
        this.machineState = machineState;
    }

    private MachineState machineState;




    public Machine(String name, String operatingSystem, String diskSize, String memory) {
        this.name=name;
        this.operatingSystem=operatingSystem;
        this.diskSize=diskSize;
        this.memory=memory;
        this.machineState= new InactiveState();
    }

    @Override
    public String toString() {
        StringBuilder storeInformations = new StringBuilder().append(name).append(":");
      if (this.machineState instanceof RunningState)
        storeInformations.append("running");
      else if (this.machineState instanceof StoppedState)
        storeInformations.append("stopped");
      else
          storeInformations.append("inactive");
        return storeInformations.toString();
    }

    public double getMemory() {
       return Double.parseDouble(memory.replaceAll("[\\D]", ""));
    }

    public double getDiskSize() {
        return Double.parseDouble(diskSize.replaceAll("[\\D]", ""));

    }
}
