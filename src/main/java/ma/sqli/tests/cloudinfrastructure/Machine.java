package ma.sqli.tests.cloudinfrastructure;

import ma.sqli.tests.cloudinfrastructure.machinestates.InactiveState;
import ma.sqli.tests.cloudinfrastructure.machinestates.RunningState;
import ma.sqli.tests.cloudinfrastructure.machinestates.StoppedState;

import java.util.stream.Collectors;

public class Machine {
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
}
