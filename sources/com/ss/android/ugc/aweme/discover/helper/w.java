package com.ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.a.n;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Iterator;
import java.util.List;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f81191a = new w();

    /* renamed from: b  reason: collision with root package name */
    private static final h f81192b = i.a((h.f.a.a) a.f81193a);

    private w() {
    }

    static final class a extends m implements h.f.a.a<IAwemeService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81193a = new a();

        static {
            Covode.recordClassIndex(50460);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAwemeService invoke() {
            return AwemeService.b();
        }
    }

    static {
        Covode.recordClassIndex(50459);
    }

    public static final void a(List<? extends SearchChallenge> list) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<Aweme> awemes = it.next().getAwemes();
                if (awemes != null) {
                    int i2 = 0;
                    for (T t : awemes) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            n.a();
                        }
                        awemes.set(i2, ((IAwemeService) f81192b.getValue()).a((Aweme) t));
                        i2 = i3;
                    }
                }
            }
        }
    }
}
