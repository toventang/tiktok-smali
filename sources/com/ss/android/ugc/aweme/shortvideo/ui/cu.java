package com.ss.android.ugc.aweme.shortvideo.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cu implements u {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131666a;

    static {
        Covode.recordClassIndex(86222);
    }

    cu(cj cjVar) {
        this.f131666a = cjVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f131666a.z.setCommentStatus(((Boolean) obj).booleanValue());
    }
}
