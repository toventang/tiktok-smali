package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.base.model.user.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f22107a;

    static {
        Covode.recordClassIndex(13018);
    }

    r(c cVar) {
        this.f22107a = cVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c cVar = this.f22107a;
        b bVar = (b) obj;
        cVar.f22061d.onNext(bVar);
        cVar.f22058a = bVar;
    }
}
