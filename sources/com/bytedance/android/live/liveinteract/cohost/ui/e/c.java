package com.bytedance.android.live.liveinteract.cohost.ui.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class c extends j.a.a.c<com.bytedance.android.live.liveinteract.cohost.ui.d.c, a> {
    static {
        Covode.recordClassIndex(5464);
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final h f10353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f10354b;

        static {
            Covode.recordClassIndex(5465);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.c$a$a  reason: collision with other inner class name */
        static final class C0175a extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5466);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0175a(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f0s);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, View view) {
            super(view);
            l.d(view, "");
            this.f10354b = cVar;
            this.f10353a = i.a((h.f.a.a) new C0175a(view));
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // j.a.a.c
    public final /* synthetic */ a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.ba9, viewGroup, false);
        l.b(a2, "");
        return new a(this, a2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(a aVar, com.bytedance.android.live.liveinteract.cohost.ui.d.c cVar) {
        a aVar2 = aVar;
        com.bytedance.android.live.liveinteract.cohost.ui.d.c cVar2 = cVar;
        l.d(aVar2, "");
        l.d(cVar2, "");
        ((LiveTextView) aVar2.f10353a.getValue()).setText(cVar2.f10335a);
    }
}
