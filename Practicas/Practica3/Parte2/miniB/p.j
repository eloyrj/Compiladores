.class public Sumar
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore_1

aload_1
invokevirtual java/util/Scanner/nextInt()I
istore_2

getstatic java/lang/System/out Ljava/io/PrintStream;

   ldc "has pulsado "

invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;

iload 2

   invokevirtual java/io/PrintStream/println(I)V


return

.end method
