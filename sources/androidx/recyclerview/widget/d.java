package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public final class d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final Executor f3998h = new b();

    /* renamed from: a  reason: collision with root package name */
    final u f3999a;

    /* renamed from: b  reason: collision with root package name */
    final c<T> f4000b;

    /* renamed from: c  reason: collision with root package name */
    Executor f4001c;

    /* renamed from: d  reason: collision with root package name */
    final List<a<T>> f4002d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    List<T> f4003e;

    /* renamed from: f  reason: collision with root package name */
    public List<T> f4004f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    int f4005g;

    public interface a<T> {
        static {
            Covode.recordClassIndex(1560);
        }
    }

    static class b implements Executor {

        /* renamed from: a  reason: collision with root package name */
        final Handler f4014a = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(1561);
        }

        b() {
        }

        public final void execute(Runnable runnable) {
            this.f4014a.post(runnable);
        }
    }

    static {
        Covode.recordClassIndex(1556);
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        Iterator<a<T>> it = this.f4002d.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public d(u uVar, c<T> cVar) {
        this.f3999a = uVar;
        this.f4000b = cVar;
        if (cVar.f3990a != null) {
            this.f4001c = cVar.f3990a;
        } else {
            this.f4001c = f3998h;
        }
    }

    public final void a(final List<T> list, final Runnable runnable) {
        final int i2 = this.f4005g + 1;
        this.f4005g = i2;
        final List<T> list2 = this.f4003e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (list == null) {
            int size = list2.size();
            this.f4003e = null;
            this.f4004f = Collections.emptyList();
            this.f3999a.b(0, size);
            a(runnable);
        } else if (list2 == null) {
            this.f4003e = list;
            this.f4004f = Collections.unmodifiableList(list);
            this.f3999a.a(0, list.size());
            a(runnable);
        } else {
            this.f4000b.f3991b.execute(new Runnable() {
                /* class androidx.recyclerview.widget.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1557);
                }

                public final void run() {
                    final j.d a2 = j.a(new j.a() {
                        /* class androidx.recyclerview.widget.d.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(1558);
                        }

                        @Override // androidx.recyclerview.widget.j.a
                        public final int a() {
                            return list2.size();
                        }

                        @Override // androidx.recyclerview.widget.j.a
                        public final int b() {
                            return list.size();
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: androidx.recyclerview.widget.j$e<T> */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // androidx.recyclerview.widget.j.a
                        public final Object a(int i2, int i3) {
                            Object obj = list2.get(i2);
                            Object obj2 = list.get(i3);
                            if (obj != null && obj2 != null) {
                                return d.this.f4000b.f3992c.c(obj, obj2);
                            }
                            throw new AssertionError();
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: androidx.recyclerview.widget.j$e<T> */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // androidx.recyclerview.widget.j.a
                        public final boolean b(int i2, int i3) {
                            Object obj = list2.get(i2);
                            Object obj2 = list.get(i3);
                            if (obj != null) {
                                if (obj2 != null) {
                                    return d.this.f4000b.f3992c.a(obj, obj2);
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
                            Object obj = list2.get(i2);
                            Object obj2 = list.get(i3);
                            if (obj != null) {
                                if (obj2 != null) {
                                    return d.this.f4000b.f3992c.b(obj, obj2);
                                }
                            } else if (obj2 == null) {
                                return true;
                            }
                            throw new AssertionError();
                        }
                    }, true);
                    d.this.f4001c.execute(new Runnable() {
                        /* class androidx.recyclerview.widget.d.AnonymousClass1.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(1559);
                        }

                        public final void run() {
                            if (d.this.f4005g == i2) {
                                d dVar = d.this;
                                List<T> list = list;
                                j.d dVar2 = a2;
                                Runnable runnable = runnable;
                                dVar.f4003e = list;
                                dVar.f4004f = Collections.unmodifiableList(list);
                                dVar2.a(dVar.f3999a);
                                dVar.a(runnable);
                            }
                        }
                    });
                }
            });
        }
    }
}
