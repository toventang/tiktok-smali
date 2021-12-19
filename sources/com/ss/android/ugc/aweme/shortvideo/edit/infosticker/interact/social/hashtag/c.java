package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cz.a.j;
import com.ss.android.ugc.aweme.port.in.ak;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a.e;
import com.ss.android.ugc.aweme.shortvideo.f;
import com.ss.android.ugc.aweme.shortvideo.g;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecycleView;
import com.ss.android.ugc.aweme.video.hashtag.AVRecommendHashTagResponseViewModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class c extends FrameLayout implements u<f>, ak.e {

    /* renamed from: h  reason: collision with root package name */
    public static String f127645h = "challenge_create";

    /* renamed from: i  reason: collision with root package name */
    public static final a f127646i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a.c f127647a;

    /* renamed from: b  reason: collision with root package name */
    public ak.f f127648b;

    /* renamed from: c  reason: collision with root package name */
    boolean f127649c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f127650d;

    /* renamed from: e  reason: collision with root package name */
    public e<? super com.ss.android.ugc.aweme.video.hashtag.b> f127651e;

    /* renamed from: f  reason: collision with root package name */
    ak.d f127652f;

    /* renamed from: g  reason: collision with root package name */
    ak.c f127653g;

    /* renamed from: j  reason: collision with root package name */
    private AVDmtPanelRecycleView f127654j;

    /* renamed from: k  reason: collision with root package name */
    private e f127655k;

    /* renamed from: l  reason: collision with root package name */
    private String f127656l;

    /* renamed from: m  reason: collision with root package name */
    private final List<com.ss.android.ugc.aweme.video.hashtag.b> f127657m;

    public static final class a {
        static {
            Covode.recordClassIndex(83686);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void a() {
        this.f127650d = true;
        a(3);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ak.e
    public final void c() {
        a(1);
    }

    static {
        Covode.recordClassIndex(83685);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ak.e
    public final void b() {
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f127654j;
        if (aVDmtPanelRecycleView == null) {
            l.a("mHashTagListView");
        }
        aVDmtPanelRecycleView.b(0);
        this.f127650d = false;
        a(0);
    }

    public final void setOnHashTagItemClickListener(e<? super com.ss.android.ugc.aweme.video.hashtag.b> eVar) {
        this.f127651e = eVar;
    }

    public static final class b implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f127658a;

        static {
            Covode.recordClassIndex(83687);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f127658a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.cz.a.j
        public final void a(View view, int i2) {
            l.d(view, "");
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a.c cVar = this.f127658a.f127647a;
            if (cVar == null) {
                l.a("mHashTagAdapter");
            }
            Object b2 = n.b((List) cVar.f127638a, i2);
            e<? super com.ss.android.ugc.aweme.video.hashtag.b> eVar = this.f127658a.f127651e;
            if (eVar != null) {
                eVar.a(b2);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        this(context, (byte) 0);
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.port.in.ak.e
    public final void a(AVSearchChallengeList aVSearchChallengeList) {
        List<g> list;
        if (aVSearchChallengeList != null) {
            list = aVSearchChallengeList.items;
        } else {
            list = null;
        }
        this.f127657m.clear();
        if (list == null || list.isEmpty()) {
            a(2);
        } else {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                List<com.ss.android.ugc.aweme.video.hashtag.b> list2 = this.f127657m;
                com.ss.android.ugc.aweme.video.hashtag.b a2 = com.ss.android.ugc.aweme.video.hashtag.b.a(list.get(i2), false);
                l.b(a2, "");
                list2.add(a2);
            }
            a();
        }
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f127654j;
        if (aVDmtPanelRecycleView == null) {
            l.a("mHashTagListView");
        }
        aVDmtPanelRecycleView.b(0);
    }

    private final void a(int i2) {
        if (i2 == 0) {
            AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f127654j;
            if (aVDmtPanelRecycleView == null) {
                l.a("mHashTagListView");
            }
            RecyclerView.a adapter = aVDmtPanelRecycleView.getAdapter();
            e eVar = this.f127655k;
            if (eVar == null) {
                l.a("mLoadingHashTagAdapter");
            }
            if (!l.a(adapter, eVar)) {
                AVDmtPanelRecycleView aVDmtPanelRecycleView2 = this.f127654j;
                if (aVDmtPanelRecycleView2 == null) {
                    l.a("mHashTagListView");
                }
                e eVar2 = this.f127655k;
                if (eVar2 == null) {
                    l.a("mLoadingHashTagAdapter");
                }
                aVDmtPanelRecycleView2.setAdapter(eVar2);
            }
            setVisibility(0);
        } else if (i2 == 1) {
            AVDmtPanelRecycleView aVDmtPanelRecycleView3 = this.f127654j;
            if (aVDmtPanelRecycleView3 == null) {
                l.a("mHashTagListView");
            }
            RecyclerView.a adapter2 = aVDmtPanelRecycleView3.getAdapter();
            e eVar3 = this.f127655k;
            if (eVar3 == null) {
                l.a("mLoadingHashTagAdapter");
            }
            if (!l.a(adapter2, eVar3)) {
                AVDmtPanelRecycleView aVDmtPanelRecycleView4 = this.f127654j;
                if (aVDmtPanelRecycleView4 == null) {
                    l.a("mHashTagListView");
                }
                e eVar4 = this.f127655k;
                if (eVar4 == null) {
                    l.a("mLoadingHashTagAdapter");
                }
                aVDmtPanelRecycleView4.setAdapter(eVar4);
            }
            setVisibility(8);
        } else if (i2 == 2) {
            AVDmtPanelRecycleView aVDmtPanelRecycleView5 = this.f127654j;
            if (aVDmtPanelRecycleView5 == null) {
                l.a("mHashTagListView");
            }
            RecyclerView.a adapter3 = aVDmtPanelRecycleView5.getAdapter();
            e eVar5 = this.f127655k;
            if (eVar5 == null) {
                l.a("mLoadingHashTagAdapter");
            }
            if (!l.a(adapter3, eVar5)) {
                AVDmtPanelRecycleView aVDmtPanelRecycleView6 = this.f127654j;
                if (aVDmtPanelRecycleView6 == null) {
                    l.a("mHashTagListView");
                }
                e eVar6 = this.f127655k;
                if (eVar6 == null) {
                    l.a("mLoadingHashTagAdapter");
                }
                aVDmtPanelRecycleView6.setAdapter(eVar6);
            }
            setVisibility(8);
        } else if (i2 == 3) {
            AVDmtPanelRecycleView aVDmtPanelRecycleView7 = this.f127654j;
            if (aVDmtPanelRecycleView7 == null) {
                l.a("mHashTagListView");
            }
            RecyclerView.a adapter4 = aVDmtPanelRecycleView7.getAdapter();
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a.c cVar = this.f127647a;
            if (cVar == null) {
                l.a("mHashTagAdapter");
            }
            if (!l.a(adapter4, cVar)) {
                AVDmtPanelRecycleView aVDmtPanelRecycleView8 = this.f127654j;
                if (aVDmtPanelRecycleView8 == null) {
                    l.a("mHashTagListView");
                }
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a.c cVar2 = this.f127647a;
                if (cVar2 == null) {
                    l.a("mHashTagAdapter");
                }
                aVDmtPanelRecycleView8.setAdapter(cVar2);
            }
            setVisibility(0);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(f fVar) {
        if (fVar != null) {
            ak.d dVar = this.f127652f;
            if (dVar == null) {
                l.a("recommendHashTagViewModel");
            }
            f a2 = dVar.a();
            if (a2 == null) {
                a(1);
                return;
            }
            String str = this.f127656l;
            if (str == null || str.length() == 0) {
                LinkedList linkedList = new LinkedList();
                boolean z = a2.f128472b;
                boolean z2 = a2.f128474d;
                int i2 = a2.f128475e;
                List<? extends com.ss.android.ugc.aweme.shortvideo.e> list = a2.f128471a;
                new ArrayList();
                if (z) {
                    com.ss.android.ugc.aweme.port.in.g.a().Q();
                } else if (z2 && i2 > 0) {
                    com.ss.android.ugc.aweme.port.in.g.a().Q();
                    throw new NullPointerException("size");
                }
                if (list != null && !list.isEmpty()) {
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a.a.a(linkedList, null, list);
                }
                if (linkedList.isEmpty()) {
                    a(2);
                    return;
                }
                this.f127657m.clear();
                this.f127657m.addAll(linkedList);
                a();
                AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f127654j;
                if (aVDmtPanelRecycleView == null) {
                    l.a("mHashTagListView");
                }
                aVDmtPanelRecycleView.b(0);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private c(Context context, byte b2) {
        this(context, (char) 0);
        l.d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context, char c2) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(5228);
        this.f127650d = true;
        ArrayList arrayList = new ArrayList();
        this.f127657m = arrayList;
        LayoutInflater.from(getContext()).inflate(R.layout.afw, this);
        View findViewById = findViewById(R.id.bes);
        l.b(findViewById, "");
        AVDmtPanelRecycleView aVDmtPanelRecycleView = (AVDmtPanelRecycleView) findViewById;
        this.f127654j = aVDmtPanelRecycleView;
        if (aVDmtPanelRecycleView == null) {
            l.a("mHashTagListView");
        }
        getContext();
        aVDmtPanelRecycleView.setLayoutManager(new HashTagStickerListView$initView$1(this));
        this.f127655k = new e();
        this.f127647a = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a.c(arrayList, new b(this));
        ak h2 = com.ss.android.ugc.aweme.port.in.l.f115658a.h();
        if (h2 == null) {
            this.f127649c = false;
            setVisibility(8);
        } else {
            this.f127649c = true;
            Context context2 = getContext();
            l.b(context2, "");
            Activity a2 = com.ss.android.ugc.aweme.scene.a.a(context2);
            if (a2 != null) {
                ak.d a3 = h2.a((androidx.fragment.app.e) a2);
                l.b(a3, "");
                this.f127652f = a3;
                ak.c a4 = h2.a(this);
                l.b(a4, "");
                this.f127653g = a4;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                MethodCollector.o(5228);
                throw nullPointerException;
            }
        }
        Context context3 = getContext();
        if (context3 != null) {
            ac a5 = ae.a((androidx.fragment.app.e) context3, (ad.b) null).a(AVRecommendHashTagResponseViewModel.class);
            l.b(a5, "");
            t<f> tVar = ((AVRecommendHashTagResponseViewModel) a5).f143393a;
            Context context4 = getContext();
            if (context4 != null) {
                tVar.observe((androidx.fragment.app.e) context4, this);
                MethodCollector.o(5228);
                return;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            MethodCollector.o(5228);
            throw nullPointerException2;
        }
        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.o(5228);
        throw nullPointerException3;
    }
}
