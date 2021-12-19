package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.t;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;

public abstract class o extends t<a> {

    /* renamed from: h  reason: collision with root package name */
    public String f101748h;

    /* renamed from: i  reason: collision with root package name */
    public View.OnClickListener f101749i;

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ i[] f101750a = {new y(a.class, "moreText", "getMoreText()Landroid/widget/TextView;", 0)};

        /* renamed from: b  reason: collision with root package name */
        final d f101751b = a((int) R.id.bll);

        static {
            Covode.recordClassIndex(65047);
        }
    }

    static {
        Covode.recordClassIndex(65046);
    }

    @Override // com.airbnb.epoxy.s
    public final int b() {
        return R.layout.a8b;
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        l.d(aVar, "");
        ((TextView) aVar.f101751b.a(aVar, a.f101750a[0])).setText(this.f101748h);
        aVar.a().setOnClickListener(this.f101749i);
    }
}
