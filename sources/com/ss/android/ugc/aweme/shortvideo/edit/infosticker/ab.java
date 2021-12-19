package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.interact.h;
import com.ss.android.ugc.aweme.tools.e.c;

public final /* synthetic */ class ab implements c {

    /* renamed from: a  reason: collision with root package name */
    private final i f127100a;

    static {
        Covode.recordClassIndex(83385);
    }

    public ab(i iVar) {
        this.f127100a = iVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.e.c
    public final void a(Object obj) {
        i iVar = this.f127100a;
        aj ajVar = (aj) obj;
        if ((!iVar.a() && !iVar.b()) || iVar.f127155d.f127078l != InfoStickerEditView.f127066m) {
            return;
        }
        if (iVar.b()) {
            iVar.a(ajVar, 1);
        } else {
            iVar.a((h) ajVar);
        }
    }
}
