package android.ss.com.vboost;

import android.content.Context;
import android.ss.com.vboost.c.c;
import android.ss.com.vboost.d.f;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f375a = a.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static final e f376b = e.LEVEL_9;

    /* renamed from: c  reason: collision with root package name */
    private static final e f377c = e.LEVEL_9;

    /* renamed from: d  reason: collision with root package name */
    private static final e f378d = e.LEVEL_3;

    /* renamed from: e  reason: collision with root package name */
    private static final e f379e = e.LEVEL_3;

    /* renamed from: f  reason: collision with root package name */
    private static final e f380f = e.LEVEL_9;

    /* renamed from: g  reason: collision with root package name */
    private static final e f381g = e.LEVEL_9;

    /* renamed from: h  reason: collision with root package name */
    private static final e f382h = e.LEVEL_3;

    /* renamed from: i  reason: collision with root package name */
    private static final e f383i = e.LEVEL_3;

    /* renamed from: j  reason: collision with root package name */
    private static final e f384j = e.LEVEL_9;

    /* renamed from: k  reason: collision with root package name */
    private static final e f385k = e.LEVEL_9;

    /* renamed from: l  reason: collision with root package name */
    private static final e f386l = e.LEVEL_3;

    /* renamed from: m  reason: collision with root package name */
    private static final e f387m = e.LEVEL_3;
    private static final e n = e.LEVEL_9;
    private static final e o = e.LEVEL_9;
    private static final e p = e.LEVEL_3;
    private static final e q = e.LEVEL_3;
    private static final e r = e.LEVEL_9;
    private static final e s = e.LEVEL_9;
    private static final e t = e.LEVEL_3;
    private static final e u = e.LEVEL_3;
    private static volatile long v = 0;
    private static SparseArray<c> w = new SparseArray<>();

    static {
        Covode.recordClassIndex(7);
    }

    public static void a(HashSet<Integer> hashSet) {
        f fVar = f.a.f556a;
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            synchronized (fVar.f549h) {
                fVar.f549h.append(next.intValue(), true);
            }
        }
    }

    public static void a(Context context) {
        if (android.ss.com.vboost.e.a.a()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("registerApplication", 0);
                android.ss.com.vboost.e.a.a("vboost_event_launch", jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (f.f542j) {
            if (!f.f541i) {
                if (android.ss.com.vboost.e.a.a()) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("registerApplication", 1);
                        android.ss.com.vboost.e.a.a("vboost_event_launch", jSONObject2);
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
                c.f468a = context;
                c.a();
                f.f541i = true;
            } else if (android.ss.com.vboost.e.a.a()) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("registerApplication", -1);
                    android.ss.com.vboost.e.a.a("vboost_event_launch", jSONObject3);
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
        } else if (android.ss.com.vboost.e.a.a()) {
            try {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("registerApplication", -1);
                android.ss.com.vboost.e.a.a("vboost_event_launch", jSONObject4);
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        if (android.ss.com.vboost.e.a.a()) {
            try {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("registerApplication", 2);
                android.ss.com.vboost.e.a.a("vboost_event_launch", jSONObject5);
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
    }

    public static int a(d dVar, int i2) {
        c cVar = new c(CapabilityType.PRESET_SCENE, dVar);
        cVar.f459c = (long) i2;
        f.a.f556a.a(cVar);
        return 1;
    }

    public static int a(d dVar, f fVar) {
        if (fVar == f.END) {
            c cVar = w.get(dVar.getId());
            if (cVar == null) {
                dVar.getDesc();
                return 0;
            }
            cVar.f464h = true;
            f.a.f556a.a(cVar);
            w.remove(dVar.getId());
        } else {
            c cVar2 = new c(CapabilityType.PRESET_SCENE, dVar);
            cVar2.f464h = false;
            if (f.a.f556a.a(cVar2) != null) {
                w.put(dVar.getId(), cVar2);
            }
        }
        return 1;
    }
}
