package dmt.av.video;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements u {

    /* renamed from: a  reason: collision with root package name */
    private final k f156900a;

    /* renamed from: b  reason: collision with root package name */
    private final d f156901b;

    static {
        Covode.recordClassIndex(104230);
    }

    l(k kVar, d dVar) {
        this.f156900a = kVar;
        this.f156901b = dVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f156901b.a(this.f156900a.f156899a, obj);
    }
}
