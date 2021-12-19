package com.ss.android.ugc.aweme.sharedar.network;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final h f124501a = i.a((h.f.a.a) C3254a.f124503a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f124502b = new a();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.network.a$a  reason: collision with other inner class name */
    static final class C3254a extends m implements h.f.a.a<API> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3254a f124503a = new C3254a();

        static {
            Covode.recordClassIndex(81764);
        }

        C3254a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ API invoke() {
            return g.a().C().createDefaultRetrofit(API.class);
        }
    }

    static {
        Covode.recordClassIndex(81763);
    }
}
