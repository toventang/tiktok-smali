package com.bytedance.jedi.arch.ext.list.a;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.a.c;
import h.a.z;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.Executor;

public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f39421a;

    /* renamed from: b  reason: collision with root package name */
    public int f39422b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends T> f39423c;

    /* renamed from: d  reason: collision with root package name */
    public final u f39424d;

    /* renamed from: e  reason: collision with root package name */
    public final c<T> f39425e;

    /* renamed from: f  reason: collision with root package name */
    private final e f39426f;

    static {
        Covode.recordClassIndex(24233);
    }

    public final int a() {
        return this.f39423c.size();
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f39427a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f39428b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f39429c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f39430d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f39431e;

        static {
            Covode.recordClassIndex(24234);
        }

        public a(b bVar, List list, List list2, int i2, h.f.a.a aVar) {
            this.f39427a = bVar;
            this.f39428b = list;
            this.f39429c = list2;
            this.f39430d = i2;
            this.f39431e = aVar;
        }

        /* renamed from: com.bytedance.jedi.arch.ext.list.a.b$a$a  reason: collision with other inner class name */
        public static final class C0962a extends j.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f39434a;

            static {
                Covode.recordClassIndex(24236);
            }

            @Override // androidx.recyclerview.widget.j.a
            public final int a() {
                return this.f39434a.f39428b.size();
            }

            @Override // androidx.recyclerview.widget.j.a
            public final int b() {
                return this.f39434a.f39429c.size();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C0962a(a aVar) {
                this.f39434a = aVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: androidx.recyclerview.widget.j$e<T> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.j.a
            public final Object a(int i2, int i3) {
                Object obj = this.f39434a.f39428b.get(i2);
                Object obj2 = this.f39434a.f39429c.get(i3);
                if (obj != null && obj2 != null) {
                    return this.f39434a.f39427a.f39425e.f39436b.c(obj, obj2);
                }
                throw new AssertionError();
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: androidx.recyclerview.widget.j$e<T> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.j.a
            public final boolean b(int i2, int i3) {
                Object obj = this.f39434a.f39428b.get(i2);
                Object obj2 = this.f39434a.f39429c.get(i3);
                if (obj != null) {
                    if (obj2 != null) {
                        return this.f39434a.f39427a.f39425e.f39436b.a(obj, obj2);
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
                Object obj = this.f39434a.f39428b.get(i2);
                Object obj2 = this.f39434a.f39429c.get(i3);
                if (obj != null) {
                    if (obj2 != null) {
                        return this.f39434a.f39427a.f39425e.f39436b.b(obj, obj2);
                    }
                } else if (obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }
        }

        public final void run() {
            final j.d a2 = j.a(new C0962a(this));
            l.a((Object) a2, "");
            this.f39427a.f39421a.execute(new Runnable(this) {
                /* class com.bytedance.jedi.arch.ext.list.a.b.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f39432a;

                static {
                    Covode.recordClassIndex(24235);
                }

                {
                    this.f39432a = r1;
                }

                public final void run() {
                    if (this.f39432a.f39427a.f39422b == this.f39432a.f39430d) {
                        b bVar = this.f39432a.f39427a;
                        List<? extends T> list = this.f39432a.f39429c;
                        j.d dVar = a2;
                        h.f.a.a aVar = this.f39432a.f39431e;
                        bVar.f39423c = list;
                        dVar.a(bVar.f39424d);
                        if (aVar != null) {
                            aVar.invoke();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private b(RecyclerView.a<?> aVar, j.e<T> eVar) {
        this(new androidx.recyclerview.widget.b(aVar), new c.a(eVar).a(), (e) null);
        l.c(aVar, "");
        l.c(eVar, "");
    }

    public final T a(int i2, boolean z) {
        e eVar;
        List<? extends T> list = this.f39423c;
        if (i2 >= list.size() || i2 < 0) {
            return null;
        }
        if (z && (eVar = this.f39426f) != null) {
            eVar.a(i2);
        }
        return (T) list.get(i2);
    }

    public /* synthetic */ b(RecyclerView.a aVar, j.e eVar, byte b2) {
        this(aVar, eVar);
    }

    public b(u uVar, c<T> cVar, e eVar) {
        l.c(uVar, "");
        l.c(cVar, "");
        this.f39424d = uVar;
        this.f39425e = cVar;
        this.f39426f = eVar;
        Executor executor = cVar.f39437c;
        this.f39421a = executor == null ? new f() : executor;
        this.f39423c = z.INSTANCE;
    }
}
