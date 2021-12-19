package com.ss.android.ugc.aweme.favorites.j;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.favorites.i.a;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.zhiliaoapp.musically.R;

public final class j extends RecyclerView.ViewHolder implements a.AbstractC2193a {

    /* renamed from: a  reason: collision with root package name */
    public RemoteImageView f90729a;

    /* renamed from: b  reason: collision with root package name */
    public TuxTextView f90730b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f90731c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f90732d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f90733e;

    /* renamed from: f  reason: collision with root package name */
    public AppCompatImageView f90734f;

    /* renamed from: g  reason: collision with root package name */
    public View f90735g;

    /* renamed from: h  reason: collision with root package name */
    public g f90736h;

    static {
        Covode.recordClassIndex(56978);
    }

    @Override // com.ss.android.ugc.aweme.favorites.i.a.AbstractC2193a
    public final void c() {
        g gVar = this.f90736h;
        if (gVar != null) {
            a.a(1, gVar.id);
        }
    }

    public j(View view) {
        super(view);
        this.f90735g = view;
        this.f90729a = (RemoteImageView) view.findViewById(R.id.dtl);
        this.f90730b = (TuxTextView) view.findViewById(R.id.f83);
        this.f90731c = (TextView) view.findViewById(R.id.eyf);
        this.f90732d = (TextView) view.findViewById(R.id.eyg);
        this.f90733e = (TextView) view.findViewById(R.id.f_a);
        this.f90734f = (AppCompatImageView) view.findViewById(R.id.c0c);
    }
}
