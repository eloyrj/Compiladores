.class public ifElsej
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 300
   .limit locals 300

    ldc 1
    ldc 2
    if_icmpge etiqueta1
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "true"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

    goto etiqueta2

    etiqueta1:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "false"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

    etiqueta2:

    ldc 2
    ldc 3
    if_icmple etiqueta3
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "true"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

    goto etiqueta2

    etiqueta3:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "false"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

    etiqueta4:

return

.end method