# TP Relaciones UML 1 a 1 — Implementación Java (Ej. 1–14)

## Cómo compilar y ejecutar
```bash
javac *.java
# correr el demo que quieras
java DemoEj1
java DemoEj2
# ...
java DemoEj14
```

## Checklist del TP
- [x] Implementación de clases con atributos solicitados por ejercicio.
- [x] Relaciones 1 a 1 correctas (asociación / agregación / composición / dependencias).
- [x] Dirección indicada (uni/bidireccional) respetada en el código.
- [x] Clase `DemoEjX` por ejercicio para mostrar instanciación y vinculación.
- [ ] Diagramas UML (requeridos por el enunciado). **Incluyo abajo _Mermaid_** para que puedas pegarlo en https://mermaid.live o VSCode y exportar a PNG/PDF.
- [ ] Documento breve con tabla “Ejercicio — Tipo de relación — Dirección” (podés copiar la tabla inferior).

> Nota: si el profe exige paquetes (`package`) o nombres exactos de clases, avisame y lo adapto.

## Tabla resumen
| Ejercicio | Relación principal | Dirección |
|---|---|---|
| 1 | Composición (Pasaporte→Foto), Asociación (Pasaporte↔Titular) | Uni y Bi |
| 2 | Agregación (Celular→Batería), Asociación (Celular↔Usuario) | Uni y Bi |
| 3 | Asociación (Libro→Autor), Agregación (Libro→Editorial) | Uni |
| 4 | Asociación (Tarjeta↔Cliente), Agregación (Tarjeta→Banco) | Bi |
| 5 | Composición (Computadora→Placa), Asociación (Computadora↔Propietario) | Bi |
| 6 | Asociación (Reserva→Cliente), Agregación (Reserva→Mesa) | Uni |
| 7 | Agregación (Vehículo→Motor), Asociación (Vehículo↔Conductor) | Bi |
| 8 | Composición (Documento→Firma), Agregación (Firma→Usuario) | Uni |
| 9 | Asociación (Cita→Paciente, Cita→Profesional) | Uni |
| 10 | Composición (Cuenta→Clave), Asociación (Cuenta↔Titular) | Bi |
| 11 | Dependencia de uso (Reproductor.reproducir(Cancion)) | Uso |
| 12 | Dependencia de uso (Calculadora.calcular(Impuesto)) | Uso |
| 13 | Dependencia de creación (GeneradorQR.generar(...)) | Creación |
| 14 | Dependencia de creación (EditorVideo.exportar(...)) | Creación |

## Diagramas (Mermaid)

### Ej1
```mermaid
classDiagram
class Pasaporte { +numero +fechaEmision }
class Foto { +imagen +formato }
class Titular { +nombre +dni }
Pasaporte "1" *-- "1" Foto
Pasaporte "1" -- "1" Titular : bidireccional
```

### Ej2
```mermaid
classDiagram
class Celular { +imei +marca +modelo }
class Bateria { +modelo +capacidad }
class Usuario { +nombre +dni }
Celular "1" o-- "1" Bateria
Celular "1" -- "1" Usuario : bidireccional
```

### Ej3
```mermaid
classDiagram
class Libro { +titulo +isbn }
class Autor { +nombre +nacionalidad }
class Editorial { +nombre +direccion }
Libro "1" --> "1" Autor
Libro "1" o-- "1" Editorial
```

### Ej4
```mermaid
classDiagram
class TarjetaDeCredito { +numero +fechaVencimiento }
class Cliente { +nombre +dni }
class Banco { +nombre +cuit }
TarjetaDeCredito "1" -- "1" Cliente : bidireccional
TarjetaDeCredito "1" o-- "1" Banco
```

### Ej5
```mermaid
classDiagram
class Computadora { +marca +numeroSerie }
class PlacaMadre { +modelo +chipset }
class Propietario { +nombre +dni }
Computadora "1" *-- "1" PlacaMadre
Computadora "1" -- "1" Propietario : bidireccional
```

### Ej6
```mermaid
classDiagram
class Reserva { +fecha +hora }
class ClienteReserva { +nombre +telefono }
class Mesa { +numero +capacidad }
Reserva "1" --> "1" ClienteReserva
Reserva "1" o-- "1" Mesa
```

### Ej7
```mermaid
classDiagram
class Vehiculo { +patente +modelo }
class Motor { +tipo +numeroSerie }
class Conductor { +nombre +licencia }
Vehiculo "1" o-- "1" Motor
Vehiculo "1" -- "1" Conductor : bidireccional
```

### Ej8
```mermaid
classDiagram
class Documento { +titulo +contenido }
class FirmaDigital { +codigoHash +fecha }
class UsuarioFirma { +nombre +email }
Documento "1" *-- "1" FirmaDigital
FirmaDigital "1" o-- "1" UsuarioFirma
```

### Ej9
```mermaid
classDiagram
class CitaMedica { +fecha +hora }
class Paciente { +nombre +obraSocial }
class Profesional { +nombre +especialidad }
CitaMedica "1" --> "1" Paciente
CitaMedica "1" --> "1" Profesional
```

### Ej10
```mermaid
classDiagram
class CuentaBancaria { +cbu +saldo }
class ClaveSeguridad { +codigo +ultimaModificacion }
class TitularCuenta { +nombre +dni }
CuentaBancaria "1" *-- "1" ClaveSeguridad
CuentaBancaria "1" -- "1" TitularCuenta : bidireccional
```

### Ej11 (dependencia de uso)
```mermaid
classDiagram
class Reproductor
class Cancion { +titulo }
class Artista { +nombre +genero }
Cancion --> Artista
Reproductor ..> Cancion : reproducir(cancion)
```

### Ej12 (dependencia de uso)
```mermaid
classDiagram
class Calculadora
class Impuesto { +monto }
class Contribuyente { +nombre +cuil }
Impuesto --> Contribuyente
Calculadora ..> Impuesto : calcular(impuesto)
```

### Ej13 (dependencia de creación)
```mermaid
classDiagram
class GeneradorQR
class CodigoQR { +valor }
class UsuarioQR { +nombre +email }
CodigoQR --> UsuarioQR
GeneradorQR ..> CodigoQR : generar(valor, usuario)
```

### Ej14 (dependencia de creación)
```mermaid
classDiagram
class EditorVideo
class Render { +formato }
class Proyecto { +nombre +duracionMin }
Render --> Proyecto
EditorVideo ..> Render : exportar(formato, proyecto)
```
