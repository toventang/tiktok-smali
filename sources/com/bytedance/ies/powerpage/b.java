package com.bytedance.ies.powerpage;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public interface b {
    static {
        Covode.recordClassIndex(20575);
    }

    void onActivityResult_Activity(int i2, int i3, Intent intent);

    void onBackPressed_Activity();

    void onBeforeActivityCreated(Activity activity);

    void onNewIntent(Intent intent);
}
