package com.ss.android.ugc.aweme.journey.step.swipeup;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    Aweme f105139a;

    /* renamed from: b  reason: collision with root package name */
    public VideoViewComponent f105140b;

    /* renamed from: c  reason: collision with root package name */
    public OnUIPlayListener f105141c;

    static {
        Covode.recordClassIndex(67411);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (this.f105139a != null) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (b()) {
            this.f105140b.b(this.f105141c);
            VideoViewComponent videoViewComponent = this.f105140b;
            Aweme aweme = this.f105139a;
            if (aweme == null) {
                l.b();
            }
            videoViewComponent.a(aweme.getVideo());
        }
    }

    public a(VideoViewComponent videoViewComponent, OnUIPlayListener onUIPlayListener) {
        l.d(videoViewComponent, "");
        l.d(onUIPlayListener, "");
        this.f105140b = videoViewComponent;
        this.f105141c = onUIPlayListener;
    }
}
