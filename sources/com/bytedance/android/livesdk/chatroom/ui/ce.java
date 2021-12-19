package com.bytedance.android.livesdk.chatroom.ui;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.ap;
import com.bytedance.android.livesdk.chatroom.model.k;
import com.bytedance.android.livesdk.s;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ce implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final br f16060a;

    static {
        Covode.recordClassIndex(8884);
    }

    ce(br brVar) {
        this.f16060a = brVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        br brVar = this.f16060a;
        n.a(brVar.F, -3, ((Integer) valueAnimator.getAnimatedValue()).intValue(), -3);
        k kVar = new k();
        int[] iArr = new int[4];
        int[] iArr2 = new int[2];
        if (brVar.v != null) {
            brVar.v.getVideoSize(iArr2);
        }
        brVar.B = kVar.f15787a;
        brVar.a(iArr, iArr2[0], iArr2[1]);
        if (brVar.V != null) {
            ap apVar = new ap();
            apVar.f14003a = iArr[0];
            apVar.f14004b = iArr[1];
            apVar.f14005c = iArr[2];
            apVar.f14006d = iArr[3];
            brVar.V.b(s.class, apVar);
        }
    }
}
