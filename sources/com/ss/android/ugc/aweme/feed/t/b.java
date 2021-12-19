package com.ss.android.ugc.aweme.feed.t;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.h.i;
import java.util.concurrent.Callable;

final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final i[] f93909a;

    /* renamed from: b  reason: collision with root package name */
    private final String f93910b;

    /* renamed from: c  reason: collision with root package name */
    private final int f93911c;

    /* renamed from: d  reason: collision with root package name */
    private final String f93912d;

    /* renamed from: e  reason: collision with root package name */
    private final int f93913e;

    static {
        Covode.recordClassIndex(59740);
    }

    b(i[] iVarArr, String str, int i2, String str2, int i3) {
        this.f93909a = iVarArr;
        this.f93910b = str;
        this.f93911c = i2;
        this.f93912d = str2;
        this.f93913e = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return a.a(this.f93909a, this.f93910b, this.f93911c, this.f93912d, this.f93913e);
    }
}
