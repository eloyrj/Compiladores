.class public Sumar
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

ldc 1
ldc 2
if_icmplt etiqueta0
   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "false" 
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 

goto etiqueta1
etiqueta0:
   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "true" 
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 

etiqueta1:
ldc 2
ldc 3
if_icmpgt etiqueta2
   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "false" 
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 

goto etiqueta3
etiqueta2:
   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "true" 
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 

etiqueta3:
return

.end method