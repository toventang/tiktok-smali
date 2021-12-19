package com.ss.android.ugc.aweme.feed.x;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.f.c;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.live.Text;
import com.ss.android.ugc.aweme.feed.widget.WarningInfoView;

public final class ac {
    static {
        Covode.recordClassIndex(60362);
    }

    public static void a(TextView textView, Text text) {
        String str;
        if (textView != null && text != null) {
            b bVar = new b();
            bVar.f19421a = text.getKey();
            bVar.f19422b = text.getDefaultPattern();
            String str2 = bVar.f19422b;
            if (!TextUtils.isEmpty(bVar.f19421a)) {
                str = com.bytedance.android.livesdk.i18n.b.a().a(bVar.f19421a);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            textView.setText(c.a(str2, bVar, null));
        }
    }

    public static void a(WarningInfoView warningInfoView, Text text) {
        String str;
        if (warningInfoView != null && text != null) {
            b bVar = new b();
            bVar.f19421a = text.getKey();
            bVar.f19422b = text.getDefaultPattern();
            String str2 = bVar.f19422b;
            if (!TextUtils.isEmpty(bVar.f19421a)) {
                str = com.bytedance.android.livesdk.i18n.b.a().a(bVar.f19421a);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            warningInfoView.setInfoText(c.a(str2, bVar, null));
        }
    }
}
