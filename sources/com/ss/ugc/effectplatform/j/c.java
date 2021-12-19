package com.ss.ugc.effectplatform.j;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.task.FetchCategoryEffectTask;
import com.ss.ugc.effectplatform.task.FetchPanelEffectListTask;
import com.ss.ugc.effectplatform.task.FetchPanelInfoTask;
import com.ss.ugc.effectplatform.task.al;
import com.ss.ugc.effectplatform.task.m;
import com.ss.ugc.effectplatform.task.u;
import com.ss.ugc.effectplatform.task.v;
import com.ss.ugc.effectplatform.util.t;
import d.a.f.d;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f153623a;

    static {
        Covode.recordClassIndex(102428);
    }

    public c(a aVar) {
        l.c(aVar, "");
        this.f153623a = aVar;
    }

    public final String a(String str, e<EffectChannelResponse> eVar) {
        String a2 = t.a();
        if (eVar != null) {
            this.f153623a.K.a(a2, eVar);
        }
        m mVar = new m(this.f153623a, str, a2);
        al alVar = this.f153623a.z;
        if (alVar != null) {
            alVar.a(mVar);
        }
        return a2;
    }

    public final String a(String str, boolean z, e<EffectChannelResponse> eVar) {
        d fetchPanelEffectListTask;
        l.c(str, "");
        String a2 = t.a();
        this.f153623a.K.a(a2, eVar);
        if (z) {
            fetchPanelEffectListTask = new u(this.f153623a, str, a2);
        } else {
            fetchPanelEffectListTask = new FetchPanelEffectListTask(this.f153623a, str, null, a2);
        }
        al alVar = this.f153623a.z;
        if (alVar != null) {
            alVar.a(fetchPanelEffectListTask);
        }
        return a2;
    }

    public final String a(String str, boolean z, String str2, int i2, int i3, boolean z2, e<PanelInfoModel> eVar) {
        d fetchPanelInfoTask;
        l.c(str, "");
        String a2 = t.a();
        if (eVar != null) {
            this.f153623a.K.a(a2, eVar);
        }
        if (z2) {
            fetchPanelInfoTask = new v(this.f153623a, str, a2, z, str2, i2, i3);
        } else {
            fetchPanelInfoTask = new FetchPanelInfoTask(this.f153623a, str, a2, z, str2, i2, i3, null);
        }
        al alVar = this.f153623a.z;
        if (alVar != null) {
            alVar.a(fetchPanelInfoTask);
        }
        return a2;
    }

    public final String a(String str, String str2, int i2, int i3, int i4, String str3, boolean z, e<CategoryPageModel> eVar) {
        d fetchCategoryEffectTask;
        l.c(str, "");
        String a2 = t.a();
        if (eVar != null) {
            this.f153623a.K.a(a2, eVar);
        }
        if (z) {
            fetchCategoryEffectTask = new com.ss.ugc.effectplatform.task.l(this.f153623a, str, a2, str2, i2, i3, i4);
        } else {
            fetchCategoryEffectTask = new FetchCategoryEffectTask(this.f153623a, str, a2, str2, i2, i3, i4, str3, null);
        }
        al alVar = this.f153623a.z;
        if (alVar != null) {
            alVar.a(fetchCategoryEffectTask);
        }
        return a2;
    }
}
