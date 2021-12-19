package com.bytedance.common.c;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static a f26746a = new b((byte) 0);

    public static class a {
        static {
            Covode.recordClassIndex(15774);
        }

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
            Covode.recordClassIndex(15775);
        }

        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.bytedance.common.c.c.a
        public final long a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    static {
        Covode.recordClassIndex(15773);
        int i2 = Build.VERSION.SDK_INT;
    }
}
