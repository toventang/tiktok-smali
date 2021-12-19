package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.bytedance.covode.number.Covode;

public class SmoothLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public float f15815a = 25.0f;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15816b = true;

    static {
        Covode.recordClassIndex(8727);
    }

    public SmoothLinearLayoutManager() {
        super(1, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.i
    public final void a(RecyclerView recyclerView, RecyclerView.s sVar, int i2) {
        RecyclerView.r r1;
        if (i2 < 0) {
            i2 = 0;
        }
        if (this.f15816b) {
            r1 = new r(recyclerView.getContext()) {
                /* class com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(8728);
                }

                @Override // androidx.recyclerview.widget.r
                public final float a(DisplayMetrics displayMetrics) {
                    return SmoothLinearLayoutManager.this.f15815a / ((float) displayMetrics.densityDpi);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.r, androidx.recyclerview.widget.r
                public final void a(View view, RecyclerView.s sVar, RecyclerView.r.a aVar) {
                    int b2 = b(view, b());
                    int a2 = a(view, c());
                    int b3 = b((int) Math.sqrt((double) ((b2 * b2) + (a2 * a2))));
                    if (b3 > 0) {
                        aVar.a(-b2, -a2, b3, this.f4199a);
                    }
                }
            };
        } else {
            r1 = new r(recyclerView.getContext()) {
                /* class com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(8729);
                }

                @Override // androidx.recyclerview.widget.r
                public final float a(DisplayMetrics displayMetrics) {
                    return SmoothLinearLayoutManager.this.f15815a / ((float) displayMetrics.densityDpi);
                }
            };
        }
        r1.f3862g = i2;
        a(r1);
    }

    public SmoothLinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
