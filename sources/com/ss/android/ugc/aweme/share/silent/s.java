package com.ss.android.ugc.aweme.share.silent;

import android.content.Context;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class s extends a {

    /* renamed from: i  reason: collision with root package name */
    private final int f124364i = 0;

    static {
        Covode.recordClassIndex(81656);
    }

    @Override // com.ss.android.ugc.aweme.share.silent.a
    public final int getLayoutResId() {
        if (this.f124364i == 0) {
            return R.layout.b0b;
        }
        return R.layout.azd;
    }

    @Override // com.ss.android.ugc.aweme.share.silent.a
    public final void a() {
        a(44, 30);
        b();
        setSyncTitle((TextView) findViewById(R.id.eh1));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(Context context) {
        super(context);
        l.d(context, "");
    }
}
