package com.ss.android.ugc.aweme.creatortools.creatorplus;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusApi;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusViewModel;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f78419f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final View f78420a;

    /* renamed from: b  reason: collision with root package name */
    final int f78421b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.fragment.app.e f78422c;

    /* renamed from: d  reason: collision with root package name */
    public final String f78423d;

    /* renamed from: e  reason: collision with root package name */
    final dm f78424e;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f78425g = i.a((h.f.a.a) new h(this));

    public final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final c f78426a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f78427b;

        static {
            Covode.recordClassIndex(48699);
        }

        static final class a extends m implements h.f.a.a<z> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f78428a = new a();

            static {
                Covode.recordClassIndex(48700);
            }

            a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* bridge */ /* synthetic */ z invoke() {
                return z.f158842a;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (l.a((Object) this.f78426a.f78410c, (Object) true)) {
                g gVar = this.f78427b;
                c cVar = this.f78426a;
                String str = cVar.f78413f;
                if (str != null && !p.a((CharSequence) str)) {
                    SmartRouter.buildRoute(gVar.f78422c, cVar.f78413f).open();
                    return;
                }
                return;
            }
            androidx.fragment.app.e eVar = this.f78427b.f78422c;
            c cVar2 = this.f78426a;
            a aVar = a.f78428a;
            l.d(eVar, "");
            l.d(cVar2, "");
            l.d("", "");
            l.d(aVar, "");
            a aVar2 = new a(eVar, cVar2, "", aVar);
            Window window = aVar2.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 17;
                attributes.flags = attributes.flags | 2 | 32 | 262144;
                window.setAttributes(attributes);
                window.setBackgroundDrawableResource(R.drawable.a3f);
            }
            aVar2.show();
        }

        public b(g gVar, c cVar) {
            l.d(cVar, "");
            this.f78427b = gVar;
            this.f78426a = cVar;
        }
    }

    static {
        Covode.recordClassIndex(48697);
    }

    public final CreatorPlusViewModel a() {
        return (CreatorPlusViewModel) this.f78425g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48698);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class h extends m implements h.f.a.a<CreatorPlusViewModel> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(48710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CreatorPlusViewModel invoke() {
            return ae.a(this.this$0.f78422c, (ad.b) null).a(CreatorPlusViewModel.class);
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f78434a;

        static {
            Covode.recordClassIndex(48706);
        }

        f(g gVar) {
            this.f78434a = gVar;
        }

        public final void run() {
            g gVar = this.f78434a;
            androidx.fragment.app.e eVar = gVar.f78422c;
            com.bytedance.tux.dialog.b bVar = new com.bytedance.tux.dialog.b(eVar);
            l.c(bVar, "");
            bVar.a(new com.bytedance.tux.dialog.e.g(bVar.o, 2131231130));
            com.bytedance.tux.dialog.b.c.a(bVar.b(eVar.getString(R.string.b3b)).d(eVar.getString(R.string.b3a)), new C1824g(gVar, eVar)).a().b().show();
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            String str = "notifications";
            if (!l.a((Object) gVar.f78423d, (Object) str)) {
                str = "creator_tools";
            }
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str);
            l.b(a2, "");
            r.a("show_creator_plus_welcome_popup", a2.f66730a);
            Keva.getRepo("keva_cplus_repo").storeBoolean(e.a("ENROLL_DIALOG_SHOW_KEY"), true);
        }
    }

    public static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f78430a;

        static {
            Covode.recordClassIndex(48702);
        }

        public d(g gVar) {
            this.f78430a = gVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            BaseResponse baseResponse = (BaseResponse) obj;
            if (baseResponse == null || baseResponse.status_code != 0) {
                new com.bytedance.tux.g.b(this.f78430a.f78422c).e(R.string.g21).a(3000L).b();
                return;
            }
            b a2 = e.a();
            if (a2 != null) {
                str = a2.f78407c;
            } else {
                str = null;
            }
            SmartRouter.buildRoute(this.f78430a.f78422c, str).open(124, new OnActivityResultCallback(this) {
                /* class com.ss.android.ugc.aweme.creatortools.creatorplus.g.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f78431a;

                static {
                    Covode.recordClassIndex(48703);
                }

                {
                    this.f78431a = r1;
                }

                @Override // com.bytedance.router.OnActivityResultCallback
                public final void onActivityResult(int i2, int i3, Intent intent) {
                    if (this.f78431a.f78430a.f78422c != null && !this.f78431a.f78430a.f78422c.isFinishing() && !this.f78431a.f78430a.f78422c.isDestroyed()) {
                        this.f78431a.f78430a.a().c();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.g$g  reason: collision with other inner class name */
    static final class C1824g extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ androidx.fragment.app.e $context;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(48707);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1824g(g gVar, androidx.fragment.app.e eVar) {
            super(1);
            this.this$0 = gVar;
            this.$context = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            String string = this.$context.getString(R.string.b3_);
            l.b(string, "");
            bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.creatortools.creatorplus.g.C1824g.AnonymousClass1 */
                final /* synthetic */ C1824g this$0;

                static {
                    Covode.recordClassIndex(48708);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    CreatorPlusViewModel a2 = this.this$0.this$0.a();
                    a2.f78390a.a(CreatorPlusApi.a.b().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new CreatorPlusViewModel.a(a2), new CreatorPlusViewModel.b(a2)));
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    String str = "notifications";
                    if (!l.a((Object) this.this$0.this$0.f78423d, (Object) str)) {
                        str = "creator_tools";
                    }
                    com.ss.android.ugc.aweme.app.f.d a3 = dVar.a("enter_from", str).a("action", "agree");
                    l.b(a3, "");
                    r.a("click_creator_plus_welcome_popup", a3.f66730a);
                    return z.f158842a;
                }
            });
            String string2 = this.$context.getString(R.string.b37);
            l.b(string2, "");
            bVar2.b(string2, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.creatortools.creatorplus.g.C1824g.AnonymousClass2 */
                final /* synthetic */ C1824g this$0;

                static {
                    Covode.recordClassIndex(48709);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    String str = "notifications";
                    if (!l.a((Object) this.this$0.this$0.f78423d, (Object) str)) {
                        str = "creator_tools";
                    }
                    com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str).a("action", "cancel");
                    l.b(a2, "");
                    r.a("click_creator_plus_welcome_popup", a2.f66730a);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f78432a;

        static {
            Covode.recordClassIndex(48704);
        }

        e(g gVar) {
            this.f78432a = gVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            b a2 = e.a();
            if (a2 != null) {
                str = a2.f78406b;
            } else {
                str = null;
            }
            SmartRouter.buildRoute(this.f78432a.f78422c, l.a(str, (Object) "?enter_from=creator_tools")).open(123, new OnActivityResultCallback(this) {
                /* class com.ss.android.ugc.aweme.creatortools.creatorplus.g.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f78433a;

                static {
                    Covode.recordClassIndex(48705);
                }

                {
                    this.f78433a = r1;
                }

                @Override // com.bytedance.router.OnActivityResultCallback
                public final void onActivityResult(int i2, int i3, Intent intent) {
                    if (this.f78433a.f78432a.f78422c != null && !this.f78433a.f78432a.f78422c.isFinishing() && !this.f78433a.f78432a.f78422c.isDestroyed()) {
                        this.f78433a.f78432a.a().c();
                    }
                }
            });
            com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "creator_tools").a("enter_method", "click_apply");
            l.b(a3, "");
            r.a("click_creator_plus_banner", a3.f66730a);
        }
    }

    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f78429a;

        static {
            Covode.recordClassIndex(48701);
        }

        public c(g gVar) {
            this.f78429a = gVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num;
            boolean z2;
            List<String> urlList;
            d dVar = (d) obj;
            g gVar = this.f78429a;
            if (!(gVar.f78422c.isDestroyed() || gVar.f78422c.isFinishing())) {
                List<c> list = dVar != null ? dVar.f78415b : null;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        b bVar = new b(gVar, t);
                        UrlModel urlModel = t.f78409b;
                        String str = (urlModel == null || (urlList = urlModel.getUrlList()) == null) ? null : (String) n.h((List) urlList);
                        String str2 = t.f78412e;
                        if (str2 == null) {
                            str2 = "";
                        }
                        Boolean bool = t.f78410c;
                        if (bool != null) {
                            z2 = bool.booleanValue();
                        } else {
                            z2 = false;
                        }
                        arrayList.add(new com.ss.android.ugc.aweme.dc.f(new com.ss.android.ugc.aweme.be.f("", false, str, str2, null, null, false, z2, bVar, bVar, 1522)));
                    }
                    gVar.f78424e.a(gVar.f78421b, arrayList);
                } else {
                    new com.bytedance.tux.g.b(gVar.f78422c).e(R.string.b3e).a(3000L).b();
                }
                if (!(dVar == null || (num = dVar.f78414a) == null)) {
                    num.intValue();
                    Integer num2 = dVar.f78414a;
                    int ordinal = f.CreatorPlusStatusEnrolled.ordinal();
                    if (num2 != null && num2.intValue() == ordinal) {
                        View findViewById = gVar.f78420a.findViewById(R.id.ah2);
                        l.b(findViewById, "");
                        findViewById.setVisibility(8);
                    } else {
                        View findViewById2 = gVar.f78420a.findViewById(R.id.ah2);
                        l.b(findViewById2, "");
                        findViewById2.setVisibility(0);
                        if (gb.a()) {
                            View findViewById3 = gVar.f78420a.findViewById(R.id.ah2);
                            l.b(findViewById3, "");
                            TuxTextView tuxTextView = (TuxTextView) findViewById3.findViewById(R.id.title);
                            l.b(tuxTextView, "");
                            tuxTextView.setGravity(8388613);
                        }
                        View findViewById4 = gVar.f78420a.findViewById(R.id.ah2);
                        l.b(findViewById4, "");
                        ((TuxButton) findViewById4.findViewById(R.id.ah3)).setOnClickListener(new e(gVar));
                        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "creator_tools");
                        l.b(a2, "");
                        r.a("show_creator_plus_banner", a2.f66730a);
                    }
                    int ordinal2 = f.CreatorPlusStatusMeetsAllRequirements.ordinal();
                    if (num2 != null && num2.intValue() == ordinal2 && !Keva.getRepo("keva_cplus_repo").getBoolean(e.a("ENROLL_DIALOG_SHOW_KEY"), false)) {
                        new Handler().postDelayed(new f(gVar), 200);
                    }
                }
            }
        }
    }

    public g(View view, int i2, androidx.fragment.app.e eVar, String str, dm dmVar) {
        l.d(view, "");
        l.d(eVar, "");
        l.d(str, "");
        l.d(dmVar, "");
        this.f78420a = view;
        this.f78421b = i2;
        this.f78422c = eVar;
        this.f78423d = str;
        this.f78424e = dmVar;
        a().c();
    }
}
