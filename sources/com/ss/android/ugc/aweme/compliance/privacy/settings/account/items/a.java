package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;

public abstract class a extends b {
    static {
        Covode.recordClassIndex(47960);
    }

    public abstract void a(Context context);

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a$a  reason: collision with other inner class name */
    static final class C1793a extends m implements h.f.a.a<z> {
        final /* synthetic */ h $holder$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(47961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1793a(a aVar, h hVar) {
            super(0);
            this.this$0 = aVar;
            this.$holder$inlined = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            o e2 = this.this$0.e();
            View view = this.$holder$inlined.itemView;
            l.b(view, "");
            Context context = view.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(e2, context);
            return z.f158842a;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f77501a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f77502b;

        static {
            Covode.recordClassIndex(47962);
        }

        b(a aVar, h hVar) {
            this.f77501a = aVar;
            this.f77502b = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            o e2 = this.f77501a.e();
            View view2 = this.f77502b.itemView;
            l.b(view2, "");
            Context context = view2.getContext();
            l.b(context, "");
            if (com.ss.android.ugc.aweme.compliance.privacy.settings.a.a(e2, context)) {
                a aVar = this.f77501a;
                l.b(view, "");
                Context context2 = view.getContext();
                l.b(context2, "");
                aVar.a(context2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public void a(h hVar, int i2) {
        l.d(hVar, "");
        super.a(hVar, i2);
        View view = hVar.itemView;
        l.b(view, "");
        TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.bry);
        if (!(tuxTextCell.getAccessory() instanceof c.f)) {
            l.b(tuxTextCell, "");
            Context context = tuxTextCell.getContext();
            l.b(context, "");
            tuxTextCell.setAccessory(new c.f(context));
        }
        c.b accessory = tuxTextCell.getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Disclosure");
        c.f fVar = (c.f) accessory;
        fVar.f45439a = new C1793a(this, hVar);
        fVar.a(new b(this, hVar));
    }
}
