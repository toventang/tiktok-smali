package android.ss.com.vboost.e;

import com.bytedance.covode.number.Covode;

public final class d {
    static {
        Covode.recordClassIndex(66);
    }

    public enum a {
        UNKNOWN("unknown", 0),
        SS("ss", 1),
        CHRY("chry", 2),
        XM("xm", 3),
        OP("op", 4),
        VO("vo", 5),
        MZ("mz", 6);
        
        private int index;
        private String name;

        static {
            Covode.recordClassIndex(67);
        }

        private a(String str, int i2) {
            this.name = str;
            this.index = i2;
        }
    }

    public static String a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
