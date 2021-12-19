package androidx.a.a.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public class a extends c {

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f784b = new Executor() {
        /* class androidx.a.a.a.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(200);
        }

        public final void execute(Runnable runnable) {
            a.a().b(runnable);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static final Executor f785c = new Executor() {
        /* class androidx.a.a.a.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(201);
        }

        public final void execute(Runnable runnable) {
            a.a().a(runnable);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f786d;

    /* renamed from: a  reason: collision with root package name */
    public c f787a;

    /* renamed from: e  reason: collision with root package name */
    private c f788e;

    private a() {
        b bVar = new b();
        this.f788e = bVar;
        this.f787a = bVar;
    }

    @Override // androidx.a.a.a.c
    public final boolean b() {
        return this.f787a.b();
    }

    static {
        Covode.recordClassIndex(199);
    }

    public static a a() {
        if (f786d != null) {
            return f786d;
        }
        synchronized (a.class) {
            if (f786d == null) {
                f786d = new a();
            }
        }
        return f786d;
    }

    @Override // androidx.a.a.a.c
    public final void a(Runnable runnable) {
        this.f787a.a(runnable);
    }

    @Override // androidx.a.a.a.c
    public final void b(Runnable runnable) {
        this.f787a.b(runnable);
    }
}
