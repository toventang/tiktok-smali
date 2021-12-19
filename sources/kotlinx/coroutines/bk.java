package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;

final class bk implements bu {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f159047a;

    static {
        Covode.recordClassIndex(105564);
    }

    @Override // kotlinx.coroutines.bu
    public final cj getList() {
        return null;
    }

    @Override // kotlinx.coroutines.bu
    public final boolean isActive() {
        return this.f159047a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (isActive()) {
            str = "Active";
        } else {
            str = "New";
        }
        return sb.append(str).append('}').toString();
    }

    public bk(boolean z) {
        this.f159047a = z;
    }
}
