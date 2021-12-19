package com.appsflyer;

import com.bytedance.covode.number.Covode;

final class AFFacebookDeferredDeeplink {

    public interface AppLinkFetchEvents {
        static {
            Covode.recordClassIndex(2646);
        }

        void onAppLinkFetchFailed(String str);

        void onAppLinkFetchFinished(String str, String str2, String str3);
    }

    static {
        Covode.recordClassIndex(2644);
    }

    AFFacebookDeferredDeeplink() {
    }
}
