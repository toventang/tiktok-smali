package com.ss.android.ugc.aweme.deeplink;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final DeepLinkHandlerActivity f79485a;

    /* renamed from: b  reason: collision with root package name */
    private final String f79486b;

    /* renamed from: c  reason: collision with root package name */
    private final String f79487c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f79488d;

    static {
        Covode.recordClassIndex(49379);
    }

    f(DeepLinkHandlerActivity deepLinkHandlerActivity, String str, String str2, Context context) {
        this.f79485a = deepLinkHandlerActivity;
        this.f79486b = str;
        this.f79487c = str2;
        this.f79488d = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f79485a.a(this.f79486b, this.f79487c, this.f79488d, dialogInterface);
    }
}
