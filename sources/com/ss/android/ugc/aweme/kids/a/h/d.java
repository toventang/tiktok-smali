package com.ss.android.ugc.aweme.kids.a.h;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.CookieManager;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.kids.a.b;
import com.ss.android.ugc.aweme.kids.a.h.a;
import com.ss.android.ugc.aweme.kids.b.c;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.video.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private androidx.c.a<String, Boolean> f105352a = new androidx.c.a<>();

    /* renamed from: c  reason: collision with root package name */
    protected c f105353c;

    /* renamed from: d  reason: collision with root package name */
    protected int f105354d;

    /* renamed from: e  reason: collision with root package name */
    public ProgressDialog f105355e;

    /* renamed from: f  reason: collision with root package name */
    public c f105356f;

    /* renamed from: g  reason: collision with root package name */
    protected b f105357g;

    /* renamed from: h  reason: collision with root package name */
    public a f105358h;

    /* renamed from: i  reason: collision with root package name */
    public String f105359i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.a.e.a f105360j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f105361k;

    /* renamed from: l  reason: collision with root package name */
    public MusicModel f105362l;

    /* renamed from: m  reason: collision with root package name */
    public int f105363m;
    protected CountDownTimer n;
    public boolean o;
    public long p = -1;
    public boolean q = true;
    public com.ss.android.ugc.aweme.kids.b.a.a r;

    public interface a {
        static {
            Covode.recordClassIndex(67535);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(67530);
    }

    protected static String a(int i2, int i3) {
        if (i3 == 0) {
            switch (i2) {
                case 0:
                    return "edit_page_list";
                case 1:
                    return "edit_page_favourite";
                case 2:
                    return "edit_page_search";
                case 3:
                    return "edit_page_banner";
                case 4:
                default:
                    return "";
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return "edit_page_local";
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return "single_song";
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return "edit_page_fm";
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return "sticker_rec";
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return "challenge_rec";
            }
        } else if (i3 != 2) {
            return "";
        } else {
            switch (i2) {
                case 0:
                    return "shoot_page_list";
                case 1:
                    return "shoot_page_favourite";
                case 2:
                    return "shoot_page_search";
                case 3:
                    return "shoot_page_banner";
                case 4:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                default:
                    return "";
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return "shoot_page_local";
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return "shoot_page_fm";
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return "sticker_rec";
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return "challenge_rec";
            }
        }
    }

    public void a() {
        b();
    }

    private static boolean f() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        CountDownTimer countDownTimer = this.n;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f105356f.b();
    }

    public void c() {
        this.f105356f.a(new com.ss.android.ugc.aweme.kids.b.a.c() {
            /* class com.ss.android.ugc.aweme.kids.a.h.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67531);
            }

            @Override // com.ss.android.ugc.aweme.kids.b.a.c
            public final void a(int i2) {
                if (d.this.f105362l != null) {
                    d dVar = d.this;
                    dVar.b(dVar.f105362l, d.this.f105363m, d.this.o);
                }
                if (d.this.q) {
                    d.this.a("play_music");
                }
                if (d.this.f105361k && d.this.f105356f != null) {
                    d.this.b();
                }
                if (d.this.f105353c != null) {
                    if (!(d.this.f105353c.h() == null || i2 == 0)) {
                        d.this.f105353c.h().setDuration(i2);
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        });
    }

    public final void e() {
        ProgressDialog progressDialog = this.f105355e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f105355e = null;
        }
    }

    public void d() {
        this.f105352a.clear();
        CountDownTimer countDownTimer = this.n;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.f105353c != null) {
            this.f105353c = null;
        }
        if (this.f105358h != null) {
            this.f105358h = null;
        }
        b bVar = this.f105357g;
        com.ss.android.ugc.aweme.kids.a.c.f fVar = bVar.f105247b;
        for (Map.Entry<String, com.ss.android.ugc.aweme.kids.a.c.b> entry : fVar.f105274a.entrySet()) {
            entry.getKey();
            entry.getValue().a();
        }
        for (Map.Entry<String, com.ss.android.ugc.aweme.kids.a.c.b> entry2 : fVar.f105275b.entrySet()) {
            entry2.getKey();
            entry2.getValue().a();
        }
        fVar.f105274a.clear();
        fVar.f105275b.clear();
        com.ss.android.ugc.aweme.kids.a.f.f fVar2 = bVar.f105248c;
        if (fVar2 != null) {
            fVar2.e();
        }
        this.f105356f.a();
    }

    public final d b(int i2) {
        this.f105354d = i2;
        return this;
    }

    public d(c cVar) {
        this.f105353c = cVar;
        this.f105356f = new c();
        b bVar = new b(this.f105353c.i(), "music_choose_page");
        this.f105357g = bVar;
        bVar.f105246a = 1;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str) {
        this.f105352a.put(str, false);
        CountDownTimer countDownTimer = this.n;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        b bVar = this.f105357g;
        l.d(str, "");
        com.ss.android.ugc.aweme.kids.a.c.f fVar = bVar.f105247b;
        l.d(str, "");
        com.ss.android.ugc.aweme.kids.a.c.b remove = fVar.f105274a.remove(str);
        if (remove != null) {
            remove.b();
        }
        com.ss.android.ugc.aweme.kids.a.c.b remove2 = fVar.f105275b.remove(str);
        if (remove2 != null) {
            remove2.b();
        }
        com.ss.android.ugc.aweme.kids.a.f.f fVar2 = bVar.f105248c;
        if (fVar2 != null) {
            fVar2.e();
        }
    }

    public final void a(String str) {
        String str2;
        com.ss.android.ugc.aweme.kids.a.e.a aVar;
        String str3;
        if (this.f105362l != null) {
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("music_id", this.f105362l.getMusicId());
            int i2 = this.f105363m;
            String str4 = "song_choose_page";
            String str5 = "";
            if (i2 != 0) {
                if (i2 == 1) {
                    str4 = "collection_music";
                } else if (i2 != 2) {
                    str4 = i2 == 3 ? "song_category" : str5;
                }
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("enter_from", str4).a("enter_method", "click_play_music");
            int i3 = this.f105354d;
            if (i3 != 1) {
                if (i3 == 0) {
                    str2 = "video_edit_page";
                } else if (i3 == 2) {
                    str2 = "video_shoot_page";
                }
                com.ss.android.ugc.aweme.app.f.d a4 = a3.a("previous_page", str2);
                aVar = this.f105360j;
                if (aVar != null || aVar.f105304b == null) {
                    str3 = str5;
                } else {
                    str3 = this.f105360j.f105304b;
                }
                com.ss.android.ugc.aweme.app.f.d a5 = a4.a("category_id", str3);
                com.ss.android.ugc.aweme.kids.a.e.a aVar2 = this.f105360j;
                if (!(aVar2 == null || aVar2.f105303a == null)) {
                    str5 = this.f105360j.f105303a;
                }
                r.a(str, a5.a("category_name", str5).f66730a);
            }
            str2 = str5;
            com.ss.android.ugc.aweme.app.f.d a42 = a3.a("previous_page", str2);
            aVar = this.f105360j;
            if (aVar != null) {
            }
            str3 = str5;
            com.ss.android.ugc.aweme.app.f.d a52 = a42.a("category_id", str3);
            com.ss.android.ugc.aweme.kids.a.e.a aVar22 = this.f105360j;
            str5 = this.f105360j.f105303a;
            r.a(str, a52.a("category_name", str5).f66730a);
        }
    }

    private void a(final MusicModel musicModel, final String str, boolean z) {
        this.f105357g.a(musicModel, new com.ss.android.ugc.aweme.kids.a.g.a() {
            /* class com.ss.android.ugc.aweme.kids.a.h.d.AnonymousClass4 */

            static {
                Covode.recordClassIndex(67534);
            }

            @Override // com.ss.android.ugc.aweme.kids.a.g.a
            public final void a() {
            }

            @Override // com.ss.android.ugc.aweme.kids.a.g.a
            public final void b() {
            }

            @Override // com.ss.android.ugc.aweme.kids.a.g.a
            public final void a(com.ss.android.ugc.aweme.kids.b.a aVar) {
                d.this.e();
                if (d.this.f105353c != null && d.this.f105353c.j()) {
                    d.this.f105353c.i();
                }
            }

            @Override // com.ss.android.ugc.aweme.kids.a.g.a
            public final void a(int i2) {
                if (d.this.f105353c != null && d.this.f105353c.j() && d.this.f105353c.i() != null && d.this.f105355e != null) {
                    d.this.f105355e.setProgress(i2);
                }
            }

            @Override // com.ss.android.ugc.aweme.kids.a.g.a
            public final void a(String str, MusicWaveBean musicWaveBean) {
                musicModel.setMusicWaveBean(musicWaveBean);
                d.this.a(str, musicModel, str);
            }
        }, z);
    }

    /* access modifiers changed from: protected */
    public final void b(final MusicModel musicModel, final int i2, final boolean z) {
        CountDownTimer countDownTimer = this.n;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
            long realAuditionDuration = (long) musicModel.getRealAuditionDuration();
            if (realAuditionDuration <= 0) {
                com.ss.android.ugc.aweme.framework.a.a.a("MusicDownloadPlayHelper: audition_duration is zero, music id: " + musicModel.getMusicId());
                return;
            }
            AnonymousClass2 r1 = new CountDownTimer(realAuditionDuration) {
                /* class com.ss.android.ugc.aweme.kids.a.h.d.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(67532);
                }

                public final void onTick(long j2) {
                }

                public final void onFinish() {
                    d.this.f105356f.b();
                    if (d.this.r != null) {
                        d.this.r.a();
                    }
                    if (z) {
                        d.this.a(musicModel, i2, true);
                    }
                }
            };
            this.n = r1;
            r1.start();
        }
    }

    public void a(MusicModel musicModel, int i2, boolean z) {
        c cVar;
        Activity i3;
        this.p = SystemClock.elapsedRealtime();
        if (musicModel != null && (cVar = this.f105353c) != null && (i3 = cVar.i()) != null) {
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = f();
            }
            if (!j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(i3).a(R.string.de8).a();
                return;
            }
            this.f105363m = i2;
            if (com.ss.android.ugc.aweme.kids.a.i.c.a(musicModel, i3, true)) {
                MusicModel a2 = com.ss.android.ugc.aweme.kids.a.i.a.a(musicModel);
                this.f105362l = a2;
                this.o = z;
                this.f105356f.b();
                String localPath = a2.getLocalPath();
                com.ss.android.ugc.aweme.kids.b.b.a aVar = new com.ss.android.ugc.aweme.kids.b.b.a();
                aVar.f105396f = a2.getMusicId();
                if (a2.getMusicType() == MusicModel.MusicType.ONLINE) {
                    aVar.f105393c = 4;
                    String str = com.ss.android.ugc.aweme.kids.b.d.a().f105425a.a() + com.ss.android.ugc.aweme.kids.b.b.c(localPath);
                    aVar.f105394d = a2.getRealAuditionDuration();
                    if (TextUtils.isEmpty(str) || !e.b(str) || new File(str).length() <= 0) {
                        if (a2.isNeedSetCookie()) {
                            String cookie = CookieManager.getInstance().getCookie(a2.getUrl().getUrlList().get(0));
                            HashMap<String, String> hashMap = new HashMap<>();
                            hashMap.put("cookie", cookie);
                            aVar.f105395e = hashMap;
                        }
                        aVar.f105392b = a2.getUrl().getUrlList();
                        this.f105356f.a(aVar, z);
                        a aVar2 = this.f105358h;
                        if (aVar2 != null) {
                            aVar2.a();
                            return;
                        }
                        return;
                    }
                    aVar.f105391a = str;
                    this.f105356f.a(aVar, z);
                    a aVar3 = this.f105358h;
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                }
            }
        }
    }

    public final void c(final MusicModel musicModel, final int i2, boolean z) {
        if (this.f105353c != null && musicModel != null) {
            this.f105362l = musicModel;
            this.f105361k = false;
            if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
                AVExternalServiceImpl.a().abilityService().infoService().mp3Legal(musicModel.getLocalPath(), new IAVInfoService.IGetInfoCallback<Integer>() {
                    /* class com.ss.android.ugc.aweme.kids.a.h.d.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(67533);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
                    public final /* synthetic */ void finish(Integer num) {
                        if (num.intValue() == 0) {
                            d.this.a(musicModel.getLocalPath(), musicModel, d.a(i2, d.this.f105354d));
                            return;
                        }
                        Activity i2 = d.this.f105353c.i();
                        if (i2 != null) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(i2).a(R.string.cz6).a();
                        }
                    }
                });
                return;
            }
            b();
            Activity i3 = this.f105353c.i();
            if (i3 == null || !com.ss.android.ugc.aweme.kids.a.i.c.a(musicModel, i3, true)) {
                new Exception(i3.getString(R.string.dcb));
            } else if (musicModel.getMusicType().equals(MusicModel.MusicType.ONLINE)) {
                String musicId = musicModel.getMusicId();
                c cVar = this.f105353c;
                if (cVar != null) {
                    Activity i4 = cVar.i();
                    a.EnumC2693a aVar = a.EnumC2693a.VISIBLE_AFTER_5S;
                    e eVar = new e(this, musicId);
                    l.d(i4, "");
                    l.d(aVar, "");
                    l.d(eVar, "");
                    a aVar2 = new a(i4, aVar, (byte) 0);
                    aVar2.f105339c = eVar;
                    aVar2.setCancelable(false);
                    if ((i4 instanceof Activity) && com.ss.android.ugc.aweme.activity.a.a(i4, true) && !i4.isFinishing()) {
                        aVar2.show();
                    }
                    this.f105355e = aVar2;
                }
                this.f105352a.put(musicModel.getMusicId(), true);
                String a2 = a(i2, this.f105354d);
                AVExternalServiceImpl.a().provideAVPerformance().start("av_music_download", "MusicDownloadPlayHelper start");
                if (TextUtils.isEmpty(musicModel.getBindChallengeId()) || TextUtils.equals(musicModel.getBindChallengeId(), "0")) {
                    a(musicModel, a2, z);
                } else {
                    i.b(new f(musicModel), i.f4824a).a(new g(this, musicModel, a2, z), i.f4826c, null);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, MusicModel musicModel, String str2) {
        c cVar = this.f105353c;
        if (cVar != null) {
            this.f105361k = true;
            if (cVar.i() != null) {
                b();
                com.ss.android.ugc.aweme.kids.a.i.b.a().pause();
                AVExternalServiceImpl.a().publishService().setCurMusic(musicModel);
                ProgressDialog progressDialog = this.f105355e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                this.f105353c.a(str, musicModel, str2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(MusicModel musicModel, String str, boolean z, i iVar) {
        if (!this.f105352a.get(musicModel.getMusicId()).booleanValue()) {
            return null;
        }
        if (iVar.b() || iVar.c()) {
            e();
            return null;
        }
        a(musicModel, str, z);
        return null;
    }
}
