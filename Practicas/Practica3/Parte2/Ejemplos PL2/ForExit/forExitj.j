.class public forExitj
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

ldc 5
istore 1
ldc 1
istore 2

bucle:

    ldc 3
    iload 2
    if_icmplt etiqueta1

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 2
    invokevirtual java/io/PrintStream/println(I)V
    iload 2
    ldc 1
    iadd
    istore 2

    iload 2
    iload 1
if_icmplt bucle

etiqueta1:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "EXIT"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method