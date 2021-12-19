package androidx.k;

import android.view.View;
import android.view.WindowId;
import com.bytedance.covode.number.Covode;

final class am implements an {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f3262a;

    static {
        Covode.recordClassIndex(1184);
    }

    public final int hashCode() {
        return this.f3262a.hashCode();
    }

    am(View view) {
        this.f3262a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof am) || !((am) obj).f3262a.equals(this.f3262a)) {
            return false;
        }
        return true;
    }
}
