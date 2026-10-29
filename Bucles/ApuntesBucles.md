# Apuntes de Repaso: Bucles `for` y Pirámides en Java

## 1. Estructura de un `for`

```java
for(inicio; condicion; cambio)
{
    instrucciones;
}
```

Ejemplo:

```java
for(int i = 1; i <= 5; i++)
{
    System.out.println(i);
}
```

### Significado

- Inicio → se ejecuta una sola vez.
- Condición → se comprueba antes de cada vuelta.
- Cambio → se ejecuta al terminar cada vuelta.

### Ejecución paso a paso

```java
for(int i = 1; i <= 5; i++)
```

| Vuelta | i | ¿Cumple i <= 5? | Imprime |
|---------|---|----------------|----------|
| 1 | 1 | Sí | 1 |
| 2 | 2 | Sí | 2 |
| 3 | 3 | Sí | 3 |
| 4 | 4 | Sí | 4 |
| 5 | 5 | Sí | 5 |
| 6 | 6 | No | Fin |

Resultado:

```text
12345
```

---

# 2. Cómo analizar cualquier for

Siempre hazte estas tres preguntas:

## ¿Dónde empieza?

```java
for(int k = 2; ...)
```

Empieza en:

```text
2
```

---

## ¿Hasta dónde llega?

```java
k <= 5
```

Llega hasta:

```text
5
```

---

## ¿Cómo cambia?

```java
k++
```

Sube de 1 en 1.

o

```java
k--
```

Baja de 1 en 1.

---

# 3. Ascendente

Ejemplo:

```java
for(int k = 1; k <= 5; k++)
{
    System.out.print(k);
}
```

Valores de k:

```text
1 2 3 4 5
```

Resultado:

```text
12345
```

### Regla

- Empieza en un número pequeño.
- Va aumentando.

---

# 4. Descendente

Ejemplo:

```java
for(int m = 5; m >= 1; m--)
{
    System.out.print(m);
}
```

Valores de m:

```text
5 4 3 2 1
```

Resultado:

```text
54321
```

### Regla

- Empieza en un número grande.
- Va disminuyendo.

---

# 5. Qué representa cada variable

En ejercicios de pirámides normalmente:

| Variable | Función |
|-----------|----------|
| i | Fila actual |
| j | Espacios |
| k | Números ascendentes |
| m | Números descendentes |

Ejemplo:

```java
for(int i = 1; i <= 5; i++)
```

Significa:

```text
i = 1 -> fila 1
i = 2 -> fila 2
i = 3 -> fila 3
i = 4 -> fila 4
i = 5 -> fila 5
```

---

# 6. Bucle principal de una pirámide

```java
for(int i = 1; i <= numerofilas; i++)
```

Si:

```java
numerofilas = 5
```

las filas serán:

```text
Fila 1
Fila 2
Fila 3
Fila 4
Fila 5
```

---

# 7. Espacios

Ejemplo:

```java
for(int j = numerofilas - i; j > 0; j--)
```

Si:

```java
numerofilas = 5
```

| i | Espacios |
|---|---|
| 1 | 4 |
| 2 | 3 |
| 3 | 2 |
| 4 | 1 |
| 5 | 0 |

Cada fila tiene menos espacios.

---

# 8. Sustituir valores

La clave para entender los bucles.

Ejemplo:

```java
for(int k = numerofilas - i + 1;
    k <= numerofilas;
    k++)
```

Si:

```java
numerofilas = 5
i = 3
```

Sustituyo:

```java
5 - 3 + 1
```

Resultado:

```java
3
```

El bucle queda:

```java
for(int k = 3; k <= 5; k++)
```

Valores de k:

```text
3 4 5
```

Resultado:

```text
345
```

---

# 9. Ejemplo completo

Código:

```java
for(int i = 1; i <= 4; i++)
{
    for(int k = 1; k <= i; k++)
    {
        System.out.print(k);
    }

    for(int m = i - 1; m >= 1; m--)
    {
        System.out.print(m);
    }

    System.out.println();
}
```

Salida:

```text
1
121
12321
1234321
```

---

# 10. Método para exámenes

Cuando veas un for:

```java
for(int k = expresion; condicion; cambio)
```

Haz:

## Paso 1

Calcula el valor inicial.

Ejemplo:

```java
for(int k = 5 - 3 + 1; k <= 5; k++)
```

Inicio:

```text
k = 3
```

---

## Paso 2

Escribe todas las vueltas.

```text
k = 3
k = 4
k = 5
```

---

## Paso 3

Escribe lo que imprime.

```text
345
```

---

# Resumen rápido

✅ `i` = fila actual

✅ `k++` = suma 1

✅ `k--` = resta 1

✅ Ascendente = números crecen

✅ Descendente = números decrecen

✅ Para entender una pirámide, sustituye siempre los valores por números reales.

✅ El ordenador no ve letras como `i` o `k`, solo números.
