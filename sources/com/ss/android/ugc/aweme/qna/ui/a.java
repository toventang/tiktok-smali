package com.ss.android.ugc.aweme.qna.ui;

import com.bytedance.covode.number.Covode;
import com.google.android.material.appbar.AppBarLayout;
import h.f.b.l;

public abstract class a implements AppBarLayout.c {

    /* renamed from: a  reason: collision with root package name */
    private EnumC3087a f119528a = EnumC3087a.IDLE;

    /* renamed from: com.ss.android.ugc.aweme.qna.ui.a$a  reason: collision with other inner class name */
    public enum EnumC3087a {
        EXPANDED,
        COLLAPSED,
        IDLE;

        static {
            Covode.recordClassIndex(77675);
        }
    }

    static {
        Covode.recordClassIndex(77674);
    }

    public abstract void a(EnumC3087a aVar);

    @Override // com.google.android.material.appbar.AppBarLayout.a
    public final void a(AppBarLayout appBarLayout, int i2) {
        l.d(appBarLayout, "");
        if (i2 == 0 && this.f119528a != EnumC3087a.EXPANDED) {
            a(EnumC3087a.EXPANDED);
            this.f119528a = EnumC3087a.EXPANDED;
        } else if (Math.abs(i2) >= appBarLayout.getTotalScrollRange() && this.f119528a != EnumC3087a.COLLAPSED) {
            a(EnumC3087a.COLLAPSED);
            this.f119528a = EnumC3087a.COLLAPSED;
        } else if (i2 != 0 && this.f119528a != EnumC3087a.IDLE) {
            a(EnumC3087a.IDLE);
            this.f119528a = EnumC3087a.IDLE;
        }
    }
}
