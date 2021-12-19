package com.ss.android.ugc.aweme.f.a;

import android.os.Handler;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.nativecrash.g;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f90408a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static ArrayList<String> f90409b;

    /* renamed from: c  reason: collision with root package name */
    private static HashMap<String, ArrayList<b>> f90410c = new HashMap<>();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.f.a.a$a  reason: collision with other inner class name */
    static final class RunnableC2184a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final RunnableC2184a f90411a = new RunnableC2184a();

        static {
            Covode.recordClassIndex(56757);
        }

        RunnableC2184a() {
        }

        public final void run() {
            String str;
            long currentTimeMillis = (System.currentTimeMillis() / 1000) - 10800;
            long currentTimeMillis2 = System.currentTimeMillis() / 1000;
            com.ss.android.agilelogger.a aVar = ALog.sConfig;
            if (aVar != null) {
                str = aVar.f59087f;
            } else {
                str = null;
            }
            b.a(str, currentTimeMillis, currentTimeMillis2, "Network", AnonymousClass1.f90412a, null);
        }
    }

    static {
        List<String> list;
        Covode.recordClassIndex(56756);
        f90409b = new ArrayList<>();
        try {
            IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            list = iESSettingsProxy.getApiAlogWhiteList();
        } catch (Exception e2) {
            e2.printStackTrace();
            list = null;
        }
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            ArrayList<String> arrayList = f90409b;
            String[] stringArray = d.a().getResources().getStringArray(R.array.a5);
            l.b(stringArray, "");
            n.a((Collection) arrayList, (Object[]) stringArray);
            return;
        }
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
        f90409b = (ArrayList) list;
    }

    public static void a() {
        try {
            for (Map.Entry<String, ArrayList<b>> entry : f90410c.entrySet()) {
                ArrayList<b> value = entry.getValue();
                if (!com.bytedance.common.utility.collection.b.a((Collection) value)) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        ALog.d("Network", it.next().toString());
                    }
                }
            }
            f90410c.clear();
            new Handler().postDelayed(RunnableC2184a.f90411a, 60000);
            g.a(true);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", com.ss.android.ugc.aweme.u.a.a());
            b.a("rig_feedback", jSONObject, (JSONObject) null, (JSONObject) null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
