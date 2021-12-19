package com.ss.android.ugc.aweme.compliance.business.policynotice.ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.o;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.dialog.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;

public final class b implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: a  reason: collision with root package name */
    public boolean f77112a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.tux.dialog.a f77113b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f77114c = true;

    /* renamed from: d  reason: collision with root package name */
    public final Context f77115d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.compliance.api.model.i f77116e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f77117f = new Handler();

    static {
        Covode.recordClassIndex(47659);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(61, new org.greenrobot.eventbus.g(b.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b$b  reason: collision with other inner class name */
    public static final class C1771b extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(47661);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1771b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f77114c = false;
            com.bytedance.tux.dialog.a aVar = this.this$0.f77113b;
            if (aVar != null) {
                aVar.dismiss();
            }
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(47671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f77114c = false;
            com.bytedance.tux.dialog.a aVar = this.this$0.f77113b;
            if (aVar != null) {
                aVar.dismiss();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77121a;

        static {
            Covode.recordClassIndex(47674);
        }

        k(b bVar) {
            this.f77121a = bVar;
        }

        public final void run() {
            com.bytedance.tux.dialog.a aVar = this.f77121a.f77113b;
            if (aVar == null || aVar.f44796c.isShowing()) {
                com.ss.android.ugc.aweme.video.i O = v.O();
                l.b(O, "");
                if (O.o()) {
                    v.O().B();
                    this.f77121a.f77112a = true;
                    return;
                }
                this.f77121a.b();
            }
        }
    }

    public final void b() {
        com.ss.android.ugc.aweme.video.i O = v.O();
        l.b(O, "");
        if (O.o()) {
            v.O().B();
            this.f77112a = true;
            return;
        }
        this.f77117f.postDelayed(new k(this), 1000);
    }

    public final void a() {
        cg.a(this);
        com.bytedance.tux.dialog.b bVar = (com.bytedance.tux.dialog.b) a.C1094a.a(new ContextThemeWrapper(this.f77115d, (int) R.style.o1)).b(this.f77116e.getTitle()).d(com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(this.f77115d, this.f77116e.getBody(), this.f77116e.getPolicyLinkList(), new g(this), new h(this))).a(l.a((Object) this.f77116e.isSubPopUp(), (Object) true)).a(new i(this)).a(new j(this));
        if (l.a((Object) this.f77116e.getFirstButtonHighlight(), (Object) true)) {
            com.bytedance.tux.dialog.b.e.a(bVar, new c(this));
        } else {
            com.bytedance.tux.dialog.b.c.a(bVar, new d(this));
        }
        if (!TextUtils.isEmpty(this.f77116e.getIcon_url())) {
            SmartImageView smartImageView = new SmartImageView(this.f77115d);
            smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(n.a(this.f77116e.getIcon_url()));
            urlModel.setWidth(com.ss.android.ugc.aweme.base.utils.n.a(48.0d));
            urlModel.setHeight(com.ss.android.ugc.aweme.base.utils.n.a(48.0d));
            com.bytedance.lighten.a.v b2 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel)).b(em.a(201));
            b2.f39907c = true;
            b2.E = smartImageView;
            b2.a(new e(smartImageView));
            com.bytedance.tux.dialog.e.f.a(bVar, smartImageView, f.f77119a);
        }
        com.bytedance.tux.dialog.a a2 = bVar.a();
        this.f77113b = a2;
        if (a2 != null) {
            a2.b().show();
        }
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(this.f77116e.getBusiness(), this.f77116e.getStyle());
    }

    public static final class e extends com.bytedance.lighten.a.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartImageView f77118a;

        static {
            Covode.recordClassIndex(47668);
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, o oVar, Animatable animatable) {
        }

        e(SmartImageView smartImageView) {
            this.f77118a = smartImageView;
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, Throwable th) {
            this.f77118a.setImageResource(2131231826);
        }
    }

    public static final class j implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77120a;

        static {
            Covode.recordClassIndex(47673);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(b bVar) {
            this.f77120a = bVar;
        }

        @Override // com.bytedance.tux.dialog.f.a
        public final void a(boolean z) {
            if (z) {
                this.f77120a.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.compliance.api.model.j, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(47660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
            com.ss.android.ugc.aweme.compliance.api.model.j jVar2 = jVar;
            l.d(jVar2, "");
            this.this$0.b(jVar2);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.tux.dialog.e.e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f77119a = new f();

        static {
            Covode.recordClassIndex(47669);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.e.e eVar) {
            com.bytedance.tux.dialog.e.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44869a = 48;
            eVar2.f44870b = 48;
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<com.ss.android.ugc.aweme.compliance.api.model.j, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(47670);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
            com.ss.android.ugc.aweme.compliance.api.model.j jVar2 = jVar;
            l.d(jVar2, "");
            this.this$0.b(jVar2);
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.b<com.bytedance.tux.dialog.a, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(47672);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
            l.d(aVar, "");
            b bVar = this.this$0;
            cg.b(bVar);
            if (bVar.f77112a && bVar.f77114c) {
                v.O().y();
                bVar.f77112a = false;
            }
            return z.f158842a;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        com.bytedance.tux.dialog.a aVar;
        l.d(jVar, "");
        if (TextUtils.equals(jVar.f91311b.optString("eventName"), "cancel_post_success") && (aVar = this.f77113b) != null) {
            aVar.dismiss();
        }
    }

    static final class c extends m implements h.f.a.b<com.bytedance.tux.dialog.b.d, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(47662);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.d dVar) {
            com.bytedance.tux.dialog.b.d dVar2 = dVar;
            l.d(dVar2, "");
            for (final com.ss.android.ugc.aweme.compliance.api.model.j jVar : this.this$0.f77116e.getActions()) {
                if (jVar.f76669b) {
                    dVar2.a(jVar.f76668a, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                        /* class com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b.c.AnonymousClass1 */
                        final /* synthetic */ c this$0;

                        static {
                            Covode.recordClassIndex(47663);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                            com.bytedance.tux.dialog.b.a aVar2 = aVar;
                            l.d(aVar2, "");
                            this.this$0.this$0.a(jVar);
                            aVar2.f44816b = false;
                            return z.f158842a;
                        }
                    });
                } else {
                    dVar2.b(jVar.f76668a, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                        /* class com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b.c.AnonymousClass2 */
                        final /* synthetic */ c this$0;

                        static {
                            Covode.recordClassIndex(47664);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                            com.bytedance.tux.dialog.b.a aVar2 = aVar;
                            l.d(aVar2, "");
                            this.this$0.this$0.a(jVar);
                            aVar2.f44816b = false;
                            return z.f158842a;
                        }
                    });
                }
            }
            return z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(jVar, this.f77115d, new a(this), new C1771b(this));
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(jVar.f76668a, this.f77116e.getBusiness(), this.f77116e.getStyle());
    }

    static final class d extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(47665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            boolean z;
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            for (final com.ss.android.ugc.aweme.compliance.api.model.j jVar : this.this$0.f77116e.getActions()) {
                if (jVar.f76669b) {
                    bVar2.a(jVar.f76668a, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                        /* class com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b.d.AnonymousClass1 */
                        final /* synthetic */ d this$0;

                        static {
                            Covode.recordClassIndex(47666);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                            com.bytedance.tux.dialog.b.a aVar2 = aVar;
                            l.d(aVar2, "");
                            this.this$0.this$0.a(jVar);
                            aVar2.f44816b = false;
                            return z.f158842a;
                        }
                    });
                } else {
                    bVar2.b(jVar.f76668a, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                        /* class com.ss.android.ugc.aweme.compliance.business.policynotice.ui.b.d.AnonymousClass2 */
                        final /* synthetic */ d this$0;

                        static {
                            Covode.recordClassIndex(47667);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                            com.bytedance.tux.dialog.b.a aVar2 = aVar;
                            l.d(aVar2, "");
                            this.this$0.this$0.a(jVar);
                            aVar2.f44816b = false;
                            return z.f158842a;
                        }
                    });
                }
            }
            if (this.this$0.f77116e.getActions().size() > 2) {
                z = true;
            } else {
                z = false;
            }
            bVar2.f44820b = z;
            return z.f158842a;
        }
    }

    public final void b(com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(this.f77116e, jVar);
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.b();
        if (!l.a((Object) jVar.f76670c, (Object) "callback")) {
            this.f77114c = false;
        }
        com.bytedance.tux.dialog.a aVar = this.f77113b;
        if (aVar != null) {
            aVar.dismiss();
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.compliance.api.b.a(false));
    }

    public b(Context context, com.ss.android.ugc.aweme.compliance.api.model.i iVar) {
        l.d(context, "");
        l.d(iVar, "");
        this.f77115d = context;
        this.f77116e = iVar;
    }
}
