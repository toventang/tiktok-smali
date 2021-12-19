package com.ss.android.ugc.aweme.challenge.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.challenge.service.IChallengeService;
import com.ss.android.ugc.aweme.challenge.service.a;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.b;

public class ChallengeServiceImpl implements IChallengeService {

    /* renamed from: a  reason: collision with root package name */
    private final IChallengeService f70013a = a.C1586a.f70014a;

    static {
        Covode.recordClassIndex(43183);
    }

    public static IChallengeService a() {
        MethodCollector.i(11025);
        Object a2 = b.a(IChallengeService.class, false);
        if (a2 != null) {
            IChallengeService iChallengeService = (IChallengeService) a2;
            MethodCollector.o(11025);
            return iChallengeService;
        }
        if (b.ac == null) {
            synchronized (IChallengeService.class) {
                try {
                    if (b.ac == null) {
                        b.ac = new ChallengeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11025);
                    throw th;
                }
            }
        }
        ChallengeServiceImpl challengeServiceImpl = (ChallengeServiceImpl) b.ac;
        MethodCollector.o(11025);
        return challengeServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final void a(String str, String str2, String str3, Music music, IChallengeService.a aVar) {
        this.f70013a.a(str, str2, str3, music, aVar);
    }
}
