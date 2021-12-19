package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.chatroom.b;
import com.bytedance.android.livesdk.chatroom.c.n;
import com.bytedance.android.livesdk.chatroom.c.o;
import com.bytedance.android.livesdk.chatroom.c.s;
import com.bytedance.android.livesdk.chatroom.g.e;
import com.bytedance.android.livesdk.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.b.a;

public class SplitScreenWidget extends LiveRecyclableWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    b f16619a;

    /* renamed from: b  reason: collision with root package name */
    private ValueAnimator f16620b;

    /* renamed from: c  reason: collision with root package name */
    private final a f16621c = new a();

    static {
        Covode.recordClassIndex(9217);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        ValueAnimator valueAnimator = this.f16620b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f16621c.a();
        this.f16619a = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        if (this.dataChannel != null) {
            this.f16619a = (b) this.dataChannel.b(t.class);
            if (b.a(this.dataChannel)) {
                a(true, false);
            }
        }
        this.f16621c.a(com.bytedance.android.livesdk.an.a.a().a(n.class).d(new w(this)));
        this.f16621c.a(com.bytedance.android.livesdk.an.a.a().a(s.class).d(new x(this)));
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z, boolean z2) {
        float f2;
        int i2;
        int i3;
        int d2 = y.d(R.dimen.wo);
        b bVar = this.f16619a;
        if (bVar != null) {
            View view = bVar.f14942c;
            View view2 = this.f16619a.f14947h;
            if (z2) {
                e.a(getContext(), view, z, view.getWidth());
                ValueAnimator valueAnimator = this.f16620b;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (z) {
                    i3 = 0;
                } else {
                    i3 = d2;
                }
                if (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    i3 = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).rightMargin;
                }
                if (!z) {
                    d2 = 0;
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(i3, d2);
                Math.abs(i3 - d2);
                ValueAnimator duration = ofInt.setDuration(200L);
                this.f16620b = duration;
                duration.addUpdateListener(new y(view2));
                this.f16620b.start();
            } else {
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = (float) d2;
                }
                view.setTranslationX(f2);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
                if (!z) {
                    d2 = 0;
                }
                com.bytedance.common.utility.n.a(view2, -3, d2, -3);
            }
        }
        com.bytedance.android.livesdk.an.a.a().a(new o(z, z2));
    }
}
