.class public ifFalsej
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

    ldc 1
    ldc 2
    if_icmple etiqueta1

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "ONE"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V


    etiqueta3:

    ldc 0
    ldc 0
    if_icmpne etiqueta1
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "TWO"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "THREE"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

    goto etiqueta2

    etiqueta1:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "No se cumple"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto etiqueta3


    etiqueta2:
return

.end method