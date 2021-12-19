package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;

public final class bt implements bu {

    /* renamed from: a  reason: collision with root package name */
    private final cj f159055a;

    static {
        Covode.recordClassIndex(105575);
    }

    @Override // kotlinx.coroutines.bu
    public final boolean isActive() {
        return false;
    }

    @Override // kotlinx.coroutines.bu
    public final cj getList() {
        return this.f159055a;
    }

    public final String toString() {
        if (ar.f159022b) {
            return getList().a("New");
        }
        return super.toString();
    }

    public bt(cj cjVar) {
        this.f159055a = cjVar;
    }
}
