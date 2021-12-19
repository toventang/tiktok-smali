package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.sticker.panel.l;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.f.d;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;
import h.a.am;
import h.a.n;
import h.f.a.m;
import h.f.a.q;
import h.f.b.z;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class UploadPicStickerARPresenter extends com.ss.android.ugc.aweme.sticker.presenter.handler.b implements au, com.ss.android.ugc.aweme.sticker.panel.c, l, com.ss.android.ugc.aweme.sticker.presenter.e {
    public static boolean v;
    public static final a w = new a((byte) 0);
    private final List<j> A;
    private final h.h B;
    private final h.h C;
    private final com.ss.android.ugc.tools.view.a.c D;
    private final com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.b E;
    private final com.ss.android.ugc.aweme.sticker.presenter.handler.b.a F;
    private final h.f.a.b<List<String>, z> G;
    private final q<Effect, Handler, DialogInterface.OnDismissListener, Dialog> H;
    private final m<List<j>, List<j>, z> I;
    private final m<String, String, z> J;
    private final m<String, j, z> K;
    private final o L;
    private final h.f.a.a<Boolean> M;
    private final ArrayList<j> N;
    private final h.f.a.a<z> O;

    /* renamed from: a  reason: collision with root package name */
    public Effect f135894a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a f135895b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d f135896c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<String> f135897d;

    /* renamed from: e  reason: collision with root package name */
    public String f135898e;

    /* renamed from: f  reason: collision with root package name */
    public long f135899f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f135900g;

    /* renamed from: h  reason: collision with root package name */
    public int f135901h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f135902i;

    /* renamed from: j  reason: collision with root package name */
    public int f135903j;

    /* renamed from: k  reason: collision with root package name */
    public int f135904k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f135905l;

    /* renamed from: m  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a> f135906m;
    public final androidx.fragment.app.e n;
    public final com.ss.android.ugc.aweme.sticker.c.a o;
    public final b p;
    public final b q;
    public final m<Long, String, z> r;
    public final com.bytedance.als.h<Boolean> s;
    public final com.ss.android.ugc.tools.f.d t;
    public final com.ss.android.ugc.aweme.sticker.k.e u;
    private boolean x;
    private boolean y;
    private a z;

    public interface b {
        static {
            Covode.recordClassIndex(88807);
        }

        void a();

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(88804);
    }

    private final com.ss.android.ugc.tools.view.a.b j() {
        return (com.ss.android.ugc.tools.view.a.b) this.C.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void cw_() {
    }

    public final d e() {
        return (d) this.B.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88806);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c
    public final boolean b() {
        return this.y;
    }

    public final void a(List<String> list) {
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar;
        if (!this.x && !list.isEmpty() && (aVar = this.f135895b) != null) {
            if (!aVar.b().isEmpty()) {
                if (am.a((Object[]) new Integer[]{2, 3, 0}).contains(Integer.valueOf(aVar.f135949g.getPl().getAlbumFilter()))) {
                    com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135896c;
                    if (dVar != null) {
                        dVar.d();
                    }
                    e().a(list, aVar);
                    return;
                }
            }
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar2 = this.f135896c;
            if (dVar2 != null && dVar2.f136010d.a() == 0) {
                l();
            }
            i();
        }
    }

    public final void a(String str) {
        String str2;
        h.f.a.b<List<String>, z> bVar;
        if (com.ss.android.ugc.tools.utils.i.a(str) && this.f135895b != null) {
            String str3 = "";
            this.E.a(str == null ? str3 : str);
            m<String, String, z> mVar = this.J;
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar = this.f135895b;
            if (aVar == null || (str2 = aVar.c()) == null) {
                str2 = str3;
            }
            if (str != null) {
                str3 = str;
            }
            mVar.invoke(str2, str3);
            if (!(str == null || (bVar = this.G) == null)) {
                bVar.invoke(n.a(str));
            }
            this.f135900g = true;
        }
    }

    public final void a(j jVar) {
        String c2;
        String str = null;
        if (jVar != null) {
            str = jVar.f135808b;
        }
        if (com.ss.android.ugc.tools.utils.i.a(str) && this.f135895b != null) {
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.b bVar = this.E;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            bVar.a(str);
            m<String, j, z> mVar = this.K;
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar = this.f135895b;
            if (!(aVar == null || (c2 = aVar.c()) == null)) {
                str2 = c2;
            }
            if (jVar == null) {
                h.f.b.l.b();
            }
            mVar.invoke(str2, jVar);
            this.f135900g = false;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ UploadPicStickerARPresenter this$0;

        static {
            Covode.recordClassIndex(88808);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UploadPicStickerARPresenter uploadPicStickerARPresenter) {
            super(0);
            this.this$0 = uploadPicStickerARPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new com.ss.android.ugc.tools.view.a.b(this) {
                /* class com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f135908a;

                static {
                    Covode.recordClassIndex(88809);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f135908a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter$c$1$a */
                public static final class a implements com.bytedance.als.m<Boolean> {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f135909a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ List f135910b;

                    static {
                        Covode.recordClassIndex(88810);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // androidx.lifecycle.u, com.bytedance.als.m
                    public final /* synthetic */ void onChanged(Boolean bool) {
                        this.f135909a.f135908a.this$0.c(this.f135910b);
                        this.f135909a.f135908a.this$0.s.a(this);
                    }

                    a(AnonymousClass1 r1, List list) {
                        this.f135909a = r1;
                        this.f135910b = list;
                    }
                }

                private static String a(Intent intent, String str) {
                    try {
                        return intent.getStringExtra(str);
                    } catch (Exception unused) {
                        return null;
                    }
                }

                @Override // com.ss.android.ugc.tools.view.a.b
                public final boolean a(int i2, int i3, Intent intent) {
                    Boolean bool;
                    if (i2 == 10001 || i2 == 10004) {
                        com.ss.android.ugc.aweme.sticker.k.e eVar = this.f135908a.this$0.u;
                        if (eVar != null) {
                            eVar.b();
                        }
                        if (intent != null && i3 == -1) {
                            this.f135908a.this$0.f135902i = false;
                            List<j> a2 = this.f135908a.this$0.p.a(intent);
                            if (a2 == null) {
                                return false;
                            }
                            String a3 = a(intent, "click_content");
                            if (a3 == null) {
                                a3 = "";
                            }
                            h.f.b.l.b(a3, "");
                            com.ss.android.ugc.tools.f.d dVar = this.f135908a.this$0.t;
                            if (dVar != null) {
                                Effect effect = this.f135908a.this$0.f135894a;
                                if (effect != null) {
                                    effect.getEffectId();
                                }
                                a2.size();
                                dVar.a(a3);
                            }
                            com.bytedance.als.h<Boolean> hVar = this.f135908a.this$0.s;
                            if (hVar != null) {
                                bool = hVar.a();
                            } else {
                                bool = null;
                            }
                            if (h.f.b.l.a((Object) bool, (Object) false)) {
                                this.f135908a.this$0.s.a(this.f135908a.this$0.n, new a(this, a2));
                                return true;
                            }
                            this.f135908a.this$0.c(a2);
                            return true;
                        }
                    }
                    return false;
                }
            };
        }
    }

    public static final class f implements com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UploadPicStickerARPresenter f135913a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f135914b;

        static {
            Covode.recordClassIndex(88813);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c
        public final void a() {
            this.f135913a.h();
            this.f135913a.f135895b = null;
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c
        public final void b() {
            this.f135913a.f135901h = 1;
            this.f135913a.a(10001);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c
        public final void c() {
            this.f135913a.f135901h = 1;
            this.f135913a.a(10004);
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c
        public final void a(List<j> list) {
            h.f.b.l.d(list, "");
            this.f135913a.f135901h = 2;
            this.f135913a.b(list);
        }

        f(UploadPicStickerARPresenter uploadPicStickerARPresenter, View view) {
            this.f135913a = uploadPicStickerARPresenter;
            this.f135914b = view;
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.c
        public final void a(com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.a aVar2) {
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar3;
            aVar2.a();
            UploadPicStickerARPresenter uploadPicStickerARPresenter = this.f135913a;
            String str = null;
            if (aVar != null) {
                aVar.f135953k = "media_tray";
                Effect effect = this.f135913a.f135894a;
                if (effect != null) {
                    UploadPicStickerARPresenter.a(effect, aVar);
                }
                aVar3 = aVar;
            } else {
                aVar3 = null;
            }
            uploadPicStickerARPresenter.f135895b = aVar3;
            if (aVar == null || aVar.f135951i != 3) {
                UploadPicStickerARPresenter uploadPicStickerARPresenter2 = this.f135913a;
                if (aVar != null) {
                    str = aVar.f135944b;
                }
                uploadPicStickerARPresenter2.a(str);
            } else {
                String str2 = aVar.f135944b;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                String str4 = aVar.f135943a;
                if (str4 != null) {
                    str3 = str4;
                }
                String str5 = aVar.f135952j;
                if (str5 == null) {
                    str5 = "GIPHY";
                }
                this.f135913a.a(new j(str2, 0, 3, str3, str5, "media_tray"));
                com.ss.android.ugc.tools.f.d dVar = this.f135913a.t;
                if (dVar != null) {
                    String str6 = aVar.f135943a;
                    String str7 = aVar.f135948f;
                    boolean z = true;
                    if (aVar.f135951i != 1) {
                        z = false;
                    }
                    dVar.a(new d.a(str6, str7, "media_tray", z));
                }
            }
            this.f135913a.f135901h = 2;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        this.y = false;
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135896c;
        if (dVar != null) {
            dVar.b();
        }
        k();
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c
    public final void d() {
        this.y = false;
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135896c;
        if (dVar != null) {
            dVar.b();
        }
    }

    public final void i() {
        this.x = true;
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135896c;
        if (dVar != null) {
            dVar.c();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<d> {
        final /* synthetic */ UploadPicStickerARPresenter this$0;

        static {
            Covode.recordClassIndex(88815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(UploadPicStickerARPresenter uploadPicStickerARPresenter) {
            super(0);
            this.this$0 = uploadPicStickerARPresenter;
        }

        public static final class a implements com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ z.d f135917a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f135918b;

            static {
                Covode.recordClassIndex(88816);
            }

            @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.d
            public final void a() {
                this.f135918b.this$0.f();
                this.f135918b.this$0.f135905l = true;
                this.f135918b.this$0.i();
            }

            @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.d
            public final void a(List<String> list) {
                h.f.b.l.d(list, "");
                if (!list.isEmpty()) {
                    this.f135918b.this$0.f135897d.addAll(list);
                    this.f135918b.this$0.a(list);
                    return;
                }
                this.f135918b.this$0.i();
            }

            @Override // com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.d
            public final void a(com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar) {
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar;
                String str;
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar2;
                if (this.f135918b.this$0.f135905l) {
                    this.f135917a.element = SystemClock.uptimeMillis();
                    this.f135918b.this$0.f135905l = false;
                }
                if (aVar == null) {
                    return;
                }
                if (SystemClock.uptimeMillis() - this.f135917a.element < 5000) {
                    int i2 = this.f135918b.this$0.f135903j;
                    int i3 = this.f135918b.this$0.f135904k;
                    int i4 = aVar.f135947e;
                    if (i2 <= i4 && i3 >= i4) {
                        Effect effect = this.f135918b.this$0.f135894a;
                        if (effect == null || (str = effect.getEffectId()) == null) {
                            str = "";
                        }
                        if (!TextUtils.isEmpty(aVar.f135948f) && h.f.b.l.a((Object) aVar.f135948f, (Object) str) && (dVar2 = this.f135918b.this$0.f135896c) != null) {
                            dVar2.a(aVar);
                        }
                    } else if (aVar.f135947e > 0) {
                        this.f135918b.this$0.f135906m.add(aVar);
                    }
                } else {
                    this.f135918b.this$0.f();
                    if (aVar.f135947e > 0 && (dVar = this.f135918b.this$0.f135896c) != null) {
                        dVar.a(aVar);
                    }
                }
            }

            a(z.d dVar, h hVar) {
                this.f135917a = dVar;
                this.f135918b = hVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            com.ss.android.ugc.aweme.sticker.c.a aVar = this.this$0.o;
            Context applicationContext = this.this$0.n.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            h.f.b.l.b(applicationContext, "");
            d dVar = new d(aVar, applicationContext);
            z.d dVar2 = new z.d();
            dVar2.element = 0;
            a aVar2 = new a(dVar2, this);
            h.f.b.l.d(aVar2, "");
            dVar.f135988c = aVar2;
            return dVar;
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        a aVar;
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135896c;
        if (dVar != null) {
            dVar.f();
            if (!this.f135902i && (aVar = this.z) != null && aVar.f135925c) {
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a.a aVar2 = dVar.f136010d;
                aVar2.g();
                aVar2.notifyDataSetChanged();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.c
    public final void c() {
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar;
        if (h.f.b.l.a(this.L.f(), this.f135894a) && (dVar = this.f135896c) != null) {
            this.y = true;
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d.a(dVar, this.z, 2);
            if (k.a(this.f135897d)) {
                e().b();
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f135897d);
            a(arrayList);
        }
    }

    public final void f() {
        if (!this.f135906m.isEmpty()) {
            for (com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar : this.f135906m) {
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135896c;
                if (dVar != null) {
                    dVar.a(aVar);
                }
            }
            this.f135906m.clear();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        k();
        this.f135897d.clear();
        d e2 = e();
        int i2 = Build.VERSION.SDK_INT;
        e2.f135986a.quitSafely();
        Handler handler = e2.f135987b;
        androidx.fragment.app.e eVar = null;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        c.f135963c = true;
        com.ss.android.ugc.tools.view.a.c cVar = this.D;
        if (cVar == null) {
            androidx.fragment.app.e eVar2 = this.n;
            if (eVar2 instanceof com.ss.android.ugc.tools.view.a.c) {
                eVar = eVar2;
            }
            cVar = (com.ss.android.ugc.tools.view.a.c) eVar;
            if (cVar == null) {
                return;
            }
        }
        cVar.b(j());
    }

    private void k() {
        m<List<j>, List<j>, h.z> mVar;
        String effectId;
        d e2 = e();
        Effect effect = this.f135894a;
        if (!(effect == null || (effectId = effect.getEffectId()) == null)) {
            Long.parseLong(effectId);
        }
        e2.c();
        e().f135990e = null;
        h();
        if ((!this.A.isEmpty()) && (mVar = this.I) != null) {
            mVar.invoke(n.k(this.A), h.a.z.INSTANCE);
        }
        this.x = false;
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135896c;
        if (dVar != null) {
            dVar.c();
            dVar.e();
        }
        this.f135895b = null;
        this.f135894a = null;
        b bVar = this.q;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void g() {
        Boolean bool;
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135896c;
        if (dVar != null) {
            this.y = true;
            a aVar = this.z;
            String str = null;
            if (aVar != null) {
                h.f.a.a<Boolean> aVar2 = this.M;
                if (aVar2 != null) {
                    bool = aVar2.invoke();
                } else {
                    bool = null;
                }
                aVar.f135928f = bool;
            }
            a aVar3 = this.z;
            Effect effect = this.f135894a;
            if (effect != null) {
                str = effect.getEffectId();
            }
            dVar.a(aVar3, str);
            if (k.a(this.f135897d)) {
                e().b();
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f135897d);
            a(arrayList);
        }
    }

    public final void h() {
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar = this.f135895b;
        if (aVar != null) {
            Integer valueOf = Integer.valueOf(aVar.f135951i);
            String str = "";
            if (valueOf != null) {
                if (valueOf.intValue() == 1) {
                    m<String, String, h.z> mVar = this.J;
                    String c2 = aVar.c();
                    if (c2 == null) {
                        c2 = str;
                    }
                    mVar.invoke(c2, str);
                } else if (valueOf.intValue() == 3) {
                    m<String, j, h.z> mVar2 = this.K;
                    String c3 = aVar.c();
                    if (c3 != null) {
                        str = c3;
                    }
                    mVar2.invoke(str, new j("", 0, 3, null, null, null, 56));
                }
            }
        }
    }

    private final void l() {
        int i2;
        Integer valueOf;
        String c2;
        String c3;
        if (!k.a(this.f135897d)) {
            int size = this.f135897d.size();
            ArrayList<j> arrayList = this.N;
            if (arrayList != null) {
                i2 = arrayList.size();
            } else {
                i2 = 0;
            }
            ArrayList arrayList2 = new ArrayList(size + i2);
            ArrayList<j> arrayList3 = this.N;
            String str = "";
            if (arrayList3 != null) {
                for (T t2 : arrayList3) {
                    com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar = new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a(t2.f135808b, str, true);
                    aVar.f135951i = 3;
                    aVar.f135943a = t2.f135811e;
                    aVar.f135952j = t2.f135812f;
                    arrayList2.add(aVar);
                }
            }
            Iterator<String> it = this.f135897d.iterator();
            while (it.hasNext()) {
                String next = it.next();
                h.f.b.l.b(next, str);
                arrayList2.add(new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a(next, str, true));
            }
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135896c;
            if (dVar != null) {
                dVar.a(arrayList2);
            }
            if (k.b(this.N)) {
                ArrayList<j> arrayList4 = this.N;
                String str2 = null;
                j jVar = arrayList4 != null ? (j) n.g((List) arrayList4) : null;
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar2 = this.f135896c;
                if (dVar2 != null) {
                    if (jVar != null) {
                        str2 = jVar.f135808b;
                    }
                    dVar2.a(str2);
                }
                this.f135895b = b(jVar);
                if (jVar != null && (valueOf = Integer.valueOf(jVar.f135810d)) != null) {
                    if (valueOf.intValue() == 1) {
                        m<String, String, h.z> mVar = this.J;
                        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar2 = this.f135895b;
                        if (!(aVar2 == null || (c3 = aVar2.c()) == null)) {
                            str = c3;
                        }
                        mVar.invoke(str, jVar.f135808b);
                    } else if (valueOf.intValue() == 3) {
                        m<String, j, h.z> mVar2 = this.K;
                        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar3 = this.f135895b;
                        if (!(aVar3 == null || (c2 = aVar3.c()) == null)) {
                            str = c2;
                        }
                        mVar2.invoke(str, jVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UploadPicStickerARPresenter f135915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f135916b;

        static {
            Covode.recordClassIndex(88814);
        }

        g(UploadPicStickerARPresenter uploadPicStickerARPresenter, Effect effect) {
            this.f135915a = uploadPicStickerARPresenter;
            this.f135916b = effect;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f135915a.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void b(l.a aVar) {
        h.f.b.l.d(aVar, "");
        v = false;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        boolean z2;
        h.f.b.l.d(aVar, "");
        Effect effect = aVar.f135378a;
        if (this.I != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        a a2 = c.a(effect, z2);
        this.z = a2;
        if (a2 != null) {
            return a2.f135924b;
        }
        return false;
    }

    static final class d<T> implements u<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UploadPicStickerARPresenter f135911a;

        static {
            Covode.recordClassIndex(88811);
        }

        d(UploadPicStickerARPresenter uploadPicStickerARPresenter) {
            this.f135911a = uploadPicStickerARPresenter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Boolean bool) {
            if (h.f.b.l.a((Object) bool, (Object) true)) {
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135911a.f135896c;
                if (dVar != null && dVar.h()) {
                    com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.c cVar = dVar.f136011e;
                    if (!cVar.isShowing()) {
                        cVar.show();
                        dVar.f136012f = false;
                        return;
                    }
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar2 = this.f135911a.f135896c;
            if (dVar2 != null) {
                dVar2.f();
            }
        }
    }

    private final Boolean a(Effect effect) {
        q<Effect, Handler, DialogInterface.OnDismissListener, Dialog> qVar = this.H;
        if (qVar == null) {
            return null;
        }
        if (this.n.isFinishing()) {
            return false;
        }
        Handler handler = e().f135987b;
        if (handler == null) {
            h.f.b.l.b();
        }
        Dialog invoke = qVar.invoke(effect, handler, new g(this, effect));
        if (invoke != null && !this.n.isFinishing()) {
            try {
                invoke.show();
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    private final com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a b(j jVar) {
        Integer num;
        String effectId;
        String effectId2;
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar = null;
        if (jVar != null) {
            num = Integer.valueOf(jVar.f135810d);
        } else {
            num = null;
        }
        String str = "";
        if (num != null) {
            if (num.intValue() == 1) {
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar2 = new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a(jVar.f135808b, str, true);
                aVar2.f135951i = 1;
                aVar2.f135952j = jVar.f135812f;
                aVar2.f135953k = jVar.f135813g;
                aVar2.f135943a = jVar.f135811e;
                Effect effect = this.f135894a;
                if (!(effect == null || (effectId2 = effect.getEffectId()) == null)) {
                    str = effectId2;
                }
                aVar2.f135948f = str;
                Effect effect2 = this.f135894a;
                if (effect2 != null) {
                    a(effect2, aVar2);
                }
                return aVar2;
            } else if (num.intValue() == 3) {
                aVar = new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a(jVar.f135808b, str, true);
                aVar.f135951i = 3;
                aVar.f135952j = jVar.f135812f;
                aVar.f135953k = jVar.f135813g;
                aVar.f135943a = jVar.f135811e;
                Effect effect3 = this.f135894a;
                if (!(effect3 == null || (effectId = effect3.getEffectId()) == null)) {
                    str = effectId;
                }
                aVar.f135948f = str;
                Effect effect4 = this.f135894a;
                if (effect4 != null) {
                    a(effect4, aVar);
                }
            }
        }
        return aVar;
    }

    static final class e<T> implements u<com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UploadPicStickerARPresenter f135912a;

        static {
            Covode.recordClassIndex(88812);
        }

        e(UploadPicStickerARPresenter uploadPicStickerARPresenter) {
            this.f135912a = uploadPicStickerARPresenter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.b bVar) {
            Handler handler;
            String str;
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.b bVar2 = bVar;
            if (bVar2 != null) {
                int i2 = bVar2.f135957a;
                if (i2 == 30) {
                    this.f135912a.f135899f = System.currentTimeMillis();
                    com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135912a.f135896c;
                    if (dVar != null && (handler = this.f135912a.e().f135987b) != null && dVar.h() && !dVar.f136011e.isShowing()) {
                        handler.postDelayed(new d.e(dVar), 300);
                    }
                    this.f135912a.f135898e = bVar2.f135960d;
                    b bVar3 = this.f135912a.q;
                    if (bVar3 != null) {
                        bVar3.a(this.f135912a.f135900g);
                    }
                } else if (i2 == 31) {
                    if (TextUtils.isEmpty(this.f135912a.f135898e) || h.f.b.l.a((Object) this.f135912a.f135898e, (Object) bVar2.f135960d)) {
                        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar2 = this.f135912a.f135896c;
                        if (dVar2 != null) {
                            dVar2.f();
                        }
                        m<Long, String, h.z> mVar = this.f135912a.r;
                        if (mVar != null) {
                            Long valueOf = Long.valueOf(System.currentTimeMillis() - this.f135912a.f135899f);
                            Effect effect = this.f135912a.f135894a;
                            if (effect != null) {
                                str = effect.getEffectId();
                            } else {
                                str = null;
                            }
                            mVar.invoke(valueOf, str);
                        }
                        b bVar4 = this.f135912a.q;
                        if (bVar4 != null) {
                            bVar4.a(this.f135912a.f135900g);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
        if (r1 != null) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r8) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter.a(int):void");
    }

    public final void b(List<j> list) {
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar = this.f135895b;
        if (aVar != null) {
            this.E.a("");
            int i2 = 0;
            for (T t2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                String str = aVar.c() + i3;
                h.f.b.l.d(str, "");
                t2.f135807a = str;
                i2 = i3;
            }
            m<List<j>, List<j>, h.z> mVar = this.I;
            if (mVar != null) {
                mVar.invoke(n.k(this.A), list);
            }
            h.f.a.b<List<String>, h.z> bVar = this.G;
            if (bVar != null) {
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f135808b);
                }
                bVar.invoke(arrayList);
            }
            this.f135900g = true;
            List<j> list2 = this.A;
            list2.clear();
            list2.addAll(list);
        }
    }

    public final void c(List<j> list) {
        this.f135895b = b((j) n.g((List) list));
        a aVar = this.z;
        int i2 = 0;
        if (aVar != null && aVar.f135925c) {
            b(list);
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135896c;
            if (dVar != null) {
                h.f.b.l.d(list, "");
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a.a aVar2 = dVar.f136010d;
                aVar2.g();
                h.f.b.l.d(list, "");
                list.size();
                for (j jVar : list) {
                    Iterator<com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a> it = aVar2.f135933d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a next = it.next();
                        if (h.f.b.l.a((Object) jVar.f135808b, (Object) next.f135944b)) {
                            int size = aVar2.f135934e.size() + 1;
                            aVar2.f135934e.put(next, Integer.valueOf(size));
                            next.f135954l = size;
                            break;
                        }
                    }
                }
                aVar2.notifyDataSetChanged();
                int c2 = aVar2.c();
                a aVar3 = dVar.f136007a;
                if (aVar3 != null) {
                    i2 = aVar3.f135926d;
                }
                if (c2 >= i2) {
                    View j2 = dVar.j();
                    if (j2 != null) {
                        j2.setAlpha(1.0f);
                        return;
                    }
                    return;
                }
                View j3 = dVar.j();
                if (j3 != null) {
                    j3.setAlpha(0.4f);
                }
            }
        } else if (!list.isEmpty()) {
            int i3 = ((j) n.g((List) list)).f135810d;
            if (i3 == 1) {
                String str = ((j) n.g((List) list)).f135808b;
                a(str);
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar2 = this.f135896c;
                if (dVar2 != null) {
                    dVar2.f136010d.d();
                    dVar2.a(str);
                }
            } else if (i3 == 3) {
                j jVar2 = (j) n.g((List) list);
                a(jVar2);
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar3 = this.f135896c;
                String str2 = null;
                if (dVar3 != null) {
                    dVar3.f136010d.d();
                    dVar3.a(jVar2 != null ? jVar2.f135808b : null);
                }
                com.ss.android.ugc.tools.f.d dVar4 = this.t;
                if (dVar4 != null) {
                    com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar4 = this.f135895b;
                    String str3 = aVar4 != null ? aVar4.f135943a : null;
                    com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar5 = this.f135895b;
                    if (aVar5 != null) {
                        str2 = aVar5.f135948f;
                    }
                    dVar4.a(str3, str2, "giphy_tab");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(View view) {
        h.f.b.l.d(view, "");
        ViewStubCompat viewStubCompat = (ViewStubCompat) view.findViewById(R.id.edb);
        if (viewStubCompat != null) {
            this.f135896c = new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d(viewStubCompat, view.findViewById(R.id.c87), view.findViewById(R.id.f31), this.L.a(), view.findViewById(R.id.bz2), view.findViewById(R.id.b5z), view.findViewById(R.id.b60), (ViewGroup) view.findViewById(R.id.cfo), this.n, this.t, new f(this, view));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(l.a aVar) {
        Effect effect;
        com.ss.android.ugc.tools.f.d dVar;
        h.f.b.l.d(aVar, "");
        boolean z2 = true;
        v = true;
        if (aVar == l.a.AFTER_ANIMATE && (effect = this.f135894a) != null) {
            if (this.y) {
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar2 = this.f135896c;
                if (dVar2 != null) {
                    String effectId = effect.getEffectId();
                    if (dVar2.f136008b.getVisibility() == 0 && (dVar = dVar2.f136015i) != null) {
                        if (dVar2.f136009c.getVisibility() != 0) {
                            z2 = false;
                        }
                        dVar.a(effectId, z2);
                        return;
                    }
                    return;
                }
                return;
            }
            g();
        }
    }

    public static void a(Effect effect, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar) {
        String str;
        if (!aVar.a()) {
            if (effect != null) {
                aVar.a(effect.getSdkExtra());
            }
            c.f135964d = aVar.f135949g.getPl().getGuide();
            c.f135963c = aVar.f135949g.getPl().getLoading();
        }
        String str2 = null;
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        aVar.f135948f = str;
        if (effect != null) {
            str2 = effect.getExtra();
        }
        aVar.b(str2);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        int i2;
        Integer valueOf;
        String str;
        String str2;
        String str3;
        String str4;
        Effect effect;
        String str5 = "";
        h.f.b.l.d(bVar, str5);
        h.f.b.l.d(aVar, str5);
        androidx.fragment.app.e eVar = this.n;
        h.f.b.l.d(eVar, str5);
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = androidx.core.content.b.a(eVar, "android.permission.WRITE_EXTERNAL_STORAGE");
        } else {
            i2 = 0;
        }
        j jVar = null;
        String str6 = null;
        String str7 = null;
        jVar = null;
        if (i2 != 0) {
            h.f.a.a<h.z> aVar2 = this.O;
            if (aVar2 != null) {
                aVar2.invoke();
                return;
            }
            androidx.fragment.app.e eVar2 = this.n;
            if (eVar2 != null) {
                str6 = eVar2.getString(R.string.doy);
            }
            new com.ss.android.ugc.tools.view.widget.j(eVar2, str6, 0, 1, (byte) 0).a();
            return;
        }
        Effect effect2 = aVar.f135378a;
        if (effect2 == null || (effect = this.f135894a) == null || !h.f.b.l.a((Object) effect.getEffectId(), (Object) effect2.getEffectId())) {
            k();
        }
        if (this.f135895b == null) {
            this.f135895b = new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a();
        }
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar3 = this.f135895b;
        if (aVar3 != null) {
            a(effect2, aVar3);
        }
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar4 = this.f135895b;
        if (aVar4 == null) {
            h.f.b.l.b();
        }
        this.f135903j = aVar4.f135949g.getPl().getFaceCountMin();
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar5 = this.f135895b;
        if (aVar5 == null) {
            h.f.b.l.b();
        }
        this.f135904k = aVar5.f135949g.getPl().getFaceCountMax();
        com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar6 = this.f135895b;
        if (!(aVar6 == null || (valueOf = Integer.valueOf(aVar6.f135951i)) == null)) {
            if (valueOf.intValue() == 1) {
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar7 = this.f135895b;
                if (aVar7 != null) {
                    str7 = aVar7.f135944b;
                }
                a(str7);
            } else if (valueOf.intValue() == 3) {
                com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar8 = this.f135895b;
                if (!(aVar8 == null || (str = aVar8.f135944b) == null)) {
                    com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar9 = this.f135895b;
                    if (!(aVar9 == null || (str4 = aVar9.f135943a) == null)) {
                        str5 = str4;
                    }
                    com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar10 = this.f135895b;
                    if (aVar10 == null || (str2 = aVar10.f135952j) == null) {
                        str2 = "GIPHY";
                    }
                    com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a aVar11 = this.f135895b;
                    if (aVar11 == null || (str3 = aVar11.f135953k) == null) {
                        str3 = "unknown";
                    }
                    jVar = new j(str, 0, 3, str5, str2, str3);
                }
                a(jVar);
            }
        }
        this.f135894a = effect2;
        Boolean a2 = a(effect2);
        if (a2 == null) {
            g();
        } else if (a2.booleanValue()) {
            com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.d dVar = this.f135896c;
            if (dVar != null) {
                dVar.b();
            }
        } else {
            g();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.e
    public final void a(int i2, int i3, int i4, String str) {
        boolean z2;
        a aVar = this.z;
        if (aVar == null || !aVar.f135925c) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i2 == 31 || i2 == 30) && !z2) {
            t<com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.b> a2 = ((UploadPicStickerMessageModule) ae.a(this.n).a(UploadPicStickerMessageModule.class)).a();
            if (str == null) {
                h.f.b.l.b();
            }
            a2.postValue(new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.b(i2, i3, i4, str));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: h.f.a.b<? super java.util.List<java.lang.String>, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: h.f.a.m<? super java.lang.Long, ? super java.lang.String, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: h.f.a.q<? super com.ss.android.ugc.effectmanager.effect.model.Effect, ? super android.os.Handler, ? super android.content.DialogInterface$OnDismissListener, ? extends android.app.Dialog> */
    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: h.f.a.m<? super java.lang.String, ? super java.lang.String, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: h.f.a.m<? super java.lang.String, ? super com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private UploadPicStickerARPresenter(androidx.fragment.app.e eVar, com.ss.android.ugc.tools.view.a.c cVar, com.ss.android.ugc.aweme.sticker.c.a aVar, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.b.a aVar2, b bVar2, b bVar3, h.f.a.b<? super List<String>, h.z> bVar4, m<? super Long, ? super String, h.z> mVar, q<? super Effect, ? super Handler, ? super DialogInterface.OnDismissListener, ? extends Dialog> qVar, m<? super String, ? super String, h.z> mVar2, m<? super String, ? super j, h.z> mVar3, com.ss.android.ugc.tools.f.d dVar, LiveData<List<String>> liveData, o oVar, com.ss.android.ugc.aweme.sticker.k.e eVar2, h.f.a.a<Boolean> aVar3, ArrayList<j> arrayList, h.f.a.a<h.z> aVar4) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar2, "");
        h.f.b.l.d(bVar2, "");
        h.f.b.l.d(mVar2, "");
        h.f.b.l.d(mVar3, "");
        h.f.b.l.d(liveData, "");
        h.f.b.l.d(oVar, "");
        this.n = eVar;
        this.D = cVar;
        this.o = aVar;
        this.E = bVar;
        this.F = aVar2;
        this.p = bVar2;
        this.q = bVar3;
        this.G = bVar4;
        this.r = mVar;
        this.H = qVar;
        this.s = null;
        this.I = null;
        this.J = mVar2;
        this.K = mVar3;
        this.t = dVar;
        this.L = oVar;
        this.u = eVar2;
        this.M = aVar3;
        this.N = arrayList;
        this.O = aVar4;
        this.f135895b = new com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a();
        this.f135897d = new ArrayList<>();
        this.f135899f = System.currentTimeMillis();
        this.A = new ArrayList();
        this.f135903j = 2;
        this.f135904k = 5;
        this.f135905l = true;
        this.f135906m = new ArrayList();
        this.B = h.i.a((h.f.a.a) new h(this));
        this.C = h.i.a((h.f.a.a) new c(this));
        eVar.getLifecycle().a(this);
        ac a2 = ae.a(eVar).a(UploadPicStickerMessageModule.class);
        h.f.b.l.b(a2, "");
        UploadPicStickerMessageModule uploadPicStickerMessageModule = (UploadPicStickerMessageModule) a2;
        ((LiveData) uploadPicStickerMessageModule.f135919a.getValue()).observe(eVar, new d(this));
        if (c.f135963c) {
            uploadPicStickerMessageModule.a().observe(eVar, new e(this));
        }
        liveData.observe(eVar, AnonymousClass1.f135907a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UploadPicStickerARPresenter(androidx.fragment.app.e eVar, com.ss.android.ugc.tools.view.a.c cVar, com.ss.android.ugc.aweme.sticker.c.a aVar, com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.d.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.b.a aVar2, b bVar2, b bVar3, h.f.a.b bVar4, m mVar, q qVar, m mVar2, m mVar3, com.ss.android.ugc.tools.f.d dVar, LiveData liveData, o oVar, com.ss.android.ugc.aweme.sticker.k.e eVar2, h.f.a.a aVar3, ArrayList arrayList, h.f.a.a aVar4, int i2) {
        this(eVar, (i2 & 2) != 0 ? null : cVar, aVar, bVar, aVar2, bVar2, (i2 & 64) != 0 ? null : bVar3, (i2 & 128) != 0 ? null : bVar4, (i2 & 256) != 0 ? null : mVar, (i2 & 512) != 0 ? null : qVar, mVar2, mVar3, dVar, liveData, oVar, (131072 & i2) != 0 ? null : eVar2, (262144 & i2) != 0 ? null : aVar3, (524288 & i2) != 0 ? null : arrayList, (i2 & 1048576) == 0 ? aVar4 : null);
    }
}
