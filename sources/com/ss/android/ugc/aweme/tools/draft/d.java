package com.ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.edit.aa;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f139473a;

    /* renamed from: b  reason: collision with root package name */
    private final View f139474b;

    /* renamed from: c  reason: collision with root package name */
    private final c f139475c;

    static {
        Covode.recordClassIndex(91205);
    }

    d(a aVar, View view, c cVar) {
        this.f139473a = aVar;
        this.f139474b = view;
        this.f139475c = cVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        a aVar = this.f139473a;
        View view = this.f139474b;
        c cVar = this.f139475c;
        Context context = view.getContext();
        aa.a(context, context.getResources().getQuantityString(R.plurals.b4, 1), context.getString(R.string.bcm), new e(aVar, cVar), context.getString(R.string.bcn));
        dialogInterface.dismiss();
    }
}
