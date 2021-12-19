package com.ss.android.ugc.aweme.commercialize.playfun.b;

import android.graphics.Point;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.log.c;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74981a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(46229);
    }

    public static boolean a() {
        if (!b.a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.b.a$a  reason: collision with other inner class name */
    public static final class CallableC1705a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f74982a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemePlayFunModel f74983b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AwemeRawAd f74984c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Aweme f74985d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f74986e;

        static {
            Covode.recordClassIndex(46230);
        }

        CallableC1705a(boolean z, AwemePlayFunModel awemePlayFunModel, AwemeRawAd awemeRawAd, Aweme aweme, String str) {
            this.f74982a = z;
            this.f74983b = awemePlayFunModel;
            this.f74984c = awemeRawAd;
            this.f74985d = aweme;
            this.f74986e = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public z call() {
            int i2;
            List<String> list;
            try {
                boolean z = true;
                if (this.f74982a) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                JSONObject jSONObject = new JSONObject();
                UrlModel imageInfo = this.f74983b.getImageInfo();
                if (imageInfo != null) {
                    list = imageInfo.getUrlList();
                } else {
                    list = null;
                }
                if (list != null) {
                    if (!list.isEmpty()) {
                        z = false;
                    }
                }
                if (!z) {
                    jSONObject.put("material_url", list.get(0));
                }
                Long creativeId = this.f74984c.getCreativeId();
                l.b(creativeId, "");
                jSONObject.put("creative_id", creativeId.longValue());
                jSONObject.put("log_extra", this.f74984c.getLogExtra());
                jSONObject.put("aweme_id", this.f74985d.getAid());
                IMonitorDepend iMonitorDepend = com.bytedance.ies.android.base.runtime.a.f31873b;
                if (iMonitorDepend == null) {
                    return null;
                }
                iMonitorDepend.monitorStatusRate(this.f74986e, i2, jSONObject);
                return z.f158842a;
            } catch (Exception unused) {
                return z.f158842a;
            }
        }
    }

    private static void a(String str, Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAd;
        ExecutorService executorService;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            l.b(awemeRawAd, "");
            AwemePlayFunModel playFunModel = awemeRawAd.getPlayFunModel();
            if (playFunModel != null) {
                CallableC1705a aVar = new CallableC1705a(z, playFunModel, awemeRawAd, aweme, str);
                IAppLogDepend iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a;
                if (iAppLogDepend != null) {
                    executorService = iAppLogDepend.getLogThreadPool();
                } else {
                    executorService = null;
                }
                i.b(aVar, executorService);
            }
        }
    }

    public static void a(Aweme aweme, boolean z, String str) {
        AwemeRawAd awemeRawAd;
        if (!a() && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            d.f74778a.a(new c("playfun", "preload_result", !z ? 1 : 0, System.currentTimeMillis()).a(aweme.getAid()).b(awemeRawAd.getCreativeIdStr()).c(awemeRawAd.getLogExtra()).d(str));
            a("aweme_ad_play_fun_preload_error_rate", aweme, z);
        }
    }

    public static void a(Aweme aweme, boolean z, String str, Point point, Point point2) {
        AwemeRawAd awemeRawAd;
        l.d(str, "");
        if (!a() && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            int i2 = !z ? 1 : 0;
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("state", str);
            if (point != null) {
                hashMap.put("egg_coordinate_x", String.valueOf(point.x));
                hashMap.put("egg_coordinate_y", String.valueOf(point.y));
            }
            if (point2 != null) {
                hashMap.put("text_coordinate_x", String.valueOf(point2.x));
                hashMap.put("text_coordinate_y", String.valueOf(point2.y));
            }
            d.f74778a.a(new c("playfun", "show_result", i2, System.currentTimeMillis()).a(aweme.getAid()).b(awemeRawAd.getCreativeIdStr()).c(awemeRawAd.getLogExtra()).a(hashMap));
            if (l.a((Object) str, (Object) "display")) {
                a("aweme_ad_play_fun_show_error_rate", aweme, z);
            }
        }
    }
}
