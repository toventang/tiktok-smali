package com.ss.android.ugc.aweme.notice.api.helper;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface SchemaPageHelper {
    static {
        Covode.recordClassIndex(72484);
    }

    Intent a(Context context, Uri uri);

    String a();

    void a(Context context, String str);

    boolean a(Context context, String str, String str2, Map<String, String> map);

    Intent b(Context context, Uri uri);
}
