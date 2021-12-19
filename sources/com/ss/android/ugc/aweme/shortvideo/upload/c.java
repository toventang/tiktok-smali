package com.ss.android.ugc.aweme.shortvideo.upload;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.b.a.a;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.upload.c.b;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.r;
import dmt.av.video.z;
import java.util.ArrayList;
import java.util.List;

public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    public final l f132071a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f132072b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final a f132073c;

    /* renamed from: d  reason: collision with root package name */
    public final int f132074d;

    /* renamed from: e  reason: collision with root package name */
    public r f132075e;

    /* renamed from: f  reason: collision with root package name */
    public r f132076f;

    /* renamed from: g  reason: collision with root package name */
    public VEVideoEncodeSettings f132077g;

    /* renamed from: h  reason: collision with root package name */
    public final String f132078h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f132079i;

    /* renamed from: j  reason: collision with root package name */
    public final b f132080j;

    /* renamed from: k  reason: collision with root package name */
    public z f132081k;

    /* renamed from: l  reason: collision with root package name */
    public a<SynthetiseResult> f132082l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f132083m = false;
    private final n n;

    static {
        Covode.recordClassIndex(86523);
    }

    @Override // androidx.lifecycle.m
    public final i getLifecycle() {
        return this.n;
    }

    public c(l lVar, a aVar, String str, boolean z, b bVar) {
        n nVar = new n(this, false);
        this.n = nVar;
        nVar.a(i.b.STARTED);
        this.f132071a = lVar;
        this.f132073c = aVar;
        this.f132074d = 0;
        this.f132078h = str;
        this.f132079i = z;
        this.f132080j = bVar;
    }
}
