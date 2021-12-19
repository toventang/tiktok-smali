package com.ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final h f66445a = i.a((h.f.a.a) a.f66447a);

    /* renamed from: b  reason: collision with root package name */
    public static final b f66446b = new b();

    private b() {
    }

    static final class a extends m implements h.f.a.a<IAppWidgetApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66447a = new a();

        static {
            Covode.recordClassIndex(40837);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAppWidgetApi invoke() {
            return RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(IAppWidgetApi.class);
        }
    }

    static {
        Covode.recordClassIndex(40836);
    }
}
