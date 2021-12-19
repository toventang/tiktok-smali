package com.bytedance.creativex.recorder.a;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.w;
import com.bytedance.creativex.recorder.b.a.x;
import com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo;
import com.ss.android.ugc.aweme.dependence.beauty.a;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.g.m;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import com.ss.android.ugc.aweme.tools.beauty.service.a;
import com.ss.android.ugc.aweme.tools.beauty.service.c;
import com.ss.android.ugc.aweme.utils.hx;
import com.ss.android.ugc.tools.view.widget.j;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.z;
import java.io.Serializable;
import java.util.List;

public final class i extends com.bytedance.als.j<com.bytedance.creativex.recorder.a.a.a> implements com.bytedance.creativex.recorder.a.a.a, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f28086a = {new y(i.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(i.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(i.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new y(i.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0)};

    /* renamed from: m  reason: collision with root package name */
    public static final a f28087m = new a((byte) 0);
    private final h.f.a.a<com.ss.android.ugc.tools.b.a.d> A;
    private final h.f.a.a<z> B;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.a.a.a f28088b;

    /* renamed from: c  reason: collision with root package name */
    final h.h.d f28089c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.beauty.service.a f28090d;

    /* renamed from: e  reason: collision with root package name */
    public final b f28091e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f28092f;

    /* renamed from: g  reason: collision with root package name */
    int f28093g;

    /* renamed from: h  reason: collision with root package name */
    boolean f28094h;

    /* renamed from: i  reason: collision with root package name */
    public final com.bytedance.als.k<com.bytedance.creativex.recorder.a.a.b> f28095i;

    /* renamed from: j  reason: collision with root package name */
    public final h.f.a.b<Boolean, String> f28096j;

    /* renamed from: k  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.a.a.f f28097k;

    /* renamed from: l  reason: collision with root package name */
    public final com.ss.android.ugc.tools.utils.j f28098l;
    private final h.h.d n;
    private final h.h.d o;
    private final h.h.d p;
    private boolean q;
    private a r;
    private com.ss.android.ugc.aweme.tools.beauty.service.d s;
    private final com.ss.android.ugc.aweme.tools.beauty.g.n<BeautyComposerInfo> t;
    private final t<Boolean> u;
    private boolean v;
    private String w;
    private int x;
    private final com.bytedance.o.f y;
    private final boolean z = true;

    static {
        Covode.recordClassIndex(16448);
    }

    private final com.bytedance.creativex.recorder.b.a.m p() {
        return (com.bytedance.creativex.recorder.b.a.m) this.o.a(this, f28086a[1]);
    }

    public final com.bytedance.creativex.recorder.b.a.d a() {
        return (com.bytedance.creativex.recorder.b.a.d) this.n.a(this, f28086a[0]);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(16449);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ com.bytedance.creativex.recorder.a.a.a getApiComponent() {
        return this.f28088b;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.y;
    }

    @Override // com.bytedance.creativex.recorder.a.a.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.g h() {
        return this.f28095i;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public h.f.a.a<Integer> f28099a = c.f28114a;

        /* renamed from: b  reason: collision with root package name */
        public h.f.a.a<String> f28100b = k.f28122a;

        /* renamed from: c  reason: collision with root package name */
        public h.f.a.a<String> f28101c = C0596i.f28120a;

        /* renamed from: d  reason: collision with root package name */
        public h.f.a.a<Boolean> f28102d = h.f28119a;

        /* renamed from: e  reason: collision with root package name */
        public h.f.a.a<Boolean> f28103e = d.f28115a;

        /* renamed from: f  reason: collision with root package name */
        public h.f.a.a<Integer> f28104f = a.f28112a;

        /* renamed from: g  reason: collision with root package name */
        public h.f.a.a<Integer> f28105g = f.f28117a;

        /* renamed from: h  reason: collision with root package name */
        public h.f.a.a<Boolean> f28106h = e.f28116a;

        /* renamed from: i  reason: collision with root package name */
        public h.f.a.a<Boolean> f28107i = o.f28126a;

        /* renamed from: j  reason: collision with root package name */
        public h.f.a.a<Boolean> f28108j = C0595b.f28113a;

        /* renamed from: k  reason: collision with root package name */
        public h.f.a.a<Boolean> f28109k = m.f28124a;

        /* renamed from: l  reason: collision with root package name */
        public h.f.a.a<Float> f28110l = j.f28121a;

        /* renamed from: m  reason: collision with root package name */
        public h.f.a.a<Float> f28111m = l.f28123a;
        public h.f.a.b<? super BeautyMetadata, ? extends Serializable> n;
        public h.f.a.a<Float> o = g.f28118a;
        public boolean p;
        public h.f.a.m<? super Context, ? super String, z> q;
        public h.f.a.a<Boolean> r = n.f28125a;
        public boolean s;
        public boolean t = true;
        public com.ss.android.ugc.aweme.tools.beauty.service.e u = new com.ss.android.ugc.aweme.tools.beauty.g.k("");
        public boolean v;

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$i  reason: collision with other inner class name */
        static final class C0596i extends h.f.b.m implements h.f.a.a<String> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0596i f28120a = new C0596i();

            static {
                Covode.recordClassIndex(16459);
            }

            C0596i() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ String invoke() {
                return "";
            }
        }

        static final class k extends h.f.b.m implements h.f.a.a<String> {

            /* renamed from: a  reason: collision with root package name */
            public static final k f28122a = new k();

            static {
                Covode.recordClassIndex(16461);
            }

            k() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ String invoke() {
                return "";
            }
        }

        static {
            Covode.recordClassIndex(16450);
        }

        static final class a extends h.f.b.m implements h.f.a.a<Integer> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f28112a = new a();

            static {
                Covode.recordClassIndex(16451);
            }

            a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                return 0;
            }
        }

