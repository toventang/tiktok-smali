package com.bytedance.ies.xbridge.base.runtime.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Locale;

public enum c {
    STRING("string"),
    BOOL("bool"),
    NUMBER("number"),
    OBJECT("object"),
    ARRAY("array"),
    INT32("int32"),
    LONG("long"),
    FLOAT("float"),
    DOUBLE("double"),
    UNSUPPORTED;
    
    public static final a Companion = new a((byte) 0);
    private final String type;

    public static final c getValueByType(String str) {
        return a.a(str);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21377);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static c a(String str) {
            l.c(str, "");
            try {
                Locale locale = Locale.getDefault();
                l.a((Object) locale, "");
                String upperCase = str.toUpperCase(locale);
                l.a((Object) upperCase, "");
                return c.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                return c.UNSUPPORTED;
            }
        }
    }

    public final String getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(21376);
    }

    private /* synthetic */ c(String str) {
        this(null);
    }

    private c(String str) {
        this.type = str;
    }
}
