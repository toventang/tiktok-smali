package com.ss.android.ugc.aweme.crossplatform.c;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final a f78722d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f78723a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f78724b;

    /* renamed from: c  reason: collision with root package name */
    public final e f78725c;

    static {
        Covode.recordClassIndex(48870);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48871);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        r.a("stay_time", new d().a(StringSet.type, this.f78725c.f78717c).a("project_name", this.f78725c.f78715a).a("enter_from", this.f78725c.f78716b).a("duration", System.currentTimeMillis() - this.f78723a).f66730a);
    }

    public g(e eVar) {
        l.d(eVar, "");
        this.f78725c = eVar;
    }
}
