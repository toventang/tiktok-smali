package com.ss.android.ugc.aweme.qrcode;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;

public interface IQRCodeService {
    static {
        Covode.recordClassIndex(77744);
    }

    int a(String str);

    b a(View view, String str, boolean z);

    void a(Context context, String str);

    void a(Context context, boolean z, boolean z2);
}
