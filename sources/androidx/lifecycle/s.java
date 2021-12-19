package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f3547a = new HashMap();

    static {
        Covode.recordClassIndex(1336);
    }

    public final boolean a(String str, int i2) {
        int i3;
        boolean z;
        Integer num = this.f3547a.get(str);
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        if ((i3 & i2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f3547a.put(str, Integer.valueOf(i2 | i3));
        if (!z) {
            return true;
        }
        return false;
    }
}
