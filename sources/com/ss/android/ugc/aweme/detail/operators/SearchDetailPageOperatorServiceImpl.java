package com.ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel;
import h.f.b.l;
import java.util.HashMap;

public final class SearchDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(49610);
    }

    public static final class a implements ab {
        static {
            Covode.recordClassIndex(49611);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new v(aVar);
        }
    }

    public static final class b implements ab {
        static {
            Covode.recordClassIndex(49612);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new p((SearchJediViewModel) jediViewModel);
        }
    }

    public static final class c implements ab {
        static {
            Covode.recordClassIndex(49613);
        }

        c() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new w(aVar);
        }
    }

    public static final class d implements ab {
        static {
            Covode.recordClassIndex(49614);
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new ag(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, ab> a() {
        HashMap<String, ab> hashMap = new HashMap<>();
        hashMap.put("from_search", new a());
        hashMap.put("from_search_jedi", new b());
        hashMap.put("from_search_mix", new c());
        hashMap.put("from_search_continuous_loading_card", new d());
        return hashMap;
    }
}
