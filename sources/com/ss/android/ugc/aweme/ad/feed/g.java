package com.ss.android.ugc.aweme.ad.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f65856a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(40522);
    }

    public static String a() {
        String predictLabelResult = SmartFeedAdUIService.b.f110383a.getPredictLabelResult();
        if (predictLabelResult != null) {
            return predictLabelResult;
        }
        return null;
    }

    public static int c() {
        CommerceSmartUITasks b2 = b();
        if (b2 != null) {
            return b2.getAdCardDelay();
        }
        return -100;
    }

    public static CommerceSmartUITasks b() {
        CommerceSmartUITasks predictTaskIndex;
        if (SmartFeedAdUIService.b.f110383a.getSmartAdUIExperimentValue() == null || a() == null || (predictTaskIndex = SmartFeedAdUIService.b.f110383a.getPredictTaskIndex()) == null) {
            return null;
        }
        return predictTaskIndex;
    }
}
