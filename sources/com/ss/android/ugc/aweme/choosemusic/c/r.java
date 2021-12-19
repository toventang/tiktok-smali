package com.ss.android.ugc.aweme.choosemusic.c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.choosemusic.d.e;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.model.s;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.choosemusic.widgets.MusicBannerWidget;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.a;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.m;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.setting.bl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public abstract class r extends a implements u<b>, com.ss.android.ugc.aweme.choosemusic.d.b, e, ScrollableLayout.b, a.AbstractC1744a, k<c>, m, i, j {

    /* renamed from: b  reason: collision with root package name */
    public static final String f70495b = new StringBuilder("android:switcher:2131364352:").toString();
    private String A;
    private boolean B;
    private String C;
    private int D;
    private boolean E = true;
    private String F = "popular_song";
    private Music G;
    private boolean H;
    private int I;

    /* renamed from: a  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.choosemusic.f.a f70496a;

    /* renamed from: c  reason: collision with root package name */
    TuxStatusView f70497c;

    /* renamed from: d  reason: collision with root package name */
    DmtTabLayout f70498d;

    /* renamed from: e  reason: collision with root package name */
    ViewPager f70499e;

    /* renamed from: j  reason: collision with root package name */
    ScrollableLayout f70500j;

    /* renamed from: k  reason: collision with root package name */
    View f70501k;

    /* renamed from: l  reason: collision with root package name */
    protected DataCenter f70502l;

    /* renamed from: m  reason: collision with root package name */
    public int f70503m;
    public MusicModel n;
    public y o;
    public w p;
    public ChooseMusicDownloadPlayHelper q;
    protected com.ss.android.ugc.aweme.choosemusic.model.b r;
    public boolean s;
    public boolean t;
    private com.ss.android.ugc.aweme.arch.widgets.base.e u;
    private int v;
    private MusicBannerWidget w;
    private String y;
    private String z;

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void a(LinearLayout linearLayout);

    /* access modifiers changed from: protected */
    public abstract void a(b bVar);

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(MusicModel musicModel, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(MusicModel musicModel, Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
    public final boolean an_() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: protected */
    public abstract void c();

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void c(MusicModel musicModel) {
    }

    /* access modifiers changed from: protected */
    public abstract void d();

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(52, new g(r.class, "onMusicCollectEvent", com.ss.android.ugc.aweme.music.f.b.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void r() {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final MusicModel h() {
        return this.n;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.music.b.k
    public final /* synthetic */ void a(c cVar) {
        c cVar2 = cVar;
        String str = cVar2.f70396b;
        MusicModel musicModel = cVar2.f70395a;
        if ("follow_type".equals(str)) {
            this.r.a(musicModel, musicModel.getMusicId(), 1, cVar2.f70397c, cVar2.f70398d);
        } else if ("unfollow_type".equals(str)) {
            this.r.a(musicModel, musicModel.getMusicId(), 0, cVar2.f70397c, cVar2.f70398d);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.b
    public final void a(MusicModel musicModel, com.ss.android.ugc.aweme.choosemusic.b bVar) {
        this.n = musicModel;
        this.f70502l.a("music_loading", (Object) true);
        if (this.E) {
            this.q.f70711a = bVar;
            if (bVar != null && bVar.f70386h) {
                this.f70502l.a("last_play_music_id", musicModel.getMusicId());
            }
            this.q.a(musicModel, this.f70503m, false);
            return;
        }
        this.q.a(musicModel, this.f70503m, true, s());
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(String str, final MusicModel musicModel, String str2) {
        final androidx.fragment.app.e activity = getActivity();
        int i2 = this.D;
        if (i2 == 0 || i2 == 2) {
            Intent intent = new Intent();
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
            activity.setResult(-1, intent);
            if (getActivity() != null) {
                ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = (ChooseMusicWithSceneViewModel) ae.a(getActivity(), (ad.b) null).a(ChooseMusicWithSceneViewModel.class);
                if (chooseMusicWithSceneViewModel.f70572a) {
                    chooseMusicWithSceneViewModel.a(new s(-1, intent));
                    return;
                }
            }
            activity.finish();
            return;
        }
        String string = getArguments().getString("shoot_way");
        final RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay(string).creationId(UUID.randomUUID().toString()).musicOrigin(str2).musicPath(str).musicModel(musicModel);
        AVExternalServiceImpl.a().asyncService("NewMusicTab", new SimpleServiceLoadCallback() {
            /* class com.ss.android.ugc.aweme.choosemusic.c.r.AnonymousClass5 */

            static {
                Covode.recordClassIndex(43475);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                asyncAVService.uiService().recordService().startRecord(activity, builder.build(), musicModel, false);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final boolean bN_() {
        return ab_();
    }

    public final void e() {
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.q;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.ao_();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final Activity i() {
        return getActivity();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z n() {
        o();
        return null;
    }

    private void p() {
        TuxStatusView tuxStatusView = this.f70497c;
        if (tuxStatusView != null) {
            tuxStatusView.a();
            this.f70497c.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.q;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.n = false;
        }
    }

    static {
        Covode.recordClassIndex(43470);
    }

    private RecyclerView.a q() {
        int i2 = this.v;
        if (i2 == 0) {
            return this.o.f70455e;
        }
        if (i2 == 1) {
            return this.p.k();
        }
        throw new IllegalStateException("Just has three types of View.");
    }

    private boolean s() {
        if (getActivity().getIntent() != null) {
            return getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
        }
        return false;
    }

    public final com.ss.android.ugc.aweme.choosemusic.f.a a() {
        if (this.f70496a == null) {
            this.f70496a = new com.ss.android.ugc.aweme.choosemusic.f.a(getContext());
        }
        return this.f70496a;
    }

    /* access modifiers changed from: protected */
    public final void g() {
        RecyclerView.a q2 = q();
        if (q2 != null) {
            if (q2 instanceof com.ss.android.ugc.aweme.choosemusic.a.b) {
                ((com.ss.android.ugc.aweme.choosemusic.a.b) q2).a();
            } else if (q2 instanceof com.ss.android.ugc.aweme.choosemusic.a.a) {
                ((com.ss.android.ugc.aweme.choosemusic.a.a) q2).a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        int i2 = this.v;
        if (i2 == 0) {
            return this.o.m();
        }
        if (i2 == 1) {
            return this.p.m();
        }
        throw new IllegalStateException("Just has three types of View.");
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.q;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.ao_();
            this.q.d();
        }
        if (a() != null) {
            a().dismiss();
        }
    }

    private void o() {
        p();
        AVExternalServiceImpl.a().provideAVPerformance().step(OpenMusicPanelPerformanceMonitor.f114756a, "fetch_music_data");
        String str = this.y;
        if (str != null) {
            this.r.a(str, this.z, this.G, this.I);
        } else {
            this.r.a(false, this.z, this.G, false, this.I);
        }
    }

    public final void k() {
        ScrollableLayout scrollableLayout = this.f70500j;
        if (scrollableLayout != null && scrollableLayout.getParent() != null) {
            int measuredHeight = ((View) this.f70500j.getParent()).getMeasuredHeight();
            int measuredHeight2 = this.f70500j.getChildAt(0).getMeasuredHeight();
            this.o.a((measuredHeight + this.f70500j.getCurScrollY()) - measuredHeight2);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.q;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.ao_();
            this.q.n = true;
        }
        this.f70502l.a("music_position", (Object) -1);
        this.f70502l.a("music_index", (Object) -1);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.e
    public final void b(int i2) {
        this.f70503m = i2;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.b
    public final void a(MusicDownloadPlayHelper.a aVar) {
        this.q.f111798h = aVar;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_CURRENT_TAB", this.v);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.b
    public final void b(MusicModel musicModel) {
        this.q.f111801k = this.F;
        this.q.a(musicModel, this.f70503m, true, s());
    }

    /* access modifiers changed from: protected */
    public final void d(MusicModel musicModel) {
        DmtTabLayout.f b2 = this.f70498d.b(1);
        if (b2 != null && b2.f33756i != null) {
            b2.f33756i.post(new u(this, b2, musicModel));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        if (i2 == 1) {
            this.r.b(this.I);
            this.f70499e.setCurrentItem(1, false);
            this.f70500j.getHelper().f76605b = this.p;
        } else if (i2 == 0) {
            this.f70499e.setCurrentItem(0, false);
            this.f70500j.getHelper().f76605b = this.o;
        }
        this.v = i2;
        if (i2 == 0) {
            this.f70503m = 0;
        } else if (i2 == 1) {
            this.f70503m = 1;
        }
    }

    @org.greenrobot.eventbus.r(b = true)
    public void onMusicCollectEvent(com.ss.android.ugc.aweme.music.f.b bVar) {
        if (this.f70502l != null && bVar != null && "music_detail".equals(bVar.f111485c)) {
            this.f70502l.a("music_collect_status", new com.ss.android.ugc.aweme.choosemusic.b.a(0, bVar.f111483a, -1, -1, bVar.f111484b));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (getArguments() != null && arguments.containsKey("challenge")) {
            this.y = arguments.getString("challenge");
        }
        this.z = arguments.getString("first_sticker_music_ids", null);
        this.B = arguments.getBoolean("is_busi_sticker", false);
        this.A = arguments.getString("first_sticker_id", null);
        this.D = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        this.G = (Music) arguments.getSerializable("sticker_music");
        if (getArguments() != null && arguments.containsKey("shoot_way")) {
            this.C = arguments.getString("shoot_way");
        }
        if (getArguments() != null && arguments.containsKey("sound_page_scene")) {
            this.I = arguments.getInt("sound_page_scene");
        }
        this.H = arguments.getBoolean("hide_cancel_music_ui");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(DmtTabLayout.f fVar) {
        if (fVar.f33752e == 1) {
            getString(R.string.bss);
            if (!AccountService.a().e().isLogin()) {
                d();
                return;
            }
        }
        fVar.a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public /* synthetic */ void onChanged(b bVar) {
        boolean z2;
        com.ss.android.ugc.aweme.shortvideo.c curMusic;
        b bVar2 = bVar;
        String str = bVar2.f67014a;
        str.hashCode();
        switch (str.hashCode()) {
            case -2080369200:
                if (str.equals("pick_status")) {
                    if (((Integer) bVar2.a()).intValue() != 1) {
                        TuxStatusView tuxStatusView = this.f70497c;
                        if (tuxStatusView != null) {
                            tuxStatusView.setVisibility(8);
                        }
                        if (getArguments() == null || getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1) != 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!this.H || !z2) {
                            Fragment parentFragment = getParentFragment();
                            if (parentFragment instanceof v) {
                                a aVar = (a) parentFragment;
                                if (aVar.ab_() && aVar.getActivity() != null && aVar.f70410m && (curMusic = AVExternalServiceImpl.a().publishService().getCurMusic()) != null && (!AVExternalServiceImpl.a().publishService().isPhotoMvModeMusic() || aVar.f70403b != 2)) {
                                    aVar.b();
                                    aVar.f70407j.setVisibility(0);
                                    aVar.f70408k.setText(aVar.getActivity().getString(R.string.adp, new Object[]{curMusic.getMusicName()}));
                                    boolean enableNewMusicMarquee = AVExternalServiceImpl.a().configService().avsettingsConfig().enableNewMusicMarquee();
                                    if (!enableNewMusicMarquee && aVar.n) {
                                        aVar.f70409l.setAlpha(0.5f);
                                    }
                                    aVar.f70409l.setOnClickListener(new View.OnClickListener(enableNewMusicMarquee, curMusic) {
                                        /* class com.ss.android.ugc.aweme.choosemusic.c.a.AnonymousClass1 */

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ boolean f70411a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c f70412b;

                                        static {
                                            Covode.recordClassIndex(43423);
                                        }

                                        public final void onClick(View view) {
                                            MethodCollector.i(4866);
                                            ClickAgent.onClick(view);
                                            if (this.f70411a || !a.this.n) {
                                                androidx.fragment.app.e activity = a.this.getActivity();
                                                if (activity != null) {
                                                    ((ChooseMusicWithSceneViewModel) ae.a(activity, (ad.b) null).a(ChooseMusicWithSceneViewModel.class)).f70573b = true;
                                                    if (!TextUtils.isEmpty(((ChooseMusicWithSceneViewModel) ae.a(activity, (ad.b) null).a(ChooseMusicWithSceneViewModel.class)).f70575d)) {
                                                        r.a("mission_requirement_modified", new d().a("value", 1).a("mission_id", ((ChooseMusicWithSceneViewModel) ae.a(activity, (ad.b) null).a(ChooseMusicWithSceneViewModel.class)).f70576e).f66730a);
                                                        ((ChooseMusicWithSceneViewModel) ae.a(activity, (ad.b) null).a(ChooseMusicWithSceneViewModel.class)).f70575d = null;
                                                    }
                                                }
                                                a.this.f70407j.setClickable(false);
                                                Animation loadAnimation = AnimationUtils.loadAnimation(a.this.getContext(), R.anim.bk);
                                                loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                                                    /* class com.ss.android.ugc.aweme.choosemusic.c.a.AnonymousClass1.AnonymousClass1 */

                                                    static {
                                                        Covode.recordClassIndex(43424);
                                                    }

                                                    public final void onAnimationRepeat(Animation animation) {
                                                    }

                                                    public final void onAnimationStart(Animation animation) {
                                                    }

                                                    public final void onAnimationEnd(Animation animation) {
                                                        a.this.f70407j.setVisibility(8);
                                                    }
                                                });
                                                a.this.f70407j.startAnimation(loadAnimation);
                                                r.a("unselect_music", new d().a("creation_id", a.this.p).a("enter_from", "change_music_page" + "_" + com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a.split("_")[1]).a("shoot_way", a.this.q).a("music_id", this.f70412b.getMusicId()).f66730a);
                                                if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
                                                    AVExternalServiceImpl.a().publishService().setFromCommercialSoundPage(false);
                                                }
                                                MethodCollector.o(4866);
                                                return;
                                            }
                                            new com.ss.android.ugc.aweme.tux.a.i.a(a.this.getContext()).a(R.string.b0n).a();
                                            MethodCollector.o(4866);
                                        }

                                        {
                                            this.f70411a = r2;
                                            this.f70412b = r3;
                                        }
                                    });
                                }
                            }
                        }
                        this.f70500j.setVisibility(0);
                        return;
                    } else if (this.f70497c != null) {
                        this.f70497c.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new t(this)));
                        this.f70497c.setVisibility(0);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case -1833731743:
                if (str.equals("data_banner")) {
                    this.f70500j.postDelayed(new Runnable() {
                        /* class com.ss.android.ugc.aweme.choosemusic.c.r.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(43474);
                        }

                        public final void run() {
                            r.this.k();
                        }
                    }, 100);
                    return;
                }
                return;
            case -1635157503:
                if (str.equals("music_collect_status")) {
                    a(bVar2);
                    return;
                }
                return;
            case -1322093457:
                if (str.equals("play_compeleted") && (q() instanceof com.ss.android.ugc.aweme.choosemusic.a.b)) {
                    ((com.ss.android.ugc.aweme.choosemusic.a.b) q()).a();
                    return;
                }
                return;
            case 502104354:
                if (str.equals("music_loading") && q() != null && (q() instanceof com.ss.android.ugc.aweme.choosemusic.a.b)) {
                    ((com.ss.android.ugc.aweme.choosemusic.a.b) q()).a(((Boolean) this.f70502l.a("music_loading")).booleanValue());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.b
    public final void a(MusicModel musicModel) {
        e();
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
    public final void b(int i2, int i3) {
        k();
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
    public final void a(float f2, float f3) {
        RecyclerView recyclerView;
        if (ab_()) {
            int i2 = this.v;
            if (i2 == 0) {
                recyclerView = (RecyclerView) this.o.m();
            } else if (i2 == 1) {
                recyclerView = (RecyclerView) this.p.m();
            } else {
                return;
            }
            if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                if (childCount == 0) {
                    this.f70500j.a();
                    this.f70500j.setMaxScrollHeight(0);
                    return;
                }
                View g2 = recyclerView.getLayoutManager().g(childCount - 1);
                int childCount2 = this.f70500j.getChildCount();
                if (childCount2 >= 2 && g2 != null) {
                    int measuredHeight = ((View) this.f70500j.getParent()).getMeasuredHeight();
                    this.f70500j.setMaxScrollHeight(((recyclerView.getTop() + g2.getBottom()) + this.f70500j.getChildAt(childCount2 - 1).getTop()) - measuredHeight);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(DmtTabLayout.f fVar, MusicModel musicModel) {
        if (getActivity() != null && !getActivity().isFinishing() && a() != null) {
            com.ss.android.ugc.aweme.choosemusic.f.a a2 = a();
            DmtTabLayout.h hVar = fVar.f33756i;
            l.d(hVar, "");
            l.d(musicModel, "");
            if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                com.ss.android.ugc.aweme.base.e.b(a2.f70533b, musicModel.getPicPremium(), -1, -1);
            } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                com.ss.android.ugc.aweme.base.e.b(a2.f70533b, musicModel.getPicBig(), -1, -1);
            }
            a2.setWidth(hVar.getWidth() + n.a(24.0d));
            if (!a2.isShowing()) {
                a2.showAsDropDown(hVar, (hVar.getWidth() - a2.getWidth()) / 2, -((hVar.getHeight() + a2.f70534c.getMeasuredHeight()) - n.a(16.0d)));
            }
            a2.f70534c.removeCallbacks(a2.f70532a);
            a2.f70534c.postDelayed(a2.f70532a, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        View a2 = com.a.a(layoutInflater, R.layout.a1c, viewGroup, false);
        this.f70497c = (TuxStatusView) a2.findViewById(R.id.e_o);
        this.f70498d = (DmtTabLayout) a2.findViewById(R.id.ehe);
        this.f70499e = (ViewPager) a2.findViewById(R.id.b5g);
        this.f70500j = (ScrollableLayout) a2.findViewById(R.id.dtd);
        this.f70501k = a2.findViewById(R.id.an5);
        this.f70500j.setVisibility(4);
        this.f70500j.setOnScrollListener(this);
        if (bundle == null) {
            i2 = 0;
        } else {
            i2 = bundle.getInt("KEY_CURRENT_TAB", 0);
        }
        this.v = i2;
        DataCenter a3 = DataCenter.a(ae.a(this, (ad.b) null), this);
        this.f70502l = a3;
        a3.a("pick_status", (u<b>) this).a("data_banner", (u<b>) this).a("play_compeleted", (u<b>) this).a("music_collect_status", (u<b>) this);
        this.f70502l.a("music_loading", (u<b>) this);
        this.f70502l.a("key_choose_music_type", Integer.valueOf(this.D));
        this.f70502l.a("sticker_id", this.A);
        this.f70502l.a("challenge_id", this.y);
        this.f70502l.a("mvtheme_music_type", Boolean.valueOf(this.s));
        this.f70502l.a("is_photo_mv_type", Boolean.valueOf(this.t));
        this.f70502l.a("is_busi_sticker", Boolean.valueOf(this.B));
        this.f70502l.a("shoot_way", this.C);
        com.ss.android.ugc.aweme.arch.widgets.base.e a4 = com.ss.android.ugc.aweme.arch.widgets.base.e.a(this, a2);
        this.u = a4;
        a4.a(this.f70502l);
        this.w = new MusicBannerWidget(this.I);
        this.r = new com.ss.android.ugc.aweme.choosemusic.model.b(getContext(), this.f70502l);
        this.u.b(R.id.re, this.w);
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        String str = f70495b;
        y yVar = (y) childFragmentManager.a(sb.append(str).append(0).toString());
        this.o = yVar;
        if (yVar == null) {
            int i3 = this.D;
            String str2 = this.y;
            int i4 = this.I;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i3);
            if (!TextUtils.isEmpty(str2)) {
                bundle2.putString("challenge", str2);
            }
            bundle2.putInt("sound_page_scene", i4);
            y yVar2 = new y();
            yVar2.setArguments(bundle2);
            this.o = yVar2;
        }
        this.o.f70453c = this.f70502l;
        this.o.f70454d = this.u;
        this.o.f70459m = this.r;
        y yVar3 = this.o;
        yVar3.f70456j = this;
        if (yVar3.f70455e != null) {
            yVar3.f70455e.f70270d = yVar3.f70456j;
        }
        y yVar4 = this.o;
        yVar4.f70457k = this;
        if (yVar4.f70455e != null) {
            yVar4.f70455e.f70271e = yVar4.f70457k;
        }
        y yVar5 = this.o;
        yVar5.f70458l = this;
        if (yVar5.f70455e != null) {
            yVar5.f70455e.f70274h = yVar5.f70458l;
        }
        w wVar = (w) getChildFragmentManager().a(str + 1);
        this.p = wVar;
        if (wVar == null) {
            int i5 = this.D;
            String str3 = this.y;
            int i6 = this.I;
            Bundle bundle3 = new Bundle();
            bundle3.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i5);
            if (!TextUtils.isEmpty(str3)) {
                bundle3.putString("challenge", str3);
            }
            bundle3.putInt("sound_page_scene", i6);
            w wVar2 = new w();
            wVar2.setArguments(bundle3);
            this.p = wVar2;
        }
        this.p.f70468e = this.f70502l;
        this.p.f70518m = this;
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = new ChooseMusicDownloadPlayHelper(this, new ChooseMusicDownloadPlayHelper.a() {
            /* class com.ss.android.ugc.aweme.choosemusic.c.r.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43471);
            }

            @Override // com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.a
            public final void a() {
                if (r.this.n != null) {
                    r.this.f70502l.a("play_compeleted", r.this.n.getMusicId());
                }
            }

            @Override // com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.a
            public final void b() {
                if (r.this.n != null) {
                    r.this.f70502l.a("play_error", r.this.n.getMusicId());
                }
            }
        });
        this.q = chooseMusicDownloadPlayHelper;
        chooseMusicDownloadPlayHelper.b();
        this.q.b(this.D);
        if (!bl.a()) {
            a();
        }
        this.f70499e.setOffscreenPageLimit(2);
        this.f70499e.setAdapter(new androidx.fragment.app.l(getChildFragmentManager()) {
            /* class com.ss.android.ugc.aweme.choosemusic.c.r.AnonymousClass2 */

            /* renamed from: b  reason: collision with root package name */
            private final int[] f70506b = {R.string.b8h, R.string.dcv};

            static {
                Covode.recordClassIndex(43472);
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return 2;
            }

            @Override // androidx.fragment.app.l
            public final Fragment a(int i2) {
                if (i2 == 0) {
                    return r.this.o;
                }
                return r.this.p;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final CharSequence getPageTitle(int i2) {
                return r.this.getResources().getString(this.f70506b[i2]);
            }
        });
        this.f70498d.setCustomTabViewResId(R.layout.aa4);
        this.f70498d.setTabMode(0);
        this.f70498d.setAutoFillWhenScrollable(true);
        this.f70498d.setupWithViewPager(this.f70499e);
        a((LinearLayout) this.f70498d.getChildAt(0));
        this.f70498d.setOnTabClickListener(new s(this));
        c();
        this.f70498d.a(new DmtTabLayout.c() {
            /* class com.ss.android.ugc.aweme.choosemusic.c.r.AnonymousClass3 */

            static {
                Covode.recordClassIndex(43473);
            }

            @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
            public final void b(DmtTabLayout.f fVar) {
            }

            @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
            public final void a(DmtTabLayout.f fVar) {
                int i2 = fVar.f33752e;
                if (i2 == 1 && r.this.a() != null) {
                    r.this.a().dismiss();
                }
                com.ss.android.ugc.aweme.choosemusic.utils.b.a(i2);
                r.this.g();
                r.this.a(i2);
            }
        });
        this.f70498d.b(this.v).a();
        b();
        a(this.v);
        o();
        androidx.fragment.app.e activity = getActivity();
        if (activity instanceof ChooseMusicActivity) {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ((ChooseMusicActivity) activity).f70328b;
            if (viewPagerBottomSheetBehavior != null) {
                viewPagerBottomSheetBehavior.a(this.f70499e);
            }
        } else if (activity instanceof androidx.fragment.app.e) {
            ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = (ChooseMusicWithSceneViewModel) ae.a(activity, (ad.b) null).a(ChooseMusicWithSceneViewModel.class);
            if (chooseMusicWithSceneViewModel.f70574c != null) {
                chooseMusicWithSceneViewModel.f70574c.a(this.f70499e);
            }
        }
        return a2;
    }
}
