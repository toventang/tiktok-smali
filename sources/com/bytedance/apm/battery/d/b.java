package com.bytedance.apm.battery.d;

import com.bytedance.apm.battery.c.a;
import com.bytedance.apm.c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;

public abstract class b implements g {

    /* renamed from: a  reason: collision with root package name */
    boolean f24523a = ActivityLifeObserver.getInstance().isForeground();

    /* renamed from: b  reason: collision with root package name */
    public boolean f24524b = c.b();

    /* renamed from: c  reason: collision with root package name */
    private String f24525c;

    static {
        Covode.recordClassIndex(14445);
    }

    @Override // com.bytedance.apm.battery.d.g
    public void b() {
        this.f24523a = false;
    }

    /* access modifiers changed from: protected */
    public abstract void b(boolean z);

    @Override // com.bytedance.apm.battery.d.g
    public void c() {
        this.f24523a = true;
    }

    @Override // com.bytedance.apm.battery.d.g
    public final void m_() {
        a(this.f24523a);
    }

    /* access modifiers changed from: package-private */
    public final void a(final boolean z) {
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.apm.battery.d.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14446);
            }

            public final void run() {
                b.this.b(z);
            }
        });
    }

    b(String str) {
        this.f24525c = str;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z, long j2) {
        a.C0525a.f24485a.a(new com.bytedance.apm.e.a(z, System.currentTimeMillis(), this.f24525c, j2));
    }
}
