package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.a.f;
import com.bytedance.covode.number.Covode;

public class NavigationMenuView extends RecyclerView implements p {
    static {
        Covode.recordClassIndex(32536);
    }

    @Override // androidx.appcompat.view.menu.p
    public final void a(h hVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NavigationMenuView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
        addOnAttachStateChangeListener(new f());
    }
}
