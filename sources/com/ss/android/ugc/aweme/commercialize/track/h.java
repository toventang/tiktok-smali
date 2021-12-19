package com.ss.android.ugc.aweme.commercialize.track;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.a.a.d;
import com.bytedance.android.a.a.f;
import com.bytedance.android.a.a.f.a;
import com.bytedance.android.a.b.a;
import com.bytedance.android.a.b.b.a.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    static String f75372a;

    /* renamed from: b  reason: collision with root package name */
    public static final h f75373b = new h();

    public static final class b extends f {
        static {
            Covode.recordClassIndex(46514);
        }

        b() {
        }

        @Override // com.bytedance.android.a.a.f
        public final String a() {
            return RawURLGetter.c();
        }
    }

    public static final class c extends com.bytedance.android.a.b.a.a {
        static {
            Covode.recordClassIndex(46515);
        }

        c() {
        }
    }

    private h() {
    }

    static {
        Covode.recordClassIndex(46512);
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.a.a.d $trackerSDK;

        static {
            Covode.recordClassIndex(46517);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.bytedance.android.a.a.d dVar) {
            super(0);
            this.$trackerSDK = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (p.a(h.f75372a, a.f75356a.d(), false)) {
                this.$trackerSDK.a(h.b());
            }
            return z.f158842a;
        }
    }

    public static com.bytedance.android.a.a.f.a b() {
        JSONObject c2 = c();
        a.C0088a aVar = new a.C0088a();
        aVar.f6666b = false;
        aVar.f6667c = true;
        aVar.f6669e = c2;
        com.bytedance.android.a.a.f.a a2 = aVar.a();
        l.b(a2, "");
        return a2;
    }

    private static JSONObject c() {
        f75372a = a.f75356a.d();
        try {
            return new JSONObject(f75372a);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final com.bytedance.android.a.a.d a() {
        MethodCollector.i(1828);
        com.bytedance.android.a.a.e d2 = com.bytedance.android.a.a.e.d();
        l.b(d2, "");
        if (!d2.a()) {
            synchronized (getClass()) {
                try {
                    if (!d2.a()) {
                        d.a a2 = com.bytedance.android.a.a.d.a(com.bytedance.ies.ugc.appcontext.d.a());
                        a2.f6612a = b();
                        a2.f6613b = a.f75374a;
                        a2.f6614c = new b();
                        a.C0089a aVar = new a.C0089a();
                        aVar.f6684a = true;
                        aVar.f6685b = new c();
                        a.C0089a a3 = aVar.a(d.f75375a);
                        l.b(a3, "");
                        if (d.a()) {
                            a3 = a3.a(new i());
                            l.b(a3, "");
                        }
                        a2.a(a3.a()).a();
                        a.f75356a.a(false, (h.f.a.a<z>) new e(com.bytedance.android.a.a.e.d()));
                    }
                } finally {
                    MethodCollector.o(1828);
                }
            }
        }
        return d2;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements com.bytedance.android.a.b.b.a.e {

        /* renamed from: a  reason: collision with root package name */
        public static final d f75375a = new d();

        static {
            Covode.recordClassIndex(46516);
        }

        d() {
        }

        @Override // com.bytedance.android.a.b.b.a.e
        public final com.bytedance.android.a.b.b.c a(e.a aVar) {
            String str;
            String str2;
            l.d(aVar, "");
            com.bytedance.android.a.b.b.c a2 = aVar.a(aVar.a());
            if (a2 != null) {
                com.bytedance.android.a.b.b.b bVar = a2.f6708e;
                if (bVar != null) {
                    str = bVar.f6696b;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    com.bytedance.android.a.b.b.b bVar2 = a2.f6708e;
                    l.b(bVar2, "");
                    Uri parse = Uri.parse(bVar2.f6696b);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("track_url", parse.toString());
                        l.b(parse, "");
                        jSONObject.put("scheme", parse.getScheme());
                        jSONObject.put("host", parse.getHost());
                        jSONObject.put("path", parse.getPath());
                        jSONObject.put("ref", "track_sdk");
                        if (d.a()) {
                            str2 = "1";
                        } else {
                            str2 = "0";
                        }
                        jSONObject.put("use_ttnet", str2);
                    } catch (JSONException unused) {
                    }
                    Throwable th = a2.f6709f;
                    if (th != null) {
                        try {
                            jSONObject.put("error_message", th.getMessage());
                        } catch (JSONException unused2) {
                            Integer.valueOf(0);
                        }
                    }
                    try {
                        jSONObject.put("status_code", a2.f6704a);
                    } catch (JSONException unused3) {
                    }
                    IMonitorDepend iMonitorDepend = com.bytedance.ies.android.base.runtime.a.f31873b;
                    if (iMonitorDepend != null) {
                        iMonitorDepend.monitorStatusRate("aweme_third_party_track_url_succeed_rate", a2.a() ? 1 : 0, jSONObject);
                    }
                }
            }
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements com.bytedance.android.a.a.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75374a = new a();

        static {
            Covode.recordClassIndex(46513);
        }

        a() {
        }

        @Override // com.bytedance.android.a.a.a.a
        public final void a(String str, JSONObject jSONObject) {
            IAppLogDepend iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a;
            if (iAppLogDepend != null) {
                l.b(str, "");
                iAppLogDepend.onEventV3Json(str, jSONObject);
            }
        }
    }
}
