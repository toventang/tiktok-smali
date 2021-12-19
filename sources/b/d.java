package b;

import com.a;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final f f4813a;

    static {
        Covode.recordClassIndex(1895);
    }

    public final String toString() {
        return a.a(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(this.f4813a.a())});
    }

    d(f fVar) {
        this.f4813a = fVar;
    }
}
