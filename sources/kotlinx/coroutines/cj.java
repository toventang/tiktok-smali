package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.w;
import kotlinx.coroutines.internal.j;
import kotlinx.coroutines.internal.l;

public final class cj extends j implements bu {
    static {
        Covode.recordClassIndex(105601);
    }

    @Override // kotlinx.coroutines.bu
    public final cj getList() {
        return this;
    }

    @Override // kotlinx.coroutines.bu
    public final boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.l
    public final String toString() {
        if (ar.f159022b) {
            return a("Active");
        }
        return super.toString();
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object g2 = g();
        if (g2 != null) {
            boolean z = true;
            for (l lVar = (l) g2; !h.f.b.l.a(lVar, this); lVar = lVar.h()) {
                if (lVar instanceof ce) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(lVar);
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            h.f.b.l.a((Object) sb2, "");
            return sb2;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
