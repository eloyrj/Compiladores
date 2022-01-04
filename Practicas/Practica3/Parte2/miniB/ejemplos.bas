LET = 1

LET x = "1"
PRINT x - 1

FOR i = 1 TO 5
    IF i < 3 THEN
        CONTINUE
    END
    PRINT i
NEXT

FOR i = 1 TO 5
    IF i > 3 THEN
        EXIT
    END
    PRINT i
NEXT

FOR i = 1 TO 5
    PRINT i
NEXT

PRINT VAL("123")
PRINT LEN("12345")
PRINT ISNAN(VAL("not a number"))

REM Greatest common divisor
INPUT "A=" ain
INPUT "B=" bin
a = VAL(ain)
b = VAL(bin)

WHILE b > 0
    t = a MOD b
    a = b
    b = t
END

PRINT "GCD=" + a

if 1 < 2 then
  print "true"
else
  print "false"
end

if 2 > 3 then
  print "true"
else
  print "false"
end

if 1 > 2 then
  print "one"
end

if 0 then
  print "two"
end

print "three"

if 1 < 2 then
  print "one"
end

if 1 then
  print "two"
end

INPUT "Name: " name
PRINT "Hello " + name

LET string = "foo"
LET numeric = 123
LET nan = VAL("Not A Number")

PRINT 1+2
PRINT 2-1
PRINT 2*3
PRINT 4/2
PRINT 7/2
PRINT 5 MOD 3

PRINT "Hello world!"

LET i = 1
REPEAT
    PRINT i
    i = i + 1
UNTIL i = 5

LET i = 1
WHILE i < 5
    PRINT i
    i = i + 1
END