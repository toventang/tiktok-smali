package com.bytedance.tux.skeleton;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.core.content.a.g;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class h {

    /* renamed from: f  reason: collision with root package name */
    public static final a f45335f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f45336a;

    /* renamed from: b  reason: collision with root package name */
    public final int f45337b;

    /* renamed from: c  reason: collision with root package name */
    public final int f45338c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f45339d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f45340e;

    static {
        Covode.recordClassIndex(27622);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27623);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private h(Context context) {
        this.f45340e = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.aqt, R.attr.aqv, R.attr.aqx, R.attr.aqy}, R.attr.c4, 0);
        this.f45336a = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        int b2 = g.b(obtainStyledAttributes, 1);
        this.f45337b = b2;
        this.f45338c = obtainStyledAttributes.getColor(2, b2);
        this.f45339d = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ h(Context context, byte b2) {
        this(context);
    }
}
