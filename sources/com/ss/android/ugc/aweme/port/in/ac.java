package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.services.shoutout.AVAnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;

public interface ac extends r {
    static {
        Covode.recordClassIndex(74514);
    }

    ad a(BaseShortVideoContext baseShortVideoContext);

    String a(Context context);

    void a(Activity activity);

    void a(Activity activity, ad adVar, String str, int i2);

    void a(String str);

    boolean a();

    boolean a(ad adVar);

    AVAnchorPublishStruct b();

    void b(BaseShortVideoContext baseShortVideoContext);

    boolean b(Context context);

    void c();
}
