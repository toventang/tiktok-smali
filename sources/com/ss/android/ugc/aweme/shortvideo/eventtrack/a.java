package com.ss.android.ugc.aweme.shortvideo.eventtrack;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.beauty.c;
import com.ss.android.ugc.aweme.beauty.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.tools.f.b;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f128467a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(84233);
    }

    public static final void a(ShortVideoContext shortVideoContext, com.ss.android.ugc.asve.recorder.c.a aVar, FaceStickerBean faceStickerBean, Integer num, ComposerBeautyBuriedInfo composerBeautyBuriedInfo, g gVar, String str, m<? super String, ? super Map<String, String>, z> mVar) {
        String str2;
        String str3;
        Long l2;
        String valueOf;
        l.d(shortVideoContext, "");
        l.d(aVar, "");
        l.d(str, "");
        l.d(mVar, "");
        b bVar = new b();
        b a2 = bVar.a("next_action", str);
        if (faceStickerBean == null || (str2 = faceStickerBean.getId()) == null) {
            str2 = "";
        }
        b a3 = a2.a("effect_id", str2);
        if (faceStickerBean == null || (str3 = faceStickerBean.getRecId()) == null) {
            str3 = "";
        }
        b a4 = a3.a("effect_rec_id", str3);
        if (faceStickerBean != null) {
            l2 = Long.valueOf(faceStickerBean.getStickerId());
        } else {
            l2 = "";
        }
        a4.a("effect_sticker_id", l2).a("beauty_status", c.a(composerBeautyBuriedInfo, gVar)).a("shoot_way", shortVideoContext.r).a("resolution", com.ss.android.ugc.aweme.property.b.e()).a("creation_id", shortVideoContext.q).a("fps", Float.valueOf(aVar.p())).a("lag_count", aVar.m()).a("lag_max", aVar.n()).a("lag_total_duration", aVar.o()).a("beautify_used", c.b(composerBeautyBuriedInfo)).a("beautify_info", c.a(composerBeautyBuriedInfo)).a("is_composer", c.c(composerBeautyBuriedInfo));
        if (num == null) {
            bVar.a("filter_id", "");
        } else {
            int intValue = num.intValue();
            if (intValue == 0) {
                valueOf = "-1";
            } else {
                valueOf = String.valueOf(intValue);
            }
            bVar.a("filter_id", valueOf);
        }
        Map<String, String> map = bVar.f149193a;
        l.b(map, "");
        mVar.invoke("tool_performance_video_preview", map);
    }
}
