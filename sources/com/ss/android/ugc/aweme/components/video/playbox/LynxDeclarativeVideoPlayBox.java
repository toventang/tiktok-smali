package com.ss.android.ugc.aweme.components.video.playbox;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;

public final class LynxDeclarativeVideoPlayBox extends DeclarativeVideoPlayBox implements au {

    /* renamed from: k  reason: collision with root package name */
    private a f78132k;

    static {
        Covode.recordClassIndex(48443);
    }

    @Override // com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.xelement.d, com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox
    public final void d() {
        this.f78132k.a();
    }

    @Override // com.bytedance.ies.xelement.d, com.ss.android.ugc.aweme.components.video.playbox.DeclarativeVideoPlayBox
    public final void c() {
        this.f78132k.a(getMTextureView());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LynxDeclarativeVideoPlayBox(Context context) {
        super(context, null, 0);
        l.d(context, "");
        this.f78132k = new a(context, this);
    }

    public /* synthetic */ LynxDeclarativeVideoPlayBox(Context context, byte b2) {
        this(context);
    }
}
