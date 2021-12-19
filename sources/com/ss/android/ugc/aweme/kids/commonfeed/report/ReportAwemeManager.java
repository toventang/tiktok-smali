package com.ss.android.ugc.aweme.kids.commonfeed.report;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.ss.android.ugc.b;
import h.a.i;
import h.a.n;
import h.f.b.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class ReportAwemeManager implements IReportAwemeManager {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106153a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static final a f106154b = new a();

    public static final class a {
        static {
            Covode.recordClassIndex(67886);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(67885);
    }

    public static IReportAwemeManager a() {
        MethodCollector.i(4823);
        Object a2 = b.a(IReportAwemeManager.class, false);
        if (a2 != null) {
            IReportAwemeManager iReportAwemeManager = (IReportAwemeManager) a2;
            MethodCollector.o(4823);
            return iReportAwemeManager;
        }
        if (b.bP == null) {
            synchronized (IReportAwemeManager.class) {
                try {
                    if (b.bP == null) {
                        b.bP = new ReportAwemeManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4823);
                    throw th;
                }
            }
        }
        ReportAwemeManager reportAwemeManager = (ReportAwemeManager) b.bP;
        MethodCollector.o(4823);
        return reportAwemeManager;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager
    public final List<Aweme> a(List<? extends Aweme> list) {
        String[] a2;
        Set l2;
        l.d(list, "");
        List<Aweme> g2 = n.g((Collection) list);
        Iterator<Aweme> it = g2.iterator();
        while (it.hasNext()) {
            String aid = it.next().getAid();
            l.b(aid, "");
            a aVar = f106154b;
            if (aVar.f106158c != null) {
                a2 = aVar.f106158c;
            } else {
                a2 = aVar.a();
            }
            if (!(a2 == null || (l2 = i.l(a2)) == null || !l2.contains(aid))) {
                it.remove();
            }
        }
        return g2;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager
    public final void a(String str) {
        l.d(str, "");
        a aVar = f106154b;
        l.d(str, "");
        if (aVar.f106157b.getStringArray("report_aweme_list", null) == null) {
            List c2 = n.c(str);
            Keva keva = aVar.f106157b;
            Object[] array = c2.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            keva.storeStringArray("report_aweme_list", (String[]) array);
            return;
        }
        String[] stringArray = aVar.f106157b.getStringArray("report_aweme_list", null);
        l.b(stringArray, "");
        aVar.f106156a = i.k(stringArray);
        List<String> list = aVar.f106156a;
        if (list != null) {
            list.add(str);
            Keva keva2 = aVar.f106157b;
            Object[] array2 = list.toArray(new String[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
            keva2.storeStringArray("report_aweme_list", (String[]) array2);
        }
    }
}
