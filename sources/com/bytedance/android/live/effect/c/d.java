package com.bytedance.android.live.effect.c;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.effect.c.c;
import com.bytedance.android.live.effect.c.j;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f9712a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9713b;

    /* renamed from: c  reason: collision with root package name */
    private final c.b f9714c;

    static {
        Covode.recordClassIndex(4945);
    }

    d(c cVar, int i2, c.b bVar) {
        this.f9712a = cVar;
        this.f9713b = i2;
        this.f9714c = bVar;
    }

    public final void onClick(View view) {
        c cVar = this.f9712a;
        int i2 = this.f9713b;
        c.b bVar = this.f9714c;
        if (cVar.f9704c != null) {
            cVar.f9703b = i2;
            if (!(cVar.f9702a == null || cVar.f9702a.size() <= i2 || cVar.f9702a.get(i2).getEffect() == null)) {
                if (bVar != null) {
                    bVar.a();
                }
                cVar.f9702a.get(i2).setNew(false);
                j jVar = j.b.f9740a;
                String id = cVar.f9702a.get(i2).getEffect().getId();
                if (jVar.f9728a != null && !TextUtils.isEmpty(id)) {
                    for (FilterModel filterModel : jVar.f9728a) {
                        if (filterModel.getEffect() != null && id.equals(filterModel.getEffect().getId())) {
                            filterModel.setNew(false);
                            jVar.a(id, filterModel.getEffect().getTagsUpdatedAt());
                        }
                    }
                }
            }
            cVar.f9704c.a(i2);
            cVar.notifyDataSetChanged();
        }
    }
}
