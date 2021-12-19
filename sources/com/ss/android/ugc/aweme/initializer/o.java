package com.ss.android.ugc.aweme.initializer;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.kids.component.music.KidsMusicEntrance;
import com.ss.android.ugc.aweme.music.k.d;
import com.ss.android.ugc.aweme.music.k.g;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.presenter.l;
import com.ss.android.ugc.aweme.music.presenter.q;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.aq;
import com.ss.android.ugc.aweme.port.in.as;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ae.b;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.ss.android.ugc.musicprovider.e;
import com.zhiliaoapp.musically.R;

public final class o implements as {
    static {
        Covode.recordClassIndex(67150);
    }

    @Override // com.ss.android.ugc.aweme.port.in.as
    public final String b() {
        return e.a().d();
    }

    @Override // com.ss.android.ugc.aweme.port.in.as
    public final String a() {
        return e.a().c();
    }

    @Override // com.ss.android.ugc.aweme.port.in.as
    public final String a(String str) {
        return g.a(str);
    }

    @Override // com.ss.android.ugc.aweme.port.in.as
    public final c a(Object obj) {
        if (obj != null) {
            return b.a((MusicModel) obj);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.as
    public final boolean a(int i2) {
        if (MusicModel.MusicType.LOCAL.ordinal() == i2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.port.in.as
    public final void a(String str, final aq aqVar) {
        l lVar = new l();
        lVar.a_(new q() {
            /* class com.ss.android.ugc.aweme.initializer.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67151);
            }

            @Override // com.ss.android.ugc.aweme.music.presenter.q
            public final void a() {
                if (aqVar != null) {
                    new RuntimeException("music should not be null");
                    aqVar.a();
                }
            }

            @Override // com.ss.android.ugc.aweme.music.presenter.q
            public final void a(Exception exc) {
                aq aqVar = aqVar;
                if (aqVar != null) {
                    aqVar.a();
                }
            }

            @Override // com.ss.android.ugc.aweme.music.presenter.q
            public final void a(MusicDetail musicDetail) {
                c cVar;
                aq aqVar = aqVar;
                if (aqVar != null) {
                    if (musicDetail.music != null) {
                        cVar = b.a(musicDetail.music.convertToMusicModel());
                    } else {
                        cVar = null;
                    }
                    aqVar.a(cVar);
                }
            }
        });
        lVar.a(str, 0);
    }

    @Override // com.ss.android.ugc.aweme.port.in.as
    public final boolean a(c cVar, Context context, boolean z) {
        if (d.f111547b) {
            cVar.getMusicStatus();
            cVar.getPath();
        } else if (cVar == null) {
            return true;
        }
        if (!TextUtils.isEmpty(cVar.getPath()) && cVar.getMusicStatus() != 0) {
            return true;
        }
        String offlineDesc = cVar.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getString(R.string.dcb);
        }
        if (!z) {
            return false;
        }
        new a(context).a(offlineDesc).a();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.port.in.as
    public final void a(Fragment fragment, int i2, String str, int i3, Object obj, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4, boolean z5) {
        if (AccountService.a().e().isChildrenMode()) {
            KidsMusicEntrance.a().a(fragment, i2, str, i3, obj, z, z2, bundle, str2, str3, z3, z4);
            return;
        }
        MusicModel musicModel = (MusicModel) obj;
        if (i3 == 2) {
            com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a = "video_shoot_page";
        } else {
            com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a = "video_edit_page";
        }
        String string = fragment.getString(R.string.adm);
        if (CommerceMediaServiceImpl.f().b()) {
            string = fragment.getString(R.string.db0);
        }
        SmartRoute withParam = SmartRouter.buildRoute(fragment.getContext(), "//choosemusic/home").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i3);
        AVChallenge curChallenge = AVExternalServiceImpl.a().publishService().getCurChallenge();
        if (curChallenge != null) {
            withParam.withParam("challenge", curChallenge.cid);
        }
        withParam.withParam("title", string).withParam("music_model", musicModel).withParam("music_allow_clear", z).withParam("music_is_photomv", z2).withParam("creation_id", str3).withParam("shoot_way", str2).withParam("hide_local_music", z4).withParam("extra_beat_music_sticker", z3).withParam("long_video", z5);
        if (bundle != null) {
            withParam.withParam("arguments", bundle);
        }
        fragment.startActivityForResult(withParam.buildIntent(), i2);
    }
}
