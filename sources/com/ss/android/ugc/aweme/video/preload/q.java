package com.ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.preload.VideoCachePreloader;
import com.ss.android.ugc.playerkit.simapicommon.a;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final VideoCachePreloader.AnonymousClass3 f143765a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f143766b;

    /* renamed from: c  reason: collision with root package name */
    private final String f143767c;

    /* renamed from: d  reason: collision with root package name */
    private final int f143768d;

    /* renamed from: e  reason: collision with root package name */
    private final int f143769e;

    /* renamed from: f  reason: collision with root package name */
    private final String f143770f;

    static {
        Covode.recordClassIndex(94059);
    }

    q(VideoCachePreloader.AnonymousClass3 r1, boolean z, String str, int i2, int i3, String str2) {
        this.f143765a = r1;
        this.f143766b = z;
        this.f143767c = str;
        this.f143768d = i2;
        this.f143769e = i3;
        this.f143770f = str2;
    }

    public final void run() {
        VideoCachePreloader.AnonymousClass3 r7 = this.f143765a;
        boolean z = this.f143766b;
        String str = this.f143767c;
        int i2 = this.f143768d;
        int i3 = this.f143769e;
        String str2 = this.f143770f;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("disableAutoDiskCacheManagement", z);
            jSONObject.put("key", str);
            jSONObject.put("oldContentLength", i2);
            jSONObject.put("newContentLength", i3);
            jSONObject.put("previousInfo", str2);
            VideoCachePreloader.this.f143508d.getPlayerCommonParamManager().a(jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a.b().monitorCommonLog("aweme_play_content_length_not_match", jSONObject);
    }
}
