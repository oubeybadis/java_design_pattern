public class exoEditor {
    
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Font arial = FontFactory.getFont("arial", 12);

        List<Glyph> editor = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            editor.add(new Glyph("a", arial));
        }

        // display test
        editor.get(0).display();
    }
}

class FontFactory {
    private static Map<String, Font> fonts = new HashMap<>();

    public static Font getFont(String name, int size) {
        String key = name + size;

        if (fonts.containsKey(key)) {
            return fonts.get(key);
        }

        Font f = new Font(name, size);
        fonts.put(key, f);
        return f;
    }
}

class Font {
    private String name;
    private int size;

    public Font(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Font(" + name + ", " + size + ")";
    }
}

class Glyph {
    private String value;
    private Font font;

    public Glyph(String value, Font font) {
        this.value = value;
        this.font = font;
    }

    public void display() {
        System.out.println("Glyph: " + value + " with " + font);
    }
}
