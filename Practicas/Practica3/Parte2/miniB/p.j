.class public Sumar
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100


ldc 4
invokestatic Sumar/suma(I)I
invokestatic Sumar/suma(I)I
return

.end method
.method public static suma(I)I
.limit stack 100
.limit locals 100
iload 0
iload 0
ldc 1
iadd
istore 0
   getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0 
   invokevirtual java/io/PrintStream/println(I)V


iload 0
ireturn 
.end method