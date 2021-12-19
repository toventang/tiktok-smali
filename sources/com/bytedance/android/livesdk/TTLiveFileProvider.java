package com.bytedance.android.livesdk;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.bytedance.covode.number.Covode;
import java.io.File;

public class TTLiveFileProvider extends FileProvider {
    static {
        Covode.recordClassIndex(7378);
    }

    public static Uri getUri(Context context, String str, File file) {
        return getUriForFile(context, str, file);
    }
}
