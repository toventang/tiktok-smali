package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.v;
import k.i;

class ByteStringTypeAdapter extends v<i> {
    static {
        Covode.recordClassIndex(36098);
    }

    ByteStringTypeAdapter() {
    }

    @Override // com.google.gson.v
    public i read(a aVar) {
        if (aVar.f() != b.NULL) {
            return i.decodeBase64(aVar.i());
        }
        aVar.k();
        return null;
    }

    public void write(c cVar, i iVar) {
        if (iVar == null) {
            cVar.f();
        } else {
            cVar.b(iVar.base64());
        }
    }
}
