package com.ss.android.ugc.aweme.shortvideo.l;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements g.c {

    /* renamed from: a  reason: collision with root package name */
    private final b f128687a;

    static {
        Covode.recordClassIndex(84356);
    }

    l(b bVar) {
        this.f128687a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g.c
    public final void a() {
        b bVar = this.f128687a;
        bVar.o = true;
        bVar.f128653g = null;
        d dVar = new d();
        bVar.a(dVar);
        AVExternalServiceImpl.a().getAVMobService().onEventV3("click_cancel_loading", dVar.f66730a);
    }
}
