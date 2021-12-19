package com.bytedance.im.core.d;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.d.d;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public int f38023a;

    /* renamed from: b  reason: collision with root package name */
    public int f38024b;

    /* renamed from: c  reason: collision with root package name */
    public String f38025c;

    /* renamed from: d  reason: collision with root package name */
    public long f38026d;

    /* renamed from: e  reason: collision with root package name */
    public String f38027e;

    /* renamed from: f  reason: collision with root package name */
    public String f38028f;

    /* renamed from: g  reason: collision with root package name */
    public String f38029g;

    /* renamed from: h  reason: collision with root package name */
    public Throwable f38030h;

    static {
        Covode.recordClassIndex(22797);
    }

    private u() {
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public u f38031a;

        static {
            Covode.recordClassIndex(22798);
        }

        public final a a() {
            this.f38031a.f38023a = -10;
            return this;
        }

        private a() {
            this.f38031a = new u((byte) 0);
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final a a(int i2) {
            this.f38031a.f38024b = i2;
            return this;
        }

        public final a a(String str) {
            this.f38031a.f38025c = str;
            return this;
        }
    }

    public static a a() {
        return new a((byte) 0);
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("IMError{code=").append(this.f38023a).append(", status=").append(this.f38024b).append(", statusMsg=").append(this.f38025c).append(", check").append(this.f38026d).append(", checkMsg=$").append(this.f38027e).append(", logId=").append(this.f38028f).append(", ext=").append(this.f38029g).append(", throwable=");
        Throwable th = this.f38030h;
        if (th != null) {
            str = Log.getStackTraceString(th);
        } else {
            str = null;
        }
        return append.append(str).append("}").toString();
    }

    /* synthetic */ u(byte b2) {
        this();
    }

    public static u a(d dVar) {
        u uVar = new u();
        uVar.f38023a = dVar.a();
        uVar.f38024b = dVar.b();
        uVar.f38025c = dVar.c();
        uVar.f38026d = dVar.d();
        uVar.f38027e = dVar.e();
        uVar.f38028f = dVar.f();
        uVar.f38029g = dVar.g();
        return uVar;
    }
}
