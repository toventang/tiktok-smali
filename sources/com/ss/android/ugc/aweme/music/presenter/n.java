package com.ss.android.ugc.aweme.music.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.favorites.g.a;
import com.ss.android.ugc.aweme.favorites.g.d;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.u.c;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.music.ui.w;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.d.a.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class n extends l<r> implements d, CheckableImageView.a {
    public int A = 0;
    public String B;
    public String C = "";
    public String D = "";
    public int E = 0;
    private a F;
    private Boolean G;

    /* renamed from: f  reason: collision with root package name */
    public MusicModel f111604f;

    /* renamed from: g  reason: collision with root package name */
    public Music f111605g;

    /* renamed from: k  reason: collision with root package name */
    public String f111606k;

    /* renamed from: l  reason: collision with root package name */
    public String f111607l;

    /* renamed from: m  reason: collision with root package name */
    public String f111608m;
    public String n = "single_song";
    public String o;
    public com.ss.android.ugc.musicprovider.d p = new com.ss.android.ugc.musicprovider.d();
    CountDownTimer q;
    public w r;
    public boolean s = false;
    public t<Boolean> t = new t<>();
    boolean u;
    public boolean v = true;
    public String w;
    public String x;
    long y = -1;
    long z = -1;

    static {
        Covode.recordClassIndex(71716);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
    public final void bR_() {
    }

    private void m() {
        this.s = !this.s;
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final void cd_() {
        super.cd_();
        CountDownTimer countDownTimer = this.q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.p.a();
    }

    public final void d() {
        f();
        CountDownTimer countDownTimer = this.q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final Effect k() {
        w wVar = this.r;
        if (wVar != null) {
            return wVar.f112070c;
        }
        return null;
    }

    public final String e() {
        if (TextUtils.isEmpty(this.B)) {
            return null;
        }
        try {
            return new JSONObject(this.B).getString("shoot_from");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String l() {
        if (TextUtils.isEmpty(this.x)) {
            return null;
        }
        ArrayList<String> b2 = b(this.x);
        if (!b2.isEmpty()) {
            return b2.get(0);
        }
        return null;
    }

    public n() {
        a aVar = new a();
        this.F = aVar;
        aVar.a_(this);
        this.F.f90639c = "single_song";
        this.t.setValue(false);
    }

    @Override // com.ss.android.ugc.aweme.music.presenter.l, com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (this.f76397i != null && this.f76396h != null) {
            T t2 = this.f76396h.mData;
            if (t2 == null) {
                super.a_(new RuntimeException("music detail should not be null"));
                return;
            }
            Music music = t2.music;
            if (music != null) {
                this.f111605g = music;
                this.f111604f = music.convertToMusicModel();
                Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
                l.d(a2, "");
                if (AVExternalServiceImpl.a().provideTakeInSameOptimize().enableTakeInSameRecordOptimize(a2)) {
                    this.r.a(this.f111604f, l(), true, true, false, this.A, false);
                }
                super.c();
                if (this.f111604f.getCollectionType() != null) {
                    boolean equals = MusicModel.CollectionType.COLLECTED.equals(this.f111604f.getCollectionType());
                    this.s = equals;
                    this.t.setValue(Boolean.valueOf(equals));
                }
            } else if (((l) this).f76397i != null) {
                ((q) ((l) this).f76397i).a();
            }
        }
    }

    public final void f() {
        CountDownTimer countDownTimer = this.q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.G = Boolean.valueOf(this.u);
        this.u = false;
        this.p.b();
        ((r) this.f76397i).a(a(this.f111605g));
        if (this.f111604f != null && this.G.booleanValue()) {
            Map<String, String> p2 = SearchServiceImpl.t().p();
            r.a("music_play_time", new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "click_play_music").a("enter_from", this.n).a("search_type", p2.get("searchType")).a("previous_page_position", this.f111608m).a("log_pb", ac.a.f91473a.a(p2.get("imprId"))).a("impr_id", p2.get("imprId")).a("music_id", this.f111604f.getMusicId()).a("time", this.f111604f.getDuration()).a("duration", this.f111604f.getDuration()).a("stay_time", SystemClock.elapsedRealtime() - this.z).f66730a);
        }
    }

    public final void g() {
        String str;
        this.y = SystemClock.elapsedRealtime();
        this.u = true;
        if (this.f111604f != null) {
            com.ss.android.ugc.musicprovider.a.a aVar = new com.ss.android.ugc.musicprovider.a.a();
            aVar.f148536f = this.f111604f.getMusicId();
            if (this.f111604f.getMusicType() == MusicModel.MusicType.ONLINE) {
                aVar.f148533c = 4;
            }
            if (b.a().a(true, "remove_15s_cap_music", true)) {
                aVar.f148534d = this.f111604f.getAuditionDuration().intValue();
            } else {
                aVar.f148534d = this.f111604f.getDuration();
            }
            if (this.f111604f.isPlayUrlValid()) {
                aVar.f148532b = this.f111604f.getUrl().getUrlList();
            }
            ((r) this.f76397i).c();
            this.p.a(new p(this));
            this.p.a(aVar, true);
            MobClick labelName = MobClick.obtain().setEventName("music_play").setLabelName("single_song");
            s sVar = new s();
            MusicModel musicModel = this.f111604f;
            if (musicModel != null) {
                str = musicModel.getMusicId();
            } else {
                str = "";
            }
            r.onEvent(labelName.setJsonObject(sVar.a("song_id", str).a()));
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
    public final void a(int i2) {
        if (i2 == 1) {
            this.t.setValue(Boolean.valueOf(this.s));
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void e_(Exception exc) {
        m();
        this.t.setValue(Boolean.valueOf(this.s));
    }

    public static boolean a(Music music) {
        if (music == null) {
            return false;
        }
        if (music.getMusicStatus() == 0 || CommerceMediaServiceImpl.f().b(music)) {
            return true;
        }
        return false;
    }

    public static ArrayList<String> b(String str) {
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        String[] split = str.split(",");
        for (String str2 : split) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public final void a(Context context) {
        if (this.f111604f != null) {
            if (!MusicService.m().a(this.f111604f, context, true)) {
                r.a("user_music_failed", new com.ss.android.ugc.aweme.app.f.d().a("previous_page", "single_song").a("action_type", "save").a("music_id", this.f111604f.getMusicId()).a("enter_from", this.f111607l).f66730a);
                return;
            }
            this.F.a(1, this.f111604f.getMusicId(), Integer.valueOf(1 ^ (this.s ? 1 : 0)));
            m();
        }
    }

    public final void b(com.ss.android.ugc.aweme.app.f.d dVar) {
        if (!TextUtils.isEmpty(this.x)) {
            ArrayList<String> b2 = b(this.x);
            if (!b2.isEmpty()) {
                dVar.a("prop_id", b2.get(0));
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.app.f.d dVar) {
        if (!TextUtils.isEmpty(this.B)) {
            try {
                JSONObject jSONObject = new JSONObject(this.B);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    dVar.a(next, jSONObject.opt(next));
                }
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(BaseResponse baseResponse) {
        if (this.s) {
            this.f111604f.setCollectionType(MusicModel.CollectionType.COLLECTED);
            this.f111605g.setCollectStatus(1);
            com.ss.android.ugc.aweme.music.f.b bVar = new com.ss.android.ugc.aweme.music.f.b(1, this.f111604f);
            bVar.f111485c = "music_detail";
            bVar.f111486d = hashCode();
            c.a(bVar);
            if (this.f76397i != null) {
                ((r) this.f76397i).b(baseResponse);
            }
            r.onEvent(MobClick.obtain().setEventName("collection_music_cancel").setLabelName("single_song").setValue(String.valueOf(this.f111604f.getMusicId())).setExtValueLong(0));
            return;
        }
        this.f111604f.setCollectionType(MusicModel.CollectionType.NOT_COLLECTED);
        this.f111605g.setCollectStatus(0);
        com.ss.android.ugc.aweme.music.f.b bVar2 = new com.ss.android.ugc.aweme.music.f.b(0, this.f111604f);
        bVar2.f111485c = "music_detail";
        bVar2.f111486d = hashCode();
        c.a(bVar2);
        r.onEvent(MobClick.obtain().setEventName("collection_music").setLabelName("single_song").setValue(String.valueOf(this.f111604f.getMusicId())).setExtValueLong(0));
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(String str) {
        ((r) this.f76397i).a(str);
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(String str, String str2) {
        if (this.f111604f != null && !TextUtils.isEmpty(str)) {
            if (!TextUtils.equals(str, "qr_code")) {
                r.a("share_music", new com.ss.android.ugc.aweme.app.f.d().a("music_id", this.f111604f.getMusicId()).a("platform", str).a("process_id", str2).a("share_mode", "normal_share").f66730a);
            }
            ah.f123353b.a(str, 2);
        }
    }

    public static void a(String str, boolean z2, Music music) {
        if (z2 && music != null) {
            com.ss.android.ugc.aweme.common.c cVar = new com.ss.android.ugc.aweme.common.c();
            cVar.a(new com.ss.android.ugc.aweme.feed.u.a());
            c.a aVar = new c.a();
            aVar.f93987a = music.getMid();
            aVar.f93988b = 1;
            aVar.f93991e = -1;
            aVar.f93993g = 2;
            aVar.f93994h = str;
            cVar.a(aVar.a());
        }
    }
}
