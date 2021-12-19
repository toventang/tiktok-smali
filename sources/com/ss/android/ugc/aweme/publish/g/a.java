package com.ss.android.ugc.aweme.publish.g;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.f.b;
import dmt.av.video.aj;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public o f118768a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f118769b;

    /* renamed from: c  reason: collision with root package name */
    private double f118770c;

    /* renamed from: d  reason: collision with root package name */
    private String f118771d;

    /* renamed from: e  reason: collision with root package name */
    private String f118772e = "video";

    /* renamed from: f  reason: collision with root package name */
    private Object f118773f;

    /* renamed from: g  reason: collision with root package name */
    private String f118774g;

    static {
        Covode.recordClassIndex(77141);
    }

    public final void a(boolean z) {
        String str;
        o oVar = this.f118768a;
        if (oVar != null) {
            long a2 = oVar.a(TimeUnit.MILLISECONDS);
            b a3 = new b().a("duration", com.a.a(Locale.US, "%d", new Object[]{Long.valueOf(a2)})).a("status", String.valueOf(z ? 1 : 0)).a("bite_rate", new StringBuilder().append(com.ss.android.ugc.aweme.property.b.c()).toString()).a("fps", new StringBuilder().append(this.f118770c).toString()).a("content_source", this.f118771d).a("content_type", this.f118772e).a("shoot_way", this.f118774g);
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f118773f;
            b a4 = a3.a("creation_id", videoPublishEditModel.creationId).a("file_bitrate", aj.c(videoPublishEditModel.mOutputFile));
            if (videoPublishEditModel.isSaveLocal()) {
                str = "1";
            } else {
                str = "0";
            }
            a4.a("is_download_video", str).a("filter_id_list", videoPublishEditModel.mCurFilterIds).a("prop_list", videoPublishEditModel.mStickerID).a("effect_list", videoPublishEditModel.getEditEffectList()).a("info_sticker_list", videoPublishEditModel.getInfoStickerList());
            r.a("pre_release_time", a3.f149193a);
        }
    }

    public a(Object obj, String str, boolean z) {
        this.f118773f = obj;
        this.f118771d = com.ss.android.ugc.aweme.photo.a.b.a(0, obj);
        this.f118774g = str;
        this.f118770c = (double) ((VideoPublishEditModel) obj).videoFps();
        this.f118769b = z;
    }
}
