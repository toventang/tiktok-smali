package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import com.bytedance.android.live.base.a;
import com.bytedance.android.livesdkapi.model.c;
import com.bytedance.android.livesdkapi.ws.d;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public interface IHostNetwork extends a {
    static {
        Covode.recordClassIndex(13786);
    }

    c<com.bytedance.android.livesdkapi.model.a> downloadFile(boolean z, int i2, String str, List<com.bytedance.android.live.base.model.a> list, Object obj);

    c<com.bytedance.android.livesdkapi.model.a> get(String str, List<com.bytedance.android.live.base.model.a> list, Object obj);

    Map<String, String> getCommonParams();

    String getHostDomain();

    c<com.bytedance.android.livesdkapi.model.a> post(String str, List<com.bytedance.android.live.base.model.a> list, String str2, byte[] bArr, Object obj);

    com.bytedance.android.livesdkapi.ws.a registerWsChannel(Context context, String str, Map<String, String> map, d dVar);

    c<com.bytedance.android.livesdkapi.model.a> uploadFile(int i2, String str, List<com.bytedance.android.live.base.model.a> list, String str2, byte[] bArr, long j2, String str3);
}
