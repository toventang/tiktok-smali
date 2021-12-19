package com.ss.android.ugc.aweme.dsp.playpage.playview.b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareFlavorService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.z;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class e implements com.ss.android.ugc.aweme.favorites.g.d {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playerservice.b.c f83843a;

    /* renamed from: b  reason: collision with root package name */
    String f83844b = "";

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.tux.sheet.a.a f83845c;

    /* renamed from: d  reason: collision with root package name */
    public final View f83846d;

    /* renamed from: e  reason: collision with root package name */
    private final h f83847e;

    static {
        Covode.recordClassIndex(52284);
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(BaseResponse baseResponse) {
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void e_(Exception exc) {
    }

    /* access modifiers changed from: package-private */
    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f83849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f83850b;

        static {
            Covode.recordClassIndex(52286);
        }

        a(e eVar, Aweme aweme) {
            this.f83849a = eVar;
            this.f83850b = aweme;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f83849a.a(this.f83850b);
        }
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.favorites.g.a> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(52287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.favorites.g.a invoke() {
            com.ss.android.ugc.aweme.favorites.g.a aVar = new com.ss.android.ugc.aweme.favorites.g.a();
            aVar.a_(this.this$0);
            aVar.f90639c = "music_dsp";
            return aVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.bytedance.tux.sheet.a.a$d[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        boolean z;
        int i2;
        int i3;
        com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = this.f83843a;
        if (cVar != null) {
            Aweme aweme = cVar.c().getAweme();
            if (cVar.n() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z.a(aweme) || z) {
                Context context = this.f83846d.getContext();
                Context context2 = null;
                if (!(context instanceof androidx.fragment.app.e)) {
                    context = null;
                }
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
                if (eVar == null) {
                    Context validTopActivity = ActivityStack.getValidTopActivity();
                    if (validTopActivity instanceof androidx.fragment.app.e) {
                        context2 = validTopActivity;
                    }
                    eVar = (androidx.fragment.app.e) context2;
                    if (eVar == null) {
                        return;
                    }
                }
                if (z) {
                    i2 = R.raw.icon_bookmark_fill;
                    ShareFlavorService.a.a();
                    i3 = R.string.ti;
                } else {
                    i2 = R.raw.icon_bookmark;
                    ShareFlavorService.a.a();
                    i3 = R.string.th;
                }
                com.bytedance.tux.sheet.a.a b2 = new a.b().a(n.b(new a.d().c(i2).a(i3).a(new c(aweme, this)), new a.d().c(R.raw.icon_flag).a(R.string.fcr).a(new d(aweme, this)))).b();
                this.f83845c = b2;
                if (b2 != null) {
                    b2.show(eVar.getSupportFragmentManager(), "MoreController:ActionSheet");
                    return;
                }
                return;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f83846d.getContext()).a(R.string.hfj).a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<View, h.z> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(52288);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Aweme aweme, e eVar) {
            super(1);
            this.$aweme = aweme;
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(View view) {
            l.d(view, "");
            this.this$0.a(this.$aweme);
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.g.d
    public final void a(String str) {
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity != null) {
            new com.bytedance.tux.g.b(validTopActivity).a(str).b();
        }
    }

    public e(View view) {
        l.d(view, "");
        View findViewById = view.findViewById(R.id.ac7);
        l.b(findViewById, "");
        this.f83846d = findViewById;
        this.f83847e = i.a((h.f.a.a) new b(this));
        findViewById.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.dsp.playpage.playview.b.e.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f83848a;

            static {
                Covode.recordClassIndex(52285);
            }

            {
                this.f83848a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f83848a.a();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<View, h.z> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(52289);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Aweme aweme, e eVar) {
            super(1);
            this.$aweme = aweme;
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(View view) {
            l.d(view, "");
            e eVar = this.this$0;
            Aweme aweme = this.$aweme;
            com.ss.android.ugc.aweme.base.utils.f fVar = f.a.f68431a;
            l.b(fVar, "");
            if (!fVar.c()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(eVar.f83846d.getContext()).a(R.string.de8).a();
            } else {
                ShareDependService a2 = ShareDependService.a.a();
                String str = eVar.f83844b;
                Context context = eVar.f83846d.getContext();
                l.b(context, "");
                a2.a(aweme, str, context, "", "");
            }
            return h.z.f158842a;
        }
    }

    public final void a(Aweme aweme) {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            String aid = aweme.getAid();
            com.ss.android.ugc.aweme.login.c.a(com.bytedance.ies.ugc.appcontext.f.j(), "", "click_favorite_video", new ap().a("group_id", aid).a("log_pb", ac.c(aid)).f142646a, new a(this, aweme));
            return;
        }
        com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = this.f83843a;
        if (cVar != null && cVar.n() == 0) {
            com.ss.android.ugc.aweme.dsp.common.b.a.a(cVar.d());
        }
        com.ss.android.ugc.aweme.common.c cVar2 = (com.ss.android.ugc.aweme.common.c) this.f83847e.getValue();
        Object[] objArr = new Object[3];
        int i2 = 0;
        objArr[0] = 2;
        objArr[1] = aweme.getAid();
        com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar3 = this.f83843a;
        if (cVar3 == null || cVar3.n() != 1) {
            i2 = 1;
        }
        objArr[2] = Integer.valueOf(i2);
        cVar2.a(objArr);
    }
}
