package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cn implements IAVPublishExtension.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131640a;

    static {
        Covode.recordClassIndex(86206);
    }

    cn(cj cjVar) {
        this.f131640a = cjVar;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback
    public final void onContentModified() {
        this.f131640a.L = true;
    }
}
