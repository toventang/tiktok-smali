package com.bytedance.creativex.recorder.sticker.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.a.a;
import com.bytedance.creativex.recorder.sticker.a.b;
import com.ss.android.medialib.RecordInvoker;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.panel.l;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import com.ss.android.ugc.aweme.sticker.repository.a.q;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.aweme.sticker.types.ar.text.r;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import h.f.b.y;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class f<API extends com.bytedance.creativex.recorder.sticker.a.a> extends com.bytedance.als.j<API> implements com.bytedance.creativex.recorder.sticker.a.a, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f28392a = {new y(f.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(f.class, "effectPlatform", "getEffectPlatform()Lcom/ss/android/ugc/tools/effectplatform/api/IEffectPlatformPrimitive;", 0)};
    private final h.h.d A;
    private final h.h B;
    private final h.h C;
    private final h.h D;
    private final t E;
    private final com.bytedance.o.f F;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.appcompat.app.d f28393b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.m.h f28394c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.b.a.d f28395d;

    /* renamed from: e  reason: collision with root package name */
    public final ASCameraView f28396e;

    /* renamed from: f  reason: collision with root package name */
    final h.h.d f28397f;

    /* renamed from: g  reason: collision with root package name */
    public final a f28398g;

    /* renamed from: h  reason: collision with root package name */
    public final f.a.b.a f28399h;

    /* renamed from: i  reason: collision with root package name */
    public final g f28400i;

    /* renamed from: j  reason: collision with root package name */
    public final com.bytedance.als.h<Boolean> f28401j;

    /* renamed from: k  reason: collision with root package name */
    public final b f28402k;

    /* renamed from: l  reason: collision with root package name */
    public final c f28403l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.presenter.handler.n f28404m;
    public final MessageCenter.Listener n;
    public final com.bytedance.als.k<Boolean> o;
    public final com.bytedance.als.k<Boolean> p;
    public final com.bytedance.als.k<com.bytedance.creativex.recorder.sticker.a.b> q;
    public final com.bytedance.als.k<Boolean> r;
    public final d s;
    public final com.bytedance.als.k<Boolean> t;
    public final com.bytedance.als.k<Effect> u;
    public final com.bytedance.als.k<Boolean> v;
    public final com.bytedance.als.k<z> w;
    public final com.bytedance.als.k<com.ss.android.ugc.aweme.sticker.presenter.handler.c.c> x;
    final f.a.l.c<h.p<Effect, a>> y;
    public List<String> z;

    static final class i<T> implements com.bytedance.als.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f28425a = new i();

        static {
            Covode.recordClassIndex(16692);
        }

        i() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* bridge */ /* synthetic */ void onChanged(Boolean bool) {
        }
    }

    static {
        Covode.recordClassIndex(16681);
    }

    public void a(com.ss.android.ugc.aweme.sticker.presenter.o oVar, com.ss.android.ugc.aweme.sticker.d.d dVar) {
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(dVar, "");
    }

    /* access modifiers changed from: protected */
    public void a(q.a aVar) {
        h.f.b.l.d(aVar, "");
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final com.ss.android.ugc.aweme.sticker.presenter.a.c h() {
        return (com.ss.android.ugc.aweme.sticker.presenter.a.c) this.D.getValue();
    }

    public final com.bytedance.creativex.recorder.b.a.m q() {
        return (com.bytedance.creativex.recorder.b.a.m) this.A.a(this, f28392a[0]);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.i
    public final com.ss.android.ugc.aweme.sticker.presenter.o t() {
        return (com.ss.android.ugc.aweme.sticker.presenter.o) this.B.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.i
    public com.ss.android.ugc.aweme.sticker.d.d u() {
        return (com.ss.android.ugc.aweme.sticker.d.d) this.C.getValue();
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.g a() {
        return this.o;
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.g b() {
        return this.q;
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final /* bridge */ /* synthetic */ com.bytedance.creativex.recorder.sticker.a.d c() {
        return this.s;
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.g d() {
        return this.t;
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.g e() {
        return this.r;
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.g f() {
        return this.x;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.F;
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.g j() {
        return this.u;
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.g k() {
        return this.v;
    }

    public static final class g extends com.ss.android.ugc.aweme.sticker.presenter.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f28416a;

        static {
            Covode.recordClassIndex(16688);
        }

        @Override // com.ss.android.ugc.aweme.sticker.presenter.a
        public final com.ss.android.ugc.aweme.sticker.presenter.a.c a() {
            return this.f28416a.h();
        }

        @Override // com.ss.android.ugc.aweme.sticker.presenter.a
        public final com.ss.android.ugc.aweme.sticker.presenter.handler.n b() {
            return this.f28416a.f28404m;
        }

        @Override // com.ss.android.ugc.aweme.sticker.presenter.i
        public final com.ss.android.ugc.aweme.sticker.presenter.o t() {
            return this.f28416a.t();
        }

        @Override // com.ss.android.ugc.aweme.sticker.presenter.i
        public final com.ss.android.ugc.aweme.sticker.d.d u() {
            return this.f28416a.u();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar, androidx.lifecycle.m mVar, com.ss.android.ugc.tools.utils.j jVar) {
            super(mVar, jVar);
            this.f28416a = fVar;
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final FaceStickerBean i() {
        return w();
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final void o() {
        this.f28402k.b();
    }

    @Override // com.bytedance.als.j
    public void onStart() {
        super.onStart();
        d(true);
    }

    @Override // com.bytedance.als.j
    public void onStop() {
        super.onStop();
        d(false);
    }

    public final CameraComponentModel r() {
        return this.f28395d.e();
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.i
    public final com.ss.android.ugc.aweme.sticker.panel.i v() {
        return this.f28400i.f135258f;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.i
    public final SafeHandler x() {
        return this.f28400i.f135259g;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f28405a;

        /* renamed from: b  reason: collision with root package name */
        public h.f.a.a<Boolean> f28406b;

        /* renamed from: c  reason: collision with root package name */
        public h.f.a.b<? super String, String> f28407c;

        /* renamed from: d  reason: collision with root package name */
        public com.ss.android.ugc.tools.utils.j f28408d;

        /* renamed from: e  reason: collision with root package name */
        public h.f.a.b<? super Effect, z> f28409e;

        /* renamed from: f  reason: collision with root package name */
        public com.ss.android.ugc.aweme.sticker.presenter.q f28410f;

        /* renamed from: g  reason: collision with root package name */
        public h.f.a.a<? extends com.ss.android.ugc.aweme.sticker.presenter.h> f28411g;

        /* renamed from: h  reason: collision with root package name */
        public Handler f28412h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f28413i;

        /* renamed from: j  reason: collision with root package name */
        public com.ss.android.ugc.asve.c.a f28414j;

        static {
            Covode.recordClassIndex(16682);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28405a == aVar.f28405a && h.f.b.l.a(this.f28406b, aVar.f28406b) && h.f.b.l.a(this.f28407c, aVar.f28407c) && h.f.b.l.a(this.f28408d, aVar.f28408d) && h.f.b.l.a(this.f28409e, aVar.f28409e) && h.f.b.l.a(this.f28410f, aVar.f28410f) && h.f.b.l.a(this.f28411g, aVar.f28411g) && h.f.b.l.a(this.f28412h, aVar.f28412h) && this.f28413i == aVar.f28413i && h.f.b.l.a(this.f28414j, aVar.f28414j);
        }

        public final int hashCode() {
            boolean z = this.f28405a;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = i3 * 31;
            h.f.a.a<Boolean> aVar = this.f28406b;
            int i7 = 0;
            int hashCode = (i6 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            h.f.a.b<? super String, String> bVar = this.f28407c;
            int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
            com.ss.android.ugc.tools.utils.j jVar = this.f28408d;
            int hashCode3 = (hashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
            h.f.a.b<? super Effect, z> bVar2 = this.f28409e;
            int hashCode4 = (hashCode3 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
            com.ss.android.ugc.aweme.sticker.presenter.q qVar = this.f28410f;
            int hashCode5 = (hashCode4 + (qVar != null ? qVar.hashCode() : 0)) * 31;
            h.f.a.a<? extends com.ss.android.ugc.aweme.sticker.presenter.h> aVar2 = this.f28411g;
            int hashCode6 = (hashCode5 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
            Handler handler = this.f28412h;
            int hashCode7 = (hashCode6 + (handler != null ? handler.hashCode() : 0)) * 31;
            if (!this.f28413i) {
                i2 = 0;
            }
            int i8 = (hashCode7 + i2) * 31;
            com.ss.android.ugc.asve.c.a aVar3 = this.f28414j;
            if (aVar3 != null) {
                i7 = aVar3.hashCode();
            }
            return i8 + i7;
        }

        public final String toString() {
            return "Config(showToolViewRemoteImage=" + this.f28405a + ", autoShowPanelInterceptor=" + this.f28406b + ", beatMusicPathGenerator=" + this.f28407c + ", toolsLogger=" + this.f28408d + ", onFavoriteChanged=" + this.f28409e + ", stickerManagerConfigure=" + this.f28410f + ", stickerDataManagerFactory=" + this.f28411g + ", sensorHandler=" + this.f28412h + ", unRegisteredSensorWhenCancelSticker=" + this.f28413i + ", privacyCertConfiguration=" + this.f28414j + ")";
        }

        public /* synthetic */ a() {
            this(new com.ss.android.ugc.aweme.sticker.presenter.q("default"), com.ss.android.ugc.asve.c.b.f61947j);
        }

        private a(com.ss.android.ugc.aweme.sticker.presenter.q qVar, com.ss.android.ugc.asve.c.a aVar) {
            h.f.b.l.d(qVar, "");
            h.f.b.l.d(aVar, "");
            this.f28405a = true;
            this.f28406b = null;
            this.f28407c = null;
            this.f28408d = null;
            this.f28409e = null;
            this.f28410f = qVar;
            this.f28411g = null;
            this.f28412h = null;
            this.f28413i = false;
            this.f28414j = aVar;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.panel.j> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(16684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.panel.j invoke() {
            com.ss.android.ugc.aweme.sticker.panel.i iVar = this.this$0.f28400i.f135258f;
            if (iVar != null) {
                return iVar.m();
            }
            return null;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.repository.a.h> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(16685);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.repository.a.h invoke() {
            return this.this$0.t().c().f();
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(16703);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.ss.android.ugc.aweme.sticker.p.g.k(com.ss.android.ugc.aweme.sticker.f.e.a(this.this$0)));
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.presenter.a.a> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(16706);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.presenter.a.a invoke() {
            return new com.ss.android.ugc.aweme.sticker.presenter.a.a(new h.f.a.s<Integer, Integer, String, Effect, Boolean, Integer>(this) {
                /* class com.bytedance.creativex.recorder.sticker.b.f.u.AnonymousClass1 */
                final /* synthetic */ u this$0;

                static {
                    Covode.recordClassIndex(16707);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // h.f.a.s
                public final /* synthetic */ Integer invoke(Integer num, Integer num2, String str, Effect effect, Boolean bool) {
                    String extra;
                    int intValue = num.intValue();
                    int intValue2 = num2.intValue();
                    String str2 = str;
                    Effect effect2 = effect;
                    boolean booleanValue = bool.booleanValue();
                    String str3 = "";
                    h.f.b.l.d(str2, str3);
                    com.ss.android.ugc.asve.recorder.effect.a effectController = this.this$0.this$0.f28396e.getEffectController();
                    VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
                    vEEffectFilterParam.effectPath = str2;
                    vEEffectFilterParam.stickerId = intValue2;
                    vEEffectFilterParam.reqId = intValue;
                    if (!(effect2 == null || (extra = effect2.getExtra()) == null)) {
                        str3 = extra;
                    }
                    vEEffectFilterParam.stickerTag = str3;
                    vEEffectFilterParam.needReload = booleanValue;
                    if (com.ss.android.ugc.aweme.sticker.p.g.s(effect2)) {
                        vEEffectFilterParam.effectFilterType = VEEffectFilterParam.a.MUSIC;
                    }
                    if (com.ss.android.ugc.aweme.sticker.p.g.g(effect2)) {
                        vEEffectFilterParam.effectFilterType = VEEffectFilterParam.a.AUDIO_SPEED;
                    }
                    return Integer.valueOf(effectController.a(vEEffectFilterParam));
                }
            });
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.d.a> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(16709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.d.a invoke() {
            return new com.ss.android.ugc.aweme.sticker.d.a(this.this$0.t());
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final f.a.t<h.p<Effect, a>> g() {
        f.a.t<h.p<Effect, a>> c2 = this.y.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final void l() {
        this.f28396e.getEffectController().d((String) null);
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final void n() {
        this.f28395d.i().a(this.f28393b, i.f28425a);
    }

    @Override // com.bytedance.als.j
    public void onDestroy() {
        super.onDestroy();
        this.f28399h.a();
    }

    @Override // com.bytedance.als.j
    public void onPause() {
        super.onPause();
        this.f28402k.b();
    }

    @Override // com.bytedance.als.j
    public void onResume() {
        super.onResume();
        this.f28402k.a();
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final void p() {
        this.f28396e.getEffectController().b(this.n);
    }

    public final Effect s() {
        return t().g();
    }

    /* access modifiers changed from: protected */
    public FaceStickerBean w() {
        return com.ss.android.ugc.aweme.sticker.p.f.a(s());
    }

    static final class p extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(16701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!com.ss.android.ugc.aweme.sticker.p.g.i(this.this$0.t().n().b().getValue()));
        }
    }

    static final class x implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f28440a;

        static {
            Covode.recordClassIndex(16710);
        }

        x(f fVar) {
            this.f28440a = fVar;
        }

        public final void run() {
            this.f28440a.f28395d.D().a(new RecordInvoker.OnARTextContentCallback(this) {
                /* class com.bytedance.creativex.recorder.sticker.b.f.x.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ x f28441a;

                static {
                    Covode.recordClassIndex(16711);
                }

                {
                    this.f28441a = r1;
                }

                @Override // com.ss.android.medialib.RecordInvoker.OnARTextContentCallback
                public final void onResult(String[] strArr) {
                    ArrayList arrayList;
                    f fVar = this.f28441a.f28440a;
                    if (strArr == null || strArr.length == 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(h.a.i.j(strArr));
                    }
                    fVar.z = arrayList;
                }
            });
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final void m() {
        com.ss.android.ugc.aweme.sticker.repository.a.w c2 = t().c();
        com.ss.android.ugc.aweme.sticker.repository.a.y j2 = c2.j();
        j2.b().observe(this.f28393b, new h(this, j2, c2));
    }

    static final class s extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.presenter.o> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(16704);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.presenter.o invoke() {
            com.ss.android.ugc.aweme.sticker.presenter.h hVar;
            h.f.a.a<? extends com.ss.android.ugc.aweme.sticker.presenter.h> aVar = this.this$0.f28398g.f28411g;
            if (aVar == null || (hVar = (com.ss.android.ugc.aweme.sticker.presenter.h) aVar.invoke()) == null) {
                androidx.appcompat.app.d dVar = this.this$0.f28393b;
                com.ss.android.ugc.aweme.sticker.presenter.q qVar = this.this$0.f28398g.f28410f;
                com.ss.android.ugc.aweme.sticker.g.b bVar = com.ss.android.ugc.aweme.sticker.g.b.f134895a;
                f fVar = this.this$0;
                hVar = new com.ss.android.ugc.aweme.sticker.presenter.c(dVar, qVar, bVar, (com.ss.android.ugc.tools.b.a.d) fVar.f28397f.a(fVar, f.f28392a[1]));
            }
            return hVar.a();
        }
    }

    @Override // com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        t();
        this.f28401j.a(this.f28393b, new j(this));
        if (this.f28398g.f28410f.f135427d) {
            com.ss.android.ugc.aweme.sticker.repository.a.j i2 = t().c().i();
            com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a.a aVar = new com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a.a(h.i.a((h.f.a.a) new d(this)));
            Context applicationContext = this.f28393b.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            h.f.b.l.b(applicationContext, "");
            i2.a(new com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a(aVar, applicationContext));
            a(new com.ss.android.ugc.aweme.sticker.favorite.d(this.f28393b, (com.ss.android.ugc.aweme.sticker.favorite.b) getDiContainer().a(com.ss.android.ugc.aweme.sticker.favorite.b.class, (String) null), t(), this.f28394c, (StickerPreferences) getDiContainer().a(StickerPreferences.class, (String) null), new b(this), new c(this)));
        }
        q().k().a(this, new k(this));
        q().i().a(this, new l(this));
        q().l().a(this, new m(this));
        q().m().a(this, new n(this));
        q().F().a(this, new o(this));
        q().a(new p(this));
        this.f28395d.k().a(this.f28393b, new q(this));
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.b.f$f  reason: collision with other inner class name */
    public static final class C0607f implements com.ss.android.ugc.aweme.sticker.panel.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f28415a;

        static {
            Covode.recordClassIndex(16687);
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.l
        public final void a(View view) {
            h.f.b.l.d(view, "");
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.l
        public final void cw_() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C0607f(f fVar) {
            this.f28415a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.l
        public final void a(l.a aVar) {
            h.f.b.l.d(aVar, "");
            if (aVar == l.a.BEFORE_ANIMATE) {
                this.f28415a.t.a((Boolean) true);
            }
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.l
        public final void b(l.a aVar) {
            h.f.b.l.d(aVar, "");
            if (aVar == l.a.AFTER_ANIMATE) {
                this.f28415a.t.a((Boolean) false);
            }
        }
    }

    static final class q<T> implements com.bytedance.als.m<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f28437a;

        static {
            Covode.recordClassIndex(16702);
        }

        q(f fVar) {
            this.f28437a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(z zVar) {
            this.f28437a.d(true);
        }
    }

    public static final class t implements com.ss.android.ugc.aweme.sticker.presenter.handler.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f28438a;

        static {
            Covode.recordClassIndex(16705);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        t(f fVar) {
            this.f28438a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m
        public final com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.c cVar, m.a aVar) {
            h.f.a.a<Boolean> aVar2;
            h.f.b.l.d(cVar, "");
            h.f.b.l.d(aVar, "");
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a2 = aVar.a(cVar);
            if (cVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) {
                com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar3 = (com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) cVar;
                if (aVar3.f135380c == com.ss.android.ugc.aweme.sticker.d.b.a.MANUAL_SET && !this.f28438a.t().b() && (((aVar2 = this.f28438a.f28398g.f28406b) == null || !aVar2.invoke().booleanValue()) && com.ss.android.ugc.aweme.sticker.p.g.A(aVar3.f135378a))) {
                    if (this.f28438a.t().a()) {
                        this.f28438a.p.a((Boolean) true);
                    } else {
                        this.f28438a.c(true);
                    }
                }
            }
            this.f28438a.x.a(cVar);
            this.f28438a.a(false);
            return a2;
        }
    }

    static final class k<T> implements com.bytedance.als.m<com.bytedance.creativex.recorder.b.a.x> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f28427a;

        static {
            Covode.recordClassIndex(16694);
        }

        k(f fVar) {
            this.f28427a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(com.bytedance.creativex.recorder.b.a.x xVar) {
            this.f28427a.r.a((Boolean) true);
        }
    }

    static final class o<T> implements com.bytedance.als.m<com.bytedance.creativex.recorder.b.a.o> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f28436a;

        static {
            Covode.recordClassIndex(16700);
        }

        o(f fVar) {
            this.f28436a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(com.bytedance.creativex.recorder.b.a.o oVar) {
            e.b((com.ss.android.ugc.aweme.sticker.presenter.i) this.f28436a.getApiComponent());
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.p
    public final com.ss.android.ugc.aweme.sticker.presenter.handler.m a(h.f.a.b<? super com.ss.android.ugc.aweme.sticker.presenter.handler.m, Boolean> bVar) {
        h.f.b.l.d(bVar, "");
        return this.f28400i.a(bVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.p
    public final void b(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
        h.f.b.l.d(mVar, "");
        this.f28400i.b(mVar);
    }

    static final class b extends h.f.b.m implements h.f.a.b<Effect, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(16683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Effect effect) {
            h.f.b.l.d(effect, "");
            h.f.a.b<? super Effect, z> bVar = this.this$0.f28398g.f28409e;
            if (bVar != null) {
                bVar.invoke(effect);
            }
            return z.f158842a;
        }
    }

    static final class j<T> implements com.bytedance.als.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f28426a;

        static {
            Covode.recordClassIndex(16693);
        }

        j(f fVar) {
            this.f28426a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                b bVar = this.f28426a.f28402k;
                boolean booleanValue = bool2.booleanValue();
                com.ss.android.ugc.aweme.sticker.senor.presenter.a aVar = bVar.f28385a;
                if (aVar != null) {
                    aVar.a(booleanValue);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.i
    public final void a(com.ss.android.ugc.aweme.sticker.panel.i iVar) {
        h.f.b.l.d(iVar, "");
        this.f28400i.a(iVar);
        iVar.a(new C0607f(this));
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public final void b(boolean z2) {
        this.v.b(Boolean.valueOf(z2));
    }

    public final void c(boolean z2) {
        this.f28394c.a().a("tool_performance_open_choose_sticker", "click_open_sticker");
        this.o.a(Boolean.valueOf(z2));
    }

    public void d(boolean z2) {
        if (z2) {
            this.f28396e.getEffectController().a(this.n);
        } else {
            this.f28396e.getEffectController().b(this.n);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<Effect, z> {
        final /* synthetic */ FrameLayout $stickerPanelContainer$inlined;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(16686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar, FrameLayout frameLayout) {
            super(1);
            this.this$0 = fVar;
            this.$stickerPanelContainer$inlined = frameLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Effect effect) {
            Effect effect2 = effect;
            h.f.b.l.d(effect2, "");
            Effect s = this.this$0.s();
            if (s != null && (com.ss.android.ugc.aweme.sticker.p.g.a(s) || (!TextUtils.isEmpty(s.getParentId()) && h.f.b.l.a((Object) s.getParentId(), (Object) effect2.getParentId())))) {
                this.this$0.h().a();
            }
            this.this$0.q.a(new b.a(effect2));
            return z.f158842a;
        }
    }

    public static final class h implements androidx.lifecycle.u<com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f28417a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.repository.a.y f28418b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.repository.a.w f28419c;

        static {
            Covode.recordClassIndex(16689);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel> aVar) {
            M m2;
            CategoryEffectModel categoryEffectModel;
            String categoryKey;
            com.ss.android.ugc.aweme.bw.b.a<PanelInfoModel> aVar2 = aVar;
            if (aVar2 != null && (m2 = aVar2.f69568a) != null && (categoryEffectModel = m2.getCategoryEffectModel()) != null && (categoryKey = categoryEffectModel.getCategoryKey()) != null && categoryKey.length() != 0 && categoryEffectModel != null) {
                this.f28418b.b().removeObserver(this);
                this.f28418b.a(categoryEffectModel.getCategoryKey(), true).observe(this.f28417a.f28393b, new a(categoryEffectModel, this));
            }
        }

        public static final class a implements androidx.lifecycle.u<com.ss.android.ugc.aweme.bw.b.a<CategoryEffectModel>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CategoryEffectModel f28420a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f28421b;

            static {
                Covode.recordClassIndex(16690);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r3 = r6.f69568a;
             */
            @Override // androidx.lifecycle.u
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.bw.b.a<com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel> r6) {
                /*
                // Method dump skipped, instructions count: 161
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.creativex.recorder.sticker.b.f.h.a.onChanged(java.lang.Object):void");
            }

            a(CategoryEffectModel categoryEffectModel, h hVar) {
                this.f28420a = categoryEffectModel;
                this.f28421b = hVar;
            }
        }

        h(f fVar, com.ss.android.ugc.aweme.sticker.repository.a.y yVar, com.ss.android.ugc.aweme.sticker.repository.a.w wVar) {
            this.f28417a = fVar;
            this.f28418b = yVar;
            this.f28419c = wVar;
        }
    }

    static final class m<T> implements com.bytedance.als.m<com.bytedance.creativex.recorder.b.a.x> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f28429a;

        static {
            Covode.recordClassIndex(16696);
        }

        m(f fVar) {
            this.f28429a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(com.bytedance.creativex.recorder.b.a.x xVar) {
            List<String> list;
            List<String> list2;
            com.bytedance.creativex.recorder.b.a.x xVar2 = xVar;
            Effect value = this.f28429a.t().n().b().getValue();
            if (xVar2 != null) {
                xVar2.f28215b = value;
                SavePhotoStickerInfo savePhotoStickerInfo = null;
                if (com.ss.android.ugc.aweme.sticker.p.g.k(value)) {
                    list = this.f28429a.z;
                } else {
                    list = null;
                }
                if (com.ss.android.ugc.aweme.sticker.p.g.m(value)) {
                    list2 = this.f28429a.z;
                } else {
                    list2 = null;
                }
                if (com.ss.android.ugc.aweme.sticker.p.g.B(value)) {
                    savePhotoStickerInfo = this.f28429a.f28395d.af();
                }
                xVar2.f28217d = new com.bytedance.creativex.recorder.b.a.s(list, list2, savePhotoStickerInfo);
            }
        }
    }

    static final class n<T> implements com.bytedance.als.m<com.bytedance.creativex.recorder.b.a.x> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f28430a;

        static {
            Covode.recordClassIndex(16697);
        }

        n(f fVar) {
            this.f28430a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(com.bytedance.creativex.recorder.b.a.x xVar) {
            final int size = this.f28430a.f28395d.e().d().size() - 1;
            final Effect value = this.f28430a.t().n().b().getValue();
            if (com.ss.android.ugc.aweme.sticker.p.g.n(value)) {
                this.f28430a.q().f(false);
                this.f28430a.f28395d.D().a(new RecordInvoker.OnARTextContentCallback(this) {
                    /* class com.bytedance.creativex.recorder.sticker.b.f.n.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ n f28431a;

                    static {
                        Covode.recordClassIndex(16698);
                    }

                    {
                        this.f28431a = r1;
                    }

                    @Override // com.ss.android.medialib.RecordInvoker.OnARTextContentCallback
                    public final void onResult(final String[] strArr) {
                        this.f28431a.f28430a.f28400i.f135259g.post(new Runnable(this) {
                            /* class com.bytedance.creativex.recorder.sticker.b.f.n.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f28434a;

                            static {
                                Covode.recordClassIndex(16699);
                            }

                            {
                                this.f28434a = r1;
                            }

                            public final void run() {
                                ArrayList arrayList;
                                int size = this.f28434a.f28431a.f28430a.f28395d.e().d().size() - 1;
                                int i2 = size;
                                if (i2 >= 0 && size >= i2) {
                                    TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) this.f28434a.f28431a.f28430a.f28395d.e().d().get(size);
                                    String[] strArr = strArr;
                                    boolean z = false;
                                    if (strArr == null || strArr.length == 0) {
                                        z = true;
                                    }
                                    ArrayList arrayList2 = null;
                                    if (!z) {
                                        arrayList = new ArrayList(h.a.i.j(strArr));
                                    } else {
                                        arrayList = null;
                                    }
                                    timeSpeedModelExtension.setBubbleText(arrayList);
                                    if (com.ss.android.ugc.aweme.sticker.p.g.k(value)) {
                                        arrayList2 = arrayList;
                                    }
                                    timeSpeedModelExtension.setARText(arrayList2);
                                }
                                this.f28434a.f28431a.f28430a.q().f(true);
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.p
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
        h.f.b.l.d(mVar, "");
        this.f28400i.a(mVar);
    }

    static final class l<T> implements com.bytedance.als.m<com.bytedance.creativex.recorder.b.a.w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f28428a;

        static {
            Covode.recordClassIndex(16695);
        }

        l(f fVar) {
            this.f28428a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(com.bytedance.creativex.recorder.b.a.w wVar) {
            boolean z;
            com.bytedance.creativex.recorder.b.a.w wVar2 = wVar;
            FaceStickerBean i2 = this.f28428a.i();
            h.f.b.l.b(wVar2, "");
            Bundle bundle = wVar2.f28213c;
            bundle.putParcelable("currentSticker", i2);
            if (i2 != null) {
                wVar2.f28213c.putBoolean("is_uploadtype_sticker", g.a(i2));
                if (com.ss.android.ugc.aweme.sticker.p.g.o(com.ss.android.ugc.aweme.sticker.f.e.a(this.f28428a)) || com.ss.android.ugc.aweme.sticker.p.g.m(com.ss.android.ugc.aweme.sticker.f.e.a(this.f28428a))) {
                    z = true;
                } else {
                    z = false;
                }
                wVar2.f28213c.putBoolean("is_texttype_sticker", z);
            }
            List<AVChallenge> a2 = e.a((com.ss.android.ugc.aweme.sticker.presenter.i) this.f28428a.getApiComponent());
            if (a2 != null && !a2.isEmpty()) {
                Collection a3 = e.a((com.ss.android.ugc.aweme.sticker.presenter.i) this.f28428a.getApiComponent());
                if (a3 == null) {
                    a3 = h.a.z.INSTANCE;
                }
                bundle.putParcelableArrayList("currentChallenge", new ArrayList<>(a3));
            }
            f fVar = this.f28428a;
            fVar.f28400i.f135259g.post(new x(fVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r1 == null) goto L_0x003c;
     */
    @Override // com.bytedance.creativex.recorder.sticker.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r6) {
        /*
            r5 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r5.s()
            com.bytedance.creativex.recorder.b.a.d r0 = r5.f28395d
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r0.e()
            java.lang.String r4 = r0.y
            if (r3 == 0) goto L_0x001a
            java.util.List r0 = r3.getTags()
            if (r0 == 0) goto L_0x001a
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x001b
        L_0x001a:
            return
        L_0x001b:
            java.util.List r1 = r3.getTags()
            if (r1 == 0) goto L_0x001a
            java.lang.String r0 = "strong_beat"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x001a
            com.bytedance.creativex.recorder.sticker.b.f$a r0 = r5.f28398g
            h.f.a.b<? super java.lang.String, java.lang.String> r0 = r0.f28407c
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x003c
            h.f.b.l.b(r4, r2)
            java.lang.Object r1 = r0.invoke(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            com.ss.android.ugc.asve.recorder.view.ASCameraView r0 = r5.f28396e
            com.ss.android.ugc.asve.recorder.effect.a r0 = r0.getEffectController()
            r0.d(r1)
            if (r6 == 0) goto L_0x001a
            h.f.b.l.d(r5, r2)
            com.bytedance.creativex.recorder.sticker.b.e$b r0 = com.bytedance.creativex.recorder.sticker.b.e.b.INSTANCE
            com.ss.android.ugc.aweme.sticker.presenter.handler.m r1 = r5.a(r0)
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.l
            if (r0 != 0) goto L_0x0056
            r1 = 0
        L_0x0056:
            com.ss.android.ugc.aweme.sticker.presenter.handler.l r1 = (com.ss.android.ugc.aweme.sticker.presenter.handler.l) r1
            if (r1 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.sticker.panel.guide.i r0 = r1.f135401a
            r0.a(r3)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.creativex.recorder.sticker.b.f.a(boolean):void");
    }

    public void a(FrameLayout frameLayout, r.b bVar) {
        h.f.b.l.d(frameLayout, "");
        h.f.b.l.d(bVar, "");
        a(this.E);
        com.ss.android.ugc.aweme.sticker.panel.guide.j jVar = (com.ss.android.ugc.aweme.sticker.panel.guide.j) getDiContainer().c(com.ss.android.ugc.aweme.sticker.panel.guide.j.class);
        if (jVar != null) {
            com.ss.android.ugc.aweme.sticker.panel.guide.i a2 = jVar.a(frameLayout);
            a2.a(this);
            a(new com.ss.android.ugc.aweme.sticker.presenter.handler.l(a2));
            this.f28404m = new com.ss.android.ugc.aweme.sticker.presenter.handler.n(this.f28393b, t(), a2, new e(this, frameLayout));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar, boolean z2) {
        h.f.b.l.d(mVar, "");
        this.f28400i.a(mVar, z2);
    }

    public f(com.bytedance.o.f fVar, h.f.a.b<? super a, z> bVar) {
        h.f.b.l.d(fVar, "");
        this.F = fVar;
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) getDiContainer().a(androidx.appcompat.app.d.class, (String) null);
        this.f28393b = dVar;
        com.ss.android.ugc.aweme.sticker.m.h hVar = (com.ss.android.ugc.aweme.sticker.m.h) getDiContainer().c(com.ss.android.ugc.aweme.sticker.m.h.class);
        this.f28394c = hVar == null ? com.ss.android.ugc.aweme.sticker.m.e.f134963a : hVar;
        com.bytedance.creativex.recorder.b.a.d dVar2 = (com.bytedance.creativex.recorder.b.a.d) getDiContainer().a(com.bytedance.creativex.recorder.b.a.d.class, (String) null);
        this.f28395d = dVar2;
        this.A = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.m.class);
        ASCameraView D2 = dVar2.D();
        this.f28396e = D2;
        this.f28397f = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.tools.b.a.d.class);
        a aVar = new a();
        this.f28398g = aVar;
        if (bVar != null) {
            bVar.invoke(aVar);
        }
        this.f28399h = new f.a.b.a();
        this.f28400i = new g(this, dVar, aVar.f28408d);
        this.f28401j = dVar2.j();
        this.f28402k = new b(aVar.f28412h, aVar.f28413i, new r(this));
        this.f28403l = new c(D2.getCameraController());
        this.B = h.i.a(h.m.SYNCHRONIZED, new s(this));
        this.C = h.i.a(h.m.NONE, new w(this));
        this.D = h.i.a((h.f.a.a) new u(this));
        this.E = new t(this);
        this.n = new v(this);
        this.o = new com.bytedance.als.k<>();
        this.p = new com.bytedance.als.k<>();
        this.q = new com.bytedance.als.k<>();
        this.r = new com.bytedance.als.k<>();
        this.s = new d();
        this.t = new com.bytedance.als.k<>();
        this.u = new com.bytedance.als.k<>();
        this.v = new com.bytedance.als.k<>();
        this.w = new com.bytedance.als.k<>();
        this.x = new com.bytedance.als.k<>();
        f.a.l.c<h.p<Effect, a>> cVar = new f.a.l.c<>();
        h.f.b.l.b(cVar, "");
        this.y = cVar;
    }

    @Override // com.bytedance.creativex.recorder.sticker.a.a
    public void a(r.b bVar, FrameLayout frameLayout) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(frameLayout, "");
        a(frameLayout, bVar);
        g gVar = this.f28400i;
        for (T t2 : gVar.f135256d) {
            com.ss.android.ugc.aweme.sticker.panel.i iVar = gVar.f135258f;
            if (iVar != null) {
                iVar.a((com.ss.android.ugc.aweme.sticker.panel.c) t2);
            }
        }
        com.ss.android.ugc.aweme.sticker.presenter.o t3 = t();
        h.f.b.l.d(t3, "");
        q.a a2 = t3.c().g().a();
        if (this.f28395d.e().f124714i) {
            a2.a(com.ss.android.ugc.aweme.sticker.repository.d.a.i.f135498a);
        }
        a(a2);
        a2.a();
        a(t(), u());
        this.f28400i.c();
        GameDuetResource gameDuetResource = r().v;
        if (!(gameDuetResource == null || gameDuetResource.gameSticker == null || com.ss.android.ugc.aweme.shortvideo.sticker.c.e(gameDuetResource.gameSticker))) {
            com.ss.android.ugc.aweme.sticker.f.e.a(this, gameDuetResource.gameSticker);
        }
        this.w.a((z) null);
    }

    static final class v implements MessageCenter.Listener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f28439a;

        static {
            Covode.recordClassIndex(16708);
        }

        v(f fVar) {
            this.f28439a = fVar;
        }

        @Override // com.bef.effectsdk.message.MessageCenter.Listener
        public final void onMessageReceived(int i2, int i3, int i4, String str) {
            f fVar = this.f28439a;
            Iterator<T> it = fVar.f28400i.f135257e.iterator();
            while (it.hasNext()) {
                it.next().a(i2, i3, i4, str);
            }
            fVar.y.onNext(h.v.a(fVar.s(), new a(i2, i3, i4, str)));
        }
    }
}
