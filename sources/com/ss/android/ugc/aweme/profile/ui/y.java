package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import c.b.d;
import c.d.a;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.IOException;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f117486a = new y();

    private y() {
    }

    static {
        Covode.recordClassIndex(75895);
    }

    public static int a(Context context, Uri uri) {
        ExifInterface exifInterface;
        l.d(context, "");
        l.d(uri, "");
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                exifInterface = new ExifInterface(d.a(context, uri));
            } else {
                exifInterface = new ExifInterface(a.a(context, uri));
            }
            int attributeInt = exifInterface.getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return LiveFeedRefreshTimeSetting.DEFAULT;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap b(android.content.Context r5, android.net.Uri r6) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.y.b(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[SYNTHETIC, Splitter:B:21:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c A[SYNTHETIC, Splitter:B:30:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap c(android.content.Context r9, android.net.Uri r10) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.y.c(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }
}
