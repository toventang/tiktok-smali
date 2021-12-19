package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.DmViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.e.c;
import com.zhiliaoapp.musically.R;

public class a extends f<com.ss.android.ugc.aweme.im.service.k.a> {

    /* renamed from: a  reason: collision with root package name */
    private static final int f102009a = ((int) n.b(d.a(), 8.0f));

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a f102010b;

    static {
        Covode.recordClassIndex(65275);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof c) {
            ((c) viewHolder).b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof c) {
            ((c) viewHolder).c();
        }
    }

    public a(androidx.appcompat.app.d dVar, com.ss.android.ugc.aweme.im.sdk.chatlist.controller.a.a aVar) {
        a("");
        DmViewModel a2 = DmViewModel.a.a(dVar);
        if (a2 != null) {
            a2.a().observe(dVar, new b(this));
        }
        this.f102010b = aVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        return new c(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6r, viewGroup, false), this.f102010b);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        ((c) viewHolder).a((com.ss.android.ugc.aweme.im.service.k.a) this.f76354l.get(i2));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewHolder.itemView.getLayoutParams();
        int i4 = marginLayoutParams.leftMargin;
        if (i2 == 0) {
            i3 = f102009a;
        } else {
            i3 = 0;
        }
        marginLayoutParams.setMargins(i4, i3, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }
}
