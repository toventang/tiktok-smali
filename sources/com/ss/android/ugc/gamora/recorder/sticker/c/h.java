package com.ss.android.ugc.gamora.recorder.sticker.c;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.u;
import com.bytedance.creativex.recorder.sticker.b.f;
import com.bytedance.creativex.recorder.sticker.types.ar.arcore.ARCoreStickerHandler;
import com.bytedance.creativex.recorder.sticker.types.ar.arcore.SharedARStickerHandler;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.nativePort.TEEffectUtils;
import com.ss.android.ugc.aweme.experiment.gs;
import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.property.bj;
import com.ss.android.ugc.aweme.property.bn;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.dm;
import com.ss.android.ugc.aweme.shortvideo.dt;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterialKt;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.g;
import com.ss.android.ugc.aweme.sticker.effectconfig.EffectConfigViewModel;
import com.ss.android.ugc.aweme.sticker.effectconfig.b;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.presenter.handler.ARStickerHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.SavePhotoStickerHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.StickerVideoStatusHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.VoiceRecognizeStickerHandler;
import com.ss.android.ugc.aweme.sticker.presenter.handler.p;
import com.ss.android.ugc.aweme.sticker.repository.a.q;
import com.ss.android.ugc.aweme.sticker.senor.presenter.LandmarkARPresenter;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.c;
import com.ss.android.ugc.aweme.sticker.types.ar.text.r;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.aweme.sticker.types.e.b;
import com.ss.android.ugc.aweme.sticker.types.lock.LockStickerHandler;
import com.ss.android.ugc.aweme.sticker.types.multi.MultiStickerListViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class h extends com.bytedance.creativex.recorder.sticker.b.f<j> implements j {
    static final /* synthetic */ h.k.i[] A = {new h.f.b.y(h.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new h.f.b.y(h.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new h.f.b.y(h.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0)};
    public final ShortVideoContext B;
    public StickerVideoStatusHandler C;
    public com.ss.android.ugc.aweme.sticker.presenter.handler.j D;
    public com.ss.android.ugc.gamora.recorder.sticker.c.b.b E;
    public int F;
    public List<String> G;
    public final com.bytedance.als.k<Boolean> H = new com.bytedance.als.k<>();
    public final com.bytedance.als.k<Boolean> I = new com.bytedance.als.k<>();
    public ArrayList<com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j> J = new ArrayList<>();
    public GreenScreenMaterial K = new GreenScreenMaterial(0, 0, 0, null, null, null, null, null, 255, null);
    public boolean L;
    public final androidx.lifecycle.t<Boolean> M;
    boolean N;
    private final com.ss.android.ugc.tools.view.a.c O = ((com.ss.android.ugc.tools.view.a.c) getDiContainer().b(com.ss.android.ugc.tools.view.a.c.class, null));
    private com.ss.android.ugc.aweme.sticker.presenter.g P;
    private final h.h.d Q = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
    private final h.h.d R = com.bytedance.o.b.a.b(getDiContainer(), com.bytedance.creativex.recorder.filter.a.a.class);
    private final h.h.d S = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.a.a.a.class);
    private final com.ss.android.ugc.aweme.sticker.m.a.d T;
    private final h.h U;
    private final com.ss.android.vesdk.al V;
    private final com.bytedance.als.k<Effect> W;
    private final h.h X;
    private final h.h Y;
    private final h.h Z;
    private final h.h aa;
    private final f ab;
    private final h.h ac;
    private final b ad;

    static {
        Covode.recordClassIndex(97804);
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final e C() {
        return (e) this.X.getValue();
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final c D() {
        return (c) this.Y.getValue();
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f E() {
        return (com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f) this.Z.getValue();
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final com.ss.android.ugc.aweme.sharedar.b F() {
        return (com.ss.android.ugc.aweme.sharedar.b) this.aa.getValue();
    }

    @Override // com.bytedance.creativex.recorder.sticker.b.f, com.ss.android.ugc.aweme.sticker.presenter.i
    public final com.ss.android.ugc.aweme.sticker.d.d u() {
        return (com.ss.android.ugc.aweme.sticker.d.d) this.ac.getValue();
    }

    public final com.bytedance.creativex.recorder.b.a.d y() {
        return (com.bytedance.creativex.recorder.b.a.d) this.Q.a(this, A[0]);
    }

    static final class j extends h.f.b.m implements h.f.a.a<ViewGroup> {
        final /* synthetic */ FrameLayout $stickerPanelContainer;

        static {
            Covode.recordClassIndex(97845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(FrameLayout frameLayout) {
            super(0);
            this.$stickerPanelContainer = frameLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ ViewGroup invoke() {
            return this.$stickerPanelContainer;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final /* bridge */ /* synthetic */ com.bytedance.als.g A() {
        return this.I;
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final /* bridge */ /* synthetic */ LiveData B() {
        return this.M;
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final List<String> I() {
        return this.G;
    }

    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ com.bytedance.als.b getApiComponent() {
        return this;
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final /* bridge */ /* synthetic */ com.bytedance.als.g z() {
        return this.H;
    }

    public static final class ag implements com.ss.android.ugc.aweme.sticker.effectconfig.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148438a;

        static {
            Covode.recordClassIndex(97813);
        }

        @Override // com.ss.android.ugc.aweme.sticker.effectconfig.a
        public final void a() {
            this.f148438a.L();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ag(h hVar) {
            this.f148438a = hVar;
        }
    }

    public static final class av implements com.ss.android.ugc.aweme.sticker.effectconfig.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148454a;

        static {
            Covode.recordClassIndex(97828);
        }

        @Override // com.ss.android.ugc.aweme.sticker.effectconfig.a
        public final void a() {
            this.f148454a.M();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        av(h hVar) {
            this.f148454a = hVar;
        }
    }

    public static final class f implements UploadPicStickerARPresenter.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148459a;

        static {
            Covode.recordClassIndex(97841);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter.b
        public final void a() {
            this.f148459a.B.aB = 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(h hVar) {
            this.f148459a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter.b
        public final void a(boolean z) {
            int i2;
            ShortVideoContext shortVideoContext = this.f148459a.B;
            if (z) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            shortVideoContext.aB = i2;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f148462a = new l();

        static {
            Covode.recordClassIndex(97847);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return true;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f148464a = new o();

        static {
            Covode.recordClassIndex(97850);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return true;
        }
    }

    static final class x<T> implements com.google.c.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148468a;

        static {
            Covode.recordClassIndex(97859);
        }

        x(h hVar) {
            this.f148468a = hVar;
        }

        @Override // com.google.c.a.q
        public final /* synthetic */ Object b() {
            return this.f148468a.E();
        }
    }

    private final ah N() {
        return new ah(this);
    }

    static final class k extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(dh.c(this.this$0.f28393b));
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97849);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.this$0.L);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.f28396e.h();
            return h.z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.b(false);
            return h.z.f158842a;
        }
    }

    static final /* synthetic */ class t extends h.f.b.j implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f148466a = new t();

        static {
            Covode.recordClassIndex(97855);
        }

        t() {
            super(0, com.ss.android.vesdk.ba.class, "getEffectSDKVer", "getEffectSDKVer()Ljava/lang/String;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            MethodCollector.i(11275);
            String effectVersion = TEEffectUtils.getEffectVersion();
            MethodCollector.o(11275);
            return effectVersion;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.c(false);
            return h.z.f158842a;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.g.a(this.this$0.f28393b, g.f.f131881a, g.C3424g.f131882a);
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final void G() {
        this.H.a((Boolean) false);
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final void H() {
        this.I.a((Boolean) true);
    }

    @Override // com.bytedance.creativex.recorder.sticker.b.f, com.bytedance.als.j
    public final void onDestroy() {
        super.onDestroy();
        this.f28396e.getEffectController().b(this.V);
    }

    static final class ab extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97808);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.this$0.r().d().isEmpty());
        }
    }

    static final class af extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.k> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        af(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.k invoke() {
            return new com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.k(this.this$0.f28393b, this.this$0.f28395d, this.this$0.q(), this.this$0.f28396e.getEffectController(), this.this$0);
        }
    }

    static final class az extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sharedar.c> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97832);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        az(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sharedar.c invoke() {
            return new com.ss.android.ugc.aweme.sharedar.c(this.this$0.f28393b, this.this$0.y(), this.this$0.q());
        }
    }

    static final class ba extends h.f.b.m implements h.f.a.a<c> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97834);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ba(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            d dVar = (d) this.this$0.getDiContainer().b(d.class, null);
            if (dVar == null) {
                dVar = new a();
            }
            return dVar.a(this.this$0);
        }
    }

    static final class bb extends h.f.b.m implements h.f.a.a<e> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97835);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bb(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            Object b2 = this.this$0.getDiContainer().b(e.class, null);
            if (b2 == null) {
                return new com.ss.android.ugc.gamora.recorder.sticker.c.a.e(this.this$0.B, this.this$0);
            }
            return b2;
        }
    }

    static final class bc extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.d.a> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97836);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bc(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.d.a invoke() {
            return new com.ss.android.ugc.aweme.sticker.d.a(this.this$0.t(), new com.ss.android.ugc.gamora.recorder.sticker.e(this.this$0.f28393b));
        }
    }

    static final class bd extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.types.f.a> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97837);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        bd(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.types.f.a invoke() {
            return new com.ss.android.ugc.aweme.sticker.types.f.a(new com.ss.android.ugc.aweme.sticker.q.f(this.this$0.y().D().getAudioController()));
        }
    }

    static final class s<T> implements com.google.c.a.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148465a;

        static {
            Covode.recordClassIndex(97854);
        }

        s(h hVar) {
            this.f148465a = hVar;
        }

        @Override // com.google.c.a.q
        public final /* synthetic */ Object b() {
            com.ss.android.ugc.aweme.sticker.repository.a.y j2 = this.f148465a.t().c().j();
            h.f.b.l.d(j2, "");
            List<String> value = j2.d().getValue();
            if (value == null) {
                return h.a.z.INSTANCE;
            }
            return value;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final void K() {
        this.f28395d.j().a(this.f28393b, new aj(this));
    }

    @Override // com.bytedance.creativex.recorder.sticker.b.f, com.bytedance.als.j
    public final void onStop() {
        super.onStop();
        if (bn.a()) {
            h().a();
        }
    }

    public static final class ac implements com.ss.android.ugc.aweme.sticker.k.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148437a;

        static {
            Covode.recordClassIndex(97809);
        }

        @Override // com.ss.android.ugc.aweme.sticker.k.e
        public final void a() {
            if (!this.f148437a.f28395d.b()) {
                this.f148437a.f28395d.b(false, new PrivacyCert(new com.bytedance.bpea.basics.j("1034"), "Open the camera on the shooting page to preview and shoot the video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.a()}));
            }
        }

        @Override // com.ss.android.ugc.aweme.sticker.k.e
        public final void b() {
            if (!this.f148437a.f28395d.b()) {
                this.f148437a.f28395d.a(false, new PrivacyCert(new com.bytedance.bpea.basics.j("1015"), "Open the camera on the shooting page to preview and shoot the video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.a()}));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ac(h hVar) {
            this.f148437a = hVar;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final void J() {
        com.ss.android.ugc.aweme.sticker.presenter.g gVar;
        StickerVideoStatusHandler stickerVideoStatusHandler = this.C;
        if (stickerVideoStatusHandler != null && com.ss.android.ugc.aweme.sticker.p.g.h(stickerVideoStatusHandler.f135329a) && (gVar = stickerVideoStatusHandler.f135333e) != null && !gVar.c()) {
            stickerVideoStatusHandler.f135331c = true;
        }
        com.ss.android.ugc.aweme.sticker.presenter.handler.j jVar = this.D;
        if (jVar != null) {
            jVar.b();
        }
    }

    public final void L() {
        Effect value = t().n().b().getValue();
        if (value != null) {
            this.f28400i.f135259g.post(new au(value, this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class au implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Effect f148452a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f148453b;

        static {
            Covode.recordClassIndex(97827);
        }

        au(Effect effect, h hVar) {
            this.f148452a = effect;
            this.f148453b = hVar;
        }

        public final void run() {
            int i2;
            if (com.ss.android.ugc.aweme.sticker.f.c.a(this.f148453b.t(), this.f148452a)) {
                com.ss.android.ugc.aweme.sticker.presenter.o t = this.f148453b.t();
                h.f.b.l.d(t, "");
                com.ss.android.ugc.aweme.sticker.presenter.k value = t.n().c().getValue();
                if (value != null) {
                    i2 = value.f135419b;
                } else {
                    i2 = 0;
                }
            } else {
                i2 = -1;
            }
            com.ss.android.ugc.aweme.sticker.d.d u = this.f148453b.u();
            Effect effect = this.f148452a;
            h.f.b.l.b(effect, "");
            u.a(com.ss.android.ugc.aweme.sticker.f.a.a(effect, i2, com.ss.android.ugc.aweme.sticker.d.b.a.RECOVER, null, null, null, null, 0, false, 252));
        }
    }

    public static final class g implements com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148460a;

        static {
            Covode.recordClassIndex(97842);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            if (!com.ss.android.ugc.aweme.port.in.l.f115658a.e().c() || com.ss.android.ugc.aweme.port.in.g.a().A().a() || !com.ss.android.ugc.aweme.sticker.p.g.a("gs_enable_tt_effect_page_filter", this.f148460a.s()) || !(!h.f.b.l.a((Object) this.f148460a.B.r, (Object) "duet"))) {
                bundle.putInt("key_choose_scene", 3);
                bundle.putInt("key_support_flag", 1);
            } else {
                bundle.putInt("key_choose_scene", 12);
                bundle.putInt("key_support_flag", 17);
            }
            bundle.putParcelable("key_short_video_context", this.f148460a.B);
            bundle.putInt("key_photo_select_min_count", 1);
            bundle.putInt("key_photo_select_max_count", 1);
            bundle.putInt("upload_photo_min_height", 480);
            bundle.putInt("upload_photo_min_width", 360);
            return bundle;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(h hVar) {
            this.f148460a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b
        public final List<com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j> a(Intent intent) {
            h.f.b.l.d(intent, "");
            ArrayList<MediaModel> parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            if (parcelableArrayListExtra == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) parcelableArrayListExtra, 10));
            for (MediaModel mediaModel : parcelableArrayListExtra) {
                h.f.b.l.b(mediaModel, "");
                String str = mediaModel.f109390b;
                h.f.b.l.b(str, "");
                long j2 = mediaModel.f109396h;
                int i2 = mediaModel.f109395g;
                int i3 = 1;
                if (i2 != 1) {
                    if (i2 != 2) {
                        i3 = 0;
                    } else {
                        i3 = 3;
                    }
                }
                String str2 = mediaModel.f109389a;
                h.f.b.l.b(str2, "");
                String str3 = mediaModel.p;
                if (str3 == null) {
                    str3 = "GIPHY";
                }
                arrayList.add(new com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j(str, j2, i3, str2, str3, "media_gallery"));
            }
            return arrayList;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            h hVar = this.this$0;
            Effect g2 = hVar.t().g();
            boolean z = true;
            if (!com.ss.android.ugc.aweme.port.in.l.f115658a.e().c() || com.ss.android.ugc.aweme.port.in.g.a().A().a() || !com.ss.android.ugc.aweme.sticker.p.g.a("gs_enable_tt_effect_page_filter", g2) || !(!h.f.b.l.a((Object) hVar.B.r, (Object) "duet"))) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.b.f, com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        if (bj.a()) {
            Context applicationContext = this.f28393b.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            h.f.b.l.b(applicationContext, "");
            t().c().i().a(new com.ss.android.ugc.aweme.sticker.view.internal.search.i(applicationContext));
        }
        this.f28396e.getEffectController().a(this.V);
        q().c().a(this, new ak(this));
        this.q.a(this, new am(this));
        q().r().a(this, new an(this));
        q().b().a(this, new ao(this));
        q().i().a(this, new ap(this));
        q().j().a(this, new aq(this));
        q().l().a(this, new ar(this));
        f.a.b.b a2 = q().B().a(new as(this), com.ss.android.ugc.tools.utils.p.f150012a);
        h.f.b.l.b(a2, "");
        f.a.j.a.a(a2, this.f28399h);
        q().g().a(this, new at(this));
        y().i().a(this, new al(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0066, code lost:
        if (r4.b(r5.f148376l.T) != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (r1 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00df, code lost:
        if (r1 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e1, code lost:
        r6 = com.ss.android.ugc.aweme.port.in.c.f115629h.b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e7, code lost:
        if (r6 == null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e9, code lost:
        r2 = com.ss.android.ugc.aweme.port.in.c.f115629h.b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
        if (new java.io.File(r2).exists() == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fa, code lost:
        r1 = r6.getMusicId();
        h.f.b.l.b(r1, "");
        r5.a(r1, new com.ss.android.ugc.gamora.recorder.sticker.c.b.b.d(r5, r6, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010b, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010e, code lost:
        if (r7 != null) goto L_0x0110;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M() {
        /*
        // Method dump skipped, instructions count: 435
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.c.h.M():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a7, code lost:
        if (h.f.b.l.a((java.lang.Object) r1, (java.lang.Object) r0) != false) goto L_0x00a9;
     */
    @Override // com.bytedance.creativex.recorder.sticker.b.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.sticker.model.FaceStickerBean w() {
        /*
        // Method dump skipped, instructions count: 502
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.c.h.w():com.ss.android.ugc.aweme.sticker.model.FaceStickerBean");
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.g gVar) {
        this.P = gVar;
    }

    public static final class a extends com.ss.android.ugc.aweme.sticker.repository.d.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148436a;

        static {
            Covode.recordClassIndex(97806);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(h hVar) {
            this.f148436a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.repository.d.a.a
        public final boolean a(String str, Effect effect) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(effect, "");
            if (TextUtils.isEmpty(this.f148436a.B.T) || !h.f.b.l.a((Object) this.f148436a.B.T, (Object) effect.getEffectId())) {
                return effect.isBusiness();
            }
            return false;
        }
    }

    public static final class ah implements com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148439a;

        static {
            Covode.recordClassIndex(97814);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ah(h hVar) {
            this.f148439a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.b
        public final void a(String str) {
            h.f.b.l.d(str, "");
            this.f148439a.c(false);
        }
    }

    static final class al<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148443a;

        static {
            Covode.recordClassIndex(97818);
        }

        al(h hVar) {
            this.f148443a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            k.a(this.f148443a, (PrivacyCert) null);
        }
    }

    static final class am<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148444a;

        static {
            Covode.recordClassIndex(97819);
        }

        am(h hVar) {
            this.f148444a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.sticker.b.e.b(this.f148444a);
        }
    }

    static final class z extends h.f.b.m implements h.f.a.m<List<? extends String>, h.f.a.b<? super List<? extends AVChallenge>, ? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final z f148469a = new z();

        static {
            Covode.recordClassIndex(97861);
        }

        z() {
            super(2);
        }

        static final class a<T> implements androidx.core.g.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.f.a.b f148470a;

            static {
                Covode.recordClassIndex(97862);
            }

            a(h.f.a.b bVar) {
                this.f148470a = bVar;
            }

            @Override // androidx.core.g.a
            public final /* synthetic */ void a(Object obj) {
                this.f148470a.invoke(h.a.n.a(obj));
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(List<? extends String> list, h.f.a.b<? super List<? extends AVChallenge>, ? extends h.z> bVar) {
            List<? extends String> list2 = list;
            h.f.a.b<? super List<? extends AVChallenge>, ? extends h.z> bVar2 = bVar;
            h.f.b.l.d(list2, "");
            h.f.b.l.d(bVar2, "");
            String str = (String) h.a.n.h((List) list2);
            if (str != null) {
                com.ss.android.ugc.aweme.port.in.g.a().x().a(str, new a(bVar2));
            }
            return h.z.f158842a;
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.sticker.d.b.b<?>, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.d.d $stickerSelectedController;

        static {
            Covode.recordClassIndex(97810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(com.ss.android.ugc.aweme.sticker.d.d dVar) {
            super(1);
            this.$stickerSelectedController = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.sticker.d.b.b<?> bVar) {
            com.ss.android.ugc.aweme.sticker.d.b.b<?> bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            this.$stickerSelectedController.a(bVar2);
            return h.z.f158842a;
        }
    }

    static final class ao<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148446a;

        static {
            Covode.recordClassIndex(97821);
        }

        ao(h hVar) {
            this.f148446a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f148446a.C().a(this.f148446a.B);
        }
    }

    static final class at<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148451a;

        static {
            Covode.recordClassIndex(97826);
        }

        at(h hVar) {
            this.f148451a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.sticker.presenter.handler.j jVar = this.f148451a.D;
            if (jVar != null) {
                jVar.b();
            }
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148463a;

        static {
            Covode.recordClassIndex(97848);
        }

        m(h hVar) {
            this.f148463a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f148463a.t().a(((StickerTagChangeData) obj).getTabKey());
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<Effect, h.z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97851);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Effect effect) {
            h.f.b.l.d(effect, "");
            this.this$0.u.b(effect);
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final void f(boolean z2) {
        this.M.setValue(Boolean.valueOf(z2));
    }

    static final class ae extends h.f.b.m implements h.f.a.b<String, h.z> {
        final /* synthetic */ String $key;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97811);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(h hVar, String str) {
            super(1);
            this.this$0 = hVar;
            this.$key = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            String str2 = str;
            h.f.b.l.d(str2, "");
            this.this$0.f28396e.getEffectController().a(this.$key, str2);
            this.this$0.F = 1;
            return h.z.f158842a;
        }
    }

    static final class an<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148445a;

        static {
            Covode.recordClassIndex(97820);
        }

        an(h hVar) {
            this.f148445a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f148445a.C().a((int) ((Long) obj).longValue());
        }
    }

    static final class ax<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148456a;

        static {
            Covode.recordClassIndex(97830);
        }

        ax(h hVar) {
            this.f148456a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Double d2 = (Double) obj;
            if (this.f148456a.r().r != null && d2 != null) {
                this.f148456a.E().a(d2);
            }
        }
    }

    static final class ay<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148457a;

        static {
            Covode.recordClassIndex(97831);
        }

        ay(h hVar) {
            this.f148457a = hVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List<String> list = (List) obj;
            if (list != null && !list.isEmpty()) {
                this.f148457a.C().a(list);
            }
        }
    }

    static final /* synthetic */ class u extends h.f.b.j implements h.f.a.b<Effect, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f148467a = new u();

        static {
            Covode.recordClassIndex(97856);
        }

        u() {
            super(1, com.ss.android.ugc.aweme.sticker.types.d.a.class, "openUrl", "openUrl(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Effect effect) {
            Effect effect2 = effect;
            if (effect2 != null && effect2.getEffectType() == 2) {
                com.ss.android.ugc.aweme.port.in.g.a().w().b(effect2.getSchema());
            }
            return h.z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.sticker.d.b.b<?>, h.z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97857);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.sticker.d.b.b<?> bVar) {
            com.ss.android.ugc.aweme.sticker.d.b.b<?> bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            this.this$0.u().a(bVar2);
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.b.f
    public final void d(boolean z2) {
        if (z2) {
            super.d(z2);
        } else if (com.ss.android.ugc.aweme.sticker.p.g.h(com.ss.android.ugc.aweme.sticker.f.e.a(this))) {
            super.d(z2);
        }
    }

    static final class ak<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148442a;

        static {
            Covode.recordClassIndex(97817);
        }

        ak(h hVar) {
            this.f148442a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            StickerVideoStatusHandler stickerVideoStatusHandler = this.f148442a.C;
            if (stickerVideoStatusHandler != null) {
                h.f.b.l.b(bool, "");
                boolean booleanValue = bool.booleanValue();
                if (!com.ss.android.ugc.aweme.sticker.p.g.h(stickerVideoStatusHandler.f135329a)) {
                    return;
                }
                if (booleanValue) {
                    stickerVideoStatusHandler.f135332d.b();
                    return;
                }
                stickerVideoStatusHandler.f135331c = false;
                if (stickerVideoStatusHandler.f135330b == 1) {
                    stickerVideoStatusHandler.f135332d.a();
                }
            }
        }
    }

    static final class aq<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148448a;

        static {
            Covode.recordClassIndex(97823);
        }

        aq(h hVar) {
            this.f148448a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            List<String> list;
            com.ss.android.ugc.aweme.tools.extract.o H;
            if (com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.a(com.ss.android.ugc.aweme.sticker.f.e.a(this.f148448a)) && this.f148448a.F > 0) {
                if (!(!com.ss.android.ugc.aweme.property.an.a() || (list = this.f148448a.G) == null || (H = this.f148448a.f28395d.H()) == null)) {
                    H.a(list, true);
                }
                this.f148448a.F = 0;
            }
        }
    }

    static final class ar<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148449a;

        static {
            Covode.recordClassIndex(97824);
        }

        ar(h hVar) {
            this.f148449a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Bundle bundle;
            com.bytedance.creativex.recorder.b.a.x xVar = (com.bytedance.creativex.recorder.b.a.x) obj;
            if (com.ss.android.ugc.aweme.sticker.p.g.a("gs_enable_tt_effect_page_filter", this.f148449a.s())) {
                GreenScreenMaterial copy$default = GreenScreenMaterial.copy$default(this.f148449a.K, 0, 0, 0, null, null, null, null, null, 255, null);
                if (xVar != null) {
                    bundle = xVar.f28218e;
                } else {
                    bundle = null;
                }
                GreenScreenMaterialKt.asBundle(copy$default, bundle);
            }
        }
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.presenter.handler.d f148458a;

        static {
            Covode.recordClassIndex(97833);
        }

        b(com.ss.android.ugc.aweme.sticker.presenter.handler.d dVar) {
            this.f148458a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (h.f.b.l.a(obj, (Object) false)) {
                for (com.ss.android.ugc.aweme.sticker.panel.c.h hVar : this.f148458a.f135389a) {
                    if (hVar instanceof com.ss.android.ugc.aweme.sticker.panel.c.b) {
                        com.ss.android.ugc.aweme.sticker.panel.c.b bVar = (com.ss.android.ugc.aweme.sticker.panel.c.b) hVar;
                        if (bVar.E) {
                            bVar.c();
                        }
                    }
                }
            }
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<List<? extends String>, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.tools.extract.o $extractor;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(h hVar, com.ss.android.ugc.aweme.tools.extract.o oVar) {
            super(1);
            this.this$0 = hVar;
            this.$extractor = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.ss.android.ugc.aweme.tools.extract.o */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(List<? extends String> list) {
            List<? extends String> list2 = list;
            h.f.b.l.d(list2, "");
            if (!com.ss.android.ugc.aweme.property.an.a()) {
                com.ss.android.ugc.aweme.tools.extract.o oVar = this.$extractor;
                if (oVar != 0) {
                    oVar.a((List<String>) list2, false);
                }
            } else {
                h hVar = this.this$0;
                int size = list2.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(list2.get(i2));
                }
                hVar.G = arrayList;
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.c.j
    public final void e(boolean z2) {
        this.L = z2;
        if (com.ss.android.ugc.aweme.sticker.p.g.i(com.ss.android.ugc.aweme.sticker.f.e.a(this))) {
            com.ss.android.ugc.aweme.sticker.types.f.a aVar = (com.ss.android.ugc.aweme.sticker.types.f.a) this.U.getValue();
            if (z2) {
                if (!aVar.f136073a) {
                    aVar.f136074b.b(p.a.d.f135415a);
                    aVar.f136073a = true;
                }
            } else if (aVar.f136073a) {
                aVar.f136074b.a(p.a.e.f135416a);
                aVar.f136073a = false;
            }
        }
    }

    static final class ai implements com.ss.android.vesdk.al {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148440a;

        static {
            Covode.recordClassIndex(97815);
        }

        ai(h hVar) {
            this.f148440a = hVar;
        }

        @Override // com.ss.android.vesdk.al
        public final void a(boolean z) {
            boolean z2;
            if (z && !(this.f148440a.f28402k.f28385a instanceof LandmarkARPresenter)) {
                T value = this.f148440a.f28401j.f6468a.getValue();
                if (value != null) {
                    z2 = value.booleanValue();
                } else {
                    z2 = false;
                }
                this.f148440a.f28402k.a(new LandmarkARPresenter(this.f148440a.f28393b, this.f148440a.f28393b, z2, new com.ss.android.ugc.aweme.sticker.q.a.b(this.f148440a.f28396e.getEffectController(), this.f148440a.f28396e.getCameraController()), (byte) 0), true);
            }
        }
    }

    static final class aj<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148441a;

        static {
            Covode.recordClassIndex(97816);
        }

        aj(h hVar) {
            this.f148441a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h hVar;
            Effect s;
            if (h.f.b.l.a(obj, (Object) true) && (s = (hVar = this.f148441a).s()) != null) {
                if (TextUtils.equals(s.getEffectId(), hVar.B.T)) {
                    boolean isEmpty = TextUtils.isEmpty(hVar.B.aE);
                    boolean isEmpty2 = TextUtils.isEmpty(hVar.B.aF);
                    if (!isEmpty || !isEmpty2) {
                        androidx.lifecycle.ac a2 = androidx.lifecycle.ae.a(hVar.f28393b, (ad.b) null).a(EffectConfigViewModel.class);
                        h.f.b.l.b(a2, "");
                        EffectConfigViewModel effectConfigViewModel = (EffectConfigViewModel) a2;
                        ag agVar = new ag(hVar);
                        if (!isEmpty) {
                            if (!isEmpty2) {
                                effectConfigViewModel.a(agVar);
                                return;
                            } else {
                                effectConfigViewModel.b(agVar);
                                return;
                            }
                        } else if (!isEmpty2) {
                            effectConfigViewModel.c(agVar);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                hVar.L();
            }
        }
    }

    static final class aw<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148455a;

        static {
            Covode.recordClassIndex(97829);
        }

        aw(h hVar) {
            this.f148455a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                h hVar = this.f148455a;
                if (hVar.N) {
                    hVar.N = false;
                    boolean isEmpty = TextUtils.isEmpty(hVar.B.aE);
                    boolean isEmpty2 = TextUtils.isEmpty(hVar.B.aF);
                    if (!isEmpty || !isEmpty2) {
                        androidx.lifecycle.ac a2 = androidx.lifecycle.ae.a(hVar.f28393b, (ad.b) null).a(EffectConfigViewModel.class);
                        h.f.b.l.b(a2, "");
                        EffectConfigViewModel effectConfigViewModel = (EffectConfigViewModel) a2;
                        av avVar = new av(hVar);
                        if (!isEmpty) {
                            if (!isEmpty2) {
                                effectConfigViewModel.a(avVar);
                            } else {
                                effectConfigViewModel.b(avVar);
                            }
                        } else if (!isEmpty2) {
                            effectConfigViewModel.c(avVar);
                        }
                    } else {
                        hVar.M();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j jVar) {
        String str;
        GreenScreenMaterial greenScreenMaterial = this.K;
        greenScreenMaterial.setType(jVar.f135810d);
        Effect s2 = s();
        if (s2 == null || (str = s2.getEffectId()) == null) {
            str = "";
        }
        greenScreenMaterial.setStickerId(str);
        greenScreenMaterial.setResId(jVar.f135811e);
        greenScreenMaterial.setAuthorName(jVar.f135812f);
        greenScreenMaterial.setLocalPath(jVar.f135808b.toString());
        greenScreenMaterial.setMediasource(jVar.f135813g);
        if (com.ss.android.ugc.aweme.sticker.p.g.a("gs_enable_tt_effect_page_filter", s())) {
            this.B.w = this.K;
        }
    }

    static final class ap<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148447a;

        static {
            Covode.recordClassIndex(97822);
        }

        ap(h hVar) {
            this.f148447a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            com.bytedance.creativex.recorder.b.a.w wVar = (com.bytedance.creativex.recorder.b.a.w) obj;
            if (com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.a(com.ss.android.ugc.aweme.sticker.f.e.a(this.f148447a))) {
                h.f.b.l.b(wVar, "");
                wVar.f28213c.putInt("upload_type_sticker_media_size", this.f148447a.F);
            }
            FaceStickerBean i2 = this.f148447a.i();
            com.ss.android.ugc.aweme.sticker.presenter.b value = this.f148447a.t().n().g().getValue();
            com.ss.android.ugc.aweme.sticker.presenter.r value2 = this.f148447a.t().n().f().getValue();
            if (!(value == null || value.f135276d || value2 == null || !(!h.f.b.l.a(i2, FaceStickerBean.NONE)) || i2 == null)) {
                Effect effect = value.f135273a;
                if (effect != null) {
                    str = effect.getId();
                } else {
                    str = null;
                }
                if (h.f.b.l.a((Object) str, (Object) i2.getId())) {
                    h.f.b.l.b(wVar, "");
                    Bundle bundle = wVar.f28213c;
                    bundle.putInt("tabOrder", value2.f135428a);
                    bundle.putInt("imprPosition", value.f135275c);
                }
            }
            e C = this.f148447a.C();
            Objects.requireNonNull(C, "null cannot be cast to non-null type com.ss.android.ugc.gamora.recorder.sticker.sticker_core.internal.RecordStickerInteractor");
            ((com.ss.android.ugc.gamora.recorder.sticker.c.a.e) C).f148350a = null;
        }
    }

    static final class as<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148450a;

        static {
            Covode.recordClassIndex(97825);
        }

        as(h hVar) {
            this.f148450a = hVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            TimeSpeedModelExtension timeSpeedModelExtension;
            if (obj instanceof u.a) {
                ShortVideoContext shortVideoContext = this.f148450a.B;
                dt d2 = shortVideoContext.f124757b.d();
                h.f.b.l.b(d2, "");
                com.ss.android.ugc.aweme.sticker.model.a aVar = shortVideoContext.f124757b.r;
                h.f.b.l.d(d2, "");
                b.i.b(new c.a(d2, aVar), b.i.f4824a);
                com.ss.android.ugc.aweme.shortvideo.sticker.e.b(shortVideoContext.q);
            } else if (obj instanceof u.b) {
                dt d3 = this.f148450a.r().d();
                com.ss.android.ugc.aweme.sticker.model.a aVar2 = this.f148450a.r().r;
                h.f.b.l.b(d3, "");
                h.f.b.l.d(d3, "");
                if (!d3.isEmpty()) {
                    Object obj2 = d3.get(d3.size() - 1);
                    h.f.b.l.b(obj2, "");
                    com.ss.android.ugc.aweme.sticker.model.a backgroundVideo = ((TimeSpeedModelExtension) obj2).getBackgroundVideo();
                    if (backgroundVideo != null) {
                        h.f.b.l.b(backgroundVideo, "");
                        if (!h.f.b.l.a(backgroundVideo, aVar2)) {
                            Iterator<T> it = h.a.n.d((Iterable) d3, d3.size() - 1).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.c.a(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
                                    break;
                                }
                                T next = it.next();
                                h.f.b.l.b(next, "");
                                if (h.f.b.l.a(next.getBackgroundVideo(), backgroundVideo)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (com.bytedance.common.utility.h.b(d3) && (timeSpeedModelExtension = (TimeSpeedModelExtension) d3.get(d3.size() - 1)) != null && timeSpeedModelExtension.getSavePhotoStickerInfo() != null) {
                    com.ss.android.ugc.aweme.shortvideo.sticker.e.d(timeSpeedModelExtension.getSavePhotoStickerInfo().getCapturedPhotoDir());
                }
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.b.f
    public final void a(q.a aVar) {
        h.f.b.l.d(aVar, "");
        com.ss.android.ugc.aweme.port.in.g.a().A().e();
        com.ss.android.ugc.aweme.sticker.repository.a.q g2 = t().c().g();
        com.ss.android.ugc.aweme.sticker.repository.d.a.j jVar = new com.ss.android.ugc.aweme.sticker.repository.d.a.j();
        ShortVideoContext shortVideoContext = this.B;
        if (shortVideoContext.f124757b.b() || shortVideoContext.c()) {
            com.ss.android.ugc.aweme.sticker.repository.a.s.a(g2, jVar);
        }
        com.ss.android.ugc.aweme.sticker.repository.d.a.c cVar = new com.ss.android.ugc.aweme.sticker.repository.d.a.c();
        if (this.B.i()) {
            com.ss.android.ugc.aweme.sticker.repository.a.s.a(g2, cVar);
        }
        com.ss.android.ugc.aweme.sticker.repository.d.a.b bVar = new com.ss.android.ugc.aweme.sticker.repository.d.a.b();
        ShortVideoContext shortVideoContext2 = this.B;
        if (shortVideoContext2.f124757b.b() || shortVideoContext2.f124757b.c() || shortVideoContext2.f124757b.f124714i || shortVideoContext2.c()) {
            com.ss.android.ugc.aweme.sticker.repository.a.s.a(g2, bVar);
        }
        com.ss.android.ugc.aweme.sticker.repository.d.a.d dVar = com.ss.android.ugc.aweme.sticker.repository.d.a.d.f135496a;
        if (this.B.f124757b.b()) {
            com.ss.android.ugc.aweme.sticker.repository.a.s.a(g2, dVar);
        }
        com.ss.android.ugc.aweme.sticker.repository.d.a.g gVar = new com.ss.android.ugc.aweme.sticker.repository.d.a.g();
        if (this.B.c()) {
            com.ss.android.ugc.aweme.sticker.repository.a.s.a(g2, gVar);
        }
        com.ss.android.ugc.aweme.sharedar.i iVar = new com.ss.android.ugc.aweme.sharedar.i();
        ShortVideoContext shortVideoContext3 = this.B;
        if (shortVideoContext3.f124757b.b() || shortVideoContext3.f124757b.c() || shortVideoContext3.c() || dm.c(shortVideoContext3)) {
            com.ss.android.ugc.aweme.sticker.repository.a.s.a(g2, iVar);
        }
        com.ss.android.ugc.aweme.sticker.repository.d.a.k kVar = com.ss.android.ugc.aweme.sticker.repository.d.a.k.f135500a;
        ShortVideoContext shortVideoContext4 = this.B;
        if (shortVideoContext4.f124757b.c() || com.ss.android.ugc.aweme.shortvideo.duet.a.a(shortVideoContext4) || shortVideoContext4.c()) {
            com.ss.android.ugc.aweme.sticker.repository.a.s.a(g2, kVar);
        }
        com.ss.android.ugc.aweme.sticker.repository.a.s.a(g2, com.ss.android.ugc.aweme.sticker.h.a.f134900a);
        com.ss.android.ugc.aweme.sticker.repository.d.a.h hVar = com.ss.android.ugc.aweme.sticker.repository.d.a.h.f135497a;
        ShortVideoContext shortVideoContext5 = this.B;
        if (shortVideoContext5.f124757b.b() || shortVideoContext5.f124757b.c() || shortVideoContext5.c()) {
            com.ss.android.ugc.aweme.sticker.repository.a.s.a(g2, hVar);
        }
        a aVar2 = new a(this);
        if (h.f.b.l.a((Object) "1", (Object) this.B.ay)) {
            com.ss.android.ugc.aweme.sticker.repository.a.s.a(g2, aVar2);
        }
        com.ss.android.ugc.gamora.recorder.sticker.d dVar2 = com.ss.android.ugc.gamora.recorder.sticker.d.f148475a;
        if (dm.c(this.B)) {
            com.ss.android.ugc.aweme.sticker.repository.a.s.a(g2, dVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.h$h  reason: collision with other inner class name */
    static final class C4010h extends h.f.b.m implements h.f.a.m<Long, String, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C4010h f148461a = new C4010h();

        static {
            Covode.recordClassIndex(97843);
        }

        C4010h() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(Long l2, String str) {
            long longValue = l2.longValue();
            com.ss.android.ugc.aweme.port.in.g.a().I().a("upload_pic_sticker_loading_time", 0, new com.ss.android.ugc.aweme.shortvideo.ar().a("duration", Long.valueOf(longValue)).a("stickid", str).a());
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.b.f
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.o oVar, com.ss.android.ugc.aweme.sticker.d.d dVar) {
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(dVar, "");
        super.a(oVar, dVar);
        dVar.a(new com.ss.android.ugc.aweme.sticker.d.a.e(oVar, this.f28394c));
        if (com.ss.android.ugc.aweme.port.in.g.a().s().b()) {
            dVar.a(new com.ss.android.ugc.aweme.sticker.d.a.b(this.f28393b, this.B, new ad(dVar)));
        }
    }

    static final class c extends h.f.b.m implements h.f.a.m<String, String, h.z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar) {
            super(2);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            h.f.b.l.d(str3, "");
            h.f.b.l.d(str4, "");
            h hVar = this.this$0;
            if (str4 != null) {
                if (str4.toString().equals("")) {
                    if (hVar.K.getType() == 1) {
                        hVar.f28396e.getEffectController().a(str3, str4.toString());
                    }
                    hVar.a(new com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j(str4, 0, 1, null, null, null, 56));
                } else {
                    if (hVar.K.getType() == 3) {
                        hVar.f28396e.getEffectController().a(hVar.f28393b, (String) null, (String) null);
                    }
                    com.ss.android.ugc.aweme.ci.b.a(str4, com.ss.android.ugc.aweme.ci.b.f71080a, new ae(hVar, str3));
                    hVar.a(new com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j(str4, 0, 1, null, null, null, 56));
                }
            }
            return h.z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<String, com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j, h.z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97839);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar) {
            super(2);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(String str, com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j jVar) {
            String str2 = str;
            com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j jVar2 = jVar;
            h.f.b.l.d(str2, "");
            h.f.b.l.d(jVar2, "");
            h hVar = this.this$0;
            if (jVar2.f135808b != null) {
                if (jVar2.f135808b.toString().equals("")) {
                    if (hVar.K.getType() == 3) {
                        hVar.f28396e.getEffectController().a(hVar.f28393b, (String) null, (String) null);
                    }
                    hVar.a(new com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j(jVar2.f135808b, 0, 1, null, null, null, 56));
                } else {
                    File file = new File(jVar2.f135808b.toString());
                    if (file.exists()) {
                        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(file.toURI().toURL().toString());
                        h.f.b.l.b(fileExtensionFromUrl, "");
                        Objects.requireNonNull(fileExtensionFromUrl, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = fileExtensionFromUrl.toLowerCase();
                        h.f.b.l.b(lowerCase, "");
                        if (!(!h.f.b.l.a((Object) lowerCase, (Object) "gif"))) {
                            if (hVar.K.getType() == 1) {
                                hVar.f28396e.getEffectController().a(hVar.f28393b, (String) null, (String) null, (String) null);
                            }
                            hVar.f28396e.getEffectController().a(hVar.f28393b, str2, jVar2.f135808b.toString());
                            hVar.a(jVar2);
                            hVar.F = 0;
                        }
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.b.f, com.bytedance.creativex.recorder.sticker.a.a
    public final void a(r.b bVar, FrameLayout frameLayout) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(frameLayout, "");
        super.a(bVar, frameLayout);
        this.f28395d.j().a(this, new aw(this));
        this.f28395d.L().a(this, new ax(this));
        t().c().j().d().observe(this, new ay(this));
    }

    @Override // com.bytedance.creativex.recorder.sticker.b.f
    public final void a(FrameLayout frameLayout, r.b bVar) {
        aa aaVar;
        y yVar;
        h.f.b.l.d(frameLayout, "");
        h.f.b.l.d(bVar, "");
        super.a(frameLayout, bVar);
        com.ss.android.ugc.aweme.tools.extract.o H2 = this.f28395d.H();
        com.ss.android.ugc.aweme.sticker.panel.i iVar = this.f28400i.f135258f;
        if (iVar != null) {
            com.ss.android.ugc.aweme.sticker.panel.j m2 = iVar.m();
            com.ss.android.ugc.aweme.sticker.panel.k kVar = m2.f135225m.f135207g;
            j jVar = (j) getDiContainer().a(j.class, (String) null);
            a(new com.ss.android.ugc.aweme.sticker.presenter.handler.e(z.f148469a));
            com.ss.android.ugc.tools.view.a.c a2 = new com.ss.android.ugc.tools.view.a.e().a(this.f28393b);
            if (a2 == null) {
                a2 = (com.ss.android.ugc.tools.view.a.c) getDiContainer().b(com.ss.android.ugc.tools.view.a.c.class, null);
            }
            com.ss.android.ugc.aweme.sticker.presenter.handler.d a3 = this.ad.a(this.f28393b, t(), u(), (com.ss.android.ugc.tools.b.a.d) getDiContainer().a(com.ss.android.ugc.tools.b.a.d.class, (String) null), (ShortVideoContext) getDiContainer().a(ShortVideoContext.class, (String) null), (com.bytedance.creativex.recorder.sticker.a.a) getDiContainer().a(com.bytedance.creativex.recorder.sticker.a.a.class, (String) null), a2);
            a(a3);
            jVar.z().a(this, new b(a3));
            iVar.a().observe(this, new m(this));
            a(new SavePhotoStickerHandler(this.f28393b, new com.ss.android.ugc.aweme.sticker.types.c.b(this.f28396e.getEffectController(), this.f28395d, this.B, new s(this)), com.ss.android.ugc.aweme.utils.bj.f142677a));
            a(new com.ss.android.ugc.aweme.sticker.types.b.a(t.f148466a, this.f28393b, t(), this.f28396e.getEffectController(), kVar));
            a(new ARStickerHandler(this.f28393b, this.f28393b, this.f28401j, new com.ss.android.ugc.aweme.sticker.q.a(this.f28396e.getEffectController(), this.f28396e.getCameraController()), this.f28402k), true);
            a(new com.ss.android.ugc.aweme.sticker.presenter.handler.i(this.f28393b, new com.ss.android.ugc.aweme.sticker.q.c(this.f28396e.getEffectController())), true);
            a(new com.ss.android.ugc.aweme.sticker.presenter.handler.k(u.f148467a), true);
            if (m2.f135221i) {
                a(new LockStickerHandler(this.f28393b, t(), new v(this), new w(this)), true);
            }
            ac acVar = new ac(this);
            androidx.appcompat.app.d dVar = this.f28393b;
            ShortVideoContext shortVideoContext = this.B;
            x xVar = new x(this);
            ah N2 = N();
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(shortVideoContext, "");
            h.f.b.l.d(xVar, "");
            h.f.b.l.d(N2, "");
            String str = shortVideoContext.q;
            com.ss.android.ugc.aweme.sticker.m.a.a aVar = new com.ss.android.ugc.aweme.sticker.m.a.a(shortVideoContext);
            c.a aVar2 = new c.a();
            c.b bVar2 = new c.b(shortVideoContext);
            c.C4008c cVar = new c.C4008c(shortVideoContext);
            com.ss.android.ugc.aweme.mediachoose.c cVar2 = new com.ss.android.ugc.aweme.mediachoose.c(dVar);
            c.d dVar2 = new c.d(dVar);
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(xVar, "");
            h.f.b.l.d(N2, "");
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(aVar2, "");
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(cVar, "");
            h.f.b.l.d(cVar2, "");
            h.f.b.l.d(dVar2, "");
            h.f.b.l.d(cVar2, "");
            a(new BackgroundVideoStickerPresenter(dVar, str, a2, xVar, N2, aVar, aVar2, bVar2, cVar, acVar, new b.a(cVar2), dVar2));
            if (h.f.b.l.a((Object) this.B.r, (Object) "direct_shoot")) {
                aaVar = new aa(this);
            } else {
                aaVar = null;
            }
            if (gs.a()) {
                yVar = new y(this);
            } else {
                yVar = null;
            }
            androidx.appcompat.app.d dVar3 = this.f28393b;
            com.ss.android.ugc.aweme.aj.b bVar3 = new com.ss.android.ugc.aweme.aj.b();
            ah N3 = N();
            com.ss.android.ugc.aweme.sticker.m.a.c cVar3 = new com.ss.android.ugc.aweme.sticker.m.a.c(this.B);
            c cVar4 = new c(this);
            d dVar4 = new d(this);
            e eVar = new e(this, H2);
            f fVar = new f(this);
            g gVar = new g(this);
            LiveData<List<String>> d2 = t().c().j().d();
            a(new UploadPicStickerARPresenter(dVar3, a2, bVar3, N3, cVar3, gVar, fVar, eVar, C4010h.f148461a, aaVar, cVar4, dVar4, this.T, d2, t(), acVar, new i(this), this.J, yVar, 3072));
            a(new com.ss.android.ugc.aweme.sticker.presenter.handler.a(this.f28393b, t(), new com.ss.android.ugc.aweme.sticker.q.b(this.f28396e.getEffectController()), new j(frameLayout), bVar, com.ss.android.ugc.aweme.utils.bj.f142677a, new k(this)));
            a(new com.ss.android.ugc.aweme.sticker.presenter.handler.c(this.f28393b, this.f28401j, l.f148462a, this.f28403l, this.f28402k, (byte) 0));
            StickerVideoStatusHandler stickerVideoStatusHandler = new StickerVideoStatusHandler(this.f28393b, new com.ss.android.ugc.aweme.sticker.q.e(this.f28396e.getEffectController()), this.P);
            this.C = stickerVideoStatusHandler;
            a(stickerVideoStatusHandler);
            a(new VoiceRecognizeStickerHandler(this.f28393b, new com.ss.android.ugc.aweme.sticker.q.f(this.f28396e.getAudioController()), q().c(), this.f28393b, new n(this)));
            a(new com.ss.android.ugc.aweme.sticker.m.n(this.B));
            if (!com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                IInternalCommerceService h2 = AVCommerceServiceImpl.h();
                h.f.b.l.b(h2, "");
                if (!h2.b() && AVCommerceServiceImpl.h().e()) {
                    a(new com.ss.android.ugc.gamora.recorder.sticker.a(this.f28393b, new ab(this)));
                }
            }
            com.ss.android.ugc.aweme.sticker.presenter.handler.j jVar2 = new com.ss.android.ugc.aweme.sticker.presenter.handler.j(o.f148464a, new p(this), new q(this), new r(this));
            this.D = jVar2;
            a((com.ss.android.ugc.aweme.sticker.presenter.handler.m) jVar2, false);
            a(new ARCoreStickerHandler(this.f28393b, this.f28393b, y()));
            androidx.appcompat.app.d dVar5 = this.f28393b;
            com.ss.android.ugc.aweme.sharedar.b F2 = F();
            com.bytedance.creativex.recorder.b.a.d y2 = y();
            com.bytedance.creativex.recorder.b.a.m q2 = q();
            h.h.d dVar6 = this.R;
            h.k.i<?>[] iVarArr = A;
            a(new SharedARStickerHandler(dVar5, F2, y2, q2, (com.bytedance.creativex.recorder.filter.a.a) dVar6.a(this, iVarArr[1]), (com.bytedance.creativex.recorder.a.a.a) this.S.a(this, iVarArr[2])));
            androidx.appcompat.app.d dVar7 = this.f28393b;
            com.ss.android.ugc.aweme.sticker.presenter.o t2 = t();
            com.ss.android.ugc.aweme.sticker.m.h hVar = this.f28394c;
            com.ss.android.ugc.aweme.sticker.d.d u2 = u();
            com.ss.android.ugc.tools.b.a.d dVar8 = (com.ss.android.ugc.tools.b.a.d) getDiContainer().a(com.ss.android.ugc.tools.b.a.d.class, (String) null);
            h.f.b.l.d(dVar7, "");
            h.f.b.l.d(t2, "");
            h.f.b.l.d(hVar, "");
            h.f.b.l.d(u2, "");
            h.f.b.l.d(dVar8, "");
            h.f.b.l.d(kVar, "");
            com.ss.android.ugc.aweme.sticker.view.internal.main.m mVar = new com.ss.android.ugc.aweme.sticker.view.internal.main.m(dVar8);
            a(new com.ss.android.ugc.aweme.sticker.types.multi.c(dVar7, t2, hVar, mVar, kVar, new MultiStickerListViewModel(dVar7, t2, u2, mVar)));
            com.ss.android.ugc.aweme.sticker.a.b bVar4 = new com.ss.android.ugc.aweme.sticker.a.b();
            bVar4.a(new com.ss.android.ugc.aweme.sticker.a.d.a(y()));
            bVar4.a(new com.ss.android.ugc.aweme.sticker.a.b.a(y(), com.bytedance.als.dsl.g.a(this)));
            bVar4.a(new com.ss.android.ugc.aweme.sticker.a.c.a(y(), com.bytedance.als.dsl.g.a(this)));
            bVar4.a(new com.ss.android.ugc.aweme.sticker.a.a.c(y()));
            a(bVar4);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    static final class aa extends h.f.b.m implements h.f.a.q<Effect, Handler, DialogInterface.OnDismissListener, Dialog> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(h hVar) {
            super(3);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ Dialog invoke(Effect effect, Handler handler, DialogInterface.OnDismissListener onDismissListener) {
            Effect effect2 = effect;
            Handler handler2 = handler;
            DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
            h.f.b.l.d(effect2, "");
            h.f.b.l.d(handler2, "");
            h.f.b.l.d(onDismissListener2, "");
            return com.ss.android.ugc.aweme.port.in.g.a().J().a(effect2, onDismissListener2, handler2, this.this$0.f28393b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(com.bytedance.o.f fVar, b bVar, h.f.a.b<? super f.a, h.z> bVar2) {
        super(fVar, bVar2);
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(bVar, "");
        this.ad = bVar;
        ShortVideoContext shortVideoContext = (ShortVideoContext) getDiContainer().a(ShortVideoContext.class, (String) null);
        this.B = shortVideoContext;
        this.T = new com.ss.android.ugc.aweme.sticker.m.a.d(shortVideoContext);
        this.U = h.i.a((h.f.a.a) new bd(this));
        this.V = new ai(this);
        this.W = new com.bytedance.als.k<>();
        this.M = new androidx.lifecycle.t<>();
        androidx.lifecycle.ad a2 = androidx.lifecycle.ae.a(this.f28393b, (ad.b) null);
        h.f.b.l.b(a2, "");
        if (!TextUtils.isEmpty(shortVideoContext.aE) || !TextUtils.isEmpty(shortVideoContext.aF)) {
            t().a(false);
        }
        androidx.appcompat.app.d dVar = this.f28393b;
        AnonymousClass1 r3 = new com.ss.android.ugc.aweme.sticker.effectconfig.c() {
            /* class com.ss.android.ugc.gamora.recorder.sticker.c.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(97805);
            }

            @Override // com.ss.android.ugc.aweme.sticker.effectconfig.c
            public final void a(String str, String str2) {
                h.f.b.l.d(str, "");
                h.f.b.l.d(str2, "");
            }
        };
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(shortVideoContext, "");
        h.f.b.l.d(r3, "");
        com.ss.android.ugc.aweme.sticker.effectconfig.b bVar3 = new com.ss.android.ugc.aweme.sticker.effectconfig.b(dVar, shortVideoContext, r3, (EffectConfigViewModel) a2.a(EffectConfigViewModel.class));
        bVar3.f134822c.f134817a.observe(bVar3.f134820a, new b.a(bVar3));
        bVar3.f134822c.f134818b.observe(bVar3.f134820a, new b.C3513b(bVar3));
        bVar3.f134822c.f134819c.observe(bVar3.f134820a, new b.c(bVar3));
        this.X = h.i.a(h.m.NONE, new bb(this));
        this.Y = h.i.a(h.m.NONE, new ba(this));
        this.Z = h.i.a(h.m.NONE, new af(this));
        this.aa = h.i.a(h.m.NONE, new az(this));
        this.ab = new com.ss.android.ugc.aweme.shortvideo.ui.bb(this.f28393b, this, shortVideoContext, this);
        this.ac = h.i.a(h.m.NONE, new bc(this));
        this.N = true;
    }
}
