package com.ss.android.ugc.aweme.challenge;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.challenge.ui.j;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class ChallengeDetailServiceImpl implements IChallengeDetailService {
    static {
        Covode.recordClassIndex(43093);
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final a<Aweme, ?> a() {
        return new com.ss.android.ugc.aweme.challenge.g.a();
    }

    public static IChallengeDetailService b() {
        MethodCollector.i(12727);
        Object a2 = b.a(IChallengeDetailService.class, false);
        if (a2 != null) {
            IChallengeDetailService iChallengeDetailService = (IChallengeDetailService) a2;
            MethodCollector.o(12727);
            return iChallengeDetailService;
        }
        if (b.aa == null) {
            synchronized (IChallengeDetailService.class) {
                try {
                    if (b.aa == null) {
                        b.aa = new ChallengeDetailServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12727);
                    throw th;
                }
            }
        }
        ChallengeDetailServiceImpl challengeDetailServiceImpl = (ChallengeDetailServiceImpl) b.aa;
        MethodCollector.o(12727);
        return challengeDetailServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final Fragment a(Intent intent) {
        l.d(intent, "");
        if (!MSAdaptionService.c().a(d.a())) {
            return null;
        }
        l.d(intent, "");
        j jVar = new j();
        jVar.setArguments(j.d.a(intent));
        return jVar;
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final void a(a<Aweme, ?> aVar, List<? extends Aweme> list) {
        if (aVar instanceof com.ss.android.ugc.aweme.challenge.g.a) {
            com.ss.android.ugc.aweme.challenge.g.a aVar2 = (com.ss.android.ugc.aweme.challenge.g.a) aVar;
            aVar2.setItems(new ArrayList(list));
            ((ChallengeAwemeList) aVar2.mData).cursor = (long) list.size();
        }
    }
}
