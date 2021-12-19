package com.ss.ttvideoengine.p;

import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.p.b;
import java.util.List;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final List<C4074a> f153154a;

    /* renamed from: b  reason: collision with root package name */
    private final String f153155b;

    static {
        Covode.recordClassIndex(101743);
    }

    @Override // com.ss.ttvideoengine.p.b
    public final b.a a() {
        return b.a.DIRECT_URL_SOURCE;
    }

    @Override // com.ss.ttvideoengine.p.b
    public final String b() {
        return this.f153155b;
    }

    public final String toString() {
        return "DirectUrlSource{vid='" + this.f153155b + '\'' + ", urlItems=" + this.f153154a + '}';
    }

    /* renamed from: com.ss.ttvideoengine.p.a$a  reason: collision with other inner class name */
    public static class C4074a {

        /* renamed from: a  reason: collision with root package name */
        public final String f153156a;

        /* renamed from: b  reason: collision with root package name */
        public final String f153157b;

        /* renamed from: c  reason: collision with root package name */
        public final String f153158c;

        /* renamed from: d  reason: collision with root package name */
        public final String f153159d;

        static {
            Covode.recordClassIndex(101744);
        }

        public final String toString() {
            return "UrlItem{url='" + this.f153156a + '\'' + ", cacheKey='" + this.f153157b + '\'' + ", playAuth='" + this.f153158c + '\'' + ", encodeType='" + this.f153159d + '\'' + '}';
        }
    }
}
