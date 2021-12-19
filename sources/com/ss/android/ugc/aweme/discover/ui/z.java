package com.ss.android.ugc.aweme.discover.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.google.gson.o;
import com.ss.android.ugc.aweme.discover.k.b;
import com.ss.android.ugc.aweme.discover.k.c;
import h.a.am;
import h.a.n;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.util.Collection;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f82787a = new z();

    /* renamed from: b  reason: collision with root package name */
    private static final h f82788b = i.a(m.NONE, a.f82791a);

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f82789c = am.b("disable_hot_spot", "show_sort_and_filter", "use_profile_collection_tab", "use_profile_collection_tab_new_syle");

    /* renamed from: d  reason: collision with root package name */
    private static JSONObject f82790d;

    private static Keva b() {
        return (Keva) f82788b.getValue();
    }

    private z() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f82791a = new a();

        static {
            Covode.recordClassIndex(51573);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoSync("repo_hybrid_abtests", 0);
        }
    }

    static {
        Covode.recordClassIndex(51572);
    }

    private static Set<String> c() {
        String[] strArr;
        String[] strArr2 = null;
        try {
            strArr = (String[]) SettingsManager.a().a("hybrid_get_ab_test", String[].class);
            try {
                c a2 = b.a();
                if (a2 != null) {
                    strArr2 = a2.f81403b;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            strArr = null;
        }
        if (strArr != null) {
            n.a((Collection) f82789c, (Object[]) strArr);
        }
        if (strArr2 != null) {
            n.a((Collection) f82789c, (Object[]) strArr2);
        }
        return f82789c;
    }

    public final synchronized JSONObject a() {
        MethodCollector.i(2398);
        JSONObject jSONObject = f82790d;
        if (jSONObject != null) {
            MethodCollector.o(2398);
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(b().getString("hybrid_abtest", ""));
            MethodCollector.o(2398);
            return jSONObject2;
        } catch (Exception e2) {
            e2.printStackTrace();
            JSONObject jSONObject3 = new JSONObject();
            MethodCollector.o(2398);
            return jSONObject3;
        }
    }

    public final synchronized void a(o oVar) {
        String lVar;
        MethodCollector.i(2397);
        l.d(oVar, "");
        JSONObject jSONObject = null;
        com.google.gson.l c2 = oVar.c("data");
        if (!(c2 == null || (lVar = c2.toString()) == null)) {
            jSONObject = new JSONObject(lVar);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            for (String str : c()) {
                Object opt = jSONObject.opt(str);
                if (opt != null) {
                    jSONObject2.put(str, opt);
                }
            }
        }
        f82790d = jSONObject2;
        b().storeString("hybrid_abtest", jSONObject2.toString());
        MethodCollector.o(2397);
    }

    public final void a(JSONObject jSONObject, h.f.a.b<? super String, h.z> bVar, h.f.a.b<? super Exception, h.z> bVar2) {
        JSONArray jSONArray;
        Object opt;
        l.d(bVar, "");
        l.d(bVar2, "");
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.optJSONArray("ab_test_names");
            } catch (Exception e2) {
                bVar2.invoke(e2);
                e2.printStackTrace();
                return;
            }
        } else {
            jSONArray = null;
        }
        JSONObject a2 = a();
        if (jSONArray == null) {
            String jSONObject2 = a2.toString();
            l.b(jSONObject2, "");
            bVar.invoke(jSONObject2);
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String optString = jSONArray.optString(i2);
            if (!(optString == null || (opt = a2.opt(optString)) == null)) {
                jSONObject3.put(optString, opt);
            }
        }
        String jSONObject4 = jSONObject3.toString();
        l.b(jSONObject4, "");
        bVar.invoke(jSONObject4);
    }
}
