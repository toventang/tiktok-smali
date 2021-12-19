package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ch implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final VideoPublishActivity f131592a;

    static {
        Covode.recordClassIndex(86183);
    }

    ch(VideoPublishActivity videoPublishActivity) {
        this.f131592a = videoPublishActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f131592a.a("shoutout quit");
    }
}
