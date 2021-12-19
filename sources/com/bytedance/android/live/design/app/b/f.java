package com.bytedance.android.live.design.app.b;

import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f9412a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveDialog f9413b;

    static {
        Covode.recordClassIndex(4791);
    }

    f(b bVar, LiveDialog liveDialog) {
        this.f9412a = bVar;
        this.f9413b = liveDialog;
    }

    public final void onClick(View view) {
        b bVar = this.f9412a;
        bVar.f9394c.a(this.f9413b);
    }
}
