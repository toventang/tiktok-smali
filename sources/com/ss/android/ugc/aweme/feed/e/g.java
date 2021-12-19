package com.ss.android.ugc.aweme.feed.e;

import com.bytedance.covode.number.Covode;
import com.facebook.j.a.b;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.shortvideo.l.n;
import com.ss.android.ugc.aweme.utils.dw;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.util.c;
import com.ss.android.ugc.playerkit.model.l;
import com.toutiao.proxyserver.g.a;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f92907a;

    /* renamed from: b  reason: collision with root package name */
    private final l f92908b;

    /* renamed from: c  reason: collision with root package name */
    private final Video f92909c;

    /* renamed from: d  reason: collision with root package name */
    private final aj f92910d;

    static {
        Covode.recordClassIndex(58935);
    }

    g(f fVar, l lVar, Video video, aj ajVar) {
        this.f92907a = fVar;
        this.f92908b = lVar;
        this.f92909c = video;
        this.f92910d = ajVar;
    }

    public final void run() {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObject2;
        String str2;
        f fVar = this.f92907a;
        l lVar = this.f92908b;
        Video video = this.f92909c;
        aj ajVar = this.f92910d;
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sourceId", lVar.f148746a);
            jSONObject3.put("errorCode", lVar.f148749d);
            jSONObject3.put("errorExtra", lVar.f148750e);
            jSONObject3.put("netWorkQuality", b.a.f48731a.a().toString());
            jSONObject3.put("netWorkSpeed", (int) b.a.f48731a.b());
            jSONObject3.put("playUrl", dw.a(video.getProperPlayAddr()));
            jSONObject3.put("playUrlIsLowBr", video.isLowBr());
            jSONObject3.put("video_duration", video.getDuration());
            c.a(jSONObject3);
            if (lVar.f148751f != null) {
                jSONObject3.put("extraInfo", lVar.f148751f.toString());
            }
            File a2 = e.a(e.a(), "cache");
            video.getProperPlayAddr();
            if (a2 == null) {
                str2 = "";
            } else {
                str2 = new n("file", a2.getPath() + "/" + a.a(video.getPlayAddr().getBitRatedRatioUri())).toString();
            }
            jSONObject3.put("file", str2);
            jSONObject = new JSONObject(jSONObject3.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
            jSONObject = null;
        }
        r.onEvent(MobClick.obtain().setEventName("play_error").setLabelName("perf_monitor").setJsonObject(jSONObject));
        if (com.ss.android.ugc.aweme.feed.x.g.c(ajVar)) {
            try {
                jSONObject2 = new JSONObject(jSONObject3.toString());
                jSONObject2.put("aweme_id", ajVar.b().getAid());
                jSONObject2.put("creative_id", ajVar.b().getAwemeRawAd().getCreativeId());
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.B(ajVar.b())) {
                    jSONObject2.put("is_topview", true);
                }
            } catch (Exception unused) {
                jSONObject2 = new JSONObject();
            }
            com.bytedance.apm.b.a("aweme_ad_media_play_error_rate", 1, jSONObject2);
            com.bytedance.apm.b.a("aweme_ad_media_play_error", 1, jSONObject2);
            Aweme b2 = ajVar.b();
            if (b2 != null && b2.isAd()) {
                com.ss.android.ugc.aweme.commercialize.g.a().l(fVar.d(), b2);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "play_failed", b2.getAwemeRawAd()).c();
            }
        }
        fVar.d();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = f.q();
        }
        if (j.f107229h) {
            com.bytedance.apm.b.a("aweme_media_error_rate", 1, jSONObject3);
            if (com.ss.android.ugc.aweme.feed.x.g.d(ajVar)) {
                com.ss.android.ugc.aweme.commercialize.log.a.a(ajVar.b(), 1, 1);
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("alarm_reason", "fail_to_play");
                    if (ajVar.b() != null) {
                        jSONObject4.put("group_id", ajVar.b().getAid());
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                r.onEvent(MobClick.obtain().setEventName("ad_alarm").setLabelName("homepage_hot").setJsonObject(jSONObject4));
            }
            if (VideoBitRateABManager.f143220a.d()) {
                str = "aweme_media_bitrated_error_rate";
            } else {
                str = "aweme_media_original_error_rate";
            }
            com.bytedance.apm.b.a(str, 1, jSONObject3);
        }
        com.ss.android.ugc.aweme.app.n.a("aweme_media_play_error_log", "play_error", jSONObject3);
    }
}
