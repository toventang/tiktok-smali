package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import android.widget.TextView;
import com.airbnb.epoxy.t;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;

public abstract class h extends t<a> {

    /* renamed from: h  reason: collision with root package name */
    public String f101708h;

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ i[] f101709a = {new y(a.class, "textView", "getTextView()Landroid/widget/TextView;", 0)};

        /* renamed from: b  reason: collision with root package name */
        final d f101710b = a((int) R.id.bli);

        static {
            Covode.recordClassIndex(65033);
        }
    }

    static {
        Covode.recordClassIndex(65032);
    }

    @Override // com.airbnb.epoxy.s
    public final int b() {
        return R.layout.a8a;
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        l.d(aVar, "");
        ((TextView) aVar.f101710b.a(aVar, a.f101709a[0])).setText(this.f101708h);
    }
}
