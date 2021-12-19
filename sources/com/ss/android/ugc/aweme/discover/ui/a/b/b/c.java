package com.ss.android.ugc.aweme.discover.ui.a.b.b;

import android.view.View;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class c extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.ui.a.a f82238a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.ui.a.b.b f82239b;

    /* renamed from: c  reason: collision with root package name */
    private final h f82240c;

    static {
        Covode.recordClassIndex(51180);
    }

    public final TuxTextCell a() {
        return (TuxTextCell) this.f82240c.getValue();
    }

    static final class b extends m implements h.f.a.a<TuxTextCell> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(51182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextCell invoke() {
            return this.$itemView.findViewById(R.id.b34);
        }
    }

    public static final class a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.j f82241a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f82242b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.search.g.h f82243c;

        static {
            Covode.recordClassIndex(51181);
        }

        public a(c.j jVar, c cVar, com.ss.android.ugc.aweme.search.g.h hVar) {
            this.f82241a = jVar;
            this.f82242b = cVar;
            this.f82243c = hVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            com.ss.android.ugc.aweme.search.g.a activityOptionStruct = this.f82243c.getActivityOptionStruct();
            if (activityOptionStruct != null) {
                activityOptionStruct.selectOption(this.f82243c, z);
            }
            this.f82242b.f82239b.b();
            this.f82241a.c(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view, com.ss.android.ugc.aweme.discover.ui.a.a aVar, com.ss.android.ugc.aweme.discover.ui.a.b.b bVar) {
        super(view);
        l.d(view, "");
        l.d(aVar, "");
        l.d(bVar, "");
        this.f82238a = aVar;
        this.f82239b = bVar;
        this.f82240c = i.a((h.f.a.a) new b(view));
    }
}
