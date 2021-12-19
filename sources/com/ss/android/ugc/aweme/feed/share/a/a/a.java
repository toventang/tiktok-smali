package com.ss.android.ugc.aweme.feed.share.a.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f93872a;

    static {
        Covode.recordClassIndex(59733);
    }

    @Override // com.ss.android.ugc.aweme.feed.share.a.a.b
    public void a() {
    }

    @Override // com.ss.android.ugc.aweme.feed.share.a.a.b
    public void a(String str) {
    }

    public final Context b() {
        return this.f93872a.get();
    }

    public a(Context context) {
        this.f93872a = new WeakReference<>(context);
    }
}
