package com.ss.android.ugc.aweme.discover.helper;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.music.f;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.k.z;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.search.n.h;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;
import java.util.List;

public final class MusicPlayHelper extends ac {

    /* renamed from: e  reason: collision with root package name */
    public static final a f81002e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<p<Integer, Long>> f81003a = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();

    /* renamed from: b  reason: collision with root package name */
    public Music f81004b;

    /* renamed from: c  reason: collision with root package name */
    CountDownTimer f81005c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.c<o> f81006d = new com.ss.android.ugc.aweme.arch.widgets.base.c<>();

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.musicprovider.d f81007f = new com.ss.android.ugc.musicprovider.d();

    /* renamed from: g  reason: collision with root package name */
    private f f81008g;

    /* renamed from: h  reason: collision with root package name */
    private String f81009h = "";

    static {
        Covode.recordClassIndex(50359);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50360);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class e extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicPlayHelper f81020a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f81021b;

        static {
            Covode.recordClassIndex(50364);
        }

        public final void onTick(long j2) {
        }

        public final void onFinish() {
            this.f81020a.a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(MusicPlayHelper musicPlayHelper, long j2, long j3) {
            super(j3, 1000);
            this.f81020a = musicPlayHelper;
            this.f81021b = j2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements com.ss.android.ugc.musicprovider.interfaces.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicPlayHelper f81018a;

        static {
            Covode.recordClassIndex(50362);
        }

        c(MusicPlayHelper musicPlayHelper) {
            this.f81018a = musicPlayHelper;
        }

        @Override // com.ss.android.ugc.musicprovider.interfaces.a
        public final void a() {
            this.f81018a.f81003a.setValue(new p<>(0, -1L));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements com.ss.android.ugc.musicprovider.interfaces.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicPlayHelper f81019a;

        static {
            Covode.recordClassIndex(50363);
        }

        d(MusicPlayHelper musicPlayHelper) {
            this.f81019a = musicPlayHelper;
        }

        @Override // com.ss.android.ugc.musicprovider.interfaces.b
        public final void a() {
            this.f81019a.f81003a.setValue(new p<>(0, -1L));
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        CountDownTimer countDownTimer = this.f81005c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        a();
        this.f81007f.a();
        f fVar = this.f81008g;
        if (fVar != null) {
            fVar.a();
        }
    }

    public final void a() {
        CountDownTimer countDownTimer = this.f81005c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f81007f.b();
        this.f81004b = null;
        this.f81003a.setValue(new p<>(0, -1L));
    }

    public final boolean b(long j2) {
        p<Integer, Long> value;
        p<Integer, Long> value2;
        if (this.f81003a.getValue() == null || (value = this.f81003a.getValue()) == null || value.getFirst().intValue() != 1 || (value2 = this.f81003a.getValue()) == null || value2.getSecond().longValue() != j2) {
            return false;
        }
        return true;
    }

    public final void a(u<p<Integer, Long>> uVar) {
        l.d(uVar, "");
        this.f81003a.removeObserver(uVar);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements com.ss.android.ugc.musicprovider.interfaces.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicPlayHelper f81010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f81011b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Music f81012c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f81013d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ MusicModel f81014e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f81015f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f81016g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f81017h;

        static {
            Covode.recordClassIndex(50361);
        }

        b(MusicPlayHelper musicPlayHelper, androidx.fragment.app.e eVar, Music music, boolean z, MusicModel musicModel, int i2, boolean z2, String str) {
            this.f81010a = musicPlayHelper;
            this.f81011b = eVar;
            this.f81012c = music;
            this.f81013d = z;
            this.f81014e = musicModel;
            this.f81015f = i2;
            this.f81016g = z2;
            this.f81017h = str;
        }

        @Override // com.ss.android.ugc.musicprovider.interfaces.c
        public final void a(int i2) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String searchId;
            ad c2;
            ad c3;
            ad c4;
            ad c5;
            MusicPlayHelper musicPlayHelper = this.f81010a;
            Music music = this.f81012c;
            if (com.bytedance.ies.abmock.b.a().a(true, "remove_15s_cap_music", true)) {
                CountDownTimer countDownTimer = musicPlayHelper.f81005c;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                if (music.getDuration() != music.getRealAuditionDuration()) {
                    long realAuditionDuration = ((long) music.getRealAuditionDuration()) * 1000;
                    if (realAuditionDuration <= 0) {
                        com.ss.android.ugc.aweme.framework.a.a.b(3, null, "MusicPlayHelper: audition_duration is zero, music id: " + music.getId());
                    } else {
                        musicPlayHelper.f81005c = new e(musicPlayHelper, realAuditionDuration, realAuditionDuration);
                        CountDownTimer countDownTimer2 = musicPlayHelper.f81005c;
                        if (countDownTimer2 != null) {
                            countDownTimer2.start();
                        }
                    }
                }
            }
            this.f81010a.f81003a.setValue(new p<>(2, Long.valueOf(this.f81012c.getId())));
            if (!this.f81013d) {
                MusicModel musicModel = this.f81014e;
                String str8 = "";
                l.b(musicModel, str8);
                int i3 = this.f81015f;
                boolean z = this.f81016g;
                String str9 = this.f81017h;
                String a2 = com.ss.android.ugc.aweme.discover.mob.d.a();
                com.ss.android.ugc.aweme.search.k.c g2 = ((com.ss.android.ugc.aweme.search.k.c) new z().k(musicModel.getMusicId())).g(str9);
                if (z) {
                    str = "general_search";
                } else {
                    str = "search_result";
                }
                com.ss.android.ugc.aweme.search.k.b o = g2.o(str);
                if (musicModel.getSoundsListType() == 1 || musicModel.getSoundsListType() == 2) {
                    str2 = "aladdin_card";
                } else {
                    str2 = "click_search_result";
                }
                com.ss.android.ugc.aweme.search.k.c d2 = ((com.ss.android.ugc.aweme.search.k.c) o.p(str2)).b(Integer.valueOf(i3)).c(ac.a.f91473a.a(a2)).d(a2);
                q a3 = am.a();
                if (a3 == null || (c5 = a3.c()) == null || (str3 = c5.f121173b) == null) {
                    str3 = str8;
                }
                com.ss.android.ugc.aweme.search.k.c b2 = d2.b(str3);
                q a4 = am.a();
                if (a4 == null || (c4 = a4.c()) == null || (str4 = c4.f121172a) == null) {
                    str4 = str8;
                }
                com.ss.android.ugc.aweme.search.k.c a5 = b2.a(str4);
                q a6 = am.a();
                if (a6 == null || (c3 = a6.c()) == null || (str5 = c3.f121173b) == null) {
                    str5 = str8;
                }
                com.ss.android.ugc.aweme.search.k.b c6 = a5.c("search_keyword_a", str5);
                q a7 = am.a();
                if (a7 == null || (c2 = a7.c()) == null || (str6 = c2.f121172a) == null) {
                    str6 = str8;
                }
                com.ss.android.ugc.aweme.search.k.b c7 = c6.c("search_id_a", str6);
                h b3 = d.a.b();
                if (b3 == null || (str7 = b3.getSearchKeyword()) == null) {
                    str7 = str8;
                }
                com.ss.android.ugc.aweme.search.k.b c8 = c7.c("search_keyword_a_x", str7);
                h b4 = d.a.b();
                if (!(b4 == null || (searchId = b4.getSearchId()) == null)) {
                    str8 = searchId;
                }
                c8.c("search_id_a_x", str8).f();
            }
        }
    }

    public final boolean a(long j2) {
        p<Integer, Long> value;
        p<Integer, Long> value2;
        if (this.f81003a.getValue() == null || (value = this.f81003a.getValue()) == null || value.getFirst().intValue() != 2 || (value2 = this.f81003a.getValue()) == null || value2.getSecond().longValue() != j2) {
            return false;
        }
        return true;
    }

    public final void a(m mVar, u<p<Integer, Long>> uVar) {
        l.d(mVar, "");
        l.d(uVar, "");
        this.f81003a.a(mVar, uVar, false);
    }

    private static void a(Context context, Music music) {
        String offlineDesc = music.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getString(R.string.dcb);
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(offlineDesc).a();
    }

    public final void a(androidx.fragment.app.e eVar, Music music, String str, int i2, boolean z, boolean z2, String str2) {
        List<String> urlList;
        l.d(eVar, "");
        l.d(music, "");
        l.d(str, "");
        l.d(str2, "");
        this.f81007f.b();
        this.f81004b = music;
        this.f81009h = str2;
        MusicModel convertToMusicModel = music.convertToMusicModel();
        if (MusicService.m().a(convertToMusicModel, eVar, true)) {
            com.ss.android.ugc.musicprovider.a.a aVar = new com.ss.android.ugc.musicprovider.a.a();
            l.b(convertToMusicModel, "");
            aVar.f148536f = convertToMusicModel.getMusicId();
            if (convertToMusicModel.getMusicType() == MusicModel.MusicType.ONLINE) {
                aVar.f148533c = 4;
            }
            if (com.bytedance.ies.abmock.b.a().a(true, "remove_15s_cap_music", true)) {
                Integer auditionDuration = convertToMusicModel.getAuditionDuration();
                l.b(auditionDuration, "");
                aVar.f148534d = auditionDuration.intValue();
            } else {
                aVar.f148534d = convertToMusicModel.getDuration();
            }
            this.f81003a.setValue(new p<>(1, Long.valueOf(music.getId())));
            this.f81007f.a(new b(this, eVar, music, z2, convertToMusicModel, i2, z, str2));
            this.f81007f.a(new c(this));
            this.f81007f.a(new d(this));
            UrlModel playUrl = music.getPlayUrl();
            if (playUrl == null || (urlList = playUrl.getUrlList()) == null) {
                a(eVar, music);
            } else if (urlList.size() > 0) {
                aVar.f148532b = urlList;
                this.f81007f.a(aVar, false);
            } else {
                a(eVar, music);
                com.ss.android.ugc.aweme.framework.a.a.b(3, null, "Music Url List size is zero, and music id:  " + music.getId());
            }
            eVar.getLifecycle().a(new MusicPlayHelper$play$6(this));
        }
    }
}
