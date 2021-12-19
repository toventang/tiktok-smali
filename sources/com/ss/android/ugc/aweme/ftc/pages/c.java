package com.ss.android.ugc.aweme.ftc.pages;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView;
import com.ss.android.ugc.aweme.port.in.bh;
import com.ss.android.ugc.aweme.property.bt;
import com.ss.android.ugc.aweme.property.ch;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cover.MvEffectVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c;
import com.ss.android.ugc.aweme.shortvideo.util.ax;
import com.ss.android.ugc.aweme.shortvideo.widget.o;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class c extends Fragment implements FTCChooseCoverView.a {

    /* renamed from: a  reason: collision with root package name */
    public a f98853a;

    /* renamed from: b  reason: collision with root package name */
    public float f98854b;

    /* renamed from: c  reason: collision with root package name */
    public t<Bitmap> f98855c;

    /* renamed from: d  reason: collision with root package name */
    public t<Boolean> f98856d;

    /* renamed from: e  reason: collision with root package name */
    public SafeHandler f98857e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f98858f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.cover.a f98859g;

    /* renamed from: h  reason: collision with root package name */
    public RecyclerView.a<RecyclerView.ViewHolder> f98860h;

    /* renamed from: i  reason: collision with root package name */
    com.ss.android.ugc.tools.view.e.b f98861i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f98862j;

    /* renamed from: k  reason: collision with root package name */
    private HashMap f98863k;

    static final class i implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static final i f98874a = new i();

        static {
            Covode.recordClassIndex(62861);
        }

        i() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(62848);
    }

    public final View a(int i2) {
        if (this.f98863k == null) {
            this.f98863k = new HashMap();
        }
        View view = (View) this.f98863k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f98863k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.c$c  reason: collision with other inner class name */
    static final class C2405c implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98866a;

        static {
            Covode.recordClassIndex(62851);
        }

        C2405c(c cVar) {
            this.f98866a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a
        public final void a() {
            this.f98866a.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        RecyclerView.a<RecyclerView.ViewHolder> aVar = this.f98860h;
        if (aVar instanceof o) {
            ((o) aVar).a();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f98863k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98875a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f98876b;

        static {
            Covode.recordClassIndex(62862);
        }

        j(c cVar, long j2) {
            this.f98875a = cVar;
            this.f98876b = j2;
        }

        public final void run() {
            this.f98875a.f98858f = false;
            c.a(this.f98875a).b().setValue(dmt.av.video.t.b(this.f98876b));
            this.f98875a.a(this.f98876b);
        }
    }

    public final int a() {
        FrameLayout frameLayout = (FrameLayout) a(R.id.bf2);
        l.b(frameLayout, "");
        return frameLayout.getMeasuredHeight();
    }

    public final boolean c() {
        if (!isAdded()) {
            return false;
        }
        requireFragmentManager().a().a(this).c();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.a
    public final void d() {
        SafeHandler safeHandler = this.f98857e;
        if (safeHandler == null) {
            l.a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        dmt.av.video.t b2 = dmt.av.video.t.b();
        a aVar = this.f98853a;
        if (aVar == null) {
            l.a("mDependency");
        }
        aVar.b().setValue(b2);
    }

    public static final class e extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98871a;

        static {
            Covode.recordClassIndex(62855);
        }

        static final class a extends m implements h.f.a.a<z> {
            final /* synthetic */ VideoPublishEditModel $editModel;
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(62856);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar, VideoPublishEditModel videoPublishEditModel) {
                super(0);
                this.this$0 = eVar;
                this.$editModel = videoPublishEditModel;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                c cVar = this.this$0.f98871a;
                VideoPublishEditModel videoPublishEditModel = this.$editModel;
                videoPublishEditModel.getCoverPublishModel().setVideoCoverViewX(((FTCChooseCoverView) cVar.a(R.id.ff_)).getVideoCoverViewX());
                videoPublishEditModel.mVideoCoverStartTm = cVar.f98854b / 1000.0f;
                if (videoPublishEditModel.isMvThemeVideoType()) {
                    videoPublishEditModel.mvCreateVideoData.videoCoverStartTime = (int) cVar.f98854b;
                    cVar.f98861i = com.ss.android.ugc.tools.view.e.b.b(cVar.getContext(), "");
                    com.ss.android.ugc.tools.view.e.b bVar = cVar.f98861i;
                    if (bVar != null) {
                        bVar.setIndeterminate(true);
                    }
                    a aVar = cVar.f98853a;
                    if (aVar == null) {
                        l.a("mDependency");
                    }
                    new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c(aVar.a(), videoPublishEditModel.mvCreateVideoData.videoCoverImgPath, videoPublishEditModel.mvCreateVideoData.videoCoverStartTime, new a(videoPublishEditModel), b.f98865a, new C2405c(cVar));
                } else {
                    cVar.b();
                }
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(c cVar) {
            this.f98871a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            VideoPublishEditModel c2 = c.a(this.f98871a).c();
            com.ss.android.ugc.asve.editor.g a2 = c.a(this.f98871a).a();
            boolean z = !ax.a(c2.mVideoCoverStartTm, this.f98871a.f98854b / 1000.0f);
            bh K = com.ss.android.ugc.aweme.port.in.g.a().K();
            a2.b();
            a2.b();
            K.a(c2, z, new a(this, c2));
            r.a("save_cover_edit", new com.ss.android.ugc.tools.f.b().a("creation_id", c2.creationId).a("enter_from", "video_edit_page").a("shoot_way", "direct_shoot").a("shoot_entrance", "direct_shoot").f149193a);
        }
    }

    public final boolean b() {
        SafeHandler safeHandler = this.f98857e;
        if (safeHandler == null) {
            l.a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        dmt.av.video.t b2 = dmt.av.video.t.b();
        a aVar = this.f98853a;
        if (aVar == null) {
            l.a("mDependency");
        }
        aVar.b().setValue(b2);
        a aVar2 = this.f98853a;
        if (aVar2 == null) {
            l.a("mDependency");
        }
        aVar2.a().a(true);
        dmt.av.video.t a2 = dmt.av.video.t.a();
        a aVar3 = this.f98853a;
        if (aVar3 == null) {
            l.a("mDependency");
        }
        aVar3.b().setValue(a2);
        if (getFragmentManager() == null) {
            return false;
        }
        return c();
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f98868b;

        static {
            Covode.recordClassIndex(62852);
        }

        d(c cVar, VideoPublishEditModel videoPublishEditModel) {
            this.f98867a = cVar;
            this.f98868b = videoPublishEditModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a */
        /* JADX WARN: Multi-variable type inference failed */
        public final void run() {
            o oVar;
            FTCChooseCoverView fTCChooseCoverView = (FTCChooseCoverView) this.f98867a.a(R.id.ff_);
            l.b(fTCChooseCoverView, "");
            int measuredHeight = fTCChooseCoverView.getMeasuredHeight();
            int oneThumbWidth = (int) ((FTCChooseCoverView) this.f98867a.a(R.id.ff_)).getOneThumbWidth();
            c cVar = this.f98867a;
            if (cVar.a(this.f98868b)) {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a aVar = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a(oneThumbWidth, measuredHeight);
                ((FTCChooseCoverView) this.f98867a.a(R.id.ff_)).setAdapter(aVar);
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c cVar2 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c();
                cVar2.f128780b = a.f98869a;
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c a2 = cVar2.a(oneThumbWidth, measuredHeight);
                a2.f128790l = this.f98867a.f98855c;
                a2.f128791m = this.f98867a.f98856d;
                a2.a(this.f98867a.getActivity(), c.a(this.f98867a).a(), 7, new b(aVar));
                oVar = aVar;
            } else {
                com.ss.android.ugc.aweme.shortvideo.cover.a aVar2 = this.f98867a.f98859g;
                if (aVar2 == null) {
                    l.a("mEffectVideoCoverGenerator");
                }
                o oVar2 = new o(aVar2, oneThumbWidth, measuredHeight, (byte) 0);
                ((FTCChooseCoverView) this.f98867a.a(R.id.ff_)).setAdapter(oVar2);
                oVar = oVar2;
            }
            cVar.f98860h = oVar;
        }

        static final class b implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.i {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a f98870a;

            static {
                Covode.recordClassIndex(62854);
            }

            b(com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a aVar) {
                this.f98870a = aVar;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.i
            public final void a(List<Bitmap> list) {
                this.f98870a.a(list);
            }
        }

        static final class a implements c.b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f98869a = new a();

            static {
                Covode.recordClassIndex(62853);
            }

            a() {
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c.b
            public final void a(String str) {
                com.ss.android.ugc.aweme.port.in.g.a().I().a(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.a
    public final void b(float f2) {
        c(f2);
    }

    static final class b implements c.b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f98865a = new b();

        static {
            Covode.recordClassIndex(62850);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c.b
        public final void a(String str) {
            com.ss.android.ugc.aweme.port.in.g.a().I().a(str);
        }
    }

    public static final /* synthetic */ a a(c cVar) {
        a aVar = cVar.f98853a;
        if (aVar == null) {
            l.a("mDependency");
        }
        return aVar;
    }

    public static final class f extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f98872a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f98873b;

        static {
            Covode.recordClassIndex(62857);
        }

        static final class a extends m implements h.f.a.b<Boolean, z> {
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(62858);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.this$0 = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Boolean bool) {
                Boolean bool2 = bool;
                if (bool2 != null && bool2.booleanValue()) {
                    this.this$0.f98872a.c();
                }
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            com.ss.android.ugc.aweme.port.in.g.a().K().a(!ax.a(this.f98873b.mVideoCoverStartTm, this.f98872a.f98854b / 1000.0f), new a(this));
        }

        f(c cVar, VideoPublishEditModel videoPublishEditModel) {
            this.f98872a = cVar;
            this.f98873b = videoPublishEditModel;
        }
    }

    static final class a<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f98864a;

        static {
            Covode.recordClassIndex(62849);
        }

        a(VideoPublishEditModel videoPublishEditModel) {
            this.f98864a = videoPublishEditModel;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            l.d(bitmap, "");
            return this.f98864a.getCoverPublishModel().getEffectTextModel().mergeCoverText(bitmap);
        }
    }

    private final int d(float f2) {
        a aVar = this.f98853a;
        if (aVar == null) {
            l.a("mDependency");
        }
        return (int) (((float) aVar.a().j()) * f2);
    }

    static final class h extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    FrameLayout frameLayout = (FrameLayout) this.this$0.a(R.id.bf2);
                    l.b(frameLayout, "");
                    frameLayout.setVisibility(4);
                } else {
                    FrameLayout frameLayout2 = (FrameLayout) this.this$0.a(R.id.bf2);
                    l.b(frameLayout2, "");
                    frameLayout2.setVisibility(0);
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(float f2) {
        this.f98858f = true;
        dmt.av.video.t b2 = dmt.av.video.t.b((long) d(f2));
        a aVar = this.f98853a;
        if (aVar == null) {
            l.a("mDependency");
        }
        aVar.b().setValue(b2);
        a(b2.f156955b);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        l.d(context, "");
        super.onAttach(context);
        if (context instanceof a) {
            this.f98853a = (a) context;
            this.f98862j = ch.a();
            eu.c((Activity) context);
            return;
        }
        throw new IllegalStateException("context must implement ArgumentsDependency");
    }

    static final class g extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ h.f.a.b $function;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(62859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar, h.f.a.b bVar) {
            super(1);
            this.this$0 = cVar;
            this.$function = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                SafeHandler safeHandler = this.this$0.f98857e;
                if (safeHandler == null) {
                    l.a("mSafeHandler");
                }
                safeHandler.removeCallbacksAndMessages(null);
                c.a(this.this$0).b().setValue(dmt.av.video.t.b());
                c.a(this.this$0).a().a(true);
                c.a(this.this$0).b().setValue(dmt.av.video.t.a());
                if (this.this$0.getFragmentManager() == null) {
                    this.$function.invoke(false);
                } else {
                    this.this$0.requireFragmentManager().a().a(this.this$0).c();
                    this.$function.invoke(true);
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.a
    public final void a(float f2) {
        this.f98858f = true;
        dmt.av.video.t a2 = dmt.av.video.t.a((long) d(f2));
        a aVar = this.f98853a;
        if (aVar == null) {
            l.a("mDependency");
        }
        aVar.b().setValue(a2);
    }

    public final void a(long j2) {
        dmt.av.video.t b2 = dmt.av.video.t.b();
        a aVar = this.f98853a;
        if (aVar == null) {
            l.a("mDependency");
        }
        aVar.b().setValue(b2);
        dmt.av.video.t a2 = dmt.av.video.t.a();
        a aVar2 = this.f98853a;
        if (aVar2 == null) {
            l.a("mDependency");
        }
        aVar2.b().setValue(a2);
        SafeHandler safeHandler = this.f98857e;
        if (safeHandler == null) {
            l.a("mSafeHandler");
        }
        safeHandler.postDelayed(new j(this, j2), 1000);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        x.a aVar;
        com.ss.android.ugc.aweme.shortvideo.cover.a vEVideoCoverGeneratorImpl;
        super.onActivityCreated(bundle);
        this.f98857e = new SafeHandler(this);
        a aVar2 = this.f98853a;
        if (aVar2 == null) {
            l.a("mDependency");
        }
        VideoPublishEditModel c2 = aVar2.c();
        if (bt.a()) {
            aVar = x.a.GET_FRAMES_MODE_NORMAL;
        } else {
            aVar = x.a.GET_FRAMES_MODE_NOEFFECT;
        }
        a aVar3 = this.f98853a;
        if (aVar3 == null) {
            l.a("mDependency");
        }
        if (a(aVar3.c())) {
            a aVar4 = this.f98853a;
            if (aVar4 == null) {
                l.a("mDependency");
            }
            vEVideoCoverGeneratorImpl = new MvEffectVideoCoverGeneratorImpl(aVar4.a().j());
        } else if (c2.isMultiVideoEdit()) {
            a aVar5 = this.f98853a;
            if (aVar5 == null) {
                l.a("mDependency");
            }
            int j2 = aVar5.a().j();
            a aVar6 = this.f98853a;
            if (aVar6 == null) {
                l.a("mDependency");
            }
            vEVideoCoverGeneratorImpl = new VEMultiEditVideoCoverGeneratorImpl(aVar6.a(), this, ((FTCChooseCoverView) a(R.id.ff_)).getCoverSize(), j2, 0, aVar);
        } else {
            a aVar7 = this.f98853a;
            if (aVar7 == null) {
                l.a("mDependency");
            }
            vEVideoCoverGeneratorImpl = new VEVideoCoverGeneratorImpl(aVar7.a(), this, ((FTCChooseCoverView) a(R.id.ff_)).getCoverSize(), aVar, "choose_cover");
        }
        this.f98859g = vEVideoCoverGeneratorImpl;
        ((FTCChooseCoverView) a(R.id.ff_)).setOnScrollListener(this);
        ((FTCChooseCoverView) a(R.id.ff_)).post(new d(this, c2));
        ((TuxTextView) a(R.id.eum)).setOnClickListener(new e(this));
        ((TuxTextView) a(R.id.eul)).setOnClickListener(new f(this, c2));
    }

    public final boolean a(VideoPublishEditModel videoPublishEditModel) {
        if (this.f98862j || videoPublishEditModel.isMvThemeVideoType()) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.eum);
        l.b(tuxTextView, "");
        TextPaint paint = tuxTextView.getPaint();
        l.b(paint, "");
        paint.setFakeBoldText(true);
        androidx.fragment.app.e activity = getActivity();
        if (activity instanceof androidx.appcompat.app.d) {
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.euo);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
            bh K = com.ss.android.ugc.aweme.port.in.g.a().K();
            androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) activity;
            FrameLayout frameLayout = (FrameLayout) a(R.id.att);
            l.b(frameLayout, "");
            FrameLayout frameLayout2 = (FrameLayout) a(R.id.ats);
            l.b(frameLayout2, "");
            FrameLayout frameLayout3 = (FrameLayout) a(R.id.atu);
            l.b(frameLayout3, "");
            a aVar = this.f98853a;
            if (aVar == null) {
                l.a("mDependency");
            }
            EffectTextModel effectTextModel = aVar.c().getCoverPublishModel().getEffectTextModel();
            a aVar2 = this.f98853a;
            if (aVar2 == null) {
                l.a("mDependency");
            }
            K.a(dVar, "coverpic", "covertext", frameLayout, frameLayout2, frameLayout3, effectTextModel, aVar2.c().getAvetParameter(), new h(this));
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) a(R.id.euo);
            l.b(tuxTextView3, "");
            tuxTextView3.setVisibility(0);
        }
        ((RelativeLayout) a(R.id.fi5)).setOnTouchListener(i.f98874a);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a12, viewGroup, false);
    }
}
