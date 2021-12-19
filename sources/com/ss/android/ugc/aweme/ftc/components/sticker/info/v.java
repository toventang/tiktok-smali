package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.h;
import com.ss.android.ugc.aweme.ftc.components.sticker.a;
import com.ss.android.ugc.aweme.tools.e.b;

final /* synthetic */ class v implements b {

    /* renamed from: a  reason: collision with root package name */
    private final i f98095a;

    static {
        Covode.recordClassIndex(62355);
    }

    v(i iVar) {
        this.f98095a = iVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.e.b
    public final void a(Object obj) {
        i iVar = this.f98095a;
        iVar.s.f98015d.setValue(true);
        iVar.a(true, (h) ((a) obj), false);
    }
}
