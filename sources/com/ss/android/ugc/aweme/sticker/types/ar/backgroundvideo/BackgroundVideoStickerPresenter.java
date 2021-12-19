package com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.mediachoose.f;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.p;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.panel.l;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.j;
import h.h;
import h.z;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class BackgroundVideoStickerPresenter extends com.ss.android.ugc.aweme.sticker.presenter.handler.b implements au, com.ss.android.ugc.aweme.sticker.panel.c, l {
    public static final a p = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f135765a;

    /* renamed from: b  reason: collision with root package name */
    com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d f135766b;

    /* renamed from: c  reason: collision with root package name */
    public Effect f135767c;

    /* renamed from: d  reason: collision with root package name */
    final List<String> f135768d;

    /* renamed from: e  reason: collision with root package name */
    public int f135769e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.fragment.app.e f135770f;

    /* renamed from: g  reason: collision with root package name */
    public final String f135771g;

    /* renamed from: h  reason: collision with root package name */
    final com.ss.android.ugc.tools.view.a.c f135772h;

    /* renamed from: i  reason: collision with root package name */
    public final q<f> f135773i;

    /* renamed from: j  reason: collision with root package name */
    public final i f135774j;

    /* renamed from: k  reason: collision with root package name */
    public final g f135775k;

    /* renamed from: l  reason: collision with root package name */
    public final h f135776l;

    /* renamed from: m  reason: collision with root package name */
    final com.ss.android.ugc.aweme.sticker.k.e f135777m;
    public final com.ss.android.ugc.aweme.sticker.types.e.a n;
    public final h.f.a.b<Integer, z> o;
    private boolean q;
    private final h r;
    private final o s = null;
    private final com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.b t;
    private final com.ss.android.ugc.aweme.sticker.presenter.handler.b.a u;

    static {
        Covode.recordClassIndex(88739);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void b(l.a aVar) {
        h.f.b.l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void cw_() {
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.tools.view.a.b e() {
        return (com.ss.android.ugc.tools.view.a.b) this.r.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88740);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(Effect effect) {
            h.f.b.l.d(effect, "");
            String sdkExtra = effect.getSdkExtra();
            if (sdkExtra == null) {
                return null;
            }
            try {
                return new JSONObject(sdkExtra).optJSONObject("vl").optString("imgK");
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c
    public final boolean b() {
        return this.q;
    }

    static final class b extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ BackgroundVideoStickerPresenter this$0;

        static {
            Covode.recordClassIndex(88741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter) {
            super(0);
            this.this$0 = backgroundVideoStickerPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new com.ss.android.ugc.tools.view.a.b(this) {
                /* class com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f135778a;

                static {
                    Covode.recordClassIndex(88742);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f135778a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter$b$1$a */
                static final /* synthetic */ class a extends j implements h.f.a.b<Intent, a> {
                    static {
                        Covode.recordClassIndex(88743);
                    }

                    a(g gVar) {
                        super(1, gVar, g.class, "handleResponse", "handleResponse(Landroid/content/Intent;)Lcom/ss/android/ugc/aweme/sticker/types/ar/backgroundvideo/BackgroundMediaData;", 0);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ a invoke(Intent intent) {
                        Intent intent2 = intent;
                        h.f.b.l.d(intent2, "");
                        return ((g) this.receiver).a(intent2);
                    }
                }

                @Override // com.ss.android.ugc.tools.view.a.b
                public final boolean a(int i2, int i3, Intent intent) {
                    if (i2 != 10002) {
                        return false;
                    }
                    this.f135778a.this$0.a(i2, i3, intent, new a(this.f135778a.this$0.f135775k));
                    return true;
                }
            };
        }
    }

    private final void f() {
        c();
        this.f135774j.a(new d(this));
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c
    public final void d() {
        this.q = false;
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135766b;
        if (dVar != null) {
            dVar.b();
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        this.f135773i.b().b();
    }

    public static final class e implements com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BackgroundVideoStickerPresenter f135779a;

        static {
            Covode.recordClassIndex(88748);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c
        public final void a(List<j> list) {
            h.f.b.l.d(list, "");
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c
        public final void a() {
            this.f135779a.f135765a = "";
            Effect effect = this.f135779a.f135767c;
            if (effect != null) {
                this.f135779a.f135773i.b().a(effect);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r1 != null) goto L_0x0023;
         */
        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter r4 = r5.f135779a
                com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.g r0 = r4.f135775k
                android.os.Bundle r2 = r0.a()
                com.ss.android.ugc.aweme.sticker.q r1 = com.ss.android.ugc.aweme.sticker.p.a()
                androidx.fragment.app.e r0 = r4.f135770f
                r3 = 10002(0x2712, float:1.4016E-41)
                android.content.Intent r2 = r1.a(r0, r2, r3)
                com.ss.android.ugc.tools.view.a.c r1 = r4.f135772h
                if (r1 != 0) goto L_0x0023
                androidx.fragment.app.e r1 = r4.f135770f
                boolean r0 = r1 instanceof com.ss.android.ugc.tools.view.a.c
                if (r0 != 0) goto L_0x001f
                r1 = 0
            L_0x001f:
                com.ss.android.ugc.tools.view.a.c r1 = (com.ss.android.ugc.tools.view.a.c) r1
                if (r1 == 0) goto L_0x0031
            L_0x0023:
                com.ss.android.ugc.tools.view.a.b r0 = r4.e()
                r1.b(r0)
                com.ss.android.ugc.tools.view.a.b r0 = r4.e()
                r1.a(r0)
            L_0x0031:
                androidx.fragment.app.e r0 = r4.f135770f
                r0.startActivityForResult(r2, r3)
                com.ss.android.ugc.aweme.sticker.k.e r0 = r4.f135777m
                if (r0 == 0) goto L_0x003d
                r0.a()
            L_0x003d:
                com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter r0 = r5.f135779a
                r1 = 1
                r0.f135769e = r1
                com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter r0 = r5.f135779a
                r0.a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter.e.b():void");
        }

        e(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter) {
            this.f135779a = backgroundVideoStickerPresenter;
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c
        public final void a(final com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar, final com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.a aVar2) {
            if (aVar != null) {
                com.ss.android.ugc.aweme.sticker.types.e.a aVar3 = this.f135779a.n;
                MediaModel mediaModel = new MediaModel(-1);
                mediaModel.f109390b = aVar.f135944b;
                mediaModel.f109392d = aVar.o;
                mediaModel.f109400l = aVar.f135955m;
                mediaModel.f109401m = aVar.n;
                mediaModel.f109396h = aVar.f135950h;
                mediaModel.f109398j = aVar.p;
                aVar3.a(mediaModel, new h.f.a.b<f, z>() {
                    /* class com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(88749);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(f fVar) {
                        h.f.b.l.d(fVar, "");
                        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.a aVar = aVar2;
                        if (aVar != null) {
                            aVar.a();
                        }
                        String str = aVar.f135944b;
                        if (str != null) {
                            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = this.f135779a;
                            backgroundVideoStickerPresenter.f135773i.b().a(str, new c(backgroundVideoStickerPresenter, str));
                            this.f135779a.f135769e = 0;
                            this.f135779a.a(true);
                        }
                        return z.f158842a;
                    }
                }, new h.f.a.b<f, z>(this) {
                    /* class com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter.e.AnonymousClass2 */
                    final /* synthetic */ e this$0;

                    static {
                        Covode.recordClassIndex(88750);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(f fVar) {
                        f fVar2 = fVar;
                        h.f.b.l.d(fVar2, "");
                        h.f.a.b<Integer, z> bVar = this.this$0.f135779a.o;
                        if (bVar != null) {
                            bVar.invoke(Integer.valueOf(fVar2.f109387e));
                        }
                        return z.f158842a;
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        this.f135767c = null;
        this.f135765a = "";
        this.f135773i.b().c();
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135766b;
        if (dVar != null) {
            dVar.f136010d.d();
        }
        d();
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        com.ss.android.ugc.tools.view.a.c cVar = this.f135772h;
        if (cVar == null) {
            androidx.fragment.app.e eVar = this.f135770f;
            if (!(eVar instanceof com.ss.android.ugc.tools.view.a.c)) {
                eVar = null;
            }
            cVar = (com.ss.android.ugc.tools.view.a.c) eVar;
            if (cVar == null) {
                return;
            }
        }
        cVar.b(e());
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c
    public final void c() {
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar;
        o oVar = this.s;
        if ((oVar == null || h.f.b.l.a(oVar.f(), this.f135767c)) && (dVar = this.f135766b) != null) {
            this.q = true;
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d.a(dVar, null, 3);
            if (true ^ this.f135768d.isEmpty()) {
                dVar.g();
            }
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ String $videoPath;
        final /* synthetic */ BackgroundVideoStickerPresenter this$0;

        static {
            Covode.recordClassIndex(88744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter, String str) {
            super(0);
            this.this$0 = backgroundVideoStickerPresenter;
            this.$videoPath = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Intent a2 = this.this$0.f135776l.a(this.$videoPath);
            this.this$0.f135774j.a();
            androidx.fragment.app.e eVar = this.this$0.f135770f;
            Intent a3 = p.a().a(this.this$0.f135770f, a2);
            AnonymousClass1 r6 = new h.f.a.q<Integer, Integer, Intent, z>(this) {
                /* class com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(88745);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // h.f.a.q
                public final /* synthetic */ z invoke(Integer num, Integer num2, Intent intent) {
                    this.this$0.this$0.a(num.intValue(), num2.intValue(), intent, new h.f.a.b<Intent, a>(this.this$0.this$0.f135776l) {
                        /* class com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter.c.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(88746);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ a invoke(Intent intent) {
                            Intent intent2 = intent;
                            h.f.b.l.d(intent2, "");
                            return ((h) this.receiver).a(intent2);
                        }
                    });
                    return z.f158842a;
                }
            };
            h.f.b.l.d(eVar, "");
            h.f.b.l.d(a3, "");
            h.f.b.l.d(r6, "");
            Fragment findFragmentByTag = eVar.getFragmentManager().findFragmentByTag("async_task");
            h.f.b.l.d(a3, "");
            h.f.b.l.d(r6, "");
            com.ss.android.ugc.aweme.sticker.p.b bVar = new com.ss.android.ugc.aweme.sticker.p.b();
            bVar.f134990a = a3;
            Bundle bundle = new Bundle();
            bundle.putInt("extra_request_code", 10002);
            bVar.setArguments(bundle);
            bVar.f134991b = r6;
            if (findFragmentByTag != null) {
                eVar.getFragmentManager().beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
            }
            eVar.getFragmentManager().beginTransaction().add(bVar, "async_task").commitAllowingStateLoss();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        h.f.b.l.d(aVar, "");
        return g.f(aVar.f135378a);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(View view) {
        h.f.b.l.d(view, "");
        ViewStubCompat viewStubCompat = (ViewStubCompat) view.findViewById(R.id.ecv);
        if (viewStubCompat != null) {
            this.f135766b = new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d(viewStubCompat, this.f135770f, new e(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(l.a aVar) {
        h.f.b.l.d(aVar, "");
        if (aVar == l.a.AFTER_ANIMATE && this.f135767c != null && !this.q) {
            f();
        }
    }

    public final void a(boolean z) {
        String str;
        if (this.f135769e == 0) {
            str = "video";
        } else {
            str = "album";
        }
        if (z) {
            Effect effect = this.f135767c;
            if (effect != null) {
                this.u.a(effect, "upload", FaceStickerBean.sCurPropSource, str);
                return;
            }
            return;
        }
        Effect effect2 = this.f135767c;
        if (effect2 != null) {
            this.u.b(effect2, "upload", FaceStickerBean.sCurPropSource, str);
        }
        this.f135769e = 0;
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class d extends j implements h.f.a.m<Boolean, List<? extends MediaModel>, z> {
        static {
            Covode.recordClassIndex(88747);
        }

        d(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter) {
            super(2, backgroundVideoStickerPresenter, BackgroundVideoStickerPresenter.class, "onMediaPageLoaded", "onMediaPageLoaded(ZLjava/util/List;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Boolean bool, List<? extends MediaModel> list) {
            ArrayList arrayList;
            boolean booleanValue = bool.booleanValue();
            List<? extends MediaModel> list2 = list;
            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = (BackgroundVideoStickerPresenter) this.receiver;
            backgroundVideoStickerPresenter.f135768d.clear();
            if (booleanValue) {
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList(n.a((Iterable) list2, 10));
                    for (T t : list2) {
                        List<String> list3 = backgroundVideoStickerPresenter.f135768d;
                        String str = t.f109390b;
                        h.f.b.l.b(str, "");
                        list3.add(str);
                        String str2 = t.f109390b;
                        h.f.b.l.b(str2, "");
                        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar = new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a(str2, t.f109396h);
                        aVar.f135951i = 2;
                        aVar.o = t.f109392d;
                        aVar.f135955m = t.f109400l;
                        aVar.n = t.f109401m;
                        aVar.p = t.f109398j;
                        arrayList2.add(aVar);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = h.a.z.INSTANCE;
                }
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = backgroundVideoStickerPresenter.f135766b;
                if (dVar != null) {
                    dVar.e();
                    dVar.a(arrayList);
                    String str3 = backgroundVideoStickerPresenter.f135765a;
                    if (str3.length() > 0 && str3 != null) {
                        dVar.a(str3);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.c();
                    }
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        if (!h.f.b.l.a(this.f135767c, aVar.f135378a)) {
            this.f135765a = "";
            this.f135767c = aVar.f135378a;
        }
        f();
        this.f135773i.b().a(aVar.f135378a);
    }

    public final void a(int i2, int i3, Intent intent, h.f.a.b<? super Intent, a> bVar) {
        if (i2 == 10002) {
            com.ss.android.ugc.aweme.sticker.k.e eVar = this.f135777m;
            if (eVar != null) {
                eVar.b();
            }
            if (i3 == -1 && intent != null) {
                a invoke = bVar.invoke(intent);
                String str = invoke.f135780a;
                String str2 = invoke.f135781b;
                String str3 = invoke.f135782c;
                if (str3 != null) {
                    this.f135765a = str3;
                }
                if (str != null) {
                    if (str2 != null) {
                        this.f135773i.b().a(str, str2);
                    }
                    this.t.a(str);
                }
            }
            this.f135773i.b().a();
            if (this.f135768d.contains(this.f135765a)) {
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135766b;
                if (dVar != null) {
                    dVar.a(this.f135765a);
                }
            } else {
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar2 = this.f135766b;
                if (dVar2 != null) {
                    dVar2.f136010d.d();
                }
            }
            a(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundVideoStickerPresenter(androidx.fragment.app.e eVar, String str, com.ss.android.ugc.tools.view.a.c cVar, q<f> qVar, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.b.a aVar, i iVar, g gVar, h hVar, com.ss.android.ugc.aweme.sticker.k.e eVar2, com.ss.android.ugc.aweme.sticker.types.e.a aVar2, h.f.a.b<? super Integer, z> bVar2) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(qVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(gVar, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(aVar2, "");
        this.f135770f = eVar;
        this.f135771g = str;
        this.f135772h = cVar;
        this.f135773i = qVar;
        this.t = bVar;
        this.u = aVar;
        this.f135774j = iVar;
        this.f135775k = gVar;
        this.f135776l = hVar;
        this.f135777m = eVar2;
        this.n = aVar2;
        this.o = bVar2;
        this.f135765a = "";
        this.f135768d = new ArrayList();
        this.r = h.i.a((h.f.a.a) new b(this));
        eVar.getLifecycle().a(this);
    }
}
