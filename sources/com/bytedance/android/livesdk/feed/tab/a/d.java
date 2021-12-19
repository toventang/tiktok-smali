package com.bytedance.android.livesdk.feed.tab.a;

import com.bytedance.android.live.network.h;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.model.ah;
import com.bytedance.android.livesdkapi.depend.model.live.f;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    String[] f17655a = {"live"};

    /* renamed from: b  reason: collision with root package name */
    String[] f17656b;

    /* renamed from: c  reason: collision with root package name */
    String[] f17657c = {"live"};

    /* renamed from: d  reason: collision with root package name */
    String[] f17658d = {"live"};

    /* renamed from: e  reason: collision with root package name */
    int[] f17659e = {1};

    /* renamed from: f  reason: collision with root package name */
    int[] f17660f = {1};

    /* renamed from: g  reason: collision with root package name */
    int[] f17661g = {1};

    /* renamed from: h  reason: collision with root package name */
    int[] f17662h = {1};

    /* renamed from: i  reason: collision with root package name */
    int[] f17663i = {1001};

    /* renamed from: j  reason: collision with root package name */
    int[] f17664j = {0};

    /* renamed from: k  reason: collision with root package name */
    boolean[] f17665k = {false};

    /* renamed from: l  reason: collision with root package name */
    int[] f17666l = {0};

    static {
        Covode.recordClassIndex(9798);
    }

    @Override // com.bytedance.android.livesdk.feed.tab.a.c
    public final List<ah> a() {
        ArrayList arrayList = new ArrayList(1);
        for (int i2 = 0; i2 < this.f17655a.length; i2++) {
            ah ahVar = new ah();
            ahVar.setId((long) this.f17662h[i2]);
            ahVar.setEvent(this.f17657c[i2]);
            ahVar.setName(this.f17655a[i2]);
            ahVar.setUrl(this.f17656b[i2]);
            ahVar.setShowdefault(this.f17659e[i2]);
            ahVar.setStyle(this.f17660f[i2]);
            ahVar.setType(this.f17661g[i2]);
            ahVar.setSource(this.f17663i[i2]);
            ahVar.setDislike(this.f17664j[i2]);
            arrayList.add(ahVar);
        }
        return arrayList;
    }

    public d() {
        if (f.f23137c == null) {
            f.f23137c = Boolean.valueOf(((IHostContext) a.a(IHostContext.class)).isOffline());
        }
        if (f.f23137c.booleanValue()) {
            StringBuilder sb = new StringBuilder("https://");
            h.a();
            this.f17656b = new String[]{sb.append(h.c()).append("/webcast/feed/?content_type=0&style=2&channel_id=21&debug=true").toString()};
        } else {
            StringBuilder sb2 = new StringBuilder("https://");
            h.a();
            this.f17656b = new String[]{sb2.append(h.c()).append("/webcast/feed/?content_type=0&style=2&channel_id=21").toString()};
        }
        this.f17655a[0] = "Top LIVEs";
        this.f17660f[0] = 2;
    }
}
