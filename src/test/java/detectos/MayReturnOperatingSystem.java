package detectos;

import org.junit.Test;

public class MayReturnOperatingSystem {

    public String getOperatingSystem() {
        String operatingSystem = System.getProperty("os.name");
        return operatingSystem;
    }

    @Test
    public void foo(){
        System.out.println(getOperatingSystem());
    }

}
