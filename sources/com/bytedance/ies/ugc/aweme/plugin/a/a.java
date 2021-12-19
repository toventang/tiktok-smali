package com.bytedance.ies.ugc.aweme.plugin.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.b.b;
import com.bytedance.ies.ugc.aweme.plugin.c.c;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f35053a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f35054b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f35055c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f35056d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f35057e;

    /* renamed from: f  reason: collision with root package name */
    public long f35058f;

    /* renamed from: g  reason: collision with root package name */
    public b f35059g;

    /* renamed from: h  reason: collision with root package name */
    public List<String> f35060h;

    /* renamed from: i  reason: collision with root package name */
    public List<String> f35061i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f35062j;

    /* renamed from: k  reason: collision with root package name */
    public c f35063k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f35064l;

    static {
        Covode.recordClassIndex(21032);
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.plugin.a.a$a  reason: collision with other inner class name */
    public static final class C0790a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f35065a = true;

        /* renamed from: b  reason: collision with root package name */
        public boolean f35066b = com.bytedance.ies.ugc.aweme.plugin.b.a.f35118d;

        /* renamed from: c  reason: collision with root package name */
        public boolean f35067c = com.bytedance.ies.ugc.aweme.plugin.b.a.f35118d;

        /* renamed from: d  reason: collision with root package name */
        public boolean f35068d = com.bytedance.ies.ugc.aweme.plugin.b.a.f35118d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f35069e;

        /* renamed from: f  reason: collision with root package name */
        public long f35070f = com.bytedance.ies.ugc.aweme.plugin.b.a.f35116b;

        /* renamed from: g  reason: collision with root package name */
        public b f35071g = b.KEEP;

        /* renamed from: h  reason: collision with root package name */
        public List<String> f35072h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f35073i = true;

        /* renamed from: j  reason: collision with root package name */
        public c f35074j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f35075k = true;

        static {
            Covode.recordClassIndex(21033);
        }

        public final a a() {
            return new a(this, (byte) 0);
        }

        public final C0790a a(int i2) {
            this.f35066b = true;
            this.f35070f = TimeUnit.MINUTES.toMillis((long) i2);
            return this;
        }
    }

    private a(C0790a aVar) {
        this.f35053a = aVar.f35065a;
        this.f35054b = aVar.f35066b;
        this.f35055c = aVar.f35067c;
        this.f35056d = aVar.f35068d;
        this.f35057e = aVar.f35069e;
        this.f35058f = aVar.f35070f;
        this.f35059g = aVar.f35071g;
        this.f35060h = aVar.f35072h;
        this.f35062j = aVar.f35073i;
        this.f35063k = aVar.f35074j;
        this.f35064l = aVar.f35075k;
    }

    /* synthetic */ a(C0790a aVar, byte b2) {
        this(aVar);
    }
}
