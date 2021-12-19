package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.scene.c.f;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.experiment.fb;
import com.ss.android.ugc.aweme.experiment.gs;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.photo.local.MediaTypeNavigator;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.port.in.at;
import com.ss.android.ugc.aweme.port.in.v;
import com.ss.android.ugc.aweme.property.cx;
import com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener;
import com.ss.android.ugc.aweme.shortvideo.MediaChosenResultProcessFactory;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.bn;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aw;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.b;
import com.ss.android.ugc.aweme.shortvideo.ui.NoticeView;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.utils.Cif;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.vesdk.VEImageDetectUtils;
import com.ss.ugc.aweme.performance.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ao extends com.bytedance.scene.group.b implements com.bytedance.scene.navigation.j, n.a, w, com.ss.android.ugc.tools.view.a.a, com.ss.android.ugc.tools.view.a.b {
    public static final a ah = new a((byte) 0);
    public int A = 3145728;
    public ShortVideoContext B;
    public int C;
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public int H;
    public List<? extends MvImageChooseAdapter.MyMediaModel> I;
    public List<? extends MvImageChooseAdapter.MyMediaModel> J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b P;
    public boolean Q;
    public final com.ss.android.vesdk.ah R = new com.ss.android.vesdk.ah();
    public v S;
    public ChooseMediaViewModel T;
    public com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.b U;
    public String V;
    public String W;
    public String X;
    public String Y;
    public boolean Z = true;
    private long aA = -1;
    private u aB;
    private boolean aC = true;
    private long aD;
    private long aE;
    private MusicModel aF;
    private String aG;
    private String aH;
    private ArrayList<CutSameVideoImageExtraData> aI;
    private com.ss.android.ugc.aweme.port.in.aa aJ = ((com.ss.android.ugc.aweme.port.in.aa) com.ss.android.ugc.aweme.port.in.g.a().s());
    private boolean aK;
    private final h.h aL = h.i.a((h.f.a.a) ak.f128963a);
    private final h.h aM = h.i.a((h.f.a.a) new an(this));
    private final h.h aN = h.i.a((h.f.a.a) new au(this));
    private final boolean aO = gs.a();
    private boolean aP;
    private boolean aQ;
    private boolean aR;
    private boolean aS;
    private boolean aT;
    private boolean aU;
    private final h.h aV = h.i.a((h.f.a.a) av.f128972a);
    public ArrayList<String> aa;
    public boolean ab = true;
    public com.ss.android.ugc.tools.view.a.c ac;
    public long ad = 200;
    long ae = -1;
    public String af = "";
    final List<ValueAnimator> ag = new ArrayList();
    private View ai;
    private View aj;
    private MediaTypeNavigator ak;
    private ak al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private Parcelable as;
    private int at;
    private boolean au;
    private boolean av;
    private int aw = -1;
    private String ax;
    private String ay;
    private long az;

    /* renamed from: b  reason: collision with root package name */
    public int f128947b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f128948c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f128949d;

    /* renamed from: e  reason: collision with root package name */
    public e f128950e;

    /* renamed from: f  reason: collision with root package name */
    public al f128951f;

    /* renamed from: g  reason: collision with root package name */
    public ae f128952g;

    /* renamed from: h  reason: collision with root package name */
    public l f128953h;

    /* renamed from: i  reason: collision with root package name */
    public NoticeView f128954i;

    /* renamed from: j  reason: collision with root package name */
    public ViewStub f128955j;

    /* renamed from: k  reason: collision with root package name */
    public ViewPager f128956k;

    /* renamed from: l  reason: collision with root package name */
    public int f128957l;
    public int t;
    public int u;
    public int v;
    public String w;
    public String x;
    public final ArrayList<MediaModel> y = new ArrayList<>();
    public SdkExtraInfo z;

    public static final class n implements MvImageChooseAdapter.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f128990b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f128991c;

        static {
            Covode.recordClassIndex(84652);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final boolean a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            return true;
        }

        static final class a extends h.f.b.m implements h.f.a.a<View> {
            final /* synthetic */ View $previewItemView;

            static {
                Covode.recordClassIndex(84653);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view) {
                super(0);
                this.$previewItemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ View invoke() {
                return this.$previewItemView;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.a<MvImageChooseAdapter.MyMediaModel> {
            final /* synthetic */ MvImageChooseAdapter.MyMediaModel $previewMedia;

            static {
                Covode.recordClassIndex(84654);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(MvImageChooseAdapter.MyMediaModel myMediaModel) {
                super(0);
                this.$previewMedia = myMediaModel;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ MvImageChooseAdapter.MyMediaModel invoke() {
                return this.$previewMedia;
            }
        }

        static final class c extends h.f.b.m implements h.f.a.a<Integer> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f128992a = new c();

            static {
                Covode.recordClassIndex(84655);
            }

            c() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                return 3;
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a() {
            this.f128989a.O();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final boolean b() {
            List<MvImageChooseAdapter.MyMediaModel> a2;
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar = this.f128989a.P;
            if (bVar == null || (a2 = bVar.a()) == null || a2.size() < this.f128989a.f128957l) {
                return false;
            }
            return true;
        }

        static final class d extends h.f.b.m implements h.f.a.a<Boolean> {
            final /* synthetic */ n this$0;

            static {
                Covode.recordClassIndex(84656);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(n nVar) {
                super(0);
                this.this$0 = nVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                List<MvImageChooseAdapter.MyMediaModel> a2;
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar = this.this$0.f128989a.P;
                boolean z = false;
                if (!(bVar == null || (a2 = bVar.a()) == null || a2.size() < this.this$0.f128989a.f128957l)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a(MediaModel mediaModel) {
            if (!this.f128989a.K() && !fb.b()) {
                return;
            }
            if (mediaModel == null || !mediaModel.b()) {
                this.f128991c.a(mediaModel);
            } else {
                this.f128990b.a(mediaModel);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final boolean b(MediaModel mediaModel) {
            if (this.f128989a.U == null) {
                return true;
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.b bVar = this.f128989a.U;
            if (bVar == null) {
                h.f.b.l.b();
            }
            return b.a.a(bVar, this.f128989a.q(), this.f128989a.P, mediaModel);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final int a(MvImageChooseAdapter.MyMediaModel myMediaModel, boolean z) {
            this.f128989a.P();
            ChooseMediaViewModel chooseMediaViewModel = this.f128989a.T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.a();
            }
            boolean z2 = true;
            if (myMediaModel == null || !myMediaModel.b()) {
                al alVar = this.f128989a.f128951f;
                if (alVar != null) {
                    alVar.a(myMediaModel, z);
                }
            } else {
                l lVar = this.f128989a.f128953h;
                if (lVar != null) {
                    lVar.a(myMediaModel, z);
                }
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar = this.f128989a.P;
            if (bVar == null) {
                h.f.b.l.b();
            }
            if (myMediaModel == null || !myMediaModel.b()) {
                z2 = false;
            }
            return bVar.a(myMediaModel, z, z2);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel, View view) {
            if (myMediaModel != null && view != null) {
                ChooseMediaViewModel chooseMediaViewModel = this.f128989a.T;
                if (chooseMediaViewModel != null) {
                    chooseMediaViewModel.f128814d = 1;
                    chooseMediaViewModel.b(chooseMediaViewModel.f128813c);
                }
                ao aoVar = this.f128989a;
                aoVar.M = aoVar.a(myMediaModel);
                this.f128989a.O = false;
                this.f128989a.a(new a(view), new b(myMediaModel), c.f128992a, new d(this));
            }
        }

        n(ao aoVar, q qVar, p pVar) {
            this.f128989a = aoVar;
            this.f128990b = qVar;
            this.f128991c = pVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a(List<MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.b bVar, MvImageChooseAdapter.MyMediaModel myMediaModel) {
            int i2;
            int i3;
            boolean z;
            int i4 = 0;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (this.f128989a.K + this.f128989a.L < i2) {
                if (list != null) {
                    z = list.get(h.a.n.a((List) list)).b();
                } else {
                    z = false;
                }
                String str = null;
                if (z) {
                    ao aoVar = this.f128989a;
                    if (myMediaModel != null) {
                        str = myMediaModel.x;
                    }
                    aoVar.a(list, bVar, str);
                } else {
                    ao aoVar2 = this.f128989a;
                    if (myMediaModel != null) {
                        str = myMediaModel.x;
                    }
                    aoVar2.a(bVar, str);
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (list != null) {
                int i5 = 0;
                for (MvImageChooseAdapter.MyMediaModel myMediaModel2 : list) {
                    if (myMediaModel2.b()) {
                        i4++;
                        arrayList2.add(myMediaModel2);
                    } else {
                        i5++;
                        arrayList.add(myMediaModel2);
                    }
                }
                i3 = i4;
                i4 = i5;
            } else {
                i3 = 0;
            }
            this.f128989a.K = i4;
            this.f128989a.L = i3;
            this.f128989a.I = arrayList;
            this.f128989a.J = arrayList2;
            this.f128989a.a(list);
            TextView textView = this.f128989a.f128948c;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public static final class p implements MvImageChooseAdapter.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128994a;

        static {
            Covode.recordClassIndex(84658);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final boolean b(MediaModel mediaModel) {
            return true;
        }

        static final class b extends h.f.b.m implements h.f.a.a<View> {
            final /* synthetic */ View $previewItemView;

            static {
                Covode.recordClassIndex(84660);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(View view) {
                super(0);
                this.$previewItemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ View invoke() {
                return this.$previewItemView;
            }
        }

        static final class c extends h.f.b.m implements h.f.a.a<MvImageChooseAdapter.MyMediaModel> {
            final /* synthetic */ MvImageChooseAdapter.MyMediaModel $previewMedia;

            static {
                Covode.recordClassIndex(84661);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(MvImageChooseAdapter.MyMediaModel myMediaModel) {
                super(0);
                this.$previewMedia = myMediaModel;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ MvImageChooseAdapter.MyMediaModel invoke() {
                return this.$previewMedia;
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a() {
            this.f128994a.O();
        }

        static final class d extends h.f.b.m implements h.f.a.a<Integer> {
            final /* synthetic */ p this$0;

            static {
                Covode.recordClassIndex(84662);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(p pVar) {
                super(0);
                this.this$0 = pVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                int i2;
                if (this.this$0.f128994a.L() || com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(this.this$0.f128994a.f128947b)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return Integer.valueOf(i2);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final boolean b() {
            List<MvImageChooseAdapter.MyMediaModel> a2;
            if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(this.f128994a.f128947b) || this.f128994a.f128947b == 11) {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar = this.f128994a.P;
                if (bVar == null || (a2 = bVar.a()) == null || !(!a2.isEmpty()) || a2.size() < this.f128994a.f128957l) {
                    return false;
                }
                return true;
            } else if (this.f128994a.K >= this.f128994a.f128957l) {
                return true;
            }
            return false;
        }

        static final class e extends h.f.b.m implements h.f.a.a<Boolean> {
            final /* synthetic */ p this$0;

            static {
                Covode.recordClassIndex(84663);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(p pVar) {
                super(0);
                this.this$0 = pVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar;
                List<MvImageChooseAdapter.MyMediaModel> a2;
                boolean z = false;
                if (!com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(this.this$0.f128994a.f128947b) ? this.this$0.f128994a.K >= this.this$0.f128994a.f128957l : !((bVar = this.this$0.f128994a.P) == null || (a2 = bVar.a()) == null || !(!a2.isEmpty()) || a2.size() < this.this$0.f128994a.f128957l)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        p(ao aoVar) {
            this.f128994a = aoVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0148, code lost:
            if (r10 != null) goto L_0x014a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0163  */
        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r10) {
            /*
            // Method dump skipped, instructions count: 372
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao.p.a(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel):void");
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final boolean a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            SdkExtraInfo sdkExtraInfo;
            String mvAlgorithmHint;
            String str;
            SdkExtraInfo sdkExtraInfo2;
            PlDataBean pl;
            List<String> alg;
            if (myMediaModel == null) {
                return false;
            }
            if (this.f128994a.z == null || ((sdkExtraInfo = this.f128994a.z) != null && !sdkExtraInfo.isLegal())) {
                return true;
            }
            String str2 = "";
            if (myMediaModel.f109401m < this.f128994a.v || myMediaModel.f109400l < this.f128994a.u) {
                com.ss.android.ugc.aweme.tux.a.i.a aVar = new com.ss.android.ugc.aweme.tux.a.i.a(this.f128994a.s());
                String str3 = this.f128994a.w;
                if (str3 != null) {
                    str2 = str3;
                }
                aVar.a(str2).a();
                return false;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            String str4 = this.f128994a.x;
            if (!(str4 == null || (str = myMediaModel.f109390b) == null || (sdkExtraInfo2 = this.f128994a.z) == null || (pl = sdkExtraInfo2.getPl()) == null || (alg = pl.getAlg()) == null)) {
                this.f128994a.R.a(str4, str, alg, new a(str, str4, this, myMediaModel, atomicBoolean));
            }
            if (!atomicBoolean.get()) {
                com.ss.android.ugc.aweme.tux.a.i.a aVar2 = new com.ss.android.ugc.aweme.tux.a.i.a(this.f128994a.s());
                SdkExtraInfo sdkExtraInfo3 = this.f128994a.z;
                if (!(sdkExtraInfo3 == null || (mvAlgorithmHint = sdkExtraInfo3.getMvAlgorithmHint()) == null)) {
                    str2 = mvAlgorithmHint;
                }
                aVar2.a(str2).a();
            }
            return atomicBoolean.get();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel, View view) {
            if (myMediaModel != null && view != null) {
                ChooseMediaViewModel chooseMediaViewModel = this.f128994a.T;
                if (chooseMediaViewModel != null) {
                    chooseMediaViewModel.f128814d = 3;
                    chooseMediaViewModel.b(chooseMediaViewModel.f128811a);
                }
                ao aoVar = this.f128994a;
                aoVar.M = aoVar.a(myMediaModel);
                this.f128994a.O = false;
                this.f128994a.a(new b(view), new c(myMediaModel), new d(this), new e(this));
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final int a(MvImageChooseAdapter.MyMediaModel myMediaModel, boolean z) {
            this.f128994a.P();
            ChooseMediaViewModel chooseMediaViewModel = this.f128994a.T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.a();
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar = this.f128994a.P;
            if (bVar != null) {
                if (this.f128994a.L() && myMediaModel != null) {
                    e eVar = this.f128994a.f128950e;
                    if (eVar != null) {
                        eVar.a(myMediaModel, z);
                    }
                    return bVar.a(myMediaModel, z, false);
                } else if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(this.f128994a.f128947b) && myMediaModel != null) {
                    return bVar.a(myMediaModel, z, false);
                }
            }
            List<? extends MvImageChooseAdapter.MyMediaModel> list = this.f128994a.I;
            if (list == null || !(!list.isEmpty())) {
                return 1;
            }
            return list.size();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a(List<MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.b bVar, MvImageChooseAdapter.MyMediaModel myMediaModel) {
            int i2;
            String str;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (this.f128994a.K < i2) {
                ao aoVar = this.f128994a;
                if (myMediaModel != null) {
                    str = myMediaModel.x;
                } else {
                    str = null;
                }
                aoVar.a(bVar, str);
            }
            this.f128994a.K = i2;
            this.f128994a.I = list;
            this.f128994a.a(list);
        }

        static final class a implements VEImageDetectUtils.IDetectImageResultListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f128995a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f128996b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p f128997c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ MvImageChooseAdapter.MyMediaModel f128998d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ AtomicBoolean f128999e;

            static {
                Covode.recordClassIndex(84659);
            }

            a(String str, String str2, p pVar, MvImageChooseAdapter.MyMediaModel myMediaModel, AtomicBoolean atomicBoolean) {
                this.f128995a = str;
                this.f128996b = str2;
                this.f128997c = pVar;
                this.f128998d = myMediaModel;
                this.f128999e = atomicBoolean;
            }

            @Override // com.ss.android.vesdk.VEImageDetectUtils.IDetectImageResultListener
            public final void onDetectResult(String str, String str2, String str3, boolean z) {
                this.f128999e.set(z);
            }
        }
    }

    public static final class q implements MvImageChooseAdapter.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f129000a;

        static {
            Covode.recordClassIndex(84664);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final boolean a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            return true;
        }

        static final class a extends h.f.b.m implements h.f.a.a<View> {
            final /* synthetic */ View $previewItemView;

            static {
                Covode.recordClassIndex(84665);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view) {
                super(0);
                this.$previewItemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ View invoke() {
                return this.$previewItemView;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.a<MvImageChooseAdapter.MyMediaModel> {
            final /* synthetic */ MvImageChooseAdapter.MyMediaModel $previewMedia;

            static {
                Covode.recordClassIndex(84666);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(MvImageChooseAdapter.MyMediaModel myMediaModel) {
                super(0);
                this.$previewMedia = myMediaModel;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ MvImageChooseAdapter.MyMediaModel invoke() {
                return this.$previewMedia;
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a() {
            this.f129000a.O();
        }

        static final class c extends h.f.b.m implements h.f.a.a<Integer> {
            final /* synthetic */ q this$0;

            static {
                Covode.recordClassIndex(84667);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(q qVar) {
                super(0);
                this.this$0 = qVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                int i2;
                if (this.this$0.f129000a.L() || com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(this.this$0.f129000a.f128947b)) {
                    i2 = 3;
                } else {
                    i2 = 1;
                }
                return Integer.valueOf(i2);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final boolean b() {
            List<MvImageChooseAdapter.MyMediaModel> a2;
            if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(this.f129000a.f128947b) || this.f129000a.f128947b == 11) {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar = this.f129000a.P;
                if (bVar == null || (a2 = bVar.a()) == null || !(!a2.isEmpty()) || a2.size() < this.f129000a.t) {
                    return false;
                }
                return true;
            } else if (this.f129000a.L >= this.f129000a.t) {
                return true;
            }
            return false;
        }

        static final class d extends h.f.b.m implements h.f.a.a<Boolean> {
            final /* synthetic */ q this$0;

            static {
                Covode.recordClassIndex(84668);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(q qVar) {
                super(0);
                this.this$0 = qVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar;
                List<MvImageChooseAdapter.MyMediaModel> a2;
                boolean z = false;
                if (!com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(this.this$0.f129000a.f128947b) ? this.this$0.f129000a.L >= this.this$0.f129000a.t : !((bVar = this.this$0.f129000a.P) == null || (a2 = bVar.a()) == null || !(!a2.isEmpty()) || a2.size() < this.this$0.f129000a.t)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        q(ao aoVar) {
            this.f129000a = aoVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a(MediaModel mediaModel) {
            this.f129000a.y.clear();
            if (mediaModel != null) {
                this.f129000a.y.add(mediaModel);
            }
            this.f129000a.H = 2;
            this.f129000a.P();
            this.f129000a.c(true);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final boolean b(MediaModel mediaModel) {
            Context r = this.f129000a.r();
            if (r == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(r, "");
            if (com.ss.android.ugc.aweme.ftc.a.a(r, com.ss.android.ugc.tools.utils.h.b(mediaModel), "video_upload")) {
                return false;
            }
            if (this.f129000a.U == null) {
                return true;
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.b bVar = this.f129000a.U;
            if (bVar == null) {
                h.f.b.l.b();
            }
            return b.a.a(bVar, this.f129000a.q(), this.f129000a.P, mediaModel);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final int a(MvImageChooseAdapter.MyMediaModel myMediaModel, boolean z) {
            this.f129000a.P();
            ChooseMediaViewModel chooseMediaViewModel = this.f129000a.T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.a();
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar = this.f129000a.P;
            if (bVar != null) {
                if (this.f129000a.L() && myMediaModel != null) {
                    e eVar = this.f129000a.f128950e;
                    if (eVar != null) {
                        eVar.a(myMediaModel, z);
                    }
                    return bVar.a(myMediaModel, z, true);
                } else if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(this.f129000a.f128947b) && myMediaModel != null) {
                    return bVar.a(myMediaModel, z, true);
                }
            }
            List<? extends MvImageChooseAdapter.MyMediaModel> list = this.f129000a.J;
            if (list == null || !(!list.isEmpty())) {
                return 1;
            }
            return list.size();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel, View view) {
            if (myMediaModel != null && view != null) {
                ChooseMediaViewModel chooseMediaViewModel = this.f129000a.T;
                if (chooseMediaViewModel != null) {
                    chooseMediaViewModel.f128814d = 2;
                    chooseMediaViewModel.b(chooseMediaViewModel.f128812b);
                }
                ao aoVar = this.f129000a;
                aoVar.M = aoVar.a(myMediaModel);
                this.f129000a.O = false;
                this.f129000a.a(new a(view), new b(myMediaModel), new c(this), new d(this));
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a(List<MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.b bVar, MvImageChooseAdapter.MyMediaModel myMediaModel) {
            int i2;
            String str;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (this.f129000a.L < i2) {
                ao aoVar = this.f129000a;
                if (myMediaModel != null) {
                    str = myMediaModel.x;
                } else {
                    str = null;
                }
                aoVar.a(list, bVar, str);
            }
            this.f129000a.L = i2;
            this.f129000a.J = list;
            this.f129000a.a(list);
        }
    }

    static {
        Covode.recordClassIndex(84613);
    }

    private final SafeHandler Q() {
        return (SafeHandler) this.aN.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c E() {
        return (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c) this.aL.getValue();
    }

    public final float F() {
        return ((Number) this.aM.getValue()).floatValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final void g() {
        this.Z = false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84614);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final boolean i() {
        return this.Z;
    }

    @Override // com.ss.android.ugc.tools.view.a.b
    public final boolean a(int i2, int i3, Intent intent) {
        String str;
        ChooseMediaState chooseMediaState;
        aa.c k2;
        if (J()) {
            if (this.U != null) {
                t();
            }
            return true;
        }
        if (i2 == this.ar) {
            int i4 = this.f128947b;
            if ((i4 == 4 || i4 == 10) && i3 != -1) {
                return true;
            }
            if (!this.aP) {
                t().setResult(i3, intent);
            }
            H();
        }
        int f2 = f(this.y.size());
        ShortVideoContext shortVideoContext = this.B;
        Boolean bool = null;
        if (shortVideoContext != null) {
            str = shortVideoContext.f124757b.e();
        } else {
            str = null;
        }
        ShortVideoContext shortVideoContext2 = this.B;
        if (shortVideoContext2 != null) {
            bool = Boolean.valueOf(shortVideoContext2.P);
        }
        if (i2 == 12346) {
            if (cx.b() && ((f2 == 3 || f2 == 11) && this.f128947b != 9 && (str == null || str.length() <= 0 || bool == null || bool.booleanValue()))) {
                ChooseMediaViewModel chooseMediaViewModel = this.T;
                if (!(chooseMediaViewModel == null || (chooseMediaState = (ChooseMediaState) chooseMediaViewModel.a(this)) == null || !chooseMediaState.isChangeMusicDownloadSuccess())) {
                    com.ss.android.ugc.aweme.port.in.aa aaVar = this.aJ;
                    if (!(aaVar == null || (k2 = aaVar.k()) == null)) {
                        k2.d();
                    }
                    ChooseMediaViewModel chooseMediaViewModel2 = this.T;
                    if (chooseMediaViewModel2 != null) {
                        chooseMediaViewModel2.a(false);
                    }
                }
                b(true);
            }
            return true;
        }
        if (i2 == 12345) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.a
    public final void a(boolean z2) {
        E().a(this.B, z2);
    }

    public final void a(List<? extends MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.b bVar, String str) {
        E().a(this.B, list, bVar, str);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final void a(boolean z2, MusicModel musicModel, String str) {
        ChooseMediaViewModel chooseMediaViewModel = this.T;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.a(z2);
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.T;
        if (chooseMediaViewModel2 != null) {
            chooseMediaViewModel2.b(musicModel, str);
        }
    }

    public static final class w implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f129007a;

        static {
            Covode.recordClassIndex(84674);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e
        public final void a(int i2, int i3) {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e
        public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        }

        public static final class a implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MvImageChooseAdapter.MyMediaModel f129008a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ w f129009b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ View f129010c;

            static {
                Covode.recordClassIndex(84675);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d
            public final int d() {
                return 3;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d
            public final boolean e() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d
            public final int c() {
                return this.f129008a.v - 1;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d
            public final boolean a() {
                if (!this.f129009b.f129007a.J()) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d
            public final View b() {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar = this.f129009b.f129007a.P;
                if (bVar != null) {
                    return bVar.b(this.f129009b.f129007a.N);
                }
                return null;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d
            public final boolean a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
                if (this.f129009b.f129007a.U == null) {
                    return true;
                }
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.b bVar = this.f129009b.f129007a.U;
                if (bVar == null) {
                    h.f.b.l.b();
                }
                return bVar.a(this.f129009b.f129007a.q(), this.f129009b.f129007a.P, this.f129008a, false);
            }

            a(MvImageChooseAdapter.MyMediaModel myMediaModel, w wVar, View view) {
                this.f129008a = myMediaModel;
                this.f129009b = wVar;
                this.f129010c = view;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        w(ao aoVar) {
            this.f129007a = aoVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.e
        public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel, View view) {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar;
            List<MvImageChooseAdapter.MyMediaModel> a2;
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar2;
            ArrayList<MvImageChooseAdapter.MyMediaModel> e2;
            ChooseMediaViewModel chooseMediaViewModel;
            if (myMediaModel != null && view != null && com.ss.android.ugc.tools.utils.i.a(myMediaModel.f109390b) && (bVar = this.f129007a.P) != null && (a2 = bVar.a()) != null) {
                if (!(!fb.b() || (bVar2 = this.f129007a.P) == null || (e2 = bVar2.e()) == null || (chooseMediaViewModel = this.f129007a.T) == null)) {
                    chooseMediaViewModel.a(e2);
                }
                ChooseMediaViewModel chooseMediaViewModel2 = this.f129007a.T;
                if (chooseMediaViewModel2 != null) {
                    ArrayList<MvImageChooseAdapter.MyMediaModel> arrayList = new ArrayList<>(a2);
                    h.f.b.l.d(arrayList, "");
                    chooseMediaViewModel2.f128814d = 0;
                    chooseMediaViewModel2.b(arrayList);
                }
                this.f129007a.N = myMediaModel.v - 1;
                this.f129007a.O = true;
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f.t = new a(myMediaModel, this, view);
                this.f129007a.a(com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f.class);
            }
        }
    }

    static final class al implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128964a;

        static {
            Covode.recordClassIndex(84627);
        }

        al(ao aoVar) {
            this.f128964a = aoVar;
        }

        public final void run() {
            this.f128964a.b(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ar extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ com.bytedance.tux.sheet.sheet.a $sheet;

        static {
            Covode.recordClassIndex(84634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ar(com.bytedance.tux.sheet.sheet.a aVar) {
            super(0);
            this.$sheet = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.$sheet.dismiss();
            return h.z.f158842a;
        }
    }

    static final class au extends h.f.b.m implements h.f.a.a<SafeHandler> {
        final /* synthetic */ ao this$0;

        static {
            Covode.recordClassIndex(84637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        au(ao aoVar) {
            super(0);
            this.this$0 = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.this$0);
        }
    }

    static final class av extends h.f.b.m implements h.f.a.a<Cif> {

        /* renamed from: a  reason: collision with root package name */
        public static final av f128972a = new av();

        static {
            Covode.recordClassIndex(84638);
        }

        av() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Cif invoke() {
            return new Cif();
        }
    }

    final class b extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128973a;

        static {
            Covode.recordClassIndex(84639);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f128973a.C;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.b
        public final /* synthetic */ Fragment a(int i2) {
            return this.f128973a.e(i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i2) {
            if (i2 == this.f128973a.D) {
                return this.f128973a.c_(R.string.sh);
            }
            if (i2 == this.f128973a.F) {
                return this.f128973a.c_(R.string.dq8);
            }
            if (i2 == this.f128973a.E) {
                return this.f128973a.c_(R.string.h9s);
            }
            if (i2 == this.f128973a.G) {
                return this.f128973a.c_(R.string.c4z);
            }
            return super.getPageTitle(i2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ao aoVar, androidx.fragment.app.i iVar) {
            super(iVar);
            h.f.b.l.d(iVar, "");
            this.f128973a = aoVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ ao this$0;

        static {
            Covode.recordClassIndex(84650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(ao aoVar) {
            super(0);
            this.this$0 = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a();
            return h.z.f158842a;
        }

        public final void a() {
            ae aeVar = this.this$0.f128952g;
            if (aeVar != null) {
                aeVar.f128906g = new aw.b(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao.m.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ m f128988a;

                    static {
                        Covode.recordClassIndex(84651);
                    }

                    {
                        this.f128988a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aw.b
                    public final void a(aw.a aVar, boolean z, int i2, boolean z2) {
                        boolean z3;
                        boolean z4;
                        TextView textView;
                        if (aVar != null) {
                            com.ss.android.ugc.tools.utils.q.a("MvChoosePhotoActivity", "onAlbumChooseCallback, model != null");
                            if ((i2 & 8) == 0 && (i2 & 2) == 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            int i3 = i2 & 16;
                            if (i3 != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (this.f128988a.this$0.F != -1 && z3) {
                                com.ss.android.ugc.tools.utils.q.a("MvChoosePhotoActivity", "onAlbumChooseCallback, refreshPhotoList");
                                ChooseMediaViewModel chooseMediaViewModel = this.f128988a.this$0.T;
                                if (chooseMediaViewModel != null) {
                                    ArrayList arrayList = new ArrayList(aVar.f129033b);
                                    h.f.b.l.d(arrayList, "");
                                    chooseMediaViewModel.c(new ChooseMediaViewModel.t(arrayList, z2));
                                    chooseMediaViewModel.f128811a.clear();
                                    chooseMediaViewModel.f128811a.addAll(arrayList);
                                    if (chooseMediaViewModel.f128814d == 3) {
                                        chooseMediaViewModel.b(chooseMediaViewModel.f128811a);
                                    }
                                }
                            }
                            if (!(this.f128988a.this$0.E == -1 || i3 == 0)) {
                                com.ss.android.ugc.tools.utils.q.a("MvChoosePhotoActivity", "onAlbumChooseCallback, refreshVideoList");
                                ChooseMediaViewModel chooseMediaViewModel2 = this.f128988a.this$0.T;
                                if (chooseMediaViewModel2 != null) {
                                    ArrayList arrayList2 = new ArrayList(aVar.f129034c);
                                    h.f.b.l.d(arrayList2, "");
                                    chooseMediaViewModel2.c(new ChooseMediaViewModel.v(arrayList2, z2));
                                    chooseMediaViewModel2.f128812b.clear();
                                    chooseMediaViewModel2.f128812b.addAll(arrayList2);
                                    if (chooseMediaViewModel2.f128814d == 2) {
                                        chooseMediaViewModel2.b(chooseMediaViewModel2.f128812b);
                                    }
                                }
                            }
                            if (this.f128988a.this$0.D != -1 && z4 && z3) {
                                com.ss.android.ugc.tools.utils.q.a("MvChoosePhotoActivity", "onAlbumChooseCallback, refreshAllList");
                                ChooseMediaViewModel chooseMediaViewModel3 = this.f128988a.this$0.T;
                                if (chooseMediaViewModel3 != null) {
                                    ArrayList arrayList3 = new ArrayList(aVar.a());
                                    h.f.b.l.d(arrayList3, "");
                                    chooseMediaViewModel3.c(new ChooseMediaViewModel.s(arrayList3, z2));
                                    chooseMediaViewModel3.f128813c.clear();
                                    chooseMediaViewModel3.f128813c.addAll(arrayList3);
                                    if (chooseMediaViewModel3.f128814d == 1) {
                                        chooseMediaViewModel3.b(chooseMediaViewModel3.f128813c);
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(aVar.f129032a) && (textView = this.f128988a.this$0.f128949d) != null) {
                                textView.setText(aVar.f129032a);
                            }
                        } else {
                            com.ss.android.ugc.tools.utils.q.a("MvChoosePhotoActivity", "onAlbumChooseCallback, model == null");
                        }
                        if (z) {
                            this.f128988a.this$0.d(false);
                            this.f128988a.this$0.E().a();
                        }
                    }
                };
            }
        }
    }

    static final class z implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f129014a;

        static {
            Covode.recordClassIndex(84678);
        }

        z(ao aoVar) {
            this.f129014a = aoVar;
        }

        public final void run() {
            this.f129014a.M();
        }
    }

    public static final class i implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128983a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f128984b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f128985c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f128986d;

        static {
            Covode.recordClassIndex(84646);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d
        public final boolean a() {
            if (!this.f128983a.J()) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d
        public final int c() {
            return ((MvImageChooseAdapter.MyMediaModel) this.f128984b.invoke()).w;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d
        public final int d() {
            return ((Number) this.f128985c.invoke()).intValue();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d
        public final boolean e() {
            return ((Boolean) this.f128986d.invoke()).booleanValue();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d
        public final View b() {
            ViewPager viewPager = this.f128983a.f128956k;
            if (viewPager == null) {
                return null;
            }
            Fragment e2 = this.f128983a.e(viewPager.getCurrentItem());
            Objects.requireNonNull(e2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
            a aVar = (a) e2;
            if (aVar != null) {
                return aVar.d(this.f128983a.M);
            }
            return null;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d
        public final boolean a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            if (this.f128983a.U == null) {
                return true;
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.b bVar = this.f128983a.U;
            if (bVar == null) {
                h.f.b.l.b();
            }
            return bVar.a(this.f128983a.q(), this.f128983a.P, myMediaModel, false);
        }

        i(ao aoVar, h.f.a.a aVar, h.f.a.a aVar2, h.f.a.a aVar3) {
            this.f128983a = aoVar;
            this.f128984b = aVar;
            this.f128985c = aVar2;
            this.f128986d = aVar3;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ ao this$0;

        static {
            Covode.recordClassIndex(84648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ao aoVar) {
            super(0);
            this.this$0 = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            if (this.this$0.H != 17) {
                this.this$0.H();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ ao this$0;

        static {
            Covode.recordClassIndex(84649);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(ao aoVar) {
            super(0);
            this.this$0 = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            if (com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.f.a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                this.this$0.G();
            }
            return h.z.f158842a;
        }
    }

    public static final class v implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f129006a;

        static {
            Covode.recordClassIndex(84673);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.d
        public final void a() {
            Workspace workspace;
            ShortVideoContext shortVideoContext = this.f129006a.B;
            if (shortVideoContext != null && (workspace = shortVideoContext.f124757b.f124713h) != null) {
                workspace.d();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        v(ao aoVar) {
            this.f129006a = aoVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.d
        public final void a(boolean z, ArrayList<MvImageChooseAdapter.MyMediaModel> arrayList) {
            if (z) {
                this.f129006a.y.clear();
                if (arrayList != null) {
                    this.f129006a.y.addAll(arrayList);
                }
                this.f129006a.c(true);
            }
        }
    }

    public final boolean J() {
        if (this.f128947b == 6) {
            return true;
        }
        return false;
    }

    public final boolean K() {
        if (this.f128947b == 11) {
            return true;
        }
        return false;
    }

    public final void P() {
        if (this.aC) {
            this.aE = System.currentTimeMillis();
            this.aC = false;
        }
    }

    static final class ak extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final ak f128963a = new ak();

        static {
            Covode.recordClassIndex(84626);
        }

        ak() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c invoke() {
            if (com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                return new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.b();
            }
            return new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.a();
        }
    }

    static final class an extends h.f.b.m implements h.f.a.a<Float> {
        final /* synthetic */ ao this$0;

        static {
            Covode.recordClassIndex(84629);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        an(ao aoVar) {
            super(0);
            this.this$0 = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            View view = this.this$0.n;
            h.f.b.l.b(view, "");
            return Float.valueOf((float) com.bytedance.common.utility.n.b(view.getContext()));
        }
    }

    public final boolean L() {
        if (K()) {
            return true;
        }
        if (!this.au || !this.av || !com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.c()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.scene.j
    public final void v() {
        super.v();
        if (this.ab && this.H != 17) {
            R();
        }
        if (this.H == 17) {
            this.ae = System.currentTimeMillis();
        }
    }

    static final class ac implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128960a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f128961b;

        static {
            Covode.recordClassIndex(84618);
        }

        ac(ao aoVar, View view) {
            this.f128960a = aoVar;
            this.f128961b = view;
        }

        public final void run() {
            TextView textView = this.f128960a.f128949d;
            if (textView != null) {
                textView.setMaxWidth((com.ss.android.ugc.aweme.df.n.b(this.f128960a.s()) - (this.f128961b.getMeasuredWidth() * 2)) - ((int) com.bytedance.common.utility.n.b(this.f128960a.s(), 60.0f)));
            }
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f128977a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ao f128978b;

        static {
            Covode.recordClassIndex(84641);
        }

        d(TextView textView, ao aoVar) {
            this.f128977a = textView;
            this.f128978b = aoVar;
        }

        public final void run() {
            int measuredWidth = this.f128977a.getMeasuredWidth();
            int b2 = com.ss.android.ugc.aweme.df.n.b(this.f128978b.s());
            TextView textView = this.f128978b.f128949d;
            if (textView != null) {
                textView.setMaxWidth((b2 - (measuredWidth * 2)) - ((int) com.bytedance.common.utility.n.b(this.f128978b.s(), 60.0f)));
            }
            this.f128977a.setVisibility(8);
            this.f128977a.setTextSize(1, 17.0f);
        }
    }

    private final void R() {
        Activity t2 = t();
        Objects.requireNonNull(t2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) t2;
        if (this.aO) {
            com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.g.a(eVar, new j(this), new k(this), new l(this));
        } else {
            G();
        }
    }

    private final void T() {
        Context s2 = s();
        h.f.b.l.b(s2, "");
        d dVar = new d(s2, (byte) 0);
        com.bytedance.tux.sheet.sheet.a aVar = new a.C1112a().a(dVar).a(true).a(0).f45299a;
        dVar.setConfirmCallBack(new ar(aVar));
        Activity t2 = t();
        Objects.requireNonNull(t2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        aVar.show(((androidx.fragment.app.e) t2).getSupportFragmentManager(), "AllowLongerVideoUploadingGuidance");
    }

    public final void H() {
        if (this.aP) {
            S();
        } else if (this.f42913m == null) {
            com.bytedance.services.apm.api.a.a("MvChoosePhotoScene.finish: " + this.aQ);
        } else {
            t().finish();
        }
    }

    public final boolean N() {
        if (!U()) {
            return false;
        }
        T();
        c.b(com.ss.android.ugc.aweme.port.in.g.a().A().c());
        com.ss.android.ugc.aweme.common.r.a("longer_upload_permission_intro_show", new com.ss.android.ugc.tools.f.b().f149193a);
        return true;
    }

    public final void O() {
        if (K()) {
            if (!this.aK && this.Q) {
                c(this.aa);
            }
        } else if (this.aK) {
        } else {
            if (L() || com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(this.f128947b)) {
                c(this.aa);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final w.a e() {
        MusicModel musicModel;
        ChooseMediaState chooseMediaState;
        PreMusicState lastPreMusicState;
        ChooseMediaState chooseMediaState2;
        PreMusicState lastPreMusicState2;
        ChooseMediaViewModel chooseMediaViewModel = this.T;
        String str = null;
        if (chooseMediaViewModel == null || (chooseMediaState2 = (ChooseMediaState) chooseMediaViewModel.a(com.bytedance.scene.ktx.c.b(this))) == null || (lastPreMusicState2 = chooseMediaState2.getLastPreMusicState()) == null) {
            musicModel = null;
        } else {
            musicModel = lastPreMusicState2.getPreMusicModel();
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.T;
        if (!(chooseMediaViewModel2 == null || (chooseMediaState = (ChooseMediaState) chooseMediaViewModel2.a(com.bytedance.scene.ktx.c.b(this))) == null || (lastPreMusicState = chooseMediaState.getLastPreMusicState()) == null)) {
            str = lastPreMusicState.getPreMusicFile();
        }
        return new w.a(musicModel, str);
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        a.C4076a.a().a("tool_choose_media");
        Bundle bundle = this.r;
        if (bundle != null) {
            long j2 = bundle.getLong("click_album_icon_time", 0);
            if (j2 != 0) {
                ((Cif) this.aV.getValue()).a("click_album", System.currentTimeMillis() - j2, true);
            }
        }
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        String str;
        super.x();
        com.ss.android.ugc.aweme.shortvideo.util.b bVar = b.a.f132249a;
        Context s2 = s();
        ShortVideoContext shortVideoContext = this.B;
        String str2 = null;
        if (shortVideoContext != null) {
            str = shortVideoContext.r;
        } else {
            str = null;
        }
        ShortVideoContext shortVideoContext2 = this.B;
        if (shortVideoContext2 != null) {
            str2 = shortVideoContext2.q;
        }
        bVar.pause(s2, "album", str, str2);
        a.C4076a.a().a("tool_choose_media");
    }

    public static final class am implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128965a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f128966b;

        static {
            Covode.recordClassIndex(84628);
        }

        public final boolean onPreDraw() {
            ao aoVar = this.f128965a;
            View view = aoVar.n;
            h.f.b.l.b(view, "");
            view.setTranslationY(aoVar.F());
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            List<ValueAnimator> list = aoVar.ag;
            h.f.b.l.b(ofFloat, "");
            list.add(ofFloat);
            ofFloat.setDuration(aoVar.ad);
            ofFloat.addUpdateListener(new as(aoVar));
            ofFloat.addListener(new at(aoVar));
            ofFloat.start();
            this.f128966b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }

        am(ao aoVar, View view) {
            this.f128965a = aoVar;
            this.f128966b = view;
        }
    }

    public ao() {
        com.ss.android.ugc.aweme.port.in.g.a().K().a();
    }

    private final void S() {
        if (!(!h.f.b.l.a(((ChooseMediaState) ((BaseJediViewModel) com.bytedance.jedi.arch.t.a(com.bytedance.scene.ktx.c.b(this)).a(ChooseMediaViewModel.class)).a(this)).getClosingChooseMediaPageState(), ClosingChooseMediaPageState.Ready.INSTANCE)) && this.aP) {
            ChooseMediaViewModel chooseMediaViewModel = this.T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.a(ClosingChooseMediaPageState.Closing.INSTANCE);
            }
            ShortVideoContext shortVideoContext = this.B;
            if (shortVideoContext != null) {
                shortVideoContext.f124759d = "";
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            List<ValueAnimator> list = this.ag;
            h.f.b.l.b(ofFloat, "");
            list.add(ofFloat);
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new g(this));
            ofFloat.addListener(new h(this));
            ofFloat.start();
        }
    }

    private static boolean U() {
        com.ss.android.ugc.aweme.port.in.z A2 = com.ss.android.ugc.aweme.port.in.g.a().A();
        if (A2.b() && com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125945d && !com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
            cr a2 = cr.a();
            h.f.b.l.b(a2, "");
            Boolean bool = a2.o;
            h.f.b.l.b(bool, "");
            if (!bool.booleanValue() && com.ss.android.ugc.aweme.property.d.a() && com.ss.android.ugc.aweme.setting.d.a() > 180000 && c.a(A2.c())) {
                return true;
            }
        }
        return false;
    }

    public final void I() {
        Activity activity = this.f42913m;
        if (activity != null) {
            h.f.b.l.b(activity, "");
            if (activity instanceof MvChoosePhotoActivity) {
                activity.finish();
                if (J()) {
                    activity.overridePendingTransition(0, 0);
                } else {
                    activity.overridePendingTransition(0, R.anim.x);
                }
            } else {
                if (com.ss.android.ugc.aweme.scene.a.a(com.bytedance.scene.ktx.b.b(this), com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f.class)) {
                    com.bytedance.scene.ktx.b.b(this).E();
                }
                ShortVideoContext shortVideoContext = this.B;
                if (shortVideoContext != null) {
                    shortVideoContext.f124759d = "";
                }
                ShortVideoContext shortVideoContext2 = this.B;
                if (shortVideoContext2 != null) {
                    shortVideoContext2.f124760e = "";
                }
                ChooseMediaViewModel chooseMediaViewModel = this.T;
                if (chooseMediaViewModel != null) {
                    chooseMediaViewModel.a(ClosingChooseMediaPageState.Closing.INSTANCE);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.addUpdateListener(new e(this));
                ofFloat.addListener(new f(this));
                ofFloat.start();
                List<ValueAnimator> list = this.ag;
                h.f.b.l.b(ofFloat, "");
                list.add(ofFloat);
            }
        }
    }

    public final void M() {
        com.ss.android.ugc.aweme.port.in.z A2 = com.ss.android.ugc.aweme.port.in.g.a().A();
        if (A2.b() && com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125945d && !com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
            f.a.ab.a((f.a.af) new C3360ao(A2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).c(new ap(this)).a(f.a.h.a.b(f.a.k.a.f158006c)).d(new aq(A2));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w
    public final w.a a() {
        MusicModel musicModel;
        ChooseMediaState chooseMediaState;
        PreMusicState preMusicState;
        ChooseMediaState chooseMediaState2;
        PreMusicState preMusicState2;
        ChooseMediaViewModel chooseMediaViewModel = this.T;
        String str = null;
        if (chooseMediaViewModel == null || (chooseMediaState2 = (ChooseMediaState) chooseMediaViewModel.a(com.bytedance.scene.ktx.c.b(this))) == null || (preMusicState2 = chooseMediaState2.getPreMusicState()) == null) {
            musicModel = null;
        } else {
            musicModel = preMusicState2.getPreMusicModel();
        }
        ChooseMediaViewModel chooseMediaViewModel2 = this.T;
        if (!(chooseMediaViewModel2 == null || (chooseMediaState = (ChooseMediaState) chooseMediaViewModel2.a(com.bytedance.scene.ktx.c.b(this))) == null || (preMusicState = chooseMediaState.getPreMusicState()) == null)) {
            str = preMusicState.getPreMusicFile();
        }
        return new w.a(musicModel, str);
    }

    private final boolean V() {
        l lVar;
        al alVar = this.f128951f;
        if (alVar != null) {
            alVar.q = this.ax;
        }
        al alVar2 = this.f128951f;
        if (alVar2 != null) {
            alVar2.b(this.f128957l);
        }
        al alVar3 = this.f128951f;
        if (alVar3 != null) {
            alVar3.b(this.av);
        }
        al alVar4 = this.f128951f;
        if (alVar4 != null) {
            alVar4.f128891k = this.H;
        }
        al alVar5 = this.f128951f;
        if (alVar5 != null && this.F == 0) {
            alVar5.n = true;
        }
        l lVar2 = this.f128953h;
        if (lVar2 != null) {
            lVar2.b(this.t);
        }
        l lVar3 = this.f128953h;
        if (lVar3 != null) {
            lVar3.s = this.au;
        }
        l lVar4 = this.f128953h;
        if (lVar4 != null) {
            lVar4.u = this.az;
        }
        l lVar5 = this.f128953h;
        if (lVar5 != null) {
            lVar5.f128891k = this.H;
        }
        l lVar6 = this.f128953h;
        if (lVar6 != null && this.E == 0) {
            lVar6.n = true;
        }
        e eVar = this.f128950e;
        if (eVar != null) {
            eVar.b(this.f128957l);
        }
        e eVar2 = this.f128950e;
        if (eVar2 != null) {
            eVar2.f128891k = this.H;
        }
        e eVar3 = this.f128950e;
        if (eVar3 != null && this.D == 0) {
            eVar3.n = true;
        }
        this.aa = null;
        Bundle bundle = this.r;
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("key_selected_video_path");
            if (stringArrayList == null) {
                stringArrayList = new ArrayList<>();
            }
            this.aa = stringArrayList;
            if (!com.ss.android.ugc.tools.utils.k.a(stringArrayList)) {
                e eVar4 = this.f128950e;
                if (eVar4 != null) {
                    eVar4.a(this.aa);
                }
                l lVar7 = this.f128953h;
                if (lVar7 != null) {
                    lVar7.a(this.aa);
                }
                al alVar6 = this.f128951f;
                if (alVar6 != null) {
                    alVar6.a(this.aa);
                }
            }
        }
        TextView textView = this.f128949d;
        if (textView != null) {
            textView.setText(t().getResources().getString(R.string.sh));
        }
        if (!this.ab) {
            R();
        }
        View view = this.aj;
        if (view != null) {
            view.setOnClickListener(new s(this));
        }
        if (!(this.aq == 2 || (lVar = this.f128953h) == null)) {
            lVar.a(new t(this));
        }
        if (!K() && (L() || com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(this.f128947b))) {
            b(this.aa);
        }
        return true;
    }

    public final void G() {
        m mVar = new m(this);
        boolean z2 = false;
        if (!this.aO) {
            androidx.fragment.app.i supportFragmentManager = com.bytedance.scene.ktx.c.b(this).getSupportFragmentManager();
            Fragment a2 = supportFragmentManager.a("album_Fragment");
            if (a2 == null) {
                this.f128952g = new ae();
                mVar.a();
                ae aeVar = this.f128952g;
                if (aeVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("key_support_flag", this.at);
                    if (this.f128947b == 10) {
                        z2 = true;
                    }
                    bundle.putBoolean("extra_show_gif", z2);
                    aeVar.setArguments(bundle);
                }
                ae aeVar2 = this.f128952g;
                if (aeVar2 != null) {
                    androidx.fragment.app.n b2 = supportFragmentManager.a().b(R.id.b94, aeVar2, "album_Fragment");
                    b2.b(aeVar2);
                    b2.e();
                }
            } else {
                this.f128952g = (ae) a2;
                mVar.a();
            }
        } else if (!this.aS) {
            androidx.fragment.app.i supportFragmentManager2 = com.bytedance.scene.ktx.c.b(this).getSupportFragmentManager();
            this.f128952g = new ae();
            mVar.a();
            ae aeVar3 = this.f128952g;
            if (aeVar3 != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("key_support_flag", this.at);
                if (this.f128947b == 10) {
                    z2 = true;
                }
                bundle2.putBoolean("extra_show_gif", z2);
                aeVar3.setArguments(bundle2);
            }
            ae aeVar4 = this.f128952g;
            if (aeVar4 != null) {
                androidx.fragment.app.n b3 = supportFragmentManager2.a().b(R.id.b94, aeVar4, "album_Fragment");
                b3.b(aeVar4);
                b3.e();
            }
        }
        this.aS = true;
    }

    @Override // com.bytedance.scene.j
    public final void o() {
        double d2;
        int valueOf;
        long j2;
        aa.c k2;
        super.o();
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f.t = null;
        ShortVideoContext shortVideoContext = this.B;
        if (shortVideoContext != null) {
            shortVideoContext.P = false;
        }
        com.ss.android.ugc.aweme.port.in.aa aaVar = this.aJ;
        if (!(aaVar == null || (k2 = aaVar.k()) == null)) {
            k2.b();
        }
        if (!y.f129195a.isEmpty()) {
            CopyOnWriteArrayList<Long> copyOnWriteArrayList = y.f129195a;
            h.f.b.l.d(copyOnWriteArrayList, "");
            double d3 = 0.0d;
            Iterator<T> it = copyOnWriteArrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                double longValue = (double) it.next().longValue();
                Double.isNaN(longValue);
                d3 += longValue;
                i2++;
                if (i2 < 0) {
                    h.a.n.b();
                }
            }
            if (i2 == 0) {
                d2 = Double.NaN;
            } else {
                double d4 = (double) i2;
                Double.isNaN(d4);
                d2 = d3 / d4;
            }
            com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
            if (Double.isNaN(d2)) {
                valueOf = -1;
            } else {
                valueOf = Double.valueOf(d2);
            }
            com.ss.android.ugc.tools.f.b a2 = bVar.a("ave_duration", valueOf);
            Long l2 = (Long) h.a.n.r(y.f129195a);
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = -1;
            }
            com.ss.android.ugc.aweme.utils.d.a("tool_performance_fetch_thumbnail", a2.a("max_duration", j2).f149193a);
        }
        y.f129195a.clear();
        y.f129196b = false;
        y.f129197c = 0;
        y.f129198d = 0;
        com.ss.android.ugc.tools.view.a.c cVar = this.ac;
        if (cVar != null) {
            cVar.b((com.ss.android.ugc.tools.view.a.b) this);
            cVar.c(this);
        }
        Activity activity = this.f42913m;
        if (!(activity instanceof VideoRecordNewActivity)) {
            activity = null;
        }
        VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) activity;
        if (videoRecordNewActivity != null) {
            videoRecordNewActivity.v = null;
        }
        androidx.fragment.app.e b2 = com.bytedance.scene.ktx.c.b(this);
        if (this.ab && !(b2 instanceof MvChoosePhotoActivity)) {
            androidx.fragment.app.i supportFragmentManager = com.bytedance.scene.ktx.c.b(this).getSupportFragmentManager();
            androidx.fragment.app.n a3 = supportFragmentManager.a();
            Fragment a4 = supportFragmentManager.a(g(this.D));
            if (a4 != null) {
                a3.a(a4);
            }
            Fragment a5 = supportFragmentManager.a(g(this.F));
            if (a5 != null) {
                a3.a(a5);
            }
            Fragment a6 = supportFragmentManager.a(g(this.E));
            if (a6 != null) {
                a3.a(a6);
            }
            Fragment a7 = supportFragmentManager.a(g(this.G));
            if (a7 != null) {
                a3.a(a7);
            }
            Fragment a8 = supportFragmentManager.a("album_Fragment");
            if (a8 != null) {
                a3.a(a8);
            }
            a3.c();
            ChooseMediaViewModel chooseMediaViewModel = this.T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.f128811a.clear();
                chooseMediaViewModel.f128812b.clear();
                chooseMediaViewModel.f128813c.clear();
                chooseMediaViewModel.f128814d = 0;
                chooseMediaViewModel.c(ChooseMediaViewModel.j.f128817a);
            }
            this.T = null;
        }
        b.a.f132249a.leave(s(), "album");
        com.ss.android.ugc.aweme.sticker.m.a.d.f134954a = null;
        com.ss.android.ugc.gamora.recorder.quickupload.o.a(this.ag);
    }

    public static final class ad extends ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128962a;

        static {
            Covode.recordClassIndex(84619);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ad(ao aoVar) {
            this.f128962a = aoVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            String str;
            if (i2 == this.f128962a.D) {
                this.f128962a.a(i2, false, (List<? extends MvImageChooseAdapter.MyMediaModel>) null);
            } else if (i2 == this.f128962a.E) {
                ao aoVar = this.f128962a;
                aoVar.a(i2, true, aoVar.J);
            } else if (i2 == this.f128962a.F) {
                ao aoVar2 = this.f128962a;
                aoVar2.a(i2, true, aoVar2.I);
            } else if (i2 == this.f128962a.G) {
                this.f128962a.a(i2, false, (List<? extends MvImageChooseAdapter.MyMediaModel>) null);
            }
            ao aoVar3 = this.f128962a;
            if (i2 == aoVar3.D) {
                str = "all";
            } else if (i2 == this.f128962a.E) {
                str = "video";
            } else if (i2 == this.f128962a.F) {
                str = UGCMonitor.TYPE_PHOTO;
            } else if (i2 == this.f128962a.G) {
                str = "giphy";
            } else {
                str = "";
            }
            aoVar3.E().a(aoVar3.B, str);
            if (h.f.b.l.a((Object) str, (Object) "giphy")) {
                aoVar3.ae = System.currentTimeMillis();
            } else if (aoVar3.ae != -1) {
                com.ss.android.ugc.aweme.common.r.a("gif_stay_time", new com.ss.android.ugc.tools.f.b().a("duration", (int) (System.currentTimeMillis() - aoVar3.ae)).a("enter_from", "video_shoot_page").f149193a);
                aoVar3.ae = -1;
            }
            e eVar = this.f128962a.f128950e;
            if (eVar != null) {
                eVar.f();
            }
            l lVar = this.f128962a.f128953h;
            if (lVar != null) {
                lVar.f();
            }
            al alVar = this.f128962a.f128951f;
            if (alVar != null) {
                alVar.f();
            }
        }
    }

    public static final class at extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128971a;

        static {
            Covode.recordClassIndex(84636);
        }

        at(ao aoVar) {
            this.f128971a = aoVar;
        }

        public final void onAnimationEnd(Animator animator) {
            ChooseMediaViewModel chooseMediaViewModel = this.f128971a.T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.a(OpeningChooseMediaPageState.OnSceneAnimationEnded.INSTANCE);
            }
            b.a.f132249a.end(OpenAlbumPanelPerformanceMonitor.f132344a, "animationEnded");
        }
    }

    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128980a;

        static {
            Covode.recordClassIndex(84643);
        }

        f(ao aoVar) {
            this.f128980a = aoVar;
        }

        public final void onAnimationEnd(Animator animator) {
            ChooseMediaViewModel chooseMediaViewModel = this.f128980a.T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.a(ClosingChooseMediaPageState.Closed.INSTANCE);
            }
            com.bytedance.scene.navigation.d a2 = com.bytedance.scene.ktx.b.a(this.f128980a);
            if (a2 != null) {
                a2.f42958f = null;
            }
            if (this.f128980a.af.equals(com.ss.android.ugc.gamora.recorder.quickupload.h.NAVIGATION_PUSH.name())) {
                com.bytedance.scene.navigation.d a3 = com.bytedance.scene.ktx.b.a(this.f128980a);
                if (a3 != null) {
                    a3.b(this.f128980a);
                    return;
                }
                return;
            }
            com.bytedance.scene.j jVar = this.f128980a.o;
            Objects.requireNonNull(jVar, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            ((com.bytedance.scene.group.b) jVar).c(this.f128980a);
        }
    }

    public static final class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128982a;

        static {
            Covode.recordClassIndex(84645);
        }

        h(ao aoVar) {
            this.f128982a = aoVar;
        }

        public final void onAnimationEnd(Animator animator) {
            ChooseMediaViewModel chooseMediaViewModel = this.f128982a.T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.a(ClosingChooseMediaPageState.Closed.INSTANCE);
            }
        }
    }

    public static final class j implements v.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128987a;

        static {
            Covode.recordClassIndex(84647);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(ao aoVar) {
            this.f128987a = aoVar;
        }

        @Override // com.ss.android.ugc.aweme.port.in.v.a
        public final void a(String[] strArr, int[] iArr) {
            this.f128987a.G();
        }
    }

    public static final class o implements MvImageChooseAdapter.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128993a;

        static {
            Covode.recordClassIndex(84657);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final int a(MvImageChooseAdapter.MyMediaModel myMediaModel, boolean z) {
            return 0;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel, View view) {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a(List<MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.b bVar, MvImageChooseAdapter.MyMediaModel myMediaModel) {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final boolean a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final boolean b() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final boolean b(MediaModel mediaModel) {
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(ao aoVar) {
            this.f128993a = aoVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.c
        public final void a(MediaModel mediaModel) {
            this.f128993a.y.clear();
            if (mediaModel != null) {
                this.f128993a.y.add(mediaModel);
            }
            this.f128993a.H = 5;
            this.f128993a.P();
            this.f128993a.c(true);
        }
    }

    public static final class t implements MvChoosePhotoActivity.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f129004a;

        static {
            Covode.recordClassIndex(84671);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        t(ao aoVar) {
            this.f129004a = aoVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.b
        public final void a(boolean z) {
            this.f129004a.E().b(this.f129004a.B, z);
        }
    }

    public static final class u extends ViewPagerBottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f129005a;

        static {
            Covode.recordClassIndex(84672);
        }

        @Override // com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.a
        public final void a(View view) {
            h.f.b.l.d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        u(ao aoVar) {
            this.f129005a = aoVar;
        }

        @Override // com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.a
        public final void a(View view, int i2) {
            h.f.b.l.d(view, "");
            if (i2 != 5) {
                return;
            }
            if (this.f129005a.af.length() > 0) {
                v vVar = this.f129005a.S;
                if (vVar != null) {
                    vVar.a();
                }
                this.f129005a.I();
                return;
            }
            v vVar2 = this.f129005a.S;
            if (vVar2 != null) {
                vVar2.a();
            }
            this.f129005a.H();
        }
    }

    static final class ab implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128959a;

        static {
            Covode.recordClassIndex(84617);
        }

        ab(ao aoVar) {
            this.f128959a = aoVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f128959a.c(true);
        }
    }

    private static String g(int i2) {
        return "android:switcher:2131370424:" + i2;
    }

    static final class ai extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.p, h.z> {
        final /* synthetic */ ao this$0;

        static {
            Covode.recordClassIndex(84624);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ai(ao aoVar) {
            super(1);
            this.this$0 = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.p pVar) {
            View f2;
            h.f.b.l.d(pVar, "");
            ShortVideoContext shortVideoContext = this.this$0.B;
            if (shortVideoContext != null) {
                shortVideoContext.aD = true;
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar = this.this$0.P;
            if (!(bVar == null || (f2 = bVar.f()) == null)) {
                f2.performClick();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128979a;

        static {
            Covode.recordClassIndex(84642);
        }

        e(ao aoVar) {
            this.f128979a = aoVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f128979a.n;
            if (view != null) {
                float F = this.f128979a.F();
                h.f.b.l.b(valueAnimator, "");
                view.setTranslationY(F * valueAnimator.getAnimatedFraction());
            }
        }
    }

    static final class y implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f129013a;

        static {
            Covode.recordClassIndex(84677);
        }

        y(ao aoVar) {
            this.f129013a = aoVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f129013a.af.length() > 0) {
                this.f129013a.I();
            } else {
                this.f129013a.c(false);
            }
        }
    }

    public final a a(MediaModel mediaModel) {
        a aVar;
        e eVar = this.f128950e;
        if (eVar != null && eVar.isVisible()) {
            aVar = this.f128950e;
        } else if (mediaModel.b()) {
            aVar = this.f128953h;
        } else {
            aVar = this.f128951f;
        }
        return aVar;
    }

    public final Fragment e(int i2) {
        if (i2 == this.D) {
            return this.f128950e;
        }
        if (i2 == this.E) {
            return this.f128953h;
        }
        if (i2 == this.F) {
            return this.f128951f;
        }
        if (i2 == this.G) {
            return this.al;
        }
        return null;
    }

    static final class ah extends h.f.b.m implements h.f.a.b<PreviewSwapState, h.z> {
        final /* synthetic */ ao this$0;

        static {
            Covode.recordClassIndex(84623);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ah(ao aoVar) {
            super(1);
            this.this$0 = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(PreviewSwapState previewSwapState) {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar;
            PreviewSwapState previewSwapState2 = previewSwapState;
            h.f.b.l.d(previewSwapState2, "");
            if (!(previewSwapState2.getFrom() == null || previewSwapState2.getTo() == null || (bVar = this.this$0.P) == null)) {
                bVar.b(previewSwapState2.getFrom().intValue(), previewSwapState2.getTo().intValue());
            }
            return h.z.f158842a;
        }
    }

    static final class aj extends h.f.b.m implements h.f.a.b<MediaState, h.z> {
        final /* synthetic */ ao this$0;

        static {
            Covode.recordClassIndex(84625);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aj(ao aoVar) {
            super(1);
            this.this$0 = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(MediaState mediaState) {
            MvImageChooseAdapter.c cVar;
            MediaState mediaState2 = mediaState;
            h.f.b.l.d(mediaState2, "");
            ShortVideoContext shortVideoContext = this.this$0.B;
            if (shortVideoContext != null) {
                shortVideoContext.aD = true;
            }
            e eVar = this.this$0.f128950e;
            if (!(eVar == null || (cVar = eVar.r) == null)) {
                cVar.a((MediaModel) mediaState2.getMedia());
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao$ao  reason: collision with other inner class name */
    public static final class C3360ao<T> implements f.a.af {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.port.in.z f128967a;

        static {
            Covode.recordClassIndex(84630);
        }

        C3360ao(com.ss.android.ugc.aweme.port.in.z zVar) {
            this.f128967a = zVar;
        }

        @Override // f.a.af
        public final void subscribe(f.a.ad<Boolean> adVar) {
            boolean z;
            h.f.b.l.d(adVar, "");
            String c2 = this.f128967a.c();
            h.f.b.l.d(c2, "");
            if (!b.f129045a) {
                z = false;
            } else {
                z = b.a().getBoolean(bn.a(c2), true);
                b.f129045a = z;
            }
            adVar.a(Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class aq<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.port.in.z f128969a;

        static {
            Covode.recordClassIndex(84633);
        }

        aq(com.ss.android.ugc.aweme.port.in.z zVar) {
            this.f128969a = zVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                String c2 = this.f128969a.c();
                h.f.b.l.d(c2, "");
                b.a().storeBoolean(bn.a(c2), false);
            }
        }
    }

    static final class as implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128970a;

        static {
            Covode.recordClassIndex(84635);
        }

        as(ao aoVar) {
            this.f128970a = aoVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            String.valueOf(valueAnimator.getAnimatedFraction());
            View view = this.f128970a.n;
            if (view != null) {
                view.setTranslationY(this.f128970a.F() - (this.f128970a.F() * valueAnimator.getAnimatedFraction()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128981a;

        static {
            Covode.recordClassIndex(84644);
        }

        g(ao aoVar) {
            this.f128981a = aoVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            String.valueOf(valueAnimator.getAnimatedFraction());
            View view = this.f128981a.n;
            if (view != null) {
                view.setTranslationY(this.f128981a.F() * valueAnimator.getAnimatedFraction());
            }
        }
    }

    private final void h(int i2) {
        TextView textView = this.f128948c;
        if (textView != null) {
            textView.setTextSize(1, 17.0f);
        }
        String string = t().getResources().getString(R.string.f9v);
        h.f.b.l.b(string, "");
        TextView textView2 = this.f128948c;
        if (textView2 != null) {
            String a2 = com.a.a(string, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            h.f.b.l.b(a2, "");
            textView2.setText(a2);
        }
    }

    public final int a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        h.f.b.l.d(myMediaModel, "");
        ViewPager viewPager = this.f128956k;
        if (viewPager == null) {
            return -1;
        }
        Fragment e2 = e(viewPager.getCurrentItem());
        Objects.requireNonNull(e2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
        a aVar = (a) e2;
        if (aVar != null) {
            return aVar.c(myMediaModel);
        }
        return -1;
    }

    public final void b(List<String> list) {
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d dVar = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d();
        this.P = dVar;
        if (!this.ab || !this.aP) {
            c(list);
            return;
        }
        View c2 = c(R.id.cn7);
        h.f.b.l.b(c2, "");
        dVar.a(c2, this.ax);
    }

    static final class aa extends h.f.b.m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ z.a $hasShownLongerVideoNotice;
        final /* synthetic */ ao this$0;

        static {
            Covode.recordClassIndex(84615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(ao aoVar, z.a aVar) {
            super(1);
            this.this$0 = aoVar;
            this.$hasShownLongerVideoNotice = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                if (this.this$0.f128947b == 0) {
                    this.$hasShownLongerVideoNotice.element = this.this$0.N();
                }
                if (this.this$0.f128947b == 0 && !this.$hasShownLongerVideoNotice.element) {
                    ao aoVar = this.this$0;
                    aoVar.f128955j = (ViewStub) aoVar.b(R.id.fjv);
                    ViewStub viewStub = this.this$0.f128955j;
                    if (viewStub != null) {
                        viewStub.post(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao.aa.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ aa f128958a;

                            static {
                                Covode.recordClassIndex(84616);
                            }

                            {
                                this.f128958a = r1;
                            }

                            public final void run() {
                                this.f128958a.this$0.M();
                            }
                        });
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class ae extends h.f.b.m implements h.f.a.b<MediaState, h.z> {
        final /* synthetic */ ao this$0;

        static {
            Covode.recordClassIndex(84620);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(ao aoVar) {
            super(1);
            this.this$0 = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(MediaState mediaState) {
            MediaState mediaState2 = mediaState;
            h.f.b.l.d(mediaState2, "");
            if (this.this$0.O) {
                MvImageChooseAdapter.MyMediaModel media = mediaState2.getMedia();
                if (media != null) {
                    a a2 = this.this$0.a((MediaModel) media);
                    if (a2 != null) {
                        a2.b(mediaState2.getMedia());
                    }
                    this.this$0.N = media.v - 1;
                }
            } else {
                ViewPager viewPager = this.this$0.f128956k;
                if (viewPager != null) {
                    Fragment e2 = this.this$0.e(viewPager.getCurrentItem());
                    Objects.requireNonNull(e2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
                    a aVar = (a) e2;
                    if (aVar != null) {
                        aVar.b(mediaState2.getMedia());
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class af extends h.f.b.m implements h.f.a.b<MediaState, h.z> {
        final /* synthetic */ ao this$0;

        static {
            Covode.recordClassIndex(84621);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        af(ao aoVar) {
            super(1);
            this.this$0 = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(MediaState mediaState) {
            MediaState mediaState2 = mediaState;
            h.f.b.l.d(mediaState2, "");
            if (this.this$0.O) {
                MvImageChooseAdapter.MyMediaModel media = mediaState2.getMedia();
                if (media != null) {
                    a a2 = this.this$0.a((MediaModel) media);
                    if (a2 != null) {
                        a2.b(mediaState2.getMedia());
                    }
                    this.this$0.N = media.v - 1;
                }
            } else {
                ViewPager viewPager = this.this$0.f128956k;
                if (viewPager != null) {
                    Fragment e2 = this.this$0.e(viewPager.getCurrentItem());
                    Objects.requireNonNull(e2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
                    a aVar = (a) e2;
                    if (aVar != null) {
                        aVar.b(mediaState2.getMedia());
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class ag extends h.f.b.m implements h.f.a.b<MediaState, h.z> {
        final /* synthetic */ ao this$0;

        static {
            Covode.recordClassIndex(84622);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ag(ao aoVar) {
            super(1);
            this.this$0 = aoVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(MediaState mediaState) {
            int i2;
            int i3;
            MediaState mediaState2 = mediaState;
            h.f.b.l.d(mediaState2, "");
            if (this.this$0.O) {
                ao aoVar = this.this$0;
                MvImageChooseAdapter.MyMediaModel media = mediaState2.getMedia();
                if (media != null) {
                    i3 = media.v - 1;
                } else {
                    i3 = 0;
                }
                aoVar.N = i3;
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar = this.this$0.P;
                if (bVar != null) {
                    bVar.a(this.this$0.N);
                }
            } else {
                ao aoVar2 = this.this$0;
                MvImageChooseAdapter.MyMediaModel media2 = mediaState2.getMedia();
                if (media2 != null) {
                    i2 = this.this$0.a(media2);
                } else {
                    i2 = -1;
                }
                aoVar2.M = i2;
                ViewPager viewPager = this.this$0.f128956k;
                if (viewPager != null) {
                    Fragment e2 = this.this$0.e(viewPager.getCurrentItem());
                    Objects.requireNonNull(e2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
                    a aVar = (a) e2;
                    if (aVar != null) {
                        aVar.c(this.this$0.M);
                    }
                }
            }
            this.this$0.E().a(this.this$0.B, mediaState2);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f129003a;

        static {
            Covode.recordClassIndex(84670);
        }

        s(ao aoVar) {
            this.f129003a = aoVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ae aeVar = this.f129003a.f128952g;
            if (aeVar != null) {
                com.bytedance.scene.ktx.c.b(this.f129003a).getSupportFragmentManager().a().c(aeVar).d();
                this.f129003a.d(!aeVar.f128911l);
            }
            ViewPager viewPager = this.f129003a.f128956k;
            if (viewPager != null) {
                Fragment e2 = this.f129003a.e(viewPager.getCurrentItem());
                Objects.requireNonNull(e2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
                a aVar = (a) e2;
                if (aVar != null) {
                    aVar.f();
                }
            }
        }
    }

    static final class x implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageView f129011a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ao f129012b;

        static {
            Covode.recordClassIndex(84676);
        }

        x(ImageView imageView, ao aoVar) {
            this.f129011a = imageView;
            this.f129012b = aoVar;
        }

        public final void onClick(View view) {
            int i2;
            ClickAgent.onClick(view);
            ao aoVar = this.f129012b;
            aoVar.Q = !aoVar.Q;
            ImageView imageView = this.f129011a;
            if (this.f129012b.Q) {
                i2 = 2131232154;
            } else {
                i2 = 2131232153;
            }
            imageView.setImageResource(i2);
            if (!this.f129012b.Q) {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar = this.f129012b.P;
                if (bVar != null) {
                    bVar.a(false);
                }
            } else if (this.f129012b.P == null) {
                ao aoVar2 = this.f129012b;
                aoVar2.b(aoVar2.aa);
            } else {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar2 = this.f129012b.P;
                if (bVar2 != null) {
                    bVar2.a(true);
                }
            }
            e eVar = this.f129012b.f128950e;
            if (eVar != null) {
                eVar.a(this.f129012b.Q);
            }
            l lVar = this.f129012b.f128953h;
            if (lVar != null) {
                lVar.a(this.f129012b.Q);
            }
            al alVar = this.f129012b.f128951f;
            if (alVar != null) {
                alVar.a(this.f129012b.Q);
            }
        }
    }

    public static boolean b(MediaModel mediaModel) {
        String h2 = com.ss.android.ugc.tools.utils.h.h(mediaModel.f109390b);
        if (h2 == null || h.m.p.c(h2, ".gif", true) || h.m.p.c(h2, "/gif", true) || h.m.p.c(h2, ".png", true) || h.m.p.c(h2, "/png", true) || h.m.p.c(h2, ".jpg", true) || h.m.p.c(h2, "/jpg", true) || h.m.p.c(h2, ".jpeg", true) || h.m.p.c(h2, "/jpeg", true)) {
            return false;
        }
        return true;
    }

    private final int f(int i2) {
        Integer num;
        if (this.H != 1) {
            ViewPager viewPager = this.f128956k;
            if (viewPager != null) {
                num = Integer.valueOf(viewPager.getCurrentItem());
            } else {
                num = null;
            }
            int i3 = this.E;
            int i4 = 12;
            if (num != null && num.intValue() == i3) {
                if (this.aq != 2) {
                    if (i2 == 1) {
                        i4 = 13;
                    } else {
                        i4 = 2;
                    }
                }
                this.H = i4;
            } else {
                int i5 = this.F;
                if (num != null && num.intValue() == i5) {
                    int i6 = this.f128947b;
                    int i7 = 15;
                    if (!(i6 == 10 || i6 == 12)) {
                        i7 = 3;
                    }
                    this.H = i7;
                } else {
                    int i8 = this.G;
                    if (num != null && num.intValue() == i8) {
                        this.H = 17;
                    }
                }
            }
            if (this.H == 3 && (i2 > 1 || (this.at & 1) == 0)) {
                this.H = 11;
            }
        }
        return this.H;
    }

    public final void d(boolean z2) {
        int i2;
        float f2;
        View view = this.ai;
        if (view != null) {
            float[] fArr = new float[2];
            float f3 = 0.0f;
            if (z2) {
                f2 = 0.0f;
            } else {
                f2 = 180.0f;
            }
            fArr[0] = f2;
            if (z2) {
                f3 = 180.0f;
            }
            fArr[1] = f3;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", fArr);
            h.f.b.l.b(ofFloat, "");
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
        ae aeVar = this.f128952g;
        if (aeVar != null) {
            aeVar.f128911l = z2;
            int i3 = -1;
            if (z2) {
                i2 = 0;
            } else {
                i2 = -1;
                i3 = 0;
            }
            int height = aeVar.f128905f.getHeight();
            ValueAnimator duration = ValueAnimator.ofFloat((float) i3, (float) i2).setDuration(500L);
            duration.setInterpolator(new AccelerateDecelerateInterpolator());
            duration.addUpdateListener(new aj(aeVar, height));
            duration.start();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ap<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f128968a;

        static {
            Covode.recordClassIndex(84631);
        }

        ap(ao aoVar) {
            this.f128968a = aoVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            MethodCollector.i(7975);
            Boolean bool = (Boolean) obj;
            h.f.b.l.d(bool, "");
            cr a2 = cr.a();
            h.f.b.l.b(a2, "");
            boolean z = true;
            if (a2.o.booleanValue() || !com.ss.android.ugc.aweme.property.d.a() || com.ss.android.ugc.aweme.setting.d.a() <= 60000 || com.ss.android.ugc.aweme.setting.d.a() > 180000 || !bool.booleanValue()) {
                z = false;
            } else {
                ViewStub viewStub = this.f128968a.f128955j;
                if (!(viewStub == null || viewStub.getParent() == null || viewStub == null)) {
                    viewStub.inflate();
                }
                ao aoVar = this.f128968a;
                aoVar.f128954i = (NoticeView) aoVar.b(R.id.cwn);
                NoticeView noticeView = this.f128968a.f128954i;
                if (noticeView != null) {
                    noticeView.setVisibility(0);
                }
                int a3 = (int) (com.ss.android.ugc.aweme.setting.d.a() / 60000);
                NoticeView noticeView2 = this.f128968a.f128954i;
                if (noticeView2 != null) {
                    String string = this.f128968a.t().getResources().getString(R.string.h76, Integer.valueOf(a3));
                    h.f.b.l.b(string, "");
                    noticeView2.setTitleContent(string);
                }
                NoticeView noticeView3 = this.f128968a.f128954i;
                if (noticeView3 != null) {
                    noticeView3.setOnCloseClickListener(new h.f.a.a<h.z>(this) {
                        /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao.ap.AnonymousClass1 */
                        final /* synthetic */ ap this$0;

                        static {
                            Covode.recordClassIndex(84632);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ h.z invoke() {
                            NoticeView noticeView = this.this$0.f128968a.f128954i;
                            if (noticeView != null) {
                                noticeView.setVisibility(8);
                            }
                            return h.z.f158842a;
                        }
                    });
                }
            }
            Boolean valueOf = Boolean.valueOf(z);
            MethodCollector.o(7975);
            return valueOf;
        }
    }

    private final void c(List<String> list) {
        boolean z2;
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.c cVar = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.c();
        if (list == null || !(!list.isEmpty())) {
            z2 = false;
        } else {
            z2 = true;
        }
        cVar.f129468d = z2;
        cVar.f129467c = this.H;
        cVar.f129469e = this.f128950e;
        cVar.f129471g = this.f128951f;
        cVar.f129470f = this.f128953h;
        cVar.f129472h = this.ax;
        cVar.f129473i = this.am;
        cVar.f129474j = this.an;
        cVar.f129475k = this.f128957l;
        cVar.n = this.T;
        cVar.o = this.aT;
        if (!com.ss.android.ugc.tools.utils.k.a(list)) {
            if (list == null) {
                h.f.b.l.b();
            }
            cVar.a(list);
        }
        if (this.U != null && !com.ss.android.ugc.tools.utils.k.a(null)) {
            if (this.U == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b();
            cVar.a();
        }
        ArrayList<CutSameVideoImageExtraData> arrayList = this.aI;
        if (arrayList != null && (!arrayList.isEmpty())) {
            ArrayList<CutSameVideoImageExtraData> arrayList2 = cVar.f129477m;
            ArrayList<CutSameVideoImageExtraData> arrayList3 = this.aI;
            if (arrayList3 == null) {
                h.f.b.l.b();
            }
            arrayList2.addAll(arrayList3);
        }
        cVar.f129466b = new v(this);
        cVar.f129465a = new w(this);
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar = this.P;
        if (bVar != null) {
            bVar.a(cVar);
        }
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar2 = this.P;
        if (bVar2 != null) {
            View c2 = c(R.id.cn7);
            h.f.b.l.b(c2, "");
            bVar2.a(c2);
        }
        this.aK = true;
        this.au = true;
        this.av = true;
        al alVar = this.f128951f;
        if (alVar != null) {
            alVar.q = null;
        }
        ShortVideoContext shortVideoContext = this.B;
        if (shortVideoContext != null) {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.f.a(shortVideoContext.q, shortVideoContext.r);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z2) {
        String str;
        aa.c k2;
        MusicModel musicModel = null;
        if (z2) {
            ChooseMediaViewModel chooseMediaViewModel = this.T;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.a((MusicModel) null, (String) null);
            }
            com.ss.android.ugc.aweme.port.in.aa aaVar = (com.ss.android.ugc.aweme.port.in.aa) com.ss.android.ugc.aweme.port.in.g.a().s();
            if (!(aaVar == null || (k2 = aaVar.k()) == null)) {
                musicModel = k2.c();
            }
        } else {
            musicModel = this.aF;
        }
        at.a a2 = com.ss.android.ugc.aweme.port.in.l.f115658a.d().a();
        androidx.fragment.app.e b2 = com.bytedance.scene.ktx.c.b(this);
        c cVar = new c(this.B, this.T, this.f128947b);
        ShortVideoContext shortVideoContext = this.B;
        if (shortVideoContext == null || (str = shortVideoContext.q) == null) {
            str = "";
        }
        a2.a(b2, musicModel, cVar, str);
    }

    public final void a(Class<? extends com.bytedance.scene.j> cls) {
        h.f.b.l.d(cls, "");
        com.bytedance.scene.navigation.d a2 = com.bytedance.scene.ktx.b.a(this);
        if (a2 != null) {
            Bundle bundle = new Bundle();
            f.a aVar = new f.a();
            aVar.f42754c = new com.bytedance.scene.a.a.c();
            aVar.f42752a = true;
            a2.a(cls, bundle, aVar.b());
        }
    }

    public final void c(boolean z2) {
        int i2;
        Parcelable parcelable;
        Parcelable parcelable2;
        Bundle a2;
        al alVar;
        int i3;
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar;
        ArrayList<String> arrayList;
        List<MvImageChooseAdapter.MyMediaModel> a3;
        if (this.ae != -1) {
            com.ss.android.ugc.aweme.common.r.a("gif_stay_time", new com.ss.android.ugc.tools.f.b().a("duration", (int) (System.currentTimeMillis() - this.ae)).a("enter_from", "video_shoot_page").f149193a);
            this.ae = -1;
        }
        int i4 = 0;
        if (z2) {
            int f2 = f(this.y.size());
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar2 = this.P;
            if (bVar2 != null) {
                if (L()) {
                    f2 = bVar2.a(this.H, this.f128947b);
                } else if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(this.f128947b)) {
                    f2 = bVar2.a(this.H, this.f128947b);
                }
            }
            Parcelable parcelable3 = null;
            String str = "";
            if (fb.c() && (((bVar = this.P) == null || (a3 = bVar.a()) == null || a3.isEmpty()) && this.y.size() == 1)) {
                MediaModel mediaModel = this.y.get(0);
                h.f.b.l.b(mediaModel, str);
                if (mediaModel.b() && ((arrayList = this.aa) == null || arrayList.isEmpty())) {
                    f2 = 13;
                }
            }
            int i5 = 3;
            if (f2 != 1 || this.S == null) {
                int i6 = this.f128947b;
                int i7 = 7;
                if (i6 == 3) {
                    i3 = 7;
                } else {
                    i3 = f2;
                    if (i6 == 12) {
                        if (this.aq == 10004) {
                            i7 = 17;
                        }
                        i3 = i7;
                    } else if (i6 == 4) {
                        i3 = 8;
                    } else if (i6 == 10) {
                        i3 = 15;
                    } else if (i6 == 11) {
                        i3 = 16;
                    }
                }
                v a4 = MediaChosenResultProcessFactory.a().a(com.bytedance.scene.ktx.c.b(this), i3, this.az, this.aA);
                h.f.b.l.b(a4, str);
                this.S = a4;
            }
            Intent intent = new Intent();
            if (f2 == 2 && this.y.size() > 1) {
                Iterator<MediaModel> it = this.y.iterator();
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    if (it.hasNext()) {
                        MediaModel next = it.next();
                        h.f.b.l.b(next, str);
                        if (!next.b()) {
                            if (!z3) {
                                z3 = true;
                            }
                            if (!z4) {
                                continue;
                            }
                        } else if (!z4) {
                            z4 = true;
                        }
                        if (z3) {
                            break;
                        }
                    } else if (z4) {
                        if (!z3) {
                            i5 = 1;
                        }
                    } else if (!z3) {
                        i5 = 0;
                    }
                }
                i5 = 2;
                intent.putExtra("extra_stick_point_type", i5);
            }
            J();
            e eVar = this.f128950e;
            if ((eVar == null || (i2 = eVar.b()) == 0) && ((alVar = this.f128951f) == null || (i2 = alVar.b()) == 0)) {
                l lVar = this.f128953h;
                if (lVar != null) {
                    i4 = lVar.b();
                }
                i2 = i4;
            }
            intent.putExtra("key_choose_media_item_size", i2);
            intent.putExtra("key_choose_media_data", this.y);
            intent.putExtra("key_select_mv_data", this.as);
            intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
            intent.putExtra("key_choose_scene", this.f128947b);
            String str2 = this.V;
            if (str2 == null) {
                str2 = str;
            }
            intent.putExtra("shoot_way", str2);
            String str3 = this.W;
            if (str3 == null) {
                str3 = str;
            }
            intent.putExtra("content_source", str3);
            String str4 = this.X;
            if (str4 == null) {
                str4 = str;
            }
            intent.putExtra("content_type", str4);
            String str5 = this.Y;
            if (str5 != null) {
                str = str5;
            }
            intent.putExtra("creation_id", str);
            ShortVideoContext shortVideoContext = this.B;
            if (shortVideoContext != null) {
                intent.putExtra("key_short_video_context", shortVideoContext);
            }
            u uVar = this.aB;
            if (!(uVar == null || (a2 = uVar.a()) == null)) {
                intent.putExtra("key_extra_info", a2);
            }
            Bundle bundle = this.r;
            if (bundle != null && bundle.containsKey("key_custom_effect_sticker")) {
                Bundle bundle2 = this.r;
                if (bundle2 != null) {
                    parcelable2 = bundle2.getParcelable("key_custom_effect_sticker");
                } else {
                    parcelable2 = null;
                }
                if (!(parcelable2 instanceof Parcelable)) {
                    parcelable2 = null;
                }
                intent.putExtra("key_custom_effect_sticker", parcelable2);
            }
            if (K()) {
                Bundle bundle3 = this.r;
                if (bundle3 != null) {
                    parcelable = bundle3.getParcelable("key_story_edit_context");
                } else {
                    parcelable = null;
                }
                if (parcelable instanceof Parcelable) {
                    parcelable3 = parcelable;
                }
                intent.putExtra("key_story_edit_context", parcelable3);
            }
            v vVar = this.S;
            if (vVar != null) {
                vVar.a(this.aq, -1, intent);
            }
            E().a(this.aE, this.aD);
            return;
        }
        v vVar2 = this.S;
        if (vVar2 != null) {
            vVar2.a();
        }
        H();
        if (!this.aP) {
            t().overridePendingTransition(0, R.anim.x);
        }
    }

    public final void a(List<? extends MvImageChooseAdapter.MyMediaModel> list) {
        TextView textView;
        if (L() || com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(this.f128947b) || com.ss.android.ugc.tools.utils.k.a(list)) {
            TextView textView2 = this.f128948c;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        if (list != null) {
            Integer num = null;
            if (!list.isEmpty()) {
                int size = list.size();
                TextView textView3 = this.f128948c;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                h(size);
                ViewPager viewPager = this.f128956k;
                if (viewPager != null) {
                    num = Integer.valueOf(viewPager.getCurrentItem());
                }
                int i2 = this.am;
                int i3 = this.E;
                if (num != null && num.intValue() == i3) {
                    i2 = this.an;
                }
                if (size < i2) {
                    TextView textView4 = this.f128948c;
                    if (textView4 != null) {
                        textView4.setTextColor(androidx.core.content.b.c(textView4.getContext(), R.color.ob));
                    }
                    TextView textView5 = this.f128948c;
                    if (textView5 != null) {
                        textView5.setClickable(false);
                    }
                } else {
                    TextView textView6 = this.f128948c;
                    if (textView6 != null) {
                        textView6.setTextColor(androidx.core.content.b.c(textView6.getContext(), R.color.bh));
                    }
                    TextView textView7 = this.f128948c;
                    if (textView7 != null) {
                        textView7.setClickable(true);
                    }
                }
                this.y.clear();
                this.y.addAll(list);
                if (com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(this.f128947b) && (textView = this.f128948c) != null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
        }
        TextView textView8 = this.f128948c;
        if (textView8 != null) {
            textView8.setVisibility(8);
        }
    }

    public static final class r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f129001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f129002b;

        static {
            Covode.recordClassIndex(84669);
        }

        r(ao aoVar, Bundle bundle) {
            this.f129001a = aoVar;
            this.f129002b = bundle;
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    public final void a(MvImageChooseAdapter.b bVar, String str) {
        E().a(this.B, bVar, str);
    }

    public static final class c implements IServiceMusicResDownListener {

        /* renamed from: a  reason: collision with root package name */
        private final ShortVideoContext f128974a;

        /* renamed from: b  reason: collision with root package name */
        private final ChooseMediaViewModel f128975b;

        /* renamed from: c  reason: collision with root package name */
        private final int f128976c;

        static {
            Covode.recordClassIndex(84640);
        }

        @Override // com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
        public final void onFailed() {
        }

        @Override // com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener
        public final void onSuccess(MusicModel musicModel, String str) {
            ShortVideoContext shortVideoContext;
            Workspace workspace;
            h.f.b.l.d(musicModel, "");
            h.f.b.l.d(str, "");
            ChooseMediaViewModel chooseMediaViewModel = this.f128975b;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.a(true);
            }
            ChooseMediaViewModel chooseMediaViewModel2 = this.f128975b;
            if (chooseMediaViewModel2 != null) {
                chooseMediaViewModel2.a(musicModel, str);
            }
            ChooseMediaViewModel chooseMediaViewModel3 = this.f128975b;
            if (chooseMediaViewModel3 != null) {
                chooseMediaViewModel3.b(musicModel, str);
            }
            if (this.f128976c == 9 && (shortVideoContext = this.f128974a) != null && (workspace = shortVideoContext.f124757b.f124713h) != null) {
                workspace.a(str);
            }
        }

        public c(ShortVideoContext shortVideoContext, ChooseMediaViewModel chooseMediaViewModel, int i2) {
            this.f128974a = shortVideoContext;
            this.f128975b = chooseMediaViewModel;
            this.f128976c = i2;
        }
    }

    @Override // com.ss.android.ugc.tools.view.a.a
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.aQ = true;
            v vVar = this.S;
            if (vVar != null) {
                vVar.a();
            }
            com.bytedance.scene.j jVar = null;
            if (this.aP) {
                com.bytedance.scene.navigation.d a2 = com.bytedance.scene.ktx.b.a(this);
                if (a2 != null) {
                    jVar = a2.d();
                }
                if (h.f.b.l.a(jVar, this)) {
                    if (this.af.length() > 0) {
                        I();
                    } else {
                        S();
                    }
                    return true;
                }
            }
            com.bytedance.scene.navigation.d a3 = com.bytedance.scene.ktx.b.a(this);
            if (a3 == null || !a3.E()) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        b.a.f132249a.enter(s(), "album");
        VideoRecordNewActivity videoRecordNewActivity = null;
        if (this.ac == null) {
            Activity t2 = t();
            if (!(t2 instanceof com.ss.android.ugc.tools.view.a.c)) {
                t2 = null;
            }
            this.ac = (com.ss.android.ugc.tools.view.a.c) t2;
        }
        com.ss.android.ugc.tools.view.a.c cVar = this.ac;
        if (cVar != null) {
            cVar.a((com.ss.android.ugc.tools.view.a.b) this);
            cVar.b((com.ss.android.ugc.tools.view.a.a) this);
        }
        Activity t3 = t();
        if (t3 instanceof VideoRecordNewActivity) {
            videoRecordNewActivity = t3;
        }
        VideoRecordNewActivity videoRecordNewActivity2 = videoRecordNewActivity;
        if (videoRecordNewActivity2 != null) {
            videoRecordNewActivity2.v = this;
        }
        View a2 = com.a.a(layoutInflater, R.layout.atz, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:360:0x07da, code lost:
        if (r15 != 6) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x07de, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0068, code lost:
        if (r15 != 6) goto L_0x006a;
     */
    @Override // com.bytedance.scene.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r17, android.os.Bundle r18) {
        /*
        // Method dump skipped, instructions count: 2043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao.a(android.view.View, android.os.Bundle):void");
    }

    public final void a(int i2, boolean z2, List<? extends MvImageChooseAdapter.MyMediaModel> list) {
        CharSequence charSequence;
        String valueOf;
        int i3;
        int i4;
        boolean z3;
        if (i2 != this.aw) {
            if (i2 != this.G && !this.aR) {
                this.aR = V();
            }
            if (i2 != this.G && !this.aS) {
                R();
            }
            View view = this.aj;
            int i5 = 0;
            if (view != null) {
                if (i2 == this.G) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                view.setClickable(z3);
            }
            View view2 = this.ai;
            if (view2 != null) {
                if (i2 == this.G) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                view2.setVisibility(i4);
            }
            TextView textView = this.f128948c;
            if (textView != null) {
                if (!z2) {
                    i5 = 8;
                }
                textView.setVisibility(i5);
            }
            if (z2) {
                a(list);
            }
            if (this.aw == this.G) {
                valueOf = this.ay;
                if (valueOf == null) {
                    h.f.b.l.a("lastPhotoTitleText");
                }
            } else {
                TextView textView2 = this.f128949d;
                if (textView2 != null) {
                    charSequence = textView2.getText();
                } else {
                    charSequence = null;
                }
                valueOf = String.valueOf(charSequence);
            }
            this.ay = valueOf;
            TextView textView3 = this.f128949d;
            if (textView3 != null) {
                if (i2 == this.G) {
                    valueOf = t().getResources().getString(R.string.c50);
                } else if (valueOf == null) {
                    h.f.b.l.a("lastPhotoTitleText");
                }
                textView3.setText(valueOf);
            }
            int i6 = this.f128947b;
            if (i6 == 12 || i6 == 3) {
                if (i2 == this.G) {
                    i3 = 10004;
                } else {
                    i3 = 10001;
                }
                this.aq = i3;
            }
            this.aw = i2;
        }
    }

    public final void a(h.f.a.a<? extends View> aVar, h.f.a.a<? extends MvImageChooseAdapter.MyMediaModel> aVar2, h.f.a.a<Integer> aVar3, h.f.a.a<Boolean> aVar4) {
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b bVar;
        ArrayList<MvImageChooseAdapter.MyMediaModel> e2;
        ChooseMediaViewModel chooseMediaViewModel;
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar2, "");
        h.f.b.l.d(aVar3, "");
        h.f.b.l.d(aVar4, "");
        if (!(!fb.b() || (bVar = this.P) == null || (e2 = bVar.e()) == null || (chooseMediaViewModel = this.T) == null)) {
            chooseMediaViewModel.a(e2);
        }
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f.t = new i(this, aVar2, aVar3, aVar4);
        a(com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.f.class);
        ViewPager viewPager = this.f128956k;
        if (viewPager != null) {
            Fragment e3 = e(viewPager.getCurrentItem());
            Objects.requireNonNull(e3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
            a aVar5 = (a) e3;
            if (aVar5 != null) {
                aVar5.f();
            }
        }
        E().a(this.B, (MvImageChooseAdapter.MyMediaModel) aVar2.invoke());
    }
}
