package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.framework.a.a;
import com.zhiliaoapp.musically.R;

public final class ci {
    static {
        Covode.recordClassIndex(57775);
    }

    public static void a(SimpleDraweeView simpleDraweeView) {
        try {
            simpleDraweeView.setBackgroundResource(R.drawable.a16);
        } catch (Exception e2) {
            a.a((Throwable) e2);
        }
    }

    public static void a(SmartImageView smartImageView, Context context) {
        smartImageView.setImageURI(Uri.parse("res://" + context.getPackageName() + "/2131233146"));
    }
}
