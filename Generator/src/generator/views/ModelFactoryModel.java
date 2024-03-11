package generator.views;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import abstracta.AbstractaFactory;
import abstracta.AbstractaPackage;
import abstracta.Classba;
import abstracta.ModelFactoryAbstracta;
import abstracta.Packageba;
import abstracta.Projectba;
import concreta.Abstract;
import concreta.ConcretaFactory;
import concreta.ConcretaPackage;
import concreta.DiagramClassba;
import concreta.ModelFactoryConcreta;
import concreta.Relationshipba;

public class ModelFactoryModel {

	// -------------------------------------------------------------------------- Singleton --------------------------------------------------------------------------

	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aqui al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// Metodo para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	//Creacion de las factories 
	ModelFactoryConcreta modelFactoryConcreta = ConcretaFactory.eINSTANCE.createModelFactoryConcreta();
	ModelFactoryAbstracta modelFactoryAbstracta = AbstractaFactory.eINSTANCE.createModelFactoryAbstracta();

	public ModelFactoryModel() {
		modelFactoryConcreta = loadConcretaModel();
		modelFactoryAbstracta = loadAbstractaModel();
	}




	// -----------------------------------------------------------------Load and Save ModelFactorys ---------------------------------------------------------------

	/**
	 * Este metodo permite cargar el modelfactoryspecific del diagrama de clases
	 * @return El modelFactorySpecific cargada
	 */
	public ModelFactoryConcreta loadConcretaModel() {
		ModelFactoryConcreta modelFactoryConcreta = null;
		ConcretaPackage whoownmePackage = ConcretaPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model.concreta");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			modelFactoryConcreta = (ModelFactoryConcreta) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactoryConcreta);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactoryConcreta;
	}

	/**
	 * Este metodo permite cargar el modelFactoryAbstract del diagrama de clases
	 * @return
	 */
	public ModelFactoryAbstracta loadAbstractaModel() {
		ModelFactoryAbstracta modelFactoryAbstracta = null;
		AbstractaPackage whoownmePackage = AbstractaPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model.abstracta");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			modelFactoryAbstracta = (ModelFactoryAbstracta) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactoryAbstracta);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactoryAbstracta;
	}


