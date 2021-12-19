package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class AVDmtTabLayout extends TabLayout {
    public static final a v = new a((byte) 0);
    public TabLayout.c u;
    private int w;
    private int x;

    static {
        Covode.recordClassIndex(90727);
    }

    public AVDmtTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90728);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static a a(Context context) {
            if (context == null) {
                l.b();
            }
            return new a(context, (byte) 0);
        }

        public static a b(Context context) {
            if (context == null) {
                l.b();
            }
            return new a(context, (byte) 0);
        }
    }

    public final void f() {
        setTabMargin(com.ss.android.ugc.tools.a.f149054l.f149060e);
    }

    public static final class b implements TabLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AVDmtTabLayout f138685a;

        static {
            Covode.recordClassIndex(90729);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(AVDmtTabLayout aVDmtTabLayout) {
            this.f138685a = aVDmtTabLayout;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void a(TabLayout.f fVar) {
            l.d(fVar, "");
            if (this.f138685a.u != null) {
                TabLayout.c cVar = this.f138685a.u;
                if (cVar == null) {
                    l.b();
                }
                cVar.a(fVar);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void b(TabLayout.f fVar) {
            l.d(fVar, "");
            if (this.f138685a.u != null) {
                TabLayout.c cVar = this.f138685a.u;
                if (cVar == null) {
                    l.b();
                }
                cVar.b(fVar);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void c(TabLayout.f fVar) {
            l.d(fVar, "");
            if (this.f138685a.u != null) {
                TabLayout.c cVar = this.f138685a.u;
                if (cVar == null) {
                    l.b();
                }
                cVar.c(fVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout
    public final void a(TabLayout.c cVar) {
        l.d(cVar, "");
        this.u = cVar;
    }

    public final void setMaxTabModeForCount(int i2) {
        if (i2 <= 1) {
            setHideIndicatorView(true);
        } else {
            setHideIndicatorView(false);
        }
        if (i2 > 4 || i2 <= 1) {
            setTabMode(0);
        } else {
            setTabMode(1);
        }
    }

    private /* synthetic */ AVDmtTabLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AVDmtTabLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kg, R.attr.kr, R.attr.nt, R.attr.sg, R.attr.u3, R.attr.v1, R.attr.x8, R.attr.x9, R.attr.x_, R.attr.xa, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xj, R.attr.xk, R.attr.y0, R.attr.y1, R.attr.y2, R.attr.y4, R.attr.z_, R.attr.a2k, R.attr.a3q, R.attr.a61, R.attr.a6b, R.attr.a6k, R.attr.a6p, R.attr.a7e, R.attr.a7f, R.attr.a_v, R.attr.ab4, R.attr.ab8, R.attr.abt, R.attr.abu, R.attr.afv, R.attr.ai9, R.attr.aif, R.attr.aij, R.attr.aio, R.attr.ais, R.attr.aj7, R.attr.ajr, R.attr.asi, R.attr.asq, R.attr.ass});
            l.b(obtainStyledAttributes, "");
            obtainStyledAttributes.getBoolean(27, false);
        }
        int i2 = c.f138713a;
        this.w = i2;
        this.x = (i2 & 16777215) | Integer.MIN_VALUE;
        setOverScrollMode(2);
        a(this.x, this.w);
        setSelectedTabIndicatorColor(this.w);
        setTabMargin(16);
        super.a(new b(this));
    }
}
