package com.ss.android.ugc.aweme.i18n.xbridge.b.a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import b.i;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.d.c;
import com.bytedance.android.monitor.webview.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.e.d;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback;
import com.bytedance.ies.xbridge.model.b.c;
import com.bytedance.ies.xbridge.n;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.commercialize.event.g;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.utils.au;
import com.ss.android.ugc.aweme.commercialize.utils.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import h.f.b.m;
import h.q;
import h.r;
import h.z;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class e implements IHostLogDepend {
    static {
        Covode.recordClassIndex(63706);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f99959a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f99960b;

        static {
            Covode.recordClassIndex(63707);
        }

        a(c cVar, Map map) {
            this.f99959a = cVar;
            this.f99960b = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public q<? extends z> call() {
            Object obj;
            String str;
            try {
                d dVar = (d) com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(this.f99959a, d.class);
                c.a aVar = new c.a("bdx_monitor_xbridge_error");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", this.f99960b.get("code"));
                jSONObject.put("error_message", this.f99960b.get("error_message"));
                jSONObject.put("method_name", this.f99960b.get("method_name"));
                aVar.f23443c = jSONObject;
                aVar.f23448h = true;
                if (dVar != null) {
                    str = dVar.a();
                } else {
                    str = null;
                }
                aVar.f23441a = str;
                aVar.f23449i = new h();
                HybridMonitor.getInstance().customReport(aVar.a());
                obj = q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            return q.m222boximpl(obj);
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final void onEventV3Map(String str, Map<String, String> map) {
        l.d(str, "");
        com.ss.android.ugc.aweme.common.r.a(str, map);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final void putCommonParams(Map<String, String> map, boolean z) {
        l.d(map, "");
        com.ss.android.common.applog.q.a(map, z);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final z reportJSBError(com.bytedance.ies.xbridge.model.b.c cVar, Map<String, ? extends Object> map) {
        l.d(map, "");
        i.b(new a(cVar, map), i.f4824a);
        return null;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.m<f.b, Boolean, f.b> {
        final /* synthetic */ k $adInfo$inlined;

        static {
            Covode.recordClassIndex(63708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar) {
            super(2);
            this.$adInfo$inlined = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ f.b invoke(f.b bVar, Boolean bool) {
            f.b a2;
            f.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                a2 = bVar2.b(this.$adInfo$inlined.f75793m);
            } else {
                a2 = bVar2.a(this.$adInfo$inlined.f75793m);
            }
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final z reportJSBFetchError(com.bytedance.ies.xbridge.model.b.c cVar, Map<String, ? extends Object> map) {
        WebView webView;
        Object obj;
        Object obj2;
        l.d(map, "");
        Object obj3 = map.get("platform");
        int i2 = 0;
        int i3 = -99;
        if (l.a(obj3, (Object) com.bytedance.ies.xbridge.e.LYNX.name())) {
            LynxView lynxView = (LynxView) com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(cVar, LynxView.class);
            if (lynxView != null) {
                try {
                    com.bytedance.android.monitor.lynx.b bVar = com.bytedance.android.monitor.lynx.b.f23580f;
                    com.bytedance.android.monitor.lynx.c.a.c cVar2 = new com.bytedance.android.monitor.lynx.c.a.c();
                    Object obj4 = map.get("url");
                    if (!(obj4 instanceof String)) {
                        obj4 = null;
                    }
                    cVar2.f23624c = (String) obj4;
                    Object obj5 = map.get("requestErrorCode");
                    if (!(obj5 instanceof Integer)) {
                        obj5 = null;
                    }
                    Integer num = (Integer) obj5;
                    if (num != null) {
                        i3 = num.intValue();
                    }
                    cVar2.f23626e = i3;
                    Object obj6 = map.get("requestErrorMsg");
                    if (!(obj6 instanceof String)) {
                        obj6 = null;
                    }
                    cVar2.f23627f = (String) obj6;
                    Object obj7 = map.get("method");
                    if (!(obj7 instanceof String)) {
                        obj7 = null;
                    }
                    cVar2.f23623b = (String) obj7;
                    Object obj8 = map.get("statusCode");
                    if (!(obj8 instanceof Integer)) {
                        obj8 = null;
                    }
                    Integer num2 = (Integer) obj8;
                    if (num2 != null) {
                        i2 = num2.intValue();
                    }
                    cVar2.f23625d = i2;
                    bVar.a(lynxView, cVar2);
                    obj2 = q.m223constructorimpl(z.f158842a);
                } catch (Throwable th) {
                    obj2 = q.m223constructorimpl(r.a(th));
                }
                q.m222boximpl(obj2);
            }
        } else if (l.a(obj3, (Object) com.bytedance.ies.xbridge.e.WEB.name()) && (webView = (WebView) com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(cVar, WebView.class)) != null) {
            try {
                com.bytedance.android.monitor.webview.c cVar3 = com.bytedance.android.monitor.webview.i.f23764a;
                com.bytedance.android.monitor.d.d dVar = new com.bytedance.android.monitor.d.d();
                Object obj9 = map.get("url");
                if (!(obj9 instanceof String)) {
                    obj9 = null;
                }
                dVar.f23453b = (String) obj9;
                Object obj10 = map.get("requestErrorCode");
                if (!(obj10 instanceof Integer)) {
                    obj10 = null;
                }
                Integer num3 = (Integer) obj10;
                if (num3 != null) {
                    i3 = num3.intValue();
                }
                dVar.f23455d = i3;
                Object obj11 = map.get("requestErrorMsg");
                if (!(obj11 instanceof String)) {
                    obj11 = null;
                }
                dVar.f23456e = (String) obj11;
                Object obj12 = map.get("method");
                if (!(obj12 instanceof String)) {
                    obj12 = null;
                }
                dVar.f23452a = (String) obj12;
                Object obj13 = map.get("statusCode");
                if (!(obj13 instanceof Integer)) {
                    obj13 = null;
                }
                Integer num4 = (Integer) obj13;
                if (num4 != null) {
                    i2 = num4.intValue();
                }
                dVar.f23454c = i2;
                cVar3.a(webView, dVar);
                obj = q.m223constructorimpl(z.f158842a);
            } catch (Throwable th2) {
                obj = q.m223constructorimpl(r.a(th2));
            }
            q.m222boximpl(obj);
        }
        return null;
    }

    private static void a(com.bytedance.ies.xbridge.model.b.c cVar, JSONObject jSONObject, k kVar, IReportADLogResultCallback iReportADLogResultCallback) {
        boolean z;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        try {
            String optString = jSONObject.optString("tag");
            String optString2 = jSONObject.optString("label");
            JSONObject optJSONObject = jSONObject.optJSONObject("extParams");
            if (optJSONObject != null) {
                z = optJSONObject.optBoolean("has_ad_info", false);
            } else {
                z = false;
            }
            com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(cVar, com.bytedance.ies.bullet.c.c.i.class);
            com.ss.android.ugc.aweme.bullet.ab.c.f68845b = false;
            com.ss.android.ugc.aweme.bullet.ab.c.a("");
            String optString3 = jSONObject.optString("creative_id");
            if (optString3 == null) {
                optString3 = "0";
            }
            com.ss.android.ugc.aweme.bullet.ab.c.b(optString3);
            jSONObject.optString("creative_id");
            l.d("ad_lynx_download_sendAdLog", "");
            if (z) {
                String optString4 = jSONObject.optString("creative_id");
                String optString5 = jSONObject.optString("log_extra");
                String optString6 = jSONObject.optString("group_id");
                if (TextUtils.isEmpty(optString4)) {
                    jSONObject.optString("creative_id");
                    l.d("ad_lynx_download_sendAdLog", "");
                    iReportADLogResultCallback.onFailure(0, "empty creativeId");
                    return;
                }
                f.b a2 = f.a();
                a2.f74804a = optString;
                a2.f74805b = optString2;
                a2.f74806c = optString4;
                f.b e2 = a2.e(optString5);
                e2.f74807d = optString6;
                e2.b(optJSONObject).a((Context) com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(cVar, Context.class));
                l.b(optString, "");
                l.b(optString2, "");
                l.b(optString4, "");
                a.C0791a a3 = com.bytedance.ies.ugc.aweme.rich.a.a.a(optString, optString2, optString4, optString5, optString6);
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    l.b(keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a3.b(next, optJSONObject.opt(next));
                    }
                }
                a3.c();
                jSONObject.optString("creative_id");
                l.d("ad_lynx_download_sendAdLog", "");
                iReportADLogResultCallback.onSuccess(new com.bytedance.ies.xbridge.model.c.b(), "");
                return;
            }
            l.b(optString, "");
            if (optString.length() > 0) {
                l.b(optString2, "");
                if (optString2.length() > 0 && kVar != null) {
                    f.b a4 = f.a();
                    a4.f74804a = optString;
                    a4.f74805b = optString2;
                    a4.a(Long.valueOf(kVar.f75781a)).e(kVar.f75782b).b(Long.valueOf(kVar.f75783c)).b(optJSONObject).a((Context) com.ss.android.ugc.aweme.i18n.xbridge.d.d.a(cVar, Context.class));
                    a.C0791a a5 = com.bytedance.ies.ugc.aweme.rich.a.a.a(optString, optString2, String.valueOf(kVar.f75781a), kVar.f75782b, String.valueOf(kVar.f75783c));
                    if (optJSONObject != null) {
                        Iterator<String> keys2 = optJSONObject.keys();
                        l.b(keys2, "");
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            a5.b(next2, optJSONObject.opt(next2));
                        }
                    }
                    a5.c();
                    if (l.a((Object) optString, (Object) "draw_ad") && l.a((Object) optString2, (Object) "click") && (aweme = kVar.f75793m) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                        aj.a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new b(kVar));
                    }
                    jSONObject.optString("creative_id");
                    l.d("ad_lynx_download_sendAdLog", "");
                    iReportADLogResultCallback.onSuccess(new com.bytedance.ies.xbridge.model.c.b(), "");
                    return;
                }
            }
            jSONObject.optString("creative_id");
            l.d("ad_lynx_download_sendAdLog", "");
            iReportADLogResultCallback.onFailure(0, "empty_tag_or_label_or_adinfo");
        } catch (Exception e3) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e3);
            jSONObject.optString("creative_id");
            l.d("ad_lynx_download_sendAdLog", "");
            iReportADLogResultCallback.onFailure(0, "unknown error");
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final void handleReportADLog(com.bytedance.ies.xbridge.model.b.c cVar, String str, com.bytedance.ies.xbridge.base.runtime.a.f fVar, IReportADLogResultCallback iReportADLogResultCallback, com.bytedance.ies.xbridge.e eVar) {
        l.d(str, "");
        l.d(fVar, "");
        l.d(iReportADLogResultCallback, "");
        l.d(eVar, "");
        k a2 = au.a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", fVar.f35806a);
        jSONObject.put("tag", fVar.f35807b);
        String str2 = fVar.f35808c;
        if (str2 != null) {
            jSONObject.put("refer", str2);
        }
        String str3 = fVar.f35809d;
        if (str3 != null) {
            jSONObject.put("group_id", str3);
        }
        String str4 = fVar.f35810e;
        if (str4 != null) {
            jSONObject.put("creative_id", str4);
        }
        String str5 = fVar.f35811f;
        if (str5 != null) {
            jSONObject.put("log_extra", str5);
        }
        n nVar = fVar.f35812g;
        if (nVar != null) {
            jSONObject.put("extParams", com.bytedance.ies.xbridge.o.c.a(nVar));
        }
        a(cVar, jSONObject, a2, iReportADLogResultCallback);
        com.ss.android.ugc.d.a.c.a(new g(str, jSONObject));
    }
}
