package com.ss.android.ugc.aweme.servicimpl;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import com.bytedance.als.ApiCenter;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.x;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.n;
import com.ss.android.ugc.aweme.filter.repository.internal.main.l;
import com.ss.android.ugc.aweme.photo.PhotoModule;
import com.ss.android.ugc.aweme.property.an;
import com.ss.android.ugc.aweme.record.f;
import com.ss.android.ugc.aweme.servicimpl.z;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.widget.k;
import com.ss.android.ugc.aweme.sticker.f.e;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.extract.o;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.b.l;
import com.ss.android.ugc.gamora.recorder.choosemusic.a.a;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import h.f.a.q;
import h.f.a.s;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class y implements com.bytedance.jedi.arch.b, com.ss.android.ugc.gamora.recorder.b.a {

    /* renamed from: a  reason: collision with root package name */
    public ShortVideoContextViewModel f121948a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.creativex.recorder.b.a.d f121949b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.gamora.a.a f121950c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.recorder.choosemusic.a.a f121951d;

    /* renamed from: e  reason: collision with root package name */
    public final j f121952e;

    /* renamed from: f  reason: collision with root package name */
    k f121953f;

    /* renamed from: g  reason: collision with root package name */
    final String f121954g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f121955h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f121956i = i.a((h.f.a.a) new f(this));

    /* renamed from: j  reason: collision with root package name */
    private final com.ss.android.ugc.tools.view.a.a f121957j = new d(this);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f121958k = i.a((h.f.a.a) new g(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f121959l = i.a((h.f.a.a) new h(this));

    /* renamed from: m  reason: collision with root package name */
    private final String f121960m;
    private final String n;
    private final boolean o;
    private final com.bytedance.o.f p;

    static {
        Covode.recordClassIndex(79948);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    static final class g extends m implements h.f.a.a<a> {
        final /* synthetic */ y this$0;

        static {
            Covode.recordClassIndex(79957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(y yVar) {
            super(0);
            this.this$0 = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    static final class h extends m implements h.f.a.a<MediaPlayer> {
        final /* synthetic */ y this$0;

        static {
            Covode.recordClassIndex(79958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(y yVar) {
            super(0);
            this.this$0 = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MediaPlayer invoke() {
            return com.ss.android.ugc.aweme.story.record.j.d.a(y.a(this.this$0).a());
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final com.ss.android.ugc.gamora.recorder.b.k provideScene() {
        return (a) this.f121958k.getValue();
    }

    public final class a extends com.ss.android.ugc.gamora.recorder.b.k {
        static {
            Covode.recordClassIndex(79949);
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.k
        public final boolean C() {
            return false;
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.k
        public final String a() {
            return "PhotoScene";
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.k
        public final void b() {
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.k
        public final void d() {
        }

        @Override // com.bytedance.scene.j
        public final void o() {
            super.o();
            y.a(y.this).b().P = false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // com.bytedance.scene.j
        public final void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // com.bytedance.scene.j
        public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            MethodCollector.i(9265);
            l.d(layoutInflater, "");
            l.d(viewGroup, "");
            View view = new View(s());
            MethodCollector.o(9265);
            return view;
        }
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        com.ss.android.ugc.gamora.a.a aVar = this.f121950c;
        if (aVar == null) {
            l.a("tabEnv");
        }
        androidx.lifecycle.i lifecycle = aVar.a().getLifecycle();
        l.b(lifecycle, "");
        return lifecycle;
    }

    static final class f extends m implements h.f.a.a<PhotoModule> {
        final /* synthetic */ y this$0;

        static {
            Covode.recordClassIndex(79954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(y yVar) {
            super(0);
            this.this$0 = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PhotoModule invoke() {
            com.ss.android.ugc.aweme.record.f photoModule = com.ss.android.ugc.aweme.port.in.g.a().l().getPhotoModule(y.a(this.this$0).a(), y.b(this.this$0).D().getMediaController(), new f.a(this) {
                /* class com.ss.android.ugc.aweme.servicimpl.y.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f121969a;

                static {
                    Covode.recordClassIndex(79955);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f121969a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.servicimpl.y$f$1$a */
                static final class a extends m implements h.f.a.b<Boolean, z> {
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(79956);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(AnonymousClass1 r2) {
                        super(1);
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Boolean bool) {
                        k kVar;
                        y yVar = this.this$0.f121969a.this$0;
                        k kVar2 = yVar.f121953f;
                        if (!(kVar2 == null || !kVar2.isShowing() || (kVar = yVar.f121953f) == null)) {
                            kVar.dismiss();
                        }
                        y.c(this.this$0.f121969a.this$0).b(false);
                        if (!l.a((Object) bool, (Object) true)) {
                            com.bytedance.creativex.recorder.b.a.m e2 = y.a(this.this$0.f121969a.this$0).e();
                            x xVar = new x("on photo token");
                            xVar.f28214a = 3;
                            l.b(xVar, "");
                            e2.a(xVar);
                        }
                        return z.f158842a;
                    }
                }

                @Override // com.ss.android.ugc.aweme.record.f.a
                public final void a(String str, List<String> list) {
                    String str2;
                    String str3;
                    Integer num;
                    Long l2;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
                    String str8;
                    j jVar;
                    FaceStickerBean i2;
                    FaceStickerBean i3;
                    String str9;
                    FaceStickerBean i4;
                    FaceStickerBean i5;
                    l.d(str, "");
                    y yVar = this.f121969a.this$0;
                    com.ss.android.ugc.gamora.a.a aVar = yVar.f121950c;
                    if (aVar == null) {
                        l.a("tabEnv");
                    }
                    ShortVideoContext b2 = aVar.b();
                    com.ss.android.ugc.gamora.a.a aVar2 = yVar.f121950c;
                    if (aVar2 == null) {
                        l.a("tabEnv");
                    }
                    com.bytedance.creativex.recorder.filter.a.a aVar3 = aVar2.f145645i;
                    if (aVar3 == null) {
                        l.a("filterModule");
                    }
                    com.ss.android.ugc.gamora.a.a aVar4 = yVar.f121950c;
                    if (aVar4 == null) {
                        l.a("tabEnv");
                    }
                    h.h<j> f2 = aVar4.f();
                    com.ss.android.ugc.gamora.a.a aVar5 = yVar.f121950c;
                    if (aVar5 == null) {
                        l.a("tabEnv");
                    }
                    com.bytedance.creativex.recorder.a.a.a g2 = aVar5.g();
                    com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", b2.q).a("shoot_way", b2.r);
                    com.bytedance.creativex.recorder.b.a.d dVar = yVar.f121949b;
                    if (dVar == null) {
                        l.a("cameraApiComponent");
                    }
                    if (dVar.N() == 1) {
                        str2 = "front";
                    } else {
                        str2 = "back";
                    }
                    com.ss.android.ugc.tools.f.b a3 = a2.a("camera", str2);
                    T value = aVar3.getCurSelectedFilter().f6468a.getValue();
                    FaceStickerBean faceStickerBean = null;
                    if (value != null) {
                        str3 = value.getEnName();
                    } else {
                        str3 = null;
                    }
                    com.ss.android.ugc.tools.f.b a4 = a3.a("filter_name", str3);
                    T value2 = aVar3.getCurSelectedFilter().f6468a.getValue();
                    if (value2 != null) {
                        num = Integer.valueOf(value2.getId());
                    } else {
                        num = null;
                    }
                    com.ss.android.ugc.tools.f.b a5 = a4.a("filter_id", num).a("record_mode", UGCMonitor.TYPE_PHOTO);
                    j value3 = f2.getValue();
                    if (value3 == null || (i5 = value3.i()) == null) {
                        l2 = "";
                    } else {
                        l2 = Long.valueOf(i5.getStickerId());
                    }
                    com.ss.android.ugc.tools.f.b a6 = a5.a("prop_id", l2.toString());
                    j value4 = f2.getValue();
                    if (value4 == null || (i4 = value4.i()) == null || (str4 = i4.getGradeKey()) == null) {
                        str4 = "";
                    }
                    com.ss.android.ugc.tools.f.b a7 = a6.a("prop_index", str4).a("smooth", g2.k()).a("eyes", g2.l()).a("shape", g2.m()).a("tanning", g2.n());
                    CommentVideoModel commentVideoModel = b2.f124767l;
                    if (commentVideoModel == null || (str5 = commentVideoModel.getEnterMethod()) == null) {
                        str5 = "";
                    }
                    com.ss.android.ugc.tools.f.b a8 = a7.a("enter_method", str5).a("from_group_id", dv.a());
                    if (b2.C != 0) {
                        a8.a("draft_id", b2.C);
                    }
                    String str10 = b2.D;
                    l.b(str10, "");
                    if (str10.length() > 0) {
                        a8.a("new_draft_id", b2.D);
                    }
                    com.ss.android.ugc.gamora.a.a aVar6 = yVar.f121950c;
                    if (aVar6 == null) {
                        l.a("tabEnv");
                    }
                    String str11 = aVar6.f145647k;
                    if (str11 == null) {
                        l.a("filterIntensityStoreTAG");
                    }
                    com.ss.android.ugc.aweme.filter.repository.internal.main.l a9 = l.a.a(str11);
                    T value5 = aVar3.getCurSelectedFilter().f6468a.getValue();
                    String str12 = "1";
                    if (value5 != null) {
                        e eVar = new e(yVar, a9, a8);
                        float a10 = com.ss.android.ugc.aweme.filter.c.a(value5, a9, eVar);
                        a8.a("filter_value", a9.a(value5, eVar));
                        if (((double) Math.abs(com.ss.android.ugc.aweme.filter.c.a(value5) - a10)) < 0.01d || com.ss.android.ugc.aweme.filter.c.a(value5) == -1.0f) {
                            str9 = str12;
                        } else {
                            str9 = "0";
                        }
                        a8.a("is_original_filter", str9);
                    }
                    if (TextUtils.equals(b2.x, "super_entrance")) {
                        a8.a("is_special_icon", 1);
                    }
                    String str13 = b2.X;
                    if (str13 == null) {
                        str13 = "";
                    }
                    a8.a("from_prop_id", str13);
                    String str14 = b2.X;
                    j value6 = f2.getValue();
                    if (value6 == null || (i3 = value6.i()) == null) {
                        str6 = null;
                    } else {
                        str6 = i3.getId();
                    }
                    if (h.f.b.l.a((Object) str14, (Object) str6)) {
                        str7 = str12;
                    } else {
                        str7 = "0";
                    }
                    a8.a("is_default_prop", str7);
                    j value7 = f2.getValue();
                    if (value7 == null || (i2 = value7.i()) == null || !i2.isBusi()) {
                        str12 = "0";
                    }
                    a8.a("is_commercial_prop", str12);
                    a8.a("is_westwindow_exist", b2.aR);
                    a8.a("shoot_page", "video_shoot_page");
                    if (h.f.b.l.a((Object) "quick_photo", (Object) yVar.f121954g)) {
                        str8 = "fast_shoot";
                    } else {
                        str8 = null;
                    }
                    a8.a("shoot_tab_name", str8);
                    r.a("record_video", a8.f149193a);
                    com.ss.android.ugc.gamora.a.a aVar7 = yVar.f121950c;
                    if (aVar7 == null) {
                        h.f.b.l.a("tabEnv");
                    }
                    ComposerBeautyBuriedInfo composerBeautyBuriedInfo = (ComposerBeautyBuriedInfo) com.ss.android.ugc.aweme.df.h.a(com.ss.android.ugc.aweme.df.h.a().b(aVar7.g().i().p()), ComposerBeautyBuriedInfo.class);
                    h.f.b.l.b(composerBeautyBuriedInfo, "");
                    com.ss.android.ugc.gamora.a.a aVar8 = yVar.f121950c;
                    if (aVar8 == null) {
                        h.f.b.l.a("tabEnv");
                    }
                    com.ss.android.ugc.aweme.beauty.g gVar = (com.ss.android.ugc.aweme.beauty.g) com.ss.android.ugc.aweme.df.h.a(com.ss.android.ugc.aweme.df.h.a().b(aVar8.g().i().o()), com.ss.android.ugc.aweme.beauty.g.class);
                    h.f.b.l.b(gVar, "");
                    com.ss.android.ugc.aweme.beauty.c.b(composerBeautyBuriedInfo, gVar);
                    if (b2.aZ == null) {
                        com.ss.android.ugc.gamora.a.a aVar9 = yVar.f121950c;
                        if (aVar9 == null) {
                            h.f.b.l.a("tabEnv");
                        }
                        b2.aZ = com.ss.android.ugc.aweme.beauty.d.a(aVar9.g().i().s());
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    y yVar2 = this.f121969a.this$0;
                    if (!(!an.a() || (jVar = yVar2.f121952e) == null || jVar.I() == null)) {
                        com.bytedance.creativex.recorder.b.a.d dVar2 = yVar2.f121949b;
                        if (dVar2 == null) {
                            h.f.b.l.a("cameraApiComponent");
                        }
                        o H = dVar2.H();
                        j jVar2 = yVar2.f121952e;
                        if (jVar2 == null) {
                            h.f.b.l.b();
                        }
                        com.ss.android.ugc.aweme.story.record.d.a.a(H, arrayList, jVar2);
                    }
                    androidx.fragment.app.e a11 = y.a(this.f121969a.this$0).a();
                    ShortVideoContext b3 = y.a(this.f121969a.this$0).b();
                    j value8 = y.a(this.f121969a.this$0).f().getValue();
                    if (value8 != null) {
                        faceStickerBean = value8.i();
                    }
                    aa.a(new z.a(a11, str, arrayList, b3, faceStickerBean, y.a(this.f121969a.this$0).d().H().e(), new a(this)));
                }
            });
            Objects.requireNonNull(photoModule, "null cannot be cast to non-null type com.ss.android.ugc.aweme.photo.PhotoModule");
            return photoModule;
        }
    }

    public final void a() {
        boolean z = false;
        if (this.f121953f == null) {
            com.ss.android.ugc.gamora.a.a aVar = this.f121950c;
            if (aVar == null) {
                h.f.b.l.a("tabEnv");
            }
            k kVar = new k(aVar.a());
            kVar.setCancelable(false);
            this.f121953f = kVar;
        }
        k kVar2 = this.f121953f;
        if (kVar2 != null) {
            kVar2.show();
        }
        MediaPlayer mediaPlayer = (MediaPlayer) this.f121959l.getValue();
        if (mediaPlayer != null) {
            com.ss.android.ugc.gamora.a.a aVar2 = this.f121950c;
            if (aVar2 == null) {
                h.f.b.l.a("tabEnv");
            }
            com.ss.android.ugc.aweme.story.record.j.d.a(mediaPlayer, aVar2.a());
        }
        com.ss.android.ugc.gamora.a.a aVar3 = this.f121950c;
        if (aVar3 == null) {
            h.f.b.l.a("tabEnv");
        }
        j value = aVar3.f().getValue();
        if (!(value == null || com.ss.android.ugc.aweme.sticker.f.e.a(value) == null)) {
            z = true;
        }
        PhotoModule photoModule = (PhotoModule) this.f121956i.getValue();
        com.ss.android.ugc.gamora.a.a aVar4 = this.f121950c;
        if (aVar4 == null) {
            h.f.b.l.a("tabEnv");
        }
        int i2 = aVar4.b().f124757b.f124708c;
        com.ss.android.ugc.gamora.a.a aVar5 = this.f121950c;
        if (aVar5 == null) {
            h.f.b.l.a("tabEnv");
        }
        photoModule.a(i2, aVar5.b().f124757b.f124709d, z);
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f121964a;

        static {
            Covode.recordClassIndex(79951);
        }

        c(y yVar) {
            this.f121964a = yVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f121964a.a();
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.gamora.a.a a(y yVar) {
        com.ss.android.ugc.gamora.a.a aVar = yVar.f121950c;
        if (aVar == null) {
            h.f.b.l.a("tabEnv");
        }
        return aVar;
    }

    public static final /* synthetic */ com.bytedance.creativex.recorder.b.a.d b(y yVar) {
        com.bytedance.creativex.recorder.b.a.d dVar = yVar.f121949b;
        if (dVar == null) {
            h.f.b.l.a("cameraApiComponent");
        }
        return dVar;
    }

    public static final /* synthetic */ ShortVideoContextViewModel c(y yVar) {
        ShortVideoContextViewModel shortVideoContextViewModel = yVar.f121948a;
        if (shortVideoContextViewModel == null) {
            h.f.b.l.a("shortVideoContextViewModel");
        }
        return shortVideoContextViewModel;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public static final class e implements com.ss.android.ugc.aweme.filter.repository.a.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f121966a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f121967b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.tools.f.b f121968c;

        static {
            Covode.recordClassIndex(79953);
        }

        @Override // com.ss.android.ugc.aweme.filter.repository.a.k
        public final float a(FilterBean filterBean) {
            h.f.b.l.d(filterBean, "");
            com.ss.android.ugc.aweme.shortvideo.x.m mVar = y.a(this.f121966a).f145646j;
            if (mVar == null) {
                h.f.b.l.a("videoRecorder");
            }
            return mVar.f133009a.b(filterBean.getFilterFolder());
        }

        e(y yVar, n nVar, com.ss.android.ugc.tools.f.b bVar) {
            this.f121966a = yVar;
            this.f121967b = nVar;
            this.f121968c = bVar;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final com.ss.android.ugc.gamora.recorder.b.d createBottomTabItem(com.ss.android.ugc.gamora.a.a aVar) {
        h.f.b.l.d(aVar, "");
        return new com.ss.android.ugc.gamora.recorder.b.d(this.f121960m, this.n, this.f121954g, this.o, new b(this, aVar));
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.a
    public final void initialize(com.ss.android.ugc.gamora.a.a aVar) {
        h.f.b.l.d(aVar, "");
        this.f121950c = aVar;
        ac a2 = androidx.lifecycle.ae.a(aVar.a(), (ad.b) null).a(ShortVideoContextViewModel.class);
        h.f.b.l.b(a2, "");
        this.f121948a = (ShortVideoContextViewModel) a2;
        this.f121949b = aVar.d();
        aVar.e().u().a(aVar.a(), new c(this));
    }

    public static final class b implements com.ss.android.ugc.gamora.recorder.b.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f121962a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.a.a f121963b;

        static {
            Covode.recordClassIndex(79950);
        }

        b(y yVar, com.ss.android.ugc.gamora.a.a aVar) {
            this.f121962a = yVar;
            this.f121963b = aVar;
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.l
        public final boolean onTabUnselected(com.ss.android.ugc.gamora.recorder.b.d dVar, l.a aVar) {
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar, "");
            y.c(this.f121962a).a(false);
            if (this.f121963b.b().O) {
                return true;
            }
            this.f121963b.b().P = false;
            return true;
        }

        @Override // com.ss.android.ugc.gamora.recorder.b.l
        public final boolean onTabSelected(com.ss.android.ugc.gamora.recorder.b.d dVar, l.a aVar) {
            com.ss.android.ugc.aweme.sticker.presenter.o t;
            Effect effect;
            com.ss.android.ugc.aweme.sticker.presenter.o t2;
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(aVar, "");
            if (!y.b(this.f121962a).b() && this.f121962a.f121955h) {
                androidx.lifecycle.i lifecycle = this.f121963b.a().getLifecycle();
                h.f.b.l.b(lifecycle, "");
                if (lifecycle.a().isAtLeast(i.b.STARTED)) {
                    y.b(this.f121962a).a(false, PrivacyCert.Builder.Companion.with("bpea-287").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
                }
            }
            this.f121963b.b().Z = 2;
            com.ss.android.ugc.aweme.shortvideo.f.a.b(2);
            this.f121963b.g().a("record");
            ApiCenter a2 = ApiCenter.a.a(this.f121963b.a());
            ((com.ss.android.ugc.aweme.shortvideo.h.a) a2.a(com.ss.android.ugc.aweme.shortvideo.h.a.class)).b(true);
            ((com.ss.android.ugc.gamora.recorder.l.f) a2.a(com.ss.android.ugc.gamora.recorder.l.f.class)).b(false);
            y.c(this.f121962a).a(true);
            y.b(this.f121962a).a(0);
            ((com.ss.android.ugc.gamora.recorder.k.a) a2.a(com.ss.android.ugc.gamora.recorder.k.a.class)).a(1, true);
            com.ss.android.ugc.aweme.port.in.c.f115624c.a(this.f121963b.b().r, "photo_shoot");
            ((com.ss.android.ugc.gamora.recorder.k.a) a2.a(com.ss.android.ugc.gamora.recorder.k.a.class)).b(false);
            if (!this.f121963b.b().O) {
                this.f121963b.b().P = false;
            }
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar2 = this.f121962a.f121951d;
            Effect effect2 = null;
            if (aVar2 != null) {
                j jVar = this.f121962a.f121952e;
                if (jVar == null || (t2 = jVar.t()) == null) {
                    effect = null;
                } else {
                    effect = t2.f();
                }
                aVar2.c(effect);
            }
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar3 = this.f121962a.f121951d;
            if (aVar3 != null) {
                String e2 = this.f121963b.b().f124757b.e();
                j jVar2 = this.f121962a.f121952e;
                if (!(jVar2 == null || (t = jVar2.t()) == null)) {
                    effect2 = t.f();
                }
                a.C3962a.a(aVar3, e2, 0, null, effect2);
            }
            return true;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    static final class d implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f121965a;

        static {
            Covode.recordClassIndex(79952);
        }

        d(y yVar) {
            this.f121965a = yVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            j value;
            if ((i2 == 25 || i2 == 24) && y.c(this.f121965a).a() && (value = y.a(this.f121965a).f().getValue()) != null) {
                h.f.b.l.d(value, "");
                com.ss.android.ugc.aweme.sticker.presenter.handler.m a2 = value.a(e.b.f134841a);
                if (!(a2 instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.f) || !((com.ss.android.ugc.aweme.sticker.presenter.handler.f) a2).b()) {
                    this.f121965a.a();
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    public y(String str, String str2, String str3, boolean z, boolean z2, com.bytedance.o.f fVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        h.f.b.l.d(fVar, "");
        this.f121960m = str;
        this.n = str2;
        this.f121954g = str3;
        this.o = z;
        this.f121955h = z2;
        this.p = fVar;
        this.f121951d = (com.ss.android.ugc.gamora.recorder.choosemusic.a.a) fVar.b(com.ss.android.ugc.gamora.recorder.choosemusic.a.a.class, null);
        this.f121952e = (j) fVar.b(j.class, null);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<com.bytedance.jedi.arch.an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
