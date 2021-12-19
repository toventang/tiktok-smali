package com.ss.android.ugc.aweme.tools.mvtemplate;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.fragment.app.e;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.jedi.arch.t;
import com.facebook.common.d.m;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.bv.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.upload.x;
import com.ss.android.ugc.aweme.tools.mvtemplate.e.g;
import com.ss.android.ugc.aweme.tools.mvtemplate.n;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.gamora.recorder.permission.PermissionStateViewModel;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

public final class b implements a, l {

    /* renamed from: a  reason: collision with root package name */
    e f140781a;

    /* renamed from: b  reason: collision with root package name */
    MvTemplateView f140782b;

    /* renamed from: c  reason: collision with root package name */
    f f140783c;

    /* renamed from: d  reason: collision with root package name */
    Effect f140784d;

    /* renamed from: e  reason: collision with root package name */
    ShortVideoContext f140785e;

    /* renamed from: f  reason: collision with root package name */
    public String f140786f;

    /* renamed from: g  reason: collision with root package name */
    String f140787g;

    /* renamed from: h  reason: collision with root package name */
    int f140788h;

    /* renamed from: i  reason: collision with root package name */
    String f140789i = "";

    /* renamed from: j  reason: collision with root package name */
    String f140790j;

    /* renamed from: k  reason: collision with root package name */
    public int f140791k;

    /* renamed from: l  reason: collision with root package name */
    public int f140792l;

    /* renamed from: m  reason: collision with root package name */
    public String f140793m;
    public boolean n = true;
    boolean o;
    public boolean p;
    public volatile boolean q;
    private com.bytedance.o.f r;
    private ViewStubCompat s;
    private boolean t;
    private final int u = 20;
    private boolean v = true;
    private boolean w;

    static {
        Covode.recordClassIndex(91923);
    }

    private static boolean m() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private void n() {
        if (this.o) {
            j();
        } else {
            o();
        }
    }

