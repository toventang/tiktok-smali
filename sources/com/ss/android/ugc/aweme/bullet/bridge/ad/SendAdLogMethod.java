package com.ss.android.ugc.aweme.bullet.bridge.ad;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.ab.c;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.commercialize.event.g;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.utils.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONObject;

public final class SendAdLogMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68922b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68923c = "sendAdLog";

    static {
        Covode.recordClassIndex(42475);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42476);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68923c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendAdLogMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    static final class b extends h.f.b.m implements h.f.a.m<f.b, Boolean, f.b> {
        final /* synthetic */ k $adInfo$inlined;

        static {
            Covode.recordClassIndex(42477);
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

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("func");
        k a2 = com.ss.android.ugc.aweme.commercialize.utils.au.a();
        try {
            String optString2 = jSONObject.optString("tag");
            String optString3 = jSONObject.optString("label");
            JSONObject optJSONObject = jSONObject.optJSONObject("extParam");
            boolean optBoolean = jSONObject.optBoolean("has_ad_info", false);
            g();
            c.f68845b = false;
            c.a("");
            String optString4 = jSONObject.optString("creative_id");
            if (optString4 == null) {
                optString4 = "0";
            }
            c.b(optString4);
            jSONObject.optString("creative_id");
            l.d("ad_lynx_download_sendAdLog", "");
            if (optBoolean) {
                String optString5 = jSONObject.optString("creative_id");
                String optString6 = jSONObject.optString("log_extra");
                String optString7 = jSONObject.optString("group_id");
                if (TextUtils.isEmpty(optString5)) {
                    jSONObject.optString("creative_id");
                    l.d("ad_lynx_download_sendAdLog", "");
                    if (aVar != null) {
                        aVar.a(-1, "empty creativeId");
                    }
                } else {
                    f.b a3 = f.a();
                    a3.f74804a = optString2;
                    a3.f74805b = optString3;
                    a3.f74806c = optString5;
                    f.b e2 = a3.e(optString6);
                    e2.f74807d = optString7;
                    e2.b(optJSONObject).a(e());
                    l.b(optString2, "");
                    l.b(optString3, "");
                    l.b(optString5, "");
                    a.C0791a a4 = com.bytedance.ies.ugc.aweme.rich.a.a.a(optString2, optString3, optString5, optString6, optString7);
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        l.b(keys, "");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            a4.b(next, optJSONObject.opt(next));
                        }
                    }
                    a4.c();
                    jSONObject.optString("creative_id");
                    l.d("ad_lynx_download_sendAdLog", "");
                    if (aVar != null) {
                        aVar.a((Object) null);
                    }
                }
            } else {
                l.b(optString2, "");
                if (optString2.length() > 0) {
                    l.b(optString3, "");
                    if (optString3.length() > 0 && a2 != null) {
                        f.b a5 = f.a();
                        a5.f74804a = optString2;
                        a5.f74805b = optString3;
                        a5.a(Long.valueOf(a2.f75781a)).e(a2.f75782b).b(Long.valueOf(a2.f75783c)).b(optJSONObject).a(e());
                        a.C0791a a6 = com.bytedance.ies.ugc.aweme.rich.a.a.a(optString2, optString3, String.valueOf(a2.f75781a), a2.f75782b, String.valueOf(a2.f75783c));
                        if (optJSONObject != null) {
                            Iterator<String> keys2 = optJSONObject.keys();
                            l.b(keys2, "");
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                a6.b(next2, optJSONObject.opt(next2));
                            }
                        }
                        a6.c();
                        if (l.a((Object) optString2, (Object) "draw_ad") && l.a((Object) optString3, (Object) "click") && (aweme = a2.f75793m) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                            aj.a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new b(a2));
                        }
                        jSONObject.optString("creative_id");
                        l.d("ad_lynx_download_sendAdLog", "");
                        if (aVar != null) {
                            aVar.a((Object) null);
                        }
                    }
                }
                jSONObject.optString("creative_id");
                l.d("ad_lynx_download_sendAdLog", "");
                if (aVar != null) {
                    aVar.a(-1, "empty tag or label");
                }
            }
        } catch (Exception e3) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e3);
            jSONObject.optString("creative_id");
            l.d("ad_lynx_download_sendAdLog", "");
            if (aVar != null) {
                aVar.a(-1, "unknown error");
            }
        }
        l.b(optString, "");
        com.ss.android.ugc.d.a.c.a(new g(optString, jSONObject));
    }
}
