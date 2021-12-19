package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import com.bytedance.covode.number.Covode;

public final class e extends h {
    static {
        Covode.recordClassIndex(32544);
    }

    public e(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        j jVar = (j) a(i2, i3, i4, charSequence);
        g gVar = new g(this.f1211a, this, jVar);
        jVar.a(gVar);
        return gVar;
    }
}
