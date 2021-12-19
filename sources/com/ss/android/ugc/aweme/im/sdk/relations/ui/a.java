package com.ss.android.ugc.aweme.im.sdk.relations.ui;

import com.bytedance.covode.number.Covode;
import com.google.android.material.appbar.AppBarLayout;
import h.f.b.l;

public abstract class a implements AppBarLayout.c {

    /* renamed from: a  reason: collision with root package name */
    private EnumC2617a f103171a = EnumC2617a.IDLE;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a$a  reason: collision with other inner class name */
    public enum EnumC2617a {
        EXPANDED,
        COLLAPSED,
        IDLE;

        static {
            Covode.recordClassIndex(66156);
        }
    }

    static {
        Covode.recordClassIndex(66155);
    }

    public abstract void a(EnumC2617a aVar);

    @Override // com.google.android.material.appbar.AppBarLayout.a
    public final void a(AppBarLayout appBarLayout, int i2) {
        EnumC2617a aVar;
        l.d(appBarLayout, "");
        if (i2 == 0) {
            if (this.f103171a != EnumC2617a.EXPANDED) {
                a(EnumC2617a.EXPANDED);
            }
            aVar = EnumC2617a.EXPANDED;
        } else if (Math.abs(i2) >= appBarLayout.getTotalScrollRange()) {
            if (this.f103171a != EnumC2617a.COLLAPSED) {
                a(EnumC2617a.COLLAPSED);
            }
            aVar = EnumC2617a.COLLAPSED;
        } else {
            if (this.f103171a != EnumC2617a.IDLE) {
                a(EnumC2617a.IDLE);
            }
            aVar = EnumC2617a.IDLE;
        }
        this.f103171a = aVar;
    }
}
