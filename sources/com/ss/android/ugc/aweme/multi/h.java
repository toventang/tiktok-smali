package com.ss.android.ugc.aweme.multi;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.experiment.dq;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.multi.maker.b;
import com.ss.android.ugc.aweme.multi.maker.c;
import com.ss.android.ugc.aweme.multi.maker.d;
import com.ss.android.ugc.aweme.multi.maker.f;
import com.ss.android.ugc.aweme.multi.maker.g;
import com.ss.android.ugc.aweme.multi.maker.i;
import com.ss.android.ugc.aweme.multi.maker.j;
import com.ss.android.ugc.aweme.multi.maker.k;
import com.ss.android.ugc.aweme.multi.maker.m;
import com.ss.android.ugc.aweme.multi.maker.p;
import com.ss.android.ugc.aweme.multi.maker.q;
import com.ss.android.ugc.aweme.multi.maker.r;
import com.ss.android.ugc.aweme.multi.maker.s;
import com.ss.android.ugc.aweme.multi.maker.t;
import com.ss.android.ugc.aweme.utils.in;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f110909a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(71155);
    }

    public static ArrayList<AnchorCommonStruct> a(List<AnchorCommonStruct> list) {
        l.d(list, "");
        ArrayList<AnchorCommonStruct> arrayList = new ArrayList<>();
        for (T t : list) {
            if (!a(t, arrayList)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(71156);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.c()), Integer.valueOf(t2.c()));
        }
    }

    private static boolean a(AnchorCommonStruct anchorCommonStruct, List<AnchorCommonStruct> list) {
        for (T t : list) {
            if (t != null) {
                if (!dq.a() || in.e()) {
                    if (l.a((Object) anchorCommonStruct.getId(), (Object) t.getId()) && l.a((Object) anchorCommonStruct.getKeyword(), (Object) t.getKeyword()) && anchorCommonStruct.getType() == ab.PROP.getTYPE()) {
                    }
                } else if (l.a((Object) anchorCommonStruct.getId(), (Object) t.getId()) && l.a((Object) anchorCommonStruct.getKeyword(), (Object) t.getKeyword())) {
                    if ((p.a.a(anchorCommonStruct.getExtra()) == 3 || p.a.a(t.getExtra()) == 3) && !l.a((Object) anchorCommonStruct.getExtra(), (Object) t.getExtra())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static List<c> a(Aweme aweme, boolean z, b bVar) {
        c cVar;
        l.d(aweme, "");
        l.d(bVar, "");
        ArrayList<c> d2 = n.d(new com.ss.android.ugc.aweme.multi.maker.l(), new m(), new r(), new t(), new s(), new i(), new g(), new p(), new b(), new f(), new com.ss.android.ugc.aweme.multi.maker.h(), new j(), new k(), new com.ss.android.ugc.aweme.multi.maker.n(), new d(), new q(), new c(), new com.ss.android.ugc.aweme.multi.maker.a());
        ArrayList arrayList = new ArrayList();
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors == null) {
            anchors = z.INSTANCE;
        }
        ArrayList<AnchorCommonStruct> a2 = a(new ArrayList(anchors));
        for (c cVar2 : d2) {
            if (!a2.isEmpty()) {
                if (!(cVar2 instanceof a)) {
                    cVar = null;
                } else {
                    cVar = cVar2;
                }
                a aVar = (a) cVar;
                if (aVar != null) {
                    aVar.f110876b = z;
                }
                cVar2.a(bVar);
                g a3 = cVar2.a(a2);
                while (a3 == g.PROCEED) {
                    arrayList.add(cVar2);
                    cVar2 = cVar2.i();
                    cVar2.a(bVar);
                    a3 = cVar2.a(a2);
                }
                if (a3 == g.DONE) {
                    arrayList.add(cVar2);
                }
            }
        }
        return n.g((Collection) n.a((Iterable) arrayList, (Comparator) new a()));
    }
}
