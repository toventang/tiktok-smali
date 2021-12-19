package com.ss.android.ugc.aweme.sticker.view.internal.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.sticker.view.a.b;
import com.ss.android.ugc.aweme.sticker.view.a.g;
import com.ss.android.ugc.aweme.sticker.view.a.k;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.z;

public class StickerViewImpl extends AbstractStickerView implements au {
    private final h u;

    static {
        Covode.recordClassIndex(89004);
    }

    private b<j, Fragment> o() {
        return (b) this.u.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class a extends h.f.b.m implements h.f.a.a<b<j, Fragment>> {
        final /* synthetic */ b $categoryViewProvider;

        static {
            Covode.recordClassIndex(89005);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.$categoryViewProvider = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b<j, Fragment> invoke() {
            b bVar = this.$categoryViewProvider;
            if (bVar == null) {
                return new c((byte) 0);
            }
            return bVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView
    public final void a(ViewGroup viewGroup) {
        MethodCollector.i(10212);
        l.d(viewGroup, "");
        super.a(viewGroup);
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d0k);
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aiq, frameLayout, false);
        if (a2 != null) {
            frameLayout.addView((ViewGroup) a2);
            MethodCollector.o(10212);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(10212);
        throw nullPointerException;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView
    public final g b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        com.ss.android.ugc.aweme.sticker.panel.g gVar = this.t.f135224l;
        ViewPager viewPager = (ViewPager) viewGroup.findViewById(R.id.fkd);
        l.b(viewPager, "");
        viewPager.setOffscreenPageLimit(3);
        ViewGroup.LayoutParams layoutParams = viewPager.getLayoutParams();
        if (this.t.f135217e > 0) {
            Context context = viewPager.getContext();
            l.b(context, "");
            layoutParams.height = (int) r.a(context, (float) this.t.f135217e);
            viewPager.setLayoutParams(layoutParams);
        }
        h.f.a.b<? super ViewPager, z> bVar = gVar.f135112b;
        if (bVar != null) {
            bVar.invoke(viewPager);
        }
        com.ss.android.ugc.aweme.sticker.view.internal.pager.b bVar2 = new com.ss.android.ugc.aweme.sticker.view.internal.pager.b(viewPager, a(), this.f136237a, this.q, this.r, o());
        b().setSupportCustomIndicator(false);
        h.f.a.b<? super TabLayout, z> bVar3 = this.t.f135224l.f135113c;
        if (bVar3 != null) {
            bVar3.invoke(b());
        }
        return new l(b(), this.n, this.p, this.t, bVar2, this.q, a(), o());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerViewImpl(e eVar, ViewGroup viewGroup, m mVar, l.b bVar, l.a aVar, com.ss.android.ugc.aweme.sticker.d.e eVar2, com.ss.android.ugc.aweme.sticker.panel.j jVar, androidx.fragment.app.i iVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a aVar2, b<j, Fragment> bVar2, k kVar, boolean z, com.ss.android.ugc.aweme.sticker.view.internal.search.a aVar3) {
        super(eVar, viewGroup, mVar, bVar, aVar, eVar2, jVar, kVar, iVar, aVar2, z, aVar3);
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(viewGroup, "");
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(eVar2, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(aVar3, "");
        this.u = h.i.a((h.f.a.a) new a(bVar2));
    }
}
