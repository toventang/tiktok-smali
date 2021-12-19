package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.aweme.tools.beauty.d;
import com.ss.android.ugc.aweme.tools.beauty.g.m;
import com.ss.android.ugc.aweme.tools.beauty.h;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final m f139064a;

    /* renamed from: b  reason: collision with root package name */
    public f.a f139065b;

    /* renamed from: c  reason: collision with root package name */
    public f.b f139066c;

    /* renamed from: d  reason: collision with root package name */
    public g f139067d;

    static {
        Covode.recordClassIndex(90958);
    }

    public final boolean b() {
        com.ss.android.ugc.aweme.tools.beauty.b.c.b bVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.b) this.f139067d.a(com.ss.android.ugc.aweme.tools.beauty.b.c.b.class);
        if (bVar != null) {
            return bVar.c();
        }
        return true;
    }

    public final boolean c() {
        com.ss.android.ugc.aweme.tools.beauty.b.c.b bVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.b) this.f139067d.a(com.ss.android.ugc.aweme.tools.beauty.b.c.b.class);
        if (bVar != null) {
            return bVar.d();
        }
        return false;
    }

    public final ComposerBeauty d() {
        boolean z;
        com.ss.android.ugc.aweme.tools.beauty.b.c.c cVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.c) this.f139067d.a(com.ss.android.ugc.aweme.tools.beauty.b.c.c.class);
        com.ss.android.ugc.aweme.tools.beauty.b.c.c cVar2 = (com.ss.android.ugc.aweme.tools.beauty.b.c.c) this.f139067d.a(com.ss.android.ugc.aweme.tools.beauty.b.c.c.class);
        if (cVar2 != null) {
            z = cVar2.a();
        } else {
            z = false;
        }
        if (z) {
            if (cVar != null) {
                return cVar.c();
            }
            return null;
        } else if (cVar != null) {
            return cVar.b();
        } else {
            return null;
        }
    }

    public final boolean a() {
        ComposerBeauty b2;
        ComposerBeautyExtraBeautify beautifyExtra;
        List<ComposerBeautyExtraBeautify.ItemsBean> items;
        com.ss.android.ugc.aweme.tools.beauty.b.c.c cVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.c) this.f139067d.a(com.ss.android.ugc.aweme.tools.beauty.b.c.c.class);
        if (cVar == null) {
            return false;
        }
        if (cVar.a()) {
            b2 = cVar.c();
        } else {
            b2 = cVar.b();
        }
        if (b2 == null || (beautifyExtra = b2.getBeautifyExtra()) == null || (items = beautifyExtra.getItems()) == null || items.size() != 2) {
            return false;
        }
        return true;
    }

    public static final class a implements m.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f139068a;

        static {
            Covode.recordClassIndex(90959);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(e eVar) {
            this.f139068a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.g.m.c
        public final void a(List<BeautyComposerInfo> list) {
            f.a aVar;
            l.d(list, "");
            if ((!this.f139068a.c() || this.f139068a.b()) && (aVar = this.f139068a.f139065b) != null) {
                aVar.a(list, 10000);
            }
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.g.m.c
        public final void a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2) {
            f.a aVar;
            l.d(list, "");
            l.d(list2, "");
            if ((!this.f139068a.c() || this.f139068a.b()) && (aVar = this.f139068a.f139065b) != null) {
                aVar.a(list, list2, 10000);
            }
        }
    }

    public static final class b implements m.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f139069a;

        static {
            Covode.recordClassIndex(90960);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(e eVar) {
            this.f139069a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.g.m.c
        public final void a(List<BeautyComposerInfo> list) {
            f.a aVar;
            l.d(list, "");
            if ((!this.f139069a.c() || this.f139069a.b()) && (aVar = this.f139069a.f139065b) != null) {
                aVar.a(list, 10000);
            }
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.g.m.c
        public final void a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2) {
            f.a aVar;
            l.d(list, "");
            l.d(list2, "");
            if ((!this.f139069a.c() || this.f139069a.b()) && (aVar = this.f139069a.f139065b) != null) {
                aVar.a(list, list2, 10000);
            }
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<ComposerBeauty, z> {
        final /* synthetic */ int $level;
        final /* synthetic */ int $max;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, int i2, int i3) {
            super(1);
            this.this$0 = eVar;
            this.$level = i2;
            this.$max = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return z.f158842a;
        }

        public final void a(ComposerBeauty composerBeauty) {
            l.d(composerBeauty, "");
            composerBeauty.setProgressValue(this.$level);
            boolean a2 = this.this$0.f139064a.g().a(composerBeauty);
            boolean f2 = d.f(composerBeauty);
            if (!a2 || !f2) {
                com.ss.android.ugc.aweme.dependence.beauty.a.a("update composer error, beautyAvailable:" + a2 + ",canUpdateComposerNode:" + f2 + ',' + "effectId:" + composerBeauty.getEffect().getEffectId() + ",name:" + composerBeauty.getEffect().getName() + ",id:" + composerBeauty.getEffect().getId());
                return;
            }
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    float a3 = h.a(new h.a(t.getDoubleDirection(), this.$max, 0, t.getMax(), t.getMin(), 0.0f, this.$level, 332));
                    f.a aVar = this.this$0.f139065b;
                    if (aVar != null) {
                        aVar.a(composerBeauty.getEffect().getUnzipPath(), t.getTag(), a3 / 100.0f);
                    }
                }
            }
        }
    }

    static List<String> a(ComposerBeauty composerBeauty) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (items == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(n.a((Iterable) items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getTag());
        }
        return arrayList;
    }

    public final float a(ComposerBeauty composerBeauty, String str, float f2) {
        l.d(composerBeauty, "");
        return this.f139064a.a(composerBeauty, str, f2);
    }

    public e(m mVar, f.a aVar, f.b bVar, g gVar) {
        l.d(mVar, "");
        l.d(gVar, "");
        this.f139064a = mVar;
        this.f139065b = aVar;
        this.f139066c = bVar;
        this.f139067d = gVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, BeautySeekBar beautySeekBar, boolean z, HashMap<BeautySeekBar, ComposerBeautyExtraBeautify.ItemsBean> hashMap, ComposerBeauty composerBeauty) {
        ComposerBeautyExtraBeautify.ItemsBean itemsBean;
        if (!z) {
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null && !items.isEmpty() && items != null) {
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    a(composerBeauty, it.next(), beautySeekBar, i2, composerBeauty);
                }
                return;
            }
            return;
        }
        List<ComposerBeautyExtraBeautify.ItemsBean> items2 = composerBeauty.getBeautifyExtra().getItems();
        if (items2 != null && items2.size() >= 2 && (itemsBean = hashMap.get(beautySeekBar)) != null) {
            l.b(itemsBean, "");
            a(composerBeauty, itemsBean, beautySeekBar, i2, composerBeauty);
        }
    }

    private final void a(ComposerBeauty composerBeauty, ComposerBeautyExtraBeautify.ItemsBean itemsBean, BeautySeekBar beautySeekBar, int i2, ComposerBeauty composerBeauty2) {
        com.ss.android.ugc.aweme.tools.beauty.g.n<BeautyComposerInfo> nVar;
        float a2 = h.a(new h.a(itemsBean.getDoubleDirection(), beautySeekBar.getMaxPercent(), 0, itemsBean.getMax(), itemsBean.getMin(), 0.0f, i2, 332));
        this.f139064a.b(composerBeauty2, itemsBean.getTag(), a2);
        com.ss.android.ugc.aweme.tools.beauty.g.n<BeautyComposerInfo> d2 = this.f139064a.d();
        float f2 = a2 / 100.0f;
        String str = composerBeauty.getEffect().getUnzipPath() + ':' + itemsBean.getTag() + ':' + f2;
        String extra = composerBeauty.getEffect().getExtra();
        String str2 = "";
        if (extra == null) {
            extra = str2;
        }
        d2.add(new BeautyComposerInfo(str, extra, composerBeauty.getEffect().getEffectId()));
        if (d.b(composerBeauty)) {
            this.f139064a.g(composerBeauty2);
            this.f139064a.l(composerBeauty2);
        } else {
            this.f139064a.f(composerBeauty2);
            this.f139064a.k(composerBeauty2);
        }
        BeautyCategoryExtra categoryExtra = composerBeauty2.getCategoryExtra();
        if (categoryExtra != null && (!l.a((Object) categoryExtra.getParentId(), (Object) "null")) && (nVar = this.f139064a.e().get(composerBeauty2.getCategoryExtra().getCategoryId())) != null) {
            String str3 = composerBeauty.getEffect().getUnzipPath() + ':' + itemsBean.getTag() + ':' + f2;
            String extra2 = composerBeauty.getEffect().getExtra();
            if (extra2 != null) {
                str2 = extra2;
            }
            nVar.add(new BeautyComposerInfo(str3, str2, composerBeauty.getEffect().getEffectId()));
        }
    }
}
