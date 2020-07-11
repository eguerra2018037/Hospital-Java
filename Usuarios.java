import java.util.ArrayList;

public class Usuarios{
	public static ArrayList<Doctor>doctores = new ArrayList<Doctor>();
	public static ArrayList<Paciente>pacientes = new ArrayList<Paciente>();

	
	Doctor Mazariegos = new Doctor("Ameris", "Mazariegos", 26, "Cirujano", "Ameris24", "am3r1524", 24022603);
	Doctor Munioz = new Doctor("Carlos", "Munioz", 65, "Pediatra", "Carlos18", "carl0518", 39421687);
	Paciente Giron = new Paciente("Fernando", "Giron", 29, "Fotografo", "Fer309", "f3r309", 30901);
	Paciente Aroche = new Paciente("Margarita", "Aroche", 45, "Secretaria", "Marg16", "ma4ga41ta", 16109);
		
	public Usuarios(){
		doctores.add(Mazariegos);
		doctores.add(Munioz);
		pacientes.add(Giron);
		pacientes.add(Aroche);
	}
	
	public ArrayList<Doctor> getDoctores(){
		return doctores;
	}
	
	public ArrayList<Paciente> getPacientes(){
		return pacientes;
	}

}
		
		
		
		
		
		
		
		
		
		
	