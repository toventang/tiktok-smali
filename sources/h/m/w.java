package h.m;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class w extends v {
    static {
        Covode.recordClassIndex(105374);
    }

    public static final Float c(String str) {
        l.d(str, "");
        try {
            if (o.f158836a.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final Double d(String str) {
        l.d(str, "");
        try {
            if (o.f158836a.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
