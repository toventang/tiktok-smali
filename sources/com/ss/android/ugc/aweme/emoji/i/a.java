package com.ss.android.ugc.aweme.emoji.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import java.util.List;

public interface a {
    static {
        Covode.recordClassIndex(56131);
    }

    int a();

    Drawable a(Context context);

    Drawable a(Context context, String str);

    List<com.ss.android.ugc.aweme.emoji.b.a> a(int i2, int i3);

    void a(RemoteImageView remoteImageView, com.ss.android.ugc.aweme.emoji.b.a aVar);

    boolean a(String str);

    String b();
}
