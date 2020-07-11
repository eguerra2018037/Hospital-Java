import java.util.Scanner;
import java.util.ArrayList;

public class Principal{
	public static ArrayList<Doctor> listadedoctores;
	public static ArrayList<Paciente> listadepacientes;
	public static ArrayList<Citas> citasMazariegos;
	public static ArrayList<Citas> citasMunioz;
	public static ArrayList<Citas> listadecitas;
	public static ArrayList<Paciente> pacientesMazariegos;
	public static ArrayList<Paciente> pacientesMunioz;
	public static void main(String args[]){
		Scanner tecla = new Scanner(System.in);
		Usuarios us = new Usuarios();
		Clinicas cita = new Clinicas();
		int ID;
		int dia;
		int mes;
		String username;
		String contrasenia;
		String nombre;
		String apellido;
		String hora;
		String op;
		String repetir = null;
		listadedoctores = us.getDoctores();
		listadepacientes = us.getPacientes();
		citasMazariegos = cita.getMazariegos();
		citasMunioz = cita.getMunioz();
		pacientesMazariegos = cita.getPMazariegos();
		pacientesMunioz = cita.getPMunioz();
		do{
			int contador = 0;
			System.out.println("=================================================");
			System.out.println("|	Bienvenido a la red del Hospital	|");
			System.out.println("=================================================");
			System.out.println("|         Ingrese su nombre de usuario	        |");
			username = tecla.next();
			System.out.println("=================================================");
			System.out.println("|	     Ingrese su contrasenia		|");
			contrasenia = tecla.next();

			for(int i=0;(i<listadedoctores.size())||(i<listadepacientes.size());i++){
				contador +=i;
				if(((username.equals(listadedoctores.get(i).getUsuario()))&&(contrasenia.equals(listadedoctores.get(i).getContrasenia())))||((username.equals(listadepacientes.get(i).getUsuario()))&&(contrasenia.equals(listadepacientes.get(i).getContrasenia())))){
					contador -= 1;
					System.out.println("|         Ingrese su numero de ID	        |");
					ID = tecla.nextInt();
		
				if((Integer.toString(ID).length() == 8)&&(ID == listadedoctores.get(i).getIdDoctor())){
						System.out.println("|			Bienvenido doctor			|");
						do{
							int contador2 = 0;
						System.out.println("|	Seleccione la accion que desea realizar	|");
						System.out.println("A. Revisar citas");
						System.out.println("B. Datos de pacientes");
						char sw = tecla.next().charAt(0);
						switch(sw){
							case 'A':
								System.out.println("Ingrese la fecha del dia a consultar");
								System.out.println("Dia:");
								dia = tecla.nextInt();
								System.out.println("Mes:"); 
								mes = tecla.nextInt();
								if(ID == listadedoctores.get(0).getIdDoctor()){
									//int contador2 = 0;
									if(citasMazariegos.size() != 0){
										for(int j=0;j<citasMazariegos.size();j++){
											contador2 +=j;
											if((dia == citasMazariegos.get(j).getDia())&&(mes == citasMazariegos.get(j).getMes())){
												contador2 -= 1;
												System.out.println(citasMazariegos.get(j).getApellido() + ", " + citasMazariegos.get(j).getNombre() + "\nEdad: " + pacientesMazariegos.get(j).getEdad() + "\nOcupacion: " + pacientesMazariegos.get(j).getOcupacion() + "\nHora: " + citasMazariegos.get(j).getHora());
											}else if((contador2 -1) == (citasMazariegos.size())){
												System.out.println("No hay citas pendientes");
											}
										}
									}else{
										System.out.println("No hay citas pendientes");
									}
								break;
								}else if(ID == listadedoctores.get(1).getIdDoctor()){
									if(citasMunioz.size() != 0){
										for(int j=0;j<citasMunioz.size();j++){
											if((dia == citasMunioz.get(j).getDia())&&(mes == citasMunioz.get(j).getMes())){
												System.out.println(citasMunioz.get(j).getApellido() + ", " + citasMunioz.get(j).getNombre() + "\nEdad: " + pacientesMunioz.get(j).getEdad() + "\nOcupacion: " + pacientesMunioz.get(j).getOcupacion() + "\nHora: " + citasMunioz.get(j).getHora());
											}else{
												System.out.println("No hay citas pendientes");
											}
										}
									}else{
										System.out.println("No hay citas pendientes");
									}
								break;
								}
							case 'B':
								if(ID == listadedoctores.get(i).getIdDoctor()){
									if(pacientesMazariegos.size() != 0){
										for(int p=0;p<pacientesMazariegos.size();p++){
											System.out.println(pacientesMazariegos.get(p).getApellido() + ", " + pacientesMazariegos.get(p).getNombre() + ", " + pacientesMazariegos.get(p).getEdad() + ", " + pacientesMazariegos.get(p).getOcupacion());
										}
									}else{
										System.out.println("Aun no hay pacientes para mostrar");
									}
								}else if(ID == listadedoctores.get(i).getIdDoctor()){
									if(pacientesMunioz.size() != 0){
										for(int p=0;p<pacientesMunioz.size();p++){
											System.out.println(pacientesMunioz.get(p).getApellido() + ", " + pacientesMunioz.get(p).getNombre() + ", " + pacientesMunioz.get(p).getEdad() + ", " + pacientesMunioz.get(p).getOcupacion());
										}
									}else{
										System.out.println("Aun no hay pacientes para mostrar");
									}
								}
								break;
							default:
					
								break;	
						}
						System.out.println("Desea regresar al menu anterior?");
						repetir = new Scanner(System.in).nextLine();
						}while (repetir.equals("si") || repetir.equals("Si"));
					}else if((Integer.toString(ID).length() == 5)&&(ID == listadepacientes.get(i).getIdPaciente())){
						System.out.println("|			Bienvenido 			|");
						do{
						System.out.println("|	Seleccione la accion que desea realizar	|");
						System.out.println("A. Reservar una cita");
						System.out.println("B. Consultar doctor");
						char sw = tecla.next().charAt(0);
						
							switch(sw){
								case 'A':
										System.out.println("Ingrese su nombre:");
										nombre = tecla.next();
										System.out.println("Ingrese su apellido:");
										apellido = tecla.next();
										
									do{
										System.out.println("Desea realizar cita por doctor o por consulta?");
										String c = tecla.next();
		
										if(c.equals("Doctor")){
											System.out.println("Seleccione el doctor con quien desea realizar la cita");
											System.out.println("A. Ameris Mazariegos");
											System.out.println("B. Carlos Munioz");
											sw = tecla.next().charAt(0);
											switch(sw){
												case 'A':
													System.out.println("Indique la fecha y hora en que desea realizar la cita");
													System.out.println("Dia:");
													dia = tecla.nextInt();
													System.out.println("Mes:");
													mes = tecla.nextInt();
													System.out.println("Hora:");
													hora = tecla.next();
										
													for(int j=0;j<citasMazariegos.size();j++){
														if((dia == (citasMazariegos.get(j).getDia()))&&(mes == (citasMazariegos.get(j).getMes())&&(hora.equals((citasMazariegos.get(j).getHora()))))){
															System.out.println("Cita no disponible");
														}
													}
													citasMazariegos.add(new Citas(nombre, apellido, dia, mes, hora));
													pacientesMazariegos.add(listadepacientes.get(i));
													break;
												case 'B':
													System.out.println("Indique la fecha y hora en que desea realizar la cita");
													System.out.println("Dia:");
													dia = tecla.nextInt();
													System.out.println("Mes:");
													mes = tecla.nextInt();
													System.out.println("Hora:");
													hora = tecla.next();
										
													for(int j=0;j<citasMunioz.size();j++){
														if((dia == (citasMunioz.get(j).getDia()))&&(mes == (citasMunioz.get(j).getMes())&&(hora.equals((citasMunioz.get(j).getHora()))))){
															System.out.println("Cita no disponible");
														}
													}
													citasMunioz.add(new Citas(nombre, apellido, dia, mes, hora));
													pacientesMunioz.add(listadepacientes.get(i));
													break;
												default:
													System.out.println("Opcion no valida");
													break;
											}
										}else if(c.equals("Consulta")){
											System.out.println("A. Ninios");
											System.out.println("B. Adultos");
											sw = tecla.next().charAt(0);
											
											switch(sw){
												case 'A':
													for(int d=0;d<listadedoctores.size();d++){
														if(listadedoctores.get(d).getEspecialidad().equals("Pediatra")){
															System.out.println("Se recomienda cita con el doctor "+ listadedoctores.get(d).getNombre() + " " + listadedoctores.get(d).getApellido());
															System.out.println("Realizar cita?");
															c = tecla.next();
															
															if(c.equals("Si")||c.equals("si")){
																System.out.println("Indique la fecha y hora en que desea realizar la cita");
																System.out.println("Dia:");
																dia = tecla.nextInt();
																System.out.println("Mes:");
																mes = tecla.nextInt();
																System.out.println("Hora:");
																hora = tecla.next();
										
																for(int j=0;j<citasMunioz.size();j++){
																	if((dia == (citasMunioz.get(j).getDia()))&&(mes == (citasMunioz.get(j).getMes())&&(hora.equals((citasMunioz.get(j).getHora()))))){
																		System.out.println("Cita no disponible");
																	}
																}
																citasMunioz.add(new Citas(nombre, apellido, dia, mes, hora));
															}
														}
													}
													break;
												case 'B':
													for(int d=0;d<listadedoctores.size();d++){
														if(listadedoctores.get(d).getEspecialidad().equals("Cirujano")){
															System.out.println("Se recomienda cita con el doctor "+ listadedoctores.get(d).getNombre() + " " + listadedoctores.get(d).getApellido());
															System.out.println("Realizar cita?");
															c = tecla.next();
															
															if(c.equals("Si")||c.equals("si")){
																System.out.println("Indique la fecha y hora en que desea realizar la cita");
																System.out.println("Dia:");
																dia = tecla.nextInt();
																System.out.println("Mes:");
																mes = tecla.nextInt();
																System.out.println("Hora:");
																hora = tecla.next();
										
																for(int j=0;j<citasMazariegos.size();j++){
																	if((dia == (citasMazariegos.get(j).getDia()))&&(mes == (citasMazariegos.get(j).getMes())&&(hora.equals((citasMazariegos.get(j).getHora()))))){
																		System.out.println("Cita no disponible");
																	}
																}
																citasMazariegos.add(new Citas(nombre, apellido, dia, mes, hora));
															}
														}
													}
													break;
											}
										}
										System.out.println("Desea realizar otra cita?");
										op = tecla.next();
										}while(op.equals("si") || op.equals("Si"));
									
								break;
							case 'B':
								for(int doc=0;doc<listadedoctores.size();doc++){
											System.out.println(listadedoctores.get(doc).getApellido() + ", " + listadedoctores.get(doc).getNombre() + ", " + listadedoctores.get(doc).getEdad() + ", " + listadedoctores.get(doc).getEspecialidad());
										}
								break;
							default:
								System.out.println("Opcion no valida");
								break;	
							}
						System.out.println("Desea regresar al menu anterior?");
						repetir = new Scanner(System.in).nextLine();
						}while (repetir.equals("si") || repetir.equals("Si"));
					}else{
						System.out.println("Numero de ID no valido");
					}
					
				}else if(((contador +1) == (listadedoctores.size()))||(contador == (listadepacientes.size())) ){
					System.out.println("Nombre de usuario y/o contrasenia no validos");
					break;
				}
			}
		System.out.println("Desea regresar al menu principal?");
		repetir = new Scanner(System.in).nextLine();
		}while (repetir.equals("si") || repetir.equals("Si"));
	}
}