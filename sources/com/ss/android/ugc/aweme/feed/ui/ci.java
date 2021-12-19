package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ci implements MentionTextView.d {

    /* renamed from: a  reason: collision with root package name */
    private final cc f94492a;

    static {
        Covode.recordClassIndex(59997);
    }

    ci(cc ccVar) {
        this.f94492a = ccVar;
    }

    @Override // com.ss.android.ugc.aweme.views.MentionTextView.d
    public final boolean a(TextExtraStruct textExtraStruct) {
        return this.f94492a.w == 0 && textExtraStruct.getType() == 5;
    }
}
