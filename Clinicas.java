import java.util.ArrayList;

public class Clinicas{
	public ArrayList<Citas>Mazariegos = new ArrayList<Citas>();
	public ArrayList<Citas>Munioz = new ArrayList<Citas>();
	public ArrayList<Paciente> pMazariegos = new ArrayList<Paciente>();
	public ArrayList<Paciente> pMunioz = new ArrayList<Paciente>();
	public Clinicas(){}
	
	public ArrayList<Citas> getMazariegos(){
		return Mazariegos;
	}
	
	public ArrayList<Citas> getMunioz(){
		return Munioz;
	}
	
	public ArrayList<Paciente> getPMazariegos(){
		return pMazariegos;
	}
	
	public ArrayList<Paciente> getPMunioz(){
		return pMunioz;
	}
}