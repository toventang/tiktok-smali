package com.bytedance.ies.im.core.api.b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a.d;
import com.bytedance.ies.im.core.api.c;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.d.ai;
import h.f.b.l;
import java.util.List;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33953a = new a((byte) 0);

    static {
        Covode.recordClassIndex(20198);
    }

    public abstract String a();

    public abstract void a(int i2);

    public abstract void a(d dVar);

    public abstract void a(ai aiVar, boolean z, b<Pair<List<Long>, List<Long>>> bVar);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract int e();

    public abstract void f();

    public abstract void g();

    public abstract List<ai> h();

    public abstract List<ai> i();

    public static final class a {
        static {
            Covode.recordClassIndex(20199);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static e a(String str, boolean z) {
            l.d(str, "");
            return c.f33958a.a(str, z);
        }
    }
}
