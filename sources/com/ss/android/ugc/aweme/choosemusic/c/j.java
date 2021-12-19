package com.ss.android.ugc.aweme.choosemusic.c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.ss.android.ugc.aweme.choosemusic.h.c.a;
import com.ss.android.ugc.aweme.choosemusic.h.d.c;
import com.ss.android.ugc.aweme.choosemusic.model.ak;
import com.ss.android.ugc.aweme.choosemusic.model.an;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.choosemusic.view.ab;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.music.presenter.d;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.m;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;

public abstract class j extends com.ss.android.ugc.aweme.base.f.a implements com.ss.android.ugc.aweme.choosemusic.d.b, a.AbstractC1595a, h.a, k<com.ss.android.ugc.aweme.choosemusic.b.c>, d, m, i, org.greenrobot.eventbus.j {
    private static final String y = j.class.getName();
    private String A;
    private int B;
    private com.ss.android.ugc.aweme.music.presenter.j C;
    private com.ss.android.ugc.aweme.choosemusic.a.h D;
    private ab E;
    private boolean F = true;
    private com.ss.android.ugc.aweme.choosemusic.h.d.c G = new com.ss.android.ugc.aweme.choosemusic.h.d.c();

    /* renamed from: a  reason: collision with root package name */
    com.ss.android.ugc.aweme.choosemusic.h.c.b f70478a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f70479b;

    /* renamed from: c  reason: collision with root package name */
    TuxStatusView f70480c;

    /* renamed from: d  reason: collision with root package name */
    View f70481d;

    /* renamed from: e  reason: collision with root package name */
    boolean f70482e;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.choosemusic.a.b f70483j;

    /* renamed from: k  reason: collision with root package name */
    com.ss.android.ugc.aweme.choosemusic.h.a.a f70484k;

    /* renamed from: l  reason: collision with root package name */
    MusicSearchStateViewModel f70485l;

    /* renamed from: m  reason: collision with root package name */
    protected ChooseMusicDownloadPlayHelper f70486m;
    public b n;
    public int o;
    protected List<MusicModel> p = new ArrayList();
    String q;
    String r;
    boolean s = false;
    public c t;
    public MusicModel u;
    public a v;
    public View.OnClickListener w;
    private String z = "popular_song";

    public interface a {
        static {
            Covode.recordClassIndex(43460);
        }

        void a();
    }

    public interface b {
        static {
            Covode.recordClassIndex(43461);
        }

        void a(int i2, String str, MusicModel musicModel, String str2);
    }

    public interface c {
        static {
            Covode.recordClassIndex(43462);
        }

        void a();
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

