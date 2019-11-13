package ma.sqli.tests.cloudinfrastructure;

public class Machine {
    private String name;
    private String operatingSystem;
    private String diskSize;
    private String memory;



    public Machine(String name, String operatingSystem, String diskSize, String memory) {
        this.name=name;
        this.operatingSystem=operatingSystem;
        this.diskSize=diskSize;
        this.memory=memory;
    }
}
