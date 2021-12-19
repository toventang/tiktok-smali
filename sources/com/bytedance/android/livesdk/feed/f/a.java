package com.bytedance.android.livesdk.feed.f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.a.j;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.feed.a.d;
import com.bytedance.android.livesdk.feed.e;
import com.bytedance.android.livesdk.feed.i;
import com.bytedance.android.livesdk.feed.k;
import com.bytedance.android.livesdk.feed.k.a;
import com.bytedance.android.livesdk.feed.q;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.feed.tab.b.g;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.DislikeTipViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.SyncContentViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TimeOutRefreshViewModel;
import com.bytedance.android.livesdk.j.af;
import com.bytedance.android.livesdk.livesetting.feed.FeedPreloadSetting;
import com.bytedance.android.livesdk.model.ah;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.l.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.datachannel.f;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class a extends com.bytedance.android.livesdk.ui.a implements i, k {
    public static ah t;

    /* renamed from: a  reason: collision with root package name */
    private TimeOutRefreshViewModel f17430a;

    /* renamed from: b  reason: collision with root package name */
    private SyncContentViewModel f17431b;

    /* renamed from: c  reason: collision with root package name */
    private String f17432c = "";

    /* renamed from: d  reason: collision with root package name */
    private final Handler f17433d = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.android.livesdk.feed.f.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(9663);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                a.this.b(1);
            }
        }
    };

    /* renamed from: g  reason: collision with root package name */
    protected e f17434g;

    /* renamed from: h  reason: collision with root package name */
    protected RecyclerView f17435h;

    /* renamed from: i  reason: collision with root package name */
    protected d f17436i;

    /* renamed from: j  reason: collision with root package name */
    protected BannerSwipeRefreshLayout f17437j;

    /* renamed from: k  reason: collision with root package name */
    protected TabFeedViewModel f17438k;

    /* renamed from: l  reason: collision with root package name */
    public DislikeTipViewModel f17439l;

    /* renamed from: m  reason: collision with root package name */
    public ad.b f17440m;
    protected View n;
    protected View o;
    protected boolean p;
    public boolean q;
    long r;
    public DataChannel s;

    static {
        Covode.recordClassIndex(9662);
    }

    /* access modifiers changed from: protected */
    public d.a a(d.a aVar) {
        return aVar;
    }

    @Override // com.bytedance.android.livesdk.feed.i
    public String a() {
        return "";
    }

    @Override // com.bytedance.android.livesdk.feed.i
    public String b() {
        return "";
    }

    /* access modifiers changed from: protected */
    public abstract TabFeedViewModel d();

    /* access modifiers changed from: protected */
    public int e() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public abstract com.bytedance.android.livesdk.feed.a.a g();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void p() {
        TimeOutRefreshViewModel timeOutRefreshViewModel = this.f17430a;
        if (timeOutRefreshViewModel != null) {
            timeOutRefreshViewModel.f17709a = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void m() {
        TimeOutRefreshViewModel timeOutRefreshViewModel = this.f17430a;
        if (timeOutRefreshViewModel != null) {
            timeOutRefreshViewModel.a();
        }
    }

    @Override // com.bytedance.android.livesdk.feed.i
    public int c() {
        int value = FeedPreloadSetting.INSTANCE.getValue();
        if (value <= 1) {
            return 4;
        }
        return value;
    }

    public long h() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getLong("id");
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public RecyclerView.i i() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(e(), 1);
        staggeredGridLayoutManager.i();
        return staggeredGridLayoutManager;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o() {
        TabFeedViewModel tabFeedViewModel = this.f17438k;
        if (tabFeedViewModel != null) {
            tabFeedViewModel.a("enter_auto");
        }
    }

    public void j() {
        DislikeTipViewModel dislikeTipViewModel = this.f17439l;
        if (dislikeTipViewModel != null) {
            dislikeTipViewModel.f17705b = -1;
        }
        TimeOutRefreshViewModel timeOutRefreshViewModel = this.f17430a;
        if (timeOutRefreshViewModel != null && timeOutRefreshViewModel.f17711c == Long.MAX_VALUE) {
            timeOutRefreshViewModel.f17711c = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (g() != null) {
            com.bytedance.android.livesdk.feed.a.a g2 = g();
            g2.r.onNext(com.bytedance.android.livesdk.util.rxutils.i.f22198c);
            g2.f17224j.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (g() != null) {
            com.bytedance.android.livesdk.feed.a.a g2 = g();
            g2.q.onNext(com.bytedance.android.livesdk.util.rxutils.i.f22198c);
            g2.u = false;
        }
        m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (g() != null) {
            g().c();
        }
        j();
    }

    /* access modifiers changed from: protected */
    public final RecyclerView.h n() {
        RecyclerView recyclerView = this.f17435h;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), this.f17435h.getPaddingTop(), this.f17435h.getPaddingRight(), this.f17435h.getPaddingBottom());
        return new com.bytedance.android.livesdk.feed.m.a();
    }

    public final void b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", str);
        b.a.a("livesdk_explore_live_take_button").a((Map<String, String>) hashMap).a(this.s).b();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        View view;
        if (this.p && (view = this.o) != null && view.getVisibility() == 0) {
            if (i2 == 0) {
                if (this.f17433d.hasMessages(1)) {
                    this.f17433d.removeMessages(1);
                }
                Handler handler = this.f17433d;
                handler.sendMessageDelayed(Message.obtain(handler, 1), 3000);
            } else if (i2 == 1) {
                if (this.f17433d.hasMessages(1)) {
                    this.f17433d.removeMessages(1);
                }
                b(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b(int i2) {
        if (i2 == 1) {
            b("show");
        }
        this.o.animate().setDuration(300).alpha((float) i2).setListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.android.livesdk.feed.f.a.AnonymousClass5 */

            static {
                Covode.recordClassIndex(9667);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }
        }).start();
    }

    public void a(View view) {
        this.f17437j = (BannerSwipeRefreshLayout) view.findViewById(R.id.egg);
        if (LiveDrawerSettings.INSTANCE.getValue().enableGoLiveAnimation()) {
            this.o = view.findViewById(R.id.apu);
        } else {
            this.o = view.findViewById(R.id.ery);
        }
        ((IHostUser) com.bytedance.android.live.t.a.a(IHostUser.class)).requestLivePermission(new c() {
            /* class com.bytedance.android.livesdk.feed.f.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(9666);
            }

            @Override // com.bytedance.android.livesdkapi.l.c
            public final void a(Throwable th) {
            }

            @Override // com.bytedance.android.livesdkapi.l.c
            public final void a(Boolean bool, com.bytedance.android.livesdkapi.l.b bVar, com.bytedance.android.livesdkapi.l.a aVar) {
                a.this.p = bool.booleanValue();
                if (bVar != null) {
                    DataChannelGlobal.f34575d.a(af.class, bVar);
                }
                if (aVar != null) {
                    DataChannelGlobal.f34575d.a(com.bytedance.android.livesdk.j.e.class, aVar);
                }
                if (a.this.p) {
                    a.this.o.setVisibility(0);
                    a.this.b("show");
                }
            }
        });
        this.o.setOnClickListener(new f(this));
        this.f17435h.a(new RecyclerView.n() {
            /* class com.bytedance.android.livesdk.feed.f.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(9665);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2) {
                super.a(recyclerView, i2);
                if (LiveDrawerSettings.INSTANCE.getValue().enableGoLiveAnimation()) {
                    a.this.a(i2);
                }
                if (i2 != 0) {
                    DislikeTipViewModel dislikeTipViewModel = a.this.f17439l;
                    if (dislikeTipViewModel.f17704a && recyclerView != null && !dislikeTipViewModel.f17706c && dislikeTipViewModel.f17705b == -1) {
                        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof StaggeredGridLayoutManager) {
                            dislikeTipViewModel.f17705b = ((StaggeredGridLayoutManager) layoutManager).b((int[]) null)[0];
                        } else if (layoutManager instanceof GridLayoutManager) {
                            dislikeTipViewModel.f17705b = ((LinearLayoutManager) layoutManager).m();
                        }
                    }
                }
                com.bytedance.android.livesdk.feed.k.a aVar = a.C0366a.f17586a;
                if (i2 == 0) {
                    aVar.a();
                } else if (aVar.f17582e || aVar.f17583f <= 10) {
                    if (!aVar.f17582e) {
                        int i3 = Build.VERSION.SDK_INT;
                        try {
                            aVar.a();
                            aVar.f17582e = true;
                            Choreographer.getInstance().postFrameCallback(aVar.f17584g);
                        } catch (Throwable unused) {
                            aVar.f17582e = false;
                        }
                    }
                } else if (com.bytedance.android.livesdk.feed.k.a.f17578a) {
                    com.bytedance.android.live.core.c.a.a(3, "FPSMonitor", "stop because over max count, cur count = " + aVar.f17583f);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void a(RecyclerView recyclerView, int i2, int i3) {
                super.a(recyclerView, i2, i3);
                if (LiveDrawerSettings.INSTANCE.getValue().enableGoLiveAnimation()) {
                    return;
                }
                if (i3 > 20) {
                    a aVar = a.this;
                    aVar.a(0, aVar.o);
                } else if (i3 < -20) {
                    a aVar2 = a.this;
                    aVar2.a(1, aVar2.o);
                }
            }
        });
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.s = f.a(this);
        FeedRepository feedRepository = new FeedRepository(com.bytedance.android.livesdk.feed.services.d.a(), (FeedApi) com.bytedance.android.live.network.e.a().a(FeedApi.class), new com.bytedance.android.live.core.a.e(), new j(), new com.bytedance.android.live.core.a.e(), (com.bytedance.android.livesdk.feed.g.a) com.bytedance.android.livesdk.feed.services.b.a().a(com.bytedance.android.livesdk.feed.g.a.class), new com.bytedance.android.livesdk.feed.b(g.b()));
        g b2 = g.b();
        Context applicationContext = y.e().getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f17434g = new e(feedRepository, b2, applicationContext, new q() {
            /* class com.bytedance.android.livesdk.feed.f.a.AnonymousClass8 */

            static {
                Covode.recordClassIndex(9670);
            }
        }, new com.bytedance.android.livesdk.feed.n.a());
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("user_visible")) {
            setUserVisibleHint(arguments.getBoolean("user_visible"));
        }
        List<ah> a2 = g.b().a();
        if (a2 != null && a2.size() > 0) {
            ah ahVar = a2.get(0);
            t = ahVar;
            this.f17432c = ahVar.getUrl();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && this.p) {
            b("show");
        }
        TabFeedViewModel tabFeedViewModel = this.f17438k;
        if (tabFeedViewModel != null) {
            tabFeedViewModel.a(z);
        }
        if (g() != null) {
            com.bytedance.android.livesdk.feed.a.a g2 = g();
            g2.y = z;
            if (z) {
                if (g2.x) {
                    b.a.a("livesdk_explore_page_show").a().a("show_type", "normal").a("has_banner", com.bytedance.android.b.a.a.f6785g.c()).b();
                }
                if (!(g2.n == null || g2.n.size() == 0)) {
                    long nanoTime = System.nanoTime() / 1000000;
                    for (Map.Entry<String, Long> entry : g2.n.entrySet()) {
                        g2.f17226l.put(entry.getKey(), Long.valueOf(nanoTime));
                    }
                    g2.n.clear();
                    g2.n = null;
                }
            } else {
                g2.a(g2.f17226l, false);
            }
            g2.s.onNext(Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, View view) {
        boolean z;
        if (this.p && !this.q) {
            if (this.o.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            float a2 = (float) y.a(100.0f);
            if (i2 != 0) {
                if (i2 == 1 && !z) {
                    this.q = true;
                    view.setVisibility(0);
                    b("show");
                    view.setTranslationY(a2);
                    view.animate().setDuration(300).translationY(0.0f).setListener(new AnimatorListenerAdapter() {
                        /* class com.bytedance.android.livesdk.feed.f.a.AnonymousClass7 */

                        static {
                            Covode.recordClassIndex(9669);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            a.this.q = false;
                        }
                    }).alpha(1.0f).start();
                }
            } else if (z) {
                this.q = true;
                view.animate().setDuration(300).translationY(a2).setListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.feed.f.a.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(9668);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        a.this.o.setVisibility(8);
                        a.this.q = false;
                    }
                }).alpha(0.0f).start();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f17438k = d();
        d.a aVar = new d.a();
        aVar.f17250g = this;
        aVar.f17246c = this.f17438k;
        aVar.f17245b = this.f17435h;
        aVar.f17253j = new b(this);
        aVar.f17244a = g();
        aVar.f17247d = i();
        aVar.f17249f = n();
        aVar.f17251h = false;
        aVar.f17248e = e();
        aVar.f17252i = this;
        d.a a2 = a(aVar);
        if (a2.f17245b != null) {
            a2.f17245b.setItemAnimator(null);
            if (a2.f17244a == null) {
                throw new IllegalStateException("adapter must not be null");
            } else if (a2.f17246c == null) {
                throw new IllegalStateException("viewModel must not be null");
            } else if (a2.f17250g != null) {
                d dVar = new d(a2.f17250g, a2.f17244a, a2.f17245b, a2.f17246c, (byte) 0);
                dVar.f17233d = a2.f17247d;
                if (a2.f17247d instanceof StaggeredGridLayoutManager) {
                    ((StaggeredGridLayoutManager) a2.f17247d).a(a2.f17248e);
                }
                dVar.f17237h = a2.f17253j;
                dVar.f17234e = a2.f17249f;
                dVar.f17236g = a2.f17251h;
                dVar.f17235f = a2.f17252i;
                dVar.f17238i = a2.f17254k;
                dVar.f17239j = a2.f17255l;
                this.f17436i = dVar;
                dVar.a();
                this.f17438k.a(getUserVisibleHint());
                this.f17435h.a(new com.bytedance.android.livesdk.feed.k.b("feed_drawer_slide"));
                ((BaseFeedDataViewModel) this.f17438k).f17702m.observe(this, new u<List<ImageModel>>() {
                    /* class com.bytedance.android.livesdk.feed.f.a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(9664);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // androidx.lifecycle.u
                    public final /* synthetic */ void onChanged(List<ImageModel> list) {
                        for (ImageModel imageModel : list) {
                            com.bytedance.android.live.core.f.k.a(imageModel);
                        }
                    }
                });
                e eVar = this.f17434g;
                eVar.f17422a = h();
                this.f17439l = (DislikeTipViewModel) ae.a(this, eVar).a(DislikeTipViewModel.class);
                TimeOutRefreshViewModel timeOutRefreshViewModel = (TimeOutRefreshViewModel) ae.a(this, this.f17434g).a(TimeOutRefreshViewModel.class);
                this.f17430a = timeOutRefreshViewModel;
                timeOutRefreshViewModel.f17710b.a(new c(this), d.f17451a);
                this.f17431b = (SyncContentViewModel) ae.a(this, this.f17440m).a(SyncContentViewModel.class);
                ((BaseFeedDataViewModel) this.f17438k).f17700k.observe(this, new e(this));
            } else {
                throw new IllegalStateException("lifecycleOwner must not be null");
            }
        } else {
            throw new IllegalStateException("recyclerView must not be null");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = com.a.a(layoutInflater, R.layout.b96, viewGroup, false);
        this.f17435h = (RecyclerView) a2.findViewById(R.id.cb4);
        a(a2);
        return a2;
    }
}
