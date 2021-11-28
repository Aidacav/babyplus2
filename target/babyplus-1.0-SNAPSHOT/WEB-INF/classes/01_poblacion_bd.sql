INSERT INTO BABYPLUS.USUARIO (ID,USUARIO, PASSWORD, FECHA_ALTA, ACTIVO, ROL, IDIOMA) VALUES
(null, 'ADMIN', 'ADMIN', NOW(), 1, 1, 'EN'),
(null, 'CLIENTE', 'CLIENTE', NOW(), 1, 2, 'ES'),
(null, 'PROVEEDOR', 'PROVEEDOR', NOW(), 1, 3, 'ES');


INSERT INTO BABYPLUS.CLIENTE (USUARIO, NOMBRE, APELLIDOS, FECHA_NACIMIENTO, DOMICILIO, LOCALIDAD, CP)
SELECT U.ID, 'Jaime', 'Tiro', '1980-03-03', 'Calle San Fernando, 21', 'Bormujos', 41930 FROM BABYPLUS.USUARIO U WHERE U.USUARIO = 'CLIENTE';

INSERT INTO BABYPLUS.PROVEEDOR (USUARIO, RAZON_SOCIAL, CIF, DIRECCION, LOCALIDAD, CP, RESPONSABLE)
SELECT U.ID, 'Vera Fisio', 'A1234567', 'Calle Ancha, 23', 'Tomares', 41915, 'Carolina' FROM BABYPLUS.USUARIO U WHERE U.USUARIO='PROVEEDOR'