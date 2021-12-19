package com.ss.android.ugc.aweme.shortvideo.r;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.z;

public interface b {

    public static final class a {
        static {
            Covode.recordClassIndex(85294);
        }
    }

    static {
        Covode.recordClassIndex(85293);
    }

    Intent a(Activity activity, Bundle bundle);

    void a(Activity activity, Intent intent);

    void a(Activity activity, Intent intent, int i2);

    void a(Activity activity, Intent intent, boolean z);

    void a(Activity activity, Bundle bundle, int i2, int i3);

    void a(Activity activity, MediaModel mediaModel, Effect effect, ShortVideoCommonParams shortVideoCommonParams);

    void a(Activity activity, StitchParams stitchParams, String str);

    void a(Context context, Intent intent, int i2);

    void a(Context context, Intent intent, int i2, h.f.a.a<z> aVar);

    boolean a(Context context, Intent intent);

    void b(Activity activity, Intent intent);

    void b(Context context, Intent intent);

    void c(Activity activity, Intent intent);

    void c(Context context, Intent intent);

    void d(Activity activity, Intent intent);

    void e(Activity activity, Intent intent);
}
