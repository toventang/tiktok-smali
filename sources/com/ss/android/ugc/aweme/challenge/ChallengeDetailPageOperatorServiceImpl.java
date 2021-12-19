package com.ss.android.ugc.aweme.challenge;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.ab;
import com.ss.android.ugc.aweme.detail.operators.g;
import com.ss.android.ugc.aweme.detail.operators.h;
import h.f.b.l;
import java.util.HashMap;

public final class ChallengeDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(43089);
    }

    public static final class a implements ab {
        static {
            Covode.recordClassIndex(43090);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new h(aVar, "from_discovery_challenge");
        }
    }

    public static final class b implements ab {
        static {
            Covode.recordClassIndex(43091);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new h(aVar, "from_challenge");
        }
    }

    public static final class c implements ab {
        static {
            Covode.recordClassIndex(43092);
        }

        c() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new g();
        }
    }

    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, ab> a() {
        HashMap<String, ab> hashMap = new HashMap<>();
        hashMap.put("from_discovery_challenge", new a());
        hashMap.put("from_challenge", new b());
        hashMap.put("from_search_recalled_challenge", new c());
        return hashMap;
    }
}
