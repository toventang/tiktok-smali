package com.ss.android.ugc.aweme.music.assem.video;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.assem.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.h;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class MusicPlayViewModel extends AssemViewModel<e> implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, com.ss.android.ugc.aweme.favorites.g.f, i, j {

    /* renamed from: m  reason: collision with root package name */
    public static final b f111274m = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    MusicDownloadPlayHelper f111275j;

    /* renamed from: k  reason: collision with root package name */
    public DataCenter f111276k;

    /* renamed from: l  reason: collision with root package name */
    public MusicModel f111277l;
    private final com.bytedance.assem.arch.extensions.i n = new com.bytedance.assem.arch.extensions.i(true, new a(this, null));

    static {
        Covode.recordClassIndex(71504);
    }

    private final OriginMusicArg m() {
        return (OriginMusicArg) this.n.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(70, new org.greenrobot.eventbus.g(MusicPlayViewModel.class, "onEvent", com.ss.android.ugc.aweme.music.f.e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(71506);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.f
    public final void a() {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f111275j;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.ao_();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ e f() {
        return new e();
    }

    public final void l() {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f111275j;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.n = false;
        }
    }

    static final class c implements MusicDownloadPlayHelper.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DataCenter f111278a;

        static {
            Covode.recordClassIndex(71507);
        }

        c(DataCenter dataCenter) {
            this.f111278a = dataCenter;
        }

        @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.a
        public final void a() {
            DataCenter dataCenter = this.f111278a;
            if (dataCenter != null) {
                dataCenter.a("music_loading", (Object) false);
            }
        }
    }

    private static boolean n() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void c() {
        super.c();
        EventBus.a(EventBus.a(), this);
    }

    public final String g() {
        OriginMusicArg m2 = m();
        if (m2 != null) {
            return m2.getPreviousPage();
        }
        return null;
    }

    public final void k() {
        b(new g(this));
        a();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        EventBus.a().b(this);
    }

    public static final class a extends m implements h.f.a.a<OriginMusicArg> {
        final /* synthetic */ String $identify;
        final /* synthetic */ AssemViewModel $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(71505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = assemViewModel;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.music.assem.OriginMusicArg] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.music.assem.OriginMusicArg invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.d r2 = r0.f25687d
                if (r2 == 0) goto L_0x000f
                java.lang.Class<com.ss.android.ugc.aweme.music.assem.OriginMusicArg> r1 = com.ss.android.ugc.aweme.music.assem.OriginMusicArg.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            L_0x000f:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel.a.invoke():java.lang.Object");
        }
    }

    private static boolean o() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean n2 = n();
        com.ss.android.ugc.aweme.lancet.j.f107229h = n2;
        return n2;
    }

    /* access modifiers changed from: package-private */
    public final String h() {
        com.ss.android.ugc.aweme.music.assem.b bVar = (com.ss.android.ugc.aweme.music.assem.b) com.bytedance.assem.arch.service.d.a(this, ab.a(h.class));
        if (bVar != null) {
            return bVar.f111133a;
        }
        return null;
    }

    public final boolean i() {
        com.ss.android.ugc.aweme.music.assem.b bVar = (com.ss.android.ugc.aweme.music.assem.b) com.bytedance.assem.arch.service.d.a(this, ab.a(h.class));
        if (bVar != null) {
            return bVar.f111136d;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        com.ss.android.ugc.aweme.music.assem.b bVar = (com.ss.android.ugc.aweme.music.assem.b) com.bytedance.assem.arch.service.d.a(this, ab.a(h.class));
        if (bVar != null) {
            return bVar.f111138f;
        }
        return false;
    }

    @r
    public final void onEvent(com.ss.android.ugc.aweme.music.f.e eVar) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f111275j;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.ao_();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<e, z> {
        final /* synthetic */ MusicPlayViewModel this$0;

        static {
            Covode.recordClassIndex(71514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(MusicPlayViewModel musicPlayViewModel) {
            super(1);
            this.this$0 = musicPlayViewModel;
        }

        static final class a extends m implements h.f.a.b<e, e> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f111281a = new a();

            static {
                Covode.recordClassIndex(71515);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ e invoke(e eVar) {
                l.d(eVar, "");
                return e.a(null, f.Default);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            if (eVar2.f111292a != null) {
                this.this$0.a(a.f111281a);
            }
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<e, z> {
        final /* synthetic */ MusicPlayViewModel this$0;

        static {
            Covode.recordClassIndex(71508);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(MusicPlayViewModel musicPlayViewModel) {
            super(1);
            this.this$0 = musicPlayViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            l.d(eVar2, "");
            if (eVar2.f111292a != null) {
                this.this$0.a(new a(this));
            }
            return z.f158842a;
        }

        static final class a extends m implements h.f.a.b<e, e> {
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(71509);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ e invoke(e eVar) {
                Object obj;
                f fVar;
                e eVar2 = eVar;
                l.d(eVar2, "");
                DataCenter dataCenter = this.this$0.this$0.f111276k;
                if (dataCenter != null) {
                    obj = dataCenter.a("music_loading");
                } else {
                    obj = null;
                }
                if (l.a(obj, (Object) true)) {
                    fVar = f.Loading;
                } else {
                    fVar = f.Playing;
                }
                return e.a(eVar2.f111292a, fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<e, z> {
        final /* synthetic */ MusicModel $model;
        final /* synthetic */ MusicPlayViewModel this$0;

        static {
            Covode.recordClassIndex(71511);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(MusicPlayViewModel musicPlayViewModel, MusicModel musicModel) {
            super(1);
            this.this$0 = musicPlayViewModel;
            this.$model = musicModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            final e eVar2 = eVar;
            l.d(eVar2, "");
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f111279a;

                static {
                    Covode.recordClassIndex(71512);
                }

                {
                    this.f111279a = r1;
                }

                public final void run() {
                    String str;
                    MusicModel musicModel = eVar2.f111292a;
                    if (musicModel != null) {
                        str = musicModel.getMusicId();
                    } else {
                        str = null;
                    }
                    if (l.a((Object) str, (Object) this.f111279a.$model.getMusicId())) {
                        this.f111279a.this$0.k();
                        return;
                    }
                    this.f111279a.this$0.a();
                    this.f111279a.this$0.a(new h.f.a.b<e, e>(this) {
                        /* class com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel.f.AnonymousClass1.AnonymousClass1 */
                        final /* synthetic */ AnonymousClass1 this$0;

                        static {
                            Covode.recordClassIndex(71513);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ e invoke(e eVar) {
                            l.d(eVar, "");
                            return e.a(this.this$0.f111279a.$model, f.Default);
                        }
                    });
                    this.f111279a.this$0.a(this.f111279a.$model);
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.f
    public final void a(MusicModel musicModel) {
        if (musicModel != null) {
            MusicDownloadPlayHelper musicDownloadPlayHelper = this.f111275j;
            if (musicDownloadPlayHelper != null) {
                musicDownloadPlayHelper.n = false;
            }
            DataCenter dataCenter = this.f111276k;
            if (dataCenter != null) {
                dataCenter.a("music_loading", (Object) true);
            }
            this.f111277l = musicModel;
            MusicDownloadPlayHelper musicDownloadPlayHelper2 = this.f111275j;
            if (musicDownloadPlayHelper2 != null) {
                musicDownloadPlayHelper2.a(musicModel, 7, false);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
        if (bVar2 != null) {
            String str = bVar2.f67014a;
            if (str.hashCode() == 502104354 && str.equals("music_loading")) {
                b(new d(this));
            }
        }
    }

    public final void a(boolean z) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f111275j;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.ao_();
        }
        if (z) {
            k();
            MusicDownloadPlayHelper musicDownloadPlayHelper2 = this.f111275j;
            if (musicDownloadPlayHelper2 != null) {
                musicDownloadPlayHelper2.n = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<e, z> {
        final /* synthetic */ boolean $isPin;
        final /* synthetic */ MusicModel $model;
        final /* synthetic */ int $position;
        final /* synthetic */ MusicPlayViewModel this$0;

        static {
            Covode.recordClassIndex(71510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(MusicPlayViewModel musicPlayViewModel, boolean z, MusicModel musicModel, int i2) {
            super(1);
            this.this$0 = musicPlayViewModel;
            this.$isPin = z;
            this.$model = musicModel;
            this.$position = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            String str;
            String str2;
            e eVar2 = eVar;
            String str3 = "";
            l.d(eVar2, str3);
            MusicPlayViewModel musicPlayViewModel = this.this$0;
            boolean z = this.$isPin;
            MusicModel musicModel = this.$model;
            int i2 = this.$position;
            f fVar = eVar2.f111293b;
            if (musicPlayViewModel.i()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            if (!musicPlayViewModel.i()) {
                str3 = musicPlayViewModel.h();
            }
            if (!musicPlayViewModel.j()) {
                if (fVar == f.Playing) {
                    str2 = "pause";
                } else {
                    str2 = "play";
                }
                com.ss.android.ugc.aweme.common.r.a("play_music", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("previous_page", musicPlayViewModel.g()).a("music_id", musicModel.getMusicId()).a("to_user_id", str3).a("pos", i2).a("is_pin_to_top", z ? 1 : 0).a("play_status", str2).a("enter_method", "personal_list").f66730a);
            } else if (fVar != f.Playing) {
                com.ss.android.ugc.aweme.common.r.a("search_result_click", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personal_homepage").a("button_type", "play_music").a("search_result_id", musicModel.getMusicId()).a("rank", i2).f66730a);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.f
    public final void a(MusicModel musicModel, int i2, boolean z) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f111275j;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.f111801k = "popular_song";
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper2 = this.f111275j;
        if (musicDownloadPlayHelper2 != null) {
            musicDownloadPlayHelper2.f111803m = i2;
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper3 = this.f111275j;
        if (musicDownloadPlayHelper3 != null) {
            musicDownloadPlayHelper3.b(musicModel, 7, true);
        }
    }

    public final void d(MusicModel musicModel, int i2, boolean z) {
        l.d(musicModel, "");
        b(new e(this, z, musicModel, i2));
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!o()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.de8).a();
        } else {
            b(new f(this, musicModel));
        }
    }

    public final void c(MusicModel musicModel, int i2, boolean z) {
        String h2;
        String str;
        l.d(musicModel, "");
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null && MusicService.m().a(musicModel, topActivity, true)) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin() || !AVExternalServiceImpl.a().configService().avsettingsConfig().needLoginBeforeRecord()) {
                a(musicModel, i2, false);
                if (i()) {
                    h2 = "";
                } else {
                    h2 = h();
                }
                MobClick value = MobClick.obtain().setEventName("shoot").setLabelName("single_song").setValue(musicModel.getMusicId());
                com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g3, "");
                if (TextUtils.equals(g3.getCurUserId(), h())) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                com.ss.android.ugc.aweme.common.r.onEvent(value.setJsonObject(cVar.a("enter_from", str).a()));
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("shoot_way", "single_song").a("music_id", musicModel.getMusicId());
                if (!i()) {
                    a2.a("shoot_from", "others_homepage").a("enter_method", "others_homepage").a("to_user_id", h2).a("pos", i2).a("is_pin_to_top", z ? 1 : 0);
                }
                com.ss.android.ugc.aweme.common.r.a("shoot", a2.f66730a);
                return;
            }
            bo b2 = com.ss.android.ugc.aweme.account.b.b();
            IAccountService.d dVar = new IAccountService.d();
            dVar.f62401a = topActivity;
            b2.showLoginAndRegisterView(dVar.a());
            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("login_notify").setLabelName("click_music_shoot"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r31v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(MusicModel musicModel, int i2, boolean z) {
        String str;
        String h2;
        if (musicModel == null) {
            return;
        }
        if (musicModel.getMusicStatus() != 0 || musicModel.getMusic() == null) {
            if (i()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            if (i()) {
                h2 = "";
            } else {
                h2 = h();
            }
            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("personal_homepage_list").setValue(musicModel.getMusicId()));
            String uuid = UUID.randomUUID().toString();
            l.b(uuid, "");
            if (j()) {
                com.ss.android.ugc.aweme.common.r.a("search_result_click", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personal_homepage").a("button_type", "enter_music_detail").a("search_result_id", musicModel.getMusicId()).a("rank", i2).f66730a);
            } else {
                com.ss.android.ugc.aweme.common.r.a("enter_music_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("group_id", "").a("music_id", musicModel.getMusicId()).a("previous_page", g()).a("process_id", uuid).a("enter_method", "personal_list").a("to_user_id", h2).a("pos", i2).a("is_pin_to_top", z ? 1 : 0).f66730a);
            }
            if (MusicService.m().a(musicModel, ActivityStack.getTopActivity(), true)) {
                JSONObject jSONObject = new JSONObject();
                if (!i()) {
                    jSONObject.put("shoot_from", "others_homepage");
                    jSONObject.put("to_user_id", h());
                    jSONObject.put("pos", i2);
                    jSONObject.put("is_pin_to_top", (int) z);
                }
                t.a(t.a(), com.ss.android.ugc.aweme.ck.u.a("aweme://music/detail/" + musicModel.getMusicId()).a("process_id", uuid).a("extra_track_info", jSONObject.toString()).a());
            } else if (j()) {
                com.ss.android.ugc.aweme.common.r.a("search_result_click", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personal_homepage").a("button_type", "enter_music_detail").a("search_result_id", musicModel.getMusicId()).a("rank", i2).f66730a);
            } else {
                com.ss.android.ugc.aweme.common.r.a("enter_music_detail_failed", new com.ss.android.ugc.aweme.app.f.d().a("group_id", "").a("author_id", "").a("music_id", musicModel.getMusicId()).a("enter_from", str).a("to_user_id", h2).a("pos", i2).a("is_pin_to_top", (int) z).f66730a);
            }
        } else {
            Music music = musicModel.getMusic();
            l.b(music, "");
            String offlineDesc = music.getOfflineDesc();
            l.b(offlineDesc, "");
            if (TextUtils.isEmpty(offlineDesc)) {
                offlineDesc = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.dcb);
                l.b(offlineDesc, "");
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(offlineDesc).a();
        }
    }
}
