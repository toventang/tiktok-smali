package com.ss.android.ugc.aweme.autoplay.player.video;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.flowfeed.utils.c;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.utils.ct;
import com.ss.android.ugc.playerkit.videoview.k;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class c implements com.ss.android.ugc.aweme.flowfeed.a.a {
    public static final a E = new a((byte) 0);
    public int A = -1;
    public long B = -1;
    public int C = -1;
    public b.d D;

    /* renamed from: a  reason: collision with root package name */
    public View f67575a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f67576b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f67577c = true;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f67578d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f67579e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.newfollow.c.c f67580f;

    /* renamed from: g  reason: collision with root package name */
    final h f67581g = i.a((h.f.a.a) b.f67588a);

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.flowfeed.a.b f67582h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.flowfeed.a.a f67583i;

    /* renamed from: j  reason: collision with root package name */
    public g f67584j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.flowfeed.utils.i f67585k;

    /* renamed from: l  reason: collision with root package name */
    public e f67586l;

    /* renamed from: m  reason: collision with root package name */
    public b.a f67587m;
    public boolean n = true;
    public com.ss.android.ugc.aweme.video.i o;
    public h.f.a.a<String> p;
    public f q;
    public String r = "";
    public String s = "";
    public String t = "";
    public String u = "";
    public int v;
    public boolean w;
    public r x;
    public String y = "";
    public String z = "";

    static {
        Covode.recordClassIndex(41603);
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.a.a
    public final Fragment g() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.a.a
    public final k h() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41604);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.feed.d.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f67588a = new b();

        static {
            Covode.recordClassIndex(41605);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.feed.d.a invoke() {
            return new com.ss.android.ugc.aweme.feed.d.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.a.a
    public final String d() {
        String d2;
        com.ss.android.ugc.aweme.flowfeed.a.a aVar = this.f67583i;
        if (aVar == null || (d2 = aVar.d()) == null) {
            return "";
        }
        return d2;
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.a.a
    public final boolean e() {
        com.ss.android.ugc.aweme.flowfeed.a.a aVar = this.f67583i;
        if (aVar == null || !aVar.e()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.a.a
    public final Context f() {
        com.ss.android.ugc.aweme.flowfeed.a.a aVar = this.f67583i;
        if (aVar != null) {
            return aVar.f();
        }
        return null;
    }

    public final com.ss.android.ugc.aweme.flowfeed.utils.b a() {
        com.ss.android.ugc.aweme.flowfeed.utils.b a2;
        if (this.f67578d == null || (a2 = c.a.f96181a.a(b())) == null) {
            return i();
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.a.a
    public final boolean c() {
        com.ss.android.ugc.aweme.flowfeed.a.a aVar;
        if (!this.f67576b || (aVar = this.f67583i) == null || !aVar.c()) {
            return false;
        }
        return true;
    }

    private com.ss.android.ugc.aweme.flowfeed.utils.b i() {
        com.ss.android.ugc.aweme.flowfeed.utils.b bVar = null;
        if (this.f67578d != null) {
            String b2 = b();
            if (this.f67578d != null) {
                Aweme aweme = this.f67578d;
                if (aweme == null) {
                    l.b();
                }
                bVar = new com.ss.android.ugc.aweme.flowfeed.utils.b(aweme, new ct(), b2);
                c.a.f96181a.a(b2, bVar);
            }
        }
        return bVar;
    }

    public final String b() {
        String str;
        String invoke;
        h.f.a.a<String> aVar = this.p;
        if (aVar != null && (invoke = aVar.invoke()) != null) {
            return invoke;
        }
        com.ss.android.ugc.aweme.flowfeed.a.a aVar2 = this.f67583i;
        String str2 = null;
        if (aVar2 != null) {
            str = aVar2.d();
        } else {
            str = null;
        }
        Aweme aweme = this.f67578d;
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        String a2 = com.ss.android.ugc.aweme.flowfeed.utils.b.a(str, str2);
        l.b(a2, "");
        return a2;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.c$c  reason: collision with other inner class name */
    static final class C1525c extends m implements h.f.a.b<Aweme, String> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(41606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1525c(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ String invoke(Aweme aweme) {
            return this.this$0.z;
        }
    }

    public final void a(String str) {
        l.d(str, "");
        this.r = str;
    }

    public final void b(String str) {
        l.d(str, "");
        this.z = str;
        r rVar = this.x;
        if (rVar != null) {
            rVar.a(new C1525c(this));
        }
    }
}
