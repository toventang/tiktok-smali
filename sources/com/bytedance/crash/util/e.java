package com.bytedance.crash.util;

import android.os.Build;
import android.os.Debug;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static final a f27991a = new b((byte) 0);

    /* access modifiers changed from: package-private */
    public static class a {
        static {
            Covode.recordClassIndex(16378);
        }

        /* access modifiers changed from: package-private */
        public int a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    static class b extends a {
        static {
            Covode.recordClassIndex(16379);
        }

        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.bytedance.crash.util.e.a
        public final int a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // com.bytedance.crash.util.e.a
        public final int b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // com.bytedance.crash.util.e.a
        public final int c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    static {
        Covode.recordClassIndex(16377);
        int i2 = Build.VERSION.SDK_INT;
    }
}
