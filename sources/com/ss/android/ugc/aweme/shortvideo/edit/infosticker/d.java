package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.hit.a;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f127144a;

    /* renamed from: b  reason: collision with root package name */
    private final aj f127145b;

    static {
        Covode.recordClassIndex(83400);
    }

    d(c cVar, aj ajVar) {
        this.f127144a = cVar;
        this.f127145b = ajVar;
    }

    public final void run() {
        c cVar = this.f127144a;
        aj ajVar = this.f127145b;
        cVar.f127138h.b().postValue(new a(ajVar.f127118g.left + (ajVar.f127118g.width() / 2.0f), ajVar.f127118g.top, R.string.ay0, 0));
    }
}
