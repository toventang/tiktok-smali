package com.ss.android.ugc.aweme.account.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.a;
import com.zhiliaoapp.musically.R;

public class b extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private static final int f65520a = ((int) n.b(a.f62426a, 20.0f));

    /* renamed from: b  reason: collision with root package name */
    private int f65521b = (n.a(getContext()) - (f65520a * 2));

    /* renamed from: c  reason: collision with root package name */
    private int f65522c = -2;

    static {
        Covode.recordClassIndex(40300);
    }

    public void onStart() {
        super.onStart();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(this.f65521b, this.f65522c);
        }
    }

    public b(Context context) {
        super(context, R.style.ug);
        requestWindowFeature(1);
    }
}
