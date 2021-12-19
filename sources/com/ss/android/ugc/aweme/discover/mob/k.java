package com.ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.c;
import h.f.b.l;

public final class k extends c<k> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81927a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private String f81928b;

    static {
        Covode.recordClassIndex(50857);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50858);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public k() {
        super("search_music_notice");
    }

    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        String str = this.f81928b;
        if (str != null && str.length() != 0) {
            a("search_id", this.f81928b);
        }
    }

    public final k a(String str) {
        l.d(str, "");
        this.f81928b = str;
        return this;
    }
}
