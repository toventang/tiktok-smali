package com.ss.android.ugc.aweme.sticker;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.i;
import com.ss.android.ugc.aweme.tux.a.i.a;
import h.f.b.l;

public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final b f134722a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(88057);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.i
    public final void a(Context context, int i2) {
        l.d(context, "");
        new a(context).a(i2).a();
    }

    @Override // com.ss.android.ugc.aweme.editSticker.i
    public final void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        new a(context).a(str).a();
    }
}
