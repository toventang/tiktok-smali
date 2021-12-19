package com.ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import android.view.View;
import b.i;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.experiment.gg;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feed.api.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.ss.android.ugc.aweme.video.preload.a.e;
import com.ss.android.ugc.playerkit.model.o;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.j;

public class FullFeedVideoViewHolder extends VideoViewCell implements j {

    /* renamed from: a  reason: collision with root package name */
    private long f91510a;

    static {
        Covode.recordClassIndex(57577);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public boolean K() {
        return true;
    }

    private boolean o() {
        return TextUtils.equals(ao(), "homepage_hot");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final ag e() {
        return new ag(true, e.a().f143601a);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public void g() {
        super.g();
        if (o()) {
            h.a().maybeMonitorTimeSpend(this.f91515j, Long.valueOf(this.f91510a));
        }
    }

    public FullFeedVideoViewHolder(cf cfVar) {
        super(cfVar);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void b(long j2) {
        super.b(j2);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void b(boolean z) {
        if (TextUtils.equals(ao(), "homepage_follow")) {
            MainPageExperimentServiceImpl.b();
        }
        super.b(z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public void onRenderFirstFrame(o oVar) {
        int i2;
        super.onRenderFirstFrame(oVar);
        if (o()) {
            this.f91510a = System.currentTimeMillis();
        }
        Aweme aweme = this.f91515j;
        if (this.f91516k == 0) {
            i2 = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        } else {
            i2 = 0;
        }
        i.a((long) i2).a(new aa(this, AVExternalServiceImpl.a().specialPlusService(), aweme), i.f4824a, null).b(ab.f91590a, i.f4826c);
    }

    static final /* synthetic */ i a(i iVar) {
        try {
            if (TextUtils.equals((CharSequence) iVar.d(), "hide")) {
                new SuperEntranceEvent(3, false).post();
                return null;
            } else if (TextUtils.equals((CharSequence) iVar.d(), "show")) {
                new SuperEntranceEvent(3, true).post();
                return null;
            } else if (!TextUtils.equals((CharSequence) iVar.d(), "normal")) {
                return null;
            } else {
                new SuperEntranceEvent(0, false).post();
                return null;
            }
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void e(Aweme aweme) {
        ISuperEntranceService superEntranceService;
        if (!gg.f90139a && this.f91516k != 0 && b.g() != null) {
            if ((!b.g().isLogin() || !TextUtils.equals(this.f91515j.getAuthorUid(), b.g().getCurUserId())) && (superEntranceService = AVExternalServiceImpl.a().superEntranceService()) != null && superEntranceService.shouldShowSuperEntranceRecord(an())) {
                List<String> superEntranceEffectList = superEntranceService.getSuperEntranceEffectList();
                g stickerEntranceInfo = aweme.getStickerEntranceInfo();
                if (stickerEntranceInfo != null && !com.bytedance.common.utility.collection.b.a((Collection) superEntranceEffectList) && superEntranceEffectList.contains(stickerEntranceInfo.id)) {
                    new SuperEntranceEvent(1, true).post();
                    superEntranceService.setShowedSuperEntranceTab();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(View view, boolean z) {
        if (TextUtils.equals(ao(), "homepage_follow")) {
            MainPageExperimentServiceImpl.b();
        }
        super.a(view, z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String a(ISpecialPlusService iSpecialPlusService, Aweme aweme) {
        try {
            if (!iSpecialPlusService.shouldShowSpecialPlus()) {
                return "hide";
            }
            if (iSpecialPlusService.isQuickPromoPlusEnabled()) {
                if (b.g() == null || !b.g().isLogin() || b.g().isChildrenMode() || (System.currentTimeMillis() / 1000) - b.g().getCurUser().getRegisterTime() < 604800) {
                    return "normal";
                }
                return "show";
            } else if (!o()) {
                return "normal";
            } else {
                if (b.g() == null || (b.g().isLogin() && TextUtils.equals(this.f91515j.getAuthorUid(), b.g().getCurUserId()))) {
                    return "normal";
                }
                List<String> specialPlusEffectList = iSpecialPlusService.getSpecialPlusEffectList();
                String stickerIDs = aweme.getStickerIDs();
                if (!com.bytedance.common.utility.collection.b.a((Collection) specialPlusEffectList) && !TextUtils.isEmpty(stickerIDs)) {
                    for (String str : stickerIDs.split(",")) {
                        if (specialPlusEffectList.contains(str)) {
                            return "show";
                        }
                    }
                }
                return "normal";
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
