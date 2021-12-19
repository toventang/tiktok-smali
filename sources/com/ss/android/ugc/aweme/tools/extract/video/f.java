package com.ss.android.ugc.aweme.tools.extract.video;

import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.extract.e;
import java.util.concurrent.Callable;

final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Object f140133a;

    /* renamed from: b  reason: collision with root package name */
    private final j f140134b;

    static {
        Covode.recordClassIndex(91566);
    }

    f(Object obj, j jVar) {
        this.f140133a = obj;
        this.f140134b = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj = this.f140133a;
        j jVar = this.f140134b;
        if (obj instanceof VideoPublishEditModel) {
            new e((VideoPublishEditModel) obj).a(new i(jVar));
        } else {
            jVar.b((Object) null);
        }
        return null;
    }
}
