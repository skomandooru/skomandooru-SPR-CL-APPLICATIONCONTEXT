package Lab;

import Lab.Beans.ElectricEngine;
import Lab.Beans.GasEngine;
import Lab.Beans.NuclearEngine;

public class Lab {
    /**
     * Retrieves the ElectricPoweredBean from the ApplicationContext by requesting a bean of the class
     * ElectricEngine. There is no need to modify this method.
     * @return an ElectricEngine bean
     */
    public ElectricEngine getElectricPoweredBean(){
        return (ElectricEngine) Application.applicationContext.getBean("ElectricEngine");
    }
    /**
     * TODO: Retrieve an ElectricEngine bean and return it.
     * @return an ElectricEngine bean
     */
    public GasEngine getGasPoweredBean(){
        return (GasEngine) Application.applicationContext.getBean("ElectricEngine");
    }
    /**
     * TODO: Retrieve a NuclearEngine bean and return it.
     * @return a NuclearEngine bean
     */
    public NuclearEngine getNuclearPoweredBean(){
        return (NuclearEngine) Application.applicationContext.getBean("NuclearEngine");
    }
}
