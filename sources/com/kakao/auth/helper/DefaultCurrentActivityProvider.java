package com.kakao.auth.helper;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public class DefaultCurrentActivityProvider implements CurrentActivityProvider {
    public Activity currentActivity;

    static {
        Covode.recordClassIndex(34318);
    }

    @Override // com.kakao.auth.helper.CurrentActivityProvider
    public Activity getCurrentActivity() {
        return this.currentActivity;
    }

    DefaultCurrentActivityProvider(Application application) {
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            /* class com.kakao.auth.helper.DefaultCurrentActivityProvider.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34319);
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public void onActivityDestroyed(Activity activity) {
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStarted(Activity activity) {
            }

            public void onActivityStopped(Activity activity) {
            }

            public void onActivityResumed(Activity activity) {
                DefaultCurrentActivityProvider.this.currentActivity = activity;
            }

            public void onActivityPaused(Activity activity) {
                if (activity != null && activity.equals(DefaultCurrentActivityProvider.this.currentActivity)) {
                    DefaultCurrentActivityProvider.this.currentActivity = null;
                }
            }
        });
    }
}
