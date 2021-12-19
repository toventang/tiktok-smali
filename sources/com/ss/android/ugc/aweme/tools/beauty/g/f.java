package com.ss.android.ugc.aweme.tools.beauty.g;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.tools.beauty.b.a.e;
import com.ss.android.ugc.aweme.tools.beauty.b.a.g;
import com.ss.android.ugc.aweme.tools.beauty.g.m;
import com.ss.android.ugc.aweme.tools.beauty.h;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar;
import com.ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView;
import com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl;
import com.ss.android.ugc.tools.utils.r;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<BeautySeekBar, ComposerBeautyExtraBeautify.ItemsBean> f138951a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final m f138952b;

    /* renamed from: c  reason: collision with root package name */
    public final ComposerBeautyViewImpl f138953c;

    static {
        Covode.recordClassIndex(90869);
    }

    private final boolean b() {
        e viewConfig = this.f138953c.getViewConfig();
        if (viewConfig == null || !viewConfig.f138900j) {
            return false;
        }
        return true;
    }

    public static final class a implements BeautySeekBar.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f138954a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BeautySeekBar f138955b;

        static {
            Covode.recordClassIndex(90870);
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.c
        public final void a() {
            T t;
            f.b beautyOnInteractListener;
            T t2;
            f.b beautyOnInteractListener2;
            String tag;
            T t3;
            f.b beautyOnInteractListener3;
            T t4;
            f.b beautyOnInteractListener4;
            String tag2;
            f fVar = this.f138954a;
            BeautySeekBar beautySeekBar = this.f138955b;
            boolean z = fVar.f138953c.r;
            String str = "";
            T t5 = null;
            if (z) {
                if (fVar.a()) {
                    Iterator<T> it = fVar.f138953c.getAlbumAdapter().f138761a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t4 = null;
                            break;
                        }
                        t4 = it.next();
                        if (l.a((Object) t4, (Object) fVar.f138953c.getCurSelectAlbumBeauty())) {
                            break;
                        }
                    }
                    T t6 = t4;
                    if (!(t6 == null || (beautyOnInteractListener4 = fVar.f138953c.getBeautyOnInteractListener()) == null)) {
                        ComposerBeautyExtraBeautify.ItemsBean itemsBean = fVar.f138951a.get(beautySeekBar);
                        if (!(itemsBean == null || (tag2 = itemsBean.getTag()) == null)) {
                            str = tag2;
                        }
                        beautyOnInteractListener4.a(t6, n.a(str));
                    }
                } else {
                    Iterator<T> it2 = fVar.f138953c.getAlbumAdapter().f138761a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t3 = null;
                            break;
                        }
                        t3 = it2.next();
                        if (l.a((Object) t3, (Object) fVar.f138953c.getCurSelectAlbumBeauty())) {
                            break;
                        }
                    }
                    T t7 = t3;
                    if (!(t7 == null || (beautyOnInteractListener3 = fVar.f138953c.getBeautyOnInteractListener()) == null)) {
                        beautyOnInteractListener3.a(t7, f.a((ComposerBeauty) t7));
                    }
                }
            } else if (!z) {
                if (fVar.a()) {
                    Iterator<T> it3 = fVar.f138953c.getCategoryAdapter().f138761a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it3.next();
                        if (l.a((Object) t2, (Object) fVar.f138953c.getCurSelectBeauty())) {
                            break;
                        }
                    }
                    T t8 = t2;
                    if (!(t8 == null || (beautyOnInteractListener2 = fVar.f138953c.getBeautyOnInteractListener()) == null)) {
                        ComposerBeautyExtraBeautify.ItemsBean itemsBean2 = fVar.f138951a.get(beautySeekBar);
                        if (!(itemsBean2 == null || (tag = itemsBean2.getTag()) == null)) {
                            str = tag;
                        }
                        beautyOnInteractListener2.a(t8, n.a(str));
                    }
                } else {
                    Iterator<T> it4 = fVar.f138953c.getCategoryAdapter().f138761a.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it4.next();
                        if (l.a((Object) t, (Object) fVar.f138953c.getCurSelectBeauty())) {
                            break;
                        }
                    }
                    T t9 = t;
                    if (!(t9 == null || (beautyOnInteractListener = fVar.f138953c.getBeautyOnInteractListener()) == null)) {
                        beautyOnInteractListener.a(t9, f.a((ComposerBeauty) t9));
                    }
                }
            }
            f fVar2 = this.f138954a;
            boolean z2 = fVar2.f138953c.r;
            if (z2) {
                Iterator<T> it5 = fVar2.f138953c.getAlbumAdapter().f138761a.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    T next = it5.next();
                    if (l.a((Object) next, (Object) fVar2.f138953c.getCurSelectAlbumBeauty())) {
                        t5 = next;
                        break;
                    }
                }
                T t10 = t5;
                if (t10 != null) {
                    fVar2.a(t10, true, false);
                }
            } else if (!z2) {
                Iterator<T> it6 = fVar2.f138953c.getCategoryAdapter().f138761a.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    T next2 = it6.next();
                    if (l.a((Object) next2, (Object) fVar2.f138953c.getCurSelectBeauty())) {
                        t5 = next2;
                        break;
                    }
                }
                T t11 = t5;
                if (t11 != null) {
                    fVar2.a(t11, true, false);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.c
        public final void b(int i2) {
            T t;
            f.b beautyOnInteractListener;
            T t2;
            f.b beautyOnInteractListener2;
            String str;
            T t3;
            f.b beautyOnInteractListener3;
            T t4;
            f.b beautyOnInteractListener4;
            String str2;
            f fVar = this.f138954a;
            BeautySeekBar beautySeekBar = this.f138955b;
            boolean z = fVar.f138953c.r;
            T t5 = null;
            if (z) {
                if (fVar.a()) {
                    Iterator<T> it = fVar.f138953c.getAlbumAdapter().f138761a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t4 = null;
                            break;
                        }
                        t4 = it.next();
                        if (l.a((Object) t4, (Object) fVar.f138953c.getCurSelectAlbumBeauty())) {
                            break;
                        }
                    }
                    T t6 = t4;
                    if (!(t6 == null || (beautyOnInteractListener4 = fVar.f138953c.getBeautyOnInteractListener()) == null)) {
                        ComposerBeautyExtraBeautify.ItemsBean itemsBean = fVar.f138951a.get(beautySeekBar);
                        if (itemsBean == null || (str2 = itemsBean.getTag()) == null) {
                            str2 = "";
                        }
                        beautyOnInteractListener4.a(t6, i2, n.a(str2));
                    }
                } else {
                    Iterator<T> it2 = fVar.f138953c.getAlbumAdapter().f138761a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t3 = null;
                            break;
                        }
                        t3 = it2.next();
                        if (l.a((Object) t3, (Object) fVar.f138953c.getCurSelectAlbumBeauty())) {
                            break;
                        }
                    }
                    T t7 = t3;
                    if (!(t7 == null || (beautyOnInteractListener3 = fVar.f138953c.getBeautyOnInteractListener()) == null)) {
                        beautyOnInteractListener3.a(t7, i2, f.a((ComposerBeauty) t7));
                    }
                }
            } else if (!z) {
                if (fVar.a()) {
                    Iterator<T> it3 = fVar.f138953c.getCategoryAdapter().f138761a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it3.next();
                        if (l.a((Object) t2, (Object) fVar.f138953c.getCurSelectBeauty())) {
                            break;
                        }
                    }
                    T t8 = t2;
                    if (!(t8 == null || (beautyOnInteractListener2 = fVar.f138953c.getBeautyOnInteractListener()) == null)) {
                        ComposerBeautyExtraBeautify.ItemsBean itemsBean2 = fVar.f138951a.get(beautySeekBar);
                        if (itemsBean2 == null || (str = itemsBean2.getTag()) == null) {
                            str = "";
                        }
                        beautyOnInteractListener2.a(t8, i2, n.a(str));
                    }
                } else {
                    Iterator<T> it4 = fVar.f138953c.getCategoryAdapter().f138761a.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it4.next();
                        if (l.a((Object) t, (Object) fVar.f138953c.getCurSelectBeauty())) {
                            break;
                        }
                    }
                    T t9 = t;
                    if (!(t9 == null || (beautyOnInteractListener = fVar.f138953c.getBeautyOnInteractListener()) == null)) {
                        beautyOnInteractListener.a(t9, i2, f.a((ComposerBeauty) t9));
                    }
                }
            }
            f fVar2 = this.f138954a;
            c cVar = new c(fVar2, this.f138955b, i2);
            boolean z2 = fVar2.f138953c.r;
            if (z2) {
                Iterator<T> it5 = fVar2.f138953c.getAlbumAdapter().f138761a.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    T next = it5.next();
                    if (l.a((Object) next, (Object) fVar2.f138953c.getCurSelectAlbumBeauty())) {
                        t5 = next;
                        break;
                    }
                }
                T t10 = t5;
                if (t10 != null) {
                    cVar.a(t10);
                    fVar2.f138952b.c(t10);
                }
            } else if (!z2) {
                Iterator<T> it6 = fVar2.f138953c.getCategoryAdapter().f138761a.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    T next2 = it6.next();
                    if (l.a((Object) next2, (Object) fVar2.f138953c.getCurSelectBeauty())) {
                        t5 = next2;
                        break;
                    }
                }
                T t11 = t5;
                if (t11 != null) {
                    cVar.a(t11);
                    fVar2.f138952b.c(t11);
                    int indexOf = fVar2.f138953c.getCategoryAdapter().f138761a.indexOf(t11);
                    if (indexOf >= 0 && indexOf < fVar2.f138953c.getCategoryAdapter().f138761a.size()) {
                        fVar2.f138953c.getCategoryAdapter().a(t11);
                    }
                }
            }
            if (fVar2.f138953c.getViewConfig().f138903m) {
                BeautySwitchView swEnableBeauty = fVar2.f138953c.getSwEnableBeauty();
                l.b(swEnableBeauty, "");
                if (!swEnableBeauty.f139189b) {
                    BeautySwitchView swEnableBeauty2 = fVar2.f138953c.getSwEnableBeauty();
                    l.b(swEnableBeauty2, "");
                    swEnableBeauty2.setChecked(true);
                    f.a beautyViewListener = fVar2.f138953c.getBeautyViewListener();
                    if (beautyViewListener != null) {
                        beautyViewListener.a(true);
                    }
                }
            }
            fVar2.f138953c.getResetHelper().a();
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.c
        public final void a(int i2) {
            T t;
            f.b beautyOnInteractListener;
            T t2;
            f.b beautyOnInteractListener2;
            String tag;
            T t3;
            f.b beautyOnInteractListener3;
            T t4;
            f.b beautyOnInteractListener4;
            String tag2;
            BeautySeekBar beautySeekBar = this.f138955b;
            g gVar = this.f138954a.f138953c.getViewConfig().f138860d;
            int percent = beautySeekBar.getPercent();
            if (gVar.f138869a) {
                int suggestPercent = beautySeekBar.getSuggestPercent();
                int i3 = gVar.f138870b;
                int i4 = suggestPercent - i3;
                if (i4 < beautySeekBar.getMinPercent()) {
                    i4 = beautySeekBar.getMaxPercent();
                }
                int i5 = i3 + suggestPercent;
                if (i5 > beautySeekBar.getMaxPercent()) {
                    i5 = beautySeekBar.getMaxPercent();
                }
                if (i4 <= percent && i5 >= percent) {
                    beautySeekBar.setPercent(suggestPercent);
                    percent = suggestPercent;
                }
            }
            f fVar = this.f138954a;
            BeautySeekBar beautySeekBar2 = this.f138955b;
            boolean z = fVar.f138953c.r;
            String str = "";
            T t5 = null;
            if (z) {
                if (fVar.a()) {
                    Iterator<T> it = fVar.f138953c.getAlbumAdapter().f138761a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t4 = null;
                            break;
                        }
                        t4 = it.next();
                        if (l.a((Object) t4, (Object) fVar.f138953c.getCurSelectAlbumBeauty())) {
                            break;
                        }
                    }
                    T t6 = t4;
                    if (!(t6 == null || (beautyOnInteractListener4 = fVar.f138953c.getBeautyOnInteractListener()) == null)) {
                        ComposerBeautyExtraBeautify.ItemsBean itemsBean = fVar.f138951a.get(beautySeekBar2);
                        if (!(itemsBean == null || (tag2 = itemsBean.getTag()) == null)) {
                            str = tag2;
                        }
                        beautyOnInteractListener4.b(t6, n.a(str));
                    }
                } else {
                    Iterator<T> it2 = fVar.f138953c.getAlbumAdapter().f138761a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t3 = null;
                            break;
                        }
                        t3 = it2.next();
                        if (l.a((Object) t3, (Object) fVar.f138953c.getCurSelectAlbumBeauty())) {
                            break;
                        }
                    }
                    T t7 = t3;
                    if (!(t7 == null || (beautyOnInteractListener3 = fVar.f138953c.getBeautyOnInteractListener()) == null)) {
                        beautyOnInteractListener3.b(t7, f.a((ComposerBeauty) t7));
                    }
                }
            } else if (!z) {
                if (fVar.a()) {
                    Iterator<T> it3 = fVar.f138953c.getCategoryAdapter().f138761a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it3.next();
                        if (l.a((Object) t2, (Object) fVar.f138953c.getCurSelectBeauty())) {
                            break;
                        }
                    }
                    T t8 = t2;
                    if (!(t8 == null || (beautyOnInteractListener2 = fVar.f138953c.getBeautyOnInteractListener()) == null)) {
                        ComposerBeautyExtraBeautify.ItemsBean itemsBean2 = fVar.f138951a.get(beautySeekBar2);
                        if (!(itemsBean2 == null || (tag = itemsBean2.getTag()) == null)) {
                            str = tag;
                        }
                        beautyOnInteractListener2.b(t8, n.a(str));
                    }
                } else {
                    Iterator<T> it4 = fVar.f138953c.getCategoryAdapter().f138761a.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it4.next();
                        if (l.a((Object) t, (Object) fVar.f138953c.getCurSelectBeauty())) {
                            break;
                        }
                    }
                    T t9 = t;
                    if (!(t9 == null || (beautyOnInteractListener = fVar.f138953c.getBeautyOnInteractListener()) == null)) {
                        beautyOnInteractListener.b(t9, f.a((ComposerBeauty) t9));
                    }
                }
            }
            f fVar2 = this.f138954a;
            b bVar = new b(fVar2, this.f138955b, percent);
            boolean z2 = fVar2.f138953c.r;
            if (z2) {
                Iterator<T> it5 = fVar2.f138953c.getAlbumAdapter().f138761a.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    T next = it5.next();
                    if (l.a((Object) next, (Object) fVar2.f138953c.getCurSelectAlbumBeauty())) {
                        t5 = next;
                        break;
                    }
                }
                T t10 = t5;
                if (t10 != null) {
                    bVar.a(t10);
                }
            } else if (!z2) {
                Iterator<T> it6 = fVar2.f138953c.getCategoryAdapter().f138761a.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    T next2 = it6.next();
                    if (l.a((Object) next2, (Object) fVar2.f138953c.getCurSelectBeauty())) {
                        t5 = next2;
                        break;
                    }
                }
                T t11 = t5;
                if (t11 != null) {
                    bVar.a(t11);
                }
            }
        }

        a(f fVar, BeautySeekBar beautySeekBar) {
            this.f138954a = fVar;
            this.f138955b = beautySeekBar;
        }
    }

    public final boolean a() {
        ComposerBeauty curSelectBeauty;
        ComposerBeautyExtraBeautify beautifyExtra;
        List<ComposerBeautyExtraBeautify.ItemsBean> items;
        if (this.f138953c.r) {
            curSelectBeauty = this.f138953c.getCurSelectAlbumBeauty();
        } else {
            curSelectBeauty = this.f138953c.getCurSelectBeauty();
        }
        if (curSelectBeauty == null || (beautifyExtra = curSelectBeauty.getBeautifyExtra()) == null || (items = beautifyExtra.getItems()) == null || items.size() != 2 || !b()) {
            return false;
        }
        return true;
    }

    static final class b extends m implements h.f.a.b<ComposerBeauty, z> {
        final /* synthetic */ int $level;
        final /* synthetic */ BeautySeekBar $progressBar;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(90871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, BeautySeekBar beautySeekBar, int i2) {
            super(1);
            this.this$0 = fVar;
            this.$progressBar = beautySeekBar;
            this.$level = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return z.f158842a;
        }

        public final void a(ComposerBeauty composerBeauty) {
            f.a beautyViewListener;
            l.d(composerBeauty, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    float a2 = h.a(new h.a(t.getDoubleDirection(), this.$progressBar.getMaxPercent(), 0, t.getMax(), t.getMin(), 0.0f, this.$level, 332));
                    if (this.this$0.f138952b.g().a(composerBeauty) && com.ss.android.ugc.aweme.tools.beauty.d.f(composerBeauty) && (beautyViewListener = this.this$0.f138953c.getBeautyViewListener()) != null) {
                        beautyViewListener.a(composerBeauty.getEffect().getUnzipPath(), t.getTag(), a2 / 100.0f);
                    }
                }
                composerBeauty.setProgressValue(this.$level);
            }
        }
    }

    static final class c extends m implements h.f.a.b<ComposerBeauty, z> {
        final /* synthetic */ int $level;
        final /* synthetic */ BeautySeekBar $progressBar;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(90872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, BeautySeekBar beautySeekBar, int i2) {
            super(1);
            this.this$0 = fVar;
            this.$progressBar = beautySeekBar;
            this.$level = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return z.f158842a;
        }

        public final void a(ComposerBeauty composerBeauty) {
            ComposerBeautyExtraBeautify.ItemsBean itemsBean;
            String str = "";
            l.d(composerBeauty, str);
            if (!this.this$0.a()) {
                List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                if (!(items == null || items.isEmpty() || items == null)) {
                    for (T t : items) {
                        float a2 = h.a(new h.a(t.getDoubleDirection(), this.$progressBar.getMaxPercent(), 0, t.getMax(), t.getMin(), 0.0f, this.$level, 332));
                        this.this$0.f138952b.b(composerBeauty, t.getTag(), a2);
                        n<BeautyComposerInfo> d2 = this.this$0.f138952b.d();
                        String str2 = composerBeauty.getEffect().getUnzipPath() + ':' + t.getTag() + ':' + (a2 / 100.0f);
                        String extra = composerBeauty.getEffect().getExtra();
                        if (extra == null) {
                            extra = str;
                        }
                        d2.add(new BeautyComposerInfo(str2, extra, composerBeauty.getEffect().getEffectId()));
                        if (com.ss.android.ugc.aweme.tools.beauty.d.b(composerBeauty)) {
                            this.this$0.f138952b.g(composerBeauty);
                        } else {
                            this.this$0.f138952b.f(composerBeauty);
                        }
                    }
                    return;
                }
                return;
            }
            List<ComposerBeautyExtraBeautify.ItemsBean> items2 = composerBeauty.getBeautifyExtra().getItems();
            if (items2 != null && items2.size() >= 2 && (itemsBean = this.this$0.f138951a.get(this.$progressBar)) != null) {
                l.b(itemsBean, str);
                float a3 = h.a(new h.a(itemsBean.getDoubleDirection(), this.$progressBar.getMaxPercent(), 0, itemsBean.getMax(), itemsBean.getMin(), 0.0f, this.$level, 332));
                this.this$0.f138952b.b(composerBeauty, itemsBean.getTag(), a3);
                n<BeautyComposerInfo> d3 = this.this$0.f138952b.d();
                String str3 = composerBeauty.getEffect().getUnzipPath() + ':' + itemsBean.getTag() + ':' + (a3 / 100.0f);
                String extra2 = composerBeauty.getEffect().getExtra();
                if (extra2 != null) {
                    str = extra2;
                }
                d3.add(new BeautyComposerInfo(str3, str, composerBeauty.getEffect().getEffectId()));
                if (com.ss.android.ugc.aweme.tools.beauty.d.b(composerBeauty)) {
                    this.this$0.f138952b.g(composerBeauty);
                } else {
                    this.this$0.f138952b.f(composerBeauty);
                }
            }
        }
    }

    public static final class d implements m.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f138956a;

        static {
            Covode.recordClassIndex(90873);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(f fVar) {
            this.f138956a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.g.m.c
        public final void a(List<BeautyComposerInfo> list) {
            l.d(list, "");
            if (this.f138956a.f138953c.getViewConfig().f138903m) {
                BeautySwitchView swEnableBeauty = this.f138956a.f138953c.getSwEnableBeauty();
                l.b(swEnableBeauty, "");
                if (!swEnableBeauty.f139189b) {
                    return;
                }
            }
            f.a beautyViewListener = this.f138956a.f138953c.getBeautyViewListener();
            if (beautyViewListener != null) {
                beautyViewListener.a(list, 10000);
            }
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.g.m.c
        public final void a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2) {
            l.d(list, "");
            l.d(list2, "");
            if (this.f138956a.f138953c.getViewConfig().f138903m) {
                BeautySwitchView swEnableBeauty = this.f138956a.f138953c.getSwEnableBeauty();
                l.b(swEnableBeauty, "");
                if (!swEnableBeauty.f139189b) {
                    return;
                }
            }
            f.a beautyViewListener = this.f138956a.f138953c.getBeautyViewListener();
            if (beautyViewListener != null) {
                beautyViewListener.a(list, list2, 10000);
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

    public final void a(BeautySeekBar beautySeekBar) {
        l.d(beautySeekBar, "");
        g gVar = this.f138953c.getViewConfig().f138860d;
        Resources resources = this.f138953c.getResources();
        int i2 = gVar.f138871c;
        Context context = this.f138953c.getContext();
        l.b(context, "");
        int b2 = androidx.core.content.a.f.b(resources, i2, context.getTheme());
        Resources resources2 = this.f138953c.getResources();
        int i3 = gVar.f138872d;
        Context context2 = this.f138953c.getContext();
        l.b(context2, "");
        int b3 = androidx.core.content.a.f.b(resources2, i3, context2.getTheme());
        Resources resources3 = this.f138953c.getResources();
        int i4 = gVar.f138873e;
        Context context3 = this.f138953c.getContext();
        l.b(context3, "");
        beautySeekBar.a(b2, b3, androidx.core.content.a.f.b(resources3, i4, context3.getTheme()));
        beautySeekBar.setDefaultCircleConfig(gVar.f138874f);
        beautySeekBar.setSuggestCircleColor(gVar.f138875g);
        Context context4 = beautySeekBar.getContext();
        l.b(context4, "");
        beautySeekBar.setBarHeight(r.a(context4, gVar.f138876h));
        Context context5 = beautySeekBar.getContext();
        l.b(context5, "");
        float f2 = gVar.f138877i;
        Resources resources4 = context5.getResources();
        l.b(resources4, "");
        beautySeekBar.setTextSize(TypedValue.applyDimension(2, f2, resources4.getDisplayMetrics()));
        Context context6 = beautySeekBar.getContext();
        l.b(context6, "");
        beautySeekBar.setBarPadding(r.a(context6, gVar.f138878j));
        beautySeekBar.setOnLevelChangeListener(new a(this, beautySeekBar));
    }

    public f(m mVar, ComposerBeautyViewImpl composerBeautyViewImpl) {
        l.d(mVar, "");
        l.d(composerBeautyViewImpl, "");
        this.f138952b = mVar;
        this.f138953c = composerBeautyViewImpl;
    }

    private static void a(ComposerBeautyExtraBeautify.ItemsBean itemsBean, BeautySeekBar beautySeekBar) {
        h.a b2 = h.b(new h.a(itemsBean.getDoubleDirection(), 100, 0, itemsBean.getMax(), itemsBean.getMin(), (float) itemsBean.getValue(), 0, 396));
        if (itemsBean.getDoubleDirection() || b2.f139011h != 0) {
            beautySeekBar.setNeedShowSuggestCircle(true);
        } else {
            beautySeekBar.setNeedShowSuggestCircle(false);
        }
        beautySeekBar.setSuggestPercent(b2.f139011h);
    }

    public final void a(ComposerBeauty composerBeauty, boolean z, boolean z2) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items;
        ComposerBeautyExtraBeautify.ItemsBean itemsBean;
        l.d(composerBeauty, "");
        if (z) {
            this.f138952b.a(composerBeauty, new d(this));
        }
        if (z2) {
            List<ComposerBeautyExtraBeautify.ItemsBean> items2 = composerBeauty.getBeautifyExtra().getItems();
            if (items2 != null && (!items2.isEmpty())) {
                h.a b2 = h.b(new h.a(items2.get(0).getDoubleDirection(), 100, 0, items2.get(0).getMax(), items2.get(0).getMin(), this.f138952b.a(composerBeauty, items2.get(0).getTag(), (float) items2.get(0).getValue()), 0, 396));
                if (items2.get(0).getDoubleDirection()) {
                    this.f138953c.getPbProgressBar().a(50, -50, false);
                } else {
                    this.f138953c.getPbProgressBar().a(100, 0, true);
                }
                this.f138953c.getPbProgressBar().setPercent(b2.f139011h);
                if (!b() || items2.get(0).getName().length() <= 0) {
                    this.f138953c.getTvFirstPbTitle().setVisibility(8);
                } else {
                    this.f138953c.getTvFirstPbTitle().setVisibility(0);
                    this.f138953c.getTvFirstPbTitle().setText(items2.get(0).getName());
                }
                this.f138953c.getTvSecondPbTitle().setVisibility(8);
                List<ComposerBeautyExtraBeautify.ItemsBean> items3 = composerBeauty.getBeautifyExtra().getItems();
                if (!(items3 == null || (itemsBean = (ComposerBeautyExtraBeautify.ItemsBean) n.g((List) items3)) == null)) {
                    a(itemsBean, this.f138953c.getPbProgressBar());
                }
            }
            if (a() && (items = composerBeauty.getBeautifyExtra().getItems()) != null && items.size() >= 2) {
                h.a b3 = h.b(new h.a(items.get(1).getDoubleDirection(), 100, 0, items.get(1).getMax(), items.get(1).getMin(), this.f138952b.a(composerBeauty, items.get(1).getTag(), (float) items.get(1).getValue()), 0, 396));
                if (items.get(1).getDoubleDirection()) {
                    this.f138953c.getSecondPbProgressBar().a(50, -50, false);
                } else {
                    this.f138953c.getSecondPbProgressBar().a(100, 0, true);
                }
                this.f138953c.getSecondPbProgressBar().setPercent(b3.f139011h);
                if (!b() || items.get(1).getName().length() <= 0) {
                    this.f138953c.getTvSecondPbTitle().setVisibility(8);
                } else {
                    this.f138953c.getTvSecondPbTitle().setVisibility(0);
                    this.f138953c.getTvSecondPbTitle().setText(items.get(1).getName());
                }
                a(items.get(1), this.f138953c.getSecondPbProgressBar());
                this.f138951a.put(this.f138953c.getPbProgressBar(), items.get(0));
                this.f138951a.put(this.f138953c.getSecondPbProgressBar(), items.get(1));
            }
        }
    }
}
