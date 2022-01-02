.class public bucleForJ
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

ldc 10
istore 1 
ldc 0 
istore 2

bucle:
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

return

.end method



