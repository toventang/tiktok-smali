package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class at implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final Context f22757a;

    static {
        Covode.recordClassIndex(13410);
    }

    public at(Context context) {
        this.f22757a = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        ((IHostApp) a.a(IHostApp.class)).openWallet(p.a(this.f22757a));
        dialogInterface.dismiss();
    }
}
