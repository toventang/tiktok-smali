package d.a.c;

import com.bytedance.covode.number.Covode;

public enum h {
    NoPadding,
    PKCS7Padding,
    ANSIX923Padding,
    ISO10126Padding,
    ZeroPadding;
    
    public static final a Companion = new a((byte) 0);

    static {
        Covode.recordClassIndex(103982);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(103983);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
