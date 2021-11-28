package com.aida.babyplus.modelo.entidades;

import com.aida.babyplus.modelo.entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-11-28T19:44:43")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, String> cif;
    public static volatile SingularAttribute<Proveedor, String> razonSocial;
    public static volatile SingularAttribute<Proveedor, String> responsable;
    public static volatile SingularAttribute<Proveedor, String> direccion;
    public static volatile SingularAttribute<Proveedor, byte[]> logo;
    public static volatile SingularAttribute<Proveedor, Integer> usuario;
    public static volatile SingularAttribute<Proveedor, String> localidad;
    public static volatile SingularAttribute<Proveedor, Usuario> usuario1;
    public static volatile SingularAttribute<Proveedor, Integer> cp;

}