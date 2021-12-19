package com.ss.android.ugc.aweme.deeplink;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final DeepLinkHandlerActivity f79489a;

    /* renamed from: b  reason: collision with root package name */
    private final String f79490b;

    /* renamed from: c  reason: collision with root package name */
    private final String f79491c;

    static {
        Covode.recordClassIndex(49380);
    }

    g(DeepLinkHandlerActivity deepLinkHandlerActivity, String str, String str2) {
        this.f79489a = deepLinkHandlerActivity;
        this.f79490b = str;
        this.f79491c = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f79489a.a(this.f79490b, this.f79491c, dialogInterface);
    }
}
