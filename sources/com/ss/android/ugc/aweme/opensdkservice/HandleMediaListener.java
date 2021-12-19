package com.ss.android.ugc.aweme.opensdkservice;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public interface HandleMediaListener {
    static {
        Covode.recordClassIndex(73717);
    }

    void onArgsError();

    void onGetImagePath(ArrayList<String> arrayList);

    void onGetVideoPath(ArrayList<String> arrayList);
}
