package com.ss.android.ugc.aweme.friends.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.friends.service.IFollowService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.presenter.o;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.b;

public class FollowService implements IFollowService {
    static {
        Covode.recordClassIndex(61686);
    }

    public static IFollowService createIFollowServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(11091);
        Object a2 = b.a(IFollowService.class, z);
        if (a2 != null) {
            IFollowService iFollowService = (IFollowService) a2;
            MethodCollector.o(11091);
            return iFollowService;
        }
        if (b.bu == null) {
            synchronized (IFollowService.class) {
                try {
                    if (b.bu == null) {
                        b.bu = new FollowService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11091);
                    throw th;
                }
            }
        }
        FollowService followService = (FollowService) b.bu;
        MethodCollector.o(11091);
        return followService;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFollowService
    public void sendRequest(String str, String str2, int i2, IFollowService.a aVar) {
        sendRequest(str, str2, i2, 0, aVar);
    }

    public void sendRequest(String str, String str2, int i2, int i3, final IFollowService.a aVar) {
        o oVar = new o();
        oVar.a_(new r() {
            /* class com.ss.android.ugc.aweme.friends.services.FollowService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(61687);
            }

            @Override // com.ss.android.ugc.aweme.profile.presenter.r
            public final void c(FollowStatus followStatus) {
            }

            @Override // com.ss.android.ugc.aweme.profile.presenter.r
            public final void b(FollowStatus followStatus) {
                IFollowService.a aVar = aVar;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // com.ss.android.ugc.aweme.profile.presenter.r
            public final void d_(Exception exc) {
                IFollowService.a aVar = aVar;
                if (aVar != null) {
                    aVar.a(exc);
                }
            }
        });
        oVar.a(new n.a().a(str).b(str2).a(i2).b(i3).a());
    }
}
