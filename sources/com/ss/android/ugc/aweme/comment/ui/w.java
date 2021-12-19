package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k f72822a;

    /* renamed from: b  reason: collision with root package name */
    private final List f72823b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f72824c;

    static {
        Covode.recordClassIndex(44854);
    }

    w(k kVar, List list, boolean z) {
        this.f72822a = kVar;
        this.f72823b = list;
        this.f72824c = z;
    }

    public final void run() {
        this.f72822a.d(this.f72823b, this.f72824c);
    }
}
