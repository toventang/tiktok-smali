package h.m;

import com.bytedance.covode.number.Covode;
import h.j.g;

public class b {
    static {
        Covode.recordClassIndex(105340);
    }

    public static final boolean a(char c2) {
        if (Character.isWhitespace(c2) || Character.isSpaceChar(c2)) {
            return true;
        }
        return false;
    }

    public static final int a(int i2) {
        if (2 <= i2 && 36 >= i2) {
            return i2;
        }
        throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new g(2, 36));
    }
}
