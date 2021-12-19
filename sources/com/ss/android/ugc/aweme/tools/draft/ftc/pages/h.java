package com.ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.e.a;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bn;
import com.ss.android.ugc.aweme.tools.draft.ai;
import com.ss.android.ugc.aweme.tools.draft.ak;
import com.ss.android.ugc.aweme.tools.draft.ftc.a.a;
import com.ss.android.ugc.aweme.tools.draft.ftc.util.FTCPreviewSurfaceView;
import com.ss.android.ugc.aweme.tools.draft.ftc.util.e;
import com.ss.android.ugc.aweme.tools.draft.ftc.util.f;
import com.ss.android.ugc.aweme.tools.draft.ftc.view.LoadMoreFrameLayout;
import com.ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager;
import com.ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar;
import com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel;
import com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftOptionViewModel;
import com.ss.android.ugc.tools.view.widget.AVAutoRTLImageView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.bs;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class h extends Fragment implements VideoDownloadStatusBar.c, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: h  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.draft.model.c f139631h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f139632i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public VideoPublishEditModel f139633a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.draft.model.c f139634b;

    /* renamed from: c  reason: collision with root package name */
    public int f139635c = 1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f139636d = true;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.draft.ftc.util.c f139637e;

    /* renamed from: f  reason: collision with root package name */
    final h.h f139638f = h.i.a((h.f.a.a) k.f139650a);

    /* renamed from: g  reason: collision with root package name */
    final h.h f139639g = h.i.a((h.f.a.a) new d(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f139640j = h.i.a((h.f.a.a) new e(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f139641k = h.i.a((h.f.a.a) new b(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f139642l = h.i.a((h.f.a.a) new c(this));

    /* renamed from: m  reason: collision with root package name */
    private HashMap f139643m;

    static {
        Covode.recordClassIndex(91283);
    }

    public final View a(int i2) {
        if (this.f139643m == null) {
            this.f139643m = new HashMap();
        }
        View view = (View) this.f139643m.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f139643m.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final com.ss.android.ugc.aweme.tools.draft.ftc.a.a a() {
        return (com.ss.android.ugc.aweme.tools.draft.ftc.a.a) this.f139640j.getValue();
    }

    /* access modifiers changed from: package-private */
    public final KidsDraftFeedViewModel b() {
        return (KidsDraftFeedViewModel) this.f139641k.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(299, new org.greenrobot.eventbus.g(h.class, "handleDownloadVideoStatus", com.ss.android.ugc.aweme.tools.draft.ftc.util.b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91284);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<h.f.a.b<? super com.ss.android.ugc.aweme.tools.draft.ftc.util.f, ? extends z>> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(91289);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.f.a.b<? super com.ss.android.ugc.aweme.tools.draft.ftc.util.f, ? extends z> invoke() {
            return new h.f.a.b<com.ss.android.ugc.aweme.tools.draft.ftc.util.f, z>(this) {
                /* class com.ss.android.ugc.aweme.tools.draft.ftc.pages.h.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(91290);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.tools.draft.ftc.util.f fVar) {
                    String str;
                    com.ss.android.ugc.aweme.tools.draft.ftc.util.f fVar2 = fVar;
                    l.d(fVar2, "");
                    if (fVar2 instanceof f.a) {
                        h hVar = this.this$0.this$0;
                        VideoPublishEditModel videoPublishEditModel = ((f.a) fVar2).f139675a;
                        d dVar = new d();
                        Bundle bundle = new Bundle();
                        List<VideoPublishEditModel> value = hVar.b().f139770c.getValue();
                        if (value == null) {
                            l.b();
                        }
                        l.b(value, "");
                        bundle.putSerializable("draft_selected_video_index", Integer.valueOf(h.a(value, videoPublishEditModel)));
                        bundle.putSerializable("draft_current_video", videoPublishEditModel);
                        dVar.setArguments(bundle);
                        dVar.show(hVar.getFragmentManager(), "draft_selected_video_index");
                        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("enter_from", "personal_homepage");
                        com.ss.android.ugc.aweme.draft.model.c cVar = this.this$0.this$0.f139634b;
                        String str2 = null;
                        if (cVar != null) {
                            str = cVar.f();
                        } else {
                            str = null;
                        }
                        com.ss.android.ugc.tools.f.b a3 = a2.a("group_id", str);
                        com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.g.a().A().e();
                        if (e2 != null) {
                            str2 = e2.c();
                        }
                        r.a("click_more_button", a3.a("authro_id", str2).a("order", this.this$0.this$0.f139635c).f149193a);
                    }
                    return z.f158842a;
                }
            };
        }
    }

    static final class k extends m implements h.f.a.a<com.ss.android.ugc.aweme.tools.draft.ftc.c.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f139650a = new k();

        static {
            Covode.recordClassIndex(91300);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.tools.draft.ftc.c.c invoke() {
            return new com.ss.android.ugc.aweme.tools.draft.ftc.c.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar.c
    public final void d() {
        a(false);
    }

    static final class b extends m implements h.f.a.a<KidsDraftFeedViewModel> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(91285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ KidsDraftFeedViewModel invoke() {
            ac a2 = new ad(this.this$0, new ad.b(this) {
                /* class com.ss.android.ugc.aweme.tools.draft.ftc.pages.h.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f139644a;

                static {
                    Covode.recordClassIndex(91286);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f139644a = r1;
                }

                @Override // androidx.lifecycle.ad.b
                public final <T extends ac> T a(Class<T> cls) {
                    l.d(cls, "");
                    return new KidsDraftFeedViewModel((com.ss.android.ugc.aweme.tools.draft.ftc.c.b) this.f139644a.this$0.f139638f.getValue());
                }
            }).a(KidsDraftFeedViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    static final class c extends m implements h.f.a.a<KidsDraftOptionViewModel> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(91287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ KidsDraftOptionViewModel invoke() {
            ac a2 = new ad(this.this$0.requireActivity(), new ad.b() {
                /* class com.ss.android.ugc.aweme.tools.draft.ftc.pages.h.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(91288);
                }

                @Override // androidx.lifecycle.ad.b
                public final <T extends ac> T a(Class<T> cls) {
                    l.d(cls, "");
                    return new KidsDraftOptionViewModel();
                }
            }).a(KidsDraftOptionViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        a.C3682a a2 = a().a(this.f139635c - 1);
        if (a2 != null) {
            a2.a(false);
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.tools.draft.ftc.a.a> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(91291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.tools.draft.ftc.a.a invoke() {
            Context context = this.this$0.getContext();
            if (context == null) {
                l.b();
            }
            l.b(context, "");
            androidx.lifecycle.m viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            l.b(viewLifecycleOwner, "");
            return new com.ss.android.ugc.aweme.tools.draft.ftc.a.a(context, viewLifecycleOwner, (h.f.a.b) this.this$0.f139639g.getValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        VideoDownloadStatusBar.a.a();
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ftc.c.b());
        if (EventBus.a().a(this)) {
            EventBus.a().b(this);
        }
        VideoDownloadStatusBar.f139750i.remove(this);
        com.ss.android.ugc.aweme.tools.draft.ftc.util.c.f139655d = true;
        HashMap hashMap = this.f139643m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar.c
    public final void c() {
        String str;
        com.ss.android.ugc.aweme.tools.draft.ftc.util.c cVar = this.f139637e;
        if (cVar == null) {
            l.a("downloadHelper");
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            l.b();
        }
        VideoPublishEditModel videoPublishEditModel = this.f139633a;
        androidx.lifecycle.m viewLifecycleOwner = getViewLifecycleOwner();
        l.b(viewLifecycleOwner, "");
        FTCPreviewSurfaceView fTCPreviewSurfaceView = (FTCPreviewSurfaceView) a(R.id.d8k);
        l.b(fTCPreviewSurfaceView, "");
        cVar.a(activity, videoPublishEditModel, viewLifecycleOwner, fTCPreviewSurfaceView);
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.g.a().A().e();
        String str2 = null;
        if (e2 != null) {
            str = e2.c();
        } else {
            str = null;
        }
        com.ss.android.ugc.tools.f.b a2 = bVar.a("author_id", str);
        com.ss.android.ugc.aweme.draft.model.c cVar2 = this.f139634b;
        if (cVar2 != null) {
            str2 = cVar2.f();
        }
        r.a("download_retry", a2.a("group_id", str2).f149193a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        dmt.av.video.z a2;
        super.onDestroy();
        com.ss.android.ugc.aweme.tools.draft.ftc.a.a a3 = a();
        for (Map.Entry<Integer, a.C3682a> entry : a3.f139524c.entrySet()) {
            int intValue = entry.getKey().intValue();
            entry.getValue();
            a.C3682a aVar = a3.f139524c.get(Integer.valueOf(intValue));
            if (!(aVar == null || (a2 = aVar.a()) == null)) {
                a2.b();
            }
        }
    }

    public static final class j implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f139649a;

        static {
            Covode.recordClassIndex(91299);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(h hVar) {
            this.f139649a = hVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            com.ss.android.ugc.aweme.draft.model.c cVar;
            int count = this.f139649a.a().getCount();
            int i3 = 0;
            while (true) {
                boolean z = true;
                if (i3 >= count) {
                    break;
                }
                a.C3682a a2 = this.f139649a.a().a(i3);
                if (a2 != null) {
                    if (i3 != i2) {
                        z = false;
                    }
                    a2.a(z);
                }
                i3++;
            }
            h hVar = this.f139649a;
            hVar.f139633a = hVar.a().f139523b.get(i2);
            h hVar2 = this.f139649a;
            VideoPublishEditModel videoPublishEditModel = hVar2.f139633a;
            if (videoPublishEditModel != null) {
                new bn("VideoPublishFragment");
                cVar = bn.b(videoPublishEditModel);
            } else {
                cVar = null;
            }
            hVar2.f139634b = cVar;
            this.f139649a.f139635c = i2 + 1;
            h hVar3 = this.f139649a;
            if (com.ss.android.ugc.aweme.tools.draft.ftc.util.c.f139654c) {
                hVar3.a(true);
                if (hVar3.a(R.id.ap9) != null) {
                    ((VideoDownloadStatusBar) hVar3.a(R.id.ap9)).a(VideoDownloadStatusBar.f139752k);
                }
            } else {
                if (hVar3.a(R.id.ap9) != null) {
                    hVar3.a(R.id.ap9);
                    if (VideoDownloadStatusBar.f139751j.hasMessages(1)) {
                        hVar3.a(true);
                        ((VideoDownloadStatusBar) hVar3.a(R.id.ap9)).b();
                    }
                }
                if (hVar3.a(R.id.ap9) != null) {
                    hVar3.a(R.id.ap9);
                    if (VideoDownloadStatusBar.f139751j.hasMessages(2)) {
                        hVar3.a(true);
                        ((VideoDownloadStatusBar) hVar3.a(R.id.ap9)).c();
                    }
                }
                hVar3.a(false);
            }
            if (i2 == this.f139649a.a().getCount() - 1) {
                LoadMoreFrameLayout loadMoreFrameLayout = (LoadMoreFrameLayout) this.f139649a.a(R.id.cic);
                DmtStatusView a3 = loadMoreFrameLayout.a(true);
                if (a3 != null) {
                    a3.g();
                }
                loadMoreFrameLayout.f139680d = 1;
                if (loadMoreFrameLayout.f139677a != null) {
                    loadMoreFrameLayout.a();
                }
                if (loadMoreFrameLayout.f139682f != -1 && !TextUtils.isEmpty(loadMoreFrameLayout.f139683g)) {
                    loadMoreFrameLayout.f139682f = -1;
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            if (this.f139649a.f139636d && f2 == 0.0f && i3 == 0) {
                onPageSelected(i2);
                this.f139649a.f139636d = false;
            }
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f139648a;

        static {
            Covode.recordClassIndex(91298);
        }

        i(h hVar) {
            this.f139648a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f139648a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f139646a;

        static {
            Covode.recordClassIndex(91296);
        }

        g(h hVar) {
            this.f139646a = hVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.account.model.a aVar = (com.ss.android.ugc.aweme.account.model.a) obj;
            com.ss.android.ugc.aweme.tools.draft.ftc.a.a a2 = this.f139646a.a();
            l.b(aVar, "");
            l.d(aVar, "");
            a2.f139522a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.h$h  reason: collision with other inner class name */
    static final class C3687h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f139647a;

        static {
            Covode.recordClassIndex(91297);
        }

        C3687h(h hVar) {
            this.f139647a = hVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            VideoPublishEditModel videoPublishEditModel;
            List list = (List) obj;
            VerticalViewPager verticalViewPager = (VerticalViewPager) this.f139647a.a(R.id.b14);
            l.b(verticalViewPager, "");
            verticalViewPager.setVisibility(0);
            TuxStatusView tuxStatusView = (TuxStatusView) this.f139647a.a(R.id.chk);
            l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
            com.ss.android.ugc.aweme.tools.draft.ftc.a.a a2 = this.f139647a.a();
            l.b(list, "");
            l.d(list, "");
            a2.f139523b.clear();
            a2.f139523b.addAll(list);
            this.f139647a.a().notifyDataSetChanged();
            com.ss.android.ugc.aweme.draft.model.c cVar = h.f139631h;
            if (cVar != null) {
                new bn("AwemeDraftViewHolder");
                videoPublishEditModel = bn.a(cVar);
            } else {
                videoPublishEditModel = null;
            }
            int a3 = h.a(list, videoPublishEditModel);
            if (a3 != 0) {
                ((VerticalViewPager) this.f139647a.a(R.id.b14)).a(a3, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        if (a(R.id.ap9) == null) {
            return;
        }
        if (z) {
            VideoDownloadStatusBar videoDownloadStatusBar = (VideoDownloadStatusBar) a(R.id.ap9);
            l.b(videoDownloadStatusBar, "");
            videoDownloadStatusBar.setVisibility(0);
            if (a(R.id.b18) != null) {
                FrameLayout frameLayout3 = (FrameLayout) a(R.id.b18);
                l.b(frameLayout3, "");
                frameLayout3.setVisibility(0);
                a.C3682a a2 = a().a(this.f139635c - 1);
                if (a2 != null && (frameLayout2 = a2.f139539k) != null) {
                    ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = (int) com.ss.android.ttve.utils.b.b(getContext(), 37.0f);
                    }
                    if (frameLayout2 != null) {
                        frameLayout2.setLayoutParams(layoutParams);
                        frameLayout2.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        VideoDownloadStatusBar videoDownloadStatusBar2 = (VideoDownloadStatusBar) a(R.id.ap9);
        l.b(videoDownloadStatusBar2, "");
        videoDownloadStatusBar2.setVisibility(8);
        if (a(R.id.b18) != null) {
            FrameLayout frameLayout4 = (FrameLayout) a(R.id.b18);
            l.b(frameLayout4, "");
            frameLayout4.setVisibility(8);
            a.C3682a a3 = a().a(this.f139635c - 1);
            if (a3 != null && (frameLayout = a3.f139539k) != null) {
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = 0;
                }
                if (frameLayout != null) {
                    frameLayout.setLayoutParams(layoutParams2);
                    frameLayout.requestLayout();
                }
            }
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f139645a;

        static {
            Covode.recordClassIndex(91292);
        }

        f(h hVar) {
            this.f139645a = hVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            T t;
            int i2;
            androidx.fragment.app.i supportFragmentManager;
            String str;
            com.ss.android.ugc.aweme.tools.draft.ftc.util.a aVar = (com.ss.android.ugc.aweme.tools.draft.ftc.util.a) obj;
            String str2 = null;
            if (aVar.f139651a) {
                t = null;
            } else {
                aVar.f139651a = true;
                t = aVar.f139652b;
            }
            T t2 = t;
            if (t2 != null) {
                i2 = t2.f139671a;
            } else {
                i2 = -1;
            }
            ((VerticalViewPager) this.f139645a.a(R.id.b14)).a(i2, false);
            if (t2 instanceof e.c) {
                this.f139645a.f139637e = new com.ss.android.ugc.aweme.tools.draft.ftc.util.c();
                com.ss.android.ugc.aweme.tools.draft.ftc.util.c cVar = this.f139645a.f139637e;
                if (cVar == null) {
                    l.a("downloadHelper");
                }
                androidx.fragment.app.e activity = this.f139645a.getActivity();
                if (activity == null) {
                    l.b();
                }
                VideoPublishEditModel videoPublishEditModel = this.f139645a.f139633a;
                androidx.lifecycle.m viewLifecycleOwner = this.f139645a.getViewLifecycleOwner();
                l.b(viewLifecycleOwner, "");
                FTCPreviewSurfaceView fTCPreviewSurfaceView = (FTCPreviewSurfaceView) this.f139645a.a(R.id.d8k);
                l.b(fTCPreviewSurfaceView, "");
                cVar.a(activity, videoPublishEditModel, viewLifecycleOwner, fTCPreviewSurfaceView);
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("enter_from", "personal_homepage");
                com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.g.a().A().e();
                if (e2 != null) {
                    str = e2.c();
                } else {
                    str = null;
                }
                com.ss.android.ugc.tools.f.b a3 = a2.a("author_id", str);
                com.ss.android.ugc.aweme.draft.model.c cVar2 = this.f139645a.f139634b;
                if (cVar2 != null) {
                    str2 = cVar2.f();
                }
                r.a("download", a3.a("group_id", str2).a("download_method", "click_download_icon").f149193a);
            } else if (t2 instanceof e.b) {
                ak.a(this.f139645a.getActivity(), this.f139645a.f139634b, 0, System.currentTimeMillis(), null);
                androidx.fragment.app.e activity2 = this.f139645a.getActivity();
                if (!(activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null)) {
                    supportFragmentManager.a().a(this.f139645a).b();
                }
                com.ss.android.ugc.tools.f.b a4 = new com.ss.android.ugc.tools.f.b().a("enter_from", "personal_homepage");
                com.ss.android.ugc.aweme.draft.model.c cVar3 = this.f139645a.f139634b;
                if (cVar3 != null) {
                    str2 = cVar3.f();
                }
                r.a("click_edit_video", a4.a("group_id", str2).f149193a);
            } else if (t2 instanceof e.a) {
                com.ss.android.ugc.tools.f.b a5 = new com.ss.android.ugc.tools.f.b().a("enter_from", "personal_homepage");
                VideoPublishEditModel videoPublishEditModel2 = this.f139645a.f139633a;
                if (videoPublishEditModel2 != null) {
                    str2 = videoPublishEditModel2.creationId;
                }
                r.a("click_delete_video", a5.a("group_id", str2).f149193a);
                Context context = this.f139645a.getContext();
                if (context == null) {
                    l.b();
                }
                l.b(context, "");
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).b(R.string.ctx), new h.f.a.b<com.bytedance.tux.dialog.b.b, z>(this) {
                    /* class com.ss.android.ugc.aweme.tools.draft.ftc.pages.h.f.AnonymousClass1 */
                    final /* synthetic */ f this$0;

                    static {
                        Covode.recordClassIndex(91293);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                        com.bytedance.tux.dialog.b.b bVar2 = bVar;
                        l.d(bVar2, "");
                        bVar2.b(R.string.ctz, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                            /* class com.ss.android.ugc.aweme.tools.draft.ftc.pages.h.f.AnonymousClass1.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            static {
                                Covode.recordClassIndex(91294);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                String str;
                                l.d(aVar, "");
                                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("enter_from", "personal_homepage");
                                VideoPublishEditModel videoPublishEditModel = this.this$0.this$0.f139645a.f139633a;
                                if (videoPublishEditModel != null) {
                                    str = videoPublishEditModel.creationId;
                                } else {
                                    str = null;
                                }
                                r.a("cancel_delete_video", a2.a("group_id", str).f149193a);
                                return z.f158842a;
                            }
                        });
                        bVar2.c(R.string.cty, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                            /* class com.ss.android.ugc.aweme.tools.draft.ftc.pages.h.f.AnonymousClass1.AnonymousClass2 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            static {
                                Covode.recordClassIndex(91295);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                String str;
                                androidx.fragment.app.i supportFragmentManager;
                                l.d(aVar, "");
                                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("enter_from", "personal_homepage");
                                VideoPublishEditModel videoPublishEditModel = this.this$0.this$0.f139645a.f139633a;
                                if (videoPublishEditModel != null) {
                                    str = videoPublishEditModel.creationId;
                                } else {
                                    str = null;
                                }
                                r.a("confirm_delete_video", a2.a("group_id", str).f149193a);
                                com.ss.android.ugc.aweme.draft.model.c cVar = this.this$0.this$0.f139645a.f139634b;
                                ae o = com.ss.android.ugc.aweme.port.in.l.f115658a.o();
                                if (cVar == null) {
                                    l.b();
                                }
                                String r = cVar.r();
                                l.b(r, "");
                                o.a(r);
                                ai.a().b(cVar, "user_click");
                                com.ss.android.ugc.aweme.draft.model.d.g(cVar);
                                com.ss.android.ugc.aweme.shortvideo.sticker.e.b(cVar.f());
                                com.ss.android.ugc.aweme.draft.model.c cVar2 = this.this$0.this$0.f139645a.f139634b;
                                if (cVar2 == null) {
                                    l.b();
                                }
                                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ftc.c.a(cVar2));
                                new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.this$0.f139645a.getActivity()).a(R.string.cu0).a();
                                androidx.fragment.app.e activity = this.this$0.this$0.f139645a.getActivity();
                                if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
                                    supportFragmentManager.a().a(this.this$0.this$0.f139645a).b();
                                }
                                return z.f158842a;
                            }
                        });
                        return z.f158842a;
                    }
                }).a().b().show();
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void handleDownloadVideoStatus(com.ss.android.ugc.aweme.tools.draft.ftc.util.b bVar) {
        boolean z;
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        l.d(bVar, "");
        b bVar2 = bVar.f139653a;
        if (bVar2 == null || b.f139574a != 3) {
            z = true;
        } else {
            z = false;
        }
        a(z);
        String str7 = null;
        if (bVar2 != null) {
            num = Integer.valueOf(b.f139574a);
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 1) {
                VideoDownloadStatusBar videoDownloadStatusBar = (VideoDownloadStatusBar) a(R.id.ap9);
                VideoDownloadStatusBar.d();
                videoDownloadStatusBar.a();
                VideoDownloadStatusBar.f139752k = 0;
                ImageView imageView = videoDownloadStatusBar.f139755b;
                if (imageView == null) {
                    l.a("mDownloadSuccessImageView");
                }
                imageView.setVisibility(8);
                TextView textView = videoDownloadStatusBar.f139756c;
                if (textView == null) {
                    l.a("mDownloadSuccessTextView");
                }
                textView.setVisibility(8);
                TextView textView2 = videoDownloadStatusBar.f139759f;
                if (textView2 == null) {
                    l.a("mDownloadFailedTextView");
                }
                textView2.setVisibility(8);
                RelativeLayout relativeLayout = videoDownloadStatusBar.f139754a;
                if (relativeLayout == null) {
                    l.a("mDownloadProgressViewRoot");
                }
                relativeLayout.setBackgroundColor(Color.parseColor("#383838"));
                RelativeLayout relativeLayout2 = videoDownloadStatusBar.f139754a;
                if (relativeLayout2 == null) {
                    l.a("mDownloadProgressViewRoot");
                }
                relativeLayout2.setVisibility(0);
                TextView textView3 = videoDownloadStatusBar.f139757d;
                if (textView3 == null) {
                    l.a("mDownloadProgressView");
                }
                textView3.setVisibility(0);
                TextView textView4 = videoDownloadStatusBar.f139758e;
                if (textView4 == null) {
                    l.a("mDownloadingStatusTextView");
                }
                textView4.setVisibility(0);
                TextView textView5 = videoDownloadStatusBar.f139760g;
                if (textView5 == null) {
                    l.a("mDownloadVideoCancelView");
                }
                textView5.setVisibility(0);
                RelativeLayout relativeLayout3 = videoDownloadStatusBar.f139754a;
                if (relativeLayout3 == null) {
                    l.a("mDownloadProgressViewRoot");
                }
                relativeLayout3.requestLayout();
                VideoPublishEditModel videoPublishEditModel = b.f139576c;
                if (videoPublishEditModel != null) {
                    str2 = videoPublishEditModel.creationId;
                } else {
                    str2 = null;
                }
                VideoPublishEditModel videoPublishEditModel2 = this.f139633a;
                if (videoPublishEditModel2 != null) {
                    str7 = videoPublishEditModel2.creationId;
                }
                a(l.a((Object) str2, (Object) str7));
                r.a("download_start", new com.ss.android.ugc.tools.f.b().a("start_download", System.currentTimeMillis()).f149193a);
                return;
            } else if (num.intValue() == 2) {
                VideoPublishEditModel videoPublishEditModel3 = b.f139576c;
                if (videoPublishEditModel3 != null) {
                    str = videoPublishEditModel3.creationId;
                } else {
                    str = null;
                }
                VideoPublishEditModel videoPublishEditModel4 = this.f139633a;
                if (videoPublishEditModel4 != null) {
                    str7 = videoPublishEditModel4.creationId;
                }
                if (l.a((Object) str, (Object) str7)) {
                    ((VideoDownloadStatusBar) a(R.id.ap9)).a(b.f139575b);
                    return;
                } else {
                    a(false);
                    return;
                }
            } else if (num.intValue() == 3) {
                com.ss.android.ugc.aweme.tools.draft.ftc.util.c cVar = this.f139637e;
                if (cVar == null) {
                    l.a("downloadHelper");
                }
                cVar.f139657a = true;
                return;
            }
        }
        if (num != null) {
            if (num.intValue() == 4) {
                VideoPublishEditModel videoPublishEditModel5 = b.f139576c;
                if (videoPublishEditModel5 != null) {
                    str4 = videoPublishEditModel5.creationId;
                } else {
                    str4 = null;
                }
                VideoPublishEditModel videoPublishEditModel6 = this.f139633a;
                if (videoPublishEditModel6 != null) {
                    str5 = videoPublishEditModel6.creationId;
                } else {
                    str5 = null;
                }
                if (l.a((Object) str4, (Object) str5)) {
                    ((VideoDownloadStatusBar) a(R.id.ap9)).b();
                    a(true);
                } else {
                    a(false);
                    com.ss.android.ugc.aweme.tux.a.i.a a2 = new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.cti);
                    com.bytedance.tux.g.b bVar3 = a2.f141585a;
                    if (bVar3 != null) {
                        bVar3.b(R.raw.icon_tick_fill_small);
                    }
                    com.bytedance.tux.g.b bVar4 = a2.f141585a;
                    if (bVar4 != null) {
                        bVar4.d(R.attr.aw);
                    }
                    a2.a();
                }
                com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("end_download", System.currentTimeMillis());
                com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.g.a().A().e();
                if (e2 != null) {
                    str6 = e2.c();
                } else {
                    str6 = null;
                }
                com.ss.android.ugc.tools.f.b a4 = a3.a("author_id", str6);
                if (videoPublishEditModel5 != null) {
                    str7 = videoPublishEditModel5.creationId;
                }
                r.a("download_end", a4.a("group_id", str7).a("is_self_video", 1).f149193a);
            } else if (num.intValue() == 5) {
                ((VideoDownloadStatusBar) a(R.id.ap9)).c();
                a(true);
                com.ss.android.ugc.tools.f.b bVar5 = new com.ss.android.ugc.tools.f.b();
                com.ss.android.ugc.aweme.account.model.a e3 = com.ss.android.ugc.aweme.port.in.g.a().A().e();
                if (e3 != null) {
                    str3 = e3.c();
                } else {
                    str3 = null;
                }
                com.ss.android.ugc.tools.f.b a5 = bVar5.a("author_id", str3);
                com.ss.android.ugc.aweme.draft.model.c cVar2 = this.f139634b;
                if (cVar2 != null) {
                    str7 = cVar2.f();
                }
                r.a("download_fail", a5.a("group_id", str7).f149193a);
            }
        }
    }

    public static int a(List<? extends VideoPublishEditModel> list, VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return 0;
        }
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            if (l.a((Object) videoPublishEditModel.creationId, (Object) t.creationId)) {
                return i2;
            }
            i2 = i3;
        }
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((TuxStatusView) a(R.id.chk)).setStatus(new TuxStatusView.c());
        ((TuxStatusView) a(R.id.chk)).a();
        ((AVAutoRTLImageView) a(R.id.qb)).setOnClickListener(new i(this));
        VideoDownloadStatusBar.f139750i.add(this);
        ((VideoDownloadStatusBar) a(R.id.ap9)).setVideoDownloadClickListener(this);
        VerticalViewPager verticalViewPager = (VerticalViewPager) a(R.id.b14);
        l.b(verticalViewPager, "");
        verticalViewPager.setAdapter(a());
        VerticalViewPager verticalViewPager2 = (VerticalViewPager) a(R.id.b14);
        l.b(verticalViewPager2, "");
        verticalViewPager2.setVisibility(8);
        ((com.ss.android.ugc.aweme.common.widget.b) a(R.id.b14)).a(new j(this));
        LoadMoreFrameLayout loadMoreFrameLayout = (LoadMoreFrameLayout) a(R.id.cic);
        loadMoreFrameLayout.f139677a = (com.ss.android.ugc.aweme.common.widget.c) a(R.id.b14);
        loadMoreFrameLayout.f139678b = null;
        KidsDraftFeedViewModel b2 = b();
        b2.f139768a = kotlinx.coroutines.i.a(bs.f159054a, null, null, new KidsDraftFeedViewModel.a(b2, null), 3);
        ((KidsDraftOptionViewModel) this.f139642l.getValue()).f139772a.observe(getViewLifecycleOwner(), new f(this));
        b().f139769b.observe(getViewLifecycleOwner(), new g(this));
        b().f139770c.observe(getViewLifecycleOwner(), new C3687h(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        a.C1099a.a(this).a(R.color.a2).b(false).f44923a.d();
        if (!EventBus.a().a(this)) {
            EventBus.a(EventBus.a(), this);
        }
        com.ss.android.ugc.aweme.tools.draft.ftc.util.c.f139655d = false;
        return com.a.a(layoutInflater, R.layout.adp, viewGroup, false);
    }
}
