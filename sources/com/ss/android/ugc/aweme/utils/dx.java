package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.google.gson.c.c;
import com.google.gson.internal.bind.i;
import com.google.gson.internal.k;
import com.google.gson.l;
import com.google.gson.q;
import com.google.gson.v;

public final class dx extends v<String> {
    static {
        Covode.recordClassIndex(93455);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.v
    public final /* synthetic */ String read(a aVar) {
        l a2 = k.a(aVar);
        if (a2 != null) {
            return a2.toString();
        }
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
    @Override // com.google.gson.v
    public final /* synthetic */ void write(c cVar, String str) {
        i.X.write(cVar, q.a(str));
    }
}
