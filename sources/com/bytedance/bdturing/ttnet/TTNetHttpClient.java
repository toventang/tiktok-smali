package com.bytedance.bdturing.ttnet;

import android.content.Context;
import com.bytedance.bdturing.a;
import com.bytedance.bdturing.d.a;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class TTNetHttpClient implements a {
    private Context context;

    static {
        Covode.recordClassIndex(15592);
    }

    public TTNetHttpClient(Context context2) {
        this.context = context2;
        if (a.C0562a.f26400a.f26393a.x) {
            a.a();
        }
    }

    @Override // com.bytedance.bdturing.d.a
    public byte[] get(String str, Map<String, String> map) {
        b.a(this.context, str, map);
        return a.a(str, map);
    }

    @Override // com.bytedance.bdturing.d.a
    public byte[] post(String str, Map<String, String> map, byte[] bArr) {
        b.a(this.context, str, map);
        return a.a(str, bArr, map);
    }
}
