package com.bytedance.push.frontier.b;

import android.content.Context;
import com.bytedance.common.wschannel.a;
import com.bytedance.common.wschannel.app.e;
import com.bytedance.common.wschannel.h;
import com.bytedance.common.wschannel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.c;
import com.bytedance.push.f;
import com.bytedance.push.frontier.a.b;
import com.bytedance.push.frontier.a.d;
import java.util.HashMap;

public class a implements b {

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f42142e;

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.push.frontier.setting.a f42143a;

    /* renamed from: b  reason: collision with root package name */
    public h f42144b;

    /* renamed from: c  reason: collision with root package name */
    public String f42145c;

    /* renamed from: d  reason: collision with root package name */
    private Context f42146d;

    static {
        Covode.recordClassIndex(25754);
    }

    @Override // com.bytedance.push.frontier.a.b
    public final void a() {
        h hVar = this.f42144b;
        if (hVar != null) {
            hVar.a();
        }
    }

    public final com.bytedance.common.wschannel.a a(com.bytedance.push.frontier.setting.a aVar) {
        if (aVar != null && aVar.b()) {
            this.f42143a = aVar;
            HashMap hashMap = new HashMap();
            com.ss.android.pushmanager.setting.b.b();
            com.ss.android.pushmanager.setting.a.a().a(hashMap);
            String str = (String) hashMap.get("install_id");
            String str2 = (String) hashMap.get("device_id");
            c h2 = f.f42099a.h();
            if (h2 == null) {
                return null;
            }
            try {
                a.C0580a a2 = a.C0580a.a(10006);
                a2.f27004c = aVar.f42156a;
                a2.f27008g = str2;
                a2.f27009h = str;
                a2.f27005d = aVar.f42157b;
                a2.f27007f = aVar.f42158c;
                a2.f27006e = 30203;
                return a2.a(aVar.f42159d).a("host_aid", String.valueOf(h2.f42058b)).a("host_version", String.valueOf(h2.f42059c)).a("sid", this.f42145c).a();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.bytedance.push.frontier.a.b
    public final synchronized void a(final e eVar) {
        MethodCollector.i(13958);
        com.bytedance.push.frontier.setting.a aVar = this.f42143a;
        if (aVar != null) {
            a(aVar, eVar);
            MethodCollector.o(13958);
            return;
        }
        com.bytedance.push.frontier.a.c b2 = com.bytedance.push.frontier.c.a().b();
        if (b2 == null) {
            MethodCollector.o(13958);
            return;
        }
        b2.a(this.f42146d, new d() {
            /* class com.bytedance.push.frontier.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25755);
            }

            @Override // com.bytedance.push.frontier.a.d
            public final void a(com.bytedance.push.frontier.setting.a aVar) {
                a.this.a(aVar, eVar);
            }
        });
        MethodCollector.o(13958);
    }

    private a(Context context, String str) {
        this.f42146d = context;
        this.f42145c = str;
    }

    public final void a(com.bytedance.push.frontier.setting.a aVar, e eVar) {
        com.bytedance.common.wschannel.a a2 = a(aVar);
        if (a2 != null) {
            h hVar = this.f42144b;
            if (hVar != null) {
                hVar.a(a2);
            } else {
                this.f42144b = k.a(this.f42146d, a2, eVar);
            }
        }
    }

    public static a a(Context context, String str) {
        MethodCollector.i(13907);
        if (f42142e == null) {
            synchronized (a.class) {
                try {
                    if (f42142e == null) {
                        f42142e = new a(context, str);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13907);
                    throw th;
                }
            }
        }
        a aVar = f42142e;
        MethodCollector.o(13907);
        return aVar;
    }
}
