package com.bytedance.ies.ugc.aweme.rich.a;

import android.content.Context;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.f;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.commercialize.l.c;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.lancet.j;
import h.f.b.l;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f35120a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(21047);
    }

    private static C0791a a() {
        return new C0791a("", "", "", null, null);
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.rich.a.a$a  reason: collision with other inner class name */
    public static final class C0791a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, Object> f35123a = new LinkedHashMap();

        /* renamed from: b  reason: collision with root package name */
        public final String f35124b;

        /* renamed from: c  reason: collision with root package name */
        public final String f35125c;

        /* renamed from: d  reason: collision with root package name */
        public final String f35126d;

        /* renamed from: e  reason: collision with root package name */
        public final String f35127e;

        /* renamed from: f  reason: collision with root package name */
        public final String f35128f;

        /* renamed from: g  reason: collision with root package name */
        private final Map<String, Object> f35129g = new LinkedHashMap();

        static {
            Covode.recordClassIndex(21048);
        }

        private final boolean d() {
            if (TextUtils.isEmpty(this.f35124b) || TextUtils.isEmpty(this.f35125c) || TextUtils.isEmpty(this.f35126d)) {
                return false;
            }
            return true;
        }

        public final void c() {
            ExecutorService executorService;
            if (d()) {
                if (c.a()) {
                    d.a(this.f35124b, this.f35125c, this.f35126d, this.f35128f, this.f35127e).a(this.f35129g).b(this.f35123a).c();
                    return;
                }
                b bVar = new b(this);
                IAppLogDepend iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a;
                if (iAppLogDepend != null) {
                    executorService = iAppLogDepend.getLogThreadPool();
                } else {
                    executorService = null;
                }
                i.b(bVar, executorService);
            }
        }

        public final void b() {
            ExecutorService executorService;
            if (d()) {
                if (c.a()) {
                    d.a(this.f35124b, this.f35125c, this.f35126d, this.f35128f, this.f35127e).a(this.f35129g).b(this.f35123a).b();
                    return;
                }
                CallableC0792a aVar = new CallableC0792a(this);
                IAppLogDepend iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a;
                if (iAppLogDepend != null) {
                    executorService = iAppLogDepend.getLogThreadPool();
                } else {
                    executorService = null;
                }
                i.b(aVar, executorService);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.ugc.aweme.rich.a.a$a$b */
        public static final class b<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0791a f35131a;

            static {
                Covode.recordClassIndex(21050);
            }

            b(C0791a aVar) {
                this.f35131a = aVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                IAppLogDepend iAppLogDepend;
                if (!TextUtils.equals(this.f35131a.f35125c, "click")) {
                    JSONObject a2 = this.f35131a.a();
                    a2.put("tag", this.f35131a.f35124b);
                    a2.put("value", this.f35131a.f35126d);
                    a2.put("group_id", this.f35131a.f35127e);
                    a2.put("category", "event_v3");
                    com.bytedance.ies.ugc.aweme.rich.a.a.a.f35121a.a(this.f35131a.f35124b, this.f35131a.f35125c, this.f35131a.f35126d, a2);
                    String a3 = com.bytedance.ies.abmock.b.a().a(true, "enable_send_staging_adlog", "v3");
                    if (a3 != null) {
                        int hashCode = a3.hashCode();
                        if (hashCode == 3707) {
                            a3.equals("v1");
                        } else if (hashCode != 3709) {
                            if (hashCode == 96673 && a3.equals("all")) {
                                a2.put("_ad_staging_flag", "3");
                                IAppLogDepend iAppLogDepend2 = com.bytedance.ies.android.base.runtime.a.f31872a;
                                if (iAppLogDepend2 != null) {
                                    iAppLogDepend2.onEventV3Json(this.f35131a.f35125c, a2);
                                }
                            }
                        } else if (a3.equals("v3") && (iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a) != null) {
                            iAppLogDepend.onEventV3Json(this.f35131a.f35125c, a2);
                        }
                    }
                }
                return z.f158842a;
            }
        }

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            Context a2 = d.a();
            jSONObject.put("log_extra", this.f35128f);
            jSONObject.put("is_ad_event", "1");
            if (TextUtils.isEmpty(j.f107227f) || !j.b() || j.c()) {
                j.f107227f = NetworkUtils.getNetworkAccessType(a2);
            }
            String str = j.f107227f;
            jSONObject.put("nt", str);
            for (Map.Entry<String, Object> entry : this.f35123a.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            if (TextUtils.equals(this.f35125c, "click")) {
                jSONObject.put("has_v3", "1");
            }
            Map<String, Object> map = this.f35129g;
            if (map != null && !map.isEmpty()) {
                jSONObject.put("ad_extra_data", new f().b(this.f35129g));
            }
            new StringBuilder("tag = ").append(this.f35124b).append(" label = ").append(this.f35125c).append(" + creativeId = ").append(this.f35126d).append(" groupId = ").append(this.f35127e).append(' ').append("logExtra = ").append(this.f35128f).append(" adExtraData = ").append(this.f35129g).append(" params = ").append(new f().b(this.f35123a)).append(" nt = ").append(str);
            return jSONObject;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.ugc.aweme.rich.a.a$a$a  reason: collision with other inner class name */
        public static final class CallableC0792a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0791a f35130a;

            static {
                Covode.recordClassIndex(21049);
            }

            CallableC0792a(C0791a aVar) {
                this.f35130a = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:10:0x003e  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
            @Override // java.util.concurrent.Callable
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object call() {
                /*
                // Method dump skipped, instructions count: 314
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.rich.a.a.C0791a.CallableC0792a.call():java.lang.Object");
            }
        }

        public final C0791a a(Map<String, ? extends Object> map) {
            if (map == null || map.isEmpty()) {
                return this;
            }
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                this.f35129g.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final C0791a a(String str, Object obj) {
            if (!(str == null || str.length() == 0 || obj == null || ((obj instanceof String) && ((CharSequence) obj).length() == 0))) {
                this.f35129g.put(str, obj);
            }
            return this;
        }

        public final C0791a b(String str, Object obj) {
            if (!(str == null || str.length() == 0 || obj == null || ((obj instanceof String) && ((CharSequence) obj).length() == 0))) {
                this.f35123a.put(str, obj);
            }
            return this;
        }

        public C0791a(String str, String str2, String str3, String str4, String str5) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            this.f35124b = str;
            this.f35125c = str2;
            this.f35126d = str3;
            this.f35127e = str4;
            this.f35128f = str5;
        }
    }

    public static final C0791a a(String str, String str2, AwemeRawAd awemeRawAd) {
        String valueOf;
        l.d(str, "");
        l.d(str2, "");
        if (awemeRawAd == null) {
            return a();
        }
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            return a();
        }
        creativeId.longValue();
        if (awemeRawAd.getGroupId() == null) {
            valueOf = "0";
        } else {
            valueOf = String.valueOf(awemeRawAd.getGroupId().longValue());
        }
        return b.a(awemeRawAd, a(str, str2, String.valueOf(awemeRawAd.getCreativeId().longValue()), awemeRawAd.getLogExtra(), valueOf));
    }

    public static final C0791a a(String str, String str2, String str3, String str4, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new C0791a(str, str2, str3, str5, str4);
    }
}
