package com.bytedance.android.livesdk.newvideogift;

import androidx.fragment.app.e;
import com.bytedance.android.live.core.f.j;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.model.message.r;
import com.bytedance.android.livesdk.newvideogift.a.b;
import com.bytedance.android.livesdk.newvideogift.a.j;
import com.bytedance.android.livesdk.service.c.c.d;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewVideoGiftWidget f19989a;

    /* renamed from: b  reason: collision with root package name */
    private final r f19990b;

    static {
        Covode.recordClassIndex(11805);
    }

    d(LiveNewVideoGiftWidget liveNewVideoGiftWidget, r rVar) {
        this.f19989a = liveNewVideoGiftWidget;
        this.f19990b = rVar;
    }

    public final void run() {
        LiveNewVideoGiftWidget liveNewVideoGiftWidget = this.f19989a;
        r rVar = this.f19990b;
        if (liveNewVideoGiftWidget.f19844d != null) {
            VideoGiftView videoGiftView = liveNewVideoGiftWidget.f19844d;
            if (videoGiftView.f19860f == null || rVar == null) {
                d.a.C0463a.f21379a.f21375e.a();
                return;
            }
            videoGiftView.setTextEffect(rVar.f19681i);
            videoGiftView.a(rVar);
            b bVar = videoGiftView.f19860f;
            String str = rVar.f19676d;
            long j2 = rVar.f19673a;
            long j3 = rVar.f19682j;
            long j4 = rVar.f19674b;
            j.a().removeCallbacks(bVar.f19871g);
            if (bVar.f19869e == null) {
                bVar.f19869e = ((IGiftService) a.a(IGiftService.class)).giftPlayControllerManager().a(bVar.f19865a.hashCode());
                if (bVar.f19869e == null && (bVar.f19865a instanceof e)) {
                    bVar.f19869e = ((IGiftService) a.a(IGiftService.class)).giftPlayControllerManager().b(bVar.f19865a.hashCode(), (androidx.core.app.d) bVar.f19865a);
                }
                if (bVar.f19869e != null) {
                    bVar.f19869e.a(bVar.f19867c);
                    bVar.f19869e.a(bVar.f19868d);
                    bVar.f19869e.a(bVar.f19866b);
                }
                com.bytedance.android.live.core.c.a.a(4, "GiftCtlManager", "play gift video fail, because player is null.");
            }
            com.bytedance.android.livesdkapi.depend.d.a.a aVar = bVar.f19869e;
            if (aVar != null) {
                bVar.f19873i = j2;
                bVar.f19874j = j3;
                bVar.f19875k = j4;
                com.bytedance.android.livesdk.newvideogift.a.j.a(j.a.playcontroller_start, bVar.f19873i, bVar.f19874j, bVar.f19875k);
                aVar.a(str, j2);
                return;
            }
            com.bytedance.android.live.core.c.a.a(4, "GiftCtlManager", "play gift video fail, because player is null.");
        }
    }
}
