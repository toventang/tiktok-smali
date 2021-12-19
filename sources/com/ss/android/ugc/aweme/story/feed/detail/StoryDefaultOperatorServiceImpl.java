package com.ss.android.ugc.aweme.story.feed.detail;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.ab;
import com.ss.android.ugc.aweme.story.avatar.n;
import h.f.b.l;
import java.util.HashMap;

public final class StoryDefaultOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(90100);
    }

    public static final class a implements ab {
        static {
            Covode.recordClassIndex(90101);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new a();
        }
    }

    public static final class b implements ab {
        static {
            Covode.recordClassIndex(90102);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new b();
        }
    }

    public static final class c implements ab {
        static {
            Covode.recordClassIndex(90103);
        }

        c() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new n(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, ab> a() {
        HashMap<String, ab> hashMap = new HashMap<>();
        hashMap.put("STORY_ENTRANCE_DEFAULT", new a());
        hashMap.put("STORY_ENTRANCE_COMMON", new b());
        c cVar = new c();
        hashMap.put("STORY_ENTRANCE_MINE", cVar);
        hashMap.put("STORY_ENTRANCE_OTHER", cVar);
        hashMap.put("STORY_ENTRANCE_AVATAR", cVar);
        hashMap.put("STORY_ENTRANCE_PREVIEW", cVar);
        return hashMap;
    }
}
