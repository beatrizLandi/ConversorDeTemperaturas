
package CalculosDeConversaoDeTemperatura;

public class FarenheintConversor {
    
    //---------------------------------------------------------------------
        double fahreheitParaCelsius(double fahreheit){
        
        return 5.0 * (fahreheit - 32.0)/9.0; 
    }
//-------------------------------------------------------------------------
     double fahreheitParaKelvin(double fahreheit){
      
         return  ((fahreheit-32) / 1.8) +237.15; 
      
     }
     //----------------------------------------------------------
}
