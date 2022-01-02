.class public VariosParametrosJ
.super java/lang/Object

.method public static Funcion(III)I
    .limit stack 100
    .limit locals 100

    iload_0
    iload_1
    iadd
    iload_2
    iadd
    ireturn

.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100
    getstatic java/lang/System/out Ljava/io/PrintStream;

    ldc 3
    ldc 5
    ldc 7
    invokestatic VariosParametrosJ/Funcion(III)I
    invokevirtual java/io/PrintStream/println(I)V

    return
.end method




