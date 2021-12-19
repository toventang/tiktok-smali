package com.ss.android.ugc.aweme.setting.page.about;

import android.app.Dialog;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.setting.ui.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

@com.bytedance.ies.powerpage.a.a
public final class AboutPage extends com.ss.android.ugc.aweme.setting.page.a implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public static final a f122366i = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public TextView f122367e;

    /* renamed from: f  reason: collision with root package name */
    public CommonItemView f122368f;

    /* renamed from: g  reason: collision with root package name */
    public CommonItemView f122369g;

    /* renamed from: h  reason: collision with root package name */
    public Dialog f122370h;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f122371j;

    static {
        Covode.recordClassIndex(80234);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final View a(int i2) {
        if (this.f122371j == null) {
            this.f122371j = new SparseArray();
        }
        View view = (View) this.f122371j.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f122371j.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final void br_() {
        SparseArray sparseArray = this.f122371j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final int c() {
        return R.layout.axu;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80235);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        l.d(view, "");
        if (view.getId() == R.id.fkh) {
            if (this.f122370h == null) {
                a.C3180a aVar = new a.C3180a();
                aVar.f122791a = "https://www.tiktokv.com/i18n/home/";
                com.ss.android.ugc.aweme.setting.ui.a aVar2 = new com.ss.android.ugc.aweme.setting.ui.a(getContext());
                aVar2.f122790a = aVar;
                this.f122370h = aVar2;
            }
            Dialog dialog = this.f122370h;
            if (dialog != null) {
                dialog.show();
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
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
    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.page.about.AboutPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
