package com.ss.android.ugc.aweme.discover.mixfeed;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.a.e;
import com.bytedance.ies.ugc.aweme.network.a.f;
import com.ss.android.ugc.aweme.app.api.c;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import java.util.List;

public class m extends SearchApiResult implements f, c {
    @com.google.gson.a.c(a = "cursor")

    /* renamed from: a  reason: collision with root package name */
    public int f81824a;
    @com.google.gson.a.c(a = "has_more")

    /* renamed from: b  reason: collision with root package name */
    public boolean f81825b;
    @com.google.gson.a.c(a = "data")

    /* renamed from: c  reason: collision with root package name */
    public List<h> f81826c;
    @com.google.gson.a.c(a = "backtrace")

    /* renamed from: e  reason: collision with root package name */
    public String f81827e;

    /* renamed from: f  reason: collision with root package name */
    public String f81828f;

    /* renamed from: g  reason: collision with root package name */
    public i<m> f81829g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f81830h;
    @com.google.gson.a.c(a = "ack")

    /* renamed from: i  reason: collision with root package name */
    public int f81831i = -2;
    @com.google.gson.a.c(a = "result_status")

    /* renamed from: j  reason: collision with root package name */
    public int f81832j;

    /* renamed from: k  reason: collision with root package name */
    transient e f81833k;

    /* renamed from: l  reason: collision with root package name */
    public transient boolean f81834l;

    static {
        Covode.recordClassIndex(50818);
    }

    @Override // com.bytedance.ies.ugc.aweme.network.a.f
    public final void a(e eVar) {
        this.f81833k = eVar;
    }

    @Override // com.ss.android.ugc.aweme.app.api.c
    public void setJsonData(String str) {
        this.f81828f = str;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d, com.ss.android.ugc.aweme.discover.model.SearchApiResult
    public void setRequestId(String str) {
        super.setRequestId(str);
        List<h> list = this.f81826c;
        if (list != null) {
            for (h hVar : list) {
                hVar.setRequestId(str);
            }
        }
    }
}
