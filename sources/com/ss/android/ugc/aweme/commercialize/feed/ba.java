package com.ss.android.ugc.aweme.commercialize.feed;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.j.b;
import com.ss.android.ugc.aweme.commercialize.utils.bo;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface ba {
    static {
        Covode.recordClassIndex(45773);
    }

    void a(Context context, Aweme aweme);

    void a(Context context, Aweme aweme, bo boVar);

    void a(Context context, String str);

    boolean a(Activity activity, Aweme aweme, int i2);

    boolean a(Context context, Aweme aweme, int i2, b bVar);

    boolean a(Context context, String str, String str2);

    boolean a(Context context, String str, boolean z);

    boolean a(Uri uri);

    boolean b(Context context, Aweme aweme);

    boolean b(Context context, String str);

    boolean c(Context context, Aweme aweme);
}
