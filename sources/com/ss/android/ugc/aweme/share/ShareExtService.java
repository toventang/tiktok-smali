package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.bi;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.shortvideo.j.f;
import f.a.n;

public interface ShareExtService {

    public static final class a {
        static {
            Covode.recordClassIndex(80959);
        }
    }

    static {
        Covode.recordClassIndex(80958);
    }

    Drawable a(Activity activity);

    Drawable a(Activity activity, String str);

    bi a();

    h a(Activity activity, Aweme aweme, String str, String str2);

    h a(Aweme aweme, String str, String str2);

    n<String> a(String str, String str2, String str3);

    void a(Context context, String str);

    void a(String str);

    void a(String str, int i2);

    void a(String str, Aweme aweme, Bundle bundle);

    boolean a(Aweme aweme, Context context);

    boolean a(f fVar, Activity activity);

    String b(Activity activity);

    String[] b();

    String c();

    String d();
}
