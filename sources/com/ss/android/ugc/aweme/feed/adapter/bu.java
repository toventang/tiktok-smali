package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.a.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bu implements b {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91723a;

    static {
        Covode.recordClassIndex(57750);
    }

    bu(VideoViewCell videoViewCell) {
        this.f91723a = videoViewCell;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        VideoViewCell videoViewCell = this.f91723a;
        Aweme aweme = (Aweme) obj;
        if (videoViewCell.f91515j == null || videoViewCell.f91515j.getAid() != aweme.getAid() || videoViewCell.f91515j.getInteractionTagInfo() == null) {
            return null;
        }
        videoViewCell.f91515j.getInteractionTagInfo().setVideoLabelText("");
        m.a(new bw(videoViewCell));
        return null;
    }
}
