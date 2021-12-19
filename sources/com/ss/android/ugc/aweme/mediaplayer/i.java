package com.ss.android.ugc.aweme.mediaplayer;

import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.a;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.asve.editor.k;
import com.ss.android.vesdk.x;
import h.f.b.l;

public final class i implements a {

    /* renamed from: a  reason: collision with root package name */
    private g f109455a;

    /* renamed from: b  reason: collision with root package name */
    private long f109456b;

    /* renamed from: c  reason: collision with root package name */
    private long f109457c;

    /* renamed from: d  reason: collision with root package name */
    private double f109458d = 1.0d;

    static {
        Covode.recordClassIndex(70089);
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final void d() {
        this.f109455a.u();
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final void e() {
        this.f109455a.s();
    }

    private boolean h() {
        if (this.f109455a.f() == x.j.STARTED) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final void b() {
        this.f109455a.u();
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final void c() {
        this.f109455a.t();
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final long f() {
        double j2 = (double) this.f109455a.j();
        double d2 = this.f109458d;
        Double.isNaN(j2);
        return (long) (j2 * d2);
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final long g() {
        double k2 = (double) this.f109455a.k();
        double d2 = this.f109458d;
        Double.isNaN(k2);
        return (long) (k2 * d2);
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final boolean a() {
        this.f109455a.t();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final void a(double d2) {
        this.f109455a.a(0, 0, (float) d2);
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final int b(long j2) {
        a(j2, this.f109457c);
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final int c(long j2) {
        a(this.f109456b, j2);
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final void a(boolean z) {
        this.f109455a.a(z);
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final int a(long j2) {
        g gVar = this.f109455a;
        double d2 = (double) j2;
        double d3 = this.f109458d;
        Double.isNaN(d2);
        gVar.a((int) (d2 / d3), x.f.EDITOR_SEEK_FLAG_OnGoing);
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final void b(double d2) {
        this.f109458d = d2;
        this.f109455a.a((float) d2);
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final int a(String str) {
        this.f109455a.a(new k(new String[]{str}));
        this.f109455a.p();
        return 0;
    }

    public i(String str, TextureView textureView) {
        l.d(str, "");
        l.d(textureView, "");
        this.f109455a = new a(str, textureView);
    }

    @Override // com.ss.android.ugc.aweme.mediaplayer.a
    public final void a(long j2, long j3) {
        boolean h2 = h();
        this.f109456b = j2;
        this.f109457c = j3;
        this.f109455a.b(((int) j2) / 2, ((int) j3) / 2);
        a(j2);
        if (h2) {
            c();
        }
    }
}
