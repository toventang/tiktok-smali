package com.bytedance.lynx.hybrid.f;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.j.c;
import com.lynx.tasm.base.b;
import com.lynx.tasm.base.g;
import com.ss.android.agilelogger.ALog;
import h.f.b.l;

public final class a extends b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f40964b = "Lynx";

    /* renamed from: c  reason: collision with root package name */
    public static long f40965c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0995a f40966d = new C0995a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f40967a;

    @Override // com.lynx.tasm.base.b
    public final int a() {
        return 1;
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final void a(String str) {
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final int b() {
        return 8;
    }

    /* renamed from: com.bytedance.lynx.hybrid.f.a$a  reason: collision with other inner class name */
    public static final class C0995a {
        static {
            Covode.recordClassIndex(25101);
        }

        private C0995a() {
        }

        public /* synthetic */ C0995a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(25100);
    }

    public a() {
        try {
            f40965c = ALog.getALogSimpleWriteFuncAddr();
            this.f40967a = true;
        } catch (Throwable unused) {
            new AndroidRuntimeException("Just warning log, No ALog dependency found").printStackTrace();
        }
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final void a(String str, String str2) {
        c.a(str + "_" + str2, com.bytedance.lynx.hybrid.j.b.V, f40964b);
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final void b(String str, String str2) {
        c.a(str + "_" + str2, com.bytedance.lynx.hybrid.j.b.D, f40964b);
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final void c(String str, String str2) {
        c.a(str + "_" + str2, com.bytedance.lynx.hybrid.j.b.I, f40964b);
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final void d(String str, String str2) {
        c.a(str + "_" + str2, com.bytedance.lynx.hybrid.j.b.W, f40964b);
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final void e(String str, String str2) {
        c.a(str + "_" + str2, com.bytedance.lynx.hybrid.j.b.E, f40964b);
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final boolean a(g gVar, int i2) {
        l.c(gVar, "");
        if (gVar == g.JAVA && i2 >= this.f55763g) {
            return true;
        }
        if (gVar == g.Native && i2 == 8) {
            return true;
        }
        return false;
    }
}
