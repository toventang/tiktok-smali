package com.bytedance.ies.bullet.service.base.a;

import android.content.Context;
import android.net.Uri;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.h;
import com.bytedance.ies.bullet.service.base.k;

public interface f extends c {
    static {
        Covode.recordClassIndex(19286);
    }

    k a(Context context);

    boolean a(Context context, Uri uri, r rVar);

    h b(Context context);

    FrameLayout.LayoutParams d();

    FrameLayout.LayoutParams e();
}
