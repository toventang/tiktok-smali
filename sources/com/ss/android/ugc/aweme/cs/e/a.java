package com.ss.android.ugc.aweme.cs.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.b.b;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.l;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class a implements com.bytedance.u.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1839a f79026a = new C1839a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f79027b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(49056);
    }

    @Override // com.bytedance.u.a
    public final boolean d() {
        return true;
    }

    public String f() {
        return "";
    }

    /* access modifiers changed from: protected */
    public abstract String g();

    /* access modifiers changed from: protected */
    public abstract b h();

    /* access modifiers changed from: protected */
    public abstract boolean j();

    /* access modifiers changed from: protected */
    public abstract long k();

    /* renamed from: com.ss.android.ugc.aweme.cs.e.a$a  reason: collision with other inner class name */
    public static final class C1839a {
        static {
            Covode.recordClassIndex(49057);
        }

        private C1839a() {
        }

        public /* synthetic */ C1839a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        this.f79027b.set(true);
    }

    @Override // com.bytedance.u.a
    public final String a() {
        return h().toString();
    }

    @Override // com.bytedance.u.a
    public final boolean b() {
        boolean z;
        Throwable th;
        Exception e2;
        if (this.f79027b.get()) {
            return false;
        }
        try {
            i();
            long currentTimeMillis = System.currentTimeMillis();
            z = j();
            try {
                g.a().g().a().b(g(), System.currentTimeMillis() - currentTimeMillis);
                a(z);
                return z;
            } catch (Exception e3) {
                e2 = e3;
                try {
                    g.a().g().a().a(g(), e2);
                    a(z);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    a(z);
                    throw th;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            z = false;
            g.a().g().a().a(g(), e2);
            a(z);
            return false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
            a(z);
            throw th;
        }
    }

    @Override // com.bytedance.u.a
    public final long e() {
        long j2 = 0;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            j2 = k();
            g();
            Object[] objArr = new Object[1];
            double d2 = (double) j2;
            Double.isNaN(d2);
            objArr[0] = Double.valueOf(d2 / 1048576.0d);
            l.b(com.a.a("%.1fMB", Arrays.copyOf(objArr, 1)), "");
            File c2 = c();
            l.b(c2, "");
            c2.getPath();
            g.a().g().a().a(g(), System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e2) {
            g.a().g().a().a(g(), e2);
        }
        return j2;
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        this.f79027b.set(false);
    }
}
