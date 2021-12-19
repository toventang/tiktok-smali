package com.bytedance.android.live.effect.c;

import android.text.TextUtils;
import com.bytedance.android.live.effect.c.j;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import f.a.v;
import f.a.w;

final /* synthetic */ class n implements w {

    /* renamed from: a  reason: collision with root package name */
    private final j f9744a;

    /* renamed from: b  reason: collision with root package name */
    private final FilterModel f9745b;

    static {
        Covode.recordClassIndex(4963);
    }

    n(j jVar, FilterModel filterModel) {
        this.f9744a = jVar;
        this.f9745b = filterModel;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        j jVar = this.f9744a;
        FilterModel filterModel = this.f9745b;
        j jVar2 = j.b.f9740a;
        String id = filterModel.getEffect().getId();
        String tagsUpdatedAt = filterModel.getEffect().getTagsUpdatedAt();
        j.AnonymousClass1 r2 = new IIsTagNeedUpdatedListener(filterModel, vVar) {
            /* class com.bytedance.android.live.effect.c.j.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FilterModel f9734a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f9735b;

            static {
                Covode.recordClassIndex(4956);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
            public final void onTagNeedNotUpdate() {
                this.f9734a.setNew(false);
                this.f9735b.a();
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
            public final void onTagNeedUpdate() {
                this.f9734a.setNew(true);
                this.f9735b.a();
            }

            {
                this.f9734a = r2;
                this.f9735b = r3;
            }
        };
        if (jVar2.f9729b == null || id == null || tagsUpdatedAt == null || TextUtils.equals("NULL", tagsUpdatedAt.toUpperCase())) {
            r2.onTagNeedNotUpdate();
        } else {
            jVar2.f9729b.isTagUpdated(id, tagsUpdatedAt, r2);
        }
    }
}
