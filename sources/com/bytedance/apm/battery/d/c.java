package com.bytedance.apm.battery.d;

import com.bytedance.apm.battery.d.a.b;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class c<T extends b> implements g {

    /* renamed from: a  reason: collision with root package name */
    public String f24528a;

    /* renamed from: b  reason: collision with root package name */
    long f24529b;

    /* renamed from: c  reason: collision with root package name */
    boolean f24530c;

    /* renamed from: d  reason: collision with root package name */
    ConcurrentHashMap<Integer, T> f24531d = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(14447);
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t, long j2, long j3);

    @Override // com.bytedance.apm.battery.d.g
    public void b() {
        this.f24530c = false;
    }

    @Override // com.bytedance.apm.battery.d.g
    public void c() {
        this.f24530c = true;
    }

    @Override // com.bytedance.apm.battery.d.g
    public final void m_() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f24531d.size() != 0) {
            long j2 = this.f24529b;
            if (currentTimeMillis - j2 >= 600000) {
                a(j2, currentTimeMillis);
            }
        }
        this.f24529b = currentTimeMillis;
    }

    c(String str) {
        this.f24528a = str;
        this.f24530c = ActivityLifeObserver.getInstance().isForeground();
    }

    /* access modifiers changed from: protected */
    public void a(long j2, long j3) {
        Iterator<Map.Entry<Integer, T>> it = this.f24531d.entrySet().iterator();
        while (it.hasNext()) {
            T value = it.next().getValue();
            if (0 < value.f24518e && value.f24518e < value.f24517d) {
                it.remove();
            } else if (0 < value.f24518e && value.f24518e < j2) {
                it.remove();
            } else if (j3 >= value.f24517d) {
                a(value, j2, j3);
            }
        }
    }
}
