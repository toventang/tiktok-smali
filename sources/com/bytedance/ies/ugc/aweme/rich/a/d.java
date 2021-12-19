package com.bytedance.ies.ugc.aweme.rich.a;

import android.content.Context;
import android.text.TextUtils;
import b.i;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.google.gson.f;
import com.google.gson.q;
import com.ss.android.ugc.aweme.lancet.j;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f35134a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(21055);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, Object> f35135a = new LinkedHashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, Object> f35136b = new LinkedHashMap();

        /* renamed from: c  reason: collision with root package name */
        public final String f35137c;

        /* renamed from: d  reason: collision with root package name */
        public final String f35138d;

        /* renamed from: e  reason: collision with root package name */
        public final String f35139e;

        /* renamed from: f  reason: collision with root package name */
        public final String f35140f;

        /* renamed from: g  reason: collision with root package name */
        public final String f35141g;

        static {
            Covode.recordClassIndex(21056);
        }

        private final boolean d() {
            if (TextUtils.isEmpty(this.f35137c) || TextUtils.isEmpty(this.f35138d) || TextUtils.isEmpty(this.f35139e)) {
                return false;
            }
            return true;
        }

        public final void b() {
            ExecutorService executorService;
            if (d()) {
                CallableC0793a aVar = new CallableC0793a(this);
                IAppLogDepend iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a;
                if (iAppLogDepend != null) {
                    executorService = iAppLogDepend.getLogThreadPool();
                } else {
                    executorService = null;
                }
                i.a(aVar, executorService);
            }
        }

        public final void c() {
            ExecutorService executorService;
            if (d()) {
                b bVar = new b(this);
                IAppLogDepend iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a;
                if (iAppLogDepend != null) {
                    executorService = iAppLogDepend.getLogThreadPool();
                } else {
                    executorService = null;
                }
                i.a(bVar, executorService);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b<V> implements Callable<z> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f35143a;

            static {
                Covode.recordClassIndex(21058);
            }

            b(a aVar) {
                this.f35143a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ z call() {
                IAppLogDepend iAppLogDepend;
                if (!TextUtils.equals(this.f35143a.f35138d, "click")) {
                    JSONObject a2 = this.f35143a.a();
                    a2.put("tag", this.f35143a.f35137c);
                    a2.put("value", this.f35143a.f35139e);
                    a2.put("group_id", this.f35143a.f35140f);
                    a2.put("category", "event_v3");
                    com.bytedance.ies.ugc.aweme.rich.a.a.a.f35121a.a(this.f35143a.f35137c, this.f35143a.f35138d, this.f35143a.f35139e, a2);
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
                                    iAppLogDepend2.onEventV3Json(this.f35143a.f35138d, a2);
                                }
                            }
                        } else if (a3.equals("v3") && (iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a) != null) {
                            iAppLogDepend.onEventV3Json(this.f35143a.f35138d, a2);
                        }
                    }
                }
                return z.f158842a;
            }
        }

        public final JSONObject a() {
            Context applicationContext;
            JSONObject jSONObject = new JSONObject();
            IHostContextDepend iHostContextDepend = com.bytedance.ies.android.base.runtime.a.f31874c;
            if (iHostContextDepend == null || (applicationContext = iHostContextDepend.getApplicationContext()) == null) {
                return jSONObject;
            }
            jSONObject.put("log_extra", this.f35141g);
            jSONObject.put("is_ad_event", "1");
            if (TextUtils.isEmpty(j.f107222a) || !j.b() || j.c()) {
                j.f107222a = l.f(applicationContext);
            }
            String str = j.f107222a;
            jSONObject.put("nt", str);
            for (Map.Entry<String, Object> entry : this.f35135a.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            if (TextUtils.equals(this.f35138d, "click")) {
                jSONObject.put("has_v3", "1");
            }
            Map<String, Object> map = this.f35136b;
            if (map != null && !map.isEmpty()) {
                jSONObject.put("ad_extra_data", new f().b(this.f35136b));
            }
            new StringBuilder("tag = ").append(this.f35137c).append(" label = ").append(this.f35138d).append(" + creativeId = ").append(this.f35139e).append(" groupId = ").append(this.f35140f).append(' ').append("logExtra = ").append(this.f35141g).append(" adExtraData = ").append(this.f35136b).append(" params = ").append(new f().b(this.f35135a)).append(" nt = ").append(str);
            return jSONObject;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.ugc.aweme.rich.a.d$a$a  reason: collision with other inner class name */
        public static final class CallableC0793a<V> implements Callable<z> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f35142a;

            static {
                Covode.recordClassIndex(21057);
            }

            CallableC0793a(a aVar) {
                this.f35142a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ z call() {
                Context context;
                IAppLogDepend iAppLogDepend;
                IHostContextDepend iHostContextDepend = com.bytedance.ies.android.base.runtime.a.f31874c;
                if (iHostContextDepend != null) {
                    context = iHostContextDepend.getApplicationContext();
                } else {
                    context = null;
                }
                if (context != null) {
                    JSONObject a2 = this.f35142a.a();
                    com.bytedance.ies.ugc.aweme.rich.a.a.a.f35121a.a(this.f35142a.f35137c, this.f35142a.f35138d, this.f35142a.f35139e, a2);
                    long j2 = 0;
                    try {
                        if (this.f35142a.f35140f != null) {
                            j2 = Long.parseLong(this.f35142a.f35140f);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (TextUtils.equals(this.f35142a.f35138d, "click")) {
                        a aVar = this.f35142a;
                        JSONObject a3 = aVar.a();
                        a3.remove("has_v3");
                        a3.put("tag", aVar.f35137c);
                        a3.put("value", aVar.f35139e);
                        a3.put("group_id", aVar.f35140f);
                        a3.put("category", "event_v3");
                        IAppLogDepend iAppLogDepend2 = com.bytedance.ies.android.base.runtime.a.f31872a;
                        if (iAppLogDepend2 != null) {
                            iAppLogDepend2.onEventV3Json("realtime_click", a3);
                        }
                        String str = aVar.f35141g;
                        JSONObject jSONObject = new JSONObject();
                        if (str != null) {
                            com.google.gson.l a4 = q.a(str);
                            h.f.b.l.a((Object) a4, "");
                            com.google.gson.l c2 = a4.j().c("rit");
                            if (c2 != null) {
                                jSONObject.put("ctr_rit", c2.c());
                            }
                        }
                        jSONObject.put("service", "ctr_click");
                        IMonitorDepend iMonitorDepend = com.bytedance.ies.android.base.runtime.a.f31873b;
                        if (iMonitorDepend != null) {
                            iMonitorDepend.monitorCommonLog("ctr_monitor", jSONObject);
                        }
                        IAppLogDepend iAppLogDepend3 = com.bytedance.ies.android.base.runtime.a.f31872a;
                        if (iAppLogDepend3 != null) {
                            iAppLogDepend3.onEventV1(context, this.f35142a.f35137c, "event_v1", this.f35142a.f35138d, this.f35142a.f35139e, j2, a2);
                        }
                    } else {
                        String a5 = com.bytedance.ies.abmock.b.a().a(true, "enable_send_staging_adlog", "v3");
                        if (a5 != null) {
                            int hashCode = a5.hashCode();
                            if (hashCode != 3707) {
                                if (hashCode != 3709) {
                                    if (hashCode == 96673 && a5.equals("all")) {
                                        a2.put("_ad_staging_flag", "1");
                                        IAppLogDepend iAppLogDepend4 = com.bytedance.ies.android.base.runtime.a.f31872a;
                                        if (iAppLogDepend4 != null) {
                                            iAppLogDepend4.onEventV1(context, this.f35142a.f35137c, "event_v1", this.f35142a.f35138d, this.f35142a.f35139e, j2, a2);
                                        }
                                        a2.put("_ad_staging_flag", "3");
                                        a2.put("tag", this.f35142a.f35137c);
                                        a2.put("value", this.f35142a.f35139e);
                                        a2.put("group_id", this.f35142a.f35140f);
                                        a2.put("category", "event_v3");
                                        IAppLogDepend iAppLogDepend5 = com.bytedance.ies.android.base.runtime.a.f31872a;
                                        if (iAppLogDepend5 != null) {
                                            iAppLogDepend5.onEventV3Json(this.f35142a.f35138d, a2);
                                        }
                                    }
                                } else if (a5.equals("v3")) {
                                    a2.put("tag", this.f35142a.f35137c);
                                    a2.put("value", this.f35142a.f35139e);
                                    a2.put("group_id", this.f35142a.f35140f);
                                    a2.put("category", "event_v3");
                                    IAppLogDepend iAppLogDepend6 = com.bytedance.ies.android.base.runtime.a.f31872a;
                                    if (iAppLogDepend6 != null) {
                                        iAppLogDepend6.onEventV3Json(this.f35142a.f35138d, a2);
                                    }
                                }
                            } else if (a5.equals("v1") && (iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a) != null) {
                                iAppLogDepend.onEventV1(context, this.f35142a.f35137c, "event_v1", this.f35142a.f35138d, this.f35142a.f35139e, j2, a2);
                            }
                        }
                    }
                }
                return z.f158842a;
            }
        }

        public final a a(Map<String, ? extends Object> map) {
            if (map == null || map.isEmpty()) {
                return this;
            }
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                this.f35136b.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final a b(Map<String, ? extends Object> map) {
            if (map == null || map.isEmpty()) {
                return this;
            }
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                this.f35135a.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final a a(String str, Object obj) {
            if (str.length() == 0 || ((CharSequence) obj).length() == 0) {
                return this;
            }
            this.f35135a.put(str, obj);
            return this;
        }

        public a(String str, String str2, String str3, String str4, String str5) {
            h.f.b.l.c(str, "");
            h.f.b.l.c(str2, "");
            h.f.b.l.c(str3, "");
            this.f35137c = str;
            this.f35138d = str2;
            this.f35139e = str3;
            this.f35140f = str4;
            this.f35141g = str5;
        }
    }

    public static final boolean b() {
        return TextUtils.equals(b.a().a(true, "enable_send_staging_adlog", "v3"), "v1");
    }

    public static final boolean a() {
        return TextUtils.equals(b.a().a(true, "enable_send_staging_adlog", "v3"), "all");
    }

    public static final a a(String str, String str2, String str3, String str4, String str5) {
        h.f.b.l.c(str, "");
        h.f.b.l.c(str2, "");
        h.f.b.l.c(str3, "");
        return new a(str, str2, str3, str5, str4);
    }
}
