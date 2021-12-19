package com.ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.preload.VideoCachePreloader;
import com.ss.android.ugc.playerkit.simapicommon.a;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoCachePreloader.AnonymousClass3 f143763a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f143764b;

    static {
        Covode.recordClassIndex(94058);
    }

    p(VideoCachePreloader.AnonymousClass3 r1, JSONObject jSONObject) {
        this.f143763a = r1;
        this.f143764b = jSONObject;
    }

    public final void run() {
        VideoCachePreloader.AnonymousClass3 r0 = this.f143763a;
        try {
            a.b().monitorCommonLog("aweme_play_416", VideoCachePreloader.this.f143508d.getPlayerCommonParamManager().a(this.f143764b));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
