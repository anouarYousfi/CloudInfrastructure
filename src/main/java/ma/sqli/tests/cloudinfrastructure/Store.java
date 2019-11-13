package ma.sqli.tests.cloudinfrastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    private String name;
    private List<File> files;

    public Store(String name) {
        this.name = name;
        files = new ArrayList<>();
    }

    public void addFileByName(String file) {
        this.files.add(new File(file));
    }

    public List<File> getFiles() {
        return files;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder storeInformations = new StringBuilder().append(name).append(":");
        if (this.getFiles().size() == 0)
            storeInformations.append("empty");
        else
            storeInformations.append(files.stream().map(File::toString).collect(Collectors.joining(", ")));
        return storeInformations.toString();
    }
}
