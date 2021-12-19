package com.ss.android.ugc.aweme.editSticker.text.effect;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.style.StyleTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class m extends com.ss.android.ugc.tools.view.widget.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f88519a;

    /* renamed from: b  reason: collision with root package name */
    private final int f88520b;

    /* renamed from: d  reason: collision with root package name */
    private final int f88521d;

    /* renamed from: e  reason: collision with root package name */
    private final int f88522e;

    /* renamed from: f  reason: collision with root package name */
    private final int f88523f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f88524g;

    /* renamed from: h  reason: collision with root package name */
    private final int f88525h;

    /* renamed from: i  reason: collision with root package name */
    private final int f88526i;

    /* renamed from: j  reason: collision with root package name */
    private final int f88527j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f88528k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f88529l;

    /* renamed from: m  reason: collision with root package name */
    private final int f88530m;
    private final int n;
    private final int o;
    private final int p;

    static {
        Covode.recordClassIndex(55722);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f88531a;

        /* renamed from: b  reason: collision with root package name */
        public int f88532b;

        /* renamed from: c  reason: collision with root package name */
        public int f88533c;

        /* renamed from: d  reason: collision with root package name */
        public int f88534d;

        /* renamed from: e  reason: collision with root package name */
        public int f88535e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f88536f = true;

        /* renamed from: g  reason: collision with root package name */
        public int f88537g = 4;

        /* renamed from: h  reason: collision with root package name */
        public int f88538h = 4;

        /* renamed from: i  reason: collision with root package name */
        public int f88539i = R.color.bh;

        /* renamed from: j  reason: collision with root package name */
        public boolean f88540j = true;

        /* renamed from: k  reason: collision with root package name */
        public boolean f88541k = true;

        /* renamed from: l  reason: collision with root package name */
        public int f88542l = 2;

        /* renamed from: m  reason: collision with root package name */
        public int f88543m = R.color.bh;
        public int n = R.color.b9;
        public int o = 2;
        public final Context p;

        static {
            Covode.recordClassIndex(55723);
        }

        public a(Context context) {
            l.d(context, "");
            this.p = context;
        }
    }

    @Override // com.ss.android.ugc.tools.view.widget.c.a
    public final View a(Context context) {
        l.d(context, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        StyleTextView styleTextView = new StyleTextView(context);
        styleTextView.setLayoutParams(layoutParams);
        styleTextView.setGravity(17);
        styleTextView.setTextColor(b.c(context, R.color.bx));
        return styleTextView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Context context, boolean z, int i2, int i3, int i4, int i5, boolean z2, int i6, int i7, int i8, boolean z3, boolean z4, int i9, int i10, int i11, int i12) {
        super(context, z, i2, i3, i4, i5, z2, i6, i7, i8, z3, z4, i9, i10, i11, i12);
        l.d(context, "");
        this.f88519a = z;
        this.f88520b = i2;
        this.f88521d = i3;
        this.f88522e = i4;
        this.f88523f = i5;
        this.f88524g = z2;
        this.f88525h = i6;
        this.f88526i = i7;
        this.f88527j = i8;
        this.f88528k = z3;
        this.f88529l = z4;
        this.f88530m = i9;
        this.n = i10;
        this.o = i11;
        this.p = i12;
    }
}
