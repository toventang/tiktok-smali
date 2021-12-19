package com.ss.android.ugc.aweme.story.edit.business.shared.a;

import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import h.f.b.m;
import h.h;
import h.i;

public final class c extends com.ss.android.ugc.aweme.filter.d.a.c {

    /* renamed from: b  reason: collision with root package name */
    private final q<String> f137175b = b.f137178a;

    /* renamed from: c  reason: collision with root package name */
    private final h f137176c = i.a((h.f.a.a) a.f137177a);

    static final class b<T> implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final b f137178a = new b();

        static {
            Covode.recordClassIndex(89706);
        }

        b() {
        }

        @Override // com.google.c.a.q
        public final /* bridge */ /* synthetic */ Object b() {
            return "story-filter";
        }
    }

    static {
        Covode.recordClassIndex(89704);
    }

    @Override // com.ss.android.ugc.aweme.filter.d.a, com.ss.android.ugc.aweme.filter.d.a.c
    public final com.ss.android.ugc.aweme.filter.d.c c() {
        return (com.ss.android.ugc.aweme.filter.d.c) this.f137176c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.filter.d.a, com.ss.android.ugc.aweme.filter.d.a.c
    public final q<String> h() {
        return this.f137175b;
    }

    static final class a extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f137177a = new a();

        static {
            Covode.recordClassIndex(89705);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d();
        }
    }
}
