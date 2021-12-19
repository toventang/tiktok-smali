package com.ss.android.ugc.aweme.preinstall.brand;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface ITranssonicService {
    static {
        Covode.recordClassIndex(74662);
    }

    void applicationOnCreate(Context context, String str);

    void mainOnCreate();

    void onVideoPlayBlock();

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
