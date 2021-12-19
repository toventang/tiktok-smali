package com.ss.android.ugc.aweme.friends.widget.contact.a;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.friends.widget.contact.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.Objects;

public final class b extends a<h> {

    /* renamed from: e  reason: collision with root package name */
    private final h.h f97317e;

    /* renamed from: f  reason: collision with root package name */
    private final int f97318f;

    static {
        Covode.recordClassIndex(61821);
    }

    static final class a extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(61822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.bqy);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        l.d(view, "");
        this.f97317e = i.a((h.f.a.a) new a(view));
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f97318f = h.g.a.a(TypedValue.applyDimension(1, 21.0f, system.getDisplayMetrics()));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.friends.widget.contact.a] */
    @Override // com.ss.android.ugc.aweme.friends.widget.contact.a.a
    public final /* synthetic */ void a(h hVar) {
        h hVar2 = hVar;
        l.d(hVar2, "");
        if (hVar2.f97346b == -1) {
            View view = this.itemView;
            l.b(view, "");
            view.setVisibility(8);
            return;
        }
        TuxTextView tuxTextView = (TuxTextView) this.f97317e.getValue();
        l.b(tuxTextView, "");
        View view2 = this.itemView;
        l.b(view2, "");
        tuxTextView.setText(view2.getContext().getString(hVar2.f97346b));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.friends.widget.contact.a.a
    public final void b(com.ss.android.ugc.aweme.inbox.widget.b bVar) {
        l.d(bVar, "");
        if (bVar.f104373a != -1) {
            View view = this.itemView;
            l.b(view, "");
            if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                View view2 = this.itemView;
                l.b(view2, "");
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.f104373a - this.f97318f;
            }
        }
    }
}
