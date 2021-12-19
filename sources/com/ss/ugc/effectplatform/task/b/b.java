package com.ss.ugc.effectplatform.task.b;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.f.f;
import com.ss.ugc.effectplatform.util.k;
import d.a.d.a.d;
import d.a.f.c;
import h.f.b.l;

public final class b implements c<String, String> {

    /* renamed from: a  reason: collision with root package name */
    private final String f153792a;

    static {
        Covode.recordClassIndex(102577);
    }

    public b(String str) {
        l.c(str, "");
        this.f153792a = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // d.a.f.c
    public final /* synthetic */ String a(String str) {
        String str2 = str;
        l.c(str2, "");
        if (k.b(str2, this.f153792a)) {
            d.g(str2);
            return this.f153792a;
        }
        throw new f("unzip file failed!");
    }
}
