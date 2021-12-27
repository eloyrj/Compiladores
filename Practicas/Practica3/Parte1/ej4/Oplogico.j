.class public Oplogico
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc 7
   ldc 5
   if_icmpgt Label2
   ldc "false"
   goto Label1
   Label2:
   ldc "true"
   Label1:
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

   return

.end method
