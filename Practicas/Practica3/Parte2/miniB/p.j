.class public Sumar
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100


ldc 3
invokestatic Sumar/suma(I)V
return

.end method
.method public static suma(I)V
.limit stack 100
.limit locals 100
iload 0
   getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0 
   invokevirtual java/io/PrintStream/println(I)V


return
.end method
