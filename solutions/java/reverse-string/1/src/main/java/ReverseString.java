class ReverseString {

    String reverse(String inputString) {
        if (inputString == null)
            return inputString;
        return new StringBuilder(inputString).reverse().toString();
    }
  
}
