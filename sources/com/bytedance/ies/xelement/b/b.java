package com.bytedance.ies.xelement.b;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.l.d;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.c;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36694b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private String f36695a;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<j> f36696c;

    /* renamed from: d  reason: collision with root package name */
    private final String f36697d;

    /* renamed from: e  reason: collision with root package name */
    private final int f36698e;

    static {
        Covode.recordClassIndex(22026);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22027);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void b(JSONObject jSONObject) {
        c cVar;
        l.c(jSONObject, "");
        j jVar = this.f36696c.get();
        if (jVar != null && (cVar = jVar.f55897e) != null) {
            com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(this.f36698e, "errorReport");
            cVar2.a("category", jSONObject.toString());
            cVar.a(cVar2);
        }
    }

    public final void a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        JSONObject jSONObject2 = null;
        try {
            String str = this.f36695a;
            if (str != null) {
                if (str.length() != 0) {
                    jSONObject2 = new JSONObject();
                    d.a(jSONObject2, "virtual_aid", this.f36695a);
                }
            }
            if (jSONObject2 != null) {
                jSONObject2.toString(4);
            }
            jSONObject.toString(4);
            HybridMonitor.getInstance().customReport("", "", this.f36697d, jSONObject, null, null, jSONObject2, true);
        } catch (Exception e2) {
            g.f36700a.c("AUDIO_MONITOR_TAG", e2.getMessage());
        }
    }

    protected static void a(JSONObject jSONObject, String str, String str2) {
        l.c(jSONObject, "");
        l.c(str, "");
        d.a(jSONObject, str, str2);
    }

    public b(String str, int i2, j jVar) {
        l.c(str, "");
        l.c(jVar, "");
        this.f36697d = str;
        this.f36698e = i2;
        this.f36696c = new WeakReference<>(jVar);
    }
}
