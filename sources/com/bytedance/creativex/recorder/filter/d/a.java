package com.bytedance.creativex.recorder.filter.d;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.e;
import androidx.lifecycle.LiveData;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.a.g;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.filter.repository.a.q;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.h.d;
import h.k.i;
import h.m;
import java.util.List;

public final class a extends j<g> implements g, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f28260a = {new y(a.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final a f28261b = this;

    /* renamed from: c  reason: collision with root package name */
    private final e f28262c = ((e) getDiContainer().a(e.class, (String) null));

    /* renamed from: d  reason: collision with root package name */
    private final d f28263d = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.filter.a.a.class);

    /* renamed from: e  reason: collision with root package name */
    private final h f28264e = h.i.a(m.NONE, C0601a.f28267a);

    /* renamed from: f  reason: collision with root package name */
    private final h f28265f = h.i.a((h.f.a.a) new b(this));

    /* renamed from: g  reason: collision with root package name */
    private final f f28266g;

    static {
        Covode.recordClassIndex(16577);
    }

    private final d b() {
        return (d) this.f28264e.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.creativex.recorder.filter.a.a a() {
        return (com.bytedance.creativex.recorder.filter.a.a) this.f28263d.a(this, f28260a[0]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ g getApiComponent() {
        return this.f28261b;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f28266g;
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.d.a$a  reason: collision with other inner class name */
    static final class C0601a extends h.f.b.m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0601a f28267a = new C0601a();

        static {
            Covode.recordClassIndex(16578);
        }

        C0601a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(16579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new e(this) {
                /* class com.bytedance.creativex.recorder.filter.d.a.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f28268a;

                static {
                    Covode.recordClassIndex(16580);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f28268a = r1;
                }

                @Override // com.bytedance.creativex.recorder.filter.d.e
                public final void a(g gVar) {
                    List<FilterBean> list;
                    int indexOf;
                    FilterBean filterBean;
                    o oVar;
                    q f2;
                    LiveData<List<FilterBean>> b2;
                    l.d(gVar, "");
                    a aVar = this.f28268a.this$0;
                    com.bytedance.creativex.recorder.filter.a.e value = aVar.a().getCurrentFilterSource().getValue();
                    if (value == null || (oVar = value.f28227b) == null || (f2 = oVar.f()) == null || (b2 = f2.b()) == null || (list = b2.getValue()) == null) {
                        list = z.INSTANCE;
                    }
                    FilterBean a2 = aVar.a().getCurSelectedFilter().a();
                    int i2 = 0;
                    if (a2 != null && (indexOf = list.indexOf(a2)) >= 0) {
                        i2 = indexOf;
                    }
                    int i3 = b.f28269a[gVar.ordinal()];
                    if (i3 == 1) {
                        filterBean = (FilterBean) n.b((List) list, i2 - 1);
                    } else if (i3 == 2) {
                        filterBean = (FilterBean) n.b((List) list, i2 + 1);
                    } else if (i3 == 3) {
                        filterBean = a2;
                    } else {
                        throw new h.n();
                    }
                    if (filterBean != null) {
                        aVar.a().setFilterChosen(filterBean, "slide", !l.a(filterBean, a2), true, l.a(filterBean, a2));
                    }
                }

                @Override // com.bytedance.creativex.recorder.filter.d.e
                public final void a(float f2, f fVar) {
                    int indexOf;
                    FilterBean filterBean;
                    l.d(fVar, "");
                    a aVar = this.f28268a.this$0;
                    com.bytedance.creativex.recorder.filter.a.e value = aVar.a().getCurrentFilterSource().getValue();
                    if (value != null) {
                        l.b(value, "");
                        List<FilterBean> value2 = value.f28227b.f().b().getValue();
                        if (value2 == null) {
                            value2 = z.INSTANCE;
                        }
                        if (!value2.isEmpty()) {
                            FilterBean a2 = aVar.a().getCurSelectedFilter().a();
                            int i2 = 0;
                            if (a2 != null && (indexOf = value2.indexOf(a2)) >= 0) {
                                i2 = indexOf;
                            }
                            if (fVar == f.LEFT) {
                                filterBean = (FilterBean) n.b((List) value2, i2 - 1);
                            } else {
                                filterBean = a2;
                            }
                            if (fVar != f.LEFT) {
                                a2 = (FilterBean) n.b((List) value2, i2 + 1);
                            }
                            if (filterBean != null && a2 != null) {
                                aVar.a().setFilterScroll(filterBean, a2, f2);
                            }
                        }
                    }
                }
            };
        }
    }

    @Override // com.bytedance.als.j
    public final void onDestroy() {
        super.onDestroy();
        b().a();
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        b().a((e) this.f28265f.getValue());
    }

    @Override // com.bytedance.creativex.recorder.filter.a.g
    public final void a(float f2) {
        b().a(f2);
    }

    public a(f fVar) {
        l.d(fVar, "");
        this.f28266g = fVar;
    }

    @Override // com.bytedance.creativex.recorder.filter.a.g
    public final void a(float f2, float f3) {
        d b2 = b();
        Window window = this.f28262c.getWindow();
        l.b(window, "");
        View decorView = window.getDecorView();
        l.b(decorView, "");
        b2.a(f2, f3, decorView.getWidth());
    }
}
