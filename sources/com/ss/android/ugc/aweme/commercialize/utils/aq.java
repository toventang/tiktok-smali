package com.ss.android.ugc.aweme.commercialize.utils;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class aq {

    final /* synthetic */ class b implements Callable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f75610a;

        static {
            Covode.recordClassIndex(46638);
        }

        b(h.f.a.a aVar) {
            this.f75610a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f75610a.invoke();
        }
    }

    static {
        Covode.recordClassIndex(46636);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f75609a;

        static {
            Covode.recordClassIndex(46637);
        }

        a(h.f.a.a aVar) {
            this.f75609a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f75609a.invoke();
            return z.f158842a;
        }
    }

    public static final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        i.b(new a(aVar), i.f4826c);
    }

    public static final boolean a(Aweme aweme) {
        l.d(aweme, "");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || !awemeRawAd.isHardAd()) {
            return false;
        }
        return true;
    }
}
