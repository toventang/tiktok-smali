package com.ss.android.ugc.aweme.discover.ui.a.b.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.g.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final h f82232a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.ui.a.a f82233b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.ui.a.b.b f82234c;

    /* renamed from: d  reason: collision with root package name */
    private final h f82235d;

    static {
        Covode.recordClassIndex(51176);
    }

    public final ImageView a() {
        return (ImageView) this.f82235d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b.b.b$b  reason: collision with other inner class name */
    static final class C1929b extends m implements h.f.a.a<TextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(51178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1929b(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.$itemView.findViewById(R.id.b2s);
        }
    }

    static final class c extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(51179);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.$itemView.findViewById(R.id.b30);
        }
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f82236a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f82237b;

        static {
            Covode.recordClassIndex(51177);
        }

        public a(b bVar, g gVar) {
            this.f82236a = bVar;
            this.f82237b = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.search.g.c filterOptionStruct = this.f82237b.getFilterOptionStruct();
            if (filterOptionStruct != null) {
                filterOptionStruct.selectOption(this.f82237b);
            }
            this.f82236a.f82233b.notifyDataSetChanged();
            this.f82236a.f82234c.b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view, com.ss.android.ugc.aweme.discover.ui.a.a aVar, com.ss.android.ugc.aweme.discover.ui.a.b.b bVar) {
        super(view);
        l.d(view, "");
        l.d(aVar, "");
        l.d(bVar, "");
        this.f82233b = aVar;
        this.f82234c = bVar;
        this.f82232a = i.a((h.f.a.a) new C1929b(view));
        this.f82235d = i.a((h.f.a.a) new c(view));
    }
}
