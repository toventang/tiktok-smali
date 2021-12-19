package com.ss.android.ugc.aweme.feed.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f92740a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final h f92741b = i.a((h.f.a.a) a.f92742a);

    public static Keva a() {
        return (Keva) f92741b.getValue();
    }

    private k() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f92742a = new a();

        static {
            Covode.recordClassIndex(58822);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("repo_multi_process_mob_event", 1);
        }
    }

    static {
        Covode.recordClassIndex(58821);
    }
}
