package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class e extends f {
    static {
        Covode.recordClassIndex(48114);
    }

    static final class a extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(48115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Boolean invoke;
            h.f.a.b<? super Integer, Boolean> bVar = this.this$0.f77716a.n;
            if (bVar == null || (invoke = bVar.invoke(Integer.valueOf(this.this$0.f77716a.f77729g))) == null) {
                z = false;
            } else {
                z = invoke.booleanValue();
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(gVar);
        l.d(gVar, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.tux.table.cell.TuxTextCell r7) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.e.a(com.bytedance.tux.table.cell.TuxTextCell):void");
    }

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f77715a;

        static {
            Covode.recordClassIndex(48116);
        }

        b(e eVar) {
            this.f77715a = eVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            h.f.a.b<? super Integer, z> bVar = this.f77715a.f77716a.f77734l;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(this.f77715a.f77716a.f77729g));
            }
        }
    }
}
