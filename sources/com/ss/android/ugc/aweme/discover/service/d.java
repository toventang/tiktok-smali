package com.ss.android.ugc.aweme.discover.service;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public TextView f82060a;

    /* renamed from: b  reason: collision with root package name */
    final h f82061b;

    static {
        Covode.recordClassIndex(51068);
    }

    static final class a extends m implements h.f.a.a<RecyclerView.j> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(51069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView.j invoke() {
            RecyclerView.j jVar = new RecyclerView.j(-2, -2);
            jVar.setMargins(0, 0, (int) n.b(this.$itemView.getContext(), 4.0f), 0);
            return jVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view) {
        super(view);
        l.d(view, "");
        this.f82061b = i.a((h.f.a.a) new a(view));
        this.f82060a = (TextView) view.findViewById(R.id.cr9);
    }
}
