package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class m extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f95451a = new a((byte) 0);

    static {
        Covode.recordClassIndex(60467);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String a() {
        return "recharge";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60468);
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
        List<com.ss.android.ugc.aweme.runtime.behavior.c> a2 = com.ss.android.ugc.aweme.feedback.runtime.behavior.b.a("recharge_fail", System.currentTimeMillis() - b());
        return "recharge_fail_list: [" + n.a(n.a((Iterable) n.g((Collection) a2), (Comparator) new b()).subList(0, Math.min(a2.size(), 10)), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, c.f95452a, 31) + ']';
    }

    static final class c extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.runtime.behavior.c, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f95452a = new c();

        static {
            Covode.recordClassIndex(60470);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(com.ss.android.ugc.aweme.runtime.behavior.c cVar) {
            com.ss.android.ugc.aweme.runtime.behavior.c cVar2 = cVar;
            l.d(cVar2, "");
            return cVar2.f120725d;
        }
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final boolean a(String str) {
        l.d(str, "");
        if (str.hashCode() == 2085626294 && str.equals("recharge_fail")) {
            return true;
        }
        return false;
    }

    public static final class b<T> implements Comparator {
        static {
            Covode.recordClassIndex(60469);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Long.valueOf(t2.f120724c), Long.valueOf(t.f120724c));
        }
    }
}
