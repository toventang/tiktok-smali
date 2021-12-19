package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.v;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;

public abstract class q extends t<a> {

    /* renamed from: h  reason: collision with root package name */
    public int f101756h;

    /* renamed from: i  reason: collision with root package name */
    public int f101757i;

    /* renamed from: j  reason: collision with root package name */
    public View.OnClickListener f101758j;

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ i[] f101759a = {new y(a.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new y(a.class, "subTitleView", "getSubTitleView()Landroid/widget/TextView;", 0)};

        /* renamed from: b  reason: collision with root package name */
        final d f101760b = a((int) R.id.bln);

        /* renamed from: c  reason: collision with root package name */
        private final d f101761c = a((int) R.id.blm);

        static {
            Covode.recordClassIndex(65050);
        }

        public final TextView b() {
            return (TextView) this.f101761c.a(this, f101759a[1]);
        }
    }

    static {
        Covode.recordClassIndex(65049);
    }

    @Override // com.airbnb.epoxy.s
    public final int b() {
        return R.layout.a8c;
    }

    /* renamed from: a */
    public void b(a aVar) {
        l.d(aVar, "");
        aVar.a().setOnClickListener(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void a(a aVar) {
        l.d(aVar, "");
        ((TextView) aVar.f101760b.a(aVar, a.f101759a[0])).setText(this.f101756h);
        if (this.f101757i == 0) {
            aVar.b().setVisibility(8);
        } else {
            aVar.b().setVisibility(0);
            aVar.b().setText(this.f101757i);
        }
        aVar.a().setOnClickListener(this.f101758j);
        v.a(aVar.a());
    }
}
