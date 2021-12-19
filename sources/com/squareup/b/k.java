package com.squareup.b;

import android.content.Context;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.squareup.b.t;
import com.squareup.b.y;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public final class k extends g {
    static {
        Covode.recordClassIndex(36065);
    }

    k(Context context) {
        super(context);
    }

    @Override // com.squareup.b.y, com.squareup.b.g
    public final boolean a(w wVar) {
        return "file".equals(wVar.f58115d.getScheme());
    }

    @Override // com.squareup.b.y, com.squareup.b.g
    public final y.a b(w wVar) {
        int i2;
        InputStream c2 = c(wVar);
        t.d dVar = t.d.DISK;
        int attributeInt = new ExifInterface(wVar.f58115d.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            i2 = LiveFeedRefreshTimeSetting.DEFAULT;
        } else if (attributeInt == 6) {
            i2 = 90;
        } else if (attributeInt != 8) {
            i2 = 0;
        } else {
            i2 = 270;
        }
        return new y.a(null, c2, dVar, i2);
    }
}
