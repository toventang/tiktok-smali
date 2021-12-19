package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f135999a;

    /* renamed from: b  reason: collision with root package name */
    public final SimpleDraweeView f136000b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f136001c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f136002d;

    static {
        Covode.recordClassIndex(88852);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.bwu);
        l.b(findViewById, "");
        this.f135999a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.bwt);
        l.b(findViewById2, "");
        this.f136000b = (SimpleDraweeView) findViewById2;
        View findViewById3 = view.findViewById(R.id.eyv);
        l.b(findViewById3, "");
        this.f136001c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.f0i);
        l.b(findViewById4, "");
        this.f136002d = (TextView) findViewById4;
    }
}
