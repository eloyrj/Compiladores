.class public llamadaFuncionJ
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100
    

    invokestatic llamadaFuncionJ/llamaFuncion()V

    return

.end method

.method public static llamaFuncion()V
    .limit stack 100
    .limit locals 100

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "se ha entrado en la funcion"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    

    return 
.end method



