package com.bytedance.crash.util;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    static final a f28012a = new b((byte) 0);

    /* access modifiers changed from: package-private */
    public static class a {
        static {
            Covode.recordClassIndex(16395);
        }

        /* access modifiers changed from: package-private */
        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return 0;
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    static class b extends a {
        static {
            Covode.recordClassIndex(16396);
        }

        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.bytedance.crash.util.p.a
        public final long a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    static {
        Covode.recordClassIndex(16394);
        int i2 = Build.VERSION.SDK_INT;
    }
}
