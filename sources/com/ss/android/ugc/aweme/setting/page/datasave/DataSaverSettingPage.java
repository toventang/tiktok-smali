package com.ss.android.ugc.aweme.setting.page.datasave;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.dm;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

@com.bytedance.ies.powerpage.a.a
public final class DataSaverSettingPage extends com.ss.android.ugc.aweme.setting.page.a {

    /* renamed from: e  reason: collision with root package name */
    private final h f122451e = i.a((h.f.a.a) new a(this));

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f122452f;

    static {
        Covode.recordClassIndex(80306);
    }

    private final dm d() {
        return (dm) this.f122451e.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final View a(int i2) {
        if (this.f122452f == null) {
            this.f122452f = new SparseArray();
        }
        View view = (View) this.f122452f.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f122452f.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final void br_() {
        SparseArray sparseArray = this.f122452f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final int c() {
        return R.layout.ay2;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    static final class a extends m implements h.f.a.a<dm> {
        final /* synthetic */ DataSaverSettingPage this$0;

        static {
            Covode.recordClassIndex(80307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DataSaverSettingPage dataSaverSettingPage) {
            super(0);
            this.this$0 = dataSaverSettingPage;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dm invoke() {
            PowerList powerList = (PowerList) this.this$0.a(R.id.cb4);
            l.b(powerList, "");
            return new dm(powerList);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.ss.android.ugc.aweme.setting.page.a
    public final void a(android.app.Activity r9) {
        /*
            r8 = this;
            java.lang.String r2 = ""
            h.f.b.l.d(r9, r2)
            r0 = 2131823146(0x7f110a2a, float:1.9279083E38)
            com.ss.android.ugc.aweme.setting.page.base.b.a(r8, r0)
            com.ss.android.ugc.aweme.dm r1 = r8.d()
            com.ss.android.ugc.aweme.setting.page.datasave.a r0 = new com.ss.android.ugc.aweme.setting.page.datasave.a
            r7 = r8
            r0.<init>(r7)
            r1.a(r0)
            boolean r0 = com.ss.android.ugc.aweme.api.h.a()
            if (r0 == 0) goto L_0x005b
            boolean r0 = com.ss.android.ugc.aweme.utils.in.d()
            if (r0 != 0) goto L_0x005b
            r0 = 2131820786(0x7f1100f2, float:1.9274297E38)
            java.lang.String r6 = r9.getString(r0)
            h.f.b.l.b(r6, r2)
            com.ss.android.ugc.aweme.dm r5 = r8.d()
            com.ss.android.ugc.aweme.dc.d r4 = new com.ss.android.ugc.aweme.dc.d
            com.ss.android.ugc.aweme.be.e r3 = new com.ss.android.ugc.aweme.be.e
            r2 = 1
            r1 = 0
            r0 = 12
            r3.<init>(r6, r2, r1, r0)
            r4.<init>(r3)
            r5.a(r4)
            com.ss.android.ugc.aweme.dm r1 = r8.d()
            com.ss.android.ugc.aweme.setting.page.datasave.zerorating.c r0 = new com.ss.android.ugc.aweme.setting.page.datasave.zerorating.c
            r0.<init>(r7)
            r1.a(r0)
            com.ss.android.ugc.aweme.dm r1 = r8.d()
            com.ss.android.ugc.aweme.setting.page.datasave.zerorating.a r0 = new com.ss.android.ugc.aweme.setting.page.datasave.zerorating.a
            r0.<init>(r7)
            r1.a(r0)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.page.datasave.DataSaverSettingPage.a(android.app.Activity):void");
    }
}
