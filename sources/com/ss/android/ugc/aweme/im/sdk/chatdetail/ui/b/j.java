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

public abstract class j extends t<a> {

    /* renamed from: h  reason: collision with root package name */
    public int f101715h;

    /* renamed from: i  reason: collision with root package name */
    public View.OnClickListener f101716i;

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ i[] f101717a = {new y(a.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0)};

        /* renamed from: b  reason: collision with root package name */
        final d f101718b = a((int) R.id.blk);

        static {
            Covode.recordClassIndex(65036);
        }
    }

    static {
        Covode.recordClassIndex(65035);
    }

    @Override // com.airbnb.epoxy.s
    public final int b() {
        return R.layout.a8_;
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
        ((TextView) aVar.f101718b.a(aVar, a.f101717a[0])).setText(this.f101715h);
        aVar.a().setOnClickListener(this.f101716i);
        v.a(aVar.a());
    }
}
