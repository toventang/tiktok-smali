package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.c.c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public abstract class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f77531a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f77532b;

    static {
        Covode.recordClassIndex(47981);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f
    public final int b() {
        return R.layout.up;
    }

    public abstract o e();

    public abstract int f();

    public Integer g() {
        return this.f77531a;
    }

    public Integer h() {
        return this.f77532b;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i
    public boolean c() {
        return com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(e()).f77439a;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i
    public boolean d() {
        return com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(e()).f77440b;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ int $ic;

        static {
            Covode.recordClassIndex(47982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(1);
            this.$ic = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = this.$ic;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public void a(h hVar, int i2) {
        int i3;
        l.d(hVar, "");
        View view = hVar.itemView;
        l.b(view, "");
        TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.bry);
        tuxTextCell.setTitle(view.getContext().getString(f()));
        Integer g2 = g();
        if (g2 != null) {
            tuxTextCell.setSubtitle(view.getContext().getString(g2.intValue()));
        }
        Integer h2 = h();
        if (h2 != null) {
            tuxTextCell.setIcon(c.a(new a(h2.intValue())));
        }
        tuxTextCell.setCellEnabled(c());
        l.b(tuxTextCell, "");
        if (d()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        tuxTextCell.setVisibility(i3);
    }
}
