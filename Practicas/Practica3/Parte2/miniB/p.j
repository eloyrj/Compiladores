.class public Sumar
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

ldc 1
istore 1

etiqueta0:
   getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1 
   invokevirtual java/io/PrintStream/println(I)V


iload 1
ldc 1
iadd
istore 1
iload 1
ldc 5
if_icmplt etiqueta0
return

.end method
