package com.ss.android.ugc.aweme.music.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.UIUXBugsExperimentService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.music.f;
import com.ss.android.ugc.aweme.music.k.c;
import com.ss.android.ugc.aweme.music.model.MusicCategory;
import com.ss.android.ugc.aweme.music.ui.e;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.utils.bt;
import com.ss.android.ugc.musicprovider.c.b;
import com.ss.android.ugc.musicprovider.d;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class MusicDownloadPlayHelper implements au, com.ss.android.ugc.aweme.music.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f111791a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.c.a<String, Boolean> f111792b = new androidx.c.a<>();

    /* renamed from: c  reason: collision with root package name */
    protected m f111793c;

    /* renamed from: d  reason: collision with root package name */
    protected int f111794d;

    /* renamed from: e  reason: collision with root package name */
    public ProgressDialog f111795e;

    /* renamed from: f  reason: collision with root package name */
    public d f111796f;

    /* renamed from: g  reason: collision with root package name */
    protected f f111797g;

    /* renamed from: h  reason: collision with root package name */
    public a f111798h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f111799i;

    /* renamed from: j  reason: collision with root package name */
    public e f111800j;

    /* renamed from: k  reason: collision with root package name */
    public String f111801k;

    /* renamed from: l  reason: collision with root package name */
    public MusicCategory f111802l;

    /* renamed from: m  reason: collision with root package name */
    public int f111803m;
    public boolean n;
    public MusicModel o;
    public int p;
    protected CountDownTimer q;
    public boolean r;
    public long s = -1;
    public boolean t = true;
    public com.ss.android.ugc.musicprovider.interfaces.a u;

    public interface a {
        static {
            Covode.recordClassIndex(71881);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(71875);
    }

    private static String a(int i2) {
        switch (i2) {
            case 0:
            case 1:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return "change_music_page";
            case 2:
                return "search_music";
            case 3:
                return "change_music_page_detail";
            case 4:
            default:
                return "";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "personal_homepage";
        }
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

    private static String c(int i2) {
        if (i2 == 0) {
            return "music_library_hot";
        }
        if (i2 == 1) {
            return "music_library_mine";
        }
        if (i2 == 2) {
            return "music_library_search";
        }
        if (i2 == 3) {
            return "music_library_list";
        }
        return null;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            dismissDialog();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.a
    public void ao_() {
        c();
    }

    @Override // com.ss.android.ugc.aweme.music.a
    public final void f() {
        c();
    }

    @Override // com.ss.android.ugc.aweme.music.a
    public final void a(MusicModel musicModel, int i2, boolean z, boolean z2) {
        a(musicModel, i2, z, z2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r9 != false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final com.ss.android.ugc.aweme.shortvideo.model.MusicModel r5, final int r6, boolean r7, boolean r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.a(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, int, boolean, boolean, boolean):void");
    }

    /* access modifiers changed from: protected */
    public final void a(String str, MusicModel musicModel, String str2) {
        m mVar = this.f111793c;
        if (mVar != null) {
            this.n = true;
            if (mVar.i() != null) {
                c();
                c.a().pause();
                a(musicModel);
                ProgressDialog progressDialog = this.f111795e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                this.f111799i = false;
                bt.b(this.f111800j);
                this.f111793c.a(str, musicModel, str2);
            }
        }
    }

    public final void a(String str) {
        if (this.o != null) {
            if (this.p == 2) {
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                dVar.a("music_id", this.o.getMusicId()).a("enter_from", "search_music").a("search_keyword", com.ss.android.ugc.aweme.music.k.d.f111546a).a("log_pb", new com.google.gson.f().b(this.o.getLogPb()));
                r.a(str, be.a(dVar.f66730a));
                return;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("music_id", this.o.getMusicId());
            int i2 = this.p;
            String str2 = "";
            String str3 = "song_choose_page";
            if (i2 != 0) {
                if (i2 == 1) {
                    str3 = "collection_music";
                } else if (i2 != 2) {
                    str3 = i2 == 3 ? "song_category" : str2;
                }
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("enter_from", str3).a("enter_method", "click_play_music");
            int i3 = this.f111794d;
            if (i3 != 1) {
                if (i3 == 0) {
                    str2 = "video_edit_page";
                } else if (i3 == 2) {
                    str2 = "video_shoot_page";
                }
            }
            r.a(str, a3.a("previous_page", str2).a("category_id", i()).a("category_name", j()).f66730a);
        }
    }

    public final void g() {
        a aVar = this.f111798h;
        if (aVar != null) {
            aVar.a();
        }
    }

    private String i() {
        MusicCategory musicCategory = this.f111802l;
        if (musicCategory == null || musicCategory.categoryId == null) {
            return "";
        }
        return this.f111802l.categoryId;
    }

    private String j() {
        MusicCategory musicCategory = this.f111802l;
        if (musicCategory == null || musicCategory.categoryName == null) {
            return "";
        }
        return this.f111802l.categoryName;
    }

    private static boolean k() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public void b() {
        this.f111796f.a(new com.ss.android.ugc.musicprovider.interfaces.c() {
            /* class com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.AnonymousClass1 */

            static {
                Covode.recordClassIndex(71876);
            }

            @Override // com.ss.android.ugc.musicprovider.interfaces.c
            public final void a(int i2) {
                if (MusicDownloadPlayHelper.this.o != null) {
                    MusicDownloadPlayHelper musicDownloadPlayHelper = MusicDownloadPlayHelper.this;
                    musicDownloadPlayHelper.c(musicDownloadPlayHelper.o, MusicDownloadPlayHelper.this.p, MusicDownloadPlayHelper.this.r);
                }
                if (MusicDownloadPlayHelper.this.t) {
                    MusicDownloadPlayHelper.this.a("play_music");
                }
                if (MusicDownloadPlayHelper.this.n && MusicDownloadPlayHelper.this.f111796f != null) {
                    MusicDownloadPlayHelper.this.c();
                }
                if (MusicDownloadPlayHelper.this.f111793c != null) {
                    if (!(MusicDownloadPlayHelper.this.f111793c.h() == null || i2 == 0)) {
                        MusicDownloadPlayHelper.this.f111793c.h().setDuration(i2);
                    }
                    MusicDownloadPlayHelper.this.f111793c.a(MusicDownloadPlayHelper.this.o, SystemClock.elapsedRealtime() - MusicDownloadPlayHelper.this.s);
                    MusicDownloadPlayHelper.this.g();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void c() {
        CountDownTimer countDownTimer = this.q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f111796f.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r0 = (androidx.fragment.app.e) r0.i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.music.ui.m r0 = r4.f111793c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.app.Activity r0 = r0.i()
            androidx.fragment.app.e r0 = (androidx.fragment.app.e) r0
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            com.ss.android.ugc.aweme.base.SafeHandler r3 = new com.ss.android.ugc.aweme.base.SafeHandler
            r3.<init>(r0)
            com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper$2 r2 = new com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper$2
            r2.<init>(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.h():void");
    }

    @v(a = i.a.ON_DESTROY)
    public void dismissDialog() {
        ProgressDialog progressDialog = this.f111795e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f111795e = null;
        }
        this.f111799i = false;
        bt.b(this.f111800j);
    }

    @Override // com.ss.android.ugc.aweme.music.a
    public final void e() {
        CountDownTimer countDownTimer = this.q;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
        d dVar = this.f111796f;
        if (dVar.f148617a != null) {
            b bVar = dVar.f148617a;
            if (bVar.f148563d != null) {
                bVar.f148563d.d();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.a
    public void d() {
        this.f111792b.clear();
        CountDownTimer countDownTimer = this.q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.f111793c != null) {
            this.f111793c = null;
        }
        if (this.f111798h != null) {
            this.f111798h = null;
        }
        this.f111791a = null;
        this.f111797g.a();
        this.f111796f.a();
    }

    public final MusicDownloadPlayHelper b(int i2) {
        this.f111794d = i2;
        return this;
    }

    /* access modifiers changed from: protected */
    public void a(MusicModel musicModel) {
        AVExternalServiceImpl.a().publishService().setCurMusic(musicModel);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str) {
        this.f111792b.put(str, false);
        CountDownTimer countDownTimer = this.q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f111797g.a(str);
        m mVar = this.f111793c;
        if (mVar != null) {
            mVar.r();
        }
    }

    public MusicDownloadPlayHelper(m mVar) {
        this.f111793c = mVar;
        this.f111791a = mVar.i();
        this.f111796f = new d();
        com.ss.android.ugc.aweme.music.f fVar = new com.ss.android.ugc.aweme.music.f(this.f111793c.i(), true, true, true, "music_choose_page");
        this.f111797g = fVar;
        fVar.f111468a = 1;
    }

    private void b(MusicModel musicModel) {
        m mVar = this.f111793c;
        if (mVar != null) {
            this.n = true;
            if (mVar.i() != null) {
                c();
                c.a().pause();
                a(musicModel);
                ProgressDialog progressDialog = this.f111795e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                this.f111799i = false;
                bt.b(this.f111800j);
                this.f111793c.c(musicModel);
            }
        }
    }

    private void c(String str) {
        m mVar = this.f111793c;
        if (mVar != null) {
            androidx.core.app.d dVar = (androidx.core.app.d) mVar.i();
            this.f111795e = e.b.a(dVar, e.a.VISIBLE_AFTER_5S, new bb(this, str));
            dVar.getLifecycle().a(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(MusicModel musicModel, Context context) {
        return com.ss.android.ugc.aweme.music.k.d.a(musicModel, context, true);
    }

    private void b(MusicModel musicModel, int i2) {
        String str;
        String str2;
        com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
        if (i2 == 2) {
            cVar.a("source", "search");
        }
        int i3 = this.f111794d;
        if (i3 != 1) {
            String str3 = "";
            if (i3 == 0) {
                str = "mid_page";
                str2 = "video_edit_page";
            } else if (i3 == 2) {
                str = "shoot_page";
                str2 = "video_shoot_page";
            } else {
                str = str3;
                str2 = str;
            }
            cVar.a("enter_from", c(i2));
            if (musicModel.getMusicType() == MusicModel.MusicType.ONLINE) {
                if (!com.bytedance.common.utility.m.a(musicModel.getMusicId())) {
                    r.onEvent(MobClick.obtain().setEventName("music_add").setLabelName(str).setValue(musicModel.getMusicId()).setJsonObject(cVar.a()));
                    String a2 = a(i2);
                    if (TextUtils.equals("personal_homepage", a2)) {
                        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                        com.ss.android.ugc.aweme.app.f.d a3 = dVar.a("enter_from", a2).a("music_id", musicModel.getMusicId()).a("category_id", i()).a("category_name", j()).a("order", this.f111803m + 1);
                        if (!TextUtils.equals("personal_homepage", a2)) {
                            str3 = str2;
                        }
                        a3.a("previous_page", str3);
                        if (TextUtils.equals(a2, "search_music")) {
                            dVar.a("search_keyword", com.ss.android.ugc.aweme.music.k.d.f111546a);
                            dVar.a("log_pb", new com.google.gson.f().b(musicModel.getLogPb()));
                            if (com.ss.android.ugc.aweme.choosemusic.utils.b.a()) {
                                dVar.a("is_commercial", "1");
                            }
                            r.a("add_music", be.a(dVar.f66730a));
                            return;
                        }
                        if (com.ss.android.ugc.aweme.choosemusic.utils.b.a()) {
                            dVar.a("is_commercial", "1");
                        }
                        r.a("add_music", dVar.f66730a);
                    }
                }
            } else if (!com.bytedance.common.utility.m.a(musicModel.getSongId())) {
                r.onEvent(MobClick.obtain().setEventName("music_add").setLabelName(str).setValue(musicModel.getSongId()).setJsonObject(cVar.a()));
            }
        } else if (!com.bytedance.common.utility.m.a(musicModel.getMusicId())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("song_position", this.f111801k);
                if (i2 == 2) {
                    jSONObject.put("search_keyword", musicModel.getSearchKeyWords());
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            r.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("popular_song").setValue(musicModel.getMusicId()).setJsonObject(jSONObject));
        }
    }

    public final void a(MusicModel musicModel, int i2) {
        String str;
        String a2 = a(i2);
        int i3 = this.f111794d;
        String str2 = "";
        if (i3 == 0) {
            str = "video_edit_page";
        } else if (i3 == 2) {
            str = "video_shoot_page";
        } else {
            str = str2;
        }
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        com.ss.android.ugc.aweme.app.f.d a3 = dVar.a("enter_from", a2).a("music_id", musicModel.getMusicId()).a("category_id", i()).a("category_name", j()).a("order", this.f111803m + 1);
        if (!TextUtils.equals("personal_homepage", a2)) {
            str2 = str;
        }
        a3.a("previous_page", str2);
        if (com.ss.android.ugc.aweme.choosemusic.utils.b.a()) {
            dVar.a("is_commercial", "1");
        }
        r.a("add_music", be.a(dVar.f66730a));
    }

    @Override // com.ss.android.ugc.aweme.music.a
    public final void b(MusicModel musicModel, int i2, boolean z) {
        a(musicModel, i2, z, false);
    }

    private void a(final MusicModel musicModel, final String str, boolean z) {
        this.f111797g.a(musicModel, new com.ss.android.ugc.aweme.music.service.b() {
            /* class com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.AnonymousClass5 */

            static {
                Covode.recordClassIndex(71880);
            }

            @Override // com.ss.android.ugc.aweme.music.service.b
            public final void a() {
            }

            @Override // com.ss.android.ugc.aweme.music.service.b
            public final void b() {
            }

            @Override // com.ss.android.ugc.aweme.music.service.b
            public final void a(int i2) {
                if (MusicDownloadPlayHelper.this.f111793c != null && MusicDownloadPlayHelper.this.f111793c.bN_() && MusicDownloadPlayHelper.this.f111793c.i() != null && !UIUXBugsExperimentService.b().a() && MusicDownloadPlayHelper.this.f111795e != null) {
                    MusicDownloadPlayHelper.this.f111795e.setProgress(i2);
                }
            }

            @Override // com.ss.android.ugc.aweme.music.service.b
            public final void a(com.ss.android.ugc.musicprovider.a aVar) {
                MusicDownloadPlayHelper.this.dismissDialog();
                if (MusicDownloadPlayHelper.this.f111793c != null && MusicDownloadPlayHelper.this.f111793c.bN_() && MusicDownloadPlayHelper.this.f111793c.i() != null) {
                    MusicDownloadPlayHelper.this.f111793c.a(musicModel, aVar);
                    r.onEvent(MobClick.obtain().setEventName("music_download_end").setLabelName("perf_monitor").setExtValueString(musicModel.getMusicId()).setJsonObject(new s().a("is_success", "0").a("sdk_type", String.valueOf(MusicService.m().c())).a()));
                }
            }

            @Override // com.ss.android.ugc.aweme.music.service.b
            public final void a(String str, MusicWaveBean musicWaveBean) {
                musicModel.setMusicWaveBean(musicWaveBean);
                MusicDownloadPlayHelper.this.a(str, musicModel, str);
                r.onEvent(MobClick.obtain().setEventName("music_download_end").setLabelName("perf_monitor").setExtValueString(musicModel.getMusicId()).setJsonObject(new s().a("is_success", "1").a("downloadStrategy", String.valueOf(MusicService.m().c())).a()));
            }
        }, true, z);
    }

    /* access modifiers changed from: protected */
    public final void c(final MusicModel musicModel, final int i2, final boolean z) {
        CountDownTimer countDownTimer = this.q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
            long realAuditionDuration = (long) musicModel.getRealAuditionDuration();
            if (realAuditionDuration <= 0) {
                com.ss.android.ugc.aweme.framework.a.a.a("MusicDownloadPlayHelper: audition_duration is zero, music id: " + musicModel.getMusicId());
                return;
            }
            AnonymousClass3 r1 = new CountDownTimer(realAuditionDuration) {
                /* class com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(71878);
                }

                public final void onTick(long j2) {
                }

                public final void onFinish() {
                    MusicDownloadPlayHelper.this.f111796f.b();
                    if (MusicDownloadPlayHelper.this.u != null) {
                        MusicDownloadPlayHelper.this.u.a();
                    }
                    if (z) {
                        MusicDownloadPlayHelper.this.a(musicModel, i2, true);
                    }
                }
            };
            this.q = r1;
            r1.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.a
    public void a(MusicModel musicModel, int i2, boolean z) {
        m mVar;
        Activity i3;
        this.s = SystemClock.elapsedRealtime();
        if (musicModel != null && (mVar = this.f111793c) != null && (i3 = mVar.i()) != null) {
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = k();
            }
            if (!j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(i3).a(R.string.de8).a();
                return;
            }
            this.p = i2;
            if (a(musicModel, i3)) {
                this.o = musicModel;
                this.r = z;
                this.f111796f.b();
                String localPath = musicModel.getLocalPath();
                com.ss.android.ugc.musicprovider.a.a aVar = new com.ss.android.ugc.musicprovider.a.a();
                aVar.f148536f = musicModel.getMusicId();
                if (musicModel.getMusicType() == MusicModel.MusicType.ONLINE) {
                    aVar.f148533c = 4;
                    String a2 = com.ss.android.ugc.musicprovider.e.a().a(localPath);
                    aVar.f148534d = musicModel.getRealAuditionDuration();
                    if (TextUtils.isEmpty(a2) || !com.ss.android.ugc.aweme.video.e.b(a2) || new File(a2).length() <= 0) {
                        if (musicModel.isNeedSetCookie()) {
                            String cookie = CookieManager.getInstance().getCookie(musicModel.getUrl().getUrlList().get(0));
                            HashMap<String, String> hashMap = new HashMap<>();
                            hashMap.put("cookie", cookie);
                            aVar.f148535e = hashMap;
                        }
                        aVar.f148532b = musicModel.getUrl().getUrlList();
                        this.f111796f.a(aVar, z);
                        return;
                    }
                    aVar.f148531a = a2;
                    this.f111796f.a(aVar, z);
                    a aVar2 = this.f111798h;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                }
            }
        }
    }

    private void a(MusicModel musicModel, String str, boolean z, boolean z2) {
        AVExternalServiceImpl.a().provideAVPerformance().start("av_music_download", "MusicDownloadPlayHelper start");
        if (!TextUtils.isEmpty(musicModel.getBindChallengeId()) && !TextUtils.equals(musicModel.getBindChallengeId(), "0")) {
            b.i.b(new bc(musicModel), b.i.f4824a).a(new bd(this, musicModel, z2, str, z), b.i.f4826c, null);
        } else if (z2) {
            b(musicModel);
        } else {
            a(musicModel, str, z);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(MusicModel musicModel, boolean z, String str, boolean z2, b.i iVar) {
        if (!this.f111792b.get(musicModel.getMusicId()).booleanValue()) {
            return null;
        }
        if (iVar.b() || iVar.c()) {
            dismissDialog();
            return null;
        } else if (z) {
            b(musicModel);
            return null;
        } else {
            a(musicModel, str, z2);
            return null;
        }
    }
}
