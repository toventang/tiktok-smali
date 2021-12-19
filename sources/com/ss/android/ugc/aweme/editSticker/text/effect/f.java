package com.ss.android.ugc.aweme.editSticker.text.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dependence.a.a.a;
import com.ss.android.ugc.aweme.dependence.a.a.b.d;
import com.ss.android.ugc.aweme.editSticker.b.a;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.List;

public final class f<T extends com.ss.android.ugc.aweme.editSticker.b.a> implements r<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f88486a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f88487b;

    static {
        Covode.recordClassIndex(55703);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.dependence.a.a.a<T, Void> a() {
        return (com.ss.android.ugc.aweme.dependence.a.a.a) this.f88487b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55704);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ f() {
        this(null);
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.dependence.a.a.a<T, Void>> {
        final /* synthetic */ h.f.a.m $resAction;

        static {
            Covode.recordClassIndex(55705);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h.f.a.m mVar) {
            super(0);
            this.$resAction = mVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            com.ss.android.ugc.aweme.dependence.a.a.a aVar = new com.ss.android.ugc.aweme.dependence.a.a.a(new h(this.$resAction));
            aVar.f79549a = 0;
            aVar.f79551c = true;
            aVar.f79550b = true;
            aVar.f79552d = new d() {
                /* class com.ss.android.ugc.aweme.editSticker.text.effect.f.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(55706);
                }

                @Override // com.ss.android.ugc.aweme.dependence.a.a.b.d
                public final void a(Exception exc) {
                    l.d(exc, "");
                    com.ss.android.ugc.aweme.editSticker.h d2 = com.ss.android.ugc.aweme.editSticker.d.d();
                    if (d2 != null) {
                        d2.a(exc);
                    }
                }
            };
            return aVar;
        }
    }

    public f(h.f.a.m<? super T, ? super h.c.d<? super z>, ? extends Object> mVar) {
        this.f88487b = i.a((h.f.a.a) new b(mVar));
    }

    public final int a(T t) {
        l.d(t, "");
        if (t.a() || t.b()) {
            return 4;
        }
        if (a().b(t) || a().c(t)) {
            return 8;
        }
        t.f88092a = com.ss.android.ugc.aweme.editSticker.b.b.a(t.f88093b);
        if (t.b()) {
            return 4;
        }
        return 2;
    }

    public final boolean b(T t) {
        l.d(t, "");
        int a2 = a((com.ss.android.ugc.aweme.editSticker.b.a) t);
        if (a2 == 4 || a2 == 16) {
            return true;
        }
        return false;
    }

    public final void a(List<? extends T> list) {
        l.d(list, "");
        if ((!list.isEmpty()) && list != null) {
            a().a(list);
        }
    }

    public final void c(T t, com.ss.android.ugc.aweme.dependence.a.a.a.a<T, Void> aVar) {
        l.d(t, "");
        a().b(t, aVar);
    }

    public final void a(T t, com.ss.android.ugc.aweme.dependence.a.a.a.a<T, Void> aVar) {
        l.d(t, "");
        l.d(aVar, "");
        a().a(t, aVar, null);
    }

    public final void b(T t, com.ss.android.ugc.aweme.dependence.a.a.a.a<T, Void> aVar) {
        l.d(t, "");
        com.ss.android.ugc.aweme.dependence.a.a.a<T, Void> a2 = a();
        a2.a(new a.l(a2, t, aVar));
    }
}
