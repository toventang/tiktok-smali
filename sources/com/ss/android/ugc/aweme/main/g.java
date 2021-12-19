package com.ss.android.ugc.aweme.main;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f109260a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(69968);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f109261a;

        static {
            Covode.recordClassIndex(69969);
        }

        a(String str) {
            this.f109261a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            if (com.ss.android.ugc.aweme.m.a.c(d.a())) {
                str = "on";
            } else {
                str = "off";
            }
            r.a("earphone_status", new com.ss.android.ugc.aweme.app.f.d().a("plugin_type", this.f109261a).a("to_status", str).f66730a);
            return z.f158842a;
        }
    }

    public static final void a(String str) {
        l.d(str, "");
        if (com.ss.android.ugc.aweme.compliance.api.a.k().f()) {
            i.b(new a(str), r.a());
        }
    }

    public static final void a(String str, String str2, Aweme aweme) {
        String str3;
        String authorUid;
        if (com.ss.android.ugc.aweme.compliance.api.a.k().f()) {
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("video_status", str);
            String str4 = "";
            if (str2 == null) {
                str2 = str4;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("enter_from", str2);
            if (aweme == null || (str3 = aweme.getAid()) == null) {
                str3 = str4;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("group_id", str3);
            if (!(aweme == null || (authorUid = aweme.getAuthorUid()) == null)) {
                str4 = authorUid;
            }
            r.a("earphone_unplug", a4.a("author_id", str4).f66730a);
        }
    }
}
