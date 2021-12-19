package com.ss.android.ugc.aweme.profile.widgets.navbar.b.a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.af;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.ui.v2.y;
import com.ss.android.ugc.aweme.profile.widgets.navbar.a.h;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.z;

public final class e extends h<com.ss.android.ugc.aweme.profile.widgets.navbar.b.b> {

    /* renamed from: h  reason: collision with root package name */
    private final h.h f117981h = i.a((h.f.a.a) c.f117983a);

    static {
        Covode.recordClassIndex(76510);
    }

    public final String z() {
        return (String) this.f117981h.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.profile.widgets.navbar.b.c u() {
        return com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.LiveEvent;
    }

    static final class c extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f117983a = new c();

        static {
            Covode.recordClassIndex(76513);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = SettingsManager.a().a("personal_live_event_list", "");
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.h, com.ss.android.ugc.aweme.profile.widgets.navbar.a.c, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        if (!in.d()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin() && s()) {
                x();
                y.a("show");
                return;
            }
        }
        y();
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(76512);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            y.a("click");
            if (!TextUtils.isEmpty(this.this$0.z()) && !TextUtils.isEmpty(Uri.parse(this.this$0.z()).getQueryParameter("url"))) {
                Uri build = af.b(Uri.parse(this.this$0.z()), "url").buildUpon().appendQueryParameter("url", Uri.parse(this.this$0.z()).getQueryParameter("url") + "&live_event_permission=" + (SettingsManager.a().a("live_event_permission", false) ? 1 : 0)).build();
                ILiveOuterService s = LiveOuterService.s();
                l.b(s, "");
                s.d().a(this.this$0.ar_(), build);
            }
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f117982a = new a();

        static {
            Covode.recordClassIndex(76511);
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
            aVar2.f44749a = R.raw.icon_calendar_star;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bc);
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.tux.navigation.a.c] */
    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* synthetic */ void a(com.bytedance.tux.navigation.a.b bVar) {
        com.bytedance.tux.navigation.a.b bVar2 = bVar;
        l.d(bVar2, "");
        bVar2.a(com.bytedance.tux.c.c.a(a.f117982a)).a((h.f.a.a<z>) new b(this));
    }
}
