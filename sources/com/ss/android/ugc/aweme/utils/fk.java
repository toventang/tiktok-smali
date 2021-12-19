package com.ss.android.ugc.aweme.utils;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.f;
import com.ss.android.ugc.aweme.utils.fh;

final /* synthetic */ class fk implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private final fh.a f142935a;

    /* renamed from: b  reason: collision with root package name */
    private final f f142936b;

    static {
        Covode.recordClassIndex(93526);
    }

    fk(fh.a aVar, f fVar) {
        this.f142935a = aVar;
        this.f142936b = fVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        fh.a aVar = this.f142935a;
        f fVar = this.f142936b;
        if (aVar != null) {
            aVar.a();
        }
        if (fVar != null) {
            fVar.b();
        }
    }
}
