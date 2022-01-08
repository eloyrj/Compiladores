.class public Sumar
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "introduce un valor"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore 1
aload 1
invokevirtual java/util/Scanner/nextInt()I
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "introduce un valor"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore 3
aload 3
invokevirtual java/util/Scanner/nextInt()I
istore 4
iload 2
istore 5
iload 4
istore 6
iload 6
ldc 0
istore 7
iload 7
if_icmplt etiqueta0
iload 6
iload 7

if_icmpeq etiqueta0
etiqueta1:
iload 5
istore 10
iload 6
istore 11
iload 10
iload 11
idiv
istore 12
iload 11
iload 12
imul
istore 12
iload 10
iload 12
isub
istore 8
iload 6
istore 5
iload 8
istore 6
iload 6
iload 7
if_icmpgt etiqueta1
etiqueta0:
   getstatic java/lang/System/out Ljava/io/PrintStream;
new class StringBuilder
dup
invokespecial StringBuilder/<init>
ldc "GCD="
invokevirtual StringBuilder/append(LString;)LStringBuilder;
iload 5
invokevirtual StringBuilder/append(LString;)LStringBuilder;
invokevirtual StringBuilder/toString()LString; 
   invokevirtual java/io/PrintStream/println(I)V


return

.end method
