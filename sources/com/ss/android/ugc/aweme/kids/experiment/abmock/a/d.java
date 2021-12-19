package com.ss.android.ugc.aweme.kids.experiment.abmock.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.api.abmock.b;
import com.ss.android.ugc.aweme.kids.api.abmock.c;
import h.a.n;
import java.util.List;
import java.util.Objects;

public final class d extends com.ss.android.ugc.aweme.kids.api.abmock.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106533a = new a((byte) 0);

    static {
        Covode.recordClassIndex(68077);
    }

    @Override // com.ss.android.ugc.aweme.kids.api.abmock.a
    public final String a() {
        return "kids_mode_wellbeing_notification";
    }

    @Override // com.ss.android.ugc.aweme.kids.api.abmock.a
    public final boolean d() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68078);
        }

        private a() {
        }

        public static int a() {
            Object a2 = com.ss.android.ugc.aweme.kids.experiment.abmock.a.a(new d());
            Objects.requireNonNull(a2, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) a2).intValue();
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.api.abmock.a
    public final c c() {
        return c.INT;
    }

    @Override // com.ss.android.ugc.aweme.kids.api.abmock.a
    public final List<b> b() {
        return n.c(new b("no reminder", true, 0), new b("half screen reminder", false, 1), new b("full screen reminder", false, 2), new b("video reminder", false, 1));
    }
}
