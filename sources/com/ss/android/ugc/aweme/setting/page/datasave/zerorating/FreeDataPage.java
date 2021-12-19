package com.ss.android.ugc.aweme.setting.page.datasave.zerorating;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.a.a;
import com.zhiliaoapp.musically.R;

@a
public final class FreeDataPage extends com.ss.android.ugc.aweme.setting.page.a {

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f122460e;

    static {
        Covode.recordClassIndex(80312);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final View a(int i2) {
        if (this.f122460e == null) {
            this.f122460e = new SparseArray();
        }
        View view = (View) this.f122460e.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f122460e.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final void br_() {
        SparseArray sparseArray = this.f122460e;
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

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
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
    public final void a(android.app.Activity r13) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.page.datasave.zerorating.FreeDataPage.a(android.app.Activity):void");
    }
}
