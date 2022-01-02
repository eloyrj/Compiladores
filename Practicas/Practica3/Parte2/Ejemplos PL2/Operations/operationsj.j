.class public operationsj
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 1
ldc 2
iadd
   invokevirtual java/io/PrintStream/println(I)V

   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 2
ldc 1
isub
   invokevirtual java/io/PrintStream/println(I)V

   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 2
ldc 3
imul
   invokevirtual java/io/PrintStream/println(I)V

   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 4
ldc 2
idiv
   invokevirtual java/io/PrintStream/println(I)V

   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 7
ldc 2
idiv
   invokevirtual java/io/PrintStream/println(I)V

   getstatic java/lang/System/out Ljava/io/PrintStream;
   ; hago la operacion del modulo para 5/3 --> 5 - 3 * 1
ldc 3
ldc 1
imul
istore 1

ldc 5
iload 1
isub
   invokevirtual java/io/PrintStream/println(I)V
return

.end method