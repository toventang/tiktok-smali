package com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.b;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.Map;
import java.util.Objects;

public final class a extends d {

    /* renamed from: f  reason: collision with root package name */
    com.ss.android.ugc.aweme.ecommercelive.framework.b.a f87842f;

    /* renamed from: g  reason: collision with root package name */
    b<? super String, z> f87843g;

    /* renamed from: h  reason: collision with root package name */
    h.f.a.a<z> f87844h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.a f87845i = new c(this);

    static {
        Covode.recordClassIndex(55245);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final void c() {
        this.f87845i.b();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final void d() {
        super.d();
        this.f87845i.c();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final void e() {
        super.e();
        this.f87845i.d();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final void f() {
        super.f();
        this.f87845i.e();
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final void a(com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar) {
        this.f87842f = aVar;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final void a(h.f.a.a<z> aVar) {
        this.f87844h = aVar;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final void a(b<? super String, z> bVar) {
        this.f87843g = bVar;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final View b(Context context) {
        l.d(context, "");
        return this.f87845i.a(context);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final void a(String str) {
        l.d(str, "");
        super.a(str);
        this.f87845i.d(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final void b(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        super.b(aVar);
        this.f87845i.a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final void a(Context context, boolean z, String str, Map<String, String> map) {
        l.d(context, "");
        l.d(str, "");
        super.a(context, z, str, map);
        if (z) {
            com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.a aVar = this.f87845i;
            if (!(aVar instanceof b)) {
                this.f87845i = new b(context, this, str, map);
                return;
            }
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.slot.ECExplanationCardSlotLynxImpl");
            l.d(str, "");
            ((b) aVar).f87851e = str;
        } else if (!(this.f87845i instanceof c)) {
            this.f87845i = new c(this);
        }
    }
}
