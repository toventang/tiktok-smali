package com.bytedance.android.live.broadcast.widget;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f8807a;

    static {
        Covode.recordClassIndex(4494);
    }

    j(i iVar) {
        this.f8807a = iVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        i iVar = this.f8807a;
        dialogInterface.dismiss();
        iVar.f8797c.a();
        iVar.f8797c.c();
        b.a.a("livesdk_change_cover_window_click").a("result", "confirm").a((Map<String, String>) iVar.b()).b();
    }
}
