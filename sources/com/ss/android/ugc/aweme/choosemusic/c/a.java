package com.ss.android.ugc.aweme.choosemusic.c;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicBottomSheetBehavior;
import com.ss.android.ugc.aweme.choosemusic.c.j;
import com.ss.android.ugc.aweme.choosemusic.h.d.c;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.model.aj;
import com.ss.android.ugc.aweme.choosemusic.view.q;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.discover.h.b;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.music.b.d;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.music.presenter.e;
import com.ss.android.ugc.aweme.music.presenter.f;
import com.ss.android.ugc.aweme.music.presenter.s;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.setting.bl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.fu;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.r;

public abstract class a extends com.ss.android.ugc.aweme.base.f.a implements View.OnClickListener, TextView.OnEditorActionListener, i.c, WeakHandler.IHandler, j.b, e, f, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {
    private Music A;
    private String B;
    private String C;
    private boolean D;
    private MusicModel E;
    private boolean F;
    private LogPbBean G;
    private long H;
    private long I;
    private boolean J;
    private aj K;
    private View L;
    private ViewStub M;

    /* renamed from: a  reason: collision with root package name */
    protected s f70402a;

    /* renamed from: b  reason: collision with root package name */
    int f70403b;

    /* renamed from: c  reason: collision with root package name */
    public al f70404c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f70405d;

    /* renamed from: e  reason: collision with root package name */
    q f70406e;

    /* renamed from: j  reason: collision with root package name */
    public View f70407j;

    /* renamed from: k  reason: collision with root package name */
    TextView f70408k;

    /* renamed from: l  reason: collision with root package name */
    View f70409l;

