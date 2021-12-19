package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f127368c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public VideoPublishEditModel f127369a;

    /* renamed from: b  reason: collision with root package name */
    public LiveCDEditStickerLayout f127370b;

    static {
        Covode.recordClassIndex(83526);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83527);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(boolean z) {
        String str;
        String str2;
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a liveCDStickerController;
        b a2 = new b().a("enter_from", "video_edit_page").a("enter_method", "click_main_panel").a("shoot_way", this.f127369a.mShootWay).a("creation_id", this.f127369a.creationId).a("content_source", bl.b(this.f127369a)).a("content_type", bl.a(this.f127369a));
        LiveCDEditStickerLayout liveCDEditStickerLayout = this.f127370b;
        if (liveCDEditStickerLayout == null || (liveCDStickerController = liveCDEditStickerLayout.getLiveCDStickerController()) == null) {
            str = null;
        } else {
            str = liveCDStickerController.f127466a;
        }
        b a3 = a2.a("prop_id", str);
        if (z) {
            str2 = "keep";
        } else {
            str2 = "discard";
        }
        r.a("livesdk_cd_sticker_cancel_confirm", a3.a("action_type", str2).f149193a);
    }

    public final void b(boolean z) {
        String str;
        String str2;
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.a liveCDStickerController;
        b a2 = new b().a("creation_id", this.f127369a.creationId).a("enter_from", "video_edit_page");
        LiveCDEditStickerLayout liveCDEditStickerLayout = this.f127370b;
        if (liveCDEditStickerLayout == null || (liveCDStickerController = liveCDEditStickerLayout.getLiveCDStickerController()) == null) {
            str = null;
        } else {
            str = liveCDStickerController.f127466a;
        }
        b a3 = a2.a("prop_id", str).a("shoot_way", this.f127369a.mShootWay);
        if (z) {
            str2 = "click";
        } else {
            str2 = "draw";
        }
        b a4 = a3.a("action_type", str2);
        l.b(a4, "");
        if (this.f127369a.draftId != 0) {
            a4.a("draft_id", this.f127369a.draftId);
        }
        if (!TextUtils.isEmpty(this.f127369a.newDraftId)) {
            a4.a("new_draft_id", this.f127369a.newDraftId);
        }
        com.ss.android.ugc.aweme.utils.d.a("prop_delete", a4.f149193a);
    }

    public d(VideoPublishEditModel videoPublishEditModel, LiveCDEditStickerLayout liveCDEditStickerLayout) {
        l.d(videoPublishEditModel, "");
        this.f127369a = videoPublishEditModel;
        this.f127370b = liveCDEditStickerLayout;
    }
}
