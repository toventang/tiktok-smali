package com.ss.android.ugc.aweme.tools.live.sticker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.u;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.sticker.IStickerViewService;
import com.ss.android.ugc.aweme.sticker.panel.l;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.aweme.utils.bj;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class d extends com.ss.android.ugc.aweme.sticker.presenter.a {
    public static final C3700d t = new C3700d((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h.h<com.ss.android.ugc.aweme.effectplatform.f> f140243a;

    /* renamed from: h  reason: collision with root package name */
    final com.ss.android.ugc.aweme.sticker.presenter.o f140244h;

    /* renamed from: i  reason: collision with root package name */
    final com.ss.android.ugc.aweme.sticker.d.d f140245i;

    /* renamed from: j  reason: collision with root package name */
    public final com.ss.android.ugc.tools.view.a.a f140246j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.l.a f140247k;

    /* renamed from: l  reason: collision with root package name */
    public volatile boolean f140248l;

    /* renamed from: m  reason: collision with root package name */
    public Effect f140249m;
    FrameLayout n;
    androidx.fragment.app.i o;
    public final c p;
    final com.bytedance.o.f q;
    public androidx.appcompat.app.d r;
    public String s;
    private final h.h u = h.i.a((h.f.a.a) new m(this));
    private final com.ss.android.ugc.aweme.sticker.presenter.a.c v;
    private final f.a.b.a w;
    private final h.h x;

    static {
        Covode.recordClassIndex(91628);
    }

    public final com.bytedance.creativex.recorder.b.a.d d() {
        return (com.bytedance.creativex.recorder.b.a.d) this.u.getValue();
    }

    public final com.ss.android.ugc.aweme.sticker.panel.j e() {
        return (com.ss.android.ugc.aweme.sticker.panel.j) this.x.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.d$d  reason: collision with other inner class name */
    public static final class C3700d {
        static {
            Covode.recordClassIndex(91634);
        }

        private C3700d() {
        }

        public /* synthetic */ C3700d(byte b2) {
            this();
        }
    }

    public static final class f implements com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.b {
        static {
            Covode.recordClassIndex(91636);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.b
        public final void a(String str) {
            h.f.b.l.d(str, "");
        }

        f() {
        }
    }

    public static final class g implements com.ss.android.ugc.aweme.sticker.presenter.handler.b.a {
        static {
            Covode.recordClassIndex(91637);
        }

        @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b.a
        public final void a(Effect effect, String str, String str2, String str3) {
            h.f.b.l.d(effect, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str3, "");
        }

        @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b.a
        public final void b(Effect effect, String str, String str2, String str3) {
            h.f.b.l.d(effect, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str3, "");
        }

        g() {
        }
    }

    public static final class j implements com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b {
        static {
            Covode.recordClassIndex(91641);
        }

        j() {
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("key_choose_scene", 3);
            bundle.putInt("key_photo_select_min_count", 1);
            bundle.putInt("key_photo_select_max_count", 1);
            bundle.putInt("upload_photo_min_height", 480);
            bundle.putInt("upload_photo_min_width", 360);
            bundle.putInt("key_support_flag", 1);
            return bundle;
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
                arrayList.add(new com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j(str, mediaModel.f109396h, 0, null, null, null, 60));
            }
            return arrayList;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.a
    public final com.ss.android.ugc.aweme.sticker.presenter.a.c a() {
        return this.v;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.i
    public final com.ss.android.ugc.aweme.sticker.presenter.o t() {
        return this.f140244h;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.i
    public final com.ss.android.ugc.aweme.sticker.d.d u() {
        return this.f140245i;
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.repository.a.h> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(91635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.repository.a.h invoke() {
            return this.this$0.f140244h.c().f();
        }
    }

    public static final class l implements com.ss.android.ugc.aweme.sticker.k.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f140255a;

        static {
            Covode.recordClassIndex(91643);
        }

        @Override // com.ss.android.ugc.aweme.sticker.k.e
        public final void a() {
            com.bytedance.creativex.recorder.b.a.d d2 = this.f140255a.d();
            if (d2 != null) {
                d2.b(false, (PrivacyCert) null);
            }
        }

        @Override // com.ss.android.ugc.aweme.sticker.k.e
        public final void b() {
            com.bytedance.creativex.recorder.b.a.d d2 = this.f140255a.d();
            if (d2 != null) {
                d2.a(false, (PrivacyCert) null);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(d dVar) {
            this.f140255a = dVar;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<com.bytedance.creativex.recorder.b.a.d> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(91644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.creativex.recorder.b.a.d invoke() {
            com.bytedance.o.f b2 = com.bytedance.als.dsl.c.b(this.this$0.r);
            if (b2 != null) {
                return b2.a((Type) com.bytedance.creativex.recorder.b.a.d.class, (String) null);
            }
            return null;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.effectplatform.f> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(91645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.effectplatform.f invoke() {
            Context applicationContext = this.this$0.r.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            h.f.b.l.b(applicationContext, "");
            return com.ss.android.ugc.aweme.effectplatform.c.a(applicationContext, null);
        }
    }

    public final void f() {
        this.f140244h.o();
        this.w.a();
        if (this.f140243a.isInitialized()) {
            this.f140243a.getValue().d();
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.panel.j> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f140263a = new s();

        static {
            Covode.recordClassIndex(91650);
        }

        s() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.panel.j invoke() {
            com.ss.android.ugc.aweme.sticker.panel.j jVar = new com.ss.android.ugc.aweme.sticker.panel.j(R.drawable.bm_, R.drawable.u_, null, R.color.a3, 0, 0, false, 0, false, null, null, false, false, false, 131036);
            int i2 = jVar.f135213a;
            int i3 = jVar.f135214b;
            com.ss.android.ugc.aweme.sticker.panel.e eVar = jVar.f135215c;
            int i4 = jVar.f135216d;
            int i5 = jVar.f135217e;
            int i6 = jVar.f135218f;
            int i7 = jVar.f135219g;
            int i8 = jVar.f135220h;
            boolean z = jVar.f135221i;
            long j2 = jVar.f135222j;
            com.ss.android.ugc.aweme.sticker.panel.g gVar = jVar.f135224l;
            com.ss.android.ugc.aweme.sticker.panel.h hVar = jVar.f135225m;
            boolean z2 = jVar.n;
            boolean z3 = jVar.o;
            boolean z4 = jVar.p;
            boolean z5 = jVar.q;
            h.f.b.l.d(gVar, "");
            h.f.b.l.d(hVar, "");
            return new com.ss.android.ugc.aweme.sticker.panel.j(i2, i3, eVar, i4, i5, i6, i7, i8, z, j2, false, gVar, hVar, z2, z3, z4, z5);
        }
    }

    public static final class a extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.view.a.b<?, ?>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f140251a;

        static {
            Covode.recordClassIndex(91631);
        }

        public a(d dVar) {
            this.f140251a = dVar;
        }

        @Override // com.bytedance.o.p
        public final com.ss.android.ugc.aweme.sticker.view.a.b<?, ?> get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            com.ss.android.ugc.aweme.sticker.view.internal.main.c cVar = new com.ss.android.ugc.aweme.sticker.view.internal.main.c((byte) 0);
            cVar.a("sticker_category:favorite", new com.ss.android.ugc.aweme.sticker.view.internal.pager.b.b(this.f140251a.r, (com.ss.android.ugc.aweme.sticker.favorite.b) fVar.a(com.ss.android.ugc.aweme.sticker.favorite.b.class, (String) null), this.f140251a.f140244h, (StickerPreferences) fVar.a(StickerPreferences.class, (String) null)));
            return cVar;
        }
    }

    public static final class b extends com.bytedance.o.p<StickerPreferences> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f140252a;

        static {
            Covode.recordClassIndex(91632);
        }

        public b(d dVar) {
            this.f140252a = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.bytedance.o.p
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences get(com.bytedance.o.f r5) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                h.f.b.l.d(r5, r3)
                com.bytedance.cukaie.closet.a r2 = new com.bytedance.cukaie.closet.a
                com.bytedance.cukaie.closet.internal.d r0 = new com.bytedance.cukaie.closet.internal.d
                r0.<init>()
                r2.<init>(r0)
                com.ss.android.ugc.aweme.tools.live.sticker.d r0 = r4.f140252a
                androidx.appcompat.app.d r0 = r0.r
                android.content.Context r1 = r0.getApplicationContext()
                boolean r0 = com.ss.android.ugc.aweme.lancet.a.a.f107168c
                if (r0 != 0) goto L_0x0025
            L_0x001b:
                h.f.b.l.b(r1, r3)
                java.lang.Class<com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences> r0 = com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences.class
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            L_0x0025:
                if (r1 == 0) goto L_0x0028
                goto L_0x001b
            L_0x0028:
                android.app.Application r1 = com.ss.android.ugc.aweme.lancet.a.a.f107166a
                goto L_0x001b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.live.sticker.d.b.get(com.bytedance.o.f):java.lang.Object");
        }
    }

    public final void a(com.ss.android.ugc.aweme.sticker.l.a aVar) {
        this.f140247k = aVar;
        this.p.f140242a = aVar;
    }

    public static final class c extends com.bytedance.o.p<com.ss.android.ugc.aweme.sticker.favorite.b> {
        static {
            Covode.recordClassIndex(91633);
        }

        @Override // com.bytedance.o.p
        public final com.ss.android.ugc.aweme.sticker.favorite.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.sticker.favorite.c(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IStickerViewService.a f140259a;

        static {
            Covode.recordClassIndex(91647);
        }

        p(IStickerViewService.a aVar) {
            this.f140259a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            IStickerViewService.a aVar;
            StickerTagChangeData stickerTagChangeData = (StickerTagChangeData) obj;
            if (stickerTagChangeData != null && (aVar = this.f140259a) != null) {
                String tabName = stickerTagChangeData.getTabName();
                stickerTagChangeData.getTabKey();
                aVar.a(tabName);
            }
        }
    }

    public static final class q implements com.ss.android.ugc.aweme.sticker.d.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f140260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IStickerViewService.a f140261b;

        static {
            Covode.recordClassIndex(91648);
        }

        @Override // com.ss.android.ugc.aweme.sticker.d.e
        public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
            boolean z;
            h.f.b.l.d(aVar, "");
            this.f140260a.f140249m = aVar.f135378a;
            IStickerService.FaceSticker a2 = com.ss.android.ugc.aweme.sticker.f.d.a(aVar.f135378a);
            if (a2 != null) {
                Bundle bundle = aVar.f135382e;
                if (bundle != null) {
                    z = bundle.getBoolean("is_video_used_sticker");
                } else {
                    z = false;
                }
                a2.isVideoUsedSticker = z;
                IStickerViewService.a aVar2 = this.f140261b;
                if (aVar2 != null) {
                    aVar2.a(a2);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.sticker.d.e
        public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.d dVar) {
            boolean z;
            h.f.b.l.d(dVar, "");
            IStickerService.FaceSticker faceSticker = null;
            this.f140260a.f140249m = null;
            IStickerViewService.a aVar = this.f140261b;
            if (aVar != null) {
                IStickerService.FaceSticker a2 = com.ss.android.ugc.aweme.sticker.f.d.a(dVar.f135384a);
                if (a2 != null) {
                    Bundle bundle = dVar.f135388e;
                    if (bundle != null) {
                        z = bundle.getBoolean("is_video_used_sticker");
                    } else {
                        z = false;
                    }
                    a2.isVideoUsedSticker = z;
                    faceSticker = a2;
                }
                aVar.b(faceSticker);
            }
        }

        q(d dVar, IStickerViewService.a aVar) {
            this.f140260a = dVar;
            this.f140261b = aVar;
        }
    }

    public static final class o implements com.ss.android.ugc.aweme.sticker.panel.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f140256a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IStickerViewService.a f140257b;

        /* renamed from: c  reason: collision with root package name */
        private final com.ss.android.ugc.tools.view.a.c f140258c;

        static {
            Covode.recordClassIndex(91646);
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.l
        public final void a(View view) {
            h.f.b.l.d(view, "");
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.l
        public final void cw_() {
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.l
        public final void b(l.a aVar) {
            com.ss.android.ugc.tools.view.a.c cVar;
            h.f.b.l.d(aVar, "");
            if (aVar == l.a.AFTER_ANIMATE) {
                IStickerViewService.a aVar2 = this.f140257b;
                if (aVar2 != null) {
                    com.ss.android.ugc.aweme.sticker.f.d.a(this.f140256a.f140244h.f());
                    aVar2.b();
                }
                if (h.f.b.l.a((Object) "livestreaming", (Object) this.f140256a.s)) {
                    String name = this.f140256a.r.getClass().getName();
                    h.f.b.l.b(name, "");
                    if (h.m.p.a((CharSequence) name, (CharSequence) "VideoRecordNewActivity", false) && (cVar = this.f140258c) != null) {
                        cVar.c(this.f140256a.f140246j);
                    }
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.sticker.panel.l
        public final void a(l.a aVar) {
            com.ss.android.ugc.tools.view.a.c cVar;
            IStickerService.FaceSticker a2;
            IStickerViewService.a aVar2;
            h.f.b.l.d(aVar, "");
            if (aVar == l.a.BEFORE_ANIMATE) {
                if (this.f140256a.f140248l && this.f140256a.f140244h.f() != null && (!h.f.b.l.a(this.f140256a.f140244h.f(), this.f140256a.f140249m))) {
                    this.f140256a.f140248l = false;
                    d dVar = this.f140256a;
                    dVar.f140249m = dVar.f140244h.f();
                    Effect f2 = this.f140256a.f140244h.f();
                    if (!(f2 == null || (a2 = com.ss.android.ugc.aweme.sticker.f.d.a(f2)) == null || (aVar2 = this.f140257b) == null)) {
                        aVar2.a(a2);
                    }
                }
                IStickerViewService.a aVar3 = this.f140257b;
                if (aVar3 != null) {
                    com.ss.android.ugc.aweme.sticker.f.d.a(this.f140256a.f140244h.f());
                    aVar3.a();
                }
                if (h.f.b.l.a((Object) "livestreaming", (Object) this.f140256a.s)) {
                    String name = this.f140256a.r.getClass().getName();
                    h.f.b.l.b(name, "");
                    if (h.m.p.a((CharSequence) name, (CharSequence) "VideoRecordNewActivity", false) && (cVar = this.f140258c) != null) {
                        cVar.b(this.f140256a.f140246j);
                    }
                }
            }
        }

        o(d dVar, IStickerViewService.a aVar) {
            this.f140256a = dVar;
            this.f140257b = aVar;
            this.f140258c = com.ss.android.ugc.aweme.port.in.g.a().E().a((Activity) dVar.r);
        }
    }

    public final void a(com.google.c.a.q<com.ss.android.ugc.aweme.sticker.n.a> qVar) {
        h.f.b.l.d(qVar, "");
        a(new UploadPicStickerARPresenter(this.r, null, new com.ss.android.ugc.aweme.aj.b(), new f(), new g(), new j(), null, null, k.f140254a, null, new h(qVar), i.f140253a, null, this.f140244h.c().j().d(), this.f140244h, new l(this), null, null, null, 1838786));
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.m<String, com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f140253a = new i();

        static {
            Covode.recordClassIndex(91640);
        }

        i() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j jVar) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(jVar, "");
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.m<String, String, z> {
        final /* synthetic */ com.google.c.a.q $processorSupplier;

        static {
            Covode.recordClassIndex(91638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(com.google.c.a.q qVar) {
            super(2);
            this.$processorSupplier = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, String str2) {
            final String str3 = str;
            String str4 = str2;
            h.f.b.l.d(str3, "");
            h.f.b.l.d(str4, "");
            com.ss.android.ugc.aweme.ci.b.a(str4, com.ss.android.ugc.aweme.ci.b.f71080a, new h.f.a.b<String, z>(this) {
                /* class com.ss.android.ugc.aweme.tools.live.sticker.d.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(91639);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(String str) {
                    String str2 = str;
                    h.f.b.l.d(str2, "");
                    ((com.ss.android.ugc.aweme.sticker.n.a) this.this$0.$processorSupplier.b()).a(str3, str2);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class r implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f140262a;

        static {
            Covode.recordClassIndex(91649);
        }

        r(d dVar) {
            this.f140262a = dVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            com.ss.android.ugc.aweme.sticker.panel.i iVar;
            if (i2 != 4 || (iVar = this.f140262a.f135258f) == null || !iVar.d()) {
                return false;
            }
            com.ss.android.ugc.aweme.sticker.panel.i iVar2 = this.f140262a.f135258f;
            if (iVar2 != null) {
                iVar2.g();
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.m<Long, String, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f140254a = new k();

        static {
            Covode.recordClassIndex(91642);
        }

        k() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Long l2, String str) {
            long longValue = l2.longValue();
            com.ss.android.ugc.aweme.port.in.g.a().I().a("upload_pic_sticker_loading_time", 0, new ar().a("duration", Long.valueOf(longValue)).a("stickid", str).a());
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.d dVar, String str) {
        super(dVar, bj.f142677a);
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(str, "");
        this.r = dVar;
        this.s = str;
        h.h<com.ss.android.ugc.aweme.effectplatform.f> a2 = h.i.a((h.f.a.a) new n(this));
        this.f140243a = a2;
        com.ss.android.ugc.aweme.sticker.presenter.o a3 = com.ss.android.ugc.aweme.sticker.l.a(this.r, new com.ss.android.ugc.aweme.sticker.presenter.q("livestreaming", false, true), com.ss.android.ugc.aweme.sticker.o.f134974a, a2.getValue()).a();
        this.f140244h = a3;
        this.v = com.ss.android.ugc.aweme.sticker.presenter.a.b.f135271a;
        com.ss.android.ugc.aweme.sticker.d.a aVar = new com.ss.android.ugc.aweme.sticker.d.a(a3);
        this.f140245i = aVar;
        this.f140246j = new r(this);
        this.f140248l = true;
        this.w = new f.a.b.a();
        c cVar = new c((byte) 0);
        this.p = cVar;
        com.bytedance.o.n nVar = new com.bytedance.o.n();
        h.f.b.l.b(nVar.a(com.ss.android.ugc.aweme.sticker.favorite.b.class, (String) null, (com.bytedance.o.p) new c()), "");
        h.f.b.l.b(nVar.a(com.ss.android.ugc.aweme.sticker.view.a.b.class, (String) null, (com.bytedance.o.p) new a(this)), "");
        h.f.b.l.b(nVar.a(StickerPreferences.class, (String) null, (com.bytedance.o.p) new b(this)), "");
        com.bytedance.o.f a4 = nVar.a();
        h.f.b.l.b(a4, "");
        this.q = a4;
        this.x = h.i.a((h.f.a.a) s.f140263a);
        com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a.a aVar2 = new com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a.a(h.i.a((h.f.a.a) new e(this)));
        com.ss.android.ugc.aweme.sticker.repository.a.j i2 = a3.c().i();
        Context applicationContext = this.r.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        h.f.b.l.b(applicationContext, "");
        i2.a(new com.ss.android.ugc.aweme.sticker.repository.internals.f.a.a(aVar2, applicationContext, (byte) 0));
        a(new b(this.r, a3, cVar, (com.ss.android.ugc.aweme.sticker.favorite.b) a4.a(com.ss.android.ugc.aweme.sticker.favorite.b.class, (String) null), (StickerPreferences) a4.a(StickerPreferences.class, (String) null), new h.f.a.a<com.ss.android.ugc.aweme.sticker.panel.j>(this) {
            /* class com.ss.android.ugc.aweme.tools.live.sticker.d.AnonymousClass1 */
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(91629);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ com.ss.android.ugc.aweme.sticker.panel.j invoke() {
                return this.this$0.e();
            }
        }));
        aVar.a(new com.ss.android.ugc.aweme.sticker.d.a.d(this) {
            /* class com.ss.android.ugc.aweme.tools.live.sticker.d.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f140250a;

            static {
                Covode.recordClassIndex(91630);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f140250a = r1;
            }

            @Override // com.ss.android.ugc.aweme.sticker.d.a.d
            public final <T> boolean a(com.ss.android.ugc.aweme.sticker.d.b.b<T> bVar) {
                LiveData<StickerTagChangeData> a2;
                StickerTagChangeData value;
                String tabName;
                String str = "";
                h.f.b.l.d(bVar, str);
                if (!(bVar instanceof com.ss.android.ugc.aweme.sticker.d.b.c)) {
                    return false;
                }
                Effect effect = ((com.ss.android.ugc.aweme.sticker.d.b.c) bVar).f134767a;
                c cVar = this.f140250a.p;
                boolean a3 = com.ss.android.ugc.aweme.sticker.f.c.a(this.f140250a.f140244h, effect);
                com.ss.android.ugc.aweme.sticker.panel.i iVar = this.f140250a.f135258f;
                if (!(iVar == null || (a2 = iVar.a()) == null || (value = a2.getValue()) == null || (tabName = value.getTabName()) == null)) {
                    str = tabName;
                }
                cVar.a(effect, a3, str, "click_main_panel", bVar.a(), false, null);
                return false;
            }
        });
        c();
    }
}
