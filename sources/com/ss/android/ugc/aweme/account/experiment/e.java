package com.ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.account.experiment.service.AccountExperimentLayerServiceImpl;
import com.ss.android.ugc.aweme.account.login.v;
import com.ss.android.ugc.aweme.cf;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Objects;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f62982a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final int f62983b = 1;

    /* renamed from: c  reason: collision with root package name */
    private static final int f62984c = 2;

    /* renamed from: d  reason: collision with root package name */
    private static final int f62985d = 3;

    /* renamed from: e  reason: collision with root package name */
    private static final h f62986e = i.a((h.f.a.a) a.f62987a);

    private e() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f62987a = new a();

        static {
            Covode.recordClassIndex(38801);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a("remove_vk", ClientExpManager.remove_vk()));
        }
    }

    static {
        Covode.recordClassIndex(38800);
    }

    public static v[] a(v[] vVarArr) {
        int b2;
        l.d(vVarArr, "");
        if (!AccountExperimentLayerServiceImpl.b().a(cf.DEPRIORITIZE_VK)) {
            return vVarArr;
        }
        int intValue = ((Number) f62986e.getValue()).intValue();
        if (intValue == f62983b) {
            ArrayList arrayList = new ArrayList();
            for (v vVar : vVarArr) {
                if (vVar != v.VK) {
                    arrayList.add(vVar);
                }
            }
            Object[] array = arrayList.toArray(new v[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return (v[]) array;
        }
        if (intValue == f62984c && (b2 = h.a.i.b(vVarArr, v.VK)) >= 0 && b2 != vVarArr.length - 1) {
            int i2 = b2 + 1;
            vVarArr[b2] = vVarArr[i2];
            vVarArr[i2] = v.VK;
        }
        return vVarArr;
    }
}
