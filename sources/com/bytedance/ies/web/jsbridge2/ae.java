package com.bytedance.ies.web.jsbridge2;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.ies.web.jsbridge2.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ad> f35592a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    final n f35593b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<a> f35594c = new CopyOnWriteArraySet();

    /* renamed from: d  reason: collision with root package name */
    public final String f35595d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f35596e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f35597f = false;

    /* renamed from: g  reason: collision with root package name */
    private final Collection<String> f35598g;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f35599h = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(21271);
        }

        void b();
    }

    static {
        Covode.recordClassIndex(21267);
    }

    /* access modifiers changed from: package-private */
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("aid", this.f35593b.b());
            jSONObject2.put("app_version", this.f35593b.d());
            jSONObject2.put("os", 0);
            jSONObject2.put("device_id", this.f35593b.e());
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("channel", "_jsb_auth");
            jSONObject3.put("local_version", 0);
            jSONArray.put(jSONObject3);
            for (String str : this.f35598g) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("channel", "_jsb_auth.".concat(String.valueOf(str)));
                jSONObject4.put("local_version", 0);
                jSONArray.put(jSONObject4);
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(this.f35593b.f(), jSONArray);
            jSONObject.put("common", jSONObject2);
            jSONObject.put("deployment", jSONObject5);
        } catch (JSONException e2) {
            k.b(e2);
            new TimeLineEvent.a().a(TimeLineEvent.b.G, e2.getClass().getSimpleName()).a(TimeLineEvent.b.H, e2.getMessage()).a(TimeLineEvent.b.f35548b, jSONObject.toString()).a(TimeLineEvent.b.ab, x.f35708g);
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        this.f35594c.remove(aVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(x.b bVar) {
        this.f35596e.execute(new af(this, bVar));
    }

    ae(n nVar) {
        this.f35593b = nVar;
        String j2 = nVar.j();
        if (TextUtils.isEmpty(j2)) {
            this.f35595d = nVar.a().url;
        } else {
            this.f35595d = j2;
        }
        this.f35596e = nVar.i();
        this.f35598g = new LinkedList(nVar.g());
    }

    public final ad a(String str, List<TimeLineEvent> list) {
        if (this.f35598g.contains(str) || TextUtils.equals(str, "host")) {
            return a(str, (JSONObject) null, list);
        }
        new TimeLineEvent.a().a(TimeLineEvent.b.n, str).a(TimeLineEvent.b.o, str).a(TimeLineEvent.b.al, list);
        throw new IllegalArgumentException("Namespace: " + str + " not registered.");
    }

    private ad a(String str, JSONObject jSONObject, List<TimeLineEvent> list) {
        ad adVar = this.f35592a.get(str);
        TimeLineEvent.a a2 = new TimeLineEvent.a().a(TimeLineEvent.b.n, str);
        if (adVar == null) {
            ad adVar2 = new ad(str, this.f35593b.h(), this.f35593b.i(), jSONObject, list);
            this.f35592a.put(str, adVar2);
            a2.a(TimeLineEvent.b.ah, list);
            return adVar2;
        } else if (jSONObject == null) {
            return adVar;
        } else {
            adVar.a(jSONObject, list);
            a2.a(TimeLineEvent.b.ai, list);
            return adVar;
        }
    }

    public static void a(String str, String str2, String str3) {
        TimeLineEvent.a a2 = new TimeLineEvent.a().a().a(TimeLineEvent.b.f35553g, str2);
        a2.f35540a = TimeLineEvent.b.ac;
        if (!TextUtils.isEmpty(str3)) {
            a2.a(TimeLineEvent.b.f35547a, str3);
        }
        if (TextUtils.isEmpty(str)) {
            a2.a(TimeLineEvent.b.f35549c, TimeLineEvent.b.f35554h);
            x.f35708g.add(a2.b());
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
            if (optJSONObject == null) {
                a2.a(TimeLineEvent.b.f35549c, str);
                x.f35708g.add(a2.b());
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("packages");
            if (optJSONObject2 == null) {
                a2.a(TimeLineEvent.b.f35549c, str);
                x.f35708g.add(a2.b());
                return;
            }
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = optJSONObject2.getJSONArray(next);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
                    String string = jSONObject.getString("channel");
                    a2.a(next + "_" + string, Long.valueOf(jSONObject.getLong("package_version")));
                }
            }
            x.f35708g.add(a2.b());
        } catch (JSONException e2) {
            a2.a(TimeLineEvent.b.f35549c, str).a(TimeLineEvent.b.G, e2.getClass().getSimpleName()).a(TimeLineEvent.b.H, e2.getMessage());
            x.f35708g.add(a2.b());
        }
    }

    public final void a(boolean z, String str, final x.b bVar) {
        if (!TextUtils.isEmpty(str)) {
            if (!z) {
                this.f35593b.h().a("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", new ag(this, str));
            }
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONObject("data").getJSONObject("packages").getJSONArray(this.f35593b.f());
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String optString = jSONObject.optString("channel");
                    if (TextUtils.equals(optString, "_jsb_auth")) {
                        a("host", jSONObject, x.f35708g);
                    } else if (optString.startsWith("_jsb_auth.")) {
                        a(optString.replace("_jsb_auth.", ""), jSONObject, x.f35708g);
                    }
                }
                new TimeLineEvent.a().a(TimeLineEvent.b.f35552f, this.f35593b.f()).a(TimeLineEvent.b.af, x.f35708g);
            } catch (JSONException e2) {
                k.b(e2);
                TimeLineEvent.a a2 = new TimeLineEvent.a().a(TimeLineEvent.b.G, e2.getClass().getSimpleName()).a(TimeLineEvent.b.H, e2.getMessage());
                String str2 = TimeLineEvent.b.f35549c;
                if (TextUtils.isEmpty(str)) {
                    str = TimeLineEvent.b.f35554h;
                }
                a2.a(str2, str).a(TimeLineEvent.b.ag, x.f35708g);
            }
            this.f35597f = true;
            new TimeLineEvent.a().a(TimeLineEvent.b.f35558l, TimeLineEvent.b.f35556j).a(TimeLineEvent.b.aI, x.f35708g);
            this.f35599h.post(new Runnable() {
                /* class com.bytedance.ies.web.jsbridge2.ae.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(21270);
                }

                public final void run() {
                    x.b bVar = bVar;
                    if (bVar != null) {
                        bVar.a();
                    }
                    for (a aVar : ae.this.f35594c) {
                        aVar.b();
                    }
                }
            });
        }
    }
}
