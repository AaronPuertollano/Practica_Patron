import java.util.ArrayList;
import java.util.List;

public class Pattern {
    List<Component> components = new ArrayList<>();
    Pattern (String patString){

        for (int i = 0; i < patString.length(); i++) {
            char c = patString.charAt(i);

            if (c == '@'){
                i++;
                c = patString.charAt(i);
                Component component = new Component();
                component.tipus = Component.TComponent.CHAR;
                component.ch = c;
                components.add(component);
            } else if (c == '?'){
                Component component = new Component();
                component.tipus = Component.TComponent.QMARK;
                components.add(component);
            } else if (c == '%') {
                Component component = new Component();
                i++;
                c = patString.charAt(i);
                component.tipus = Component.TComponent.BOL;
                components.add(component);
            } else if (c == '$'){
                Component component = new Component();
                component.tipus = Component.TComponent.EOL;
                components.add(component);
            } else {
                Component component = new Component();
                component.tipus = Component.TComponent.CHAR;
                component.ch = c;
                components.add(component);
            }
        }
    }
}
