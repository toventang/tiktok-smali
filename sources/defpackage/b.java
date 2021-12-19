package defpackage;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

/* renamed from: b  reason: default package */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f4802a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(1889);
    }

    public static String a(long j2, long j3, String str) {
        String bigDecimal = new BigDecimal(j2).divide(new BigDecimal(j3), 1, RoundingMode.HALF_UP).toString();
        l.b(bigDecimal, "");
        if ('0' != bigDecimal.charAt(bigDecimal.length() - 1)) {
            return bigDecimal + str;
        }
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull(bigDecimal, "null cannot be cast to non-null type java.lang.String");
        String substring = bigDecimal.substring(0, bigDecimal.length() - 2);
        l.b(substring, "");
        return sb.append(substring).append(str).toString();
    }
}
