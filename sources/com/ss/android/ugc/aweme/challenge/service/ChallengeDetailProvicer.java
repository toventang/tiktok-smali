package com.ss.android.ugc.aweme.challenge.service;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.ui.a.d;
import com.ss.android.ugc.aweme.challenge.ui.a.j;
import com.ss.android.ugc.aweme.challenge.ui.a.l;
import com.ss.android.ugc.aweme.commerce_challenge_api.c.a;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;

public class ChallengeDetailProvicer implements IChallengeDetailProvider {
    static {
        Covode.recordClassIndex(43181);
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider
    public final l a() {
        return new l() {
            /* class com.ss.android.ugc.aweme.challenge.service.ChallengeDetailProvicer.AnonymousClass1 */

            /* renamed from: b  reason: collision with root package name */
            private a f70012b = CommerceChallengeServiceImpl.e().a();

            static {
                Covode.recordClassIndex(43182);
            }

            @Override // com.ss.android.ugc.aweme.challenge.ui.a.l
            public final void a(float f2) {
                this.f70012b.a(f2);
            }

            @Override // com.ss.android.ugc.aweme.challenge.ui.a.l
            public final void a(ChallengeDetail challengeDetail) {
                this.f70012b.a(challengeDetail.challenge, challengeDetail.slideTitle, challengeDetail.slideList);
            }

            @Override // com.ss.android.ugc.aweme.challenge.ui.a.l
            public final void a(FrameLayout frameLayout, j jVar) {
                int i2;
                a aVar = this.f70012b;
                if (jVar.f70085c == d.TYPE_NORMAL) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                aVar.a(frameLayout, new com.ss.android.ugc.aweme.commerce_challenge_api.b.a(i2, jVar.f70086d));
                this.f70012b.c((ViewStub) frameLayout.findViewById(R.id.fl5));
                this.f70012b.a((ViewStub) frameLayout.findViewById(R.id.fkx));
                this.f70012b.d((ViewStub) frameLayout.findViewById(R.id.fky));
                this.f70012b.b((ViewStub) frameLayout.findViewById(R.id.fkz));
                if (jVar.f70085c == d.TYPE_TRANSFORM) {
                    this.f70012b.a(frameLayout.findViewById(R.id.eq7));
                    this.f70012b.a((CheckableImageView) frameLayout.findViewById(R.id.c2a));
                    this.f70012b.a((TextView) frameLayout.findViewById(R.id.f9x));
                }
            }
        };
    }

    public static IChallengeDetailProvider b() {
        MethodCollector.i(12463);
        Object a2 = b.a(IChallengeDetailProvider.class, false);
        if (a2 != null) {
            IChallengeDetailProvider iChallengeDetailProvider = (IChallengeDetailProvider) a2;
            MethodCollector.o(12463);
            return iChallengeDetailProvider;
        }
        if (b.ab == null) {
            synchronized (IChallengeDetailProvider.class) {
                try {
                    if (b.ab == null) {
                        b.ab = new ChallengeDetailProvicer();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12463);
                    throw th;
                }
            }
        }
        ChallengeDetailProvicer challengeDetailProvicer = (ChallengeDetailProvicer) b.ab;
        MethodCollector.o(12463);
        return challengeDetailProvicer;
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider
    public final void a(com.ss.android.ugc.aweme.challenge.c.b bVar) {
        com.ss.android.ugc.aweme.challenge.c.a.f69915a.a(bVar);
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider
    public final d a(View view, Fragment fragment) {
        return ((com.ss.android.ugc.aweme.challenge.c.b) com.ss.android.ugc.aweme.challenge.c.a.f69915a.a()).a(view, fragment);
    }
}
