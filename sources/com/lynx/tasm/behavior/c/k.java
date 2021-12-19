package com.lynx.tasm.behavior.c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.q;

public abstract class k {

    /* renamed from: b  reason: collision with root package name */
    public final a f55846b;

    static {
        Covode.recordClassIndex(34917);
    }

    public abstract void a(k kVar);

    /* access modifiers changed from: protected */
    public abstract void a(q qVar);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f55847a;

        /* renamed from: b  reason: collision with root package name */
        private final int f55848b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f55849c;

        static {
            Covode.recordClassIndex(34918);
        }

        public int hashCode() {
            return (this.f55848b * 31) + this.f55847a;
        }

        public boolean equals(Object obj) {
            if (!this.f55849c) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f55847a == aVar.f55847a && this.f55848b == aVar.f55848b) {
                return true;
            }
            return false;
        }

        public a(int i2, int i3, boolean z) {
            this.f55847a = i2;
            this.f55848b = i3;
            this.f55849c = z;
        }
    }

    public final void b(q qVar) {
        try {
            a(qVar);
        } catch (Exception e2) {
            LLog.b("lynx_UIOperation", "UIOperation exception: " + Log.getStackTraceString(e2));
            qVar.f55933c.a(e2);
        }
    }

    protected k(int i2, int i3, boolean z) {
        this.f55846b = new a(i2, i3, z);
    }
}
