.class public Sumar
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 123 
   invokevirtual java/io/PrintStream/println(I)V


   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 5 
   invokevirtual java/io/PrintStream/println(I)V


   getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "True" 
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 


return

.end method
