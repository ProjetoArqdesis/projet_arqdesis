package factory;

import to.ClienteTO;
import to.AeronaveTO;
import to.VooTO;

public class TOFactory {

		public static ClienteTO getClienteTO(){
			return new ClienteTO();
		}
		
		public static AeronaveTO getAeronaveTO(){
			return new AeronaveTO();
		}
		
		public static VooTO getVooTO(){
			return new VooTO();
		}
	

}
