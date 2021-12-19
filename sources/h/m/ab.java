package h.m;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.j.h;
import java.util.NoSuchElementException;

public class ab extends aa {
    static {
        Covode.recordClassIndex(105338);
    }

    public static final char i(CharSequence charSequence) {
        l.d(charSequence, "");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Character j(CharSequence charSequence) {
        l.d(charSequence, "");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final CharSequence k(CharSequence charSequence) {
        l.d(charSequence, "");
        return p.b(charSequence, h.b(charSequence.length() - 1, 0));
    }

    public static final String k(String str) {
        l.d(str, "");
        int length = str.length();
        String substring = str.substring(length - h.c(2, length));
        l.b(substring, "");
        return substring;
    }

    public static final String a(String str, int i2) {
        l.d(str, "");
        if (i2 >= 0) {
            String substring = str.substring(h.c(i2, str.length()));
            l.b(substring, "");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static final CharSequence b(CharSequence charSequence, int i2) {
        l.d(charSequence, "");
        if (i2 >= 0) {
            return charSequence.subSequence(0, h.c(i2, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static final String c(String str, int i2) {
        l.d(str, "");
        if (i2 >= 0) {
            String substring = str.substring(0, h.c(i2, str.length()));
            l.b(substring, "");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static final String b(String str, int i2) {
        l.d(str, "");
        if (i2 >= 0) {
            return p.c(str, h.b(str.length() - i2, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }
}
