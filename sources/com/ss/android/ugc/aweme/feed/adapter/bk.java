package com.ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.share.a;
import com.ss.android.ugc.aweme.im.service.model.l;

final /* synthetic */ class bk implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoViewCell f91710a;

    /* renamed from: b  reason: collision with root package name */
    private final l f91711b;

    static {
        Covode.recordClassIndex(57740);
    }

    bk(VideoViewCell videoViewCell, l lVar) {
        this.f91710a = videoViewCell;
        this.f91711b = lVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        VideoViewCell videoViewCell = this.f91710a;
        l lVar = this.f91711b;
        a.a(videoViewCell.aw);
        lVar.f103929f.a();
    }
}
