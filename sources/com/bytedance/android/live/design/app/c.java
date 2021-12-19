package com.bytedance.android.live.design.app;

import android.view.View;
import com.bytedance.android.live.design.app.c.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveDialog f9415a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9416b;

    static {
        Covode.recordClassIndex(4797);
    }

    c(LiveDialog liveDialog, a aVar) {
        this.f9415a = liveDialog;
        this.f9416b = aVar;
    }

    public final void onClick(View view) {
        this.f9416b.f9419c.a(this.f9415a);
    }
}
