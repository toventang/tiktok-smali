package com.bytedance.apm.k;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.c.b.f;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.apm.api.d;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

public abstract class a implements b.AbstractC0531b, d, com.bytedance.services.slardar.config.a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f25056a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f25057b;

    /* renamed from: c  reason: collision with root package name */
    private long f25058c;
    public boolean n;
    public boolean o;
    protected String p;
    protected boolean q;

    static {
        Covode.recordClassIndex(14632);
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    @Override // com.bytedance.services.apm.api.d
    public final void a(Activity activity, Bundle bundle) {
    }

    public void a(JSONObject jSONObject) {
    }

    /* access modifiers changed from: protected */
    public abstract boolean b();

    /* access modifiers changed from: protected */
    public abstract long c();

    @Override // com.bytedance.services.apm.api.d
    public final void c(Activity activity) {
    }

    public void e() {
    }

    @Override // com.bytedance.services.apm.api.d
    public final void l_() {
    }

    @Override // com.bytedance.services.slardar.config.a
    public void d() {
        this.n = true;
        f();
    }

    private final void f() {
        if (!this.f25057b) {
            this.f25057b = true;
            if (b()) {
                b.a.f25210a.a(this);
            }
        }
        e();
        this.f25058c = System.currentTimeMillis();
    }

    public final void i() {
        if (this.f25057b) {
            this.f25057b = false;
            if (b()) {
                b.a.f25210a.b(this);
            }
        }
    }

    public final void h() {
        if (!this.f25056a) {
            if (!TextUtils.isEmpty(this.p)) {
                this.f25056a = true;
                ActivityLifeObserver.getInstance().register(this);
                this.o = !ActivityLifeObserver.getInstance().isForeground();
                a();
                ((IConfigManager) c.a(IConfigManager.class)).registerConfigListener(this);
                if (com.bytedance.apm.c.e()) {
                    String[] strArr = new String[1];
                    String str = "perf init: " + this.p;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must set collector Setting key, before init");
        }
    }

    @Override // com.bytedance.services.apm.api.d
    public void a(Activity activity) {
        this.o = true;
        if (com.bytedance.apm.c.f24694j) {
            i();
        }
    }

    @Override // com.bytedance.services.apm.api.d
    public void b(Activity activity) {
        this.o = false;
        if (com.bytedance.apm.c.f24694j && this.n) {
            f();
        }
    }

    protected static void a(f fVar) {
        b.a(fVar);
        b.a(fVar, fVar.e());
        com.bytedance.apm.c.a.a.b().a(fVar);
    }

    @Override // com.bytedance.apm.p.b.AbstractC0531b
    public final void a(long j2) {
        long c2 = c();
        if (c2 > 0 && j2 - this.f25058c > c2 && this.n) {
            e();
            this.f25058c = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.services.slardar.config.a
    public final void a(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject(this.p)) != null) {
            boolean z2 = false;
            if (optJSONObject.optInt("enable_upload", 0) == 1) {
                z2 = true;
            }
            this.q = z2;
            a(optJSONObject);
        }
    }
}
