package com.bytedance.android.livesdk.rank.impl.g;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.rank.api.model.d;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import j.a.a.c;

public final class b extends c<d, a> {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.android.livesdk.rank.impl.widget.a f20727a;

    static {
        Covode.recordClassIndex(12263);
    }

    public b(com.bytedance.android.livesdk.rank.impl.widget.a aVar) {
        this.f20727a = aVar;
    }

    static class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final LiveTextView f20728a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveTextView f20729b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f20730c;

        static {
            Covode.recordClassIndex(12264);
        }

        a(View view) {
            super(view);
            this.f20728a = (LiveTextView) view.findViewById(R.id.f9v);
            this.f20729b = (LiveTextView) view.findViewById(R.id.ex3);
            this.f20730c = (ImageView) view.findViewById(R.id.bjj);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // j.a.a.c
    public final /* synthetic */ a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new a(com.a.a(layoutInflater, R.layout.b_a, viewGroup, false));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(a aVar, d dVar) {
        a aVar2 = aVar;
        d dVar2 = dVar;
        aVar2.f20728a.setText(dVar2.f20599a);
        aVar2.f20729b.setText(dVar2.f20600b);
        if (this.f20727a != com.bytedance.android.livesdk.rank.impl.widget.a.BOTH_REVENUE) {
            aVar2.f20730c.setVisibility(8);
            aVar2.f20730c.setVisibility(8);
        }
    }
}
