package com.ss.android.ugc.aweme.turbo.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface ITurboApi {
    static {
        Covode.recordClassIndex(92391);
    }

    void applicationOnCreate(Context context, String str);

    void bootFinish(Context context);

    void mainOnCreate();

    void openCamera();

    void recordEnd();

    void recordStart();

    void startNewPage(String str);

    void videoComposeEnd();

    void videoComposeStart();

    void videoPlayEnd();

    void videoPlayStart();

    void waterMarkEnd();

    void waterMarkStart();
}
