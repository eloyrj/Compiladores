.class public prueba
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 7
ldc 5
if_icmpgt etiqueta1 
ldc 0
goto etiqueta2

etiqueta1:
ldc 1
etiqueta2:

invokevirtual java/io/PrintStream/println(I)V
return

.end method
