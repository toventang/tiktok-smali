package com.ss.android.ugc.aweme.im.sdk.common.ui.base.a;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.Executor;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f102503a;

    /* renamed from: b  reason: collision with root package name */
    public int f102504b;

    /* renamed from: c  reason: collision with root package name */
    List<? extends T> f102505c;

    /* renamed from: d  reason: collision with root package name */
    final g f102506d;

    /* renamed from: e  reason: collision with root package name */
    public final d<T> f102507e;

    static {
        Covode.recordClassIndex(65649);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f102510b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f102511c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f102512d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f102513e = null;

        static {
            Covode.recordClassIndex(65651);
        }

        b(a aVar, List list, List list2, int i2, h.f.a.a aVar2) {
            this.f102509a = aVar;
            this.f102510b = list;
            this.f102511c = list2;
            this.f102512d = i2;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.a$b$a  reason: collision with other inner class name */
        public static final class C2577a extends j.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f102516a;

            static {
                Covode.recordClassIndex(65653);
            }

            @Override // androidx.recyclerview.widget.j.a
            public final int a() {
                return this.f102516a.f102510b.size();
            }

            @Override // androidx.recyclerview.widget.j.a
            public final int b() {
                return this.f102516a.f102511c.size();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C2577a(b bVar) {
                this.f102516a = bVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: androidx.recyclerview.widget.j$e<T> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.j.a
            public final Object a(int i2, int i3) {
                Object obj = this.f102516a.f102510b.get(i2);
                Object obj2 = this.f102516a.f102511c.get(i3);
                if (obj != null && obj2 != null) {
                    return this.f102516a.f102509a.f102507e.f102518a.c(obj, obj2);
                }
                throw new AssertionError();
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: androidx.recyclerview.widget.j$e<T> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.j.a
            public final boolean b(int i2, int i3) {
                Object obj = this.f102516a.f102510b.get(i2);
                Object obj2 = this.f102516a.f102511c.get(i3);
                if (obj != null) {
                    if (obj2 != null) {
                        return this.f102516a.f102509a.f102507e.f102518a.a(obj, obj2);
                    }
                    return false;
                } else if (obj2 == null) {
                    return true;
                } else {
                    return false;
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: androidx.recyclerview.widget.j$e<T> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.j.a
            public final boolean c(int i2, int i3) {
                Object obj = this.f102516a.f102510b.get(i2);
                Object obj2 = this.f102516a.f102511c.get(i3);
                if (obj != null) {
                    if (obj2 != null) {
                        return this.f102516a.f102509a.f102507e.f102518a.b(obj, obj2);
                    }
                } else if (obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }
        }

        public final void run() {
            final j.d a2 = j.a(new C2577a(this), true);
            l.b(a2, "");
            this.f102509a.f102503a.execute(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.a.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f102514a;

                static {
                    Covode.recordClassIndex(65652);
                }

                {
                    this.f102514a = r1;
                }

                public final void run() {
                    if (this.f102514a.f102509a.f102504b == this.f102514a.f102512d) {
                        a aVar = this.f102514a.f102509a;
                        List<? extends T> list = this.f102514a.f102511c;
                        j.d dVar = a2;
                        aVar.f102505c = list;
                        dVar.a(aVar.f102506d);
                    }
                    h.f.a.a aVar2 = this.f102514a.f102513e;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.base.a.a$a  reason: collision with other inner class name */
    public static final class ExecutorC2576a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f102508a = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(65650);
        }

        public final void execute(Runnable runnable) {
            if (runnable != null) {
                this.f102508a.post(runnable);
            }
        }
    }

    public a(g gVar, d<T> dVar) {
        l.d(gVar, "");
        l.d(dVar, "");
        this.f102506d = gVar;
        this.f102507e = dVar;
        Executor executor = dVar.f102520c;
        this.f102503a = executor == null ? new ExecutorC2576a() : executor;
    }
}
