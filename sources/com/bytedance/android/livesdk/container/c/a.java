package com.bytedance.android.livesdk.container.c;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.bytedance.android.live.core.f.j;
import com.bytedance.android.livesdk.browser.jsbridge.c;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxDelayDestroyJSB;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public c f16750a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f16751b;

    /* renamed from: c  reason: collision with root package name */
    public final HybridConfig f16752c;

    /* renamed from: d  reason: collision with root package name */
    public final String f16753d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.android.livesdk.container.h.a f16754e;

    static {
        Covode.recordClassIndex(9280);
    }

    public void a(int i2, int i3, Intent intent) {
        l.d(intent, "");
    }

    public abstract void a(c cVar);

    public abstract void a(String str);

    public abstract c b();

    public abstract void c();

    public abstract void d();

    public abstract View f();

    public boolean g() {
        return false;
    }

    public void h() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.container.c.a$a  reason: collision with other inner class name */
    public static final class RunnableC0335a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16755a;

        static {
            Covode.recordClassIndex(9281);
        }

        RunnableC0335a(a aVar) {
            this.f16755a = aVar;
        }

        public final void run() {
            c cVar = this.f16755a.f16750a;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    public void a() {
        c();
        d();
        c b2 = b();
        this.f16750a = b2;
        if (b2 != null) {
            a(b2);
        }
    }

    public void e() {
        if (LynxDelayDestroyJSB.INSTANCE.getValue()) {
            j.a(new RunnableC0335a(this));
            return;
        }
        c cVar = this.f16750a;
        if (cVar != null) {
            cVar.b();
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        c cVar = this.f16750a;
        if (cVar != null) {
            cVar.a(str, jSONObject);
        }
    }

    public a(Activity activity, HybridConfig hybridConfig, String str, com.bytedance.android.livesdk.container.h.a aVar) {
        l.d(activity, "");
        l.d(hybridConfig, "");
        l.d(str, "");
        this.f16751b = activity;
        this.f16752c = hybridConfig;
        this.f16753d = str;
        this.f16754e = aVar;
    }
}
