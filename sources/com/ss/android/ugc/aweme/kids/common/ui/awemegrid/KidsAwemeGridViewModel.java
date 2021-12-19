package com.ss.android.ugc.aweme.kids.common.ui.awemegrid;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import f.a.d.g;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class KidsAwemeGridViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final t<List<Aweme>> f105926a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public final t<Integer> f105927b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<Integer> f105928c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    f.a.b.b f105929d;

    /* renamed from: e  reason: collision with root package name */
    final a f105930e;

    /* renamed from: f  reason: collision with root package name */
    private f.a.b.b f105931f;

    /* renamed from: g  reason: collision with root package name */
    private final IReportAwemeManager f105932g = ReportAwemeManager.a();

    static {
        Covode.recordClassIndex(67786);
    }

    public final void a() {
        f.a.b.b bVar;
        if (this.f105930e != null) {
            f.a.b.b bVar2 = this.f105931f;
            if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f105931f) == null)) {
                bVar.dispose();
            }
            this.f105931f = this.f105930e.b().d(new d(this)).a(new e(this), new f(this));
        }
    }

    static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsAwemeGridViewModel f105933a;

        static {
            Covode.recordClassIndex(67787);
        }

        a(KidsAwemeGridViewModel kidsAwemeGridViewModel) {
            this.f105933a = kidsAwemeGridViewModel;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            p<? extends List<? extends Aweme>, Integer> pVar = (p) obj;
            l.d(pVar, "");
            return this.f105933a.a(pVar);
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsAwemeGridViewModel f105935a;

        static {
            Covode.recordClassIndex(67789);
        }

        c(KidsAwemeGridViewModel kidsAwemeGridViewModel) {
            this.f105935a = kidsAwemeGridViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f105935a.f105928c.postValue(-2);
        }
    }

    static final class d<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsAwemeGridViewModel f105936a;

        static {
            Covode.recordClassIndex(67790);
        }

        d(KidsAwemeGridViewModel kidsAwemeGridViewModel) {
            this.f105936a = kidsAwemeGridViewModel;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            p<? extends List<? extends Aweme>, Integer> pVar = (p) obj;
            l.d(pVar, "");
            return this.f105936a.a(pVar);
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsAwemeGridViewModel f105938a;

        static {
            Covode.recordClassIndex(67792);
        }

        f(KidsAwemeGridViewModel kidsAwemeGridViewModel) {
            this.f105938a = kidsAwemeGridViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f105938a.f105927b.postValue(-2);
        }
    }

    public KidsAwemeGridViewModel(a aVar) {
        l.d(aVar, "");
        this.f105930e = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.p<? extends java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public final p<List<Aweme>, Integer> a(p<? extends List<? extends Aweme>, Integer> pVar) {
        int i2;
        if (((Number) pVar.getSecond()).intValue() != 0) {
            return pVar;
        }
        List<Aweme> a2 = this.f105932g.a((List) pVar.getFirst());
        if (a2.isEmpty()) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        return v.a(a2, Integer.valueOf(i2));
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsAwemeGridViewModel f105934a;

        static {
            Covode.recordClassIndex(67788);
        }

        b(KidsAwemeGridViewModel kidsAwemeGridViewModel) {
            this.f105934a = kidsAwemeGridViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            p pVar = (p) obj;
            if (((List) pVar.getFirst()).isEmpty()) {
                this.f105934a.f105928c.postValue(-1);
                return;
            }
            this.f105934a.f105928c.postValue(0);
            ArrayList arrayList = new ArrayList();
            List<Aweme> value = this.f105934a.f105926a.getValue();
            if (value == null) {
                value = z.INSTANCE;
            }
            arrayList.addAll(value);
            arrayList.addAll((Collection) pVar.getFirst());
            this.f105934a.f105926a.postValue(arrayList);
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsAwemeGridViewModel f105937a;

        static {
            Covode.recordClassIndex(67791);
        }

        e(KidsAwemeGridViewModel kidsAwemeGridViewModel) {
            this.f105937a = kidsAwemeGridViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.t<java.lang.Integer> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            p pVar = (p) obj;
            this.f105937a.f105927b.postValue(pVar.getSecond());
            if (((Number) pVar.getSecond()).intValue() == 0) {
                if (((List) pVar.getFirst()).isEmpty()) {
                    this.f105937a.f105927b.postValue(-1);
                } else {
                    this.f105937a.f105926a.postValue(n.g((Collection) pVar.getFirst()));
                }
            }
        }
    }
}
