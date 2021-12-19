package com.ss.android.ugc.aweme.notification.h;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notification.bean.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class y extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    private final h f113744a;

    static {
        Covode.recordClassIndex(73118);
    }

    private final TuxTextView a() {
        return (TuxTextView) this.f113744a.getValue();
    }

    static final class a extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(73119);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.text);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(View view) {
        super(view);
        l.d(view, "");
        this.f113744a = i.a((h.f.a.a) new a(view));
    }

    public final void a(k kVar) {
        l.d(kVar, "");
        int type = kVar.getType();
        if (type == 0) {
            TuxTextView a2 = a();
            l.b(a2, "");
            View view = this.itemView;
            l.b(view, "");
            a2.setText(view.getContext().getString(R.string.dlb));
        } else if (type == 1) {
            TuxTextView a3 = a();
            l.b(a3, "");
            View view2 = this.itemView;
            l.b(view2, "");
            a3.setText(view2.getContext().getString(R.string.dlc));
        }
    }
}
