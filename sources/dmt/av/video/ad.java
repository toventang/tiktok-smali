package dmt.av.video;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ad implements u {

    /* renamed from: a  reason: collision with root package name */
    private final z f156765a;

    static {
        Covode.recordClassIndex(104115);
    }

    ad(z zVar) {
        this.f156765a = zVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        z zVar = this.f156765a;
        Boolean bool = (Boolean) obj;
        if (zVar.v != null) {
            zVar.v.f156724d = bool != null ? bool.booleanValue() : false;
        }
    }
}
