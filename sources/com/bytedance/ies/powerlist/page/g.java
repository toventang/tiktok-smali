package com.bytedance.ies.powerlist.page;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.o;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public volatile int f34377a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends com.bytedance.ies.powerlist.b.a> f34378b = z.INSTANCE;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<Integer> f34379c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    final h f34380d = i.a((h.f.a.a) new c(this));

    /* renamed from: e  reason: collision with root package name */
    public final h f34381e = i.a((h.f.a.a) new b(this));

    /* renamed from: f  reason: collision with root package name */
    public final u f34382f;

    /* renamed from: g  reason: collision with root package name */
    public final f.a.l.b<com.bytedance.ies.powerlist.page.config.c> f34383g;

    static {
        Covode.recordClassIndex(20542);
    }

    public static final class e extends j.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f34392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f34393b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f34394c;

        static {
            Covode.recordClassIndex(20548);
        }

        @Override // androidx.recyclerview.widget.j.a
        public final int a() {
            return this.f34392a.size();
        }

        @Override // androidx.recyclerview.widget.j.a
        public final int b() {
            return this.f34393b.size();
        }

        @Override // androidx.recyclerview.widget.j.a
        public final Object a(int i2, int i3) {
            com.bytedance.ies.powerlist.b.a aVar = (com.bytedance.ies.powerlist.b.a) this.f34392a.get(i2);
            com.bytedance.ies.powerlist.b.a aVar2 = (com.bytedance.ies.powerlist.b.a) this.f34393b.get(i3);
            if (aVar == null || aVar2 == null) {
                return null;
            }
            return aVar.c(aVar2);
        }

        @Override // androidx.recyclerview.widget.j.a
        public final boolean b(int i2, int i3) {
            Object obj = this.f34392a.get(i2);
            l.a(obj, "");
            com.bytedance.ies.powerlist.b.a aVar = (com.bytedance.ies.powerlist.b.a) obj;
            Object obj2 = this.f34393b.get(i3);
            l.a(obj2, "");
            com.bytedance.ies.powerlist.b.a aVar2 = (com.bytedance.ies.powerlist.b.a) obj2;
            if (aVar != null) {
                if (aVar2 != null) {
                    return aVar.b(aVar2);
                }
                return false;
            } else if (aVar2 == null) {
                return true;
            } else {
                return false;
            }
        }

        @Override // androidx.recyclerview.widget.j.a
        public final boolean c(int i2, int i3) {
            Object obj = this.f34392a.get(i2);
            l.a(obj, "");
            com.bytedance.ies.powerlist.b.a aVar = (com.bytedance.ies.powerlist.b.a) obj;
            Object obj2 = this.f34393b.get(i3);
            l.a(obj2, "");
            com.bytedance.ies.powerlist.b.a aVar2 = (com.bytedance.ies.powerlist.b.a) obj2;
            if (aVar != null) {
                if (aVar2 != null) {
                    Integer num = (Integer) this.f34394c.get(i2);
                    int hashCode = aVar2.hashCode();
                    if (num != null && num.intValue() == hashCode) {
                        return aVar.a(aVar2);
                    }
                    return false;
                }
            } else if (aVar2 == null) {
                return true;
            }
            return false;
        }

        public e(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            this.f34392a = arrayList;
            this.f34393b = arrayList2;
            this.f34394c = arrayList3;
        }
    }

    static final class c extends m implements h.f.a.a<Executor> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(20545);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Executor invoke() {
            Executor executor;
            com.bytedance.ies.powerlist.page.config.c i2 = this.this$0.f34383g.i();
            if (i2 == null || (executor = i2.f34362g) == null) {
                return new a();
            }
            return executor;
        }
    }

    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f34386a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j.a f34387b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34388c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f34389d;

        static {
            Covode.recordClassIndex(20546);
        }

        public d(g gVar, j.a aVar, int i2, ArrayList arrayList) {
            this.f34386a = gVar;
            this.f34387b = aVar;
            this.f34388c = i2;
            this.f34389d = arrayList;
        }

        public final void run() {
            final j.d a2 = j.a(this.f34387b);
            l.a((Object) a2, "");
            ((Executor) this.f34386a.f34380d.getValue()).execute(new Runnable(this) {
                /* class com.bytedance.ies.powerlist.page.g.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f34390a;

                static {
                    Covode.recordClassIndex(20547);
                }

                {
                    this.f34390a = r1;
                }

                public final void run() {
                    if (this.f34390a.f34386a.f34377a == this.f34390a.f34388c) {
                        g gVar = this.f34390a.f34386a;
                        ArrayList arrayList = this.f34390a.f34389d;
                        l.c(arrayList, "");
                        gVar.f34378b = arrayList;
                        g gVar2 = this.f34390a.f34386a;
                        List<? extends com.bytedance.ies.powerlist.b.a> list = this.f34390a.f34386a.f34378b;
                        ArrayList<Integer> arrayList2 = new ArrayList<>();
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Integer.valueOf(it.next().hashCode()));
                        }
                        l.c(arrayList2, "");
                        gVar2.f34379c = arrayList2;
                        a2.a(this.f34390a.f34386a.f34382f);
                    }
                }
            });
        }
    }

    static final class b extends m implements h.f.a.a<Executor> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(20544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Executor invoke() {
            Executor executor;
            com.bytedance.ies.powerlist.page.config.c i2 = this.this$0.f34383g.i();
            if (i2 == null || (executor = i2.f34361f) == null) {
                return com.ss.android.ugc.aweme.cw.g.a(com.ss.android.ugc.aweme.cw.l.a(o.FIXED).a(2).a());
            }
            return executor;
        }
    }

    final class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f34384a = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(20543);
        }

        public final void execute(Runnable runnable) {
            l.c(runnable, "");
            this.f34384a.post(runnable);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }
    }

    public g(u uVar, f.a.l.b<com.bytedance.ies.powerlist.page.config.c> bVar) {
        l.c(uVar, "");
        l.c(bVar, "");
        this.f34382f = uVar;
        this.f34383g = bVar;
    }
}
