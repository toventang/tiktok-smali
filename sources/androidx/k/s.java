package androidx.k;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f3355a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f3356b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<m> f3357c = new ArrayList<>();

    static {
        Covode.recordClassIndex(1239);
    }

    public final int hashCode() {
        return (this.f3356b.hashCode() * 31) + this.f3355a.hashCode();
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3356b + "\n") + "    values:";
        for (String str2 : this.f3355a.keySet()) {
            str = str + "    " + str2 + ": " + this.f3355a.get(str2) + "\n";
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f3356b != sVar.f3356b || !this.f3355a.equals(sVar.f3355a)) {
            return false;
        }
        return true;
    }
}
