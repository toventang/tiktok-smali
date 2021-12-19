package com.ss.android.ugc.aweme.commentStickerPanel;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ShortVideoContext f73228a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoPublishEditModel f73229b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f73230c;

    static {
        Covode.recordClassIndex(45108);
    }

    public final b a() {
        if (this.f73230c) {
            ShortVideoContext shortVideoContext = this.f73228a;
            if (shortVideoContext != null) {
                return new b().a("shoot_way", shortVideoContext.r).a("enter_from", "video_shoot_page").a("creation_id", shortVideoContext.q).a("user_id", g.a().A().c()).a("content_source", "shoot").a("content_type", "video");
            }
            return null;
        }
        VideoPublishEditModel videoPublishEditModel = this.f73229b;
        if (videoPublishEditModel != null) {
            return new b().a("shoot_way", videoPublishEditModel.mShootWay).a("enter_from", "video_edit_page").a("creation_id", videoPublishEditModel.creationId).a("user_id", g.a().A().c()).a("content_source", es.a(videoPublishEditModel)).a("content_type", es.c(videoPublishEditModel));
        }
        return null;
    }

    public final void a(int i2) {
        VideoPublishEditModel videoPublishEditModel = this.f73229b;
        if (videoPublishEditModel != null) {
            d.a("replace_question_show", new b().a("creation_id", videoPublishEditModel.creationId).a("enter_from", "video_edit_page").a("shoot_way", videoPublishEditModel.mShootWay).a(StringSet.type, i2).f149193a);
        }
    }

    public final void a(String str, int i2) {
        l.d(str, "");
        VideoPublishEditModel videoPublishEditModel = this.f73229b;
        if (videoPublishEditModel != null) {
            d.a("replace_question_confirm", new b().a("creation_id", videoPublishEditModel.creationId).a("enter_from", "video_edit_page").a("shoot_way", videoPublishEditModel.mShootWay).a("target", str).a(StringSet.type, i2).f149193a);
        }
    }

    private k(ShortVideoContext shortVideoContext, VideoPublishEditModel videoPublishEditModel, boolean z) {
        this.f73228a = shortVideoContext;
        this.f73229b = videoPublishEditModel;
        this.f73230c = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(ShortVideoContext shortVideoContext, VideoPublishEditModel videoPublishEditModel, boolean z, int i2) {
        this((i2 & 1) != 0 ? null : shortVideoContext, (i2 & 2) != 0 ? null : videoPublishEditModel, z);
    }
}
