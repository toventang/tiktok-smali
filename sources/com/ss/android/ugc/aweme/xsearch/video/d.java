package com.ss.android.ugc.aweme.xsearch.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f145274d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Aweme> f145275a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f145276b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f145277c;

    /* renamed from: e  reason: collision with root package name */
    private Aweme f145278e;

    /* renamed from: f  reason: collision with root package name */
    private b.c f145279f;

    static {
        Covode.recordClassIndex(95002);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(95003);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f145280a = new d((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f145281b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(95004);
        }
    }

    private d() {
    }

    public /* synthetic */ d(byte b2) {
        this();
    }

    public final void a(Aweme aweme, b.c cVar, Integer num, boolean z) {
        b.c cVar2;
        if ((!l.a(this.f145278e, aweme)) && (cVar2 = this.f145279f) != null) {
            cVar2.i();
        }
        if (aweme != null) {
            this.f145275a = new WeakReference<>(aweme);
        } else {
            aweme = null;
        }
        this.f145278e = aweme;
        this.f145279f = cVar;
        this.f145277c = num;
        this.f145276b = z;
    }
}
