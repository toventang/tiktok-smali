package androidx.room;

import androidx.i.a.f;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f4360a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final j f4361b;

    /* renamed from: c  reason: collision with root package name */
    private volatile f f4362c;

    static {
        Covode.recordClassIndex(1681);
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    private f c() {
        return this.f4361b.a(a());
    }

    public final f b() {
        this.f4361b.c();
        if (!this.f4360a.compareAndSet(false, true)) {
            return c();
        }
        if (this.f4362c == null) {
            this.f4362c = c();
        }
        return this.f4362c;
    }

    public n(j jVar) {
        this.f4361b = jVar;
    }

    public final void a(f fVar) {
        if (fVar == this.f4362c) {
            this.f4360a.set(false);
        }
    }
}
