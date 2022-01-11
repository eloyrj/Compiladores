.class public Sumar
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100


   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 3
invokestatic Sumar/funcion(I)I 
   invokevirtual java/io/PrintStream/println(I)V 



   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 3
invokestatic Sumar/subrutina(I)V 
   invokevirtual java/io/PrintStream/println()V 


   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 4.3
ldc 5.4
fadd 
   invokevirtual java/io/PrintStream/println(F)V


return

.end method
.method public static funcion(I)I
.limit stack 100
.limit locals 100
iload 0
iload 0
ldc 1
iadd
istore 0
iload 0
ireturn 
.end method
.method public static subrutina(I)V
.limit stack 100
.limit locals 100
iload 0
   getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0 
   invokevirtual java/io/PrintStream/println(I)V


return
.end method
