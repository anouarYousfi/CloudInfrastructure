package ma.sqli.tests.cloudinfrastructure.machinestates;

import ma.sqli.tests.cloudinfrastructure.Machine;
import ma.sqli.tests.cloudinfrastructure.MachineState;
import ma.sqli.tests.cloudinfrastructure.MachineStateException;

public class RunningState   implements MachineState {


    @Override
    public void stop(Machine machine) {
        machine.setMachineState(new StoppedState());
    }

    @Override
    public void run(Machine machine) throws MachineStateException {
     throw new MachineStateException("already running");
    }
}
