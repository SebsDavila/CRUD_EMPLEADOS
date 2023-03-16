package com.example.crud_mvc;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public class Empleados {

    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    private String direccion;
    private String puesto;

    public Empleados() {
    }

    public Empleados(String nombre, String apellidos, int edad, String direccion, String puesto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.puesto = puesto;
    }

    public Empleados(int id, String nombre, String apellidos, int edad, String direccion, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.puesto = puesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }




    /*
    public List<Empleados> listaEmpleados (String sResponse){
        List<Empleados> objList =null;
        sResponse=sResponse.replace("\\","");
        sResponse=sResponse.substring(1,sResponse.length()-1);
        try{
            Gson gson = new Gson();
            Type listType = new TypeToken<List<Empleados>>() {}.getType();
            objList  = gson.fromJson(sResponse,listType);
            return objList;
        }
        catch(Exception ex){
            return null;
        }
    }*/

}
