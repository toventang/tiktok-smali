package com.ss.android.ugc.aweme.discover.ui.a.b.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.g.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final h f82227a;

    /* renamed from: b  reason: collision with root package name */
    public f f82228b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.ui.a.b.b f82229c;

    /* renamed from: d  reason: collision with root package name */
    private final h f82230d;

    static {
        Covode.recordClassIndex(51172);
    }

    public final View a() {
        return (View) this.f82230d.getValue();
    }

    static final class b extends m implements h.f.a.a<View> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(51174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.$itemView.findViewById(R.id.ayr);
        }
    }

    static final class c extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(51175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.ezi);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.b.a$a  reason: collision with other inner class name */
    public static final class View$OnClickListenerC1928a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f82231a;

        static {
            Covode.recordClassIndex(51173);
        }

        public View$OnClickListenerC1928a(a aVar) {
            this.f82231a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View view2 = this.f82231a.itemView;
            l.b(view2, "");
            view2.setVisibility(8);
            com.ss.android.ugc.aweme.discover.ui.a.b.b bVar = this.f82231a.f82229c;
            f fVar = this.f82231a.f82228b;
            if (fVar == null) {
                l.a("mFilterMore");
            }
            bVar.a(fVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, com.ss.android.ugc.aweme.discover.ui.a.b.b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
        this.f82229c = bVar;
        this.f82230d = i.a((h.f.a.a) new b(view));
        this.f82227a = i.a((h.f.a.a) new c(view));
    }
}
