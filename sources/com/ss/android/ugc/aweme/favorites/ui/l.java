package com.ss.android.ugc.aweme.favorites.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.d.a;
import com.ss.android.ugc.aweme.favorites.a.c;
import com.ss.android.ugc.aweme.favorites.g.f;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.music.f.b;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCategory;
import com.ss.android.ugc.aweme.music.presenter.k;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.m;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class l extends a implements f, m, i, j {

    /* renamed from: k  reason: collision with root package name */
    private MusicDownloadPlayHelper f90918k;

    /* renamed from: l  reason: collision with root package name */
    private MusicModel f90919l;

    static {
        Covode.recordClassIndex(57147);
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

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new g(l.class, "onAntiCrawlerEvent", a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(52, new g(l.class, "onMusicCollectEvent", b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void r() {
    }

    @Override // com.ss.android.ugc.aweme.favorites.ui.a, com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        super.f();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final MusicModel h() {
        return this.f90919l;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final boolean bN_() {
        return ab_();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final Activity i() {
        return getActivity();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final com.ss.android.ugc.aweme.common.a.f n() {
        return new c(this);
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.f
    public final void a() {
        super.onPause();
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f90918k;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.ao_();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void l() {
        if (this.f90813j != null) {
            this.f90813j.a((com.ss.android.ugc.aweme.common.b) new k());
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.ui.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f90918k;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.ao_();
            this.f90918k.d();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f90918k;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.n = false;
        }
    }

    public final RecyclerView.a t() {
        if (this.f90810c == null) {
            return new c(this);
        }
        return this.f90810c;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void c() {
        if (this.f90813j != null) {
            com.bytedance.ies.watcher.c.a("discovery_favorite_sounds_native_first_list_screen");
            this.f90813j.a(1);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void k() {
        if (this.f90813j != null) {
            this.f90813j.a(4);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.f90918k;
        if (musicDownloadPlayHelper != null) {
            musicDownloadPlayHelper.ao_();
            this.f90918k.n = true;
        }
        if (this.f90810c != null) {
            ((c) this.f90810c).l();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void q() {
        com.bytedance.tux.c.a aVar = new com.bytedance.tux.c.a();
        aVar.f44749a = R.raw.icon_large_bookmark;
        aVar.f44753e = Integer.valueOf((int) R.attr.bd);
        this.f90809b.setStatus(new TuxStatusView.c().a(aVar).a(getString(R.string.bsw)).a((CharSequence) getString(R.string.bsu)));
        this.f90809b.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.favorites.ui.a
    public final void a(View view) {
        super.a(view);
        da.a.a("discovery_favorite_sounds_native_list_fps").a(this.f90808a);
    }

    @r
    public void onAntiCrawlerEvent(a aVar) {
        String str = aVar.f68097a;
        if (str != null && str.contains("/aweme/v1/user/music/collect/?")) {
            EventBus.a().d(aVar);
            c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z && this.f90810c != null) {
            ((c) this.f90810c).l();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.f
    public final void a(MusicModel musicModel) {
        if (musicModel != null) {
            this.f90919l = musicModel;
            this.f90918k.a(musicModel, 1, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void c(final MusicModel musicModel) {
        final e activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            String uuid = UUID.randomUUID().toString();
            final RecordConfig.Builder shootWay = new RecordConfig.Builder().creationId(uuid).shootWay("collection_music");
            shootWay.recordPresetResource(new RecordPresetResource(null, null, musicModel.getMusicId(), musicModel));
            AVExternalServiceImpl.a().asyncService("MusicCollect", new SimpleServiceLoadCallback() {
                /* class com.ss.android.ugc.aweme.favorites.ui.l.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(57149);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    asyncAVService.uiService().recordService().startRecord(activity, shootWay.build(), musicModel, true);
                }
            });
            com.ss.android.ugc.aweme.common.r.a("shoot", new d().a("creation_id", uuid).a("enter_from", "personal_homepage").a("content_source", "shoot").a("shoot_way", "collection_music").a("music_id", musicModel.getMusicId()).a("group_id", dv.a()).f66730a);
        }
    }

    @r
    public void onMusicCollectEvent(b bVar) {
        if (ab_()) {
            List items = ((com.ss.android.ugc.aweme.common.e.a) this.f90813j.f76396h).getItems();
            MusicModel musicModel = bVar.f111484b;
            if (musicModel != null) {
                int size = items.size();
                Music music = musicModel.getMusic();
                if (music != null && music.getCollectStatus() != 1) {
                    if (!(this.f90813j == null || this.f90813j.f76396h == null || items.size() <= 0)) {
                        Iterator it = items.iterator();
                        while (it.hasNext()) {
                            Music music2 = (Music) it.next();
                            if (music2 != null && !TextUtils.isEmpty(music.getMid()) && music.getMid().equals(music2.getMid())) {
                                it.remove();
                            }
                        }
                    }
                    if (size != items.size()) {
                        this.f90810c.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.ui.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f90918k.b();
    }

    @Override // com.ss.android.ugc.aweme.favorites.ui.a, com.ss.android.ugc.aweme.common.e.c
    public final void a(List list, boolean z) {
        com.bytedance.ies.watcher.c.a("discovery_favorite_sounds_native_render");
        super.a(list, z);
        this.f90808a.post(n.f90929a);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.favorites.ui.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = new MusicDownloadPlayHelper(this);
        this.f90918k = musicDownloadPlayHelper;
        musicDownloadPlayHelper.f111798h = new m(this);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.f
    public final void a(MusicModel musicModel, int i2, boolean z) {
        if (getActivity() == null || !MSAdaptionService.c().b((Context) getActivity())) {
            MusicDownloadPlayHelper musicDownloadPlayHelper = this.f90918k;
            if (musicDownloadPlayHelper != null) {
                musicDownloadPlayHelper.f111801k = "music_collection";
                this.f90918k.f111803m = i2;
                this.f90918k.f111802l = new MusicCategory("favorite_song");
                this.f90918k.a(musicModel, 7, true, false, z);
                return;
            }
            return;
        }
        Toast makeText = Toast.makeText(getActivity(), getActivity().getString(R.string.bey), 0);
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(makeText);
        }
        makeText.show();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(String str, final MusicModel musicModel, String str2) {
        final e activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            String uuid = UUID.randomUUID().toString();
            final RecordConfig.Builder musicOrigin = new RecordConfig.Builder().creationId(uuid).shootWay("collection_music").musicPath(str).musicOrigin(str2);
            AVExternalServiceImpl.a().asyncService("MusicCollect", new SimpleServiceLoadCallback() {
                /* class com.ss.android.ugc.aweme.favorites.ui.l.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(57148);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    asyncAVService.uiService().recordService().startRecord(activity, musicOrigin.build(), musicModel, true);
                }
            });
            com.ss.android.ugc.aweme.common.r.a("shoot", new d().a("creation_id", uuid).a("enter_from", "personal_homepage").a("content_source", "shoot").a("shoot_way", "collection_music").a("music_id", musicModel.getMusicId()).a("group_id", dv.a()).f66730a);
        }
    }
}
