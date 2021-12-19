package com.ss.android.ugc.aweme.comment.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.m.c;

final /* synthetic */ class ae implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f72505a;

    static {
        Covode.recordClassIndex(44684);
    }

    ae(k kVar) {
        this.f72505a = kVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        k kVar = this.f72505a;
        c.a(kVar.f72763b.getEventType(), "cancel", kVar.f72763b.getAuthorUid(), kVar.f72763b.getAid());
    }
}
