package com.bytedance.tux.tooltip.a.b;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.bytedance.tux.h.d;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.a.b.b;
import com.bytedance.tux.tooltip.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class a extends b<a> {

    /* renamed from: c  reason: collision with root package name */
    private CharSequence f45505c = "";

    /* renamed from: d  reason: collision with root package name */
    private int f45506d;

    /* renamed from: e  reason: collision with root package name */
    private int f45507e;

    /* renamed from: f  reason: collision with root package name */
    private h.f.a.b<? super ImageView, z> f45508f;

    static {
        Covode.recordClassIndex(27702);
    }

    @Override // com.bytedance.tux.tooltip.b
    public final com.bytedance.tux.tooltip.a d() {
        b bVar = new b(this.f45512b, (byte) 0);
        CharSequence charSequence = this.f45505c;
        l.c(charSequence, "");
        TuxTextView tuxTextView = (TuxTextView) bVar.f45509a.findViewById(R.id.clf);
        l.a((Object) tuxTextView, "");
        tuxTextView.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            TuxTextView tuxTextView2 = (TuxTextView) bVar.f45509a.findViewById(R.id.clf);
            l.a((Object) tuxTextView2, "");
            tuxTextView2.setVisibility(0);
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) bVar.f45509a.findViewById(R.id.clf);
            l.a((Object) tuxTextView3, "");
            tuxTextView3.setVisibility(8);
        }
        int i2 = this.f45506d;
        com.bytedance.tux.c.a a2 = c.a(new b.a(i2, this.f45507e));
        Context context = bVar.getContext();
        l.a((Object) context, "");
        ((ImageView) bVar.f45509a.findViewById(R.id.bm4)).setImageDrawable(a2.a(context));
        if (i2 != 0) {
            ImageView imageView = (ImageView) bVar.f45509a.findViewById(R.id.bm4);
            l.a((Object) imageView, "");
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = (ImageView) bVar.f45509a.findViewById(R.id.bm4);
            l.a((Object) imageView2, "");
            imageView2.setVisibility(8);
        }
        bVar.setCustomImage(this.f45508f);
        a(bVar);
        return super.d();
    }

    public final a a(CharSequence charSequence) {
        l.c(charSequence, "");
        this.f45505c = charSequence;
        return this;
    }

    public final a e(int i2) {
        String string = this.f45512b.getString(i2);
        l.a((Object) string, "");
        this.f45505c = string;
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        l.c(context, "");
        int[] iArr = {R.attr.go, R.attr.gp, R.attr.gq, R.attr.gr, R.attr.gs, R.attr.gt, R.attr.gu, R.attr.gv, R.attr.gw};
        l.a((Object) iArr, "");
        Integer a2 = d.a(context, iArr, 6);
        if (a2 != null) {
            a(a2.intValue());
        }
    }
}
