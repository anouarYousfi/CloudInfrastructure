package ma.sqli.tests.cloudinfrastructure;


import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CloudInfrastructure {
    Map<String, Store> stores;
    Map<String, Machine> machines;

    public CloudInfrastructure() {
        stores = new TreeMap<>();
        machines = new TreeMap<>();
    }

    public void uploadDocument(String storeName, String... files) {
        Store storeToBeFilled = stores.get(storeName);
        for (String file : files) {
            storeToBeFilled.addFileByName(file);
        }
    }

    public void createStore(String storeName) throws CreateStoreException {

        if (stores.get(storeName) != null)
            throw new CreateStoreException("store already exists!");
        else
            stores.put(storeName, new Store(storeName));
    }

    public String listStores() {
        String storesListInformations = stores.values().stream().map(Store::toString).collect(Collectors.joining("||"));
        return storesListInformations;
    }

    public void deleteStore(String storeName) {

        stores.remove(storeName);
    }

    public void emptyStore(String myImages) {
        Store storeToBeCleared = stores.get(myImages);
        storeToBeCleared.getFiles().clear();
    }

    public void createMachine(String machineName, String operatingSystem, String diskSize, String memory) {

        machines.put(machineName, new Machine(machineName, operatingSystem, diskSize, memory));
    }
}
