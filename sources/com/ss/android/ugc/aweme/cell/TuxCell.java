package com.ss.android.ugc.aweme.cell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.bytedance.tux.table.cell.c.b;
import com.ss.android.ugc.aweme.be.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public class TuxCell<T extends i, S extends c.b> extends BaseCell<T> {

    /* renamed from: a  reason: collision with root package name */
    public S f69833a;

    static {
        Covode.recordClassIndex(43067);
    }

    public S a(Context context) {
        l.d(context, "");
        return null;
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ ViewGroup $parent$inlined;
        final /* synthetic */ TuxCell this$0;

        static {
            Covode.recordClassIndex(43068);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(TuxCell tuxCell, ViewGroup viewGroup) {
            super(0);
            this.this$0 = tuxCell;
            this.$parent$inlined = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            View.OnClickListener j2;
            i iVar = (i) this.this$0.f34234d;
            if (!(iVar == null || (j2 = iVar.j()) == null)) {
                j2.onClick(this.this$0.itemView);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        return b(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.lq, viewGroup, false);
        Context context = viewGroup.getContext();
        l.b(context, "");
        S a3 = a(context);
        this.f69833a = a3;
        if (a3 != null) {
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxTextCell");
            ((TuxTextCell) a2).setAccessory(a3);
        }
        S s = this.f69833a;
        if (s != null) {
            s.f45439a = new a(this, viewGroup);
        }
        l.b(a2, "");
        return a2;
    }

    public void a(T t) {
        l.d(t, "");
        super.a((com.ss.android.ugc.aweme.be.a) t);
        View view = this.itemView;
        l.b(view, "");
        TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.a3i);
        tuxTextCell.setVariant(t.e());
        tuxTextCell.setTitle(t.d());
        tuxTextCell.setSubtitle(t.g());
        com.bytedance.tux.c.a f2 = t.f();
        if (f2 != null) {
            tuxTextCell.setIcon(f2);
        }
        tuxTextCell.setCellEnabled(t.h());
        tuxTextCell.setWithSeparator(t.a());
        tuxTextCell.setLoading(t.i());
    }
}
