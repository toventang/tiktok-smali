package com.ss.android.ugc.aweme.share.improve.a.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.improve.a.aj;
import com.ss.android.ugc.aweme.share.qrcode.a;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;

public final class b extends aj {

    /* renamed from: b  reason: collision with root package name */
    private final Music f123588b;

    static {
        Covode.recordClassIndex(81128);
    }

    public b(Music music) {
        l.d(music, "");
        this.f123588b = music;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h, com.ss.android.ugc.aweme.share.improve.a.aj
    public final void a(Context context, SharePackage sharePackage) {
        String musicName;
        int userCount;
        l.d(context, "");
        l.d(sharePackage, "");
        Music music = this.f123588b;
        if (music == null) {
            musicName = "";
        } else {
            musicName = music.getMusicName();
        }
        Music music2 = this.f123588b;
        if (music2 == null) {
            userCount = 0;
        } else {
            userCount = music2.getUserCount();
        }
        String mid = this.f123588b.getMid();
        l.b(mid, "");
        new a(context, musicName, (long) userCount, "music", 3, mid, (byte) 0).show();
        r.a("click_qr_code", new d().a("music_id", this.f123588b.getId()).a("platform", "scan").a("qr_code_type", "shaped").a("enter_from", "single_song").f66730a);
    }
}
