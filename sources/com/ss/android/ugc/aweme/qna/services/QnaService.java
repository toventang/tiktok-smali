package com.ss.android.ugc.aweme.qna.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.question.b.a;
import com.ss.android.ugc.aweme.question.e.a;
import com.ss.android.ugc.aweme.services.IQnaService;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.List;

public final class QnaService implements IQnaService {
    static {
        Covode.recordClassIndex(77671);
    }

    public static IQnaService a() {
        Object a2 = b.a(IQnaService.class, false);
        if (a2 != null) {
            return (IQnaService) a2;
        }
        return new QnaService();
    }

    @Override // com.ss.android.ugc.aweme.services.IQnaService
    public final boolean enablePublicQna() {
        if (!com.bytedance.ies.abmock.b.a().a(true, "public_qna_enabled", false) || !a.f119907a) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.IQnaService
    public final void setQuestionAwemeListCacheCache(long j2, int i2, int i3, List<? extends Aweme> list) {
        l.d(list, "");
        a.C3094a aVar = new a.C3094a();
        aVar.f119960a = i3;
        aVar.f119961b = i2;
        aVar.f119962c = j2;
        com.ss.android.ugc.aweme.question.api.b bVar = new com.ss.android.ugc.aweme.question.api.b();
        bVar.setCursor(Integer.valueOf(i2));
        bVar.setHasMore((Integer) 1);
        bVar.setVideos(list);
        com.ss.android.ugc.aweme.question.a.a.a(aVar, bVar);
    }
}
