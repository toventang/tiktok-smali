package com.ss.android.ugc.aweme.kids.component.music;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance;
import com.ss.android.ugc.aweme.kids.choosemusic.g.c;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class KidsMusicEntrance implements IKidsMusicEntrance {
    static {
        Covode.recordClassIndex(67983);
    }

    public static IKidsMusicEntrance a() {
        MethodCollector.i(12499);
        Object a2 = b.a(IKidsMusicEntrance.class, false);
        if (a2 != null) {
            IKidsMusicEntrance iKidsMusicEntrance = (IKidsMusicEntrance) a2;
            MethodCollector.o(12499);
            return iKidsMusicEntrance;
        }
        if (b.bQ == null) {
            synchronized (IKidsMusicEntrance.class) {
                try {
                    if (b.bQ == null) {
                        b.bQ = new KidsMusicEntrance();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12499);
                    throw th;
                }
            }
        }
        KidsMusicEntrance kidsMusicEntrance = (KidsMusicEntrance) b.bQ;
        MethodCollector.o(12499);
        return kidsMusicEntrance;
    }

    @Override // com.ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance
    public final void a(Fragment fragment, int i2, String str, int i3, Object obj, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4) {
        l.d(fragment, "");
        l.d(str, "");
        l.d(obj, "");
        l.d(str2, "");
        l.d(str3, "");
        MusicModel musicModel = (MusicModel) obj;
        if (i3 == 2) {
            c.f105649a = "video_shoot_page";
        } else {
            c.f105649a = "video_edit_page";
        }
        String string = fragment.getString(R.string.adm);
        SmartRoute withParam = SmartRouter.buildRoute(fragment.getContext(), "//choosemusic/kids/home").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i3);
        AVChallenge curChallenge = AVExternalServiceImpl.a().publishService().getCurChallenge();
        if (curChallenge != null) {
            withParam.withParam("challenge", curChallenge.cid);
        }
        withParam.withParam("title", string).withParam("music_model", musicModel).withParam("music_allow_clear", z).withParam("music_is_photomv", z2).withParam("creation_id", str3).withParam("shoot_way", str2).withParam("hide_local_music", z4).withParam("extra_beat_music_sticker", z3);
        if (bundle != null) {
            withParam.withParam("arguments", bundle);
        }
        fragment.startActivityForResult(withParam.buildIntent(), i2);
    }
}
