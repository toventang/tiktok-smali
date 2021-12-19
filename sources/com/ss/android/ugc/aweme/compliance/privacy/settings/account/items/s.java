package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.comment.d.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class s extends a {

    /* renamed from: a  reason: collision with root package name */
    private final o f77661a;

    /* renamed from: b  reason: collision with root package name */
    private final h f77662b = i.a((h.f.a.a) b.f77668a);

    /* renamed from: c  reason: collision with root package name */
    private final h f77663c = i.a((h.f.a.a) a.f77667a);

    /* renamed from: d  reason: collision with root package name */
    private final h f77664d = i.a((h.f.a.a) c.f77669a);

    /* renamed from: e  reason: collision with root package name */
    private final int f77665e;

    /* renamed from: f  reason: collision with root package name */
    private final int f77666f;

    static {
        Covode.recordClassIndex(48060);
    }

    private o i() {
        return (o) this.f77662b.getValue();
    }

    private final o j() {
        return (o) this.f77663c.getValue();
    }

    private final o k() {
        return (o) this.f77664d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final o e() {
        return this.f77661a;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77665e;
    }

    static final class a extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77667a = new a();

        static {
            Covode.recordClassIndex(48061);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "mention_notice");
        }
    }

    static final class b extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f77668a = new b();

        static {
            Covode.recordClassIndex(48062);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "mention");
        }
    }

    static final class c extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f77669a = new c();

        static {
            Covode.recordClassIndex(48063);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "tag");
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final Integer h() {
        return Integer.valueOf(this.f77666f);
    }

    public s() {
        int i2;
        if (!com.ss.android.ugc.aweme.compliance.privacy.settings.a.b(k()).f77440b || !g.b()) {
            i2 = R.string.d3c;
        } else {
            i2 = R.string.d3d;
        }
        this.f77665e = i2;
        this.f77666f = R.raw.icon_at;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i, com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final boolean c() {
        if (com.ss.android.ugc.aweme.compliance.privacy.settings.a.b(i()).f77439a || com.ss.android.ugc.aweme.compliance.privacy.settings.a.b(j()).f77439a || com.ss.android.ugc.aweme.compliance.privacy.settings.a.b(k()).f77439a) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i, com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final boolean d() {
        if (com.ss.android.ugc.aweme.compliance.privacy.settings.a.b(i()).f77440b || com.ss.android.ugc.aweme.compliance.privacy.settings.a.b(j()).f77440b || com.ss.android.ugc.aweme.compliance.privacy.settings.a.b(k()).f77440b) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a
    public final void a(Context context) {
        l.d(context, "");
        r.a("enter_tag_mention_permission", new d().a("enter_from", "privacy_and_safety_settings").f66730a);
        SmartRouter.buildRoute(context, "aweme://mentioncontrol/setting").open();
    }
}
