package androidx.k;

import android.os.IBinder;
import com.bytedance.covode.number.Covode;

final class al implements an {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f3261a;

    static {
        Covode.recordClassIndex(1183);
    }

    public final int hashCode() {
        return this.f3261a.hashCode();
    }

    al(IBinder iBinder) {
        this.f3261a = iBinder;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof al) || !((al) obj).f3261a.equals(this.f3261a)) {
            return false;
        }
        return true;
    }
}
