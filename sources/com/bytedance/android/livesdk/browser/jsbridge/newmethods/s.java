package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.p.a;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.kakao.usermgmt.StringSet;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class s extends e<c, Object> {

    /* renamed from: a  reason: collision with root package name */
    g f14730a;

    public class c {
        @com.google.gson.a.c(a = "urls")

        /* renamed from: a  reason: collision with root package name */
        public List<String> f14737a;
        @com.google.gson.a.c(a = "action")

        /* renamed from: b  reason: collision with root package name */
        public int f14738b;
        @com.google.gson.a.c(a = "suffix")

        /* renamed from: c  reason: collision with root package name */
        public String f14739c;
        @com.google.gson.a.c(a = StringSet.type)

        /* renamed from: d  reason: collision with root package name */
        public String f14740d;
        @com.google.gson.a.c(a = "demand")

        /* renamed from: e  reason: collision with root package name */
        public String f14741e;

        static {
            Covode.recordClassIndex(8181);
        }
    }

    static {
        Covode.recordClassIndex(8177);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        com.bytedance.android.livesdk.p.a.a().f20181b.clear();
    }

    /* access modifiers changed from: package-private */
    public class a implements a.AbstractC0411a {

        /* renamed from: a  reason: collision with root package name */
        public final String f14733a;

        static {
            Covode.recordClassIndex(8179);
        }

        @Override // com.bytedance.android.livesdk.p.a.AbstractC0411a
        public final void a(DownloadInfo downloadInfo) {
            s.this.a(this.f14733a, 1, downloadInfo);
        }

        @Override // com.bytedance.android.livesdk.p.a.AbstractC0411a
        public final void b(DownloadInfo downloadInfo) {
            s.this.a(this.f14733a, 3, downloadInfo);
        }

        @Override // com.bytedance.android.livesdk.p.a.AbstractC0411a
        public final void d(DownloadInfo downloadInfo) {
            s.this.a(this.f14733a, 4, downloadInfo);
        }

        @Override // com.bytedance.android.livesdk.p.a.AbstractC0411a
        public final void c(DownloadInfo downloadInfo) {
            s.this.a(this.f14733a, 2, downloadInfo);
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_download_live_replay_duration");
            com.bytedance.android.livesdk.p.a a3 = com.bytedance.android.livesdk.p.a.a();
            int id = downloadInfo.getId();
            HashMap hashMap = new HashMap();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(Downloader.getInstance(y.e()).getDownloadInfo(id).getTargetFilePath());
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            hashMap.put("duration", String.valueOf(a3.f20180a.get(Integer.valueOf(id)).f20184a));
            hashMap.put("live_duration", extractMetadata);
            a3.f20180a.remove(Integer.valueOf(id));
            a2.a((Map<String, String>) hashMap).b();
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(new File(downloadInfo.getTargetFilePath())));
            y.e().sendBroadcast(intent);
        }

        public a(String str) {
            this.f14733a = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r1 != 6) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(final com.bytedance.android.livesdk.browser.jsbridge.newmethods.s.c r8) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.s.a(com.bytedance.android.livesdk.browser.jsbridge.newmethods.s$c):void");
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        public int f14735a;

        static {
            Covode.recordClassIndex(8180);
        }

        public b(int i2) {
            this.f14735a = i2;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(c cVar, g gVar) {
        c cVar2 = cVar;
        HashMap hashMap = new HashMap();
        hashMap.put("download_params_action", Integer.valueOf(cVar2.f14738b));
        com.bytedance.android.live.core.d.c.a("ttlive_live_replay_download_action", 0, hashMap);
        if (gVar != null && m.a("live_replay", cVar2.f14741e) && !com.bytedance.common.utility.collection.b.a((Collection) cVar2.f14737a) && y.e() != null) {
            this.f14730a = gVar;
            a(cVar2);
            finishWithResult(new b(1));
        }
        finishWithResult(new b(-1));
    }

    public final void a(String str, int i2, DownloadInfo downloadInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", 1);
        hashMap.put("download_status", Integer.valueOf(i2));
        com.bytedance.android.live.core.d.c.a("ttlive_live_replay_send_js_event", 0, hashMap);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", str);
            jSONObject.put("code", 1);
            if (downloadInfo != null) {
                jSONObject.put("status", i2);
                double downloadProcess = (double) downloadInfo.getDownloadProcess();
                Double.isNaN(downloadProcess);
                jSONObject.put("percent", downloadProcess / 100.0d);
            } else {
                jSONObject.put("status", 0);
                jSONObject.put("percent", 0.0d);
            }
        } catch (JSONException unused) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("error_msg", 1);
            com.bytedance.android.live.core.d.c.a("ttlive_live_replay_send_js_error", 1, hashMap2);
        }
        this.f14730a.a("downloadMediaStatusChange", jSONObject);
    }
}
