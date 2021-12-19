package com.ss.android.ugc.aweme.photo.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final class a {
    static {
        Covode.recordClassIndex(73875);
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(str)));
        context.sendBroadcast(intent);
    }
}
