package com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.a.r;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.extension.player.g;
import com.bytedance.tux.extension.player.view.TuxPlayerView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.ecommerce.api.model.VideoInfo;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.t;
import com.ss.android.ugc.aweme.ecommerce.pdp.d.n;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.video.v;
import h.h;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class ProductDescVideoViewHolder extends AbsFullSpanVH<n> implements au {
    public static final b n = new b((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.ecommerce.b.a f86765f;

    /* renamed from: g  reason: collision with root package name */
    public Aweme f86766g;

    /* renamed from: j  reason: collision with root package name */
    public TuxPlayerView f86767j;

    /* renamed from: k  reason: collision with root package name */
    public final l f86768k = new ProductDescVideoViewHolder$observer$1(this);

    /* renamed from: l  reason: collision with root package name */
    public com.bytedance.tux.extension.player.b f86769l = new e(this);

    /* renamed from: m  reason: collision with root package name */
    public final Fragment f86770m;
    private final h o;

    static {
        Covode.recordClassIndex(54348);
    }

    public final PdpViewModel n() {
        return (PdpViewModel) this.o.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(54350);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void j() {
        super.j();
        this.f86770m.getLifecycle().b(this.f86768k);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        f.a.b.b unused = selectSubscribe(n(), a.f86780a, new ah(), new d(this));
        this.f86770m.getLifecycle().a(this.f86768k);
    }

    static final class d extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<n>, Integer, z> {
        final /* synthetic */ ProductDescVideoViewHolder this$0;

        static {
            Covode.recordClassIndex(54352);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ProductDescVideoViewHolder productDescVideoViewHolder) {
            super(2);
            this.this$0 = productDescVideoViewHolder;
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TuxPlayerView f86774a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f86775b;

            static {
                Covode.recordClassIndex(54353);
            }

            a(TuxPlayerView tuxPlayerView, d dVar) {
                this.f86774a = tuxPlayerView;
                this.f86775b = dVar;
            }

            public final void run() {
                boolean z;
                ILiveOuterService s = LiveOuterService.s();
                h.f.b.l.b(s, "");
                Boolean a2 = s.p().a();
                if (a2 != null) {
                    z = a2.booleanValue();
                } else {
                    z = false;
                }
                if (ProductDescVideoViewHolder.a((View) this.f86774a)) {
                    this.f86774a.e();
                } else if (!z) {
                    this.f86774a.d();
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(JediSimpleViewHolder<n> jediSimpleViewHolder, Integer num) {
            num.intValue();
            h.f.b.l.d(jediSimpleViewHolder, "");
            TuxPlayerView tuxPlayerView = this.this$0.f86767j;
            if (tuxPlayerView != null) {
                tuxPlayerView.post(new a(tuxPlayerView, this));
            }
            return z.f158842a;
        }
    }

    public static final class e implements com.bytedance.tux.extension.player.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductDescVideoViewHolder f86776a;

        static {
            Covode.recordClassIndex(54354);
        }

        @Override // com.bytedance.tux.extension.player.b
        public final void a() {
            Video video;
            k kVar;
            String str;
            Aweme aweme = this.f86776a.f86766g;
            if (aweme != null && (video = aweme.getVideo()) != null && (kVar = this.f86776a.n().s) != null) {
                Aweme aweme2 = this.f86776a.f86766g;
                if (aweme2 != null) {
                    str = aweme2.getAid();
                } else {
                    str = null;
                }
                int videoLength = video.getVideoLength() * 1000;
                if (str == null) {
                    str = "";
                }
                new t(str, videoLength).c(kVar.f86382a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(ProductDescVideoViewHolder productDescVideoViewHolder) {
            this.f86776a = productDescVideoViewHolder;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<PdpViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_pdp_vh_desc_ProductDescVideoViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class c extends com.bytedance.lighten.a.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.tux.extension.player.view.a f86771a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProductDescVideoViewHolder f86772b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f86773c;

        static {
            Covode.recordClassIndex(54351);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            this.f86771a.f45020f = bitmap;
            TuxPlayerView tuxPlayerView = this.f86772b.f86767j;
            if (tuxPlayerView != null) {
                tuxPlayerView.setParams(this.f86771a);
            }
        }

        c(com.bytedance.tux.extension.player.view.a aVar, ProductDescVideoViewHolder productDescVideoViewHolder, n nVar) {
            this.f86771a = aVar;
            this.f86772b = productDescVideoViewHolder;
            this.f86773c = nVar;
        }
    }

    public static boolean a(View view) {
        h.f.b.l.d(view, "");
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        int i2 = (rect.bottom - rect.top) * (rect.right - rect.left);
        Rect c2 = o.c(view);
        if (((float) c2.top) + (((float) c2.height()) / 2.0f) < ((float) com.ss.android.ugc.aweme.ecommerce.util.h.f87568b) / 2.0f) {
            i2 -= c2.width() * com.ss.android.ugc.aweme.base.utils.n.a(44.0d);
        }
        if (i2 >= (view.getMeasuredHeight() * view.getMeasuredWidth()) / 2) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(Object obj) {
        String str;
        int i2;
        int i3;
        int i4;
        Window window;
        Window window2;
        VideoInfo videoInfo;
        Integer num;
        VideoInfo videoInfo2;
        Integer num2;
        VideoInfo videoInfo3;
        Integer num3;
        VideoInfo videoInfo4;
        n nVar = (n) obj;
        h.f.b.l.d(nVar, "");
        com.ss.android.ugc.aweme.ecommerce.api.model.Video video = nVar.f86479a;
        Aweme aweme = new Aweme();
        Video video2 = new Video();
        com.ss.android.ugc.aweme.video.local.e eVar = new com.ss.android.ugc.aweme.video.local.e();
        eVar.setSourceId(video.f84633a);
        List<VideoInfo> list = video.f84637e;
        ViewGroup viewGroup = null;
        int i5 = 0;
        if (list == null || (videoInfo4 = (VideoInfo) h.a.n.b((List) list, 0)) == null) {
            str = null;
        } else {
            str = videoInfo4.f84638a;
        }
        eVar.setUri(str);
        eVar.setUrlList(new ArrayList());
        eVar.getUrlList().add(eVar.getUri());
        eVar.setUrlKey(video.f84633a);
        video2.setPlayAddr(eVar);
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(video.f84635c);
        urlModel.setUrlList(new ArrayList());
        urlModel.getUrlList().add(urlModel.getUri());
        video2.setCover(urlModel);
        List<VideoInfo> list2 = video.f84637e;
        if (list2 == null || (videoInfo3 = (VideoInfo) h.a.n.b((List) list2, 0)) == null || (num3 = videoInfo3.f84641d) == null) {
            i2 = 0;
        } else {
            i2 = num3.intValue();
        }
        video2.setWidth(i2);
        List<VideoInfo> list3 = video.f84637e;
        if (list3 == null || (videoInfo2 = (VideoInfo) h.a.n.b((List) list3, 0)) == null || (num2 = videoInfo2.f84642e) == null) {
            i3 = 0;
        } else {
            i3 = num2.intValue();
        }
        video2.setHeight(i3);
        Double d2 = video.f84634b;
        if (d2 != null) {
            i4 = (int) d2.doubleValue();
        } else {
            i4 = 0;
        }
        video2.setVideoLength(i4);
        video2.setPlayAddrBytevc1(video2.getPlayAddr());
        aweme.setVideo(video2);
        aweme.setAid(video.f84633a);
        this.f86766g = aweme;
        Video video3 = aweme.getVideo();
        if (video3 != null) {
            com.ss.android.ugc.aweme.ecommerce.b.a aVar = this.f86765f;
            List<VideoInfo> list4 = nVar.f86479a.f84637e;
            if (!(list4 == null || (videoInfo = (VideoInfo) h.a.n.b((List) list4, 0)) == null || (num = videoInfo.f84646i) == null)) {
                i5 = num.intValue();
            }
            h.f.b.l.d(video3, "");
            aVar.f84650d = video3;
            aVar.f84651e = i5;
            com.ss.android.ugc.aweme.ecommerce.b.a aVar2 = this.f86765f;
            Aweme aweme2 = this.f86766g;
            v vVar = aVar2.f84653g;
            if (vVar != null) {
                vVar.a(aweme2);
            }
            new com.bytedance.tux.extension.player.view.a();
            com.bytedance.tux.extension.player.view.a aVar3 = new com.bytedance.tux.extension.player.view.a();
            aVar3.f45015a = this.f86765f;
            aVar3.f45018d = new g(video3.getWidth(), video3.getHeight());
            aVar3.f45019e = Integer.valueOf(video3.getVideoLength());
            aVar3.f45021g = this.f86769l;
            Fragment fragment = this.f86770m;
            if (fragment instanceof com.ss.android.ugc.aweme.ecommerce.pdp.i) {
                androidx.fragment.app.e activity = fragment.getActivity();
                if (activity != null) {
                    window2 = activity.getWindow();
                } else {
                    window2 = null;
                }
                aVar3.f45017c = window2;
                androidx.fragment.app.e activity2 = this.f86770m.getActivity();
                if (activity2 != null) {
                    viewGroup = (ViewGroup) activity2.findViewById(16908290);
                }
                aVar3.f45016b = viewGroup;
            } else if (fragment instanceof androidx.fragment.app.d) {
                if (!(fragment instanceof androidx.fragment.app.d)) {
                    fragment = null;
                }
                androidx.fragment.app.d dVar = (androidx.fragment.app.d) fragment;
                if (dVar != null) {
                    Dialog dialog = dVar.getDialog();
                    if (dialog != null) {
                        window = dialog.getWindow();
                    } else {
                        window = null;
                    }
                    aVar3.f45017c = window;
                    Dialog dialog2 = dVar.getDialog();
                    if (dialog2 != null) {
                        viewGroup = (ViewGroup) dialog2.findViewById(16908290);
                    }
                    aVar3.f45016b = viewGroup;
                }
            }
            com.bytedance.lighten.a.v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(video3.getCover()));
            View view = this.itemView;
            h.f.b.l.b(view, "");
            a2.f39906b = view.getContext();
            a2.u = Bitmap.Config.ARGB_8888;
            a2.a(new c(aVar3, this, nVar));
            TuxPlayerView tuxPlayerView = this.f86767j;
            if (tuxPlayerView != null) {
                tuxPlayerView.setParams(aVar3);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProductDescVideoViewHolder(android.view.ViewGroup r5, androidx.fragment.app.Fragment r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            h.f.b.l.d(r6, r3)
            android.content.Context r2 = r5.getContext()
            r1 = 2131559012(0x7f0d0264, float:1.8743356E38)
            r0 = 0
            android.view.View r0 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            r4.f86770m = r6
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
            h.k.c r1 = h.f.b.ab.a(r0)
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = h.i.a(r0)
            r4.o = r0
            android.view.View r1 = r4.itemView
            h.f.b.l.b(r1, r3)
            r0 = 2131369430(0x7f0a1dd6, float:1.8358838E38)
            android.view.View r1 = r1.findViewById(r0)
            com.bytedance.tux.extension.player.view.TuxPlayerView r1 = (com.bytedance.tux.extension.player.view.TuxPlayerView) r1
            com.ss.android.ugc.aweme.ecommerce.b.a r0 = new com.ss.android.ugc.aweme.ecommerce.b.a
            h.f.b.l.b(r1, r3)
            r0.<init>(r1)
            r4.f86765f = r0
            r4.f86767j = r1
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$observer$1 r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$observer$1
            r0.<init>(r4)
            r4.f86768k = r0
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$e r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder$e
            r0.<init>(r4)
            r4.f86769l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder.<init>(android.view.ViewGroup, androidx.fragment.app.Fragment):void");
    }
}
