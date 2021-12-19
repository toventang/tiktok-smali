package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.b.e;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import java.util.List;

final /* synthetic */ class al implements e.a {

    /* renamed from: a  reason: collision with root package name */
    private final ah f111885a;

    /* renamed from: b  reason: collision with root package name */
    private final List f111886b;

    static {
        Covode.recordClassIndex(71912);
    }

    al(ah ahVar, List list) {
        this.f111885a = ahVar;
        this.f111886b = list;
    }

    @Override // com.ss.android.ugc.aweme.music.b.e.a
    public final void a(int i2) {
        ah ahVar = this.f111885a;
        List list = this.f111886b;
        if (i2 >= 0 && i2 < list.size()) {
            MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) list.get(i2);
            if (musicOwnerInfo.getEnterType() == 1) {
                r.a("click_musician_profile", new d().a("author_id", musicOwnerInfo.getUid()).a("enter_from", "single_song").a(StringSet.type, ahVar.as).a("music_id", ahVar.ah).f66730a);
            } else {
                r.a("click_musician_profile", new d().a("author_id", musicOwnerInfo.getUid()).a("music_id", ahVar.ah).a(StringSet.type, ahVar.ar).a("enter_from", "single_song").f66730a);
            }
            ahVar.a(musicOwnerInfo);
        }
    }
}
