package com.bytedance.router;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

public interface OpenResultCallback {
    static {
        Covode.recordClassIndex(26112);
    }

    void onActionResult(Object obj);

    void onEmpty();

    void onFail(String str, String str2);

    void onIntercept(String str);

    void onMatched(String str);

    void onMissed(String str);

    void onOpen(Intent intent);

    void onSuccess(Intent intent);
}
