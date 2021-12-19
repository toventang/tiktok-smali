package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final InfoStickerEditView f127150a;

    static {
        Covode.recordClassIndex(83403);
    }

    g(InfoStickerEditView infoStickerEditView) {
        this.f127150a = infoStickerEditView;
    }

    public final void run() {
        InfoStickerEditView infoStickerEditView = this.f127150a;
        if (infoStickerEditView.n != null && infoStickerEditView.n.f127086a != null && infoStickerEditView.o != -1 && infoStickerEditView.o == 2) {
            b a2 = new b().a("creation_id", infoStickerEditView.f127074h.creationId).a("enter_from", infoStickerEditView.z ? "edit_post_page" : "video_edit_page").a("prop_id", infoStickerEditView.n.f127086a.f127114c.stickerId).a("shoot_way", infoStickerEditView.f127074h.mShootWay).a("enter_method", infoStickerEditView.n.f127087b == 0 ? "finger_gesture" : "click_button");
            if (infoStickerEditView.f127074h.draftId != 0) {
                a2.a("draft_id", infoStickerEditView.f127074h.draftId);
            }
            if (!TextUtils.isEmpty(infoStickerEditView.f127074h.newDraftId)) {
                a2.a("new_draft_id", infoStickerEditView.f127074h.newDraftId);
            }
            d.a("prop_adjust", a2.f149193a);
        }
    }
}
