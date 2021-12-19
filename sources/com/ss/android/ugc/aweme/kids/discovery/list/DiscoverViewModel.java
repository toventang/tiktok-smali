package com.ss.android.ugc.aweme.kids.discovery.list;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import com.ss.android.ugc.aweme.kids.discovery.api.DiscoverApiKid;
import f.a.d.f;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class DiscoverViewModel extends ac {

    /* renamed from: g  reason: collision with root package name */
    public static final a f106476g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final DiscoverApiKid f106477a = DiscoverApiKid.a.f106423a;

    /* renamed from: b  reason: collision with root package name */
    public final t<Boolean> f106478b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<Boolean> f106479c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final t<Boolean> f106480d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public final t<List<com.ss.android.ugc.aweme.kids.discovery.c.a>> f106481e = new t<>();

    /* renamed from: f  reason: collision with root package name */
    public int f106482f;

    /* renamed from: h  reason: collision with root package name */
    private final IReportAwemeManager f106483h = ReportAwemeManager.a();

    static {
        Covode.recordClassIndex(68041);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68042);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        this.f106482f = -1;
        long currentTimeMillis = System.currentTimeMillis();
        this.f106477a.getCategoryV2List(-1, 10, 0).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new d(this, currentTimeMillis), new e(this, currentTimeMillis));
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DiscoverViewModel f106486a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106487b;

        static {
            Covode.recordClassIndex(68044);
        }

        c(DiscoverViewModel discoverViewModel, long j2) {
            this.f106486a = discoverViewModel;
            this.f106487b = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f106486a.f106480d.postValue(false);
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_api_category_list", 2, -1, this.f106487b);
        }
    }

    static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DiscoverViewModel f106490a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106491b;

        static {
            Covode.recordClassIndex(68046);
        }

        e(DiscoverViewModel discoverViewModel, long j2) {
            this.f106490a = discoverViewModel;
            this.f106491b = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f106490a.f106479c.postValue(false);
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_api_category_list", 1, -1, this.f106491b);
        }
    }

    public final boolean a(com.ss.android.ugc.aweme.kids.discovery.c.a aVar) {
        IReportAwemeManager iReportAwemeManager = this.f106483h;
        List<? extends Aweme> list = aVar.f106427a;
        if (list == null) {
            list = z.INSTANCE;
        }
        return iReportAwemeManager.a(list).isEmpty();
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DiscoverViewModel f106484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106485b;

        static {
            Covode.recordClassIndex(68043);
        }

        b(DiscoverViewModel discoverViewModel, long j2) {
            this.f106484a = discoverViewModel;
            this.f106485b = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.kids.discovery.c.b bVar = (com.ss.android.ugc.aweme.kids.discovery.c.b) obj;
            ArrayList arrayList = new ArrayList();
            List<com.ss.android.ugc.aweme.kids.discovery.c.a> value = this.f106484a.f106481e.getValue();
            if (value != null) {
                l.b(value, "");
                arrayList.addAll(value);
            }
            Iterable iterable = bVar.f106430a;
            if (iterable == null) {
                iterable = z.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList();
            for (T t : iterable) {
                if (true ^ this.f106484a.a(t)) {
                    arrayList2.add(t);
                }
            }
            arrayList.addAll(arrayList2);
            this.f106484a.f106481e.postValue(arrayList);
            this.f106484a.f106480d.postValue(true);
            this.f106484a.f106478b.postValue(Boolean.valueOf(bVar.a()));
            this.f106484a.f106482f = bVar.f106432c;
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_api_category_list", 2, 0, this.f106485b);
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DiscoverViewModel f106488a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f106489b;

        static {
            Covode.recordClassIndex(68045);
        }

        d(DiscoverViewModel discoverViewModel, long j2) {
            this.f106488a = discoverViewModel;
            this.f106489b = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.kids.discovery.c.b bVar = (com.ss.android.ugc.aweme.kids.discovery.c.b) obj;
            t<List<com.ss.android.ugc.aweme.kids.discovery.c.a>> tVar = this.f106488a.f106481e;
            Iterable iterable = bVar.f106430a;
            if (iterable == null) {
                iterable = z.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (T t : iterable) {
                if (true ^ this.f106488a.a(t)) {
                    arrayList.add(t);
                }
            }
            tVar.postValue(n.g((Collection) arrayList));
            this.f106488a.f106479c.postValue(true);
            this.f106488a.f106478b.postValue(Boolean.valueOf(bVar.a()));
            this.f106488a.f106482f = bVar.f106432c;
            com.ss.android.ugc.aweme.kids.common.c.e.a("kids_api_category_list", 1, 0, this.f106489b);
        }
    }
}
