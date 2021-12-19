package com.bytedance.android.live.b;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.a;
import com.bytedance.android.livesdk.container.c;
import com.bytedance.covode.number.Covode;

public interface g extends a {
    static {
        Covode.recordClassIndex(3545);
    }

    c createHybridView(Context context, Uri uri);

    Fragment createPageFragment(Uri uri, Context context);

    com.bytedance.android.livesdk.container.i.a<?> getLynxCustomReport();

    com.bytedance.android.livesdk.container.i.a<WebView> getWebViewCustomReport();

    boolean handleScheme(Uri uri, Context context);

    boolean isContainerScheme(Uri uri);
}
