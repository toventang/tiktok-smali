package com.ss.android.ugc.aweme.challenge;

import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IChallengeDetailLegacyService;
import com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity;
import com.ss.android.ugc.aweme.search.h;
import com.ss.android.ugc.aweme.utils.az;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;

public class ChallengeDetailLegacyServiceImpl implements IChallengeDetailLegacyService {
    static {
        Covode.recordClassIndex(43088);
    }

    public static IChallengeDetailLegacyService a() {
        MethodCollector.i(3791);
        Object a2 = b.a(IChallengeDetailLegacyService.class, false);
        if (a2 != null) {
            IChallengeDetailLegacyService iChallengeDetailLegacyService = (IChallengeDetailLegacyService) a2;
            MethodCollector.o(3791);
            return iChallengeDetailLegacyService;
        }
        if (b.Z == null) {
            synchronized (IChallengeDetailLegacyService.class) {
                try {
                    if (b.Z == null) {
                        b.Z = new ChallengeDetailLegacyServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3791);
                    throw th;
                }
            }
        }
        ChallengeDetailLegacyServiceImpl challengeDetailLegacyServiceImpl = (ChallengeDetailLegacyServiceImpl) b.Z;
        MethodCollector.o(3791);
        return challengeDetailLegacyServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.IChallengeDetailLegacyService
    public final void a(ImageView imageView) {
        imageView.setImageResource(R.raw.icon_arrow_turn_up_right);
    }

    @Override // com.ss.android.ugc.aweme.IChallengeDetailLegacyService
    public final void a(Activity activity, Bundle bundle) {
        HeaderDetailActivity.a(activity, bundle);
    }

    @Override // com.ss.android.ugc.aweme.IChallengeDetailLegacyService
    public final void a(Context context, String str) {
        com.ss.android.ugc.aweme.aq.a.b.a(context, str);
    }

    @Override // com.ss.android.ugc.aweme.IChallengeDetailLegacyService
    public final void a(String str, String str2, String str3, boolean z) {
        h.f121133a.a(str, str2, str3, z);
    }

    @Override // com.ss.android.ugc.aweme.IChallengeDetailLegacyService
    public final void a(ViewGroup viewGroup, ImageView imageView, TextView textView, int i2, int i3, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        az.a(viewGroup, imageView, textView, i2, i3, z, z2, animatorListenerAdapter);
    }
}
