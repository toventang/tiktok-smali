package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.concurrent.atomic.AtomicInteger;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f128533a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final h.h f128534b = i.a((h.f.a.a) a.f128535a);

    private h() {
    }

    static final class a extends m implements h.f.a.a<AtomicInteger> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f128535a = new a();

        static {
            Covode.recordClassIndex(84274);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AtomicInteger invoke() {
            return new AtomicInteger(0);
        }
    }

    static {
        Covode.recordClassIndex(84273);
    }

    public static final String a(String str) {
        l.d(str, "");
        String b2 = d.b(str + '_' + ((AtomicInteger) f128534b.getValue()).incrementAndGet());
        bj.a("AVSessionIDGenerator:generateSessionId for creationId:" + str + ",result:" + b2 + '.');
        l.b(b2, "");
        return b2;
    }
}
