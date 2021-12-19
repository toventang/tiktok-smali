package com.ss.android.ugc.aweme.live.g;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.TikTokLiveGeckoBroadcastCdnPathSetting;
import com.bytedance.android.livesdk.livesetting.other.TiktokLiveBasicResourceGeckoBaseUrlSetting;
import com.bytedance.android.livesdk.livesetting.other.TiktokLiveInteractionResourceGeckoBaseUrlSetting;
import com.bytedance.android.livesdk.livesetting.other.TiktokLiveWatchResourceGeckoBaseUrlSetting;
import com.bytedance.android.livesdkapi.d.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.sdk.webview.h;
import com.ss.android.ugc.aweme.live.ILiveHostOuterService;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import com.ss.android.ugc.aweme.utils.dc;
import com.ss.android.ugc.aweme.web.k;
import h.f.b.l;
import java.io.File;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f108417a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static volatile h f108418b;

    private d() {
    }

    static {
        Covode.recordClassIndex(69464);
    }

    private static void a() {
        if (f108418b == null) {
            ILiveHostOuterService q = LiveHostOuterService.q();
            l.b(q, "");
            h hVar = new h(q.f());
            ILiveHostOuterService q2 = LiveHostOuterService.q();
            l.b(q2, "");
            f108418b = hVar.a(q2.e()).a(c.a());
        }
    }

    private static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        a();
        h hVar = f108418b;
        if (hVar != null) {
            str2 = hVar.f60221b;
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        l.b(k.f145061a, "");
        return dc.a("offlineX", str2, str);
    }

    public static String a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            switch (str.hashCode()) {
                case 351530604:
                    if (str.equals("tiktok_live_watch_resource")) {
                        return a(TiktokLiveWatchResourceGeckoBaseUrlSetting.INSTANCE.getValue(), TiktokLiveWatchResourceGeckoBaseUrlSetting.DEFAULT, str, str2);
                    }
                    break;
                case 1021228553:
                    if (str.equals("tiktok_live_interaction_resource")) {
                        return a(TiktokLiveInteractionResourceGeckoBaseUrlSetting.INSTANCE.getValue(), "https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource", str, str2);
                    }
                    break;
                case 1040038381:
                    if (str.equals("tiktok_live_basic_resource")) {
                        return a(TiktokLiveBasicResourceGeckoBaseUrlSetting.INSTANCE.getValue(), "https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource", str, str2);
                    }
                    break;
                case 1544090554:
                    if (str.equals("tiktok_live_broadcast_resource")) {
                        return a(TikTokLiveGeckoBroadcastCdnPathSetting.INSTANCE.getValue(), "https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource", str, str2);
                    }
                    break;
            }
        }
        return "";
    }

    public static File b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        File file = new File(a2 + File.separator + str2);
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    private static String a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            return str + '/' + str3 + '/' + str4;
        }
        return str2 + '/' + str3 + '/' + str4;
    }
}
