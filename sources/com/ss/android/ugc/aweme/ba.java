package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class ba {

    /* renamed from: a  reason: collision with root package name */
    public static final ba f67862a = new ba();

    /* renamed from: b  reason: collision with root package name */
    private static final h f67863b = i.a((h.f.a.a) a.f67864a);

    public static DetailFeedService a() {
        return (DetailFeedService) f67863b.getValue();
    }

    private ba() {
    }

    static final class a extends m implements h.f.a.a<DetailFeedService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f67864a = new a();

        static {
            Covode.recordClassIndex(41771);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DetailFeedService invoke() {
            return DetailFeedServiceImpl.b();
        }
    }

    static {
        Covode.recordClassIndex(41770);
    }
}
