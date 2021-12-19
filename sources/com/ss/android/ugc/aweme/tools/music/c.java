package com.ss.android.ugc.aweme.tools.music;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.cz.a.d;
import com.ss.android.ugc.aweme.cz.a.j;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.port.in.aq;
import com.ss.android.ugc.aweme.port.in.as;
import com.ss.android.ugc.aweme.port.in.p;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.setting.bl;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.w;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.tools.music.c.a;
import com.ss.android.ugc.aweme.tools.music.c.b;
import com.ss.android.ugc.aweme.tools.music.f.b;
import com.ss.android.ugc.aweme.tools.music.f.c;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.vesdk.VEUtils;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c implements aa {

    /* renamed from: b  reason: collision with root package name */
    public final as f140421b;

    static {
        Covode.recordClassIndex(91731);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final aa.c k() {
        return com.ss.android.ugc.aweme.tools.music.a.a.f140275c;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final aa.i l() {
        return com.ss.android.ugc.aweme.tools.music.a.b.e.f140336a;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final void a(Activity activity, int i2, com.ss.android.ugc.aweme.cz.a.c cVar, h.f.a.b<? super com.ss.android.ugc.aweme.cz.a.d, z> bVar, h.f.a.a<z> aVar) {
        l.d(activity, "");
        l.d(cVar, "");
        a aVar2 = new a((androidx.fragment.app.e) activity);
        a aVar3 = new a(this, 110, cVar);
        a.AbstractC3709a a2 = a(bVar, aVar);
        l.d(aVar3, "");
        l.d(a2, "");
        b bVar2 = aVar2.f140424a;
        if (bVar2 == null) {
            l.a("mAvoidOnResultFragment");
        }
        l.d(aVar3, "");
        l.d(a2, "");
        List<a.AbstractC3709a> list = bVar2.f140425a.get(110);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(list.size(), a2);
        bVar2.f140425a.put(110, list);
        aVar3.invoke(bVar2);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final void a(Activity activity, FrameLayout frameLayout, com.ss.android.ugc.aweme.cz.a.c cVar, h.f.a.b<? super com.ss.android.ugc.aweme.cz.a.d, z> bVar, h.f.a.a<z> aVar, h.f.a.a<z> aVar2) {
        l.d(activity, "");
        l.d(frameLayout, "");
        l.d(cVar, "");
        AVExternalServiceImpl.a().provideAVPerformance().step(OpenMusicPanelPerformanceMonitor.f114756a, "open_choose_music_page");
        if (bl.a()) {
            IAccountUserService e2 = AccountService.a().e();
            l.b(e2, "");
            if (!e2.isChildrenMode()) {
                IMusicService m2 = MusicService.m();
                Bundle bundle = new Bundle();
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", cVar.f79312b);
                AVChallenge curChallenge = AVExternalServiceImpl.a().publishService().getCurChallenge();
                if (curChallenge != null) {
                    bundle.putString("challenge", curChallenge.cid);
                }
                bundle.putString("title", cVar.f79311a);
                MusicModel musicModel = new MusicModel();
                musicModel.setMvThemeMusic(cVar.f79320j);
                bundle.putSerializable("music_model", musicModel);
                bundle.putBoolean("music_allow_clear", cVar.f79313c);
                bundle.putBoolean("music_is_photomv", cVar.f79314d);
                bundle.putString("creation_id", cVar.f79317g);
                bundle.putString("shoot_way", cVar.f79316f);
                bundle.putBoolean("long_video", cVar.f79321k);
                bundle.putBoolean("hide_local_music", cVar.f79319i);
                bundle.putBoolean("extra_beat_music_sticker", cVar.f79318h);
                if (cVar.f79315e != null) {
                    bundle.putBundle("arguments", cVar.f79315e);
                }
                m2.a(activity, frameLayout, bundle, new b(this, bVar, aVar), aVar2);
                return;
            }
        }
        a((aa) activity, (Activity) 110, cVar, (h.f.a.b) bVar, (h.f.a.a) aVar);
    }

    @Override // com.ss.android.ugc.aweme.port.in.p
    public final void a(String str, aq aqVar) {
        l.d(str, "");
        l.d(aqVar, "");
        this.f140421b.a(str, aqVar);
    }

    @Override // com.ss.android.ugc.aweme.port.in.p
    public final void a(Context context, com.ss.android.ugc.aweme.shortvideo.c cVar, int i2, p.a aVar) {
        l.d(context, "");
        l.d(cVar, "");
        l.d(aVar, "");
        MusicService.m().a(context, b.a.a(cVar), i2, new C3710c(aVar, cVar));
    }

    @Override // com.ss.android.ugc.aweme.port.in.p
    public final boolean a(com.ss.android.ugc.aweme.shortvideo.c cVar, Context context, boolean z) {
        l.d(cVar, "");
        l.d(context, "");
        return this.f140421b.a(cVar, context, z);
    }

    @Override // com.ss.android.ugc.aweme.port.in.p
    public final String a(String str) {
        String a2 = this.f140421b.a(str);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final boolean a(int i2) {
        return this.f140421b.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final void a(Context context, String str, boolean z, ProgressDialog progressDialog, aa.f fVar) {
        l.d(context, "");
        l.d(str, "");
        l.d(fVar, "");
        MusicService.m().a(context, str, z, progressDialog, new e(fVar));
    }

    @Override // com.ss.android.ugc.aweme.port.in.p
    public final void a() {
        MusicService.m().d();
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final List<com.ss.android.ugc.aweme.shortvideo.c> a(int i2, String str) {
        MusicList a2;
        IMusicService m2 = MusicService.m();
        if (m2 == null || (a2 = m2.a(i2, str)) == null || k.a(a2.musicList)) {
            return null;
        }
        return b.a.a(c.a.a(a2.musicList));
    }

    @Override // com.ss.android.ugc.aweme.port.in.p
    public final void a(Context context, String str, UrlModel urlModel, p.a aVar) {
        l.d(context, "");
        l.d(str, "");
        l.d(urlModel, "");
        MusicService.m().a(context, str, urlModel, new d(aVar));
    }

    @Override // com.ss.android.ugc.aweme.port.in.p
    public final String a(MusicModel musicModel) {
        l.d(musicModel, "");
        String a2 = MusicService.m().a(musicModel);
        l.b(a2, "");
        return a2;
    }

    public static final class d implements com.ss.android.ugc.aweme.music.service.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p.a f140429a;

        static {
            Covode.recordClassIndex(91735);
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void b() {
            p.a aVar = this.f140429a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a() {
            p.a aVar = this.f140429a;
            if (aVar != null) {
                aVar.a(-1, "");
            }
        }

        d(p.a aVar) {
            this.f140429a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(int i2) {
            p.a aVar = this.f140429a;
            if (aVar != null) {
                aVar.a(i2);
            }
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(com.ss.android.ugc.musicprovider.a aVar) {
            l.d(aVar, "");
            p.a aVar2 = this.f140429a;
            if (aVar2 != null) {
                aVar2.a(Integer.valueOf(aVar.getErrorCode()), aVar.getErrorMsg());
            }
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(String str, MusicWaveBean musicWaveBean) {
            l.d(str, "");
            p.a aVar = this.f140429a;
            if (aVar != null) {
                aVar.a(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final void f() {
        MusicService.m().k();
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final com.ss.android.ugc.aweme.port.in.a.a g() {
        return new com.ss.android.ugc.aweme.tools.music.e.b.g();
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final boolean h() {
        return w.a("music");
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final void i() {
        w.b("music");
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final void j() {
        com.ss.android.ugc.aweme.tools.music.e.a.b.f140453h.a(0);
    }

    @Override // com.ss.android.ugc.aweme.port.in.p
    public final boolean b() {
        IMusicService m2 = MusicService.m();
        l.b(m2, "");
        return m2.f();
    }

    @Override // com.ss.android.ugc.aweme.port.in.p
    public final String c() {
        as asVar = this.f140421b;
        l.b(asVar, "");
        String a2 = asVar.a();
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.port.in.p
    public final String d() {
        as asVar = this.f140421b;
        l.b(asVar, "");
        String b2 = asVar.b();
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final void e() {
        MusicService.m().a((Integer) 0);
    }

    public c() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        this.f140421b = createIAVServiceProxybyMonsterPlugin.getMusicService();
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final Class<?> m() {
        IMusicService m2 = MusicService.m();
        l.b(m2, "");
        Class<?> l2 = m2.l();
        l.b(l2, "");
        return l2;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.c$c  reason: collision with other inner class name */
    public static final class C3710c implements com.ss.android.ugc.aweme.music.service.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p.a f140427a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c f140428b;

        static {
            Covode.recordClassIndex(91734);
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void b() {
            this.f140427a.a();
            r.a("download_music", new com.ss.android.ugc.tools.f.b().a("enter_from", "draft_page").a("music_id", this.f140428b.getMusicId()).f149193a);
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(int i2) {
            this.f140427a.a(i2);
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(com.ss.android.ugc.musicprovider.a aVar) {
            l.d(aVar, "");
            this.f140427a.a(Integer.valueOf(aVar.getErrorCode()), aVar.getErrorMsg());
        }

        C3710c(p.a aVar, com.ss.android.ugc.aweme.shortvideo.c cVar) {
            this.f140427a = aVar;
            this.f140428b = cVar;
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(String str, MusicWaveBean musicWaveBean) {
            l.d(str, "");
            this.f140427a.a(str);
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.music.service.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aa.f f140430a;

        static {
            Covode.recordClassIndex(91736);
        }

        e(aa.f fVar) {
            this.f140430a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.music.service.a
        public final void a(Exception exc) {
            l.d(exc, "");
            this.f140430a.a(exc);
        }

        @Override // com.ss.android.ugc.aweme.music.service.a
        public final void a(String str, MusicModel musicModel) {
            l.d(str, "");
            l.d(musicModel, "");
            aa.f fVar = this.f140430a;
            com.ss.android.ugc.aweme.shortvideo.c a2 = com.ss.android.ugc.aweme.tools.music.f.b.a(musicModel);
            if (a2 == null) {
                l.b();
            }
            fVar.a(str, a2);
        }
    }

    public static final class g implements aa.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.cz.a.f f140434a;

        static {
            Covode.recordClassIndex(91738);
        }

        g(com.ss.android.ugc.aweme.cz.a.f fVar) {
            this.f140434a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.port.in.aa.g
        public final aa.g a(List<String> list) {
            com.ss.android.ugc.aweme.tools.music.b.b.f140410c.f140413b = this.f140434a;
            com.ss.android.ugc.aweme.tools.music.b.b.f140410c.a(list);
            return this;
        }

        @Override // com.ss.android.ugc.aweme.port.in.aa.g
        public final aa.g a(com.ss.android.ugc.aweme.cz.a.b bVar) {
            l.d(bVar, "");
            com.ss.android.ugc.aweme.tools.music.b.b.f140410c.f140413b = this.f140434a;
            com.ss.android.ugc.aweme.tools.music.b.b.f140410c.f140412a = new a(bVar);
            return this;
        }

        static final class a implements com.ss.android.ugc.aweme.tools.music.d.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.cz.a.b f140435a;

            static {
                Covode.recordClassIndex(91739);
            }

            a(com.ss.android.ugc.aweme.cz.a.b bVar) {
                this.f140435a = bVar;
            }

            @Override // com.ss.android.ugc.aweme.tools.music.d.a
            public final void a(MusicModel musicModel, boolean z) {
                this.f140435a.a(com.ss.android.ugc.aweme.tools.music.f.b.a(musicModel), z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final com.ss.android.ugc.aweme.shortvideo.c b(MusicModel musicModel) {
        return com.ss.android.ugc.aweme.tools.music.f.b.a(musicModel);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final aa.g a(com.ss.android.ugc.aweme.cz.a.f fVar) {
        com.ss.android.ugc.aweme.tools.music.b.b.f140410c.f140413b = fVar;
        return new g(fVar);
    }

    @Override // com.ss.android.ugc.aweme.port.in.p
    public final String b(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        l.d(cVar, "");
        String a2 = MusicService.m().a(b.a.a(cVar));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final com.ss.android.ugc.aweme.shortvideo.c c(String str) {
        MusicModel musicModel;
        l.d(str, "");
        Music a2 = MusicService.m().a(str);
        if (a2 != null) {
            musicModel = a2.convertToMusicModel();
        } else {
            musicModel = null;
        }
        return com.ss.android.ugc.aweme.tools.music.f.b.a(musicModel);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int[] iArr = new int[10];
        if (str == null) {
            l.b();
        }
        int audioFileInfo = VEUtils.getAudioFileInfo(str, iArr);
        if (audioFileInfo == 0) {
            return iArr[3];
        }
        com.ss.android.ugc.aweme.framework.a.a.a("MusicUtil#getMusicDuration#VEUtils.getAudioFileInfo(path, audioInfo) ret is ".concat(String.valueOf(audioFileInfo)));
        return fa.b(str);
    }

    @Override // com.ss.android.ugc.aweme.port.in.p
    public final String c(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        l.d(cVar, "");
        String b2 = MusicService.m().b(b.a.a(cVar));
        l.b(b2, "");
        return b2;
    }

    static final class a extends m implements h.f.a.b<Fragment, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.cz.a.c $requestBean;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(91732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, int i2, com.ss.android.ugc.aweme.cz.a.c cVar2) {
            super(1);
            this.this$0 = cVar;
            this.$requestCode = i2;
            this.$requestBean = cVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Fragment fragment) {
            Fragment fragment2 = fragment;
            l.d(fragment2, "");
            as asVar = this.this$0.f140421b;
            int i2 = this.$requestCode;
            String str = this.$requestBean.f79311a;
            int i3 = this.$requestBean.f79312b;
            MusicModel musicModel = new MusicModel();
            musicModel.setMvThemeMusic(this.$requestBean.f79320j);
            asVar.a(fragment2, i2, str, i3, musicModel, this.$requestBean.f79313c, this.$requestBean.f79314d, this.$requestBean.f79315e, this.$requestBean.f79316f, this.$requestBean.f79317g, this.$requestBean.f79318h, this.$requestBean.f79319i, this.$requestBean.f79321k);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final AVChallenge a(Challenge challenge) {
        if (challenge != null) {
            return com.ss.android.ugc.aweme.tools.music.f.a.a(challenge);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final void d(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                String string = com.ss.android.ugc.aweme.tools.music.a.b.f140308a.getString("ai_music_setting", "");
                if (!TextUtils.isEmpty(string)) {
                    com.ss.android.ugc.aweme.tools.music.e.a.f140436a = (com.ss.android.ugc.aweme.tools.music.e.a) com.ss.android.ugc.aweme.tools.music.f.d.f140594a.a(string, com.ss.android.ugc.aweme.tools.music.e.a.class);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            com.ss.android.ugc.aweme.tools.music.a.a.g();
            return;
        }
        try {
            com.ss.android.ugc.aweme.tools.music.e.a.f140436a = (com.ss.android.ugc.aweme.tools.music.e.a) com.ss.android.ugc.aweme.tools.music.f.d.f140594a.a(str, com.ss.android.ugc.aweme.tools.music.e.a.class);
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.tools.music.a.b.f140308a.edit();
            edit.putString("ai_music_setting", str);
            edit.commit();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        com.ss.android.ugc.aweme.tools.music.a.a.g();
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final com.ss.android.ugc.aweme.shortvideo.c a(Object obj) {
        com.ss.android.ugc.aweme.shortvideo.c a2 = this.f140421b.a(obj);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final com.ss.android.ugc.aweme.shortvideo.d a(Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        if (serializable instanceof MusicWaveBean) {
            com.ss.android.ugc.aweme.shortvideo.d dVar = new com.ss.android.ugc.aweme.shortvideo.d();
            dVar.setMusicWavePointArray(((MusicWaveBean) serializable).getMusicWavePointArray());
            return dVar;
        } else if (serializable instanceof com.ss.android.ugc.aweme.shortvideo.d) {
            return (com.ss.android.ugc.aweme.shortvideo.d) serializable;
        } else {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.p
    public final MusicModel a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        if (cVar == null) {
            return null;
        }
        return b.a.a(cVar);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final Object a(com.ss.android.ugc.aweme.shortvideo.d dVar) {
        if (dVar == null) {
            return null;
        }
        MusicWaveBean musicWaveBean = new MusicWaveBean();
        musicWaveBean.setMusicWavePointArray(dVar.getMusicWavePointArray());
        return musicWaveBean;
    }

    public static final class f implements a.AbstractC3709a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f140431a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f140432b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f140433c;

        static {
            Covode.recordClassIndex(91737);
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.ss.android.ugc.aweme.tools.music.c.a.AbstractC3709a
        public final void a(int i2, Intent intent) {
            Boolean bool;
            String str;
            Serializable serializable;
            String str2;
            com.ss.android.ugc.aweme.shortvideo.c a2;
            if (i2 == -1) {
                MusicModel musicModel = null;
                if (intent != null) {
                    bool = Boolean.valueOf(intent.getBooleanExtra("is_cancel_current_choose_music", false));
                    str = a(intent, "path");
                    serializable = intent.getSerializableExtra("music_model");
                } else {
                    bool = null;
                    str = null;
                    serializable = null;
                }
                MusicModel musicModel2 = (MusicModel) serializable;
                if (intent != null) {
                    str2 = a(intent, "music_origin");
                } else {
                    str2 = null;
                }
                if (musicModel2 != null) {
                    int b2 = this.f140431a.b(str);
                    if (musicModel2.getMusicType() == MusicModel.MusicType.LOCAL) {
                        musicModel2.setLocalPath(str);
                        Music convertToMusic = musicModel2.convertToMusic();
                        UrlModel urlModel = new UrlModel();
                        urlModel.setUri(str);
                        ArrayList arrayList = new ArrayList();
                        if (str != null) {
                            arrayList.add(str);
                        }
                        urlModel.setUrlList(arrayList);
                        if (convertToMusic != null) {
                            convertToMusic.setPlayUrl(urlModel);
                            musicModel = convertToMusic.convertToMusicModel();
                        }
                        a2 = com.ss.android.ugc.aweme.tools.music.f.b.a(musicModel);
                    } else {
                        a2 = com.ss.android.ugc.aweme.tools.music.f.b.a(musicModel2);
                    }
                    if (a2 != null) {
                        a2.duration = b2;
                    }
                    h.f.a.b bVar = this.f140432b;
                    if (bVar != null) {
                        bVar.invoke(d.a.a(bool, str2, a2, str));
                        return;
                    }
                    return;
                }
                h.f.a.b bVar2 = this.f140432b;
                if (bVar2 != null) {
                    bVar2.invoke(d.a.a(bool, str2, null, str));
                    return;
                }
                return;
            }
            h.f.a.a aVar = this.f140433c;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        f(c cVar, h.f.a.b bVar, h.f.a.a aVar) {
            this.f140431a = cVar;
            this.f140432b = bVar;
            this.f140433c = aVar;
        }
    }

    public final a.AbstractC3709a a(h.f.a.b<? super com.ss.android.ugc.aweme.cz.a.d, z> bVar, h.f.a.a<z> aVar) {
        return new f(this, bVar, aVar);
    }

    static final class b extends m implements h.f.a.m<Integer, Intent, z> {
        final /* synthetic */ h.f.a.a $failCallback;
        final /* synthetic */ h.f.a.b $successCallback;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(91733);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, h.f.a.b bVar, h.f.a.a aVar) {
            super(2);
            this.this$0 = cVar;
            this.$successCallback = bVar;
            this.$failCallback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, Intent intent) {
            this.this$0.a(this.$successCallback, this.$failCallback).a(num.intValue(), intent);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final aa.h a(List<com.ss.android.ugc.aweme.shortvideo.c> list, j jVar) {
        l.d(jVar, "");
        if (k.a(list)) {
            return new com.ss.android.ugc.aweme.tools.music.e.e(new ArrayList(), jVar);
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            l.b();
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b.a.a((com.ss.android.ugc.aweme.shortvideo.c) it.next()));
        }
        return new com.ss.android.ugc.aweme.tools.music.e.e(arrayList, jVar);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa
    public final aa.d a(androidx.appcompat.app.d dVar, com.ss.android.ugc.asve.editor.g gVar, com.ss.android.ugc.aweme.cz.a.a aVar, boolean z, int i2, h.f.a.a<String> aVar2) {
        l.d(dVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        return new com.ss.android.ugc.aweme.tools.music.b.a(dVar, gVar, aVar, z, i2, aVar2);
    }
}
