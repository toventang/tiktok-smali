package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.hit.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f127197a;

    static {
        Covode.recordClassIndex(83431);
    }

    d(c cVar) {
        this.f127197a = cVar;
    }

    public final void run() {
        c cVar = this.f127197a;
        if (cVar.f127193l != null) {
            cVar.u.b().postValue(new a(cVar.f127193l.getContentView().getX() + (((float) cVar.f127193l.getContentView().getWidth()) / 2.0f), cVar.f127193l.getContentView().getY(), cVar.f(), cVar.e()));
        }
    }
}
