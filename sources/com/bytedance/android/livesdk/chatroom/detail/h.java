package com.bytedance.android.livesdk.chatroom.detail;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public int f15257a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15258b;

    /* renamed from: c  reason: collision with root package name */
    public int f15259c = 1;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<View> f15260d = new WeakReference<>(null);

    static {
        Covode.recordClassIndex(8445);
    }

    private View b() {
        return this.f15260d.get();
    }

    public final void a() {
        int i2;
        View b2 = b();
        if (b2 != null) {
            if (!this.f15258b || this.f15259c != 1) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            b2.setVisibility(i2);
            ViewGroup.LayoutParams layoutParams = b2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.f15257a;
            }
        }
    }

    public final void a(boolean z) {
        this.f15258b = z;
        a();
    }
}
