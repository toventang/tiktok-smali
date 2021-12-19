package com.ss.android.ugc.aweme.question;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.ab;
import h.f.b.l;
import java.util.HashMap;

public final class QuestionDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(77894);
    }

    public static final class a implements ab {
        static {
            Covode.recordClassIndex(77895);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new com.ss.android.ugc.aweme.question.d.a(aVar, "from_question");
        }
    }

    public static final class b implements ab {
        static {
            Covode.recordClassIndex(77896);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new com.ss.android.ugc.aweme.question.d.a(aVar, "qa_detail");
        }
    }

    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, ab> a() {
        HashMap<String, ab> hashMap = new HashMap<>();
        hashMap.put("from_question", new a());
        hashMap.put("qa_detail", new b());
        return hashMap;
    }
}
