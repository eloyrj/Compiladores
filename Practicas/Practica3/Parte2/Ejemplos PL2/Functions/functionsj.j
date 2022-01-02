.class public functionsj
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

    ldc "123"
    invokestatic functionsj/VAL(Ljava/lang/String;)V

    ldc "12345"
    invokestatic functionsj/LEN(Ljava/lang/String;)V

    ldc "not a number"
    invokestatic functionsj/ISNAN(Ljava/lang/String;)V

    return

.end method

.method public static VAL(Ljava/lang/String;)V
    .limit stack 100
    .limit locals 100

    getstatic java/lang/System/out Ljava/io/PrintStream;
    aload 0
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V


    return
.end method

.method public static LEN(Ljava/lang/String;)V
    .limit stack 100
    .limit locals 100

    getstatic java/lang/System/out Ljava/io/PrintStream;
    aload 0
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V


    return
.end method

.method public static ISNAN(Ljava/lang/String;)V
    .limit stack 100
    .limit locals 100

    aload 0
    invokestatic functionsj/VAL(Ljava/lang/String;)V


    return
.end method