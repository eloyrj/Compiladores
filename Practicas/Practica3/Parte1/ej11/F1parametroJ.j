.class public F1parametroJ
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100
    
    
    ldc 3
    invokestatic F1parametroJ/f(I)V

    return

.end method

.method public static f(I)V
    .limit stack 100
    .limit locals 100
    ;istore 1
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 0
    invokevirtual java/io/PrintStream/println(I)V
    

    return 
.end method
