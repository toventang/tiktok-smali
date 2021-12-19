package com.ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import h.f.b.l;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public Aweme f93417a;

    /* renamed from: b  reason: collision with root package name */
    public VideoViewComponent f93418b;

    /* renamed from: c  reason: collision with root package name */
    public OnUIPlayListener f93419c;

    static {
        Covode.recordClassIndex(59192);
    }

    private final boolean d() {
        if (this.f93417a != null) {
            return true;
        }
        return false;
    }

    public final void b() {
        if (d()) {
            this.f93418b.b(this.f93419c);
            VideoViewComponent videoViewComponent = this.f93418b;
            Aweme aweme = this.f93417a;
            if (aweme == null) {
                l.b();
            }
            videoViewComponent.a(aweme.getVideo());
        }
    }

    public final void c() {
        this.f93418b.a(this.f93419c);
        this.f93418b.c();
        this.f93418b.d();
    }

    public final void a() {
        if (d()) {
            this.f93418b.b(this.f93419c);
            VideoViewComponent videoViewComponent = this.f93418b;
            Aweme aweme = this.f93417a;
            if (aweme == null) {
                l.b();
            }
            videoViewComponent.a(aweme.getVideo(), b.a().a(true, "decoder_type", 0));
        }
    }

    public r(VideoViewComponent videoViewComponent, OnUIPlayListener onUIPlayListener) {
        l.d(videoViewComponent, "");
        l.d(onUIPlayListener, "");
        this.f93418b = videoViewComponent;
        this.f93419c = onUIPlayListener;
    }
}
