package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.core.e.b.a;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class az implements f {

    /* renamed from: a  reason: collision with root package name */
    private final DecorationWrapperWidget f16479a;

    static {
        Covode.recordClassIndex(9116);
    }

    az(DecorationWrapperWidget decorationWrapperWidget) {
        this.f16479a = decorationWrapperWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a.a(this.f16479a.context, (Throwable) obj, y.a((int) R.string.gvx));
        DecorationWrapperWidget.f16286l = false;
    }
}
