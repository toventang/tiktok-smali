package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a;

import android.animation.TimeInterpolator;
import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.g;
import h.f.b.l;

public final class a {

    /* renamed from: m  reason: collision with root package name */
    public static final g f129245m = new b();
    public static final C3365a n = new C3365a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TimeInterpolator f129246a = new androidx.g.a.a.b();

    /* renamed from: b  reason: collision with root package name */
    public TimeInterpolator f129247b = new androidx.g.a.a.b();

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f129248c = new androidx.g.a.a.b();

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f129249d = new androidx.g.a.a.b();

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f129250e = new androidx.g.a.a.b();

    /* renamed from: f  reason: collision with root package name */
    public long f129251f = 250;

    /* renamed from: g  reason: collision with root package name */
    public long f129252g = 250;

    /* renamed from: h  reason: collision with root package name */
    public long f129253h = 250;

    /* renamed from: i  reason: collision with root package name */
    public long f129254i = 250;

    /* renamed from: j  reason: collision with root package name */
    public long f129255j = 250;

    /* renamed from: k  reason: collision with root package name */
    public g f129256k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f129257l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a$a  reason: collision with other inner class name */
    public static final class C3365a {
        static {
            Covode.recordClassIndex(84844);
        }

        private C3365a() {
        }

        public /* synthetic */ C3365a(byte b2) {
            this();
        }
    }

    public static final class b extends g {
        static {
            Covode.recordClassIndex(84845);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.g
        public final Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    static {
        Covode.recordClassIndex(84843);
    }

    public a() {
        g gVar = f129245m;
        this.f129256k = gVar;
        this.f129256k = gVar;
        this.f129257l = false;
    }

    public final void a(TimeInterpolator timeInterpolator) {
        l.d(timeInterpolator, "");
        this.f129246a = timeInterpolator;
    }

    public final void b(TimeInterpolator timeInterpolator) {
        l.d(timeInterpolator, "");
        this.f129247b = timeInterpolator;
    }

    public final void c(TimeInterpolator timeInterpolator) {
        l.d(timeInterpolator, "");
        this.f129248c = timeInterpolator;
    }

    public final void d(TimeInterpolator timeInterpolator) {
        l.d(timeInterpolator, "");
        this.f129249d = timeInterpolator;
    }
}
