package com.ss.android.ugc.aweme.tools.beauty.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.e.b.a;
import com.ss.android.ugc.aweme.tools.beauty.g.m;
import com.ss.android.ugc.aweme.tools.beauty.h;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import com.ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView;
import com.ss.android.ugc.aweme.tools.beauty.views.ComposerBeautyViewImpl;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final m f138946a;

    /* renamed from: b  reason: collision with root package name */
    public final ComposerBeautyViewImpl f138947b;

    static {
        Covode.recordClassIndex(90860);
    }

    public static final class f implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f138948a;

        static {
            Covode.recordClassIndex(90866);
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.e.b.a.b
        public final void a() {
            this.f138948a.f138947b.getBeautyOnInteractListener();
            com.ss.android.ugc.aweme.tools.beauty.service.b beautyBuried = this.f138948a.f138947b.getBeautyBuried();
            if (beautyBuried != null) {
                beautyBuried.a("confirm");
            }
            this.f138948a.b();
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.e.b.a.b
        public final void b() {
            this.f138948a.f138947b.getBeautyOnInteractListener();
            com.ss.android.ugc.aweme.tools.beauty.service.b beautyBuried = this.f138948a.f138947b.getBeautyBuried();
            if (beautyBuried != null) {
                beautyBuried.a("cancel");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public f(e eVar) {
            this.f138948a = eVar;
        }
    }

    public static final class g implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f138949a;

        static {
            Covode.recordClassIndex(90867);
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.e.b.a.b
        public final void a() {
            this.f138949a.f138947b.getBeautyOnInteractListener();
            com.ss.android.ugc.aweme.tools.beauty.service.b beautyBuried = this.f138949a.f138947b.getBeautyBuried();
            if (beautyBuried != null) {
                beautyBuried.a("confirm");
            }
            this.f138949a.b();
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.e.b.a.b
        public final void b() {
            this.f138949a.f138947b.getBeautyOnInteractListener();
            com.ss.android.ugc.aweme.tools.beauty.service.b beautyBuried = this.f138949a.f138947b.getBeautyBuried();
            if (beautyBuried != null) {
                beautyBuried.a("cancel");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public g(e eVar) {
            this.f138949a = eVar;
        }
    }

    private final void d() {
        T t;
        Iterator<T> it = this.f138946a.a().iterator();
        while (it.hasNext()) {
            for (T t2 : it.next().getBeautyList()) {
                boolean isCollectionType = t2.isCollectionType();
                if (isCollectionType) {
                    List<ComposerBeauty> childList = t2.getChildList();
                    if (childList != null) {
                        Iterator<T> it2 = childList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            if (t.getSelected()) {
                                break;
                            }
                        }
                        T t3 = t;
                        if (t3 != null) {
                            this.f138946a.c(t3);
                        }
                    }
                } else if (!isCollectionType) {
                    this.f138946a.c(t2);
                    this.f138947b.getCategoryAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    private final void c() {
        c cVar = new c(this);
        boolean z = this.f138947b.r;
        T t = null;
        if (z) {
            Iterator<T> it = this.f138947b.getAlbumAdapter().f138761a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (l.a((Object) next, (Object) this.f138947b.getCurSelectAlbumBeauty())) {
                    t = next;
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                cVar.a(t2);
            }
        } else if (!z) {
            Iterator<T> it2 = this.f138947b.getCategoryAdapter().f138761a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next2 = it2.next();
                if (l.a((Object) next2, (Object) this.f138947b.getCurSelectBeauty())) {
                    t = next2;
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                cVar.a(t3);
                int indexOf = this.f138947b.getCategoryAdapter().f138761a.indexOf(t3);
                if (indexOf >= 0 && indexOf < this.f138947b.getCategoryAdapter().f138761a.size()) {
                    this.f138947b.getCategoryAdapter().a(t3);
                }
            }
        }
    }

    public final void a() {
        T t;
        z.a aVar = new z.a();
        aVar.element = true;
        List<BeautyCategory> a2 = this.f138946a.a();
        ArrayList arrayList = new ArrayList();
        for (T t2 : a2) {
            if (t2.getBeautyCategoryExtra().getExclusive()) {
                arrayList.add(t2);
            }
        }
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (true) {
            T t3 = null;
            if (!it.hasNext()) {
                break;
            }
            BeautyCategory beautyCategory = (BeautyCategory) it.next();
            Iterator<T> it2 = beautyCategory.getBeautyList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next = it2.next();
                if (next.getExtra().getDefault()) {
                    t3 = next;
                    break;
                }
            }
            T t4 = t3;
            if (t4 != null) {
                if (t4.getSelected()) {
                }
            } else if (beautyCategory.getBeautyList().get(0).getSelected()) {
            }
            z = false;
        }
        Iterator<T> it3 = this.f138946a.a().iterator();
        while (it3.hasNext()) {
            List<ComposerBeauty> beautyList = it3.next().getBeautyList();
            ArrayList<ComposerBeauty> arrayList2 = new ArrayList();
            for (T t5 : beautyList) {
                if (t5.isCollectionType()) {
                    arrayList2.add(t5);
                }
            }
            for (ComposerBeauty composerBeauty : arrayList2) {
                List<ComposerBeauty> childList = composerBeauty.getChildList();
                if (childList != null) {
                    Iterator<T> it4 = childList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it4.next();
                        if (t.getExtra().getDefault()) {
                            break;
                        }
                    }
                    T t6 = t;
                    if (t6 != null) {
                        if (t6.getSelected()) {
                        }
                        z = false;
                    }
                }
                List<ComposerBeauty> childList2 = composerBeauty.getChildList();
                if (childList2 != null) {
                    ComposerBeauty composerBeauty2 = childList2.get(0);
                    if (composerBeauty2 != null) {
                        if (composerBeauty2.getSelected()) {
                        }
                        z = false;
                    }
                }
            }
        }
        a aVar2 = new a(this, aVar);
        Iterator<T> it5 = this.f138946a.a().iterator();
        while (it5.hasNext()) {
            for (T t7 : it5.next().getBeautyList()) {
                boolean isCollectionType = t7.isCollectionType();
                if (isCollectionType) {
                    List<ComposerBeauty> childList3 = t7.getChildList();
                    if (childList3 != null) {
                        Iterator<T> it6 = childList3.iterator();
                        while (it6.hasNext()) {
                            aVar2.a(it6.next());
                        }
                    }
                } else if (!isCollectionType) {
                    aVar2.a(t7);
                }
            }
        }
        if (!z || !aVar.element) {
            this.f138947b.getRlClearContainer().setAlpha(1.0f);
            this.f138947b.getRlClearContainer().setClickable(true);
            return;
        }
        this.f138947b.getRlClearContainer().setAlpha(0.5f);
        this.f138947b.getRlClearContainer().setClickable(false);
    }

    public final void b() {
        boolean z;
        T t;
        boolean z2;
        T t2;
        T t3;
        d dVar = new d(this);
        Iterator<T> it = this.f138946a.a().iterator();
        while (it.hasNext()) {
            for (T t4 : it.next().getBeautyList()) {
                boolean isCollectionType = t4.isCollectionType();
                if (isCollectionType) {
                    List<ComposerBeauty> childList = t4.getChildList();
                    if (childList != null) {
                        Iterator<T> it2 = childList.iterator();
                        while (it2.hasNext()) {
                            dVar.a(it2.next());
                        }
                    }
                } else if (!isCollectionType) {
                    dVar.a(t4);
                }
            }
        }
        n<BeautyComposerInfo> nVar = new n();
        for (BeautyComposerInfo beautyComposerInfo : this.f138946a.d()) {
            nVar.add(beautyComposerInfo);
        }
        b bVar = new b(this);
        for (BeautyComposerInfo beautyComposerInfo2 : nVar) {
            String str = beautyComposerInfo2.f79586c;
            Iterator<T> it3 = this.f138946a.a().iterator();
            while (it3.hasNext()) {
                Iterator<T> it4 = it3.next().getBeautyList().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        t3 = null;
                        break;
                    }
                    t3 = it4.next();
                    if (l.a((Object) t3.getEffect().getEffectId(), (Object) str)) {
                        break;
                    }
                }
                T t5 = t3;
                if (t5 != null) {
                    bVar.a(t5);
                }
            }
        }
        List<BeautyCategory> a2 = this.f138946a.a();
        ArrayList<BeautyCategory> arrayList = new ArrayList();
        for (T t6 : a2) {
            if (t6.getBeautyCategoryExtra().getExclusive()) {
                arrayList.add(t6);
            }
        }
        for (BeautyCategory beautyCategory : arrayList) {
            Iterator<T> it5 = beautyCategory.getBeautyList().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it5.next();
                T t7 = t2;
                if (t7.getExtra().getDefault() && t7.getEnable()) {
                    break;
                }
            }
            T t8 = t2;
            if (t8 != null) {
                a(t8, beautyCategory.getBeautyList());
                a(t8);
            } else {
                List<ComposerBeauty> beautyList = beautyCategory.getBeautyList();
                if (!(beautyList == null || beautyList.isEmpty() || beautyList == null)) {
                    a(beautyList.get(0), beautyCategory.getBeautyList());
                    a(beautyList.get(0));
                }
            }
        }
        Iterator<T> it6 = this.f138946a.a().iterator();
        while (it6.hasNext()) {
            List<ComposerBeauty> beautyList2 = it6.next().getBeautyList();
            ArrayList<ComposerBeauty> arrayList2 = new ArrayList();
            for (T t9 : beautyList2) {
                if (t9.isCollectionType()) {
                    arrayList2.add(t9);
                }
            }
            for (ComposerBeauty composerBeauty : arrayList2) {
                List<ComposerBeauty> childList2 = composerBeauty.getChildList();
                if (childList2 != null) {
                    Iterator<T> it7 = childList2.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it7.next();
                        T t10 = t;
                        if (t10.getExtra().getDefault() && t10.getEnable()) {
                            break;
                        }
                    }
                    T t11 = t;
                    if (t11 != null) {
                        List<ComposerBeauty> childList3 = composerBeauty.getChildList();
                        if (childList3 != null) {
                            for (T t12 : childList3) {
                                if (!l.a((Object) t11, (Object) t12) || !t12.getEnable()) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                t12.setSelected(z2);
                            }
                        }
                        if (t11.getSelected()) {
                            this.f138946a.g(t11);
                            this.f138946a.c(t11);
                            this.f138947b.setCurSelectAlbumBeauty(t11);
                        }
                        bVar.a(t11);
                    }
                }
                List<ComposerBeauty> childList4 = composerBeauty.getChildList();
                if (childList4 != null && !childList4.isEmpty()) {
                    ComposerBeauty composerBeauty2 = childList4.get(0);
                    List<ComposerBeauty> childList5 = composerBeauty.getChildList();
                    if (childList5 != null) {
                        for (T t13 : childList5) {
                            if (!l.a((Object) composerBeauty2, (Object) t13) || !t13.getEnable()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            t13.setSelected(z);
                        }
                    }
                    if (composerBeauty2.getSelected()) {
                        this.f138946a.g(composerBeauty2);
                        this.f138946a.c(composerBeauty2);
                        this.f138947b.setCurSelectAlbumBeauty(composerBeauty2);
                    }
                    bVar.a(composerBeauty2);
                }
            }
        }
        c();
        d();
        a();
        ComposerBeautyViewImpl composerBeautyViewImpl = this.f138947b;
        if (composerBeautyViewImpl.A.f138903m) {
            BeautySwitchView beautySwitchView = composerBeautyViewImpl.f139211m;
            l.b(beautySwitchView, "");
            if (!beautySwitchView.f139189b) {
                BeautySwitchView beautySwitchView2 = composerBeautyViewImpl.f139211m;
                l.b(beautySwitchView2, "");
                beautySwitchView2.setChecked(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ z.a $isDefaultValue;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, z.a aVar) {
            super(1);
            this.this$0 = eVar;
            this.$isDefaultValue = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return h.z.f158842a;
        }

        public final void a(ComposerBeauty composerBeauty) {
            l.d(composerBeauty, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    if (h.g.a.a(this.this$0.f138946a.a(composerBeauty, t.getTag(), (float) t.getValue()) * 100.0f) != t.getValue() * 100) {
                        this.$isDefaultValue.element = false;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return h.z.f158842a;
        }

        public final void a(ComposerBeauty composerBeauty) {
            f.a beautyViewListener;
            l.d(composerBeauty, "");
            this.this$0.a(composerBeauty);
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    if (this.this$0.f138946a.g().a(composerBeauty) && com.ss.android.ugc.aweme.tools.beauty.d.f(composerBeauty) && (beautyViewListener = this.this$0.f138947b.getBeautyViewListener()) != null) {
                        beautyViewListener.a(composerBeauty.getEffect().getUnzipPath(), t.getTag(), ((float) t.getValue()) / 100.0f);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90863);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return h.z.f158842a;
        }

        public final void a(ComposerBeauty composerBeauty) {
            l.d(composerBeauty, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    h.a b2 = com.ss.android.ugc.aweme.tools.beauty.h.b(new h.a(t.getDoubleDirection(), 100, 0, t.getMax(), t.getMin(), (float) t.getValue(), 0, 396));
                    this.this$0.f138947b.getPbProgressBar().setPercent(b2.f139011h);
                    composerBeauty.setProgressValue(b2.f139011h);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return h.z.f158842a;
        }

        public final void a(ComposerBeauty composerBeauty) {
            l.d(composerBeauty, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    this.this$0.f138946a.b(composerBeauty, t.getTag(), (float) t.getValue());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.e$e  reason: collision with other inner class name */
    public static final class C3668e extends m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3668e(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return h.z.f158842a;
        }

        public final void a(ComposerBeauty composerBeauty) {
            f.a beautyViewListener;
            l.d(composerBeauty, "");
            this.this$0.a(composerBeauty);
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    h.a b2 = com.ss.android.ugc.aweme.tools.beauty.h.b(new h.a(t.getDoubleDirection(), 100, 0, t.getMax(), t.getMin(), (float) t.getValue(), 0, 396));
                    this.this$0.f138947b.getPbProgressBar().setPercent(b2.f139011h);
                    this.this$0.f138946a.b(composerBeauty, t.getTag(), (float) t.getValue());
                    if (this.this$0.f138946a.g().a(composerBeauty) && com.ss.android.ugc.aweme.tools.beauty.d.f(composerBeauty) && (beautyViewListener = this.this$0.f138947b.getBeautyViewListener()) != null) {
                        beautyViewListener.a(composerBeauty.getEffect().getUnzipPath(), t.getTag(), ((float) t.getValue()) / 100.0f);
                    }
                    composerBeauty.setProgressValue(b2.f139011h);
                }
            }
        }
    }

    public static final class h implements m.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f138950a;

        static {
            Covode.recordClassIndex(90868);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(e eVar) {
            this.f138950a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.g.m.c
        public final void a(List<BeautyComposerInfo> list) {
            l.d(list, "");
            f.a beautyViewListener = this.f138950a.f138947b.getBeautyViewListener();
            if (beautyViewListener != null) {
                beautyViewListener.a(list, 10000);
            }
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.g.m.c
        public final void a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2) {
            l.d(list, "");
            l.d(list2, "");
            f.a beautyViewListener = this.f138950a.f138947b.getBeautyViewListener();
            if (beautyViewListener != null) {
                beautyViewListener.a(list, list2, 10000);
            }
        }
    }

    public final void a(ComposerBeauty composerBeauty) {
        this.f138946a.a(composerBeauty, new h(this));
    }

    public final void a(boolean z) {
        T t;
        Iterator<T> it = this.f138946a.a().iterator();
        while (it.hasNext()) {
            for (T t2 : it.next().getBeautyList()) {
                boolean isCollectionType = t2.isCollectionType();
                if (isCollectionType) {
                    List<ComposerBeauty> childList = t2.getChildList();
                    if (childList != null) {
                        Iterator<T> it2 = childList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            if (t.getSelected()) {
                                break;
                            }
                        }
                        T t3 = t;
                        if (t3 != null) {
                            this.f138946a.a((ComposerBeauty) t3, z);
                        }
                    }
                } else if (!isCollectionType) {
                    this.f138946a.a((ComposerBeauty) t2, z);
                    this.f138947b.getCategoryAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    public e(m mVar, ComposerBeautyViewImpl composerBeautyViewImpl) {
        l.d(mVar, "");
        l.d(composerBeautyViewImpl, "");
        this.f138946a = mVar;
        this.f138947b = composerBeautyViewImpl;
    }

    private final void a(ComposerBeauty composerBeauty, List<ComposerBeauty> list) {
        String str;
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (!l.a((Object) composerBeauty, (Object) next) || !composerBeauty.getEnable()) {
                z = false;
            }
            next.setSelected(z);
        }
        String categoryId = composerBeauty.getCategoryId();
        ComposerBeauty curSelectBeauty = this.f138947b.getCurSelectBeauty();
        if (curSelectBeauty != null) {
            str = curSelectBeauty.getCategoryId();
        } else {
            str = null;
        }
        if (l.a((Object) categoryId, (Object) str)) {
            if (composerBeauty.getExtra().isNone() || !composerBeauty.getEnable()) {
                this.f138947b.b(false);
            } else {
                this.f138947b.b(true);
            }
            this.f138947b.setCurSelectBeauty(composerBeauty);
        }
        if (composerBeauty.getSelected()) {
            this.f138946a.f(composerBeauty);
            this.f138946a.c(composerBeauty);
            this.f138947b.getCategoryAdapter().notifyDataSetChanged();
        }
    }
}
