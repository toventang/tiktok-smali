package com.ss.android.ugc.gamora.recorder.choosemusic;

import androidx.fragment.app.e;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.b;
import com.bytedance.als.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cz.a.d;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.p;
import h.z;

public interface a extends b {
    static {
        Covode.recordClassIndex(97200);
    }

    void changeCancelMusicBtnVisible(boolean z);

    void changeHasMusic(c cVar);

    void changeMusicUi();

    void clearMusic();

    p<Integer, Integer> getChooseMusicAnchorViewPosition();

    c getCurrentMusic();

    g<z> getMusicAdded();

    g<z> getMusicCleared();

    p<Effect, Boolean> getStickerMusicCancelState();

    void handleCancelMusicResultEvent();

    void handleChooseMusic(d dVar);

    void handleChooseMusicResultEvent(c cVar, String str);

    void initStitch();

    void onChooseMusicDone(boolean z, String str, c cVar, String str2);

    boolean recordHasMusic();

    void setStickerMusicCancelState(p<? extends Effect, Boolean> pVar);

    void setUiLoadingMusic(boolean z);

    void showMusicTips(Integer num);

    void startPreviewMusic(boolean z);

    void stopPreviewMusic();

    void stopStickerBGM();

    void tryHideMusicTips();

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a$a  reason: collision with other inner class name */
    public static final class C3961a {

        /* renamed from: a  reason: collision with root package name */
        public static final C3961a f147503a = new C3961a();

        private C3961a() {
        }

        static {
            Covode.recordClassIndex(97201);
        }

        public static final a a(e eVar) {
            a b2 = b(eVar);
            if (b2 == null) {
                l.b();
            }
            return b2;
        }

        public static final a b(e eVar) {
            if (eVar == null) {
                return null;
            }
            return (a) ApiCenter.a.a(eVar).b(a.class);
        }
    }
}
