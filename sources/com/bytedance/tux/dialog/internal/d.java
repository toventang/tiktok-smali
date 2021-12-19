package com.bytedance.tux.dialog.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d {
    public static final a x = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final TypedArray f44903a;

    /* renamed from: b  reason: collision with root package name */
    public final int f44904b;

    /* renamed from: c  reason: collision with root package name */
    public final int f44905c;

    /* renamed from: d  reason: collision with root package name */
    public final int f44906d;

    /* renamed from: e  reason: collision with root package name */
    public final int f44907e;

    /* renamed from: f  reason: collision with root package name */
    public final int f44908f;

    /* renamed from: g  reason: collision with root package name */
    public final float f44909g;

    /* renamed from: h  reason: collision with root package name */
    public final int f44910h;

    /* renamed from: i  reason: collision with root package name */
    public final int f44911i;

    /* renamed from: j  reason: collision with root package name */
    public final int f44912j;

    /* renamed from: k  reason: collision with root package name */
    public final int f44913k;

    /* renamed from: l  reason: collision with root package name */
    public final int f44914l;

    /* renamed from: m  reason: collision with root package name */
    public final int f44915m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final Context w;

    static {
        Covode.recordClassIndex(27412);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27413);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static d a(Context context) {
            l.c(context, "");
            return new d(context, (byte) 0);
        }
    }

    private d(Context context) {
        this.w = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.cw, R.attr.cx, R.attr.cy, R.attr.cz, R.attr.d0, R.attr.d1, R.attr.d2, R.attr.d3, R.attr.d4, R.attr.d5, R.attr.d6, R.attr.d7, R.attr.d8, R.attr.d9, R.attr.d_, R.attr.da, R.attr.db, R.attr.dc, R.attr.dd, R.attr.de, R.attr.df, R.attr.dg}, R.attr.br, 0);
        l.a((Object) obtainStyledAttributes, "");
        this.f44903a = obtainStyledAttributes;
        this.f44904b = obtainStyledAttributes.getInt(18, 0);
        this.f44905c = obtainStyledAttributes.getInt(16, 0);
        this.f44906d = obtainStyledAttributes.getInt(17, 0);
        this.f44907e = obtainStyledAttributes.getInt(15, 0);
        this.f44908f = obtainStyledAttributes.getInt(14, 0);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        this.f44909g = obtainStyledAttributes.getDimension(13, TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
        this.f44910h = obtainStyledAttributes.getColor(8, 0);
        this.f44911i = obtainStyledAttributes.getColor(11, 0);
        this.f44912j = obtainStyledAttributes.getColor(12, 0);
        this.f44913k = obtainStyledAttributes.getColor(4, 0);
        this.f44914l = obtainStyledAttributes.getColor(7, 0);
        this.f44915m = obtainStyledAttributes.getColor(10, 0);
        this.n = obtainStyledAttributes.getColor(9, 0);
        this.o = obtainStyledAttributes.getColor(6, 0);
        this.p = obtainStyledAttributes.getColor(5, 0);
        this.q = obtainStyledAttributes.getColor(3, 0);
        this.r = obtainStyledAttributes.getResourceId(0, 0);
        this.s = obtainStyledAttributes.getResourceId(19, 0);
        this.t = obtainStyledAttributes.getInt(1, 0);
        this.u = obtainStyledAttributes.getInt(2, 0);
        this.v = obtainStyledAttributes.getInt(20, 0);
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ d(Context context, byte b2) {
        this(context);
    }
}
