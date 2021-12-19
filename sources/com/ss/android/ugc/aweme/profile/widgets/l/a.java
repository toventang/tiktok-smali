package com.ss.android.ugc.aweme.profile.widgets.l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.af;
import com.ss.android.ugc.aweme.profile.f.o;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.bj;
import com.ss.android.ugc.aweme.profile.ui.v2.aa;
import com.ss.android.ugc.aweme.profile.ui.v2.x;
import com.ss.android.ugc.aweme.profile.ui.v2.y;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.common.i;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.profile.widgets.g.e;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.z;

public final class a extends com.bytedance.assem.arch.d.a implements d {

    /* renamed from: j  reason: collision with root package name */
    public boolean f117926j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f117927k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f117928l;

    /* renamed from: m  reason: collision with root package name */
    private ProfileViewModel f117929m;

    static {
        Covode.recordClassIndex(76420);
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void j() {
        super.j();
        if (this.f117927k && this.f117926j) {
            y.a();
        }
    }

    @Override // com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        Fragment a2 = com.bytedance.assem.arch.extensions.b.a((m) this);
        if (a2 != null) {
            this.f117929m = ProfileViewModel.a.a(a2);
        }
    }

    public static final class b implements bj.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117931a;

        static {
            Covode.recordClassIndex(76422);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f117931a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.bj.b
        public final void a(String str) {
            l.d(str, "");
            ((e) com.bytedance.assem.arch.service.d.a(this.f117931a, ab.a(e.class))).a(str);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.f117927k = bool.booleanValue();
            if (this.this$0.f117927k && this.this$0.f117926j) {
                y.a();
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76424);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                a aVar3 = this.this$0;
                t.getFollowStatus();
                aVar3.a(t.getSignature());
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        if (!(view instanceof TextView)) {
            view = null;
        }
        this.f117928l = (TextView) view;
        com.bytedance.assem.arch.service.d.a(this, ab.a(x.class), b.f117932a, new c(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(j.class), c.f117933a, new d(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.l.a$a  reason: collision with other inner class name */
    public static final class View$OnClickListenerC3003a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117930a;

        static {
            Covode.recordClassIndex(76421);
        }

        View$OnClickListenerC3003a(a aVar) {
            this.f117930a = aVar;
        }

        public final void onClick(View view) {
            User user;
            String str;
            ClickAgent.onClick(view);
            r.a("enter_profile_bio", new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "click_hint").f66730a);
            this.f117930a.f117926j = false;
            a aVar = this.f117930a;
            l.b(view, "");
            i iVar = (i) com.bytedance.assem.arch.service.d.f(aVar, ab.a(j.class));
            String str2 = null;
            if (iVar != null) {
                user = iVar.f117705a;
                if (user != null) {
                    str2 = user.getSignature();
                }
            } else {
                user = null;
            }
            if (TextUtils.isEmpty(str2) && !com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                Keva keva = aa.f117241a;
                if (keva != null) {
                    keva.storeBoolean("profile_v2_show_bio_hint", false);
                }
                if (user == null || (str = user.getSignature()) == null) {
                    str = "";
                }
                bj a2 = bj.a.a("bio", str);
                a2.setUserVisibleHint(true);
                a2.a(new b(aVar));
                androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(aVar);
                if (b2 != null) {
                    androidx.fragment.app.i supportFragmentManager = b2.getSupportFragmentManager();
                    l.b(supportFragmentManager, "");
                    a2.show(supportFragmentManager, "EditNicknameDialog");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.l.d
    public final void a(String str) {
        ProfileViewModel profileViewModel = this.f117929m;
        if (profileViewModel != null) {
            profileViewModel.b(o.e());
        }
        TextView textView = this.f117928l;
        User user = null;
        String str2 = null;
        if (textView != null) {
            textView.setOnClickListener(null);
        }
        if (!com.ss.android.ugc.aweme.compliance.api.a.c().a(4) && !in.d() && TextUtils.isEmpty(str) && aa.f117241a != null) {
            Keva keva = aa.f117241a;
            if (keva == null) {
                l.b();
            }
            if (keva.getBoolean("profile_v2_show_bio_hint", true)) {
                this.f117926j = true;
                TextView textView2 = this.f117928l;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    Context ar_ = ar_();
                    if (ar_ != null) {
                        str2 = ar_.getString(R.string.dp4);
                    }
                    textView2.setText(str2);
                    textView2.setOnClickListener(new View$OnClickListenerC3003a(this));
                    return;
                }
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            TextView textView3 = this.f117928l;
            if (textView3 != null) {
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        i iVar = (i) com.bytedance.assem.arch.service.d.f(this, ab.a(j.class));
        if (iVar != null) {
            user = iVar.f117705a;
        }
        TextView textView4 = this.f117928l;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        if (in.g(user) && in.d()) {
            TextView textView5 = this.f117928l;
            if (textView5 != null) {
                textView5.setText(R.string.g0r);
            }
        } else if (this.f25594h) {
            af.a(this.f117928l, str);
        }
    }
}
