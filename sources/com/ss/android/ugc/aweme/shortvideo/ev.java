package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.a.e;
import com.bytedance.creativex.recorder.filter.a.j;
import com.google.c.a.f;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.k;
import com.ss.android.ugc.aweme.filter.repository.a.m;
import com.ss.android.ugc.aweme.filter.repository.internal.main.q;
import com.ss.android.ugc.aweme.shortvideo.x.i;
import h.a.n;
import h.f.b.l;
import h.p;
import java.util.Iterator;
import java.util.List;

public final class ev implements i {

    /* renamed from: a  reason: collision with root package name */
    public f<FilterBean, Float> f128451a;

    /* renamed from: b  reason: collision with root package name */
    private final q f128452b = new q();

    /* renamed from: c  reason: collision with root package name */
    private boolean f128453c;

    /* renamed from: d  reason: collision with root package name */
    private final m f128454d = new a(this);

    /* renamed from: e  reason: collision with root package name */
    private final j f128455e = new b();

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.filter.a.a f128456f;

    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ev f128457a;

        static {
            Covode.recordClassIndex(84228);
        }

        @Override // com.ss.android.ugc.aweme.filter.repository.a.m
        public final void a(FilterBean filterBean, float f2) {
            l.d(filterBean, "");
        }

        @Override // com.ss.android.ugc.aweme.filter.repository.a.m
        public final float b(FilterBean filterBean) {
            l.d(filterBean, "");
            return 0.0f;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ev$a$a  reason: collision with other inner class name */
        public static final class C3351a implements k {
            static {
                Covode.recordClassIndex(84229);
            }

            @Override // com.ss.android.ugc.aweme.filter.repository.a.k
            public final float a(FilterBean filterBean) {
                l.d(filterBean, "");
                return 0.0f;
            }

            C3351a() {
            }
        }

        @Override // com.ss.android.ugc.aweme.filter.repository.a.m
        public final k a() {
            return new C3351a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(ev evVar) {
            this.f128457a = evVar;
        }

        @Override // com.ss.android.ugc.aweme.filter.repository.a.m
        public final float a(FilterBean filterBean) {
            Float a2;
            l.d(filterBean, "");
            f<FilterBean, Float> fVar = this.f128457a.f128451a;
            if (fVar == null || (a2 = fVar.a(filterBean)) == null) {
                return 0.0f;
            }
            return a2.floatValue();
        }
    }

    static {
        Covode.recordClassIndex(84227);
    }

    public static final class b implements j {
        static {
            Covode.recordClassIndex(84230);
        }

        @Override // com.bytedance.creativex.recorder.filter.a.j
        public final int a(int i2) {
            return -1;
        }

        @Override // com.bytedance.creativex.recorder.filter.a.j
        public final void a(int i2, int i3) {
        }

        @Override // com.bytedance.creativex.recorder.filter.a.j
        public final void a(boolean z) {
        }

        @Override // com.bytedance.creativex.recorder.filter.a.j
        public final boolean a() {
            return false;
        }

        b() {
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.i
    public final void a() {
        this.f128456f.useFilterSource("build_in");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.i
    public final void a(f<FilterBean, Float> fVar) {
        l.d(fVar, "");
        this.f128451a = fVar;
    }

    public ev(com.bytedance.creativex.recorder.filter.a.a aVar) {
        l.d(aVar, "");
        this.f128456f = aVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.i
    public final void a(List<? extends FilterBean> list, int i2) {
        Object obj;
        float f2;
        l.d(list, "");
        if (!this.f128453c) {
            this.f128456f.removeFilterSource("live");
            this.f128456f.addFilterSource(new e("live", this.f128452b, this.f128454d, this.f128455e));
            this.f128453c = true;
        }
        q qVar = this.f128452b;
        l.d(list, "");
        if (qVar.f95742a.size() == list.size()) {
            List f3 = n.f(qVar.f95742a, list);
            if (!f3.isEmpty()) {
                Iterator it = f3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    p pVar = (p) it.next();
                    if (!l.a(com.ss.android.ugc.aweme.filter.repository.internal.utils.b.b((FilterBean) pVar.getFirst()), com.ss.android.ugc.aweme.filter.repository.internal.utils.b.b((FilterBean) pVar.getSecond()))) {
                        break;
                    }
                }
            }
        } else {
            qVar.f95742a = list;
            qVar.a(qVar.f95742a);
        }
        this.f128456f.useFilterSource("live");
        Float f4 = null;
        if (!list.isEmpty()) {
            if (i2 < 0 || i2 >= list.size()) {
                obj = list.get(0);
            } else {
                obj = list.get(i2);
            }
            FilterBean filterBean = (FilterBean) obj;
            if (filterBean == null) {
                return;
            }
            if (l.a((Object) filterBean, (Object) this.f128456f.getCurSelectedFilter().f6468a.getValue())) {
                f<FilterBean, Float> fVar = this.f128451a;
                if (fVar != null) {
                    f4 = fVar.a(filterBean);
                }
                com.bytedance.creativex.recorder.filter.a.a aVar = this.f128456f;
                if (f4 != null) {
                    f2 = f4.floatValue();
                } else {
                    f2 = 0.0f;
                }
                aVar.setFilterIntensity(filterBean, f2);
                return;
            }
            this.f128456f.setFilterChosen(filterBean, null, true, true, false);
        }
    }
}
