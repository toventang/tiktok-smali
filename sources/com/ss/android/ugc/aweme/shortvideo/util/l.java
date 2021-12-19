package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Bundle;
import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.c;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.tools.view.e.b;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.e;
import com.ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f132331a;

    /* renamed from: b  reason: collision with root package name */
    private final String f132332b;

    /* renamed from: c  reason: collision with root package name */
    private final b f132333c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f132334d = false;

    /* renamed from: e  reason: collision with root package name */
    private final j f132335e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList f132336f;

    static {
        Covode.recordClassIndex(86657);
    }

    l(Context context, String str, b bVar, j jVar, ArrayList arrayList) {
        this.f132331a = context;
        this.f132332b = str;
        this.f132333c = bVar;
        this.f132335e = jVar;
        this.f132336f = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = this.f132331a;
        c.a(context, null).a(this.f132332b, "gifs", (Map<String, String>) null, true, (com.ss.ugc.effectplatform.h.c) new com.ss.ugc.effectplatform.h.c(this.f132333c, this.f132334d, this.f132335e, this.f132336f) {
            /* class com.ss.android.ugc.aweme.shortvideo.util.f.AnonymousClass8 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f132315a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f132316b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ j f132317c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ArrayList f132318d;

            static {
                Covode.recordClassIndex(86651);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.ugc.effectplatform.h.e
            public final /* bridge */ /* synthetic */ void onSuccess(GifProviderEffectListResponse gifProviderEffectListResponse) {
            }

            @Override // com.ss.ugc.effectplatform.h.c
            public final void a(e eVar) {
                this.f132315a.dismiss();
                if (this.f132316b) {
                    this.f132317c.a(eVar.f153653c);
                } else {
                    this.f132317c.a(new Bundle());
                }
            }

            @Override // com.ss.ugc.effectplatform.h.c
            public final void a(List<? extends ProviderEffect> list) {
                this.f132315a.dismiss();
                Bundle bundle = new Bundle();
                for (ProviderEffect providerEffect : list) {
                    this.f132318d.add(new GreenScreenMaterial(3, 0, 0, providerEffect.getId(), providerEffect.getUser_name(), "", providerEffect.getPath(), "prop_reuse"));
                }
                bundle.putParcelableArrayList("green_screen_material_list", this.f132318d);
                this.f132317c.a(bundle);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
            @Override // com.ss.ugc.effectplatform.h.e
            public final /* synthetic */ void onFail(GifProviderEffectListResponse gifProviderEffectListResponse, e eVar) {
                this.f132315a.dismiss();
                if (this.f132316b) {
                    this.f132317c.a(eVar.f153653c);
                } else {
                    this.f132317c.a(new Bundle());
                }
            }

            {
                this.f132315a = r1;
                this.f132316b = r2;
                this.f132317c = r3;
                this.f132318d = r4;
            }
        });
        return null;
    }
}
