package com.ss.android.ugc.aweme.download.component_api.c;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, a> f83100a = Collections.synchronizedMap(new HashMap());

    public interface a {
        static {
            Covode.recordClassIndex(51805);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(51804);
    }

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f83100a.remove(str);
    }

    public static void a(Context context, a aVar) {
        if (context == null || b.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
            if (context != null) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                if (!TextUtils.isEmpty(valueOf)) {
                    f83100a.put(valueOf, aVar);
                }
                Intent intent = new Intent(context, DownloadDelegateActivity.class);
                intent.addFlags(268435456);
                intent.putExtra(StringSet.type, 1);
                intent.putExtra("permission_id_key", valueOf);
                intent.putExtra("permission_content_key", strArr);
                com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                context.startActivity(intent);
                return;
            }
            return;
        }
        aVar.a();
    }
}
