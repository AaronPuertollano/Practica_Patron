import java.util.ArrayList;
import java.util.List;

public class Find {
    private String text;

    public Find(String text) {
        this.text = text;
    }

    public boolean match(String pat) {
        Pattern p = new Pattern(pat);
        if (pat.length() == 0 && this.text.length() > 0) return false;

        for (int i = 0; i < this.text.length(); i++) {
            if (tryMatch(p, i)){
                return true;
            }
        }

        return false;
    }

    private boolean tryMatch (Pattern pat, int pos){
        for (int j = 0; j < pat.components.size(); j++) {
            if (j+pos >= this.text.length()) {
                return false;
            }

            char c = this.text.charAt(j+pos);

            Component component = pat.components.get(j);
            if (component.tipus == Component.TComponent.CHAR){
                if (c != component.ch){
                    return false;
                }
            }

        }
        return true;
    }



    public String capture(String stringPat) {
        return "";
    }
}


