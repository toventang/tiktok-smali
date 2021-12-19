package com.bytedance.android.live.core.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.t;
import java.util.Map;

public class c<K, V> implements a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private Map<K, V> f8900a;

    /* renamed from: b  reason: collision with root package name */
    private int f8901b;

    /* renamed from: c  reason: collision with root package name */
    private int f8902c;

    static {
        Covode.recordClassIndex(4546);
    }

    @Override // com.bytedance.android.live.core.a.a
    public final t<V> a(K k2) {
        return null;
    }

    public c() {
        this((byte) 0);
    }

    public final synchronized String toString() {
        String sb;
        MethodCollector.i(12325);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<K, V> entry : this.f8900a.entrySet()) {
            sb2.append((Object) entry.getKey()).append('=').append((Object) entry.getValue()).append(",");
        }
        sb2.append("maxMemory=").append(this.f8901b).append(",memorySize=").append(this.f8902c);
        sb = sb2.toString();
        MethodCollector.o(12325);
        return sb;
    }

    private c(byte b2) {
        try {
            this.f8900a = new d(8);
            this.f8901b = 8;
        } catch (OutOfMemoryError unused) {
            this.f8900a = new d(10);
            this.f8901b = 10;
        }
    }

    @Override // com.bytedance.android.live.core.a.a
    public final void b(K k2) {
        MethodCollector.i(12185);
        synchronized (this) {
            try {
                if (this.f8900a.remove(k2) != null) {
                    this.f8902c--;
                }
            } finally {
                MethodCollector.o(12185);
            }
        }
    }

    @Override // com.bytedance.android.live.core.a.a
    public final V c(K k2) {
        MethodCollector.i(12025);
        synchronized (this) {
            try {
                V v = this.f8900a.get(k2);
                if (v != null) {
                    return v;
                }
                MethodCollector.o(12025);
                return null;
            } finally {
                MethodCollector.o(12025);
            }
        }
    }

    @Override // com.bytedance.android.live.core.a.a
    public final void a(K k2, V v) {
        MethodCollector.i(12184);
        synchronized (this) {
            try {
                V put = this.f8900a.put(k2, v);
                int i2 = this.f8902c + 1;
                this.f8902c = i2;
                if (put != null) {
                    this.f8902c = i2 - 1;
                }
                int i3 = this.f8901b;
                while (this.f8902c > i3 && !this.f8900a.isEmpty()) {
                    if (this.f8902c < 0 || (this.f8900a.isEmpty() && this.f8902c != 0)) {
                        IllegalStateException illegalStateException = new IllegalStateException(c.class.getName() + ".getValueSize() is reporting inconsistent results");
                        MethodCollector.o(12184);
                        throw illegalStateException;
                    }
                    Map.Entry<K, V> next = this.f8900a.entrySet().iterator().next();
                    this.f8900a.remove(next.getKey());
                    int i4 = this.f8902c;
                    next.getValue();
                    this.f8902c = i4 - 1;
                }
            } finally {
                MethodCollector.o(12184);
            }
        }
    }
}
