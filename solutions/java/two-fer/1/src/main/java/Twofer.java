public class Twofer {
    public String twofer(String name) {
        String person = ((name == null) || name.isBlank())
                            ? "you"
                            : name.trim();
        return String.format("One for %s, one for me.", person);
    }
}
