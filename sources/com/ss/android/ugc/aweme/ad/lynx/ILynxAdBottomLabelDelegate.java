package com.ss.android.ugc.aweme.ad.lynx;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;

public interface ILynxAdBottomLabelDelegate {
    static {
        Covode.recordClassIndex(40630);
    }

    void bind(View view, String str, String str2, Bundle bundle);
}
