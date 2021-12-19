package com.ss.android.ugc.aweme.share.silent;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f extends j {
    static {
        Covode.recordClassIndex(81642);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.share.silent.j
    public final void a(View view) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.share.silent.j
    public final int getLayoutResId() {
        return R.layout.azo;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.share.silent.j
    public final void setSilentShareChannelDrawable(Context context) {
        this.f124353k = 32;
        this.f124354l = 20;
        super.setSilentShareChannelDrawable(context);
    }
}
