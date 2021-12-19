package h.a;

import com.bytedance.covode.number.Covode;

class j {
    static {
        Covode.recordClassIndex(105068);
    }

    public static final void a(int i2, int i3) {
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i3 + ").");
        }
    }
}
