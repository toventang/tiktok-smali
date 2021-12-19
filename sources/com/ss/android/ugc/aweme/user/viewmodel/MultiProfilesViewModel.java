package com.ss.android.ugc.aweme.user.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.aa;
import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.ss.android.ugc.aweme.user.c;
import com.ss.android.ugc.aweme.user.e;
import com.ss.android.ugc.aweme.user.f;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class MultiProfilesViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final e f142432a = e.f142364k;

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<List<c>> f142433b;

    static {
        Covode.recordClassIndex(93156);
    }

    public MultiProfilesViewModel() {
        LiveData<List<c>> a2 = aa.a(f.f142378c, a.f142434a);
        l.b(a2, "");
        this.f142433b = a2;
    }

    static final class a<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f142434a = new a();

        static {
            Covode.recordClassIndex(93157);
        }

        a() {
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            List<String> list = (List) obj;
            l.b(list, "");
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                c e2 = e.e(str);
                if (e2 != null) {
                    arrayList.add(e2);
                }
            }
            return arrayList;
        }
    }

    public static final class b<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiProfilesViewModel f142435a;

        static {
            Covode.recordClassIndex(93158);
        }

        public b(MultiProfilesViewModel multiProfilesViewModel) {
            this.f142435a = multiProfilesViewModel;
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            List list = (List) obj;
            l.b(list, "");
            String e2 = this.f142435a.f142432a.e();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (l.a((Object) ((c) next).f142345a, (Object) e2)) {
                        if (next != null) {
                            List a2 = n.a(next);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (!l.a((Object) ((c) obj2).f142345a, (Object) e2)) {
                                    arrayList.add(obj2);
                                }
                            }
                            list = n.d((Collection) a2, (Iterable) arrayList);
                        }
                    }
                }
            }
            MultiAccountService.c();
            if (list.size() < 8) {
                return n.d((Collection) list, (Iterable) n.a(new c("-1", null, null, null, null, null, 0, 126)));
            }
            return list;
        }
    }
}
