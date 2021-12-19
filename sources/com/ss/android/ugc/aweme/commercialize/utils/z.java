package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.j;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public Aweme f75818a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f75819b;

    /* renamed from: c  reason: collision with root package name */
    public j f75820c;

    /* renamed from: d  reason: collision with root package name */
    public final OnUIPlayListener f75821d;

    /* renamed from: e  reason: collision with root package name */
    public final ah f75822e;

    /* renamed from: f  reason: collision with root package name */
    public i f75823f;

    /* renamed from: g  reason: collision with root package name */
    private VideoViewComponent f75824g;

    static {
        Covode.recordClassIndex(46759);
    }

    public final void c() {
        i iVar = this.f75823f;
        if (iVar != null) {
            iVar.I();
        }
    }

    public final VideoUrlModel a() {
        VideoUrlModel properPlayAddr;
        Video a2 = this.f75822e.a(this.f75818a);
        if (a2 == null || (properPlayAddr = a2.getProperPlayAddr()) == null) {
            return null;
        }
        Aweme aweme = this.f75819b;
        if (aweme == null) {
            aweme = this.f75818a;
        }
        a2.setRationAndSourceId(aweme.getAid());
        return properPlayAddr;
    }

    public final boolean b() {
        Aweme aweme;
        if (!this.f75820c.c() || ((aweme = this.f75818a) != null && aweme.getStatus() != null && this.f75818a.getStatus().isDelete())) {
            return false;
        }
        return true;
    }

    public z(VideoViewComponent videoViewComponent, OnUIPlayListener onUIPlayListener) {
        this(videoViewComponent, onUIPlayListener, ah.f75567a);
    }

    private z(VideoViewComponent videoViewComponent, OnUIPlayListener onUIPlayListener, ah ahVar) {
        this.f75824g = videoViewComponent;
        this.f75820c = videoViewComponent.f148883b;
        this.f75821d = onUIPlayListener;
        this.f75822e = ahVar;
    }
}
