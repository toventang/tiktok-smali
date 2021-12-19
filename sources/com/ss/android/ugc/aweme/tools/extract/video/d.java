package com.ss.android.ugc.aweme.tools.extract.video;

import android.content.Context;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ai;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f140124a;

    /* renamed from: b  reason: collision with root package name */
    private final ai f140125b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f140126c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f140127d;

    /* renamed from: e  reason: collision with root package name */
    private final CountDownLatch f140128e;

    static {
        Covode.recordClassIndex(91564);
    }

    public d(a aVar, ai aiVar, Object obj, Context context, CountDownLatch countDownLatch) {
        this.f140124a = aVar;
        this.f140125b = aiVar;
        this.f140126c = obj;
        this.f140127d = context;
        this.f140128e = countDownLatch;
    }

    @Override // b.g
    public final Object then(i iVar) {
        return a.a(this.f140125b, this.f140126c, this.f140127d, this.f140128e, iVar);
    }
}
