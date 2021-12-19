package com.facebook.imagepipeline.common;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.common.k.b;
import java.util.regex.Pattern;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static Pattern f47731c;

    /* renamed from: a  reason: collision with root package name */
    public final int f47732a;

    /* renamed from: b  reason: collision with root package name */
    public final int f47733b;

    static {
        Covode.recordClassIndex(28923);
    }

    public int hashCode() {
        return b.a(this.f47732a, this.f47733b);
    }

    public String toString() {
        return com.a.a(null, "%s-%s", new Object[]{a(this.f47732a), a(this.f47733b)});
    }

    public static String a(int i2) {
        if (i2 == Integer.MAX_VALUE) {
            return "";
        }
        return Integer.toString(i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f47732a == aVar.f47732a && this.f47733b == aVar.f47733b) {
            return true;
        }
        return false;
    }

    public static a a(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        if (str == null) {
            return null;
        }
        if (f47731c == null) {
            f47731c = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = f47731c.split(str);
            if (split.length == 4) {
                z = true;
            } else {
                z = false;
            }
            i.a(z);
            i.a(split[0].equals("bytes"));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            if (parseInt2 > parseInt) {
                z2 = true;
            } else {
                z2 = false;
            }
            i.a(z2);
            if (parseInt3 > parseInt2) {
                z3 = true;
            } else {
                z3 = false;
            }
            i.a(z3);
            if (parseInt2 < parseInt3 - 1) {
                return new a(parseInt, parseInt2);
            }
            return new a(parseInt, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(com.a.a(null, "Invalid Content-Range header value: \"%s\"", new Object[]{str}), e2);
        }
    }

    public a(int i2, int i3) {
        this.f47732a = i2;
        this.f47733b = i3;
    }
}
