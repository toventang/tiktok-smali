package com.ss.android.ugc.aweme.comment.adapter;

import android.os.Build;
import android.view.ViewGroup;
import androidx.lifecycle.u;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.gb;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements u {

    /* renamed from: a  reason: collision with root package name */
    private final f f71373a;

    static {
        Covode.recordClassIndex(43935);
    }

    g(f fVar) {
        this.f71373a = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        f fVar = this.f71373a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.f71359a.getLayoutParams();
        int b2 = (int) n.b(fVar.itemView.getContext(), ((Boolean) obj).booleanValue() ? 90.0f : 54.0f);
        if (gb.a(fVar.itemView.getContext())) {
            marginLayoutParams.rightMargin = b2;
        } else {
            marginLayoutParams.leftMargin = b2;
        }
        int i2 = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginStart(b2);
        fVar.f71359a.invalidate();
    }
}
