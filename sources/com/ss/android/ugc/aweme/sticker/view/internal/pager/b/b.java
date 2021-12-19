package com.ss.android.ugc.aweme.sticker.view.internal.pager.b;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.d;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.tools.view.style.j;
import h.f.b.l;
import h.z;

public final class b implements com.ss.android.ugc.aweme.sticker.view.a.a<j, Fragment> {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.favorite.b f136405a;

    /* renamed from: b  reason: collision with root package name */
    public final o f136406b;

    /* renamed from: c  reason: collision with root package name */
    private final c f136407c;

    /* renamed from: d  reason: collision with root package name */
    private final m f136408d;

    static {
        Covode.recordClassIndex(89081);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f136409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EffectCategoryModel f136410b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f136411c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f136412d;

        static {
            Covode.recordClassIndex(89082);
        }

        a(b bVar, EffectCategoryModel effectCategoryModel, e eVar, h.f.a.a aVar) {
            this.f136409a = bVar;
            this.f136410b = effectCategoryModel;
            this.f136411c = eVar;
            this.f136412d = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f136409a.f136405a.b()) {
                this.f136409a.f136405a.a(this.f136411c, "", 241, this.f136409a.f136405a.a(), new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.sticker.view.internal.pager.b.b.a.AnonymousClass1 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(89083);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f136409a.f136406b.c().a(new com.ss.android.ugc.aweme.sticker.repository.c.a("sticker_category:favorite", null, false, 62));
                        return z.f158842a;
                    }
                });
            } else {
                this.f136412d.invoke();
            }
        }
    }

    public b(m mVar, com.ss.android.ugc.aweme.sticker.favorite.b bVar, o oVar, StickerPreferences stickerPreferences) {
        l.d(mVar, "");
        l.d(bVar, "");
        l.d(oVar, "");
        l.d(stickerPreferences, "");
        this.f136408d = mVar;
        this.f136405a = bVar;
        this.f136406b = oVar;
        this.f136407c = new c(mVar, bVar, oVar, stickerPreferences);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.a
    public final d<Fragment> a(int i2, l.b bVar, l.a aVar, RecyclerView.RecycledViewPool recycledViewPool) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(recycledViewPool, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.b bVar2 = new com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.b();
        bVar2.a(i2, bVar, aVar, recycledViewPool);
        return bVar2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0041  */
    @Override // com.ss.android.ugc.aweme.sticker.view.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.ss.android.ugc.tools.view.style.j a(androidx.fragment.app.e r9, com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r10, com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout r11, h.f.a.a r12) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.view.internal.pager.b.b.a(androidx.fragment.app.e, com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout, h.f.a.a):java.lang.Object");
    }
}
