package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.google.gson.c.c;
import com.google.gson.q;
import com.google.gson.v;

public class RawStringJsonAdapter extends v<String> {
    static {
        Covode.recordClassIndex(59506);
    }

    @Override // com.google.gson.v
    public String read(a aVar) {
        return q.a(aVar).toString();
    }

    public void write(c cVar, String str) {
        if (str == null) {
            cVar.f();
            return;
        }
        cVar.g();
        cVar.h();
        cVar.f54683a.append((CharSequence) str);
    }
}
