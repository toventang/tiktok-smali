package com.ss.android.ugc.aweme.kids.experiment.abmock.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.api.abmock.b;
import h.a.n;
import java.util.List;

public final class c extends com.ss.android.ugc.aweme.kids.api.abmock.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106532a = new a((byte) 0);

    static {
        Covode.recordClassIndex(68075);
    }

    @Override // com.ss.android.ugc.aweme.kids.api.abmock.a
    public final String a() {
        return "kids_mode_effect_link";
    }

    @Override // com.ss.android.ugc.aweme.kids.api.abmock.a
    public final boolean d() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68076);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.api.abmock.a
    public final com.ss.android.ugc.aweme.kids.api.abmock.c c() {
        return com.ss.android.ugc.aweme.kids.api.abmock.c.INT;
    }

    @Override // com.ss.android.ugc.aweme.kids.api.abmock.a
    public final List<b> b() {
        return n.c(new b("no effect links", true, 0), new b("display effect links", false, 1));
    }
}
