package com.ss.android.ugc.aweme.im.sdk.share.data.a;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import h.f.b.l;
import java.util.List;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final t<String> f103386a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public final t<List<IMContact>> f103387b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<List<IMContact>> f103388c = new t<>();

    /* renamed from: e  reason: collision with root package name */
    private final List<IMContact> f103389e;

    static {
        Covode.recordClassIndex(66252);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.data.a.b
    public final void a(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.data.a.b
    public final void d() {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.data.a.b
    public final void f() {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.data.a.b
    public final /* bridge */ /* synthetic */ LiveData a() {
        return this.f103386a;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.data.a.b
    public final /* bridge */ /* synthetic */ LiveData b() {
        return this.f103387b;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.data.a.b
    public final /* bridge */ /* synthetic */ LiveData c() {
        return this.f103388c;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.data.a.b
    public final void e() {
        this.f103388c.setValue(this.f103389e);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends IMContact> list) {
        l.d(list, "");
        this.f103389e = list;
    }
}
