package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.HashSet;
import java.util.Set;

public final class bq {

    /* renamed from: a  reason: collision with root package name */
    public static final bq f75693a = new bq();

    /* renamed from: b  reason: collision with root package name */
    private static final String f75694b = "discard_cid_list_key";

    /* renamed from: c  reason: collision with root package name */
    private static final h f75695c = i.a((h.f.a.a) a.f75698a);

    /* renamed from: d  reason: collision with root package name */
    private static boolean f75696d = true;

    /* renamed from: e  reason: collision with root package name */
    private static String f75697e;

    private bq() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75698a = new a();

        static {
            Covode.recordClassIndex(46689);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("undisplay_ad_keva_name");
        }
    }

    static {
        Covode.recordClassIndex(46688);
    }

    public static String a(Set<Long> set) {
        l.d(set, "");
        HashSet<Long> hashSet = new HashSet(set);
        StringBuilder sb = new StringBuilder();
        for (Long l2 : hashSet) {
            l.b(l2, "");
            sb.append(l2.longValue());
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(p.f(sb));
        }
        f75697e = sb.toString();
        ((Keva) f75695c.getValue()).storeString(f75694b, f75697e);
        return f75697e;
    }
}
