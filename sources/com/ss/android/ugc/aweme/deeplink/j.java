package com.ss.android.ugc.aweme.deeplink;

import android.content.DialogInterface;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final DeepLinkHandlerActivity f79494a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f79495b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f79496c;

    static {
        Covode.recordClassIndex(49383);
    }

    j(DeepLinkHandlerActivity deepLinkHandlerActivity, boolean z, Intent intent) {
        this.f79494a = deepLinkHandlerActivity;
        this.f79495b = z;
        this.f79496c = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f79494a.a(this.f79495b, this.f79496c);
    }
}
