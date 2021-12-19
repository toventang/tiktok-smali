package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.cj;
import h.f.b.m;

public final class du {

    /* renamed from: a  reason: collision with root package name */
    public static final du f84112a = new du();

    private du() {
    }

    public static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f84113a = new a();

        static {
            Covode.recordClassIndex(52437);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(cj.a());
        }
    }

    public static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f84115a = new c();

        static {
            Covode.recordClassIndex(52439);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            g.a().B();
            return true;
        }
    }

    static {
        Covode.recordClassIndex(52436);
    }

    public static final class b extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f84114a = new b();

        static {
            Covode.recordClassIndex(52438);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(g.a().l().getMaxDurationResolver().getMaxShootingDuration());
        }
    }
}
