package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f101429a;

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView f101430b;

    static {
        Covode.recordClassIndex(64860);
    }

    public g(d dVar, RecyclerView recyclerView) {
        this.f101429a = dVar;
        this.f101430b = recyclerView;
    }

    public final void run() {
        this.f101429a.a(this.f101430b, 0);
    }
}
