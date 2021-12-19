package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final class cr {
    static {
        Covode.recordClassIndex(93402);
    }

    public static Uri a(Context context, File file) {
        if (Build.VERSION.SDK_INT >= 24) {
            return FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
        }
        return Uri.fromFile(file);
    }
}
