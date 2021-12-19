package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f102135a;

    /* renamed from: b  reason: collision with root package name */
    private final a f102136b;

    static {
        Covode.recordClassIndex(65348);
    }

    e(c cVar, a aVar) {
        this.f102135a = cVar;
        this.f102136b = aVar;
    }

    public final boolean onLongClick(View view) {
        return this.f102135a.b(this.f102136b);
    }
}
