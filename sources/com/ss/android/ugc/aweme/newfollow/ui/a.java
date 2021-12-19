package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.DiscoveryServiceImpl;
import com.ss.android.ugc.aweme.discover.tooltip.d;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.feed.i.g;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.video.k;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final e f112600a;

    /* renamed from: b  reason: collision with root package name */
    public final String f112601b = "tooltip_is_new_user";

    /* renamed from: c  reason: collision with root package name */
    public final String f112602c = "first_visit_discover";

    /* renamed from: d  reason: collision with root package name */
    public final String f112603d = "tooltip_shown";

    /* renamed from: e  reason: collision with root package name */
    public final Context f112604e;

    static {
        Covode.recordClassIndex(72365);
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.a$a  reason: collision with other inner class name */
    static final class CallableC2880a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final CallableC2880a f112605a = new CallableC2880a();

        static {
            Covode.recordClassIndex(72366);
        }

        CallableC2880a() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.ss.android.common.c.c.a(d.a(), "discovery", "click");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f112606a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f112607b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f112608c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f112609d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f112610e;

        static {
            Covode.recordClassIndex(72367);
        }

        b(a aVar, String str, String str2, String str3, String str4) {
            this.f112606a = aVar;
            this.f112607b = str;
            this.f112608c = str2;
            this.f112609d = str3;
            this.f112610e = str4;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            r.a(this.f112607b, new com.ss.android.ugc.aweme.app.f.d().a("previous_page", "homepage_hot").a("enter_method", this.f112608c).a("group_id", this.f112609d).a("author_id", this.f112610e).a(this.f112606a.f112601b, d.a.d()).a(this.f112606a.f112602c, d.a.c()).a(this.f112606a.f112603d, d.a.e()).f66730a);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f112611a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f112612b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f112613c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f112614d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f112615e;

        static {
            Covode.recordClassIndex(72368);
        }

        c(a aVar, String str, String str2, String str3, String str4) {
            this.f112611a = aVar;
            this.f112612b = str;
            this.f112613c = str2;
            this.f112614d = str3;
            this.f112615e = str4;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str;
            String str2 = this.f112612b;
            int hashCode = str2.hashCode();
            if (hashCode != -1382453013) {
                if (hashCode != 2223327) {
                    if (hashCode == 2614219 && str2.equals("USER")) {
                        str = "personal_homepage";
                        d.a.c(str);
                        r.a(this.f112614d, new com.ss.android.ugc.aweme.app.f.d().a("previous_page", str).a("enter_method", this.f112615e).a(this.f112611a.f112601b, d.a.d()).a(this.f112611a.f112602c, d.a.c()).a(this.f112611a.f112603d, d.a.e()).f66730a);
                        return null;
                    }
                } else if (str2.equals("HOME")) {
                    str = this.f112613c;
                    d.a.c(str);
                    r.a(this.f112614d, new com.ss.android.ugc.aweme.app.f.d().a("previous_page", str).a("enter_method", this.f112615e).a(this.f112611a.f112601b, d.a.d()).a(this.f112611a.f112602c, d.a.c()).a(this.f112611a.f112603d, d.a.e()).f66730a);
                    return null;
                }
            } else if (str2.equals("NOTIFICATION")) {
                str = "message";
                d.a.c(str);
                r.a(this.f112614d, new com.ss.android.ugc.aweme.app.f.d().a("previous_page", str).a("enter_method", this.f112615e).a(this.f112611a.f112601b, d.a.d()).a(this.f112611a.f112602c, d.a.c()).a(this.f112611a.f112603d, d.a.e()).f66730a);
                return null;
            }
            str = "";
            d.a.c(str);
            r.a(this.f112614d, new com.ss.android.ugc.aweme.app.f.d().a("previous_page", str).a("enter_method", this.f112615e).a(this.f112611a.f112601b, d.a.d()).a(this.f112611a.f112602c, d.a.c()).a(this.f112611a.f112603d, d.a.e()).f66730a);
            return null;
        }
    }

    public a(Context context) {
        l.d(context, "");
        this.f112604e = context;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f112600a = (e) context;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        TabChangeManager a2 = TabChangeManager.a.a(this.f112600a);
        ScrollSwitchStateManager a3 = ScrollSwitchStateManager.a.a(this.f112600a);
        AVExternalServiceImpl.a().enterFromService().setEnterFrom("DISCOVER");
        com.ss.android.ugc.aweme.notice.api.b.a(false);
        com.ss.android.ugc.aweme.logger.c.f109013a = false;
        a.b.f109011a.f109002c = false;
        a.b.f109011a.f109006g = false;
        c cVar = null;
        com.ss.android.ugc.aweme.share.d.c.f123452d = null;
        String str = a2.f109107d;
        MainPageFragmentImpl.i().c();
        if (!l.a((Object) "DISCOVER", (Object) a2.f109107d)) {
            Bundle bundle = new Bundle();
            bundle.putString(be.f68530b, be.f68532d);
            Hox.a.a(this.f112600a).b("DISCOVER", bundle);
            v.O().B();
            k.a().b();
            com.ss.android.ugc.aweme.main.h.a.b(this.f112600a);
            a3.a(false);
            MainPageFragmentImpl.i().a(true);
            MainPageFragmentImpl.i().a((Context) this.f112600a);
            com.bytedance.ies.watcher.c.a("discovery_trigger_net");
            com.bytedance.ies.watcher.c.a("discovery_cost_time");
            com.ss.android.ugc.aweme.cc.c.a("discover_page");
            Fragment b2 = a2.b();
            if (b2 instanceof c) {
                cVar = (c) b2;
            }
            if (DiscoveryServiceImpl.g().f()) {
                com.a.b.c.a(this.f112604e, (int) R.layout.y0);
                com.a.b.c.a(this.f112604e, (int) R.layout.xp);
            }
            if (cVar != null) {
                if (cVar.e() != null) {
                    cVar.e();
                    if (str != null) {
                        a(str, "enter_discovery_page");
                    }
                } else if (cVar.g() != null) {
                    if (str != null) {
                        a(str, "enter_discovery_page");
                    }
                    s.a(af.DISCOVER);
                } else if (!in.d() && str != null) {
                    a(str, "enter_discovery_page");
                }
            }
        }
        i.b(CallableC2880a.f112605a, r.a());
        com.ss.android.ugc.d.a.c.a(new g());
    }

    private final void a(String str, String str2) {
        String str3;
        if (TextUtils.equals("enter_discovery_page", str2)) {
            str3 = "click_discovery_tab";
        } else {
            str3 = "click_follow_tab";
        }
        String d2 = MainPageFragmentImpl.i().d();
        if (!TextUtils.equals(str, "HOME") || !TextUtils.equals(d2, "homepage_hot")) {
            i.b(new c(this, str, d2, str2, str3), r.a());
            return;
        }
        i.b(new b(this, str2, str3, com.ss.android.ugc.aweme.metrics.b.f109529a, com.ss.android.ugc.aweme.metrics.b.f109530b), r.a());
        d.a.c("homepage_hot");
    }
}
