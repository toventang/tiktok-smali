package androidx.emoji.a;

import androidx.j.a.a.a;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<a> f2770d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    final int f2771a;

    /* renamed from: b  reason: collision with root package name */
    final g f2772b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f2773c;

    static {
        Covode.recordClassIndex(973);
    }

    /* access modifiers changed from: package-private */
    public final a a() {
        ThreadLocal<a> threadLocal = f2770d;
        a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        this.f2772b.f2812a.a(aVar, this.f2771a);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(a().a()));
        sb.append(", codepoints:");
        int f2 = a().f();
        for (int i2 = 0; i2 < f2; i2++) {
            sb.append(Integer.toHexString(a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }

    public final void a(boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        this.f2773c = i2;
    }

    public final int a(int i2) {
        return a().a(i2);
    }

    b(g gVar, int i2) {
        this.f2772b = gVar;
        this.f2771a = i2;
    }
}
