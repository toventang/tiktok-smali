package com.ss.android.ugc.aweme.commerce;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface i {
    static {
        Covode.recordClassIndex(45199);
    }

    void a(Context context, Aweme aweme, View view, boolean z);

    void a(Aweme aweme);

    void a(Aweme aweme, Context context, View view);

    void a(Aweme aweme, Context context, View view, int i2);

    void a(Aweme aweme, Context context, View view, String str);

    void b(Aweme aweme);

    void b(Aweme aweme, Context context, View view, int i2);

    void c(Aweme aweme, Context context, View view, int i2);

    void d(Aweme aweme, Context context, View view, int i2);
}
