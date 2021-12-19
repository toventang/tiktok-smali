package com.ss.android.ugc.aweme.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.zhiliaoapp.musically.R;

public class o extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private static final int f144694a = ((int) n.b(d.a(), 20.0f));

    /* renamed from: l  reason: collision with root package name */
    protected int f144695l;

    /* renamed from: m  reason: collision with root package name */
    protected int f144696m;

    public void aj_() {
    }

    static {
        Covode.recordClassIndex(94653);
    }

    public void onStart() {
        super.onStart();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(this.f144695l, this.f144696m);
        }
    }

    public o(Context context) {
        super(context, R.style.zf);
        this.f144695l = n.a(getContext()) + 0;
        this.f144696m = n.b(getContext()) + 0;
        requestWindowFeature(1);
        aj_();
    }

    public o(Context context, int i2, boolean z, boolean z2) {
        this(context, i2, z, z2, false);
    }

    public o(Context context, int i2, boolean z, boolean z2, boolean z3) {
        super(context, i2);
        int a2;
        requestWindowFeature(1);
        int i3 = -1;
        if (z3) {
            a2 = -2;
        } else if (z) {
            a2 = -1;
        } else {
            a2 = n.a(getContext()) - (f144694a * 2);
        }
        this.f144695l = a2;
        if (!z) {
            if (z2) {
                i3 = -2;
            } else {
                i3 = n.b(getContext()) - (f144694a * 4);
            }
        }
        this.f144696m = i3;
        aj_();
    }
}
