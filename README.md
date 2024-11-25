# Sistema de Administración de Armas para la Policía de Tres de Febrero 👮🏻‍♀️👮🏻👮🏻‍♂️🔫

Este proyecto implementa un sistema de administración de armas para la policía de Tres de Febrero. El sistema permite gestionar las armas de los policías, incluyendo información sobre el policía, las características de las armas, y sus estados.

## Descripción del Proyecto

El sistema está diseñado para administrar dos tipos de armas: armas cortas y armas largas. Cada arma está asociada a un policía y tiene atributos como cantidad de municiones, alcance, marca, calibre, y estado. Además, las armas cortas tienen una propiedad adicional para indicar si son automáticas, mientras que las armas largas tienen propiedades adicionales como el sello del RENAR, una descripción de uso, y un nivel.

### Clases Principales

1. **Policia** 👮🏻‍♀️👮🏻👮🏻‍♂️: Representa a un policía con atributos como nombre, apellido y legajo.
2. **Arma** 🔫: Clase abstracta que representa una arma con atributos comunes como municiones, alcance, marca, calibre y estado.
3. **Corta**: Subclase de `Arma` que agrega la propiedad `esAutomatica` y un método para verificar si la arma puede disparar a más de 200 metros.
4. **Larga**: Subclase de `Arma` que implementa `Comparable` y agrega propiedades como justificación de uso, nivel de arma y si tiene sello del RENAR. También incluye un método para comparar dos armas largas basándose en su nivel.

### Funcionalidades

- **enCondicion()**: Verifica si una arma está en condiciones de ser usada por un policía en un enfrentamiento. Para estar en condiciones, la arma debe estar en estado "EN USO" y tener un calibre >= 9.
- **efectividadMito()**: Método en la clase `Corta` que verifica si la arma puede disparar a más de 200 metros.
- **compareTo(Larga otraArma)**: Método en la clase `Larga` que compara dos armas largas basándose en su nivel.

## Instrucciones para Compilar y Ejecutar

### Requisitos

- Java Development Kit (JDK) 23.
- Un entorno de desarrollo integrado (IDE) como IntelliJ IDEA.

### Pasos para Ejecutar

1. **Clonar el repositorio**:
   git clone https://github.com/Andrearomero25/proyectoFinalJava.git
   cd proyectoFinalJava
2. **Compilar el proyecto**:
javac com/company/*.java

#### Ejecutar el proyecto:
java com.company.Main

#### Ejemplo de Salida
Al ejecutar el proyecto, se mostrará información sobre las armas y policías creados, así como el resultado de las verificaciones de condiciones y efectividad.

- Corta@4517d9a3, Es Automática: true
- ¿Puede disparar a más de 200m? false
- ¿Está en condiciones? true
- Larga@372f7a8d, Justificación de Uso: Uso en patrullas, Nivel: 4, Tiene Sello: true
- ¿Está en condiciones? true
- Comparación de armas largas: 1
  
### Contribuciones 💻📲
Las contribuciones son bienvenidas. Si encuentras algún problema o tienes sugerencias para mejorar el proyecto, por favor abre un issue o envía un pull request.

### Licencia 🪪
Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.

#### Autora 🤓👩🏻‍💻
@andrearomero25

Lenguaje
JAVA
