package com.ss.android.ugc.aweme.port.in;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static volatile h.f.a.a<? extends u> f115639a;

    /* renamed from: b  reason: collision with root package name */
    public static final g f115640b = new g();

    /* renamed from: c  reason: collision with root package name */
    private static final h f115641c = i.a((h.f.a.a) a.f115642a);

    public static u a() {
        return (u) f115641c.getValue();
    }

    private g() {
    }

    static final class a extends m implements h.f.a.a<u> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f115642a = new a();

        static {
            Covode.recordClassIndex(74590);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ u invoke() {
            h.f.a.a<? extends u> aVar = g.f115639a;
            if (aVar == null) {
                l.a("block");
            }
            return aVar.invoke();
        }
    }

    static {
        Covode.recordClassIndex(74589);
    }
}
