package dmt.av.video;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ae implements u {

    /* renamed from: a  reason: collision with root package name */
    private final z f156766a;

    static {
        Covode.recordClassIndex(104116);
    }

    ae(z zVar) {
        this.f156766a = zVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        z zVar = this.f156766a;
        Boolean bool = (Boolean) obj;
        if (zVar.v != null) {
            zVar.v.f156725e = bool != null ? bool.booleanValue() : false;
        }
    }
}
