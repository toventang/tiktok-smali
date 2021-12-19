package com.bytedance.scene.a.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.g.a.a.b;
import androidx.g.a.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.a.e;
import com.bytedance.scene.a.f;

public final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private b f42667b = new b();

    static {
        Covode.recordClassIndex(26215);
    }

    @Override // com.bytedance.scene.a.e
    public final boolean a() {
        return true;
    }

    @Override // com.bytedance.scene.a.e
    public final Animator a(com.bytedance.scene.a.a aVar, com.bytedance.scene.a.a aVar2) {
        if (aVar2.f42666d) {
            return this.f42667b.a(aVar, aVar2);
        }
        View view = aVar.f42664b;
        View view2 = aVar2.f42664b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 1.0f);
        ofFloat.setInterpolator(new b());
        ofFloat.setDuration(120L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.ALPHA, 0.0f, 1.0f);
        ofFloat2.setInterpolator(new DecelerateInterpolator(2.0f));
        ofFloat2.setDuration(120L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, ((float) view2.getHeight()) * 0.08f, 0.0f);
        ofFloat3.setInterpolator(new DecelerateInterpolator(2.5f));
        ofFloat3.setDuration(200L);
        return f.a(ofFloat, ofFloat2, ofFloat3);
    }

    @Override // com.bytedance.scene.a.e
    public final Animator b(com.bytedance.scene.a.a aVar, com.bytedance.scene.a.a aVar2) {
        if (aVar.f42666d) {
            return this.f42667b.b(aVar, aVar2);
        }
        View view = aVar2.f42664b;
        View view2 = aVar.f42664b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(150L);
        ofFloat.setStartDelay(50);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f, ((float) view.getHeight()) * 0.08f);
        ofFloat2.setInterpolator(new AccelerateInterpolator(2.0f));
        ofFloat2.setDuration(200L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.ALPHA, 0.7f, 1.0f);
        ofFloat3.setInterpolator(new c());
        ofFloat3.setDuration(200L);
        return f.a(ofFloat, ofFloat2, ofFloat3);
    }
}
