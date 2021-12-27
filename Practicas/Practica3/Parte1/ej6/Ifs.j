.class public Ifs
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 300
   .limit locals 300

   getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc 6
    ldc 9
    if_icmpgt etiqueta4

    ldc "6 es menor que 9"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    ldc 9
    ldc 13
    if_icmpgt etiqueta4

    ldc "9 es menor que 13"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    ldc 13
    ldc 16
    if_icmpgt etiqueta4

    etiqueta4:
    ldc "No se cumple"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return

.end method