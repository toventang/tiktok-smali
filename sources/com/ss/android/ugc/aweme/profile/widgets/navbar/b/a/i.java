package com.ss.android.ugc.aweme.profile.widgets.navbar.b.a;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.x;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.navbar.a.h;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.setting.services.f;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.util.UUID;

public final class i extends h<com.ss.android.ugc.aweme.profile.widgets.navbar.b.b> {
    static {
        Covode.recordClassIndex(76529);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.profile.widgets.navbar.b.c u() {
        return com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.Setting;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.h, com.ss.android.ugc.aweme.profile.widgets.navbar.a.c, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        if (s()) {
            x();
            com.bytedance.assem.arch.service.d.a(this, ab.a(x.class), j.f117996a, new c(this));
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76531);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ac a2;
            i iVar = this.this$0;
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (!g2.isLogin() || com.ss.android.ugc.aweme.profile.experiment.m.f116369b) {
                iVar.a("click_button");
            } else {
                Fragment a3 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) iVar);
                if (a3 != null) {
                    ad a4 = ae.a(a3, (ad.b) null);
                    String name = ProfileViewModel.class.getName();
                    if (ProfileViewModel.class.equals(ScopeViewModel.class)) {
                        a2 = a4.a(name, ProfileViewModel.class);
                    } else {
                        a2 = a4.a(name, ProfileViewModel.class);
                        androidx.lifecycle.ab.a(a2, a4);
                    }
                    l.b(a2, "");
                    d dVar = new d(iVar);
                    l.d(dVar, "");
                    ((JediViewModel) a2).b_(dVar);
                }
            }
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f117995a = new a();

        static {
            Covode.recordClassIndex(76530);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_3_lines_horizontal_2;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76532);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            if (aVar != null) {
                i iVar = this.this$0;
                if (f.f122672a.b()) {
                    iVar.a(true);
                } else {
                    iVar.a(false);
                }
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* synthetic */ void a(com.bytedance.tux.navigation.a.b bVar) {
        com.bytedance.tux.navigation.a.b bVar2 = bVar;
        l.d(bVar2, "");
        bVar2.a(com.bytedance.tux.c.c.a(a.f117995a)).a((h.f.a.a<z>) new b(this));
    }

    static final class d extends m implements h.f.a.b<ProfileState, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        static final class a extends m implements h.f.a.b<View, z> {
            final /* synthetic */ User $user;
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(76536);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, User user) {
                super(1);
                this.this$0 = dVar;
                this.$user = user;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(View view) {
                l.d(view, "");
                i iVar = this.this$0.this$0;
                User user = this.$user;
                String uuid = UUID.randomUUID().toString();
                l.b(uuid, "");
                boolean z = false;
                r.a("enter_creator_account", ag.b(v.a("enter_from", "personal_homepage"), v.a("enter_method", "click_panel_button"), v.a("process_id", uuid)));
                SmartRoute withParam = SmartRouter.buildRoute(iVar.ar_(), "aweme://creatortools").withParam("bundle_process_id", uuid).withParam("HAS_PRELOAD", true).withParam("PRO_ENTER_FROM", "creator_tools");
                int proAccountUpdateNotificationStatus = user.getProAccountUpdateNotificationStatus();
                if ((proAccountUpdateNotificationStatus == 1 || proAccountUpdateNotificationStatus == 2) && SettingServiceImpl.v().d()) {
                    z = true;
                }
                withParam.withParam("bundle_show_account_dialog_when_start", z).open();
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r8 = r11.getUser();
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.profile.viewmodel.ProfileState r11) {
            /*
            // Method dump skipped, instructions count: 277
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.i.d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(String str) {
        String str2;
        r.a("enter_setting_page", ag.b(v.a("previous_page", "personal_homepage"), v.a("enter_from", "personal_homepage"), v.a("enter_method", str)));
        com.ss.android.common.c.c.a(ar_(), "set", "personal_homepage");
        com.ss.android.ugc.aweme.profile.widgets.b.h hVar = (com.ss.android.ugc.aweme.profile.widgets.b.h) com.bytedance.assem.arch.service.d.e(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.b.h.class));
        if (hVar != null) {
            hVar.O();
        }
        Context ar_ = ar_();
        if (in.d()) {
            str2 = "//childrenmode/setting";
        } else {
            str2 = "//setting";
        }
        SmartRouter.buildRoute(ar_, str2).open();
    }
}
