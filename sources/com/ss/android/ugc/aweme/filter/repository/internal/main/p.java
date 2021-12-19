package com.ss.android.ugc.aweme.filter.repository.internal.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.q;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import h.a.ag;
import h.a.z;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class p implements q {

    /* renamed from: a  reason: collision with root package name */
    final t<List<FilterBean>> f95738a;

    /* renamed from: b  reason: collision with root package name */
    final t<List<FilterBean>> f95739b;

    /* renamed from: c  reason: collision with root package name */
    private final t<List<h.p<EffectCategoryResponse, List<FilterBean>>>> f95740c;

    /* renamed from: d  reason: collision with root package name */
    private final t<Map<String, Effect>> f95741d;

    static {
        Covode.recordClassIndex(60664);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.q
    public final LiveData<List<FilterBean>> a() {
        return this.f95738a;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.q
    public final LiveData<List<FilterBean>> b() {
        return this.f95739b;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.q
    public final LiveData<List<h.p<EffectCategoryResponse, List<FilterBean>>>> c() {
        return this.f95740c;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.q
    public final LiveData<Map<String, Effect>> d() {
        return this.f95741d;
    }

    public /* synthetic */ p() {
        this(z.INSTANCE);
    }

    private p(List<? extends FilterBean> list) {
        l.d(list, "");
        t<List<FilterBean>> tVar = new t<>();
        this.f95738a = tVar;
        t<List<h.p<EffectCategoryResponse, List<FilterBean>>>> tVar2 = new t<>();
        this.f95740c = tVar2;
        t<Map<String, Effect>> tVar3 = new t<>();
        this.f95741d = tVar3;
        t<List<FilterBean>> tVar4 = new t<>();
        this.f95739b = tVar4;
        tVar.setValue(list);
        tVar4.setValue(list);
        tVar2.setValue(z.INSTANCE);
        tVar3.setValue(ag.a());
    }
}