        /* renamed from: com.bytedance.creativex.recorder.a.i$b$b  reason: collision with other inner class name */
        static final class C0595b extends h.f.b.m implements h.f.a.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0595b f28113a = new C0595b();

            static {
                Covode.recordClassIndex(16452);
            }

            C0595b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }

        static final class c extends h.f.b.m implements h.f.a.a<Integer> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f28114a = new c();

            static {
                Covode.recordClassIndex(16453);
            }

            c() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                return 0;
            }
        }

        static final class d extends h.f.b.m implements h.f.a.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f28115a = new d();

            static {
                Covode.recordClassIndex(16454);
            }

            d() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }

        static final class e extends h.f.b.m implements h.f.a.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final e f28116a = new e();

            static {
                Covode.recordClassIndex(16455);
            }

            e() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                return true;
            }
        }

        static final class f extends h.f.b.m implements h.f.a.a<Integer> {

            /* renamed from: a  reason: collision with root package name */
            public static final f f28117a = new f();

            static {
                Covode.recordClassIndex(16456);
            }

            f() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                return 0;
            }
        }

        static final class g extends h.f.b.m implements h.f.a.a<Float> {

            /* renamed from: a  reason: collision with root package name */
            public static final g f28118a = new g();

            static {
                Covode.recordClassIndex(16457);
            }

            g() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Float invoke() {
                return Float.valueOf(0.8f);
            }
        }

        static final class h extends h.f.b.m implements h.f.a.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final h f28119a = new h();

            static {
                Covode.recordClassIndex(16458);
            }

            h() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }

        static final class j extends h.f.b.m implements h.f.a.a<Float> {

            /* renamed from: a  reason: collision with root package name */
            public static final j f28121a = new j();

            static {
                Covode.recordClassIndex(16460);
            }

            j() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Float invoke() {
                return Float.valueOf(0.6f);
            }
        }

        static final class l extends h.f.b.m implements h.f.a.a<Float> {

            /* renamed from: a  reason: collision with root package name */
            public static final l f28123a = new l();

            static {
                Covode.recordClassIndex(16462);
            }

            l() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Float invoke() {
                return Float.valueOf(0.8f);
            }
        }

        static final class m extends h.f.b.m implements h.f.a.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final m f28124a = new m();

            static {
                Covode.recordClassIndex(16463);
            }

            m() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                return true;
            }
        }

        static final class n extends h.f.b.m implements h.f.a.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final n f28125a = new n();

            static {
                Covode.recordClassIndex(16464);
            }

            n() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }

        static final class o extends h.f.b.m implements h.f.a.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final o f28126a = new o();

            static {
                Covode.recordClassIndex(16465);
            }

            o() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                return false;
            }
        }

        public final void a(h.f.a.a<Boolean> aVar) {
            h.f.b.l.d(aVar, "");
            this.f28103e = aVar;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(16468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            i.a(this.this$0).a(this.this$0.f28096j.invoke(this.this$0.f28091e.f28106h.invoke()), new c());
        }
    }

    @Override // com.bytedance.creativex.recorder.a.a.a
    public final boolean d() {
        return this.f28091e.p;
    }

    @Override // com.bytedance.creativex.recorder.a.a.a
    public final boolean e() {
        return this.f28091e.v;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: h.f.a.m<? super android.content.Context, ? super java.lang.String, h.z>, h.f.a.m<android.content.Context, java.lang.String, h.z> */
    @Override // com.bytedance.creativex.recorder.a.a.a
    public final h.f.a.m<Context, String, z> f() {
        return this.f28091e.q;
    }

    @Override // com.bytedance.creativex.recorder.a.a.a
    public final void c() {
        this.u.setValue(true);
    }

    @Override // com.bytedance.creativex.recorder.a.a.a
    public final com.ss.android.ugc.aweme.tools.beauty.g.m i() {
        com.ss.android.ugc.aweme.tools.beauty.service.a aVar = this.f28090d;
        if (aVar == null) {
            h.f.b.l.a("beautyManager");
        }
        return aVar.f139145c;
    }

    @Override // com.bytedance.creativex.recorder.a.a.a
    public final void j() {
        com.ss.android.ugc.aweme.tools.beauty.service.a aVar = this.f28090d;
        if (aVar == null) {
            h.f.b.l.a("beautyManager");
        }
        aVar.c();
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final int k() {
        com.ss.android.ugc.aweme.tools.beauty.service.d dVar = this.s;
        if (dVar == null) {
            h.f.b.l.a("beautyModule");
        }
        return dVar.k();
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final int l() {
        com.ss.android.ugc.aweme.tools.beauty.service.d dVar = this.s;
        if (dVar == null) {
            h.f.b.l.a("beautyModule");
        }
        return dVar.l();
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final int m() {
        com.ss.android.ugc.aweme.tools.beauty.service.d dVar = this.s;
        if (dVar == null) {
            h.f.b.l.a("beautyModule");
        }
        return dVar.m();
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final int n() {
        com.ss.android.ugc.aweme.tools.beauty.service.d dVar = this.s;
        if (dVar == null) {
            h.f.b.l.a("beautyModule");
        }
        return dVar.n();
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void o() {
        com.ss.android.ugc.aweme.tools.beauty.service.d dVar = this.s;
        if (dVar == null) {
            h.f.b.l.a("beautyModule");
        }
        dVar.o();
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.tools.beauty.a $gender;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(16480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(i iVar, com.ss.android.ugc.aweme.tools.beauty.a aVar) {
            super(0);
            this.this$0 = iVar;
            this.$gender = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            i iVar = this.this$0;
            com.ss.android.ugc.aweme.tools.beauty.a aVar = this.$gender;
            h.f.b.l.d(aVar, "");
            com.ss.android.ugc.aweme.tools.beauty.service.a aVar2 = iVar.f28090d;
            if (aVar2 == null) {
                h.f.b.l.a("beautyManager");
            }
            aVar2.a(true, aVar);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.als.j
    public final void onDestroy() {
        com.ss.android.ugc.aweme.dependence.beauty.a.c("detachBeautyManager");
        com.ss.android.ugc.aweme.tools.beauty.g.a.f138938c = null;
        com.ss.android.ugc.aweme.dependence.beauty.a.f79579a = null;
        com.ss.android.ugc.aweme.tools.beauty.service.a aVar = this.f28090d;
        if (aVar == null) {
            h.f.b.l.a("beautyManager");
        }
        aVar.f139145c.t();
        super.onDestroy();
    }

    public final void b() {
        Boolean a2 = a().j().a();
        Boolean value = this.u.getValue();
        if (a2 != null && a2.booleanValue() && value != null && value.booleanValue()) {
            a aVar = this.r;
            if (aVar == null) {
                h.f.b.l.a("beautyPresenter");
            }
            aVar.a(this);
        }
    }

    public final BeautyMetadata g() {
        if (!this.f28091e.f28102d.invoke().booleanValue() || (this.x != 0 && (this.f28091e.p || this.x != -1))) {
            a aVar = this.r;
            if (aVar == null) {
                h.f.b.l.a("beautyPresenter");
            }
            BeautyMetadata a2 = aVar.a();
            h.f.b.l.b(a2, "");
            return a2;
        }
        a aVar2 = this.r;
        if (aVar2 == null) {
            h.f.b.l.a("beautyPresenter");
        }
        BeautyMetadata a3 = aVar2.a();
        a3.setBeautyId("");
        a3.setBeautyName("");
        a3.setBeautyRes("");
        a3.setBeautyStrength("");
        a3.setBeautyValid("");
        h.f.b.l.b(a3, "");
        return a3;
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        com.bytedance.als.h<FilterBean> curSelectedFilter;
        com.bytedance.als.g<com.bytedance.creativex.recorder.filter.a.i> filterUpdateEvent;
        String str;
        super.onCreate();
        com.ss.android.ugc.aweme.dependence.beauty.a.f79579a = new d(this);
        h.f.a.a<z> aVar = this.B;
        if (aVar != null) {
            aVar.invoke();
        }
        BeautyFilterConfig beautyFilterConfig = new BeautyFilterConfig(this.f28091e.f28104f.invoke().intValue(), "", this.f28091e.f28106h.invoke().booleanValue());
        beautyFilterConfig.setPrimaryBeautyPanelEnable(this.f28091e.v);
        beautyFilterConfig.setULike2ComposerTagValueConvert(true);
        beautyFilterConfig.setConvertKey(true);
        beautyFilterConfig.setItemShape(this.f28091e.f28105g.invoke().intValue());
        boolean booleanValue = this.f28091e.f28102d.invoke().booleanValue();
        com.ss.android.ugc.aweme.tools.beauty.b.a.b bVar = new com.ss.android.ugc.aweme.tools.beauty.b.a.b();
        bVar.f138839a = new com.ss.android.ugc.aweme.tools.beauty.g.j(com.bytedance.als.dsl.g.c(this), this.f28091e.f28104f.invoke().intValue(), this.f28091e.f28100b.invoke(), this.f28091e.f28101c.invoke(), booleanValue).f138991a;
        beautyFilterConfig.setDataConfig(bVar);
        com.ss.android.ugc.aweme.tools.beauty.service.e eVar = this.f28091e.u;
        if (!this.f28091e.f28103e.invoke().booleanValue()) {
            eVar.a(true);
        }
        h.f.a.a<com.ss.android.ugc.tools.b.a.d> aVar2 = this.A;
        h.f.b.l.d("record", "");
        h.f.b.l.d(beautyFilterConfig, "");
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(aVar2, "");
        a.C3675a aVar3 = new a.C3675a();
        h.f.b.l.d("record", "");
        aVar3.f139149b = "record";
        h.f.b.l.d(beautyFilterConfig, "");
        aVar3.f139150c = beautyFilterConfig;
        h.f.b.l.d(eVar, "");
        aVar3.f139148a = eVar;
        h.f.b.l.d(aVar2, "");
        aVar3.f139152e = aVar2;
        com.google.gson.f a2 = com.ss.android.ugc.aweme.tools.beauty.h.b.a();
        h.f.b.l.d(a2, "");
        aVar3.f139151d = a2;
        m.b bVar2 = beautyFilterConfig.getDataConfig().f138840b;
        if (bVar2 != null) {
            h.f.b.l.d(bVar2, "");
            aVar3.f139153f = bVar2;
        }
        com.ss.android.ugc.aweme.tools.beauty.service.e eVar2 = aVar3.f139148a;
        if (eVar2 == null) {
            if (h.f.b.l.a((Object) aVar3.f139149b, (Object) "record")) {
                str = "";
            } else {
                str = aVar3.f139149b;
            }
            eVar2 = new com.ss.android.ugc.aweme.tools.beauty.g.k(str);
            aVar3.f139148a = eVar2;
        }
        BeautyFilterConfig beautyFilterConfig2 = aVar3.f139150c;
        if (beautyFilterConfig2 != null) {
            com.google.gson.f fVar = aVar3.f139151d;
            if (fVar != null) {
                h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> aVar4 = aVar3.f139152e;
                if (aVar4 != null) {
                    h.f.b.l.d(eVar2, "");
                    h.f.b.l.d(beautyFilterConfig2, "");
                    h.f.b.l.d(fVar, "");
                    h.f.b.l.d(aVar4, "");
                    com.ss.android.ugc.aweme.tools.beauty.g.h hVar = new com.ss.android.ugc.aweme.tools.beauty.g.h(eVar2, beautyFilterConfig2, fVar, aVar4);
                    hVar.a(aVar3.f139153f);
                    this.f28090d = new com.ss.android.ugc.aweme.tools.beauty.service.a(aVar3.f139149b, hVar, eVar2);
                    new e(this).a();
                    com.ss.android.ugc.asve.recorder.effect.a z2 = a().z();
                    h.f.b.l.d(z2, "");
                    j jVar = new j(z2);
                    com.bytedance.creativex.recorder.filter.a.a aVar5 = (com.bytedance.creativex.recorder.filter.a.a) this.p.a(this, f28086a[2]);
                    com.ss.android.ugc.aweme.tools.beauty.service.a aVar6 = this.f28090d;
                    if (aVar6 == null) {
                        h.f.b.l.a("beautyManager");
                    }
                    com.ss.android.ugc.tools.utils.j jVar2 = this.f28098l;
                    boolean z3 = this.f28091e.s;
                    h.f.b.l.d(jVar, "");
                    h.f.b.l.d(aVar6, "");
                    l lVar = new l(jVar, aVar5, aVar6, jVar2, z3);
                    this.r = lVar;
                    com.ss.android.ugc.aweme.tools.beauty.service.d dVar = lVar.f28051a;
                    h.f.b.l.b(dVar, "");
                    this.s = dVar;
                    com.ss.android.ugc.aweme.tools.beauty.service.a aVar7 = this.f28090d;
                    if (aVar7 == null) {
                        h.f.b.l.a("beautyManager");
                    }
                    h.f.b.l.d(aVar7, "");
                    com.ss.android.ugc.aweme.dependence.beauty.a.c("attachBeautyManager");
                    com.ss.android.ugc.aweme.tools.beauty.g.a.f138938c = aVar7;
                    a().j().a(this, new f(this));
                    this.u.observe(this, new g(this));
                    if (this.f28091e.r.invoke().booleanValue()) {
                        a().j().a(this, new h(this));
                    }
                    a().l().a(this, new C0597i(this));
                    p().l().a(this, new j(this));
                    a().ah().a(this, new k(this));
                    p().i().a(this, new l(this));
                    com.bytedance.creativex.recorder.filter.a.a aVar8 = (com.bytedance.creativex.recorder.filter.a.a) getDiContainer().c(com.bytedance.creativex.recorder.filter.a.a.class);
                    if (!(aVar8 == null || (filterUpdateEvent = aVar8.getFilterUpdateEvent()) == null)) {
                        filterUpdateEvent.a(this, new m(this));
                    }
                    com.bytedance.creativex.recorder.filter.a.a aVar9 = (com.bytedance.creativex.recorder.filter.a.a) getDiContainer().c(com.bytedance.creativex.recorder.filter.a.a.class);
                    if (aVar9 != null && (curSelectedFilter = aVar9.getCurSelectedFilter()) != null) {
                        curSelectedFilter.a(this, new n(this));
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("effectPlatformProvider must be set".toString());
            }
            throw new IllegalStateException("gson must be set".toString());
        }
        throw new IllegalStateException("beautyFilterConfig must be set".toString());
    }

    /* access modifiers changed from: package-private */
    public final class c implements c.a {
        static {
            Covode.recordClassIndex(16466);
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.service.c.a
        public final void a(Exception exc) {
            h.f.b.l.d(exc, "");
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.service.c.a
        public final void a(List<BeautyCategory> list) {
            h.f.b.l.d(list, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c() {
        }
    }

    public static final class d implements a.AbstractC1855a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f28128a;

        static {
            Covode.recordClassIndex(16467);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(i iVar) {
            this.f28128a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.dependence.beauty.a.AbstractC1855a
        public final void a(String str, String str2) {
            this.f28128a.f28098l.a(str + ':' + str2);
        }

        @Override // com.ss.android.ugc.aweme.dependence.beauty.a.AbstractC1855a
        public final void b(String str, String str2) {
            this.f28128a.f28098l.b(str + ':' + str2);
        }

        @Override // com.ss.android.ugc.aweme.dependence.beauty.a.AbstractC1855a
        public final void c(String str, String str2) {
            this.f28128a.f28098l.c(str + ':' + str2);
        }

        @Override // com.ss.android.ugc.aweme.dependence.beauty.a.AbstractC1855a
        public final void d(String str, String str2) {
            this.f28128a.f28098l.d(str + ':' + str2);
        }

        @Override // com.ss.android.ugc.aweme.dependence.beauty.a.AbstractC1855a
        public final void a(String str, Throwable th) {
            this.f28128a.f28098l.b(str + ':' + th);
        }
    }

    static final class g<T> implements u<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f28130a;

        static {
            Covode.recordClassIndex(16470);
        }

        g(i iVar) {
            this.f28130a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Boolean bool) {
            this.f28130a.b();
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.i$i  reason: collision with other inner class name */
    static final class C0597i<T> implements com.bytedance.als.m<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f28133a;

        static {
            Covode.recordClassIndex(16473);
        }

        C0597i(i iVar) {
            this.f28133a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Integer num) {
            this.f28133a.j();
        }
    }

    @Override // com.bytedance.creativex.recorder.a.a.a
    public final void a(boolean z2) {
        this.q = true;
        c(z2);
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.tools.beauty.service.a a(i iVar) {
        com.ss.android.ugc.aweme.tools.beauty.service.a aVar = iVar.f28090d;
        if (aVar == null) {
            h.f.b.l.a("beautyManager");
        }
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void e(boolean z2) {
        com.ss.android.ugc.aweme.tools.beauty.service.d dVar = this.s;
        if (dVar == null) {
            h.f.b.l.a("beautyModule");
        }
        dVar.e(z2);
    }

    static final class f<T> implements com.bytedance.als.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f28129a;

        static {
            Covode.recordClassIndex(16469);
        }

        f(i iVar) {
            this.f28129a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Boolean bool) {
            if (!h.f.b.l.a((Object) bool, (Object) false)) {
                this.f28129a.b();
            }
        }
    }

    public final void f(boolean z2) {
        if (this.v != z2) {
            this.v = z2;
            int i2 = this.x;
            if (i2 != -1) {
                boolean z3 = true;
                if (i2 != 1) {
                    z3 = false;
                }
                c(z3);
            }
        }
    }

    static final class k<T> implements com.bytedance.als.m<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f28135a;

        static {
            Covode.recordClassIndex(16475);
        }

        k(i iVar) {
            this.f28135a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(z zVar) {
            com.ss.android.ugc.aweme.tools.beauty.service.a aVar = this.f28135a.f28090d;
            if (aVar == null) {
                h.f.b.l.a("beautyManager");
            }
            if (aVar.f139143a && aVar.f139146d.c() < 3) {
                this.f28135a.a().D().getEffectController().a(new com.ss.android.ugc.asve.wrap.c(this) {
                    /* class com.bytedance.creativex.recorder.a.i.k.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ k f28136a;

                    static {
                        Covode.recordClassIndex(16476);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f28136a = r1;
                    }

                    @Override // com.ss.android.ugc.asve.wrap.c
                    public final void a(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
                        Float invoke;
                        if (aSSimpleFaceInfoArr != null) {
                            i iVar = this.f28136a.f28135a;
                            if (!iVar.f28094h) {
                                if (aSSimpleFaceInfoArr.length == 0) {
                                    iVar.f28093g = 0;
                                } else {
                                    iVar.f28093g++;
                                    if (iVar.f28093g == 6) {
                                        int length = aSSimpleFaceInfoArr.length;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= length) {
                                                iVar.a(com.ss.android.ugc.aweme.tools.beauty.a.MALE);
                                                iVar.f28094h = true;
                                                break;
                                            }
                                            ASSimpleFaceInfo aSSimpleFaceInfo = aSSimpleFaceInfoArr[i2];
                                            if (!(aSSimpleFaceInfo == null || (invoke = iVar.f28091e.o.invoke()) == null || aSSimpleFaceInfo.f62386a > invoke.floatValue())) {
                                                iVar.a(com.ss.android.ugc.aweme.tools.beauty.a.FEMALE);
                                                iVar.f28094h = true;
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                }
                            }
                            Float invoke2 = this.f28136a.f28135a.f28091e.o.invoke();
                            for (ASSimpleFaceInfo aSSimpleFaceInfo2 : aSSimpleFaceInfoArr) {
                                if (aSSimpleFaceInfo2 != null && invoke2 != null && aSSimpleFaceInfo2.f62386a > invoke2.floatValue()) {
                                    this.f28136a.f28135a.f(true);
                                    return;
                                }
                            }
                            this.f28136a.f28135a.f(false);
                        }
                    }
                });
            }
        }
    }

    static final class l<T> implements com.bytedance.als.m<w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f28137a;

        static {
            Covode.recordClassIndex(16477);
        }

        l(i iVar) {
            this.f28137a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(w wVar) {
            Serializable serializable;
            w wVar2 = wVar;
            h.f.b.l.b(wVar2, "");
            Bundle bundle = wVar2.f28213c;
            h.f.a.b<? super BeautyMetadata, ? extends Serializable> bVar = this.f28137a.f28091e.n;
            if (bVar == null || (serializable = (Serializable) bVar.invoke(this.f28137a.g())) == null) {
                serializable = this.f28137a.g();
            }
            bundle.putSerializable("beautyMetadata", serializable);
        }
    }

    static final class m<T> implements com.bytedance.als.m<com.bytedance.creativex.recorder.filter.a.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f28138a;

        static {
            Covode.recordClassIndex(16478);
        }

        m(i iVar) {
            this.f28138a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(com.bytedance.creativex.recorder.filter.a.i iVar) {
            float f2;
            com.bytedance.creativex.recorder.filter.a.i iVar2 = iVar;
            if (com.bytedance.creativex.recorder.filter.a.f.a(iVar2.f28234b)) {
                if (com.ss.android.ugc.aweme.filter.repository.a.a.c.a(iVar2.f28234b.f28227b.f(), iVar2.f28233a) == 0) {
                    f2 = 0.35f;
                } else {
                    f2 = 0.0f;
                }
                this.f28138a.a().b(f2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(com.ss.android.ugc.aweme.tools.beauty.a aVar) {
        hx.a(0, new o(this, aVar));
    }

    @Override // com.bytedance.creativex.recorder.a.a.a
    public final void c(boolean z2) {
        a().e().B = z2;
        i().a(z2);
        this.x = z2 ? 1 : 0;
        a aVar = this.r;
        if (aVar == null) {
            h.f.b.l.a("beautyPresenter");
        }
        aVar.a(false);
    }

    @Override // com.bytedance.creativex.recorder.a.a.a
    public final void d(boolean z2) {
        int i2;
        Object a2 = getDiContainer().a(androidx.fragment.app.e.class);
        h.f.b.l.b(a2, "");
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) a2;
        if (this.f28091e.t) {
            if (z2) {
                i2 = R.string.a47;
            } else {
                i2 = R.string.a41;
            }
            j.a.b(eVar, i2, 0).a();
        }
        if (z2) {
            c(true);
        } else {
            c(false);
        }
        this.f28095i.a(new com.bytedance.creativex.recorder.a.a.d(z2));
    }

    static final class h<T> implements com.bytedance.als.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f28131a;

        static {
            Covode.recordClassIndex(16471);
        }

        h(i iVar) {
            this.f28131a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Boolean bool) {
            if (h.f.b.l.a((Object) bool, (Object) false)) {
                this.f28131a.a().D().getEffectController().f();
                this.f28131a.f28092f = false;
                return;
            }
            this.f28131a.a().D().getEffectController().e();
            this.f28131a.a().D().getEffectController().a(new com.ss.android.ugc.asve.wrap.c(this) {
                /* class com.bytedance.creativex.recorder.a.i.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f28132a;

                static {
                    Covode.recordClassIndex(16472);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f28132a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.h.d */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
                /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
                @Override // com.ss.android.ugc.asve.wrap.c
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo[] r5) {
                    /*
                        r4 = this;
                        if (r5 != 0) goto L_0x004c
                        com.bytedance.creativex.recorder.a.i$h r0 = r4.f28132a
                        com.bytedance.creativex.recorder.a.i r0 = r0.f28131a
                        com.bytedance.creativex.recorder.b.a.d r0 = r0.a()
                        boolean r0 = r0.O()
                        if (r0 != 0) goto L_0x004c
                        com.bytedance.creativex.recorder.a.i$h r0 = r4.f28132a
                        com.bytedance.creativex.recorder.a.i r3 = r0.f28131a
                        h.h.d r2 = r3.f28089c
                        h.k.i[] r1 = com.bytedance.creativex.recorder.a.i.f28086a
                        r0 = 3
                        r0 = r1[r0]
                        java.lang.Object r0 = r2.a(r3, r0)
                        com.bytedance.creativex.recorder.sticker.a.a r0 = (com.bytedance.creativex.recorder.sticker.a.a) r0
                        if (r0 == 0) goto L_0x0029
                        com.ss.android.ugc.effectmanager.effect.model.Effect r0 = com.ss.android.ugc.aweme.sticker.f.e.a(r0)
                        if (r0 != 0) goto L_0x004c
                    L_0x0029:
                        r1 = 1
                    L_0x002a:
                        com.bytedance.creativex.recorder.a.i$h r0 = r4.f28132a
                        com.bytedance.creativex.recorder.a.i r0 = r0.f28131a
                        boolean r0 = r0.f28092f
                        if (r0 == r1) goto L_0x004b
                        com.bytedance.creativex.recorder.a.i$h r0 = r4.f28132a
                        com.bytedance.creativex.recorder.a.i r0 = r0.f28131a
                        r0.f28092f = r1
                        com.bytedance.creativex.recorder.a.i$h r0 = r4.f28132a
                        com.bytedance.creativex.recorder.a.i r0 = r0.f28131a
                        com.bytedance.creativex.recorder.b.a.d r0 = r0.a()
                        com.ss.android.ugc.asve.recorder.VERecorderImpl r0 = r0.E()
                        com.ss.android.vesdk.ax r0 = r0.j()
                        r0.q(r1)
                    L_0x004b:
                        return
                    L_0x004c:
                        r1 = 0
                        goto L_0x002a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.creativex.recorder.a.i.h.AnonymousClass1.a(com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo[]):void");
                }
            });
        }
    }

    static final class n<T> implements com.bytedance.als.m<FilterBean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f28139a;

        static {
            Covode.recordClassIndex(16479);
        }

        n(i iVar) {
            this.f28139a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(FilterBean filterBean) {
            FilterBean filterBean2 = filterBean;
            if (filterBean2 == null) {
                return;
            }
            if (filterBean2.isSaveFilter2BeautySequence()) {
                this.f28139a.i().d().add(new BeautyComposerInfo("EFFECT_ID_TYPE_FILTER", "", ""));
                i iVar = this.f28139a;
                com.ss.android.ugc.aweme.tools.beauty.b bVar = new com.ss.android.ugc.aweme.tools.beauty.b("EFFECT_ID_TYPE_FILTER", 2);
                h.f.b.l.d(bVar, "");
                com.ss.android.ugc.aweme.tools.beauty.service.a aVar = iVar.f28090d;
                if (aVar == null) {
                    h.f.b.l.a("beautyManager");
                }
                h.f.b.l.d(bVar, "");
                aVar.f139145c.a(bVar);
                return;
            }
            filterBean2.setSaveFilter2BeautySequence(true);
        }
    }

    @Override // com.bytedance.creativex.recorder.a.a.a
    public final void a(String str) {
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.tools.beauty.service.a aVar = this.f28090d;
        if (aVar == null) {
            h.f.b.l.a("beautyManager");
        }
        h.f.b.l.d(str, "");
        aVar.f139144b = str;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void b(boolean z2) {
        if (z2) {
            a(f.a(i().d()), 10000);
        } else {
            a(this.t, 10000);
        }
    }

    static final class j<T> implements com.bytedance.als.m<x> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f28134a;

        static {
            Covode.recordClassIndex(16474);
        }

        j(i iVar) {
            this.f28134a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(x xVar) {
            x xVar2 = xVar;
            h.f.b.l.b(xVar2, "");
            if (xVar2.f28214a == 1) {
                return;
            }
            if (this.f28134a.f28091e.f28109k.invoke().booleanValue()) {
                this.f28134a.a().e().G.f124743d.add(Integer.toString(this.f28134a.k()));
                this.f28134a.a().e().G.f124746g.add(Integer.toString(this.f28134a.n()));
                this.f28134a.a().e().G.f124745f.add(Integer.toString(this.f28134a.l()));
                this.f28134a.a().e().G.f124744e.add(Integer.toString(this.f28134a.m()));
                return;
            }
            int k2 = this.f28134a.k();
            this.f28134a.a().e().G.f124743d.add(Integer.toString((int) ((this.f28134a.f28091e.f28111m.invoke().floatValue() / 5.0f) * ((float) androidx.core.b.a.a(k2, 0, 5)) * 100.0f)));
            int m2 = this.f28134a.m();
            int floatValue = (int) ((this.f28134a.f28091e.f28110l.invoke().floatValue() / 5.0f) * ((float) androidx.core.b.a.a(m2, 0, 5)) * 100.0f);
            this.f28134a.a().e().G.f124744e.add(Integer.toString(floatValue));
            this.f28134a.a().e().G.f124745f.add(Integer.toString(floatValue));
            this.f28134a.a().e().G.f124746g.add(Integer.toString(this.f28134a.n()));
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void b(List<BeautyComposerInfo> list, int i2) {
        h.f.b.l.d(list, "");
        com.ss.android.ugc.aweme.tools.beauty.service.d dVar = this.s;
        if (dVar == null) {
            h.f.b.l.a("beautyModule");
        }
        dVar.b(list, i2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void c(List<BeautyComposerInfo> list, int i2) {
        h.f.b.l.d(list, "");
        com.ss.android.ugc.aweme.tools.beauty.service.d dVar = this.s;
        if (dVar == null) {
            h.f.b.l.a("beautyModule");
        }
        dVar.c(list, i2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void a(List<BeautyComposerInfo> list, int i2) {
        h.f.b.l.d(list, "");
        com.ss.android.ugc.aweme.tools.beauty.service.d dVar = this.s;
        if (dVar == null) {
            h.f.b.l.a("beautyModule");
        }
        dVar.a(list, i2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final int[] a(String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        com.ss.android.ugc.aweme.tools.beauty.service.d dVar = this.s;
        if (dVar == null) {
            h.f.b.l.a("beautyModule");
        }
        return dVar.a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void a(String str, String str2, float f2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        com.ss.android.ugc.aweme.tools.beauty.service.d dVar = this.s;
        if (dVar == null) {
            h.f.b.l.a("beautyModule");
        }
        dVar.a(str, str2, f2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.d
    public final void a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2, int i2) {
        h.f.b.l.d(list, "");
        h.f.b.l.d(list2, "");
        com.ss.android.ugc.aweme.tools.beauty.service.d dVar = this.s;
        if (dVar == null) {
            h.f.b.l.a("beautyModule");
        }
        dVar.a(list, list2, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super java.lang.Boolean, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public i(com.bytedance.o.f fVar, h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> aVar, h.f.a.b<? super Boolean, String> bVar, com.bytedance.creativex.recorder.a.a.f fVar2, com.ss.android.ugc.tools.utils.j jVar, h.f.a.a<z> aVar2, h.f.a.b<? super b, z> bVar2) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar2, "");
        h.f.b.l.d(jVar, "");
        this.y = fVar;
        this.A = aVar;
        this.f28096j = bVar;
        this.f28097k = fVar2;
        this.f28098l = jVar;
        this.B = aVar2;
        this.f28088b = this;
        this.n = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
        this.o = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.m.class);
        this.p = com.bytedance.o.b.a.b(getDiContainer(), com.bytedance.creativex.recorder.filter.a.a.class);
        this.f28089c = com.bytedance.o.b.a.b(getDiContainer(), com.bytedance.creativex.recorder.sticker.a.a.class);
        this.q = true;
        this.t = new com.ss.android.ugc.aweme.tools.beauty.g.n<>();
        this.u = new t<>();
        b bVar3 = new b();
        this.f28091e = bVar3;
        bVar2.invoke(bVar3);
        this.f28095i = new com.bytedance.als.k<>();
        this.w = "";
        this.x = -1;
    }
}
