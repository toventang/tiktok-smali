package android.ss.com.vboost.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f406a = b.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static a f407b = null;

    @Override // android.ss.com.vboost.b.c
    public final void b() {
    }

    @Override // android.ss.com.vboost.b.c
    public final void a() {
        if (f407b != null) {
            a.a(30000);
        }
    }

    static {
        Covode.recordClassIndex(14);
    }

    @Override // android.ss.com.vboost.b.c
    public final void a(long j2) {
        if (f407b != null) {
            a.a(j2);
        }
    }

    @Override // android.ss.com.vboost.b.c
    public final void b(long j2) {
        if (f407b != null) {
            a.a(j2);
        }
    }

    @Override // android.ss.com.vboost.b.c
    public final void c(long j2) {
        if (f407b != null) {
            a.a(j2);
        }
    }

    @Override // android.ss.com.vboost.b.c
    public final boolean a(Context context) {
        if (f407b == null) {
            f407b = new a();
        }
        if (a.f402a) {
            return true;
        }
        return false;
    }
}
