package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Intent;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;

public interface IPhotoMvFailsStrategy {
    static {
        Covode.recordClassIndex(84546);
    }

    void multiPicOriginStrategy(e eVar, int i2, int i3, Intent intent);

    void singlePicOriginStrategy(e eVar, int i2, int i3, Intent intent);
}
