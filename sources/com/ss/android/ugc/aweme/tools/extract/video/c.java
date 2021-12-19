package com.ss.android.ugc.aweme.tools.extract.video;

import b.g;
import b.i;
import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.tools.extract.ab;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f140121a;

    /* renamed from: b  reason: collision with root package name */
    private final ai f140122b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f140123c;

    static {
        Covode.recordClassIndex(91563);
    }

    public c(a aVar, ai aiVar, Object obj) {
        this.f140121a = aVar;
        this.f140122b = aiVar;
        this.f140123c = obj;
    }

    @Override // b.g
    public final Object then(i iVar) {
        ai aiVar = this.f140122b;
        Object obj = this.f140123c;
        if (iVar.c()) {
            ab.a(aiVar, obj, (Integer) -1001, (Boolean) false, "");
        }
        j jVar = new j();
        i.b(new f(obj, jVar), i.f4825b);
        return jVar.f4869a;
    }
}
