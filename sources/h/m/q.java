package h.m;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;

public class q {
    static {
        Covode.recordClassIndex(105366);
    }

    public static final <T> void a(Appendable appendable, T t, b<? super T, ? extends CharSequence> bVar) {
        l.d(appendable, "");
        if (bVar != null) {
            appendable.append((CharSequence) bVar.invoke(t));
        } else if (t == null || (t instanceof CharSequence)) {
            appendable.append(t);
        } else if (t instanceof Character) {
            appendable.append(t.charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
