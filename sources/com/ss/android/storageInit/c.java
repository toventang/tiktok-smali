package com.ss.android.storageInit;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class c implements com.bytedance.u.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60986a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f60987b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(37579);
    }

    @Override // com.bytedance.u.a
    public File c() {
        return null;
    }

    @Override // com.bytedance.u.a
    public boolean d() {
        return true;
    }

    public abstract String f();

    public abstract String g();

    /* access modifiers changed from: protected */
    public abstract long h();

    /* access modifiers changed from: protected */
    public abstract boolean i();

    public static final class a {
        static {
            Covode.recordClassIndex(37580);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private void j() {
        this.f60987b.set(false);
    }

    @Override // com.bytedance.u.a
    public final String a() {
        return g();
    }

    @Override // com.bytedance.u.a
    public final boolean b() {
        if (this.f60987b.get()) {
            return false;
        }
        try {
            this.f60987b.set(true);
            System.currentTimeMillis();
            boolean i2 = i();
            System.currentTimeMillis();
            return i2;
        } catch (Exception unused) {
            return false;
        } finally {
            j();
        }
    }

    @Override // com.bytedance.u.a
    public final long e() {
        long j2;
        try {
            System.currentTimeMillis();
            j2 = h();
            try {
                System.currentTimeMillis();
                f();
                Object[] objArr = new Object[1];
                double d2 = (double) j2;
                Double.isNaN(d2);
                objArr[0] = Double.valueOf(d2 / 1048576.0d);
                l.b(com.a.a("%.1fMB", Arrays.copyOf(objArr, 1)), "");
            } catch (Exception unused) {
                f();
                return j2;
            }
        } catch (Exception unused2) {
            j2 = 0;
            f();
            return j2;
        }
        return j2;
    }
}
