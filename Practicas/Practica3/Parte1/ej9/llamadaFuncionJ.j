.class public llamadaFuncionJ
.super java/lang/Object

.method public gg()V
    .limit stack 100
    .limit locals 100

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Hola Mundo "
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    

    return 
.end method

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100
    
    aload_0
    ldc 3
    invokevirtual llamadaFuncion/gg()V

    return

.end method