    @Override // com.ss.android.ugc.aweme.bv.a
    public final void a() {
        MvTemplateView mvTemplateView = this.f140782b;
        if (mvTemplateView != null && mvTemplateView.getVisibility() == 0) {
            this.f140782b.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.bv.a
    public final void c() {
        if (g()) {
            this.f140782b.e();
        }
    }

    public final void k() {
        this.f140783c.a("mv", new IFetchEffectChannelListener() {
            /* class com.ss.android.ugc.aweme.tools.mvtemplate.b.AnonymousClass5 */

            static {
                Covode.recordClassIndex(91928);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                b bVar = b.this;
                bVar.a(bVar.f140786f);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                b bVar = b.this;
                if (!(effectChannelResponse2 == null || k.a(effectChannelResponse2.getAllCategoryEffects()))) {
                    ArrayList arrayList = new ArrayList();
                    for (Effect effect : effectChannelResponse2.getAllCategoryEffects()) {
                        MvThemeData mvThemeData = new MvThemeData();
                        mvThemeData.a(effect);
                        mvThemeData.f140619b = effectChannelResponse2.getUrlPrefix();
                        arrayList.add(mvThemeData);
                    }
                    if (arrayList.size() > 0) {
                        if (bVar.f140784d != null && !TextUtils.isEmpty(bVar.f140784d.getEffectId())) {
                            MvThemeData mvThemeData2 = new MvThemeData();
                            mvThemeData2.a(bVar.f140784d);
                            mvThemeData2.f140619b = effectChannelResponse2.getUrlPrefix();
                            arrayList.add(0, mvThemeData2);
                            int i2 = 1;
                            while (true) {
                                if (i2 >= arrayList.size()) {
                                    break;
                                } else if (bVar.f140784d.getEffectId().equals(((MvThemeData) arrayList.get(i2)).a())) {
                                    arrayList.remove(i2);
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        if (bVar.g()) {
                            bVar.f140782b.a(arrayList);
                            bVar.f140782b.a();
                        }
                    }
                }
            }
        });
    }

    public static boolean h() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean m2 = m();
        j.f107226e = m2;
        return m2;
    }

    private void o() {
        e eVar = this.f140781a;
        if (eVar != null && !eVar.isFinishing()) {
            i();
            this.f140783c.a("mv", true, "all", 0, 0, (IFetchPanelInfoListener) new IFetchPanelInfoListener() {
                /* class com.ss.android.ugc.aweme.tools.mvtemplate.b.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(91926);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
                public final void onFail(ExceptionResult exceptionResult) {
                    b.this.k();
                    if (exceptionResult == null) {
                        b.a(false, 1, (Exception) null);
                    } else {
                        b.a(false, exceptionResult.getErrorCode(), exceptionResult.getException());
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(PanelInfoModel panelInfoModel) {
                    PanelInfoModel panelInfoModel2 = panelInfoModel;
                    b bVar = b.this;
                    if (!(panelInfoModel2 == null || panelInfoModel2.getCategoryEffectModel() == null || k.a(panelInfoModel2.getCategoryEffectModel().getEffects()))) {
                        ArrayList arrayList = new ArrayList();
                        for (Effect effect : panelInfoModel2.getCategoryEffectModel().getEffects()) {
                            MvThemeData mvThemeData = new MvThemeData();
                            mvThemeData.a(effect);
                            mvThemeData.f140619b = panelInfoModel2.getUrlPrefix();
                            arrayList.add(mvThemeData);
                        }
                        if (arrayList.size() > 0) {
                            if (bVar.f140784d != null && !TextUtils.isEmpty(bVar.f140784d.getEffectId())) {
                                MvThemeData mvThemeData2 = new MvThemeData();
                                mvThemeData2.a(bVar.f140784d);
                                mvThemeData2.f140619b = panelInfoModel2.getUrlPrefix();
                                arrayList.add(0, mvThemeData2);
                                int i2 = 1;
                                while (true) {
                                    if (i2 >= arrayList.size()) {
                                        break;
                                    } else if (bVar.f140784d.getEffectId().equals(((MvThemeData) arrayList.get(i2)).a())) {
                                        arrayList.remove(i2);
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            if (bVar.g()) {
                                bVar.f140782b.a(arrayList);
                                bVar.f140782b.a();
                            }
                            b.a(true, 0, (Exception) null);
                        }
                    }
                    b.this.k();
                    b.a(true, 0, (Exception) null);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.bv.a
    public final void d() {
        if (this.f140782b != null) {
            EventBus.a().b(this.f140782b);
            this.f140782b.w.release();
        }
        com.ss.android.ugc.aweme.effectplatform.f fVar = this.f140783c;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        if (this.f140783c == null) {
            this.f140783c = EffectService.getInstance().createMvEffectPlatform(this.f140781a.getApplication());
        }
    }

    public final void l() {
        this.q = true;
        this.f140783c.a("mv", "all", true, 20, this.f140791k, this.f140792l, this.f140793m, (IFetchCategoryEffectListener) new IFetchCategoryEffectListener() {
            /* class com.ss.android.ugc.aweme.tools.mvtemplate.b.AnonymousClass6 */

            static {
                Covode.recordClassIndex(91929);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                b bVar = b.this;
                bVar.a(bVar.f140786f);
                if (b.this.q) {
                    b.this.q = false;
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
                CategoryPageModel categoryPageModel2 = categoryPageModel;
                if (TextUtils.isEmpty(b.this.f140793m)) {
                    b.this.f140793m = categoryPageModel2.getCategoryEffects().getVersion();
                }
                b.this.f140791k = categoryPageModel2.getCategoryEffects().getCursor();
                b.this.f140792l = categoryPageModel2.getCategoryEffects().getSortingPosition();
                b.this.n = categoryPageModel2.getCategoryEffects().hasMore();
                if (b.this.a(categoryPageModel2)) {
                    b.this.p = true;
                }
                if (b.this.q) {
                    b.this.q = false;
                }
            }
        });
    }

    private com.ss.android.ugc.tools.f.b p() {
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("shoot_way", this.f140790j).a("enter_from", "video_shoot_page").a("content_type", "mv").a("creation_id", this.f140787g);
        int i2 = this.f140788h;
        if (i2 != 0) {
            a2.a("draft_id", i2);
        }
        if (!TextUtils.isEmpty(this.f140789i)) {
            a2.a("new_draft_id", this.f140789i);
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.bv.a
    public final void b() {
        if (g()) {
            MvTemplateView mvTemplateView = this.f140782b;
            com.ss.android.ugc.aweme.tools.mvtemplate.f.b a2 = mvTemplateView.a(mvTemplateView.f140602h);
            if (a2 != null && a2.f140837e != null && a2.f140837e.isPlaying()) {
                a2.f140837e.pause();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        e eVar = this.f140781a;
        if (eVar != null && !eVar.isFinishing()) {
            i();
            this.q = true;
            this.f140783c.a("mv", "all", false, 20, this.f140791k, this.f140792l, this.f140793m, (IFetchCategoryEffectListener) new IFetchCategoryEffectListener() {
                /* class com.ss.android.ugc.aweme.tools.mvtemplate.b.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(91927);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    b.this.l();
                    if (exceptionResult == null) {
                        b.a(false, 1, (Exception) null);
                    } else {
                        b.a(false, exceptionResult.getErrorCode(), exceptionResult.getException());
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    if (TextUtils.isEmpty(b.this.f140793m)) {
                        b.this.f140793m = categoryPageModel2.getCategoryEffects().getVersion();
                    }
                    b.this.f140791k = categoryPageModel2.getCategoryEffects().getCursor();
                    b.this.f140792l = categoryPageModel2.getCategoryEffects().getSortingPosition();
                    b.this.n = categoryPageModel2.getCategoryEffects().hasMore();
                    if (!b.this.a(categoryPageModel2)) {
                        b.this.l();
                    }
                    if (b.this.q) {
                        b.this.q = false;
                    }
                    b.a(true, 0, (Exception) null);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.bv.a
    public final void f() {
        MvTemplateView mvTemplateView = this.f140782b;
        if (mvTemplateView != null) {
            if (mvTemplateView.getVisibility() != 8) {
                if (mvTemplateView.u != null) {
                    mvTemplateView.u.cancel();
                }
                mvTemplateView.v = ObjectAnimator.ofFloat(mvTemplateView.f140599e, "alpha", 1.0f, 0.0f);
                mvTemplateView.v.setDuration(300L);
                mvTemplateView.v.addListener(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0033: INVOKE  
                      (wrap: android.animation.ObjectAnimator : 0x002c: IGET  (r1v3 android.animation.ObjectAnimator) = (r5v0 'mvTemplateView' com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView) com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.v android.animation.ObjectAnimator)
                      (wrap: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView$5 : 0x0030: CONSTRUCTOR  (r0v7 com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView$5) = (r5v0 'mvTemplateView' com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView) call: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.5.<init>(com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.animation.ObjectAnimator.addListener(android.animation.Animator$AnimatorListener):void in method: com.ss.android.ugc.aweme.tools.mvtemplate.b.f():void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0030: CONSTRUCTOR  (r0v7 com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView$5) = (r5v0 'mvTemplateView' com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView) call: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.5.<init>(com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.tools.mvtemplate.b.f():void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 26 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 32 more
                    */
                /*
                // Method dump skipped, instructions count: 112
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.b.f():void");
            }

            /* access modifiers changed from: package-private */
            public final boolean g() {
                if (this.f140782b != null) {
                    return true;
                }
                ViewStubCompat viewStubCompat = this.s;
                if (viewStubCompat == null || viewStubCompat.getParent() == null) {
                    return false;
                }
                MvTemplateView mvTemplateView = (MvTemplateView) this.s.a();
                this.f140782b = mvTemplateView;
                mvTemplateView.setDiContainer(this.r);
                this.f140782b.setOnClickListener(c.f140806a);
                this.f140782b.setMvThemeClickListener(this);
                this.f140782b.setMoreDataFetcher(new d(this));
                i();
                this.f140782b.setMvEffectPlatform(this.f140783c);
                if (g()) {
                    MvTemplateView mvTemplateView2 = this.f140782b;
                    if (mvTemplateView2.f140606l != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mvTemplateView2.f140606l.getLayoutParams();
                        layoutParams.topMargin = (int) (((float) dh.c(mvTemplateView2.getContext())) + n.b(mvTemplateView2.getContext(), 24.5f));
                        mvTemplateView2.f140606l.setLayoutParams(layoutParams);
                    }
                }
                if (this.t) {
                    a(true);
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.bv.a
            public final void e() {
                if (g()) {
                    EventBus.a(EventBus.a(), this.f140782b);
                    MvTemplateView mvTemplateView = this.f140782b;
                    if (mvTemplateView.v != null) {
                        mvTemplateView.v.cancel();
                    }
                    mvTemplateView.setVisibility(0);
                    mvTemplateView.u = ObjectAnimator.ofFloat(mvTemplateView.f140599e, "alpha", 0.0f, 1.0f);
                    mvTemplateView.u.setDuration(300L);
                    mvTemplateView.u.start();
                    mvTemplateView.d();
                    if (this.f140782b.getDataCount() == 0) {
                        MvTemplateView mvTemplateView2 = this.f140782b;
                        mvTemplateView2.f140604j.setVisibility(0);
                        mvTemplateView2.f140603i.setVisibility(4);
                        mvTemplateView2.c();
                        n();
                    } else if (this.f140782b.f140605k) {
                        n();
                    } else {
                        this.f140782b.a();
                    }
                }
                r.a("enter_mv_shoot_page", p().a("content_source", "upload").a("content_type", "mv").a("enter_method", com.ss.android.ugc.aweme.tools.mvtemplate.e.b.f140823a).f149193a);
                com.ss.android.ugc.aweme.tools.mvtemplate.e.b.f140823a = "change_mode";
            }

            @Override // com.ss.android.ugc.aweme.tools.mvtemplate.l
            public final void b(MvThemeData mvThemeData) {
                a("mv_show", mvThemeData, 0);
            }

            @Override // com.ss.android.ugc.aweme.bv.a
            public final void a(boolean z) {
                this.t = z;
                MvTemplateView mvTemplateView = this.f140782b;
                if (mvTemplateView != null) {
                    mvTemplateView.a(Boolean.valueOf(z));
                }
            }

            public final void a(String str) {
                if (g()) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f140782b.getContext()).a(str).a();
                    if (this.f140782b.getDataCount() == 0) {
                        MvTemplateView mvTemplateView = this.f140782b;
                        mvTemplateView.f140604j.setVisibility(8);
                        mvTemplateView.f140603i.setVisibility(0);
                        mvTemplateView.f140596b.setVisibility(8);
                        mvTemplateView.f140595a.setVisibility(8);
                        mvTemplateView.n.setNoScroll(true);
                        mvTemplateView.f140597c.setVisibility(8);
                        ArrayList arrayList = new ArrayList();
                        int i2 = 0;
                        do {
                            MvThemeData mvThemeData = new MvThemeData();
                            mvThemeData.f140626i = true;
                            arrayList.add(mvThemeData);
                            i2++;
                        } while (i2 < 3);
                        mvTemplateView.a(arrayList);
                        mvTemplateView.c();
                        if (mvTemplateView.s) {
                            mvTemplateView.q.f140913d = false;
                            mvTemplateView.f();
                        }
                        mvTemplateView.f140605k = true;
                        mvTemplateView.f140600f.a();
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.tools.mvtemplate.l
            public final boolean a(MvThemeData mvThemeData) {
                if (!com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a(mvThemeData)) {
                    return true;
                }
                e eVar = this.f140781a;
                f fVar = new f(this);
                if (!(eVar == null || eVar.isFinishing() || mvThemeData == null || mvThemeData.f140618a == null)) {
                    String id = mvThemeData.f140618a.getId();
                    l.d(id, "");
                    if (d.a(c.f115622a, "mv_template", 0).getBoolean(id, false)) {
                        fVar.onClick(null, 0);
                    } else {
                        a.C0731a aVar = new a.C0731a(eVar);
                        aVar.f33401a = eVar.getResources().getString(R.string.h1);
                        aVar.f33402b = eVar.getResources().getString(R.string.gy);
                        aVar.b(eVar.getResources().getString(R.string.gz), (DialogInterface.OnClickListener) new com.ss.android.ugc.aweme.tools.mvtemplate.e.f(), false).a(eVar.getResources().getString(R.string.h0), (DialogInterface.OnClickListener) new g(mvThemeData, fVar), false).a().c().show();
                    }
                }
                return false;
            }

            public final boolean a(CategoryPageModel categoryPageModel) {
                if (categoryPageModel == null || k.a(categoryPageModel.getCategoryEffects().getEffects())) {
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                for (Effect effect : categoryPageModel.getCategoryEffects().getEffects()) {
                    MvThemeData mvThemeData = new MvThemeData();
                    mvThemeData.a(effect);
                    mvThemeData.f140619b = categoryPageModel.getUrl_prefix();
                    arrayList.add(mvThemeData);
                }
                if (arrayList.size() <= 0) {
                    return false;
                }
                Effect effect2 = this.f140784d;
                if (effect2 != null && !TextUtils.isEmpty(effect2.getEffectId())) {
                    if (!this.w) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                break;
                            } else if (this.f140784d.getEffectId().equals(((MvThemeData) arrayList.get(i2)).a())) {
                                arrayList.remove(i2);
                                this.w = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (this.f140782b.getDataCount() == 0) {
                        MvThemeData mvThemeData2 = new MvThemeData();
                        mvThemeData2.a(this.f140784d);
                        mvThemeData2.f140619b = categoryPageModel.getUrl_prefix();
                        arrayList.add(0, mvThemeData2);
                    }
                }
                if (!this.v) {
                    this.f140782b.a(arrayList);
                } else if (g()) {
                    this.f140782b.a(arrayList);
                    this.f140782b.a();
                    this.v = false;
                }
                if (!this.n) {
                    this.f140782b.f();
                }
                return true;
            }

            public b(e eVar, ViewStubCompat viewStubCompat, com.bytedance.o.f fVar) {
                if (eVar != null && !eVar.isFinishing()) {
                    this.r = fVar;
                    this.f140781a = eVar;
                    this.s = viewStubCompat;
                    this.f140783c = EffectService.getInstance().createMvEffectPlatform(eVar.getApplication());
                    this.f140786f = this.f140781a.getResources().getString(R.string.bpc);
                    this.o = false;
                }
            }

            private void a(String str, MvThemeData mvThemeData, int i2) {
                if (mvThemeData != null) {
                    r.a(str, p().a("mv_id", mvThemeData.a()).a("mv_name", mvThemeData.f()).a("impr_position", i2 + 1).f149193a);
                }
            }

            public static void a(boolean z, int i2, Exception exc) {
                JSONObject jSONObject = null;
                if (z) {
                    q.a("mv_resource_list_download_error_state", 0, (JSONObject) null);
                    return;
                }
                if (exc != null) {
                    jSONObject = new ar().a("exception", m.c(exc)).a("event", x.f132161a.a().toString()).a();
                }
                q.a("mv_resource_list_download_error_state", i2, jSONObject);
            }

            @Override // com.ss.android.ugc.aweme.tools.mvtemplate.l
            public final void a(MvThemeData mvThemeData, int i2, int i3) {
                if (i2 == 2) {
                    f();
                    com.ss.android.ugc.gamora.recorder.g.a aVar = (com.ss.android.ugc.gamora.recorder.g.a) this.r.b(com.ss.android.ugc.gamora.recorder.g.a.class, null);
                    if (aVar != null) {
                        aVar.a("click_cross", System.currentTimeMillis());
                    }
                } else if (i2 == 1) {
                    if (!g() || this.f140782b.getVisibility() == 0) {
                        e eVar = this.f140781a;
                        ShortVideoContext shortVideoContext = this.f140785e;
                        String str = "";
                        l.d(eVar, str);
                        if (mvThemeData != null && mvThemeData.f140620c >= 0) {
                            String d2 = mvThemeData.d();
                            if (com.ss.android.ugc.aweme.video.e.b(d2)) {
                                mvThemeData.f140628k = com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a(mvThemeData);
                                Bundle bundle = new Bundle();
                                bundle.putString("key_mv_src_limited_toast", mvThemeData.q);
                                bundle.putInt("upload_photo_min_height", mvThemeData.p);
                                bundle.putInt("upload_photo_min_width", mvThemeData.o);
                                bundle.putString("key_mv_hint_text", mvThemeData.h());
                                bundle.putString("key_mv_resource_unzip_path", d2);
                                bundle.putParcelable("key_select_mv_data", mvThemeData);
                                bundle.putParcelable("key_short_video_context", shortVideoContext);
                                String a2 = n.a.a(mvThemeData.f140618a);
                                if (a2 != null) {
                                    bundle.putString("Key_challenge_id", a2);
                                }
                                if (mvThemeData.f140618a != null) {
                                    bundle.putString("key_sdk_extra_data", mvThemeData.f140618a.getSdkExtra());
                                }
                                if (mvThemeData.f140629l != null) {
                                    str = mvThemeData.f140629l;
                                }
                                bundle.putString("key_mv_algorithm_hint", str);
                                bundle.putInt("key_photo_select_min_count", mvThemeData.f140620c);
                                bundle.putInt("key_photo_select_max_count", mvThemeData.f140621d);
                                bundle.putInt("key_support_flag", 3);
                                bundle.putInt("key_choose_scene", 2);
                                MvChoosePhotoActivity.a.a(eVar, bundle, 10001);
                                if ((eVar instanceof e) && eVar != null) {
                                    t.a(eVar).a(PermissionStateViewModel.class).c(PermissionStateViewModel.a.f148171a);
                                }
                            }
                        }
                        a("select_mv", mvThemeData, i3);
                    }
                } else if (i2 == 3) {
                    a("mv_show", mvThemeData, i3);
                }
            }
        }
