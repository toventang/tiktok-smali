package com.ss.android.ugc.aweme.feed.operator;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.ab;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class FollowFeedDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(59569);
    }

    public static final class a implements ab {
        static {
            Covode.recordClassIndex(59570);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            List<String> uidList = bVar.getUidList();
            l.b(uidList, "");
            List<String> blueDotList = bVar.getBlueDotList();
            l.b(blueDotList, "");
            return new a(uidList, blueDotList);
        }
    }

    public static final class b implements ab {
        static {
            Covode.recordClassIndex(59571);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new com.ss.android.ugc.aweme.detail.operators.l(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, ab> a() {
        HashMap<String, ab> hashMap = new HashMap<>();
        hashMap.put("from_following_sky_light", new a());
        hashMap.put("from_follow_page", new b());
        return hashMap;
    }
}
