package com.bytedance.android.live.broadcast.widget;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f8808a;

    static {
        Covode.recordClassIndex(4495);
    }

    k(i iVar) {
        this.f8808a = iVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        i iVar = this.f8808a;
        dialogInterface.dismiss();
        b.a.a("livesdk_change_cover_window_click").a("result", "live").a((Map<String, String>) iVar.b()).b();
    }
}
