package androidx.work;

import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4503a = g.a("InputMerger");

    public abstract e a(List<e> list);

    static {
        Covode.recordClassIndex(1752);
    }

    public static f a(String str) {
        try {
            return (f) Class.forName(str).newInstance();
        } catch (Exception e2) {
            g.a();
            new Throwable[1][0] = e2;
            return null;
        }
    }
}
