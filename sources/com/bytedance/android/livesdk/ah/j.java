package com.bytedance.android.livesdk.ah;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.ah.b.c;
import com.bytedance.android.livesdk.ah.f;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    private final f.a f13737a;

    /* renamed from: b  reason: collision with root package name */
    private final c f13738b;

    static {
        Covode.recordClassIndex(7644);
    }

    j(f.a aVar, c cVar) {
        this.f13737a = aVar;
        this.f13738b = cVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f13738b.b();
    }
}
