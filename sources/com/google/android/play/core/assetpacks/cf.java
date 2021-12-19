package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bi;
import com.google.android.play.core.b.bk;
import java.util.concurrent.Executor;

public final class cf implements bk<ce> {

    /* renamed from: a  reason: collision with root package name */
    private final bk<ac> f52959a;

    /* renamed from: b  reason: collision with root package name */
    private final bk<dj> f52960b;

    /* renamed from: c  reason: collision with root package name */
    private final bk<bm> f52961c;

    /* renamed from: d  reason: collision with root package name */
    private final bk<Executor> f52962d;

    /* renamed from: e  reason: collision with root package name */
    private final bk<ay> f52963e;

    static {
        Covode.recordClassIndex(32725);
    }

    public cf(bk<ac> bkVar, bk<dj> bkVar2, bk<bm> bkVar3, bk<Executor> bkVar4, bk<ay> bkVar5) {
        this.f52959a = bkVar;
        this.f52960b = bkVar2;
        this.f52961c = bkVar3;
        this.f52962d = bkVar4;
        this.f52963e = bkVar5;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* synthetic */ ce a() {
        ac a2 = this.f52959a.a();
        return new ce(a2, bi.b(this.f52960b), this.f52961c.a(), bi.b(this.f52962d), this.f52963e.a());
    }
}
