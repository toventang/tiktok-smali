package com.ss.android.ugc.aweme.sharer.ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class y extends x {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f124568a;

    static {
        Covode.recordClassIndex(81860);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ext.x, com.ss.android.ugc.aweme.sharer.b
    public final String a() {
        return "whatsapp_status";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ext.x, com.ss.android.ugc.aweme.sharer.b
    public final String b() {
        return "WhatsApp Status";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ext.x, com.ss.android.ugc.aweme.sharer.b
    public final Drawable a(Context context) {
        return this.f124568a;
    }

    public y(Drawable drawable) {
        l.d(drawable, "");
        this.f124568a = drawable;
    }
}
