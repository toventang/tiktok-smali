package com.ss.android.ugc.gamora.recorder.sticker.c;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.u;
import com.bytedance.als.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.t;
import com.ss.android.ugc.aweme.views.k;
import com.ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import h.z;
import java.lang.reflect.Type;
import java.util.List;

public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final C4009g f148405d = new C4009g((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Effect f148406a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.b<String, z> f148407b;

    /* renamed from: c  reason: collision with root package name */
    public final RemoteImageView f148408c;

    static {
        Covode.recordClassIndex(97794);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.g$g  reason: collision with other inner class name */
    public static final class C4009g {
        static {
            Covode.recordClassIndex(97803);
        }

        private C4009g() {
        }

        public /* synthetic */ C4009g(byte b2) {
            this();
        }
    }

    static final class d<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f148426a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f148427b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f148428c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f148429d;

        static {
            Covode.recordClassIndex(97800);
        }

        d(g gVar, androidx.lifecycle.m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f148426a = gVar;
            this.f148427b = mVar;
            this.f148428c = remoteImageView;
            this.f148429d = remoteImageView2;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f148426a.f148406a = (Effect) obj;
        }
    }

    static final class c<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f148422a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f148423b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f148424c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f148425d;

        static {
            Covode.recordClassIndex(97799);
        }

        c(g gVar, androidx.lifecycle.m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f148422a = gVar;
            this.f148423b = mVar;
            this.f148424c = remoteImageView;
            this.f148425d = remoteImageView2;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            RemoteImageView remoteImageView;
            Effect effect = (Effect) obj;
            if (effect != null && (remoteImageView = this.f148425d) != null) {
                g.a(remoteImageView, effect);
            }
        }
    }

    public static final class f extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f148434a;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f148435d;

        static {
            Covode.recordClassIndex(97802);
        }

        @Override // com.ss.android.ugc.aweme.views.k
        public final void a(View view) {
            l.d(view, "");
            ((com.bytedance.creativex.recorder.sticker.a.c) this.f148434a.a((Type) com.bytedance.creativex.recorder.sticker.a.c.class, (String) null)).a(true);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(com.bytedance.o.f fVar, RemoteImageView remoteImageView) {
            super(0, false, 3);
            this.f148434a = fVar;
            this.f148435d = remoteImageView;
        }
    }

    static final class a<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f148414a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f148415b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f148416c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f148417d;

        static {
            Covode.recordClassIndex(97797);
        }

        a(g gVar, androidx.lifecycle.m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f148414a = gVar;
            this.f148415b = mVar;
            this.f148416c = remoteImageView;
            this.f148417d = remoteImageView2;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            RemoteImageView remoteImageView;
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue() && (remoteImageView = this.f148414a.f148408c) != null) {
                remoteImageView.setVisibility(8);
            }
            RemoteImageView remoteImageView2 = this.f148416c;
            if (remoteImageView2 != null && remoteImageView2.getVisibility() == 0) {
                remoteImageView2.setVisibility(8);
            }
        }
    }

    static final class b<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f148418a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f148419b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f148420c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f148421d;

        static {
            Covode.recordClassIndex(97798);
        }

        b(g gVar, androidx.lifecycle.m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f148418a = gVar;
            this.f148419b = mVar;
            this.f148420c = remoteImageView;
            this.f148421d = remoteImageView2;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            float f2;
            Boolean bool = (Boolean) obj;
            RemoteImageView remoteImageView = this.f148421d;
            if (remoteImageView != null) {
                l.b(bool, "");
                remoteImageView.setEnabled(bool.booleanValue());
                if (bool.booleanValue()) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.5f;
                }
                remoteImageView.setAlpha(f2);
            }
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f148430a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f148431b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f148432c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f148433d;

        static {
            Covode.recordClassIndex(97801);
        }

        e(g gVar, androidx.lifecycle.m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f148430a = gVar;
            this.f148431b = mVar;
            this.f148432c = remoteImageView;
            this.f148433d = remoteImageView2;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                g gVar = this.f148430a;
                RemoteImageView remoteImageView = gVar.f148408c;
                if (remoteImageView != null) {
                    remoteImageView.setVisibility(0);
                }
                gVar.f148407b.invoke("show_delete_prop");
                return;
            }
            RemoteImageView remoteImageView2 = this.f148430a.f148408c;
            if (remoteImageView2 != null) {
                remoteImageView2.setVisibility(8);
            }
        }
    }

    public static void a(RemoteImageView remoteImageView, Effect effect) {
        List<String> urlList;
        String str;
        l.d(effect, "");
        UrlModel iconUrl = effect.getIconUrl();
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) n.h((List) urlList)) != null) {
            com.ss.android.ugc.tools.c.a.a(remoteImageView, str, -1, -1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: h.f.a.b<? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public g(androidx.appcompat.app.d dVar, androidx.lifecycle.m mVar, boolean z, final j jVar, h.f.a.b<? super String, z> bVar, ViewGroup viewGroup, final RemoteImageView remoteImageView, RemoteImageView remoteImageView2, RemoteImageView remoteImageView3, com.bytedance.o.f fVar) {
        int i2;
        l.d(dVar, "");
        l.d(mVar, "");
        l.d(jVar, "");
        l.d(bVar, "");
        l.d(fVar, "");
        this.f148407b = bVar;
        this.f148408c = remoteImageView3;
        final z.e eVar = new z.e();
        eVar.element = null;
        if (remoteImageView3 != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            remoteImageView3.setVisibility(i2);
        }
        if (z) {
            bVar.invoke("show_delete_prop");
        }
        if (remoteImageView3 != null) {
            remoteImageView3.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.gamora.recorder.sticker.c.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f148409a;

                static {
                    Covode.recordClassIndex(97795);
                }

                {
                    this.f148409a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    com.ss.android.ugc.aweme.sticker.f.e.b(jVar);
                    this.f148409a.f148408c.setVisibility(8);
                    this.f148409a.f148407b.invoke("click_delete_prop");
                }
            });
        }
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new f(fVar, remoteImageView));
            if (remoteImageView != null) {
                viewGroup.setOnTouchListener(new t(1.2f, 150, remoteImageView));
            }
        }
        jVar.t().n().b().observe(mVar, new u(this) {
            /* class com.ss.android.ugc.gamora.recorder.sticker.c.g.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f148411a;

            static {
                Covode.recordClassIndex(97796);
            }

            {
                this.f148411a = r1;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
                if (r2.equals(r2.element) == false) goto L_0x001b;
             */
            @Override // androidx.lifecycle.u
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void onChanged(java.lang.Object r2) {
                /*
                    r1 = this;
                    com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2
                    if (r2 != 0) goto L_0x000b
                    com.ss.android.ugc.gamora.recorder.sticker.c.g r0 = r1.f148411a
                    com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r0.f148406a
                    if (r2 != 0) goto L_0x000b
                    return
                L_0x000b:
                    h.f.b.z$e r0 = r2
                    T r0 = r0.element
                    if (r0 == 0) goto L_0x001b
                    h.f.b.z$e r0 = r2
                    T r0 = r0.element
                    boolean r0 = r2.equals(r0)
                    if (r0 != 0) goto L_0x0020
                L_0x001b:
                    com.ss.android.ugc.aweme.widgetcompat.RemoteImageView r0 = r12
                    com.ss.android.ugc.gamora.recorder.sticker.c.g.a(r0, r2)
                L_0x0020:
                    h.f.b.z$e r0 = r2
                    r0.element = r2
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.c.g.AnonymousClass2.onChanged(java.lang.Object):void");
            }
        });
        jVar.d().a(mVar, new a(this, mVar, remoteImageView2, remoteImageView));
        jVar.e().a(mVar, new b(this, mVar, remoteImageView2, remoteImageView));
        jVar.c().a().a(mVar, new c(this, mVar, remoteImageView2, remoteImageView));
        jVar.c().b().a(mVar, new d(this, mVar, remoteImageView2, remoteImageView));
        jVar.B().observe(mVar, new e(this, mVar, remoteImageView2, remoteImageView));
    }
}
