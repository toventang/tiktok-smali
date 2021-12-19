package com.bytedance.ies.ugc.aweme.rich.c.b;

import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.c.a.c;
import com.bytedance.ies.ugc.aweme.rich.c.a.d;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final JSONObject f35159a = new JSONObject();

    /* renamed from: b  reason: collision with root package name */
    final SparseArray<Bundle> f35160b;

    /* renamed from: c  reason: collision with root package name */
    final List<Integer> f35161c;

    /* renamed from: d  reason: collision with root package name */
    final d f35162d;

    /* renamed from: e  reason: collision with root package name */
    final c f35163e;

    static {
        Covode.recordClassIndex(21069);
    }

    public b(SparseArray<Bundle> sparseArray, List<Integer> list, d dVar, c cVar) {
        l.c(sparseArray, "");
        l.c(list, "");
        l.c(dVar, "");
        l.c(cVar, "");
        this.f35160b = sparseArray;
        this.f35161c = list;
        this.f35162d = dVar;
        this.f35163e = cVar;
    }
}
