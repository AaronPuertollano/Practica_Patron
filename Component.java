public class Component {
    enum TComponent {
        BOL, //Begining of line
        EOL, //End
        CHAR, // Caracter
        QMARK, //Question mark (caracter)
        SET, //Ser (clase de caracters, a-z)
    }

    TComponent tipus;
    char ch;
    String set;

    @Override
    public String toString() {
        return "Component{" +
                "tipus=" + tipus +
                ", ch=" + ch +
                ", set='" + set + '\'' +
                '}';
    }
}
