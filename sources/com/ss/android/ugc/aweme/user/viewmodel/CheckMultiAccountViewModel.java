package com.ss.android.ugc.aweme.user.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.user.c;
import com.ss.android.ugc.aweme.user.e;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class CheckMultiAccountViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final t<List<c>> f142430a;

    static {
        Covode.recordClassIndex(93154);
    }

    public CheckMultiAccountViewModel() {
        t<List<c>> tVar = new t<>();
        tVar.postValue(n.b(e.e(e.f142364k.e()), new c("-1", null, null, null, null, null, 0, 126)));
        this.f142430a = tVar;
    }

    public static final class a<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f142431a = new a();

        static {
            Covode.recordClassIndex(93155);
        }

        a() {
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            List list = (List) obj;
            l.b(list, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
    }
}
