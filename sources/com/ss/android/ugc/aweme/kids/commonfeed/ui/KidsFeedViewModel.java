package com.ss.android.ugc.aweme.kids.commonfeed.ui;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class KidsFeedViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final t<List<Aweme>> f106212a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public final t<Integer> f106213b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<Integer> f106214c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final t<Boolean> f106215d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    f.a.b.b f106216e;

    /* renamed from: f  reason: collision with root package name */
    f.a.b.b f106217f;

    /* renamed from: g  reason: collision with root package name */
    f.a.b.b f106218g;

    /* renamed from: h  reason: collision with root package name */
    final com.ss.android.ugc.aweme.kids.commonfeed.c.a f106219h;

    /* renamed from: i  reason: collision with root package name */
    private final IReportAwemeManager f106220i = ReportAwemeManager.a();

    static {
        Covode.recordClassIndex(67909);
    }

    static final class a<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsFeedViewModel f106221a;

        static {
            Covode.recordClassIndex(67910);
        }

        a(KidsFeedViewModel kidsFeedViewModel) {
            this.f106221a = kidsFeedViewModel;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            p<? extends List<? extends Aweme>, Integer> pVar = (p) obj;
            l.d(pVar, "");
            return this.f106221a.a(pVar);
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsFeedViewModel f106223a;

        static {
            Covode.recordClassIndex(67912);
        }

        c(KidsFeedViewModel kidsFeedViewModel) {
            this.f106223a = kidsFeedViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f106223a.f106213b.postValue(-2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsFeedViewModel f106224a;

        static {
            Covode.recordClassIndex(67913);
        }

        d(KidsFeedViewModel kidsFeedViewModel) {
            this.f106224a = kidsFeedViewModel;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            p<? extends List<? extends Aweme>, Integer> pVar = (p) obj;
            l.d(pVar, "");
            return this.f106224a.a(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsFeedViewModel f106226a;

        static {
            Covode.recordClassIndex(67915);
        }

        f(KidsFeedViewModel kidsFeedViewModel) {
            this.f106226a = kidsFeedViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f106226a.f106215d.postValue(false);
        }
    }

    static final class g<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsFeedViewModel f106227a;

        static {
            Covode.recordClassIndex(67916);
        }

        g(KidsFeedViewModel kidsFeedViewModel) {
            this.f106227a = kidsFeedViewModel;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            p<? extends List<? extends Aweme>, Integer> pVar = (p) obj;
            l.d(pVar, "");
            return this.f106227a.a(pVar);
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsFeedViewModel f106229a;

        static {
            Covode.recordClassIndex(67918);
        }

        i(KidsFeedViewModel kidsFeedViewModel) {
            this.f106229a = kidsFeedViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f106229a.f106214c.postValue(-2);
        }
    }

    public KidsFeedViewModel(com.ss.android.ugc.aweme.kids.commonfeed.c.a aVar) {
        this.f106219h = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.p<? extends java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public final p<List<Aweme>, Integer> a(p<? extends List<? extends Aweme>, Integer> pVar) {
        int i2;
        if (((Number) pVar.getSecond()).intValue() != 0) {
            return pVar;
        }
        List<Aweme> a2 = this.f106220i.a((List) pVar.getFirst());
        if (a2.isEmpty()) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        return v.a(a2, Integer.valueOf(i2));
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsFeedViewModel f106222a;

        static {
            Covode.recordClassIndex(67911);
        }

        b(KidsFeedViewModel kidsFeedViewModel) {
            this.f106222a = kidsFeedViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.t<java.lang.Integer> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            p pVar = (p) obj;
            this.f106222a.f106213b.postValue(pVar.getSecond());
            if (((Number) pVar.getSecond()).intValue() == 0) {
                if (((List) pVar.getFirst()).isEmpty()) {
                    this.f106222a.f106213b.postValue(-1);
                } else {
                    this.f106222a.f106212a.postValue(n.g((Collection) pVar.getFirst()));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsFeedViewModel f106225a;

        static {
            Covode.recordClassIndex(67914);
        }

        e(KidsFeedViewModel kidsFeedViewModel) {
            this.f106225a = kidsFeedViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            p pVar = (p) obj;
            if (((List) pVar.getFirst()).isEmpty()) {
                this.f106225a.f106215d.postValue(false);
                return;
            }
            this.f106225a.f106215d.postValue(true);
            ArrayList arrayList = new ArrayList();
            List<Aweme> value = this.f106225a.f106212a.getValue();
            if (value == null) {
                value = z.INSTANCE;
            }
            arrayList.addAll(value);
            arrayList.addAll((Collection) pVar.getFirst());
            this.f106225a.f106212a.postValue(arrayList);
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsFeedViewModel f106228a;

        static {
            Covode.recordClassIndex(67917);
        }

        h(KidsFeedViewModel kidsFeedViewModel) {
            this.f106228a = kidsFeedViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.t<java.lang.Integer> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            p pVar = (p) obj;
            this.f106228a.f106214c.postValue(pVar.getSecond());
            if (((Number) pVar.getSecond()).intValue() == 0) {
                if (((List) pVar.getFirst()).isEmpty()) {
                    this.f106228a.f106214c.postValue(-1);
                } else {
                    this.f106228a.f106212a.postValue(n.g((Collection) pVar.getFirst()));
                }
            }
        }
    }
}
