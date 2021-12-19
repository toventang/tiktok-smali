package com.ss.android.ugc.aweme;

import android.app.Activity;
import b.i;
import com.bytedance.covode.number.Covode;

public interface cb {

    public enum a {
        SMS,
        EMAIL,
        PASSWORD;

        static {
            Covode.recordClassIndex(43017);
        }
    }

    static {
        Covode.recordClassIndex(43016);
    }

    i<Boolean> getSafeInfo();

    int getTwoStepVerificationStatusFromLocal();

    i<Boolean> getTwoStepVerificationStatusFromNetwork();

    void handlePushChallengeInfo(String str, String str2);

    void onOpenPushChallengePage(String str);

    void openTwoStepVerificationManageActivity(Activity activity, String str);
}
