package com.google.b.b.a;

import com.bytedance.covode.number.Covode;
import com.google.b.a.c.b.a.a;
import com.google.b.a.d.g;
import com.google.b.a.d.h;
import com.google.b.a.g.k;

public final class a extends com.google.b.a.c.b.a.a {
    public final b a() {
        return new b();
    }

    /* renamed from: com.google.b.b.a.a$a  reason: collision with other inner class name */
    public static final class C1228a extends a.AbstractC1226a {
        static {
            Covode.recordClassIndex(33201);
        }

        public final a a() {
            return new a(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public C1228a d(String str) {
            return (C1228a) super.a(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public C1228a e(String str) {
            return (C1228a) super.b(str);
        }

        /* renamed from: g */
        public final C1228a f(String str) {
            return (C1228a) super.c(str);
        }

        public C1228a(h hVar, com.google.b.a.e.b bVar, g gVar) {
            super(hVar, bVar, "https://www.googleapis.com/", "youtube/v3/", gVar);
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(33200);
        if (com.google.b.a.c.a.f53520a.intValue() != 1 || com.google.b.a.c.a.f53521b.intValue() < 15) {
            z = false;
        } else {
            z = true;
        }
        Object[] objArr = {com.google.b.a.c.a.f53523d};
        if (!z) {
            throw new IllegalStateException(com.google.b.a.f.a.a.a.a.b.a("You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.19.0 of the YouTube Data API library.", objArr));
        }
    }

    a(C1228a aVar) {
        super(aVar);
    }

    public class b {
        static {
            Covode.recordClassIndex(33202);
        }

        public b() {
        }

        public final C1229a a(String str) {
            return new C1229a(str);
        }

        /* renamed from: com.google.b.b.a.a$b$a  reason: collision with other inner class name */
        public class C1229a extends b<com.google.b.b.a.a.h> {
            @k
            public String categoryId;
            @k
            public String forUsername;
            @k
            public String id;
            @k
            public Boolean managedByMe;
            @k
            public Long maxResults;
            @k
            public Boolean mine;
            @k
            public Boolean mySubscribers;
            @k
            public String onBehalfOfContentOwner;
            @k
            public String pageToken;
            @k
            public String part;

            static {
                Covode.recordClassIndex(33203);
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public C1229a d(String str, Object obj) {
                return (C1229a) super.c(str, obj);
            }

            protected C1229a(String str) {
                super(a.this, "GET", "channels", com.google.b.b.a.a.h.class);
                this.part = (String) com.google.b.a.f.a.a.a.a.b.a(str, "Required parameter part must be specified.");
            }
        }
    }
}
