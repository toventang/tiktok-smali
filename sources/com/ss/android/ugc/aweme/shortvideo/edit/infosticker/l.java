package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.interact.h;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.view.q;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f127771a;

    static {
        Covode.recordClassIndex(83746);
    }

    l(i iVar) {
        this.f127771a = iVar;
    }

    public final void onClick(View view) {
        boolean z;
        ClickAgent.onClick(view);
        i iVar = this.f127771a;
        iVar.f127155d.b();
        iVar.L.clear();
        if (iVar.h()) {
            if (iVar.K instanceof aj) {
                z = ((aj) iVar.K).f127124m;
            } else {
                z = false;
            }
            b a2 = new b().a("prop_id", i.a(iVar.K)).a("creation_id", iVar.u.creationId).a("content_source", iVar.u.getAvetParameter().getContentSource()).a("shoot_entrance", iVar.u.mShootWay).a("enter_from", iVar.f127152a ? "edit_post_page" : "video_edit_page");
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            b a3 = a2.a("is_diy_prop", i2);
            if (iVar.u.draftId != 0) {
                a3.a("draft_id", iVar.u.draftId);
            }
            if (!TextUtils.isEmpty(iVar.u.newDraftId)) {
                a3.a("new_draft_id", iVar.u.newDraftId);
            }
            d.a("prop_timeset_confirm", a3.f149193a);
        } else if (iVar.K instanceof q) {
            TextStickerData data = ((q) iVar.K).getData();
            boolean z2 = data != null && data.getHasReadTextAudio();
            VideoPublishEditModel videoPublishEditModel = iVar.u;
            h.f.b.l.d(videoPublishEditModel, "");
            r.a("text_timeset_confirm", bl.a(videoPublishEditModel, false, z2, 2).f149193a);
        }
        iVar.a(false, (h) null);
    }
}