    /* renamed from: m  reason: collision with root package name */
    boolean f70410m;
    public boolean n;
    protected WeakHandler o = new WeakHandler(this);
    public String p;
    public String q;
    protected MusicSearchStateViewModel r;
    protected a.AbstractC2689a s;
    protected String t;
    protected int u = 0;
    TextWatcher v = new TextWatcher() {
        /* class com.ss.android.ugc.aweme.choosemusic.c.a.AnonymousClass3 */

        static {
            Covode.recordClassIndex(43426);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void afterTextChanged(Editable editable) {
            a.this.a(editable);
        }
    };
    private b w;
    private String y;
    private d.a z;

    static {
        Covode.recordClassIndex(43422);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Editable editable);

    public abstract void d();

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(230, new g(a.class, "onSugCompletionEvent", com.ss.android.ugc.aweme.choosemusic.b.d.class, ThreadMode.POSTING, 0, false));
        hashMap.put(231, new g(a.class, "onInnerMusicSearchEvent", com.ss.android.ugc.aweme.choosemusic.b.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private static boolean m() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void c() {
        this.r.a().setValue(1);
    }

    public final String g() {
        LogPbBean logPbBean = this.G;
        if (logPbBean != null) {
            return logPbBean.getImprId();
        }
        return "";
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.o.removeCallbacksAndMessages(null);
    }

    private ak k() {
        if (isAdded()) {
            return (ak) getChildFragmentManager().a(R.id.ae7);
        }
        return null;
    }

    private static String l() {
        if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
            return "ad_music";
        }
        return "video_music";
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getChildFragmentManager().b(this);
        super.onDestroyView();
        s sVar = this.f70402a;
        if (sVar != null) {
            sVar.f111614a = null;
            if (sVar.f111617d != null) {
                sVar.f111617d.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.M.getParent() != null) {
            View inflate = this.M.inflate();
            this.f70407j = inflate.findViewById(R.id.a1u);
            this.f70408k = (TextView) inflate.findViewById(R.id.ahg);
            this.f70409l = inflate.findViewById(R.id.a1v);
        }
    }

    public final void e() {
        this.f70405d = false;
        this.f70406e.j();
        j jVar = (j) getChildFragmentManager().a(R.id.ae7);
        if (jVar != null) {
            jVar.o();
        }
        try {
            getChildFragmentManager().d();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        c.b(new com.ss.android.ugc.aweme.music.f.a(null));
        if (h() != null) {
            h().n = false;
        }
    }

    public final MusicBottomSheetBehavior h() {
        androidx.fragment.app.e activity = getActivity();
        if (activity instanceof ChooseMusicActivity) {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ((ChooseMusicActivity) activity).f70328b;
            if (viewPagerBottomSheetBehavior != null && (viewPagerBottomSheetBehavior instanceof MusicBottomSheetBehavior)) {
                return (MusicBottomSheetBehavior) viewPagerBottomSheetBehavior;
            }
        } else if (activity != null) {
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior2 = ((ChooseMusicWithSceneViewModel) ae.a(activity, (ad.b) null).a(ChooseMusicWithSceneViewModel.class)).f70574c;
            if (viewPagerBottomSheetBehavior2 instanceof MusicBottomSheetBehavior) {
                return (MusicBottomSheetBehavior) viewPagerBottomSheetBehavior2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        int i2;
        int i3;
        if (ab_() && this.f70402a.f111616c.f111568a) {
            ak k2 = k();
            if (k2 != null && k2.ab_() && k2.f70483j != null && k2.f70479b.getAdapter() == k2.f70483j) {
                k2.f70483j.ag_();
            }
            if (!AccountService.a().e().isChildrenMode()) {
                if (this.K.f70631g != null) {
                    i2 = this.K.f70631g.getFilterBy();
                } else {
                    i2 = 0;
                }
                if (this.K.f70631g != null) {
                    i3 = this.K.f70631g.getSortType();
                } else {
                    i3 = 0;
                }
                s sVar = this.f70402a;
                aj ajVar = this.K;
                String l2 = l();
                int i4 = this.u;
                if (!sVar.f111620g && !AccountService.a().e().isChildrenMode() && sVar.f111616c.f111568a) {
                    sVar.f111620g = true;
                    sVar.a().a(sVar.f111616c.a(sVar.f111618e, true, l2, false, i2, i3, i4, ajVar.b(), ajVar.c(), sVar.f111619f), true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        int i2;
        int i3;
        String h2 = this.f70406e.h();
        KeyboardUtils.c(this.L);
        if (getActivity() != null && !m.a(h2)) {
            this.r.a().setValue(0);
            ak k2 = k();
            if (k2 != null) {
                k().e();
            }
            com.ss.android.ugc.aweme.choosemusic.e.c.g().b(new MusicSearchHistory(h2));
            if (k2 != null) {
                k2.n();
            }
            if (!AccountService.a().e().isChildrenMode()) {
                if (this.K.f70631g != null) {
                    i2 = this.K.f70631g.getFilterBy();
                } else {
                    i2 = 0;
                }
                if (this.K.f70631g != null) {
                    i3 = this.K.f70631g.getSortType();
                } else {
                    i3 = 0;
                }
                this.f70402a.a(this.K, h2, l(), true, i2, i3, this.u, this.K.a());
            }
            c.b(new com.ss.android.ugc.aweme.music.f.a("search_result"));
            com.ss.android.ugc.aweme.choosemusic.utils.b.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        r6 = null;
     */
    @Override // androidx.fragment.app.i.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.c.a.a():void");
    }

    @Override // com.ss.android.ugc.aweme.music.presenter.f
    public final void a(fu fuVar) {
        this.G = (LogPbBean) fuVar.get(LogPbBean.class);
    }

    @r
    public void onInnerMusicSearchEvent(com.ss.android.ugc.aweme.choosemusic.b.b bVar) {
        if (ab_() && bVar != null) {
            a(bVar.f70394a);
        }
    }

    public final void a(com.ss.android.ugc.aweme.search.g.b bVar) {
        aj ajVar = new aj();
        ajVar.f70627c = this.s.a().f105233a;
        ajVar.f70625a = "normal_search";
        ajVar.f70626b = 1;
        ajVar.f70631g = bVar;
        a(ajVar);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 1) {
            aj ajVar = new aj();
            ajVar.f70626b = 1;
            ajVar.f70625a = "normal_search";
            ajVar.f70627c = (String) message.obj;
            ajVar.f70628d = true;
            a(ajVar);
        }
    }

    @r
    public void onSugCompletionEvent(com.ss.android.ugc.aweme.choosemusic.b.d dVar) {
        q qVar;
        if (ab_() && dVar != null && (qVar = this.f70406e) != null) {
            qVar.a(dVar.f70399a);
            this.f70406e.g();
        }
    }

    private void a(aj ajVar) {
        int i2;
        int i3;
        if (ab_() && ajVar != null && !TextUtils.isEmpty(ajVar.f70627c)) {
            this.s.a(new com.ss.android.ugc.aweme.keyword.b(ajVar.f70627c, ""));
            this.K = ajVar;
            if (this.w.c() && this.K.f70631g == null) {
                this.f70406e.b();
            }
            this.r.c().setValue(ajVar);
            this.r.a().setValue(0);
            q qVar = this.f70406e;
            if (qVar != null) {
                qVar.a(ajVar.f70627c);
                this.f70406e.i();
            }
            ak k2 = k();
            if (!ajVar.f70628d) {
                KeyboardUtils.c(this.L);
                if (k2 != null) {
                    k2.e();
                }
                com.ss.android.ugc.aweme.choosemusic.e.c.g().b(new MusicSearchHistory(ajVar.f70627c));
            }
            if (k2 != null) {
                k2.n();
            }
            ajVar.f70632h = this.H;
            ajVar.f70633i = this.I;
            if (!AccountService.a().e().isChildrenMode()) {
                if (this.K.f70631g != null) {
                    i2 = this.K.f70631g.getFilterBy();
                } else {
                    i2 = 0;
                }
                if (this.K.f70631g != null) {
                    i3 = this.K.f70631g.getSortType();
                } else {
                    i3 = 0;
                }
                this.f70402a.a(ajVar, ajVar.f70627c, l(), ajVar.f70630f, i2, i3, this.u, this.K.a());
            }
            c.b(new com.ss.android.ugc.aweme.music.f.a("search_result"));
            if (this.w.c()) {
                this.f70406e.e();
            }
        }
    }

    public void onClick(View view) {
        androidx.fragment.app.e activity;
        ClickAgent.onClick(view);
        if (view.getId() == R.id.dp1) {
            if (AccountService.a().e().isChildrenMode()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.add).a();
                return;
            }
            this.f70405d = true;
            this.f70406e.l();
            i childFragmentManager = getChildFragmentManager();
            j jVar = (j) childFragmentManager.a(R.id.ae7);
            if (jVar == null) {
                int i2 = this.f70403b;
                d.a aVar = this.z;
                jVar = new ak();
                Bundle bundle = new Bundle();
                bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
                bundle.putSerializable("music_style", aVar);
                jVar.setArguments(bundle);
                jVar.o = 2;
                jVar.t = new b(this);
                n a2 = childFragmentManager.a();
                a2.a(R.id.ae7, jVar, "search_result_list_tag");
                a2.a((String) null);
                a2.c();
            }
            jVar.v = new c(this);
            jVar.n = this;
            this.f70406e.g();
            q qVar = this.f70406e;
            if (qVar.f70820k != null) {
                qVar.f70820k.setVisibility(0);
                qVar.q.setVisibility(8);
                qVar.f70817h.setVisibility(0);
                qVar.f70814e.setVisibility(4);
                qVar.f70816g.setVisibility(8);
                if (qVar.r != null) {
                    qVar.r.setVisibility(0);
                }
                if (qVar.s != null) {
                    qVar.s.setVisibility(8);
                }
                qVar.f();
            }
            this.f70404c.e();
            this.f70404c.g();
            com.ss.android.ugc.aweme.choosemusic.utils.b.b();
        } else if (view.getId() == R.id.f6j) {
            aj ajVar = new aj();
            ajVar.f70627c = this.s.a().f105233a;
            ajVar.f70625a = "normal_search";
            ajVar.f70626b = 1;
            a(ajVar);
            ak k2 = k();
            if (k2 != null) {
                k2.q();
            }
        } else if (view.getId() == R.id.f6k || view.getId() == R.id.due) {
            e();
        } else if (view.getId() != R.id.dp3 && view.getId() == R.id.qb && (activity = getActivity()) != null) {
            activity.onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f70403b = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            this.u = getArguments().getInt("sound_page_scene", 0);
            this.y = getArguments().getString("challenge");
            this.p = getArguments().getString("creation_id");
            this.q = getArguments().getString("shoot_way");
            this.z = (d.a) getArguments().getSerializable("music_style");
            this.A = (Music) getArguments().getSerializable("sticker_music");
            this.B = getArguments().getString("first_sticker_music_ids", null);
            this.D = getArguments().getBoolean("is_busi_sticker", false);
            this.C = getArguments().getString("first_sticker_id", null);
            this.E = (MusicModel) getArguments().getSerializable("music_model");
            this.f70410m = getArguments().getBoolean("music_allow_clear", false);
            this.n = getArguments().getBoolean("music_is_photomv", false);
            this.F = getArguments().getBoolean("extra_beat_music_sticker", false);
            this.J = getArguments().getBoolean("hide_cancel_music_ui", false);
            this.H = getArguments().getLong("max_video_duration", 0);
            this.I = getArguments().getLong("shoot_video_length", 0);
        }
        this.r = (MusicSearchStateViewModel) ae.a(getActivity(), (ad.b) null).a(MusicSearchStateViewModel.class);
        this.w = SearchServiceImpl.t().f();
        this.s = new SearchKeywordPresenter(getActivity());
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f70402a = new s(this);
        i childFragmentManager = getChildFragmentManager();
        Fragment a2 = childFragmentManager.a(R.id.ae8);
        if (a2 != null) {
            this.f70404c = (al) a2;
        } else {
            int i2 = this.f70403b;
            String str = this.y;
            Music music = this.A;
            String str2 = this.B;
            String str3 = this.C;
            boolean z2 = this.D;
            String str4 = this.q;
            int i3 = this.u;
            boolean z3 = this.J;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
            if (!TextUtils.isEmpty(str)) {
                bundle2.putString("challenge", str);
            }
            if (music != null) {
                bundle2.putSerializable("sticker_music", music);
            }
            if (str2 != null) {
                bundle2.putString("first_sticker_music_ids", str2);
            }
            if (str3 != null) {
                bundle2.putString("first_sticker_id", str3);
            }
            bundle2.putBoolean("is_busi_sticker", z2);
            al alVar = new al();
            if (!TextUtils.isEmpty(str4)) {
                bundle2.putString("shoot_way", str4);
            }
            bundle2.putInt("sound_page_scene", i3);
            bundle2.putBoolean("hide_cancel_music_ui", z3);
            alVar.setArguments(bundle2);
            this.f70404c = alVar;
            alVar.f70503m = 0;
            MusicModel musicModel = this.E;
            if (musicModel != null && musicModel.isMvThemeMusic()) {
                this.f70404c.s = true;
            }
            this.f70404c.t = this.n;
            n a3 = childFragmentManager.a();
            a3.a(R.id.ae8, this.f70404c);
            a3.c();
        }
        if (this.f70410m && !bl.a()) {
            b();
        }
        getChildFragmentManager().a((i.c) this);
        this.f70406e.a();
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.L = com.a.a(layoutInflater, R.layout.a1d, viewGroup, false);
        com.ss.android.ugc.aweme.choosemusic.utils.b.f70722e = this.q;
        com.ss.android.ugc.aweme.choosemusic.utils.b.f70721d = this.p;
        this.f70406e = new q(this.L, this, this.f70403b, this.v);
        this.M = (ViewStub) this.L.findViewById(R.id.fjo);
        return this.L;
    }

    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        if (i2 != 3) {
            return false;
        }
        aj ajVar = new aj();
        ajVar.f70626b = 1;
        ajVar.f70625a = "normal_search";
        ajVar.f70627c = this.s.a().f105233a;
        a(ajVar);
        ak k2 = k();
        if (k2 != null) {
            k2.q();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.music.presenter.f
    public final void a(List<MusicModel> list, boolean z2, boolean z3) {
        aj ajVar;
        String str;
        String str2;
        if (ab_()) {
            ak k2 = k();
            if (!TextUtils.isEmpty(this.f70406e.h()) && this.r.f() == 0) {
                if (list != null) {
                    if (!z2) {
                        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("search_type", "music");
                        aj ajVar2 = this.K;
                        if (ajVar2 != null) {
                            str = ajVar2.f70625a;
                        } else {
                            str = "normal_search";
                        }
                        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("enter_method", str).a("search_keyword", this.f70406e.k()).a("creation_id", this.p);
                        if (this.f70403b == 0) {
                            str2 = "video_edit_page";
                        } else {
                            str2 = "video_shoot_page";
                        }
                        a3.a("enter_from", str2).a("trigger_reason", "cold_launch").a("log_pb", this.G).a("new_sug_session_id", com.ss.android.ugc.aweme.choosemusic.h.d.c.f70567d).a("search_id", g());
                        c.a.a("");
                        if (!(this.K.f70631g == null || this.K.f70631g.getFilterByStruct() == null || this.K.f70631g.getFilterByStruct().getLogInfo() == null || this.K.f70631g.getSortTypeStruct() == null || this.K.f70631g.getSortTypeStruct().getLogInfo() == null)) {
                            dVar.a("enter_method", "tab_search");
                            dVar.a(this.K.f70631g.getFilterByStruct().getLogInfo());
                            dVar.a(this.K.f70631g.getSortTypeStruct().getLogInfo());
                        }
                        if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
                            dVar.a("is_commercial", "1");
                        }
                        com.ss.android.ugc.aweme.common.r.a("search_music", dVar.f66730a);
                    }
                    if (list.size() > 0) {
                        for (MusicModel musicModel : list) {
                            musicModel.setDataType(1);
                            if (musicModel.getMusic() == null) {
                                musicModel.setMusic(musicModel.convertToMusic());
                            }
                        }
                        if (!(k2 == null || k2.f70483j == null)) {
                            k2.f70483j.f70289j = this.K;
                            k2.f70483j.f70283d = this.f70406e.h();
                            k2.a(list, z2);
                            com.ss.android.ugc.aweme.choosemusic.utils.b.f70719b = this.f70406e.h();
                            if (this.f70402a.f111616c.f111568a) {
                                k2.f70483j.ai_();
                            } else {
                                k2.f70483j.ah_();
                            }
                        }
                    } else if (getActivity() != null) {
                        q qVar = this.f70406e;
                        com.ss.android.ugc.aweme.common.f.e.a(qVar.f70810a.getActivity(), qVar.f70819j);
                        if (k2 != null) {
                            getContext();
                            if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                                com.ss.android.ugc.aweme.lancet.j.f107226e = m();
                            }
                            if (com.ss.android.ugc.aweme.lancet.j.f107226e) {
                                k2.g();
                            } else {
                                k2.k();
                            }
                        }
                    }
                } else if (k2 != null) {
                    k2.k();
                }
                if (this.w.c() && this.f70406e != null && (ajVar = this.K) != null && ajVar.f70631g == null) {
                    this.f70406e.a(z3, true);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.c.j.b
    public final void a(int i2, String str, final MusicModel musicModel, String str2) {
        final androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            if (i2 == 0 || i2 == 2) {
                Intent intent = new Intent();
                intent.putExtra("path", str);
                intent.putExtra("music_model", musicModel);
                intent.putExtra("music_origin", str2);
                activity.setResult(-1, intent);
                ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = (ChooseMusicWithSceneViewModel) ae.a(getActivity(), (ad.b) null).a(ChooseMusicWithSceneViewModel.class);
                if (chooseMusicWithSceneViewModel.f70572a) {
                    chooseMusicWithSceneViewModel.a(new com.ss.android.ugc.aweme.choosemusic.model.s(-1, intent));
                } else {
                    activity.finish();
                }
            } else {
                com.ss.android.ugc.aweme.common.r.a("shoot", new com.ss.android.ugc.aweme.app.f.d().a("shoot_way", "search_result").f66730a);
                final RecordConfig.Builder builder = new RecordConfig.Builder();
                builder.shootWay("search_result").musicPath(str).musicModel(musicModel).musicOrigin(str2);
                AVExternalServiceImpl.a().asyncService("ChooseMusic", new SimpleServiceLoadCallback() {
                    /* class com.ss.android.ugc.aweme.choosemusic.c.a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(43425);
                    }

                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onLoad(AsyncAVService asyncAVService, long j2) {
                        asyncAVService.uiService().recordService().startRecord(activity, builder.build(), musicModel, true);
                    }
                });
            }
        }
    }
}
