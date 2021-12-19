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
import j.a.a.c;

public final class f extends c<com.bytedance.android.live.liveinteract.cohost.ui.d.f, a> {
    static {
        Covode.recordClassIndex(5483);
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final h f10370a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f10371b;

        static {
            Covode.recordClassIndex(5484);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.f$a$a  reason: collision with other inner class name */
        static final class C0178a extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5485);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0178a(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f0v);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar, View view) {
            super(view);
            l.d(view, "");
            this.f10371b = fVar;
            this.f10370a = i.a((h.f.a.a) new C0178a(view));
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // j.a.a.c
    public final /* synthetic */ a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.ba3, viewGroup, false);
        l.b(a2, "");
        return new a(this, a2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(a aVar, com.bytedance.android.live.liveinteract.cohost.ui.d.f fVar) {
        a aVar2 = aVar;
        com.bytedance.android.live.liveinteract.cohost.ui.d.f fVar2 = fVar;
        l.d(aVar2, "");
        l.d(fVar2, "");
        ((LiveTextView) aVar2.f10370a.getValue()).setText(fVar2.f10339a);
    }
}
