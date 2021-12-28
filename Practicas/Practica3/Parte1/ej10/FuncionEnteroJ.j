.class public FuncionEnteroJ
.super java/lang/Object

.method public static funcion()I
    .limit stack 100
    .limit locals 100

    ldc 11
    ireturn

.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokestatic FuncionEnteroJ/funcion()I
    invokevirtual java/io/PrintStream/println(I)V

    return
.end method