package com.bytedance.disk.c.a;

import com.bd.cu.fp.NativeUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public interface d {
    static {
        Covode.recordClassIndex(16776);
    }

    void a();

    byte[] a(byte[] bArr);

    public static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private long f28539a;

        static {
            Covode.recordClassIndex(16777);
        }

        private boolean b() {
            if (this.f28539a != 0) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.disk.c.a.d
        public final void a() {
            MethodCollector.i(3154);
            if (b()) {
                NativeUtils.release(this.f28539a);
            }
            MethodCollector.o(3154);
        }

        public a(String str) {
            MethodCollector.i(3152);
            this.f28539a = NativeUtils.nativeInit(str);
            MethodCollector.o(3152);
        }

        @Override // com.bytedance.disk.c.a.d
        public final byte[] a(byte[] bArr) {
            MethodCollector.i(3153);
            if (b()) {
                byte[] crypt = NativeUtils.crypt(this.f28539a, bArr);
                MethodCollector.o(3153);
                return crypt;
            }
            MethodCollector.o(3153);
            return null;
        }
    }
}
