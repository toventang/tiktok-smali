package com.ss.android.ugc.aweme.base.component;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.activity.a;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.experiment.gy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.j.f;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.f.b.l;
import org.greenrobot.eventbus.EventBus;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final EventActivityComponent f68062a;

    /* renamed from: b  reason: collision with root package name */
    private final f f68063b;

    /* renamed from: c  reason: collision with root package name */
    private final e f68064c;

    static {
        Covode.recordClassIndex(41922);
    }

    c(EventActivityComponent eventActivityComponent, f fVar, e eVar) {
        this.f68062a = eventActivityComponent;
        this.f68063b = fVar;
        this.f68064c = eVar;
    }

    public final void run() {
        EventActivityComponent eventActivityComponent = this.f68062a;
        f fVar = this.f68063b;
        e eVar = this.f68064c;
        Aweme aweme = (Aweme) fVar.f128580d;
        if (aweme.getStatus().getPrivateStatus() != 1 || !SharePrefCache.inst().getIsPrivateAvailable().c().booleanValue()) {
            String stickerIDs = aweme.getStickerIDs();
            String[] sharePostEffectIds = AVExternalServiceImpl.a().configService().avsettingsConfig().getSharePostEffectIds();
            if (sharePostEffectIds != null && stickerIDs != null) {
                int length = sharePostEffectIds.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (stickerIDs.contains(sharePostEffectIds[i2])) {
                        Object obj = fVar.f128580d;
                        Aweme aweme2 = null;
                        if (obj instanceof Aweme) {
                            aweme2 = (Aweme) obj;
                        }
                        if (!(eventActivityComponent.f68056b == null || !a.a(eventActivityComponent.f68056b) || aweme2 == null)) {
                            AVExternalServiceImpl.a().getBadgeService().showBadgeShareDialog(eventActivityComponent.f68056b, aweme2);
                        }
                    } else {
                        i2++;
                    }
                }
            }
            if (fVar.f128584h instanceof CreateAwemeResponse) {
                CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) fVar.f128584h;
                if (createAwemeResponse.aweme.getAwemeType() == 40) {
                    AVExternalServiceImpl.a().publishService().showLighteningPublishSuccessPopWindow(eVar, createAwemeResponse.aweme);
                } else if (fVar.f128584h.shoutOutsType <= 0 && !ah.f123353b.a(fVar, eVar)) {
                    eventActivityComponent.f68055a = ah.f123352a.a(eVar, (Aweme) fVar.f128580d);
                    String curUserId = b.g().getCurUserId();
                    l.d(curUserId, "");
                    eventActivityComponent.f68055a.setOnDismissListener(new d(eventActivityComponent, gy.f90188a.a("last_time_show_publish_success_window_".concat(String.valueOf(curUserId)))));
                    eventActivityComponent.f68055a.c();
                    long currentTimeMillis = System.currentTimeMillis();
                    l.d(curUserId, "");
                    gy.f90188a.a("last_time_show_publish_success_window_".concat(String.valueOf(curUserId)), currentTimeMillis);
                    bj.a("PublishDurationMonitor MANUAL_END showSuccessWindow");
                }
            }
        } else {
            ah.f123352a.a(eVar, (Aweme) fVar.f128580d, fVar.f128577a);
        }
        Object a2 = EventBus.a().a(f.class);
        if (a2 != null) {
            EventBus.a().f(a2);
        }
    }
}
