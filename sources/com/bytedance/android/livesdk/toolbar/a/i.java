package com.bytedance.android.livesdk.toolbar.a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.livesdk.gift.model.h;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.toolbar.d;
import com.bytedance.android.livesdk.toolbar.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.facebook.drawee.f.a;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f21689a;

    /* renamed from: b  reason: collision with root package name */
    private final View f21690b;

    /* renamed from: c  reason: collision with root package name */
    private final DataChannel f21691c;

    static {
        Covode.recordClassIndex(12789);
    }

    i(f fVar, View view, DataChannel dataChannel) {
        this.f21689a = fVar;
        this.f21690b = view;
        this.f21691c = dataChannel;
    }

    public final void run() {
        h giftIconInfo;
        Room room;
        a aVar;
        MethodCollector.i(9283);
        f fVar = this.f21689a;
        View view = this.f21690b;
        DataChannel dataChannel = this.f21691c;
        if (fVar.f21684d != null && fVar.f21684d.booleanValue()) {
            com.bytedance.android.livesdk.toolbar.a.a(view);
        }
        fVar.f21681a = new e(view.getContext(), dataChannel);
        e eVar = fVar.f21681a;
        com.a.a(LayoutInflater.from(eVar.getContext()), eVar.f21707i ? R.layout.b_1 : R.layout.b_0, eVar, true);
        eVar.setClipChildren(false);
        if (eVar.f21707i) {
            LiveAutoRtlTextView liveAutoRtlTextView = (LiveAutoRtlTextView) eVar.findViewById(R.id.enr);
            liveAutoRtlTextView.setText(y.a((int) R.string.edg));
            eVar.f21704f = liveAutoRtlTextView;
        }
        eVar.f21701c = (HSImageView) eVar.findViewById(R.id.bb8);
        HSImageView hSImageView = eVar.f21701c;
        if (!(hSImageView == null || (aVar = (a) hSImageView.getHierarchy()) == null)) {
            aVar.b(0);
        }
        eVar.f21703e = (ImageView) eVar.findViewById(R.id.bb9);
        eVar.f21700b = new d(eVar.f21699a);
        d dVar = eVar.f21700b;
        if (dVar != null) {
            l.d(eVar, "");
            dVar.f21696b = eVar;
            DataChannel dataChannel2 = dVar.f21695a;
            long id = (dataChannel2 == null || (room = (Room) dataChannel2.b(df.class)) == null) ? 0 : room.getId();
            if (GiftManager.inst().getGiftIconInfo(id) == null || (giftIconInfo = GiftManager.inst().getGiftIconInfo(id)) == null || giftIconInfo.f17886c >= System.currentTimeMillis() / 1000 || giftIconInfo.f17887d <= System.currentTimeMillis() / 1000) {
                d.a aVar2 = dVar.f21696b;
                if (aVar2 != null) {
                    aVar2.a(null);
                }
            } else {
                d.a aVar3 = dVar.f21696b;
                if (aVar3 != null) {
                    aVar3.a(GiftManager.inst().getGiftIconInfo(id));
                }
            }
        }
        Room room2 = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room2 == null || !room2.hasCommerceGoods) {
            eVar.f21702d.a(t.b(5, TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new e.a(eVar)));
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.addView(fVar.f21681a);
        frameLayout.setClipChildren(false);
        fVar.f21683c.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.live.gift.h.class).d(fVar.f21686f));
        MethodCollector.o(9283);
    }
}
