package com.ss.android.ugc.awemepushlib.interaction;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.push.PushBody;
import com.bytedance.push.a;
import com.bytedance.push.b;
import com.bytedance.push.c;
import com.bytedance.push.c.h;
import com.bytedance.push.c.n;
import com.bytedance.push.c.p;
import com.ss.android.common.util.f;
import com.ss.android.newmedia.redbadge.g;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f145457a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f145458b;

    static {
        Covode.recordClassIndex(95113);
    }

    k(boolean z, Context context) {
        this.f145457a = z;
        this.f145458b = context;
    }

    public final void run() {
        Throwable th;
        boolean z = this.f145457a;
        Context context = this.f145458b;
        c.a("method_push_start_on_application");
        try {
            h hVar = b.f42047a;
            a aVar = new a();
            aVar.f42037a = d.n;
            aVar.f42042f = d.b();
            aVar.f42041e = d.s;
            aVar.f42040d = (int) d.d();
            aVar.f42038b = (int) d.h();
            aVar.f42039c = d.i();
            c.a aVar2 = new c.a((Application) d.a(), aVar);
            aVar2.f42071b = false;
            aVar2.f42080k = true;
            aVar2.v = true;
            aVar2.u = new h();
            aVar2.f42078i = u.f145468a;
            aVar2.f42072c = f.b(d.a());
            aVar2.f42073d = new c.b("push", "");
            aVar2.o = v.f145469a;
            aVar2.f42076g = new n() {
                /* class com.ss.android.ugc.awemepushlib.interaction.t.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(95123);
                }

                @Override // com.bytedance.push.c.n
                public final boolean a(Context context, int i2, PushBody pushBody) {
                    MessageShowHandler.a(context, 1, pushBody.a(), i2);
                    return true;
                }
            };
            aVar2.f42075f = new d();
            g gVar = new g();
            if (!aVar2.f42074e.contains(gVar)) {
                aVar2.f42074e.add(gVar);
            }
            aVar2.p = w.f145470a;
            a aVar3 = aVar2.r;
            if (aVar3 == null) {
                aVar2.a("appinfo is null");
            } else {
                if (aVar3.f42037a <= 0) {
                    aVar2.a(" aid {" + aVar3.f42037a + "} is invalid");
                }
                if (TextUtils.isEmpty(aVar3.f42042f)) {
                    aVar2.a("appName {" + aVar3.f42042f + "} is invalid");
                }
                if (TextUtils.isEmpty(aVar3.f42039c)) {
                    aVar2.a("versionName {" + aVar3.f42039c + "} is invalid");
                }
                if (aVar3.f42038b <= 0) {
                    aVar2.a("versionCode {" + aVar3.f42038b + "} is invalid");
                }
                if (aVar3.f42040d <= 0) {
                    aVar2.a("updateVersionCode {" + aVar3.f42040d + "} is invalid");
                }
                if (TextUtils.isEmpty(aVar3.f42041e)) {
                    aVar2.a("channel {" + aVar3.f42041e + "} is invalid");
                }
            }
            if (aVar2.f42075f == null) {
                aVar2.a("please implement the event callback");
            }
            if (aVar2.o == null) {
                aVar2.a("click event listener is null, you'll not receive the event when user click notifications.Please implement it.");
            }
            if (TextUtils.isEmpty(aVar2.f42072c)) {
                aVar2.f42072c = f.b(aVar2.f42070a);
            }
            if (aVar2.f42081l == null) {
                aVar2.f42081l = new com.bytedance.push.d();
            }
            if (aVar2.n == null) {
                aVar2.n = new com.bytedance.push.b.d();
            }
            if (aVar2.q == null) {
                aVar2.q = new p.a();
            }
            if (aVar2.u == null) {
                aVar2.u = new com.bytedance.push.j.a();
            }
            com.bytedance.push.notification.h hVar2 = new com.bytedance.push.notification.h(aVar2.f42076g, aVar2.n);
            try {
                hVar.a(new c(aVar2.f42070a, aVar2.r, aVar2.f42071b, aVar2.f42072c, aVar2.f42073d, aVar2.f42074e, aVar2.f42075f, hVar2, aVar2.f42077h, aVar2.f42078i, aVar2.f42079j, aVar2.f42081l, aVar2.f42082m, aVar2.o, aVar2.p, aVar2.q, aVar2.s, aVar2.t, aVar2.u, aVar2, (byte) 0));
                if (z) {
                    com.ss.android.pushmanager.b.b.a();
                    com.ss.android.pushmanager.setting.b.b().a(com.ss.android.ugc.awemepushlib.manager.a.a().a(context));
                    com.ss.android.ugc.awemepushlib.manager.a.a().e(context);
                    if (Build.VERSION.SDK_INT >= 24) {
                        try {
                            b.a(context).a();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("location", "constructInitPush");
                    jSONObject.put("errorDesc", th.getMessage());
                    o.a("aweme_nofatal_track", jSONObject);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                c.b("method_push_start_on_application");
            }
        } catch (Throwable th3) {
            th = th3;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("location", "constructInitPush");
            jSONObject2.put("errorDesc", th.getMessage());
            o.a("aweme_nofatal_track", jSONObject2);
            c.b("method_push_start_on_application");
        }
        c.b("method_push_start_on_application");
    }
}
