package com.bytedance.android.live.effect.c;

import android.text.TextUtils;
import com.bytedance.android.live.effect.api.EffectRelatedApi;
import com.bytedance.android.live.effect.api.e;
import com.bytedance.android.live.effect.b;
import com.bytedance.android.live.effect.c.j;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.model.c;
import com.bytedance.android.livesdk.ap.a;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.List;

public final class f implements e {

    /* renamed from: c  reason: collision with root package name */
    static com.bytedance.android.live.effect.api.f f9722c = j.b.f9740a;

    /* renamed from: a  reason: collision with root package name */
    public List<FilterModel> f9723a = f9722c.a();

    /* renamed from: b  reason: collision with root package name */
    public c f9724b;

    /* renamed from: d  reason: collision with root package name */
    private int f9725d = -1;

    static {
        Covode.recordClassIndex(4951);
    }

    @Override // com.bytedance.android.live.effect.api.e
    public final void a() {
        f9722c.b(this);
        c cVar = this.f9724b;
        if (cVar != null) {
            cVar.f9874a = null;
        }
    }

    public f() {
        f9722c.a(this);
        this.f9724b = new c();
    }

    @Override // com.bytedance.android.live.effect.api.e
    public final String b() {
        if (this.f9723a.isEmpty()) {
            return "";
        }
        return this.f9723a.get(f()).getName();
    }

    @Override // com.bytedance.android.live.effect.api.e
    public final int f() {
        int intValue = a.O.a().intValue();
        if (intValue >= this.f9723a.size() || intValue < 0) {
            return 0;
        }
        return intValue;
    }

    @Override // com.bytedance.android.live.effect.api.e
    public final String e() {
        int intValue = a.O.a().intValue();
        if (intValue <= 0 || intValue >= this.f9723a.size()) {
            return "";
        }
        return this.f9723a.get(intValue).getFilterId();
    }

    @Override // com.bytedance.android.live.effect.api.e
    public final void c() {
        if (!this.f9723a.isEmpty()) {
            int f2 = f();
            int i2 = f2 - 1;
            if (i2 < 0) {
                i2 = this.f9723a.size() - 1;
            }
            FilterModel filterModel = this.f9723a.get(i2);
            if (f9722c.b(filterModel)) {
                if (!m.a(filterModel.getFilterId()) && !filterModel.getFilterId().equals("0")) {
                    b.f9657a.a(null, false, filterModel.getFilterId(), false, i2 + 1);
                }
                f9722c.b(i2);
                a(f2, i2);
            } else if (!f9722c.c(filterModel)) {
                f9722c.a(filterModel);
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.e
    public final void d() {
        if (!this.f9723a.isEmpty()) {
            int f2 = f();
            int i2 = f2 + 1;
            if (i2 >= this.f9723a.size()) {
                i2 = 0;
            }
            FilterModel filterModel = this.f9723a.get(i2);
            if (f9722c.b(filterModel)) {
                if (!m.a(filterModel.getFilterId()) && !filterModel.getFilterId().equals("0")) {
                    b.f9657a.a(null, false, filterModel.getFilterId(), false, i2 + 1);
                }
                f9722c.b(i2);
                a(f2, i2);
            } else if (!f9722c.c(filterModel)) {
                f9722c.a(filterModel);
            }
        }
    }

    private void a(FilterModel filterModel) {
        if (filterModel == null) {
            return;
        }
        if (TextUtils.isEmpty(filterModel.getFilterPath())) {
            this.f9724b.a();
        } else {
            this.f9724b.a(filterModel.getFilterPath(), f9722c.d(filterModel));
        }
    }

    @Override // com.bytedance.android.live.effect.api.e
    public final void a(int i2) {
        int f2 = f();
        if (i2 >= 0 && i2 < this.f9723a.size()) {
            if (f9722c.b(this.f9723a.get(i2))) {
                a(f2, i2);
            } else if (!f9722c.c(this.f9723a.get(i2))) {
                f9722c.a(this.f9723a.get(i2));
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.e
    public final void a(long j2) {
        String str;
        int intValue = a.O.a().intValue();
        if (intValue < f9722c.a().size()) {
            if (com.bytedance.common.utility.collection.b.a((Collection) f9722c.a()) || intValue >= f9722c.a().size() || f9722c.a().get(intValue) == null) {
                str = "";
            } else {
                str = f9722c.a().get(intValue).getName();
            }
            ((EffectRelatedApi) com.bytedance.android.live.network.e.a().a(EffectRelatedApi.class)).uploadBeautyParams(j2, str, (int) (a.P.a().floatValue() * 100.0f), (int) (a.Q.a().floatValue() * 100.0f), (int) (a.R.a().floatValue() * 100.0f), (int) (a.S.a().floatValue() * 100.0f), false).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(g.f9726a, h.f9727a);
        }
    }

    @Override // com.bytedance.android.live.effect.api.e
    public final void a(com.bytedance.android.live.effect.api.c cVar) {
        FilterModel filterModel;
        cVar.a(this.f9724b);
        int f2 = f();
        if (f2 <= 0 || f2 >= this.f9723a.size()) {
            filterModel = null;
        } else {
            filterModel = this.f9723a.get(f2);
        }
        a(filterModel);
    }

    @Override // com.bytedance.android.live.effect.api.f.b
    public final void a(boolean z) {
        if (z) {
            List<FilterModel> a2 = f9722c.a();
            this.f9723a = a2;
            if (!com.bytedance.common.utility.collection.b.a((Collection) a2) && a.O.a().intValue() > 0 && a.O.a().intValue() < this.f9723a.size() && this.f9724b != null) {
                a(a.O.a().intValue());
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.e
    public final void a(FilterModel filterModel, float f2) {
        c cVar = this.f9724b;
        if (cVar != null) {
            cVar.a(filterModel.getFilterPath(), f2);
        }
    }

    private void a(int i2, int i3) {
        String str;
        if (i2 < this.f9723a.size() && i3 < this.f9723a.size()) {
            com.bytedance.android.livesdk.ap.c.a(a.O, Integer.valueOf(i3));
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.live.broadcast.api.model.c(i3));
            if (f() == 0 || this.f9723a.isEmpty()) {
                str = "";
            } else {
                str = this.f9723a.get(f()).getFilterPath();
            }
            if (i3 == 0) {
                com.bytedance.android.live.core.c.a.a(3, "LiveFilterHelper", "FilterEffect unset");
                this.f9724b.a();
                return;
            }
            com.bytedance.android.live.core.c.a.a(3, "LiveFilterHelper", "FilterEffect update file:".concat(String.valueOf(str)));
            a(this.f9723a.get(f()));
        }
    }
}
