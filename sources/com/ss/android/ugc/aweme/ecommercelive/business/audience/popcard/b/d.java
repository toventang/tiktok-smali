package com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.b;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.c.c;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.business.common.a.f;
import com.ss.android.ugc.aweme.ecommercelive.framework.b.a;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class d extends com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d {

    /* renamed from: f  reason: collision with root package name */
    private a f87856f;

    /* renamed from: g  reason: collision with root package name */
    private b<? super String, z> f87857g;

    /* renamed from: h  reason: collision with root package name */
    private h.f.a.a<z> f87858h;

    static {
        Covode.recordClassIndex(55251);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final void c() {
        View view = this.f87836b;
        if (!(view instanceof c)) {
            view = null;
        }
        c cVar = (c) view;
        if (cVar != null) {
            a(cVar);
        }
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
    public final void a(a aVar) {
        this.f87856f = aVar;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final void a(h.f.a.a<z> aVar) {
        this.f87858h = aVar;
    }

    private final void a(c cVar) {
        PopupCardVO popupCardVO = this.f87835a;
        if (popupCardVO != null) {
            cVar.a(popupCardVO, this.f87856f, this.f87857g, this.f87858h);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final void a(b<? super String, z> bVar) {
        this.f87857g = bVar;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.d
    public final View b(Context context) {
        PopupCardVO popupCardVO;
        String str;
        String str2;
        com.ss.android.ugc.aweme.ecommercelive.business.common.a.b sourceMessage;
        f fVar;
        long j2;
        long j3;
        com.ss.android.ugc.aweme.ecommercelive.business.common.a.b sourceMessage2;
        f fVar2;
        l.d(context, "");
        c cVar = new c(context, (byte) 0);
        a(cVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        layoutParams.leftMargin = n.a(12.0d);
        cVar.setLayoutParams(layoutParams);
        PopupCardVO popupCardVO2 = this.f87835a;
        if (popupCardVO2 != null && popupCardVO2.isFromMessage() && ((popupCardVO = this.f87835a) == null || (sourceMessage2 = popupCardVO.getSourceMessage()) == null || (fVar2 = sourceMessage2.f87956l) == null || fVar2.f87974a != 0)) {
            PopupCardVO popupCardVO3 = this.f87835a;
            String str3 = null;
            if (popupCardVO3 != null) {
                str = String.valueOf(popupCardVO3.getProductId());
            } else {
                str = null;
            }
            a aVar = this.f87856f;
            if (aVar != null) {
                str2 = aVar.c("room_id");
            } else {
                str2 = null;
            }
            PopupCardVO popupCardVO4 = this.f87835a;
            if (popupCardVO4 != null) {
                str3 = popupCardVO4.getFromMessageId();
            }
            PopupCardVO popupCardVO5 = this.f87835a;
            if (!(popupCardVO5 == null || (sourceMessage = popupCardVO5.getSourceMessage()) == null || (fVar = sourceMessage.f87956l) == null)) {
                long currentTimeMillis = System.currentTimeMillis() - fVar.f87974a;
                long j4 = fVar.f87975f - fVar.f87974a;
                long j5 = fVar.f87976g - fVar.f87975f;
                a aVar2 = this.f87856f;
                if (aVar2 != null) {
                    j2 = aVar2.d("client_received_time");
                } else {
                    j2 = 0;
                }
                long j6 = j2 - fVar.f87976g;
                long currentTimeMillis2 = System.currentTimeMillis();
                a aVar3 = this.f87856f;
                if (aVar3 != null) {
                    j3 = aVar3.d("client_received_time");
                } else {
                    j3 = 0;
                }
                com.ss.android.ugc.aweme.ecommercelive.business.common.b.d.a(str, str2, str3, currentTimeMillis, j4, j5, j6, currentTimeMillis2 - j3);
            }
        }
        return cVar;
    }
}
