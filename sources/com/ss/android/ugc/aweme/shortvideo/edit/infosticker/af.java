package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.d.a;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final /* synthetic */ class af implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f127105a;

    static {
        Covode.recordClassIndex(83389);
    }

    af(i iVar) {
        this.f127105a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        i iVar = this.f127105a;
        iVar.f127155d.b();
        iVar.L.clear();
        aj ajVar = (iVar.K == null || !(iVar.K instanceof aj)) ? null : (aj) iVar.K;
        boolean z = false;
        if (ajVar != null) {
            a aVar = iVar.O;
            l.d(ajVar, "");
            aVar.f127001a = ajVar.f127114c.path;
            StickerItemModel stickerItemModel = ajVar.f127114c;
            l.b(stickerItemModel, "");
            aVar.f127002b = stickerItemModel.getId();
            aVar.f127004d = ajVar;
            aVar.f127010j.a(false);
            aVar.f127010j.c(aVar.f127009i);
            a.AbstractC3298a aVar2 = aVar.f127005e;
            if (aVar2 != null) {
                aVar2.a();
            }
            z = ajVar.f127124m;
        }
        b a2 = new b().a("enter_from", "video_edit_page").a("shoot_way", iVar.u.mShootWay).a("creation_id", iVar.u.creationId).a("content_type", iVar.u.getAvetParameter().getContentType()).a("content_source", iVar.u.getAvetParameter().getContentSource()).a("prop_id", i.a(iVar.K));
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        d.a("prop_pin_confirm", a2.a("is_diy_prop", i2).f149193a);
    }
}
