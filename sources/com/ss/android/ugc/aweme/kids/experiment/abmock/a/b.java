package com.ss.android.ugc.aweme.kids.experiment.abmock.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.api.abmock.c;
import h.a.n;
import java.util.List;

public final class b extends com.ss.android.ugc.aweme.kids.api.abmock.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106531a = new a((byte) 0);

    static {
        Covode.recordClassIndex(68073);
    }

    @Override // com.ss.android.ugc.aweme.kids.api.abmock.a
    public final String a() {
        return "kids_mode_gallery_play_count";
    }

    @Override // com.ss.android.ugc.aweme.kids.api.abmock.a
    public final boolean d() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68074);
        }

        private a() {
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
    public final List<com.ss.android.ugc.aweme.kids.api.abmock.b> b() {
        return n.c(new com.ss.android.ugc.aweme.kids.api.abmock.b("no play count on gallery grid preview", true, 0), new com.ss.android.ugc.aweme.kids.api.abmock.b("display play count on gallery grid preview", false, 1));
    }
}
