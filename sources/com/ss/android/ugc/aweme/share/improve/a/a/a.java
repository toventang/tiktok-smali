package com.ss.android.ugc.aweme.share.improve.a.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.a.aj;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;

public final class a extends aj {

    /* renamed from: b  reason: collision with root package name */
    public final Challenge f123582b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f123583c;

    /* renamed from: d  reason: collision with root package name */
    public final String f123584d;

    /* renamed from: e  reason: collision with root package name */
    public final String f123585e;

    /* renamed from: f  reason: collision with root package name */
    public final String f123586f;

    static {
        Covode.recordClassIndex(81127);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h, com.ss.android.ugc.aweme.share.improve.a.aj
    public final void a(Context context, SharePackage sharePackage) {
        int i2;
        l.d(context, "");
        l.d(sharePackage, "");
        r.a("click_qr_code", new d().a("tag_id", this.f123582b.getCid()).a("platform", "scan").a("qr_code_type", "shaped").a("enter_from", "challenge").f66730a);
        if (CommerceChallengeServiceImpl.e().b(this.f123582b)) {
            i2 = 23;
        } else {
            i2 = 2;
        }
        long displayCount = this.f123582b.getDisplayCount();
        String cid = this.f123582b.getCid();
        l.b(cid, "");
        new com.ss.android.ugc.aweme.share.qrcode.a(context, "#" + this.f123582b.getChallengeName(), displayCount, "hash_tag", i2, cid, (byte) 0).show();
        r.onEvent(new MobClick().setEventName("share_challenge").setLabelName("qr_code").setExtValueString(this.f123582b.getCid()).setJsonObject(new s().a("request_id", this.f123585e).a("challenge_id", this.f123584d).a("process_id", this.f123586f).a()));
        r.a("share_tag", new d().a("tag_id", this.f123584d).a("platform", "qr_code").a("share_mode", "normal_share").a("process_id", this.f123586f).f66730a);
        ah.f123353b.a("qr_code", 0);
    }

    public a(Challenge challenge, boolean z, String str, String str2, String str3) {
        l.d(challenge, "");
        this.f123582b = challenge;
        this.f123583c = z;
        this.f123584d = str;
        this.f123585e = str2;
        this.f123586f = str3;
    }
}
