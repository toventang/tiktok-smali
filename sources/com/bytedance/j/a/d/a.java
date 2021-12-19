package com.bytedance.j.a.d;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.p;
import com.bytedance.ies.bullet.service.base.an;
import com.bytedance.ies.bullet.service.base.o;
import com.lynx.tasm.base.b;
import com.lynx.tasm.base.g;
import com.ss.android.agilelogger.ALog;
import h.f.b.l;
import org.json.JSONObject;

public final class a extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final String f39005d = "Lynx";

    /* renamed from: e  reason: collision with root package name */
    public static long f39006e;

    /* renamed from: f  reason: collision with root package name */
    public static final C0926a f39007f = new C0926a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f39008a;

    /* renamed from: b  reason: collision with root package name */
    public final o f39009b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.ies.bullet.service.base.a.o f39010c;

    @Override // com.lynx.tasm.base.b
    public final int a() {
        return 1;
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final int b() {
        return 8;
    }

    /* renamed from: com.bytedance.j.a.d.a$a  reason: collision with other inner class name */
    public static final class C0926a {
        static {
            Covode.recordClassIndex(23879);
        }

        private C0926a() {
        }

        public /* synthetic */ C0926a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(23878);
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final void a(String str) {
        o oVar = this.f39009b;
        if (oVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", str);
            oVar.a(new an("LynxLog", jSONObject, null, 246));
        }
    }

    public a(com.bytedance.ies.bullet.service.base.a.o oVar) {
        l.c(oVar, "");
        this.f39010c = oVar;
        this.f39009b = (o) oVar.b_(o.class);
        try {
            f39006e = ALog.getALogSimpleWriteFuncAddr();
            this.f39008a = true;
        } catch (Throwable unused) {
            new AndroidRuntimeException("Just warning log, No ALog dependency found").printStackTrace();
        }
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final void a(String str, String str2) {
        this.f39010c.printLog(str + "_" + str2, p.V, f39005d);
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final void b(String str, String str2) {
        this.f39010c.printLog(str + "_" + str2, p.D, f39005d);
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final void c(String str, String str2) {
        this.f39010c.printLog(str + "_" + str2, p.I, f39005d);
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final void d(String str, String str2) {
        this.f39010c.printLog(str + "_" + str2, p.W, f39005d);
    }

    @Override // com.lynx.tasm.base.e, com.lynx.tasm.base.b
    public final void e(String str, String str2) {
        this.f39010c.printLog(str + "_" + str2, p.E, f39005d);
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
