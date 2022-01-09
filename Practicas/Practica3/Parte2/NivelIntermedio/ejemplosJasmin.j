.class public ejemplosJasmin
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

    ldc 2
    invokestatic ejemplosJasmin/Suma(I)V

    ldc 3
    invokestatic ejemplosJasmin/Comprobacion(I)V

    return

.end method

; Funcion
.method public static Suma(I)V
    .limit stack 100
    .limit locals 100

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 0
    ldc 3
    iadd
    invokevirtual java/io/PrintStream/println(I)V


    return
.end method

; Subrutina
.method public static Comprobacion(I)V
    .limit stack 100
    .limit locals 100

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 0
    ldc 5
    if_icmpgt etiqueta1
    etiqueta1:
    ldc "True"

    goto etiqueta2
    etiqueta1:
    ldc "False"
    etiqueta2:

    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    return
.end method

