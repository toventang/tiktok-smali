package com.ss.android.ugc.aweme.favorites.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCategory;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.m;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.m.p;
import h.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class k extends com.ss.android.ugc.aweme.base.f.a implements com.ss.android.ugc.aweme.common.e.c<Music>, com.ss.android.ugc.aweme.common.e.d<Music>, j, m, org.greenrobot.eventbus.i, j {

    /* renamed from: a  reason: collision with root package name */
    public MusicDownloadPlayHelper f90896a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.common.e.b<com.ss.android.ugc.aweme.common.e.a<Music, CollectedMusicList>> f90897b = new com.ss.android.ugc.aweme.common.e.b<>();

    /* renamed from: c  reason: collision with root package name */
    MusicModel f90898c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f90899d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f90900e;

    /* renamed from: j  reason: collision with root package name */
    private long f90901j = -1;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f90902k;

    static {
        Covode.recordClassIndex(57137);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(MusicModel musicModel, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(MusicModel musicModel, Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public final void a(List<Music> list, int i2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.common.e.i] */
    @Override // com.ss.android.ugc.aweme.common.e.d
    public final boolean a(com.ss.android.ugc.aweme.common.e.i<Music> iVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.d
    public final void b(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<Music> list, boolean z) {
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new org.greenrobot.eventbus.g(k.class, "onAntiCrawlerEvent", com.ss.android.ugc.aweme.base.d.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(52, new org.greenrobot.eventbus.g(k.class, "onMusicCollectEvent", com.ss.android.ugc.aweme.music.f.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void r() {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final MusicModel h() {
        return this.f90898c;
    }

    /* access modifiers changed from: package-private */
    public final void a(Map<String, ? extends Object> map) {
        com.bytedance.lynx.hybrid.a.h kitView;
        this.f90899d = true;
        com.bytedance.hybrid.spark.page.c l2 = l();
        if (l2 != null && (kitView = l2.getKitView()) != null) {
            kitView.updateData(map);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final boolean bN_() {
        return ab_();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final Activity i() {
        return getActivity();
    }

    private final com.bytedance.hybrid.spark.page.c l() {
        View view = getView();
        if (!(view instanceof com.bytedance.hybrid.spark.page.c)) {
            view = null;
        }
        return (com.bytedance.hybrid.spark.page.c) view;
    }

    private static boolean m() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void d() {
        this.f90898c = null;
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f90896a;
        if (musicDownloadPlayHelper == null) {
            l.a("musicDownloadPlayHelper");
        }
        musicDownloadPlayHelper.ao_();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        d(new ArrayList(), false);
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        com.bytedance.lynx.hybrid.a.h kitView;
        com.bytedance.hybrid.spark.page.c l2 = l();
        if (l2 != null && (kitView = l2.getKitView()) != null) {
            kitView.a("onPageJumped", z.INSTANCE);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        d();
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f90896a;
        if (musicDownloadPlayHelper == null) {
            l.a("musicDownloadPlayHelper");
        }
        musicDownloadPlayHelper.d();
        SparseArray sparseArray = this.f90902k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static boolean a() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean m2 = m();
        com.ss.android.ugc.aweme.lancet.j.f107229h = m2;
        return m2;
    }

    @Override // com.ss.android.ugc.aweme.favorites.ui.j
    public final void c() {
        com.ss.android.ugc.aweme.common.e.a aVar;
        List items;
        if (!this.f90899d || !((aVar = (com.ss.android.ugc.aweme.common.e.a) this.f90897b.f76396h) == null || (items = aVar.getItems()) == null || !items.isEmpty())) {
            if (!this.f90900e) {
                this.f90901j = System.currentTimeMillis();
            }
            this.f90897b.a(1);
        }
    }

    public static final class a implements bb.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f90903a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f90904b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Music f90905c;

        static {
            Covode.recordClassIndex(57138);
        }

        @Override // com.ss.android.ugc.aweme.port.in.bb.a
        public final void onSuccess() {
            boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
            if (this.f90903a.getActivity() == null || !MSAdaptionService.c().b((Context) this.f90903a.getActivity())) {
                k.a(this.f90903a).f111801k = "music_collection";
                k.a(this.f90903a).f111803m = this.f90904b;
                k.a(this.f90903a).f111802l = new MusicCategory("favorite_song", null, 2, null);
                k.a(this.f90903a).a(this.f90905c.convertToMusicModel(), 7, true, false, downloadEffectOrMusicAfterEnterCamera);
                return;
            }
            androidx.fragment.app.e activity = this.f90903a.getActivity();
            androidx.fragment.app.e activity2 = this.f90903a.getActivity();
            if (activity2 == null) {
                l.b();
            }
            Toast makeText = Toast.makeText(activity, activity2.getString(R.string.bey), 0);
            if (Build.VERSION.SDK_INT == 25) {
                ic.a(makeText);
            }
            makeText.show();
        }

        a(k kVar, int i2, Music music) {
            this.f90903a = kVar;
            this.f90904b = i2;
            this.f90905c = music;
        }
    }

    public static final class b extends com.bytedance.hybrid.spark.a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f90906a;

        static {
            Covode.recordClassIndex(57139);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(k kVar) {
            this.f90906a = kVar;
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void a(com.bytedance.lynx.hybrid.a.h hVar) {
            l.d(hVar, "");
            super.a(hVar);
            k kVar = this.f90906a;
            com.bytedance.lynx.hybrid.b.a.a aVar = new com.bytedance.lynx.hybrid.b.a.a();
            aVar.a("loadMore");
            aVar.f40885d = new e(kVar);
            com.bytedance.lynx.hybrid.b.a.a aVar2 = new com.bytedance.lynx.hybrid.b.a.a();
            aVar2.a("jumpToMusicDetail");
            aVar2.f40885d = new f(kVar);
            com.bytedance.lynx.hybrid.b.a.a aVar3 = new com.bytedance.lynx.hybrid.b.a.a();
            aVar3.a("play");
            aVar3.f40885d = new g(kVar);
            com.bytedance.lynx.hybrid.b.a.a aVar4 = new com.bytedance.lynx.hybrid.b.a.a();
            aVar4.a("pause");
            aVar4.f40885d = new h(kVar);
            com.bytedance.lynx.hybrid.b.a.a aVar5 = new com.bytedance.lynx.hybrid.b.a.a();
            aVar5.a("handleCreate");
            aVar5.f40885d = new i(kVar);
            com.bytedance.lynx.hybrid.b.b bVar = (com.bytedance.lynx.hybrid.b.b) hVar.getHybridContext().a(com.bytedance.lynx.hybrid.b.b.class);
            if (bVar != null) {
                bVar.a(aVar);
                bVar.a(aVar2);
                bVar.a(aVar3);
                bVar.a(aVar4);
                bVar.a(aVar5);
            }
            com.bytedance.ies.watcher.c.b("discovery_favorite_sounds_lynx_load");
            k kVar2 = this.f90906a;
            com.ss.android.ugc.aweme.common.e.a aVar6 = (com.ss.android.ugc.aweme.common.e.a) kVar2.f90897b.f76396h;
            l.b(aVar6, "");
            List items = aVar6.getItems();
            l.b(items, "");
            kVar2.a(ag.a(v.a("isRTL", Boolean.valueOf(gb.a())), v.a("data", k.a(items))));
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void b(com.bytedance.lynx.hybrid.a.h hVar, String str) {
            l.d(hVar, "");
            l.d(str, "");
            com.bytedance.ies.watcher.c.a("discovery_favorite_sounds_lynx_load", -1);
        }
    }

    public static final class e extends com.bytedance.lynx.hybrid.b.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f90913a;

        static {
            Covode.recordClassIndex(57142);
        }

        @Override // com.bytedance.lynx.hybrid.b.a.b
        public final void a() {
        }

        e(k kVar) {
            this.f90913a = kVar;
        }

        @Override // com.bytedance.lynx.hybrid.b.a.b
        public final void a(String str, String str2, com.bytedance.lynx.hybrid.b.a.c cVar) {
            l.d(str, "");
            l.d(str2, "");
            l.d(cVar, "");
            if (!this.f90913a.f90897b.j()) {
                com.ss.android.ugc.aweme.common.e.a aVar = (com.ss.android.ugc.aweme.common.e.a) this.f90913a.f90897b.f76396h;
                l.b(aVar, "");
                if (aVar.isHasMore()) {
                    this.f90913a.f90897b.a(4);
                }
            }
        }
    }

    public static final class f extends com.bytedance.lynx.hybrid.b.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f90914a;

        static {
            Covode.recordClassIndex(57143);
        }

        @Override // com.bytedance.lynx.hybrid.b.a.b
        public final void a() {
        }

        f(k kVar) {
            this.f90914a = kVar;
        }

        @Override // com.bytedance.lynx.hybrid.b.a.b
        public final void a(String str, String str2, com.bytedance.lynx.hybrid.b.a.c cVar) {
            Object obj;
            Context context;
            l.d(str, "");
            l.d(str2, "");
            l.d(cVar, "");
            String string = new JSONObject(str2).getString("mid");
            com.ss.android.ugc.aweme.common.e.a aVar = (com.ss.android.ugc.aweme.common.e.a) this.f90914a.f90897b.f76396h;
            l.b(aVar, "");
            List items = aVar.getItems();
            l.b(items, "");
            Iterator it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Music music = (Music) obj;
                l.b(music, "");
                if (l.a((Object) music.getMid(), (Object) string)) {
                    break;
                }
            }
            Music music2 = (Music) obj;
            if (music2 != null) {
                k kVar = this.f90914a;
                View view = kVar.getView();
                if (!(view == null || (context = view.getContext()) == null)) {
                    com.ss.android.ugc.aweme.favorites.i.b.a(context, kVar.getView(), music2, "collection_music", "", com.ss.android.ugc.aweme.music.k.d.a(music2.convertToMusicModel(), context, true));
                    kVar.d();
                    kVar.k();
                }
                k.a(music2);
            }
        }
    }

    public static final class g extends com.bytedance.lynx.hybrid.b.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f90915a;

        static {
            Covode.recordClassIndex(57144);
        }

        @Override // com.bytedance.lynx.hybrid.b.a.b
        public final void a() {
        }

        g(k kVar) {
            this.f90915a = kVar;
        }

        @Override // com.bytedance.lynx.hybrid.b.a.b
        public final void a(String str, String str2, com.bytedance.lynx.hybrid.b.a.c cVar) {
            Object obj;
            Context context;
            l.d(str, "");
            l.d(str2, "");
            l.d(cVar, "");
            String string = new JSONObject(str2).getString("mid");
            com.ss.android.ugc.aweme.common.e.a aVar = (com.ss.android.ugc.aweme.common.e.a) this.f90915a.f90897b.f76396h;
            l.b(aVar, "");
            List items = aVar.getItems();
            l.b(items, "");
            Iterator it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Music music = (Music) obj;
                l.b(music, "");
                if (l.a((Object) music.getMid(), (Object) string)) {
                    break;
                }
            }
            Music music2 = (Music) obj;
            if (music2 != null) {
                k kVar = this.f90915a;
                View view = kVar.getView();
                if (!(view == null || (context = view.getContext()) == null)) {
                    if (!k.a()) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.de8).a();
                    } else {
                        kVar.d();
                        MusicModel convertToMusicModel = music2.convertToMusicModel();
                        if (com.ss.android.ugc.aweme.music.k.d.a(convertToMusicModel, context, true)) {
                            kVar.f90898c = convertToMusicModel;
                            MusicDownloadPlayHelper musicDownloadPlayHelper = kVar.f90896a;
                            if (musicDownloadPlayHelper == null) {
                                l.a("musicDownloadPlayHelper");
                            }
                            musicDownloadPlayHelper.a(music2.convertToMusicModel(), 1, false);
                        }
                    }
                }
                k.a(music2);
            }
        }
    }

    public static final class h extends com.bytedance.lynx.hybrid.b.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f90916a;

        static {
            Covode.recordClassIndex(57145);
        }

        @Override // com.bytedance.lynx.hybrid.b.a.b
        public final void a() {
        }

        h(k kVar) {
            this.f90916a = kVar;
        }

        @Override // com.bytedance.lynx.hybrid.b.a.b
        public final void a(String str, String str2, com.bytedance.lynx.hybrid.b.a.c cVar) {
            Object obj;
            l.d(str, "");
            l.d(str2, "");
            l.d(cVar, "");
            String string = new JSONObject(str2).getString("mid");
            com.ss.android.ugc.aweme.common.e.a aVar = (com.ss.android.ugc.aweme.common.e.a) this.f90916a.f90897b.f76396h;
            l.b(aVar, "");
            List items = aVar.getItems();
            l.b(items, "");
            Iterator it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Music music = (Music) obj;
                l.b(music, "");
                if (l.a((Object) music.getMid(), (Object) string)) {
                    break;
                }
            }
            Music music2 = (Music) obj;
            if (music2 != null) {
                this.f90916a.d();
                k.a(music2);
            }
        }
    }

    public static final class i extends com.bytedance.lynx.hybrid.b.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f90917a;

        static {
            Covode.recordClassIndex(57146);
        }

        @Override // com.bytedance.lynx.hybrid.b.a.b
        public final void a() {
        }

        i(k kVar) {
            this.f90917a = kVar;
        }

        @Override // com.bytedance.lynx.hybrid.b.a.b
        public final void a(String str, String str2, com.bytedance.lynx.hybrid.b.a.c cVar) {
            Object obj;
            Context context;
            l.d(str, "");
            l.d(str2, "");
            l.d(cVar, "");
            String string = new JSONObject(str2).getString("mid");
            com.ss.android.ugc.aweme.common.e.a aVar = (com.ss.android.ugc.aweme.common.e.a) this.f90917a.f90897b.f76396h;
            l.b(aVar, "");
            List items = aVar.getItems();
            l.b(items, "");
            Iterator it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Music music = (Music) obj;
                l.b(music, "");
                if (l.a((Object) music.getMid(), (Object) string)) {
                    break;
                }
            }
            Music music2 = (Music) obj;
            if (music2 != null) {
                com.ss.android.ugc.aweme.common.e.a aVar2 = (com.ss.android.ugc.aweme.common.e.a) this.f90917a.f90897b.f76396h;
                l.b(aVar2, "");
                int indexOf = aVar2.getItems().indexOf(music2);
                k kVar = this.f90917a;
                View view = kVar.getView();
                if (!(view == null || (context = view.getContext()) == null)) {
                    if (!k.a()) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.de8).a();
                    } else if (MusicService.m().a(kVar.f90898c, context, true)) {
                        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                        if (j2 == null || j2.isFinishing()) {
                            com.bytedance.ies.ugc.appcontext.d.a();
                        }
                        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                        l.b(createIAVServiceProxybyMonsterPlugin, "");
                        createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService().a(new a(kVar, indexOf, music2));
                    }
                }
                k.a(music2);
            }
        }
    }

    public static final /* synthetic */ MusicDownloadPlayHelper a(k kVar) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = kVar.f90896a;
        if (musicDownloadPlayHelper == null) {
            l.a("musicDownloadPlayHelper");
        }
        return musicDownloadPlayHelper;
    }

    public static void a(Music music) {
        com.ss.android.ugc.aweme.favorites.i.a.a(music.getMid(), "collection_music", "");
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z && !isDetached() && ab_()) {
            d();
            k();
        }
    }

    @r
    public final void onAntiCrawlerEvent(com.ss.android.ugc.aweme.base.d.a aVar) {
        l.d(aVar, "");
        String str = aVar.f68097a;
        if (str != null && p.a((CharSequence) str, (CharSequence) "/aweme/v1/user/music/collect/?", false)) {
            EventBus.a().d(aVar);
            if (!this.f90900e) {
                this.f90901j = System.currentTimeMillis();
            }
            this.f90897b.a(1);
        }
    }

    @r
    public final void onMusicCollectEvent(com.ss.android.ugc.aweme.music.f.b bVar) {
        l.d(bVar, "");
        if (ab_()) {
            if (!this.f90900e) {
                this.f90901j = System.currentTimeMillis();
            }
            this.f90897b.a(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void c(MusicModel musicModel) {
        l.d(musicModel, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            String uuid = UUID.randomUUID().toString();
            l.b(uuid, "");
            AVExternalServiceImpl.a().asyncService("MusicCollect", new d(activity, new RecordConfig.Builder().creationId(uuid).shootWay("collection_music").recordPresetResource(new RecordPresetResource(null, null, musicModel.getMusicId(), musicModel)).build(), musicModel));
            k();
            com.ss.android.ugc.aweme.common.r.a("shoot", new com.ss.android.ugc.aweme.app.f.d().a("creation_id", uuid).a("enter_from", "personal_homepage").a("content_source", "shoot").a("shoot_way", "collection_music").a("music_id", musicModel.getMusicId()).a("group_id", dv.a()).f66730a);
        }
    }

    static List<Map<String, Object>> a(List<Music> list) {
        Object obj;
        String a2;
        boolean z;
        ExternalMusicInfo externalMusicInfo;
        String partnerName;
        UrlModel coverThumb;
        List<String> urlList;
        List<String> urlList2;
        List<String> urlList3;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            h.p[] pVarArr = new h.p[8];
            boolean z2 = false;
            pVarArr[0] = v.a("mid", t.getMid());
            UrlModel coverMedium = t.getCoverMedium();
            String str = null;
            if ((coverMedium == null || (urlList3 = coverMedium.getUrlList()) == null || (obj = n.b((List) urlList3, 0)) == null) && ((coverThumb = t.getCoverThumb()) == null || (urlList2 = coverThumb.getUrlList()) == null || (obj = n.b((List) urlList2, 0)) == null)) {
                UrlModel coverLarge = t.getCoverLarge();
                if (!(coverLarge == null || (urlList = coverLarge.getUrlList()) == null)) {
                    str = n.b((List) urlList, 0);
                }
            } else {
                str = obj;
            }
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            pVarArr[1] = v.a("coverUrl", str);
            pVarArr[2] = v.a("musicName", t.getMusicName());
            pVarArr[3] = v.a("musicAuthor", t.getAuthorName());
            if (com.bytedance.ies.abmock.b.a().a(true, "remove_15s_cap_music", true)) {
                a2 = com.ss.android.ugc.aweme.music.k.d.a(t.getPresenterDuration() * 1000);
            } else {
                a2 = com.ss.android.ugc.aweme.music.k.d.a(t.getDuration() * 1000);
            }
            pVarArr[4] = v.a("musicLen", a2);
            String musicName = t.getMusicName();
            l.b(musicName, str2);
            if (musicName.length() <= 0 || (!t.isOriginMusic() && !t.isArtistMusic())) {
                z = false;
            } else {
                z = true;
            }
            pVarArr[5] = v.a("isOriginal", Boolean.valueOf(z));
            List<ExternalMusicInfo> externalMusicInfos = t.getExternalMusicInfos();
            if (!(externalMusicInfos == null || (externalMusicInfo = (ExternalMusicInfo) n.h((List) externalMusicInfos)) == null || (partnerName = externalMusicInfo.getPartnerName()) == null)) {
                str2 = partnerName;
            }
            pVarArr[6] = v.a("partnerTag", str2);
            if (t.getMatchedPGCSoundInfo() != null) {
                z2 = true;
            }
            pVarArr[7] = v.a("isUgcToPgcMeta", Boolean.valueOf(z2));
            arrayList.add(ag.a(pVarArr));
        }
        return arrayList;
    }

    public static final class c extends SimpleServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f90907a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecordConfig f90908b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MusicModel f90909c;

        static {
            Covode.recordClassIndex(57140);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f90907a, this.f90908b, this.f90909c, true);
        }

        c(androidx.fragment.app.e eVar, RecordConfig recordConfig, MusicModel musicModel) {
            this.f90907a = eVar;
            this.f90908b = recordConfig;
            this.f90909c = musicModel;
        }
    }

    public static final class d extends SimpleServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f90910a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecordConfig f90911b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MusicModel f90912c;

        static {
            Covode.recordClassIndex(57141);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f90910a, this.f90911b, this.f90912c, true);
        }

        d(Activity activity, RecordConfig recordConfig, MusicModel musicModel) {
            this.f90910a = activity;
            this.f90911b = recordConfig;
            this.f90912c = musicModel;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<Music> list, boolean z) {
        if (list != null) {
            d(list, z);
        }
    }

    private final void d(List<Music> list, boolean z) {
        a(ag.a(v.a("data", a(list)), v.a("hasMore", Boolean.valueOf(z))));
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<Music> list, boolean z) {
        com.bytedance.lynx.hybrid.a.h kitView;
        l.d(list, "");
        if (!this.f90900e) {
            com.bytedance.ies.watcher.c.a("discovery_favorite_sounds_lynx_render");
            d(list, z);
            com.bytedance.ies.watcher.c.b("discovery_favorite_sounds_lynx_render");
            if (this.f90901j != -1) {
                com.bytedance.ies.watcher.c.a("discovery_favorite_sounds_lynx_first_list_screen", System.currentTimeMillis() - this.f90901j);
            }
            com.bytedance.hybrid.spark.page.c l2 = l();
            View view = null;
            if (!(l2 == null || (kitView = l2.getKitView()) == null)) {
                view = kitView.a();
            }
            if (view instanceof ViewGroup) {
                loop0:
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i2 = 0;
                    int childCount = viewGroup.getChildCount();
                    while (true) {
                        if (i2 >= childCount) {
                            break loop0;
                        } else if (viewGroup.getChildAt(i2) instanceof RecyclerView) {
                            View childAt = viewGroup.getChildAt(i2);
                            Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                            RecyclerView recyclerView = (RecyclerView) childAt;
                            if (recyclerView != null) {
                                da.a.a("discovery_favorite_sounds_lynx_list_fps").a(recyclerView);
                            }
                        } else if (viewGroup.getChildAt(i2) instanceof ViewGroup) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    view = viewGroup.getChildAt(i2);
                    Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            this.f90900e = true;
            return;
        }
        d(list, z);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        this.f90896a = new MusicDownloadPlayHelper(this);
        this.f90897b.a_(this);
        this.f90897b.a((com.ss.android.ugc.aweme.common.b) new com.ss.android.ugc.aweme.music.presenter.k());
        SparkContext sparkContext = new SparkContext();
        sparkContext.a("aweme://lynxview/?hide_nav_bar=1&channel=discovery_favorite_music_collection&bundle=pages%2Fmusic_collection%2Ftemplate.js&dynamic=1&group=discovery_favorite_music_collection&surl=https%3A%2F%2Flf77-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F10%2Fgecko%2Fresource%2Fdiscovery_favorite_music_collection%2Fpages%2Fmusic_collection%2Ftemplate.js");
        sparkContext.a(new b(this));
        Context context = getContext();
        if (context == null) {
            l.b();
        }
        l.b(context, "");
        com.bytedance.hybrid.spark.page.c b2 = c.a.a(context, sparkContext).b();
        b2.a(sparkContext);
        com.bytedance.ies.watcher.c.a("discovery_favorite_sounds_lynx_load");
        b2.c();
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(String str, MusicModel musicModel, String str2) {
        l.d(str, "");
        l.d(musicModel, "");
        l.d(str2, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            String uuid = UUID.randomUUID().toString();
            l.b(uuid, "");
            AVExternalServiceImpl.a().asyncService("MusicCollect", new c(activity, new RecordConfig.Builder().creationId(uuid).shootWay("collection_music").musicPath(str).musicOrigin(str2).build(), musicModel));
            k();
            com.ss.android.ugc.aweme.common.r.a("shoot", new com.ss.android.ugc.aweme.app.f.d().a("creation_id", uuid).a("enter_from", "personal_homepage").a("content_source", "shoot").a("shoot_way", "collection_music").a("music_id", musicModel.getMusicId()).a("group_id", dv.a()).f66730a);
        }
    }
}
