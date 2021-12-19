package com.ss.android.ugc.aweme.filter.view.internal.main;

import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.view.a.f;
import com.ss.android.ugc.aweme.filter.view.a.j;
import com.ss.android.ugc.aweme.filter.view.internal.e;
import f.a.l.g;
import f.a.t;
import h.f.b.l;
import h.h;
import h.i;
import h.z;

public class m implements e {

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f95959a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public a f95960b = a.HIDE;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.a<j> f95961c;

    /* renamed from: d  reason: collision with root package name */
    public final h.f.a.a<f> f95962d;

    /* renamed from: e  reason: collision with root package name */
    public final h.f.a.a<z> f95963e;

    /* renamed from: f  reason: collision with root package name */
    private final g<Boolean> f95964f;

    /* renamed from: g  reason: collision with root package name */
    private final h f95965g = i.a((h.f.a.a) new c(this));

    /* renamed from: h  reason: collision with root package name */
    private final h f95966h = i.a((h.f.a.a) new b(this));

    /* renamed from: i  reason: collision with root package name */
    private final h f95967i = i.a((h.f.a.a) new d(this));

    /* renamed from: j  reason: collision with root package name */
    private final com.ss.android.ugc.tools.view.a.c f95968j;

    /* access modifiers changed from: package-private */
    public enum a {
        FILTER_BOX_SHOW,
        FILTER_VIEW_SHOW,
        HIDE;

        static {
            Covode.recordClassIndex(60782);
        }
    }

    static {
        Covode.recordClassIndex(60781);
    }

    private j f() {
        return (j) this.f95965g.getValue();
    }

    private f g() {
        return (f) this.f95966h.getValue();
    }

    private final com.ss.android.ugc.tools.view.a.a h() {
        return (com.ss.android.ugc.tools.view.a.a) this.f95967i.getValue();
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.tools.view.a.a> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(60787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.tools.view.a.a invoke() {
            return new com.ss.android.ugc.tools.view.a.a(this) {
                /* class com.ss.android.ugc.aweme.filter.view.internal.main.m.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f95975a;

                static {
                    Covode.recordClassIndex(60788);
                }

                {
                    this.f95975a = r1;
                }

                @Override // com.ss.android.ugc.tools.view.a.a
                public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
                    if (i2 != 4) {
                        return false;
                    }
                    if (this.f95975a.this$0.f95960b == a.FILTER_BOX_SHOW) {
                        this.f95975a.this$0.a(a.FILTER_VIEW_SHOW);
                        return true;
                    } else if (this.f95975a.this$0.f95960b != a.FILTER_VIEW_SHOW) {
                        return true;
                    } else {
                        this.f95975a.this$0.a(a.HIDE);
                        return true;
                    }
                }
            };
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.e
    public final void a() {
        a(a.FILTER_VIEW_SHOW);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.e
    public final void c() {
        a(a.HIDE);
    }

    public final boolean e() {
        if (this.f95962d != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.e
    public final void b() {
        if (e()) {
            a(a.FILTER_BOX_SHOW);
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.e
    public final t<Boolean> d() {
        t<Boolean> c2 = this.f95964f.c();
        l.b(c2, "");
        return c2;
    }

    static final class b extends h.f.b.m implements h.f.a.a<f> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(60783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            f invoke;
            h.f.a.a<f> aVar = this.this$0.f95962d;
            if (aVar == null || (invoke = aVar.invoke()) == null) {
                return null;
            }
            this.this$0.f95959a.a(invoke.e().a(new f.a.d.f<z>(this) {
                /* class com.ss.android.ugc.aweme.filter.view.internal.main.m.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f95973a;

                static {
                    Covode.recordClassIndex(60784);
                }

                {
                    this.f95973a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(z zVar) {
                    if (this.f95973a.this$0.f95960b == a.FILTER_BOX_SHOW) {
                        this.f95973a.this$0.a(a.FILTER_VIEW_SHOW);
                    }
                }
            }, f.a.e.b.a.f157192e));
            return invoke;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<j> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(60785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            j invoke = this.this$0.f95961c.invoke();
            this.this$0.f95959a.a(invoke.h().a(new f.a.d.f<com.ss.android.ugc.aweme.filter.view.a.c>(this) {
                /* class com.ss.android.ugc.aweme.filter.view.internal.main.m.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f95974a;

                static {
                    Covode.recordClassIndex(60786);
                }

                {
                    this.f95974a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(com.ss.android.ugc.aweme.filter.view.a.c cVar) {
                    h.f.a.a<z> aVar;
                    com.ss.android.ugc.aweme.filter.view.a.c cVar2 = cVar;
                    if (cVar2.f95756a == com.ss.android.ugc.aweme.filter.view.a.d.FILTER_BOX_ENTRANCE_CLICK && this.f95974a.this$0.f95960b == a.FILTER_VIEW_SHOW && this.f95974a.this$0.e() && ((aVar = this.f95974a.this$0.f95963e) == null || aVar.invoke() == null)) {
                        this.f95974a.this$0.a(a.FILTER_BOX_SHOW);
                    }
                    if (cVar2.f95756a == com.ss.android.ugc.aweme.filter.view.a.d.OUTSIDE_TOUCH && this.f95974a.this$0.f95960b == a.FILTER_VIEW_SHOW) {
                        this.f95974a.this$0.a(a.HIDE);
                    }
                }
            }, f.a.e.b.a.f157192e));
            return invoke;
        }
    }

    public final void a(a aVar) {
        f g2;
        f g3;
        a aVar2 = this.f95960b;
        if (aVar2 != aVar) {
            int i2 = n.f95976a[aVar.ordinal()];
            if (i2 == 1) {
                f g4 = g();
                if (g4 != null) {
                    g4.a();
                }
                if (aVar2 == a.FILTER_VIEW_SHOW) {
                    f().c();
                }
            } else if (i2 == 2) {
                f().b();
                if (aVar2 == a.FILTER_BOX_SHOW && (g2 = g()) != null) {
                    g2.b();
                }
            } else if (i2 == 3) {
                if (aVar2 == a.FILTER_VIEW_SHOW) {
                    f().c();
                }
                if (aVar2 == a.FILTER_BOX_SHOW && (g3 = g()) != null) {
                    g3.b();
                }
            }
            this.f95960b = aVar;
            if (aVar2 == a.HIDE) {
                com.ss.android.ugc.tools.view.a.c cVar = this.f95968j;
                if (cVar != null) {
                    cVar.b(h());
                }
                this.f95964f.onNext(true);
            } else if (aVar == a.HIDE) {
                com.ss.android.ugc.tools.view.a.c cVar2 = this.f95968j;
                if (cVar2 != null) {
                    cVar2.c(h());
                }
                this.f95964f.onNext(false);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.aweme.filter.view.a.j> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.aweme.filter.view.a.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public m(h.f.a.a<? extends j> aVar, h.f.a.a<? extends f> aVar2, com.ss.android.ugc.tools.view.a.c cVar, h.f.a.a<z> aVar3) {
        l.d(aVar, "");
        this.f95961c = aVar;
        this.f95962d = aVar2;
        this.f95968j = cVar;
        this.f95963e = aVar3;
        f.a.l.c cVar2 = new f.a.l.c();
        l.b(cVar2, "");
        this.f95964f = cVar2;
    }
}
