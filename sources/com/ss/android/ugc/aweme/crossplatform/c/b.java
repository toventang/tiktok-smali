package com.ss.android.ugc.aweme.crossplatform.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.c.d;
import com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import h.a.am;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final h f78684a = i.a((h.f.a.a) c.f78693a);

    /* renamed from: b  reason: collision with root package name */
    public static final C1827b f78685b = new C1827b((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h f78686c = i.a((h.f.a.a) d.f78694a);

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap<String, a> f78687d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f78688e = am.b("rn_base_android", "fe_lynx_main_search_transfer");

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f78689a = 0;

        /* renamed from: b  reason: collision with root package name */
        public boolean f78690b = false;

        /* renamed from: c  reason: collision with root package name */
        public boolean f78691c = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f78692d = true;

        static {
            Covode.recordClassIndex(48854);
        }
    }

    public final long a() {
        return ((Number) this.f78686c.getValue()).longValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.b$b  reason: collision with other inner class name */
    public static final class C1827b {
        static {
            Covode.recordClassIndex(48855);
        }

        public static b a() {
            return (b) b.f78684a.getValue();
        }

        private C1827b() {
        }

        public /* synthetic */ C1827b(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f78693a = new c();

        static {
            Covode.recordClassIndex(48856);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    static final class d extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f78694a = new d();

        static {
            Covode.recordClassIndex(48857);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(com.ss.android.ugc.aweme.feed.a.f91454c);
        }
    }

    static {
        Covode.recordClassIndex(48853);
    }

    public final a a(String str) {
        a aVar = this.f78687d.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f78687d.put(str, aVar2);
        return aVar2;
    }

    public final boolean b(String str) {
        List<String> geckoChannelMonitorAllowList;
        d.a.a();
        HybridMonitorConfig a2 = d.a();
        if (a2 == null || (geckoChannelMonitorAllowList = a2.getGeckoChannelMonitorAllowList()) == null || geckoChannelMonitorAllowList.isEmpty()) {
            return this.f78688e.contains(str);
        }
        return geckoChannelMonitorAllowList.contains(str);
    }

    public final void a(String str, boolean z, Throwable th) {
        String message;
        if (b(str)) {
            a(str).f78690b = z;
            d a2 = d.a.a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gecko_channel", str);
            jSONObject.put("success", String.valueOf(z));
            if (!(th == null || (message = th.getMessage()) == null)) {
                jSONObject.put("exception_msg", message);
            }
            JSONObject jSONObject2 = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject2.put("cold_start_to_download_end_interval", currentTimeMillis - a());
            Long valueOf = Long.valueOf(a(str).f78689a);
            if (valueOf.longValue() > 0 && valueOf != null) {
                jSONObject2.put("download_interval", currentTimeMillis - valueOf.longValue());
            }
            a2.a((d) "hybrid_monitor_gecko_event", "on_download", (String) jSONObject, jSONObject2);
        }
    }

    public final void b(String str, boolean z, Throwable th) {
        String message;
        if (b(str)) {
            d a2 = d.a.a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gecko_channel", str);
            jSONObject.put("success", String.valueOf(z));
            if (!(th == null || (message = th.getMessage()) == null)) {
                jSONObject.put("exception_msg", message);
            }
            JSONObject jSONObject2 = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject2.put("cold_start_to_activate_end_interval", currentTimeMillis - a());
            Long valueOf = Long.valueOf(a(str).f78689a);
            if (valueOf.longValue() > 0 && valueOf != null) {
                jSONObject2.put("activate_interval", currentTimeMillis - valueOf.longValue());
            }
            a2.a((d) "hybrid_monitor_gecko_event", "on_activate", (String) jSONObject, jSONObject2);
        }
    }
}
