package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import com.bytedance.covode.number.Covode;

public final class b extends h {
    static {
        Covode.recordClassIndex(32471);
    }

    public b(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }

    @Override // androidx.appcompat.view.menu.h
    public final MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            e();
            MenuItem a2 = super.a(i2, i3, i4, charSequence);
            if (a2 instanceof j) {
                ((j) a2).a(true);
            }
            f();
            return a2;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }
}
