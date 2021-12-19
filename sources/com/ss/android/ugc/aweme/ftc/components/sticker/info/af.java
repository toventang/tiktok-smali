package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.a;
import com.ss.android.ugc.aweme.ftc.components.sticker.a.a;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final /* synthetic */ class af implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f98022a;

    static {
        Covode.recordClassIndex(62309);
    }

    af(i iVar) {
        this.f98022a = iVar;
    }

    public final void onClick(View view) {
        a aVar;
        ClickAgent.onClick(view);
        i iVar = this.f98022a;
        iVar.f98069d.a();
        iVar.K.clear();
        if (iVar.J != null && (iVar.J instanceof a) && (aVar = (a) iVar.J) != null) {
            com.ss.android.ugc.aweme.ftc.components.sticker.a.a aVar2 = iVar.N;
            l.d(aVar, "");
            aVar2.f97905a = aVar.f97894b.path;
            StickerItemModel stickerItemModel = aVar.f97894b;
            l.b(stickerItemModel, "");
            aVar2.f97906b = stickerItemModel.getId();
            aVar2.f97908d = aVar;
            aVar2.f97914j.a(false);
            aVar2.f97914j.c(aVar2.f97913i);
            a.AbstractC2365a aVar3 = aVar2.f97909e;
            if (aVar3 != null) {
                aVar3.a();
            }
        }
    }
}
