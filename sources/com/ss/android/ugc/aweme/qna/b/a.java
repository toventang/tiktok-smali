package com.ss.android.ugc.aweme.qna.b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(77466);
    }

    public static final void a(SmartImageView smartImageView, String str) {
        l.d(smartImageView, "");
        if (str != null) {
            smartImageView.setImageURI(Uri.parse(str));
        }
    }
}
