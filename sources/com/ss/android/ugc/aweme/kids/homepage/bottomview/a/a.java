package com.ss.android.ugc.aweme.kids.homepage.bottomview.a;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

public abstract class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f106552a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f106553b;

    static {
        Covode.recordClassIndex(68086);
    }

    public abstract void a();

    public abstract void a(boolean z);

    public boolean isSelected() {
        return this.f106553b;
    }

    public a(Context context) {
        super(context);
    }

    public void setRefreshing(boolean z) {
        this.f106552a = z;
    }

    public void setSelected(boolean z) {
        this.f106553b = z;
    }
}
