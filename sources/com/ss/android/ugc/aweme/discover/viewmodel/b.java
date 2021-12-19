package com.ss.android.ugc.aweme.discover.viewmodel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.f;

public final class b implements com.bytedance.assem.arch.a.a<c> {

    /* renamed from: a  reason: collision with root package name */
    public final c f82817a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.feed.u.a f82818b = new com.ss.android.ugc.aweme.feed.u.a();

    static {
        Covode.recordClassIndex(51610);
    }

    public static final class a implements c {
        static {
            Covode.recordClassIndex(51611);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.discover.viewmodel.c
        public final Object a(f fVar) {
            return SearchApi.c(fVar);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ c a() {
        return this.f82817a;
    }
}
