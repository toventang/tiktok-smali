package com.bytedance.android.livesdk.guide;

import android.content.Context;
import androidx.appcompat.app.d;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.h;
import com.bytedance.android.live.gift.j;
import com.bytedance.android.livesdk.guide.a;
import com.bytedance.android.livesdk.guide.b;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class LiveGiftGuideWidget extends LiveWidget implements a.AbstractC0378a, b.a, au {

    /* renamed from: a  reason: collision with root package name */
    private final b f18079a = new b();

    /* renamed from: b  reason: collision with root package name */
    private a f18080b;

    static {
        Covode.recordClassIndex(10026);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        b bVar = this.f18079a;
        IMessageManager iMessageManager = bVar.f18098b;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(bVar);
        }
        f.a.b.b bVar2 = bVar.f18102f;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        bVar.f18104h.a();
    }

    @Override // com.bytedance.android.livesdk.guide.a.AbstractC0378a
    public final void a() {
        Context context = this.context;
        androidx.fragment.app.i iVar = null;
        if (!(context instanceof d)) {
            context = null;
        }
        e eVar = (e) context;
        if (eVar != null) {
            iVar = eVar.getSupportFragmentManager();
        }
        a aVar = this.f18080b;
        if (aVar == null) {
            return;
        }
        if (!y.g()) {
            if (iVar != null) {
                n a2 = iVar.a().a(R.anim.el, R.anim.ep);
                if (a2 != null) {
                    a2.a(aVar).c();
                }
                iVar.c();
            }
        } else if (iVar != null) {
            n a3 = iVar.a().a(R.anim.em, R.anim.en);
            if (a3 != null) {
                a3.a(aVar).c();
            }
            iVar.c();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        IMessageManager iMessageManager;
        super.onCreate();
        b bVar = this.f18079a;
        DataChannel dataChannel = this.dataChannel;
        l.d(this, "");
        bVar.f18097a = dataChannel;
        DataChannel dataChannel2 = bVar.f18097a;
        if (dataChannel2 != null) {
            iMessageManager = (IMessageManager) dataChannel2.b(cg.class);
        } else {
            iMessageManager = null;
        }
        bVar.f18098b = iMessageManager;
        bVar.f18099c = this;
        bVar.f18104h.a(com.bytedance.android.livesdk.an.a.a().a(j.class).d(new b.C0379b(bVar)));
        DataChannel dataChannel3 = bVar.f18097a;
        if (dataChannel3 != null) {
            dataChannel3.a(ba.class, (h.f.a.b) new b.c(bVar));
        }
        b bVar2 = this.f18079a;
        IMessageManager iMessageManager2 = bVar2.f18098b;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.GIFT_GUIDE_MESSAGE.getIntType(), bVar2);
        }
    }

    @Override // com.bytedance.android.livesdk.guide.b.a
    public final void a(com.bytedance.android.livesdk.model.message.c.b bVar) {
        com.bytedance.android.livesdk.an.a.a().a(new h(bVar));
    }

    @Override // com.bytedance.android.livesdk.guide.b.a
    public final void a(long j2, com.bytedance.android.livesdk.model.message.c.b bVar) {
        androidx.fragment.app.i supportFragmentManager;
        a aVar = new a();
        this.f18080b = aVar;
        aVar.f18083c = this.dataChannel;
        a aVar2 = this.f18080b;
        if (aVar2 != null) {
            l.d(this, "");
            aVar2.f18084d = this;
        }
        a aVar3 = this.f18080b;
        if (aVar3 != null) {
            aVar3.f18081a = j2;
            aVar3.f18082b = bVar;
        }
        Context context = this.context;
        if (!(context instanceof d)) {
            context = null;
        }
        e eVar = (e) context;
        if (eVar != null && (supportFragmentManager = eVar.getSupportFragmentManager()) != null) {
            n a2 = supportFragmentManager.a();
            l.b(a2, "");
            a aVar4 = this.f18080b;
            if (aVar4 != null) {
                if (!y.g()) {
                    a2.a(R.anim.el, R.anim.ep).a(R.id.ffh, aVar4, "LiveGiftGuideDialog").a("LiveGiftGuideDialog");
                } else {
                    a2.a(R.anim.em, R.anim.en).a(R.id.ffh, aVar4, "LiveGiftGuideDialog").a("LiveGiftGuideDialog");
                }
            }
            a2.c();
        }
    }
}
