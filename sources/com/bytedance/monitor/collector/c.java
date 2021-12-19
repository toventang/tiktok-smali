package com.bytedance.monitor.collector;

import android.util.Pair;
import com.bytedance.covode.number.Covode;

public final class c extends b {
    static {
        Covode.recordClassIndex(25397);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.monitor.collector.b
    public final void b(int i2) {
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.b
    public final Pair<String, ?> c() {
        String str;
        try {
            if (!k.f41545a) {
                return null;
            }
            String str2 = this.f41450a;
            if (!k.f41545a) {
                str = null;
            } else {
                str = MonitorJni.doDumpAtrace();
            }
            return new Pair<>(str2, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public c(int i2) {
        super(i2, "atrace_event");
    }

    public final void a(long j2) {
        try {
            if (k.f41545a) {
                MonitorJni.doEnableAtrace(this.f41452c, j2);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.b
    public final Pair<String, ?> a(long j2, long j3) {
        String str;
        try {
            if (!k.f41545a) {
                return null;
            }
            String str2 = this.f41450a;
            if (!k.f41545a) {
                str = null;
            } else {
                str = MonitorJni.doDumpAtraceRange(j2, j3);
            }
            return new Pair<>(str2, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
