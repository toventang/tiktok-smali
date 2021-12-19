package com.ss.android.ugc.aweme.ecommerce.semipdp.vh;

import android.text.TextPaint;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.semipdp.b.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class SemiPdpInfoVH extends JediSimpleViewHolder<a> implements au {

    /* renamed from: f  reason: collision with root package name */
    public final View f87341f;

    static {
        Covode.recordClassIndex(54822);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        a.C2089a.a(this.f87341f, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SemiPdpInfoVH(View view) {
        super(view);
        l.d(view, "");
        this.f87341f = view;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.semipdp.b.a aVar) {
        com.ss.android.ugc.aweme.ecommerce.semipdp.b.a aVar2 = aVar;
        l.d(aVar2, "");
        View view = this.f87341f;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.dhw);
        l.b(tuxTextView, "");
        a(tuxTextView, aVar2.f87302a);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.d0j);
        l.b(tuxTextView2, "");
        a(tuxTextView2, aVar2.f87303b);
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.akm);
        l.b(tuxTextView3, "");
        a(tuxTextView3, aVar2.f87304c);
        TuxTextView tuxTextView4 = (TuxTextView) view.findViewById(R.id.e7j);
        l.b(tuxTextView4, "");
        a(tuxTextView4, aVar2.f87305d);
        TuxTextView tuxTextView5 = (TuxTextView) view.findViewById(R.id.d0j);
        l.b(tuxTextView5, "");
        TextPaint paint = tuxTextView5.getPaint();
        l.b(paint, "");
        paint.setFlags(16);
        TuxTextView tuxTextView6 = (TuxTextView) view.findViewById(R.id.d0j);
        l.b(tuxTextView6, "");
        TextPaint paint2 = tuxTextView6.getPaint();
        l.b(paint2, "");
        paint2.setAntiAlias(true);
    }

    private static void a(TuxTextView tuxTextView, String str) {
        int i2 = 0;
        if (str == null || str.length() == 0) {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
        tuxTextView.setText(str);
    }
}
