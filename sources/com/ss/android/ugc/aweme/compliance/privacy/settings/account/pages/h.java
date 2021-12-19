package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import android.content.Context;
import android.widget.CompoundButton;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public final class h extends f {
    static {
        Covode.recordClassIndex(48130);
    }

    static final class a extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ c.j $accessory;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(48131);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c.j jVar, h hVar) {
            super(0);
            this.$accessory = jVar;
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            int i2;
            boolean z;
            Boolean invoke;
            if (!this.$accessory.g()) {
                i2 = this.this$0.f77716a.f77729g;
            } else {
                i2 = this.this$0.f77716a.f77730h;
            }
            h.f.a.b<? super Integer, Boolean> bVar = this.this$0.f77716a.n;
            if (bVar == null || (invoke = bVar.invoke(Integer.valueOf(i2))) == null) {
                z = false;
            } else {
                z = invoke.booleanValue();
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(g gVar) {
        super(gVar);
        l.d(gVar, "");
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.f
    public final void a(TuxTextCell tuxTextCell) {
        Boolean bool;
        l.d(tuxTextCell, "");
        if (!(tuxTextCell.getAccessory() instanceof c.j)) {
            Context context = tuxTextCell.getContext();
            l.b(context, "");
            tuxTextCell.setAccessory(new c.j(context));
        }
        t<Boolean> tVar = this.f77716a.f77732j;
        Integer num = null;
        if (tVar != null) {
            bool = tVar.getValue();
        } else {
            bool = null;
        }
        boolean z = true;
        tuxTextCell.setLoading(l.a((Object) bool, (Object) true));
        c.b accessory = tuxTextCell.getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        c.j jVar = (c.j) accessory;
        t<Integer> tVar2 = this.f77716a.f77731i;
        if (tVar2 != null) {
            num = tVar2.getValue();
        }
        int i2 = this.f77716a.f77729g;
        if (num == null || num.intValue() != i2) {
            z = false;
        }
        jVar.c(z);
        jVar.f45439a = this.f77716a.f77735m;
        jVar.a(new a(jVar, this));
        jVar.a(new b(this));
    }

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f77738a;

        static {
            Covode.recordClassIndex(48132);
        }

        b(h hVar) {
            this.f77738a = hVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i2;
            h.f.a.b<? super Integer, z> bVar = this.f77738a.f77716a.f77734l;
            if (bVar != null) {
                if (z) {
                    i2 = this.f77738a.f77716a.f77729g;
                } else {
                    i2 = this.f77738a.f77716a.f77730h;
                }
                bVar.invoke(Integer.valueOf(i2));
            }
        }
    }
}