	/**
	 * Este metodo permite guardar el ModelFactorySpecific del diagrama de clases
	 */
	public void saveConcreta() {

		// EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model.concreta");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryConcreta);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}



	/**
	 * Este metodo permite guardar el ModelFactoryAbstract del diagrama de clases
	 */
	public void saveAbstracta() {

		// EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model.abstracta");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryAbstracta);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}



	// ----------------------------------------- Tranformacion M2M de parte especifica a parte a abstracta -------------------------------------------

	/**
	 * Este metodo realiza la transformacion del modelo especifico a el modelo
	 * abstracto
	 */
	public void transformationM2M() {

		modelFactoryConcreta = loadConcretaModel();// el modelo oigen
		modelFactoryAbstracta = loadAbstractaModel();// el modelo destino
		modelFactoryAbstracta.getLstProjectba().clear();
		
		
		for (concreta.Projectba projectbaConcreta : modelFactoryConcreta.getLstProjectba()) {

			// por un proyecto de la concrera se crea uno en la abstracta
			Projectba proyectobaAbstracta = AbstractaFactory.eINSTANCE.createProjectba();
			proyectobaAbstracta.setName(projectbaConcreta.getName());
			proyectobaAbstracta.setPath(projectbaConcreta.getPath());
			modelFactoryAbstracta.getLstProjectba().add(proyectobaAbstracta);
			
			abstracta.Packageba packageRaizba = AbstractaFactory.eINSTANCE.createPackageba();
			packageRaizba.setName(projectbaConcreta.getName());
			packageRaizba.setPath("");
			proyectobaAbstracta.getLstPackages().add(packageRaizba);
			
			for (DiagramClassba diagrama : projectbaConcreta.getLstDiagramClassba()) {
				for (concreta.Packageba packageConcreta : diagrama.getLstPackageba()) {
					crearPaquete(packageConcreta,packageRaizba);
				}
				for (concreta.Classba classbaConcreta : diagrama.getLstClass()) {
					crearClass(packageRaizba, classbaConcreta);
				}
				
				for (concreta.Relationshipba relationRam : diagrama.getLstRelationshipba()) {
					crearRelacion(relationRam,packageRaizba);
				}
			}
			
			
		}
		saveAbstracta();
	}


	private void crearRelacion(concreta.Relationshipba relationbaConcreta, abstracta.Packageba packageRaizba) {
		
		concreta.Classba sourceConcreta = relationbaConcreta.getSource();
		concreta.Classba targetConcret = relationbaConcreta.getTarget();
		
		abstracta.Classba classbaAbstractaSource = obtenerClase(sourceConcreta,packageRaizba);
		abstracta.Classba classbaAbstractaTarget = obtenerClase(targetConcret,packageRaizba);
		
		abstracta.Relationshipba relationbaAbstractaSource = AbstractaFactory.eINSTANCE.createRelationshipba();
		relationbaAbstractaSource.setSource(classbaAbstractaTarget);
		relationbaAbstractaSource.setTarget(classbaAbstractaTarget);
		relationbaAbstractaSource.setRolS(relationbaConcreta.getRolS());
		relationbaAbstractaSource.setRolT(relationbaConcreta.getRolT());
		relationbaAbstractaSource.setMultS(relationbaConcreta.getMultS());
		relationbaAbstractaSource.setMultT(relationbaConcreta.getMultT());
		classbaAbstractaSource.getLstRelationshipTargetba().add(relationbaAbstractaSource);
		
		abstracta.Relationshipba relationRamAbstractaTarget = AbstractaFactory.eINSTANCE.createRelationshipba();
		relationRamAbstractaTarget.setSource(classbaAbstractaSource);
		relationRamAbstractaTarget.setTarget(classbaAbstractaTarget);
		relationRamAbstractaTarget.setRolS(relationbaConcreta.getRolS());
		relationRamAbstractaTarget.setRolT(relationbaConcreta.getRolT());
		relationRamAbstractaTarget.setMultS(relationbaConcreta.getMultS());
		relationRamAbstractaTarget.setMultT(relationbaConcreta.getMultT());
		classbaAbstractaTarget.getLstRelationshipTargetba().add(relationbaAbstractaSource);
		
	}


	private abstracta.Classba obtenerClase(concreta.Classba claseABuscar, abstracta.Packageba packageRaizba) {

		abstracta.Packageba packageba = obtenerPackagePadre(claseABuscar.getPath(), packageRaizba);
		
		for (abstracta.Classba clase : packageba.getLstClass()) {
			if(claseABuscar.getName().equals(clase.getName())) {
				return clase;
			}
		}
		return null;
	}




	private void crearClass(abstracta.Packageba packageRaizba, concreta.Classba classbaConcreta) {
		abstracta.Classba classbaAbstracta = AbstractaFactory.eINSTANCE.createClassba();
		classbaAbstracta.setIsAbstract(classbaConcreta instanceof Abstract?true:false);
		classbaAbstracta.setName(classbaConcreta.getName());
		classbaAbstracta.setPath(classbaConcreta.getPath());
		
		abstracta.Packageba paquetePadre = obtenerPackagePadre(classbaAbstracta.getPath(), packageRaizba);
		paquetePadre.getLstClass().add(classbaAbstracta);
		
		for (concreta.Attributeba attributeRamConcreta : classbaConcreta.getLstAttributesba()) {
			abstracta.Attributeba attributeRamAbstracta = AbstractaFactory.eINSTANCE.createAttributeba();
			attributeRamAbstracta.setName(attributeRamConcreta.getName());
			attributeRamAbstracta.setDefaultValue(attributeRamAbstracta.getDefaultValue());
			classbaAbstracta.getLstAttributesba().add(attributeRamAbstracta);
		}
		for (concreta.Methodba methodbaConcreta : classbaConcreta.getLstMethodba()) {
			abstracta.Methodba methodba = AbstractaFactory.eINSTANCE.createMethodba();
			methodba.setName(methodbaConcreta.getName());
			classbaAbstracta.getLstMethodba().add(methodba);
		}
	}


	// -------------------------------- Tranformacion M2T de parte abstracta a archivos de texto -----------------------------------------------


	private void crearPaquete(concreta.Packageba packageConcreta, abstracta.Packageba packageRaizRam) {

		abstracta.Packageba newPaqueteAbstracta = null;
		newPaqueteAbstracta = AbstractaFactory.eINSTANCE.createPackageba();
		newPaqueteAbstracta.setName(packageConcreta.getName());
		newPaqueteAbstracta.setPath(packageConcreta.getPath()== null?"":packageConcreta.getPath());

		abstracta.Packageba packageRamPadre = obtenerPackagePadre(packageConcreta.getPath(),packageRaizRam);//src/main
		packageRamPadre.getListPackages().add(newPaqueteAbstracta);
	}




	private abstracta.Packageba obtenerPackagePadre(String path, abstracta.Packageba packageRaizRam) {
		
		
		String[] pathArray = path.split("/");//src,main
		abstracta.Packageba padre = packageRaizRam;
		for (int j = 0; j < pathArray.length; j++) {
			padre = obtenerPaquete(pathArray[j],padre);
		}
		
		return padre;
	}




	private abstracta.Packageba obtenerPaquete(String nameP,abstracta.Packageba packageParentba) {
		for (abstracta.Packageba pac : packageParentba.getListPackages()) {
			if(pac.getName().equalsIgnoreCase(nameP)) {
				return pac;
			}
		}
		abstracta.Packageba packageba2 = AbstractaFactory.eINSTANCE.createPackageba();
		packageba2.setName(nameP);
		packageba2.setPath(packageParentba.getPath()+"/"+packageParentba.getName());
		packageParentba.getListPackages().add(packageba2);
		return packageba2;
	}




	/**
	 * Este metodo permite tranformar la parte abstacta del diagrama de clases a archivos de php
	 */
	public void transformationM2T() {

		modelFactoryAbstracta = loadAbstractaModel();
		
		for (Projectba proyecto : modelFactoryAbstracta.getLstProjectba()) {
			
			createFolderWindows(proyecto.getPath(), proyecto.getName());
			
			for (abstracta.Packageba paquete : proyecto.getLstPackages()) {
				createFolderWindows(paquete.getPath(), paquete.getName());
				
				for (abstracta.Classba clase : paquete.getLstClass()) {
					generarClase(clase);
				}
				
				generarPaquete(paquete);
			}
		}
	}


	private void generarPaquete(abstracta.Packageba paquete) {
		createFolderWindows(paquete.getPath(), paquete.getName());
		
		for (abstracta.Classba clase : paquete.getLstClass()) {
			generarClase(clase);
		}
		
		for (abstracta.Packageba paquetHijo : paquete.getListPackages()) {
			generarPaquete(paquetHijo);
		}
		
	}




	private void generarClase(abstracta.Classba clase) {
		
		StringBuilder cadenaClass = new StringBuilder();
		String abstractaCadena = (clase.getIsAbstract()?"abstract":"");
		String extendsCadena = crearCadenaExtends(clase);
		
		cadenaClass.append("<?php\r\n" + 
				"\r\n" + 
				"class "+clase.getName()+"  {\r\n" + 
				agregarAtributos(cadenaClass, clase)+
				"\r\n" + 
				"    public function __construct($nombre, $apellido, $salario) {\r\n" + 
				"        $this->nombre = $nombre;\r\n" + 
				"        $this->apellido = $apellido;\r\n" + 
				"        $this->salario = $salario;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    public function getNombre() {\r\n" + 
				"        return $this->nombre;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    public function setNombre($nombre) {\r\n" + 
				"        $this->nombre = $nombre;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    public function getApellido() {\r\n" + 
				"        return $this->apellido;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    public function setApellido($apellido) {\r\n" + 
				"        $this->apellido = $apellido;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    public function getSalario() {\r\n" + 
				"        return $this->salario;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    public function setSalario($salario) {\r\n" + 
				"        $this->salario = $salario;\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    public function calcularSalarioAnual() {\r\n" + 
				"        return $this->salario * 12;\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				"?>\r\n" + 
				"");

		createFileWindows(clase.getPath(), clase.getName()+".java", cadenaClass.toString());
	}




	private StringBuilder agregarAtributos(StringBuilder cadenaClass, Classba clase) {
		
		for(abstracta.Attributeba atributo :clase.getLstAttributesba()) {
			cadenaClass.append("    private $"+atributo.getName()+";\r\n");
		}
		
		return cadenaClass;
	}




	private String crearCadenaExtends(abstracta.Classba clase) {
		String cadena = "";
		
		for (int i = 0; i < clase.getLstRelationshipTargetba().size(); i++) {
			cadena += clase.getLstRelationshipTargetba().get(i).getTarget().getName();
			break;
		}
		if(clase.getLstRelationshipTargetba().size() > 0) {
			cadena = "extends "+cadena;
		}
		return cadena;
	}

	/**
	 * Este metodo permite abrir un cuadro de dialogo para ingresar el nomber del proyecto
	 * @return el nombre del proyecto
	 */
	public String ingresarInput() {
		// Mostrar un cuadro de di�logo de entrada
		String nameProject = JOptionPane.showInputDialog("Ingrese el nombre del projecto:");

		// Comprobar si el usuario ingres� algo y mostrarlo
		if (nameProject != null) {
			return nameProject;
		} else {
			return "newProject";
		}
	}
	
	/**
	 * Este metodo permite crear una carpeta en el sistema de windows
	 * @param path
	 * @param nameFolder
	 */
	private void createFolderWindows(String path, String nameFolder) {

		// Crea un objeto File que representa la carpeta
		File newFolder = new File(path, nameFolder);

		// Verifica si la carpeta ya existe
		if (!newFolder.exists()) {
			// Intenta crear la carpeta
			boolean creado = newFolder.mkdirs();
			if (creado) {
				System.out.println("La carpeta se cre� exitosamente.");
			} else {
				System.out.println("No se pudo crear la carpeta.");
			}
		} else {
			System.out.println("La carpeta ya existe.");
		}
	}

	/**
	 * Este metodo permite crear un archivo en el sistema de windows
	 * @param path
	 * @param nameFile
	 * @param content
	 */
	private void createFileWindows(String path, String nameFile, String content) {

		// Combinar la ruta y el nombre del archivo
		String absolutePath = path + "\\" + nameFile + ".py";

		try {
			// Crear un objeto FileWriter para escribir en el archivo
			FileWriter fileWriter = new FileWriter(absolutePath);

			// Crear un objeto PrintWriter para escribir en el archivo de manera m�s
			// conveniente
			PrintWriter printWriter = new PrintWriter(fileWriter);

			// Agregar contenido al archivo (por ejemplo, un programa Python simple)
			printWriter.println(content);
			printWriter.close();

			System.out.println("El archivo se cre� exitosamente.");
		} catch (IOException e) {
			System.out.println("Error al crear el archivo: " + e.getMessage());
		}
	}



}