# MarketSimulation #
### Test task to Java course
This program realizes test task (Sry, I've lost the link).
I create a [package][1] with all my auxiliary classes.
Class __List__ realizes _ArrayList_ collection 
with one owner, __ProductList__ and __UserList__ 
extend this class and override some methods,
to create different lists. __Product__ and
__User__ - it's program objects. Other classes 
used it.
Class __MyException__ realizes exception, 
when user haven't enough money to bough some 
product. 
Class __SystemMenu__ - provides services with other
objects, all logic implement in this class.
Class __Program__ - consist method _main_ with some
statements:
1. Create object __SystemMenu__ with all
products and users, add to list it.
2. Example with buying by User(to check 
correct execution).
3. Launching menu with all variants to 
work with these objects.

Run the program from this [class][2]

[1]: https://github.com/Gamemod13/Test_Task/blob/7cf790c15b091bb2d125d85f3919149ad8cbd440/src/main/java/product/user
[2]: https://github.com/Gamemod13/Test_Task/blob/bcdb28df2d5a9e6a337fe0952206f2e6f426adbf/src/main/java/Program.java
