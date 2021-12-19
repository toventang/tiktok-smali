package com.ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface ISDKService {

    public interface SplitCallback {

        public static final class DefaultImpls {
            static {
                Covode.recordClassIndex(79477);
            }

            public static boolean checkIsCanceled(SplitCallback splitCallback) {
                return false;
            }
        }

        static {
            Covode.recordClassIndex(79476);
        }

        boolean checkIsCanceled();

        void onFail();

        void onSuccess(int i2, int i3);
    }

    static {
        Covode.recordClassIndex(79475);
    }

    void split(Context context, int i2, String str, String str2, String str3, String str4, SplitCallback splitCallback);
}
