package com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.b;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.a;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.c.b;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.business.common.a.f;
import com.ss.android.ugc.aweme.ecommercelive.business.common.b.d;
import h.f.b.l;
import h.z;

public final class c extends a {
    static {
        Covode.recordClassIndex(55250);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.a
    public final void b() {
        View view = this.f87832a.f87836b;
        if (!(view instanceof b)) {
            view = null;
        }
        b bVar = (b) view;
        if (bVar != null) {
            a(bVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.a
    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        super.a(aVar);
        aVar.invoke();
    }

    private final void a(b bVar) {
        PopupCardVO popupCardVO = this.f87832a.f87835a;
        if (popupCardVO != null) {
            bVar.a(popupCardVO, this.f87832a.f87842f, this.f87832a.f87843g, this.f87832a.f87844h);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.a.a
    public final View a(Context context) {
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
        b bVar = new b(context, (byte) 0);
        a(bVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n.a(300.0d), -2);
        layoutParams.gravity = 80;
        layoutParams.leftMargin = n.a(12.0d);
        layoutParams.bottomMargin = n.a(8.0d);
        bVar.setLayoutParams(layoutParams);
        PopupCardVO popupCardVO2 = this.f87832a.f87835a;
        if (popupCardVO2 != null && popupCardVO2.isFromMessage() && ((popupCardVO = this.f87832a.f87835a) == null || (sourceMessage2 = popupCardVO.getSourceMessage()) == null || (fVar2 = sourceMessage2.f87956l) == null || fVar2.f87974a != 0)) {
            PopupCardVO popupCardVO3 = this.f87832a.f87835a;
            String str3 = null;
            if (popupCardVO3 != null) {
                str = String.valueOf(popupCardVO3.getProductId());
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar = this.f87832a.f87842f;
            if (aVar != null) {
                str2 = aVar.c("room_id");
            } else {
                str2 = null;
            }
            PopupCardVO popupCardVO4 = this.f87832a.f87835a;
            if (popupCardVO4 != null) {
                str3 = popupCardVO4.getFromMessageId();
            }
            PopupCardVO popupCardVO5 = this.f87832a.f87835a;
            if (!(popupCardVO5 == null || (sourceMessage = popupCardVO5.getSourceMessage()) == null || (fVar = sourceMessage.f87956l) == null)) {
                long currentTimeMillis = System.currentTimeMillis() - fVar.f87974a;
                long j4 = fVar.f87975f - fVar.f87974a;
                long j5 = fVar.f87976g - fVar.f87975f;
                com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar2 = this.f87832a.f87842f;
                if (aVar2 != null) {
                    j2 = aVar2.d("client_received_time");
                } else {
                    j2 = 0;
                }
                long j6 = j2 - fVar.f87976g;
                long currentTimeMillis2 = System.currentTimeMillis();
                com.ss.android.ugc.aweme.ecommercelive.framework.b.a aVar3 = this.f87832a.f87842f;
                if (aVar3 != null) {
                    j3 = aVar3.d("client_received_time");
                } else {
                    j3 = 0;
                }
                d.a(str, str2, str3, currentTimeMillis, j4, j5, j6, currentTimeMillis2 - j3);
            }
        }
        return bVar;
    }
}
