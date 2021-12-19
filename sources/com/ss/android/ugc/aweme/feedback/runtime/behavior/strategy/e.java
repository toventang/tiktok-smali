package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.b;
import com.ss.android.ugc.aweme.runtime.behavior.c;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class e extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f95418a = new a((byte) 0);

    static {
        Covode.recordClassIndex(60434);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String a() {
        return "abor_draft_operation";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60435);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final long b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String c() {
        long currentTimeMillis = System.currentTimeMillis() - b();
        List<c> a2 = b.a("draft_load_success", currentTimeMillis);
        List<c> a3 = b.a("draft_load_error", currentTimeMillis);
        List<c> a4 = b.a("draft_save_success", currentTimeMillis);
        List<c> a5 = b.a("draft_save_error", currentTimeMillis);
        List<c> a6 = b.a("draft_delete_success", currentTimeMillis);
        List<c> a7 = b.a("draft_delete_error", currentTimeMillis);
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = a3.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(new DraftOperationCode(it.next().f120725d));
        }
        arrayList.add(new DraftOperationLog("draft_load", linkedHashSet.size() + a2.size(), n.k(linkedHashSet), a2.size()));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator<T> it2 = a5.iterator();
        while (it2.hasNext()) {
            linkedHashSet2.add(new DraftOperationCode(it2.next().f120725d));
        }
        arrayList.add(new DraftOperationLog("draft_save", a4.size() + linkedHashSet2.size(), n.k(linkedHashSet2), a4.size()));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator<T> it3 = a7.iterator();
        while (it3.hasNext()) {
            linkedHashSet3.add(new DraftOperationCode(it3.next().f120725d));
        }
        arrayList.add(new DraftOperationLog("draft_delete", a6.size() + linkedHashSet3.size(), n.k(linkedHashSet3), a6.size()));
        GsonProvider c2 = GsonHolder.c();
        l.b(c2, "");
        String b2 = c2.b().b(arrayList);
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final boolean a(String str) {
        l.d(str, "");
        switch (str.hashCode()) {
            case -2112523571:
                if (str.equals("draft_load_error")) {
                    return true;
                }
                return false;
            case -1144329134:
                if (str.equals("draft_delete_error")) {
                    return true;
                }
                return false;
            case -826777052:
                if (str.equals("draft_save_error")) {
                    return true;
                }
                return false;
            case -576852019:
                if (str.equals("draft_delete_success")) {
                    return true;
                }
                return false;
            case -351979233:
                if (str.equals("draft_save_success")) {
                    return true;
                }
                return false;
            case 996197256:
                if (str.equals("draft_load_success")) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
