package com.bytedance.android.live.publicscreen.impl.game;

import android.graphics.Bitmap;
import android.text.Spannable;
import android.widget.TextView;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.chatroom.f.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;

public final class g implements k.a {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f12388a;

    static {
        Covode.recordClassIndex(6808);
    }

    public g(TextView textView) {
        l.d(textView, "");
        this.f12388a = textView;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k.a
    public final void a(Bitmap bitmap, k<? extends a> kVar) {
        if (bitmap != null && kVar != null && kVar.z() != null) {
            int a2 = p.a((CharSequence) String.valueOf(kVar.z()), " . ");
            if (a2 != -1) {
                CharSequence z = kVar.z();
                if (!(z instanceof Spannable)) {
                    z = null;
                }
                Spannable spannable = (Spannable) z;
                if (spannable != null) {
                    c.a(spannable, bitmap, a2 + 1, a2 + 2, kVar);
                }
            }
            this.f12388a.setText(kVar.z());
        }
    }
}
