# 📚 Ejercicios Java con Docker

Colección de ejercicios de Java ejecutados con Docker, sin necesidad de instalar Java en tu máquina.

---

## 📋 Descripción del proyecto

Este repositorio contiene ejercicios prácticos de Java sobre estructuras de datos y algoritmos.  
Cada ejercicio es un archivo `.java` independiente que se compila y ejecuta dentro de un contenedor Docker.

---

## ✅ Requisitos previos

| Herramienta | Versión mínima | Instalación |
|---|---|---|
| Docker | 20.x o superior | [docs.docker.com](https://docs.docker.com/get-docker/) |
| Docker Compose | 2.x o superior | Incluido con Docker Desktop |

> **No necesitas instalar Java.** La imagen `eclipse-temurin:21` lo provee dentro del contenedor.

---

## 🚀 Cómo ejecutar

### Sintaxis general

```bash
# Linux / Mac
CLASE=NombreDeLaClase docker compose run --rm ejercicio

# Windows (PowerShell)
$env:CLASE="NombreDeLaClase"; docker compose run --rm ejercicio

# Windows (CMD)
set CLASE=NombreDeLaClase && docker compose run --rm ejercicio
```

### Ejemplos concretos

```bash
# Linux / Mac
CLASE=HashBasico docker compose run --rm ejercicio
CLASE=ManejoColisiones docker compose run --rm ejercicio

# Windows (PowerShell)
$env:CLASE="HashBasico"; docker compose run --rm ejercicio
$env:CLASE="ManejoColisiones"; docker compose run --rm ejercicio
```

> **Importante:** El valor de `CLASE` debe coincidir exactamente con el nombre del archivo `.java` y el nombre de la clase dentro del archivo. Java distingue mayúsculas y minúsculas.

---

## 📁 Estructura del proyecto

```
mis-ejercicios/
├── docker-compose.yml
├── README.md
└── exercises/
    ├── hash-basico/
    │   └── HashBasico.java
    └── manejo-colisiones/
        └── ManejoColisiones.java
```

---

## 📝 Lista de ejercicios

| # | Clase | Tema | Descripción |
|---|---|---|---|
| 1 | `HashBasico` | Hash | Implementación básica de una tabla hash |
| 2 | `ManejoColisiones` | Hash | Manejo de colisiones en tablas hash |

> Agrega una fila por cada ejercicio nuevo que incorpores al proyecto.

---

## 💻 Ejemplos de salida

### HashBasico

```bash
CARPETA=hash-basico CLASE=HashBasico docker compose run --rm ejercicio
```

```
Tabla Hash creada con capacidad: 10
Insertando clave "nombre" -> valor "Juan" en índice 3
Insertando clave "edad" -> valor "25" en índice 7
Búsqueda de "nombre": Juan
```

### ManejoColisiones

```bash
CARPETA=manejo-colisiones CLASE=ManejoColisiones docker compose run --rm ejercicio
```

```
Colisión detectada en índice 5
Resolviendo con encadenamiento...
Clave "apellido" insertada en posición 5 -> nodo 2
```

> Reemplaza estas salidas por las reales de tus ejercicios.

---

## 🐳 docker-compose.yml de referencia

```yaml
services:
  ejercicio:
    image: eclipse-temurin:21
    working_dir: /app
    volumes:
      - ./exercises:/app
    command: sh -c "javac ${CLASE}.java && java ${CLASE}"
```