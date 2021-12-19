package com.ss.android.ugc.aweme.promote;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.tiktok.security.a.a;
import com.zhiliaoapp.musically.R;

public final class h implements a {
    static {
        Covode.recordClassIndex(76739);
    }

    @Override // com.ss.android.ugc.aweme.promote.a
    public final void a(Context context, String str, String str2) {
        if (context != null) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str = "https://api.tiktokv.com/magic/runtime/?id=1079";
            }
            intent.setData(Uri.parse(str));
            String string = context.getResources().getString(R.string.ezr);
            if (d.c()) {
                string = context.getResources().getString(R.string.ezv);
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = string;
            }
            intent.putExtra("title", str2);
            intent.putExtra("aweme_model", bundle);
            a.a(intent, context);
            context.startActivity(intent);
        }
    }
}
