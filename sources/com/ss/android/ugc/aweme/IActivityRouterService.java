package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;

public interface IActivityRouterService {
    static {
        Covode.recordClassIndex(38366);
    }

    Intent a(Context context, Uri uri);

    Class<? extends Activity> a();

    void a(Activity activity, Uri uri);
}
