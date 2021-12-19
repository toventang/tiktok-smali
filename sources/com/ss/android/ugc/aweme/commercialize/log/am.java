package com.ss.android.ugc.aweme.commercialize.log;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.a.a.d;
import com.bytedance.android.a.a.f;
import com.bytedance.android.a.a.f.a;
import com.bytedance.android.a.b.a;
import com.bytedance.android.a.b.b.a.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize.track.i;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import h.f.b.l;
import h.m.p;
import org.json.JSONException;
import org.json.JSONObject;

public final class am {

    /* renamed from: a  reason: collision with root package name */
    static String f74744a;

    /* renamed from: b  reason: collision with root package name */
    public static final am f74745b = new am();

    public static final class b extends f {
        static {
            Covode.recordClassIndex(46098);
        }

        b() {
        }

        @Override // com.bytedance.android.a.a.f
        public final String a() {
            return RawURLGetter.a("other");
        }
    }

    public static final class c extends com.bytedance.android.a.b.a.a {
        static {
            Covode.recordClassIndex(46099);
        }

        c() {
        }
    }

    private am() {
    }

    static {
        Covode.recordClassIndex(46096);
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
        IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
        l.b(iESSettingsProxy, "");
        f74744a = iESSettingsProxy.getAdTrackerConfig();
        try {
            IESSettingsProxy iESSettingsProxy2 = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy2, "");
            return new JSONObject(iESSettingsProxy2.getAdTrackerConfig());
        } catch (JSONException unused) {
            return null;
        }
    }

    public final com.bytedance.android.a.a.d a() {
        MethodCollector.i(9150);
        com.bytedance.android.a.a.e d2 = com.bytedance.android.a.a.e.d();
        l.b(d2, "");
        if (!d2.a()) {
            synchronized (getClass()) {
                try {
                    if (!d2.a()) {
                        d.a a2 = com.bytedance.android.a.a.d.a(com.bytedance.ies.ugc.appcontext.d.a());
                        a2.f6612a = b();
                        a2.f6613b = a.f74746a;
                        a2.f6614c = new b();
                        a.C0089a aVar = new a.C0089a();
                        aVar.f6684a = true;
                        aVar.f6685b = new c();
                        a.C0089a a3 = aVar.a(d.f74747a);
                        l.b(a3, "");
                        if (com.ss.android.ugc.aweme.commercialize.track.d.a()) {
                            a3 = a3.a(new i());
                            l.b(a3, "");
                        }
                        a2.a(a3.a()).a();
                        SettingsManagerProxy.inst().registerSettingsWatcher(new e(com.bytedance.android.a.a.e.d()), false);
                    }
                } finally {
                    MethodCollector.o(9150);
                }
            }
        }
        return d2;
    }

    /* access modifiers changed from: package-private */
    public static final class e implements com.ss.android.ugc.aweme.global.config.settings.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.a.a.d f74748a;

        static {
            Covode.recordClassIndex(46101);
        }

        e(com.bytedance.android.a.a.d dVar) {
            this.f74748a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.global.config.settings.a
        public final void a(IESSettingsProxy iESSettingsProxy) {
            l.d(iESSettingsProxy, "");
            String str = am.f74744a;
            IESSettingsProxy iESSettingsProxy2 = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy2, "");
            if (p.a(str, iESSettingsProxy2.getAdTrackerConfig(), false)) {
                this.f74748a.a(am.b());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements com.bytedance.android.a.b.b.a.e {

        /* renamed from: a  reason: collision with root package name */
        public static final d f74747a = new d();

        static {
            Covode.recordClassIndex(46100);
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
                        if (com.ss.android.ugc.aweme.commercialize.track.d.a()) {
                            str2 = "1";
                        } else {
                            str2 = "0";
                        }
                        jSONObject.put("use_ttnet", str2);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    Throwable th = a2.f6709f;
                    if (th != null) {
                        try {
                            jSONObject.put("error_message", th.getMessage());
                        } catch (JSONException e3) {
                            e3.printStackTrace();
                        }
                    }
                    try {
                        jSONObject.put("status_code", a2.f6704a);
                    } catch (JSONException e4) {
                        e4.printStackTrace();
                    }
                    com.bytedance.apm.b.a("aweme_third_party_track_url_succeed_rate", a2.a() ? 1 : 0, jSONObject);
                }
            }
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements com.bytedance.android.a.a.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f74746a = new a();

        static {
            Covode.recordClassIndex(46097);
        }

        a() {
        }

        @Override // com.bytedance.android.a.a.a.a
        public final void a(String str, JSONObject jSONObject) {
            r.a(str, jSONObject);
        }
    }
}
