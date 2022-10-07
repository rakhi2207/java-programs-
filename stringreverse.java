String originalStr = "Hello";
String reversedStr = "";

for (int i = 0; i < originalStr.length(); i++) {
  reversedStr = originalStr.charAt(i) + reversedStr;
}

System.out.println("Reversed string: "+ reversedStr);