    /* access modifiers changed from: protected */
    public abstract TuxStatusView.c b();

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void c(MusicModel musicModel) {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(227, new g(j.class, "onPauseSearchMusicEvent", com.ss.android.ugc.aweme.search.f.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(228, new g(j.class, "onMobMusicTypeEvent", com.ss.android.ugc.aweme.music.f.a.class, ThreadMode.POSTING, 0, true));
        hashMap.put(229, new g(j.class, "onShootSearchMusicEvent", com.ss.android.ugc.aweme.search.f.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(52, new g(j.class, "onMusicCollectEvent", com.ss.android.ugc.aweme.music.f.b.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void r() {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final MusicModel h() {
        return this.u;
    }

    public final void a(List<MusicModel> list, boolean z2) {
        com.ss.android.ugc.aweme.choosemusic.a.b bVar = this.f70483j;
        if (bVar != null && !z2) {
            bVar.a();
        }
        if (ab_() && this.f70483j != null) {
            ArrayList arrayList = new ArrayList(list.size());
            arrayList.addAll(list);
            if (z2) {
                this.f70483j.b(arrayList);
            } else {
                this.f70483j.b_(arrayList);
            }
            RecyclerView.a adapter = this.f70479b.getAdapter();
            com.ss.android.ugc.aweme.choosemusic.a.b bVar2 = this.f70483j;
            if (adapter != bVar2) {
                this.f70479b.setAdapter(bVar2);
            }
            this.p = arrayList;
            this.o = 2;
            if (com.bytedance.common.utility.h.a(arrayList)) {
                g();
            } else {
                d();
            }
            ab abVar = this.E;
            if (abVar != null) {
                abVar.f70786d = true;
            }
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

    @Override // com.ss.android.ugc.aweme.common.a.h.a
    /* renamed from: l */
    public final void s() {
        a aVar = this.v;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        ab abVar = this.E;
        if (abVar != null) {
            abVar.f70786d = false;
        }
    }

    public final void o() {
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f70486m;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.ao_();
        }
    }

    static {
        Covode.recordClassIndex(43458);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        return new Analysis().setLabelName("music_library_list");
    }

    public final void n() {
        com.ss.android.ugc.aweme.choosemusic.a.b bVar = this.f70483j;
        if (bVar != null) {
            bVar.a();
        }
        com.ss.android.ugc.aweme.search.h.f121133a.a();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        RecyclerView recyclerView = this.f70479b;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
    }

    private boolean t() {
        if (getActivity().getIntent() != null) {
            return getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
        }
        return false;
    }

    public final void d() {
        if (ab_()) {
            this.f70482e = false;
            this.f70480c.setVisibility(8);
            this.f70479b.setVisibility(0);
        }
    }

    public final void e() {
        if (ab_()) {
            this.f70482e = true;
            this.f70480c.setVisibility(0);
            this.f70480c.a();
            this.f70479b.setVisibility(4);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        o();
        this.f70486m.d();
        com.ss.android.ugc.aweme.choosemusic.h.c.b bVar = this.f70478a;
        if (bVar != null) {
            bVar.h();
            this.f70478a.cd_();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.search.h.f121133a.a(hashCode());
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f70486m;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.n = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void q() {
        an a2;
        com.ss.android.ugc.aweme.choosemusic.h.a.a aVar = this.f70484k;
        if (aVar != null && (a2 = aVar.a(this.q)) != null) {
            this.G.a(a2);
        }
    }

    public final void g() {
        if (ab_()) {
            r.a("music_search_feedback_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "video_shoot_page").f66730a);
            this.f70482e = false;
            this.f70480c.setVisibility(0);
            this.f70480c.setStatus(b());
            this.f70479b.setVisibility(4);
        }
    }

    public final void k() {
        if (ab_()) {
            this.f70482e = false;
            this.f70480c.setVisibility(0);
            this.f70480c.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new p(this)));
            this.f70479b.setVisibility(4);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.ss.android.ugc.aweme.choosemusic.a.b bVar = this.f70483j;
        if (bVar != null) {
            bVar.a();
        }
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f70486m;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.ao_();
            this.f70486m.n = true;
        }
        com.ss.android.ugc.aweme.music.k.c.a().pause();
        com.ss.android.ugc.aweme.search.h.f121133a.a();
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.h.c.a.AbstractC1595a
    public final void p() {
        if (ab_() && getContext() != null) {
            new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.de8).a();
        }
    }

    public final void c() {
        this.f70482e = false;
        this.f70480c.setVisibility(8);
        n();
        m();
        List<MusicSearchHistory> e2 = com.ss.android.ugc.aweme.choosemusic.e.c.g().e();
        if (e2.size() > 0) {
            this.f70479b.setVisibility(0);
            if (this.D == null) {
                this.D = new com.ss.android.ugc.aweme.choosemusic.a.h();
            }
            this.f70479b.setAdapter(this.D);
            this.D.a(e2);
            return;
        }
        this.f70479b.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void a() {
        com.ss.android.ugc.aweme.choosemusic.a.b bVar = new com.ss.android.ugc.aweme.choosemusic.a.b((k<com.ss.android.ugc.aweme.choosemusic.b.c>) this, true);
        this.f70483j = bVar;
        bVar.f70288i = this.B;
        this.f70479b.setVisibility(8);
        this.f70483j.d(true);
        this.f70483j.g(androidx.core.content.b.c(getContext(), R.color.c5));
        this.f70483j.p = "music_list";
        this.f70483j.f70284e = new com.ss.android.ugc.aweme.choosemusic.b("search_music", "", "", com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a);
        this.f70483j.f70280a = this;
        this.f70486m.b();
        this.f70486m.f111798h = new m(this);
        this.f70486m.b(this.B);
        getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.b(1);
        this.f70479b.setLayoutManager(wrapLinearLayoutManager);
        this.f70483j.a((h.a) this);
        ab abVar = new ab(new n(this), 10);
        this.E = abVar;
        abVar.f70786d = false;
        this.E.a(this.f70479b);
        com.ss.android.ugc.aweme.music.presenter.j jVar = new com.ss.android.ugc.aweme.music.presenter.j(getActivity());
        this.C = jVar;
        jVar.a_(this);
        this.f70481d.setOnClickListener(new o(this));
        c();
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.b
    public final void a(MusicModel musicModel) {
        o();
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.b
    public final void a(MusicDownloadPlayHelper.a aVar) {
        this.f70486m.f111798h = aVar;
    }

    @org.greenrobot.eventbus.r
    public void onPauseSearchMusicEvent(com.ss.android.ugc.aweme.search.f.a aVar) {
        com.ss.android.ugc.aweme.choosemusic.a.b bVar = this.f70483j;
        if (bVar != null) {
            bVar.a();
        }
    }

    @org.greenrobot.eventbus.r
    public void onShootSearchMusicEvent(com.ss.android.ugc.aweme.search.f.b bVar) {
        b(bVar.f121119a.convertToMusicModel());
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.b
    public final void b(MusicModel musicModel) {
        this.f70486m.f111801k = this.z;
        this.f70486m.a(musicModel, this.o, true, t());
    }

    @org.greenrobot.eventbus.r(b = true)
    public void onMobMusicTypeEvent(com.ss.android.ugc.aweme.music.f.a aVar) {
        String str = aVar.f111477a;
        if (str == null) {
            this.z = this.A;
        } else if (this.A == null) {
            this.z = str;
            this.A = str;
        } else {
            this.A = this.z;
            this.z = str;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MusicSearchStateViewModel musicSearchStateViewModel = (MusicSearchStateViewModel) ae.a(getActivity(), (ad.b) null).a(MusicSearchStateViewModel.class);
        this.f70485l = musicSearchStateViewModel;
        musicSearchStateViewModel.a().observe(this, new k(this));
        this.f70485l.b().observe(this, new l(this));
    }

    @org.greenrobot.eventbus.r(b = true)
    public void onMusicCollectEvent(com.ss.android.ugc.aweme.music.f.b bVar) {
        MusicModel a2;
        MusicModel.CollectionType collectionType;
        MusicModel musicModel = bVar.f111484b;
        if (musicModel != null && !com.bytedance.common.utility.collection.b.a((Collection) this.p) && (a2 = com.ss.android.ugc.aweme.choosemusic.utils.c.a(this.p, musicModel.getMusicId())) != null) {
            if (bVar.f111483a == 1) {
                collectionType = MusicModel.CollectionType.COLLECTED;
            } else {
                collectionType = MusicModel.CollectionType.NOT_COLLECTED;
            }
            a2.setCollectionType(collectionType);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.presenter.d
    public final void a(Exception exc) {
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.h.c.a.AbstractC1595a
    public final void a(ak akVar) {
        com.ss.android.ugc.aweme.choosemusic.h.a.a aVar;
        String str;
        String str2;
        if (ab_() && akVar != null && this.f70485l.f() == 2) {
            if (!com.bytedance.common.utility.collection.b.a((Collection) akVar.f70634a)) {
                this.r = akVar.f70635b;
                r.a("search_sug", new com.ss.android.ugc.aweme.choosemusic.h.d.a().a("action_type", "show").a("sug_keyword", this.q).a("search_keyword", this.q).a("log_pb", ac.a.f91473a.a(this.r)).a("search_type", "video_music").a("creation_id", com.ss.android.ugc.aweme.choosemusic.utils.b.f70721d).f70563a);
                if (akVar.f70637d == null || TextUtils.isEmpty(akVar.f70637d.getInfo())) {
                    str = "{}";
                } else {
                    str = akVar.f70637d.getInfo();
                }
                if (akVar.f70636c == null || TextUtils.isEmpty(akVar.f70636c.getImprId())) {
                    str2 = "";
                } else {
                    str2 = akVar.f70636c.getImprId();
                }
                Map<String, String> map = new com.ss.android.ugc.aweme.choosemusic.h.d.a().a("raw_query", this.q).a("info", str).a("impr_id", str2).a("search_position", "video_music").f70563a;
                for (an anVar : akVar.f70634a) {
                    if (anVar != null) {
                        anVar.setExtraParam(map);
                    }
                }
                List<an> list = akVar.f70634a;
                if (com.ss.android.ugc.aweme.choosemusic.h.d.c.f70567d == null || com.ss.android.ugc.aweme.choosemusic.h.d.c.f70567d.equals("")) {
                    c.a.a(String.valueOf(System.currentTimeMillis()));
                }
                r.a("trending_show", new com.ss.android.ugc.aweme.choosemusic.h.d.a().a(map).a("words_num", list.size()).a("words_source", "sug").a("creation_id", com.ss.android.ugc.aweme.choosemusic.utils.b.f70721d).a("new_sug_session_id", com.ss.android.ugc.aweme.choosemusic.h.d.c.f70567d).f70563a);
                this.G.f70569a = this.q;
                this.G.f70570b = akVar.f70636c;
                this.G.f70571c = akVar.f70637d;
            }
            Collection<? extends an> collection = akVar.f70634a;
            if (ab_() && this.f70479b.getAdapter() == (aVar = this.f70484k)) {
                if (collection == null) {
                    collection = new ArrayList<>();
                }
                if (aVar.f70542a == null) {
                    aVar.f70542a = new ArrayList();
                }
                aVar.f70542a.clear();
                aVar.f70542a.addAll(collection);
                aVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.music.b.k
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.choosemusic.b.c cVar) {
        String name;
        com.ss.android.ugc.aweme.choosemusic.b.c cVar2 = cVar;
        String str = cVar2.f70396b;
        MusicModel musicModel = cVar2.f70395a;
        if (musicModel != null) {
            e activity = getActivity();
            if (activity != null && "upload_local_music".equals(str)) {
                Intent intent = new Intent();
                if (cVar2.f70395a == null) {
                    name = "";
                } else {
                    name = cVar2.f70395a.getName();
                }
                intent.putExtra("local_music_name", name);
                activity.setResult(-1, intent);
                activity.finish();
            } else if ("follow_type".equals(str)) {
                this.C.a(1, musicModel.getMusicId(), 1);
            } else if ("unfollow_type".equals(str)) {
                this.C.a(1, musicModel.getMusicId(), 0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.b
    public final void a(MusicModel musicModel, com.ss.android.ugc.aweme.choosemusic.b bVar) {
        com.ss.android.ugc.aweme.search.h.f121133a.a();
        this.u = musicModel;
        this.f70483j.a(true);
        if (this.F) {
            this.f70486m.f70711a = bVar;
            this.f70486m.a(musicModel, this.o, false);
            return;
        }
        this.f70486m.a(musicModel, this.o, true, t());
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.f70479b = (RecyclerView) view.findViewById(R.id.cb7);
        this.f70480c = (TuxStatusView) view.findViewById(R.id.e_o);
        this.f70481d = view.findViewById(R.id.cfn);
        super.onViewCreated(view, bundle);
        a();
        com.ss.android.ugc.aweme.choosemusic.h.c.b bVar = new com.ss.android.ugc.aweme.choosemusic.h.c.b();
        this.f70478a = bVar;
        bVar.a_(this);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = com.a.a(layoutInflater, R.layout.a1_, viewGroup, false);
        this.f70486m = new ChooseMusicDownloadPlayHelper(this, new ChooseMusicDownloadPlayHelper.a() {
            /* class com.ss.android.ugc.aweme.choosemusic.c.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43459);
            }

            @Override // com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.a
            public final void b() {
                bj.b("play music error");
            }

            @Override // com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.a
            public final void a() {
                if (j.this.u != null) {
                    j.this.f70479b.post(new q(this));
                }
            }
        });
        if (getArguments() != null) {
            this.B = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            this.B = 0;
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(String str, MusicModel musicModel, String str2) {
        if (this.v != null) {
            this.n.a(this.B, str, musicModel, str2);
        }
    }
}
