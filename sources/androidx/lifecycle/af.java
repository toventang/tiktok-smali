package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public class af {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, ac> f3512a = new HashMap<>();

    static {
        Covode.recordClassIndex(1306);
    }

    public final void a() {
        for (ac acVar : this.f3512a.values()) {
            acVar.clear();
        }
        this.f3512a.clear();
    }

    public final ac a(String str) {
        return this.f3512a.get(str);
    }

    public final void a(String str, ac acVar) {
        ac put = this.f3512a.put(str, acVar);
        if (put != null) {
            put.onCleared();
        }
    }
}
