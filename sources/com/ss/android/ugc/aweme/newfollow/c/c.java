package com.ss.android.ugc.aweme.newfollow.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.e.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.playerkit.videoview.j;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public i f112580a;

    /* renamed from: b  reason: collision with root package name */
    public String f112581b;

    /* renamed from: c  reason: collision with root package name */
    private Aweme f112582c;

    /* renamed from: d  reason: collision with root package name */
    private Aweme f112583d;

    /* renamed from: e  reason: collision with root package name */
    private j f112584e;

    /* renamed from: f  reason: collision with root package name */
    private final OnUIPlayListener f112585f;

    /* renamed from: g  reason: collision with root package name */
    private final d f112586g = null;

    /* renamed from: h  reason: collision with root package name */
    private int f112587h;

    static {
        Covode.recordClassIndex(72350);
    }

    public final void g() {
        i iVar = this.f112580a;
        if (iVar != null) {
            iVar.F();
        }
    }

    public final void h() {
        i iVar = this.f112580a;
        if (iVar != null) {
            iVar.G();
        }
    }

    public final long c() {
        i iVar = this.f112580a;
        if (iVar != null) {
            return iVar.n();
        }
        return 0;
    }

    public final void d() {
        this.f112587h = 1;
        i iVar = this.f112580a;
        if (iVar != null) {
            iVar.z();
        }
    }

    public final void e() {
        this.f112587h = 1;
        i iVar = this.f112580a;
        if (iVar != null) {
            iVar.B();
        }
    }

    public final void f() {
        if (k()) {
            this.f112587h = 0;
            j();
        }
    }

    private VideoUrlModel i() {
        VideoUrlModel properPlayAddr;
        Video b2 = b(this.f112582c);
        if (b2 == null || (properPlayAddr = b2.getProperPlayAddr()) == null) {
            return null;
        }
        Aweme aweme = this.f112583d;
        if (aweme == null) {
            aweme = this.f112582c;
        }
        b2.setRationAndSourceId(aweme.getAid());
        return properPlayAddr;
    }

    private boolean k() {
        if (!this.f112584e.c() || m()) {
            return false;
        }
        l();
        return true;
    }

    private String l() {
        if (!TextUtils.isEmpty(this.f112581b)) {
            return this.f112581b;
        }
        d dVar = this.f112586g;
        if (dVar != null) {
            return dVar.j();
        }
        return "";
    }

    private boolean m() {
        Aweme aweme = this.f112582c;
        if (aweme == null || aweme.getStatus() == null || !this.f112582c.getStatus().isDelete()) {
            return false;
        }
        return true;
    }

    public final void a() {
        i iVar = this.f112580a;
        if (iVar != null && iVar.b(this.f112585f)) {
            this.f112580a.a((OnUIPlayListener) null);
        }
    }

    public final long b() {
        i iVar = this.f112580a;
        if (iVar != null) {
            return iVar.j();
        }
        return 0;
    }

    private void j() {
        i iVar;
        if (i() != null && (iVar = this.f112580a) != null) {
            iVar.a(this.f112585f);
            this.f112580a.a(this.f112584e.b());
            this.f112580a.b(b(this.f112582c), this.f112585f);
        }
    }

    private static Video b(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        return aweme.getVideo();
    }

    public final void a(int i2) {
        if (k()) {
            this.f112587h = 2;
            b(i2);
        }
    }

    private void b(int i2) {
        i iVar;
        if (i() != null && (iVar = this.f112580a) != null) {
            iVar.a(this.f112585f);
            this.f112580a.a(this.f112584e.b());
            this.f112580a.a(b(this.f112582c), null, false, true, i2);
        }
    }

    public final void a(float f2) {
        i iVar;
        if (k() && (iVar = this.f112580a) != null) {
            iVar.a(this.f112585f);
            this.f112580a.a(this.f112584e.b());
            this.f112580a.a(f2);
        }
    }

    public final void a(Aweme aweme) {
        if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                this.f112583d = aweme;
                this.f112582c = aweme.getForwardItem();
                return;
            }
            this.f112583d = null;
            this.f112582c = aweme;
        }
    }

    public c(KeepSurfaceTextureView keepSurfaceTextureView, OnUIPlayListener onUIPlayListener) {
        this.f112584e = j.a(keepSurfaceTextureView);
        this.f112585f = onUIPlayListener;
    }
}
