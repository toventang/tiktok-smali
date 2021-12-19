package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.g.m;
import com.ss.android.ugc.aweme.tools.beauty.h;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import h.f.b.z;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.beauty.g.m f139055a;

    /* renamed from: b  reason: collision with root package name */
    public f.a f139056b;

    /* renamed from: c  reason: collision with root package name */
    public f.b f139057c;

    /* renamed from: d  reason: collision with root package name */
    public a f139058d;

    /* renamed from: e  reason: collision with root package name */
    public g f139059e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.beauty.b.a.e f139060f;

    static {
        Covode.recordClassIndex(90942);
    }

    public final void c() {
        this.f139058d.a("cancel");
    }

    public final void b() {
        this.f139058d.a("confirm");
        com.ss.android.ugc.aweme.tools.beauty.b.c.c cVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.c) this.f139059e.a(com.ss.android.ugc.aweme.tools.beauty.b.c.c.class);
        if (cVar != null) {
            cVar.i();
        }
    }

    public final void g() {
        com.ss.android.ugc.aweme.tools.beauty.a.a d2;
        com.ss.android.ugc.aweme.tools.beauty.b.c.c cVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.c) this.f139059e.a(com.ss.android.ugc.aweme.tools.beauty.b.c.c.class);
        if (cVar != null && (d2 = cVar.d()) != null) {
            d2.notifyDataSetChanged();
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ ComposerBeauty $beauty;
        final /* synthetic */ n $doSaveValue$1$inlined;

        static {
            Covode.recordClassIndex(90955);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(ComposerBeauty composerBeauty, n nVar) {
            super(0);
            this.$beauty = composerBeauty;
            this.$doSaveValue$1$inlined = nVar;
        }

        /* renamed from: a */
        public final z invoke() {
            boolean isCollectionType = this.$beauty.isCollectionType();
            if (isCollectionType) {
                List<ComposerBeauty> childList = this.$beauty.getChildList();
                if (childList == null) {
                    return null;
                }
                Iterator<T> it = childList.iterator();
                while (it.hasNext()) {
                    this.$doSaveValue$1$inlined.a(it.next());
                }
                return z.f158842a;
            } else if (!isCollectionType) {
                this.$doSaveValue$1$inlined.a(this.$beauty);
                return z.f158842a;
            } else {
                throw new h.n();
            }
        }
    }

    private final boolean i() {
        z.a aVar = new z.a();
        aVar.element = true;
        a aVar2 = new a(aVar);
        for (T t : this.f139055a.a()) {
            this.f139055a.a((BeautyCategory) t);
            aVar2.a(t.getBeautyList());
        }
        return aVar.element;
    }

    static final class e extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ ComposerBeauty $beauty;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(90947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ComposerBeauty composerBeauty, d dVar) {
            super(0);
            this.$beauty = composerBeauty;
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final h.z invoke() {
            T t;
            boolean isCollectionType = this.$beauty.isCollectionType();
            if (isCollectionType) {
                List<ComposerBeauty> childList = this.$beauty.getChildList();
                if (childList != null) {
                    Iterator<T> it = childList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (t.getSelected()) {
                            break;
                        }
                    }
                    T t2 = t;
                    if (t2 != null) {
                        this.this$0.f139055a.c(t2);
                        return h.z.f158842a;
                    }
                }
                return null;
            } else if (!isCollectionType) {
                this.this$0.f139055a.c(this.$beauty);
                this.this$0.g();
                return h.z.f158842a;
            } else {
                throw new h.n();
            }
        }
    }

    private final boolean h() {
        Iterator<T> it = this.f139055a.a().iterator();
        boolean z = true;
        while (it.hasNext()) {
            for (T t : it.next().getBeautyList()) {
                if (t.isBeautyMode()) {
                    h.f.b.l.d(t, "");
                    List<ComposerBeauty> childList = t.getChildList();
                    if (childList != null) {
                        Iterator<T> it2 = childList.iterator();
                        boolean z2 = true;
                        while (it2.hasNext()) {
                            if (!c(it2.next())) {
                                z2 = false;
                            }
                        }
                        if (z2) {
                        }
                    }
                } else if (c(t)) {
                }
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        C3672d dVar = new C3672d(this);
        for (T t : this.f139055a.a()) {
            this.f139055a.a((BeautyCategory) t);
            List<ComposerBeauty> beautyList = t.getBeautyList();
            ArrayList<ComposerBeauty> arrayList = new ArrayList();
            for (T t2 : beautyList) {
                if (t2.isCollectionType()) {
                    arrayList.add(t2);
                }
            }
            for (ComposerBeauty composerBeauty : arrayList) {
                dVar.a(composerBeauty);
            }
        }
    }

    public final void e() {
        Iterator<T> it = this.f139055a.a().iterator();
        while (it.hasNext()) {
            for (T t : it.next().getBeautyList()) {
                e eVar = new e(t, this);
                if (t.isBeautyMode()) {
                    List<ComposerBeauty> childList = t.getChildList();
                    if (childList != null) {
                        Iterator<T> it2 = childList.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                            eVar.invoke();
                        }
                    }
                } else {
                    eVar.invoke();
                }
            }
        }
    }

    public final boolean f() {
        boolean z;
        boolean z2;
        z.a aVar = new z.a();
        aVar.element = true;
        b bVar = new b(aVar);
        List<BeautyCategory> a2 = this.f139055a.a();
        ArrayList<BeautyCategory> arrayList = new ArrayList();
        for (T t : a2) {
            T t2 = t;
            if (!t2.getBeautyCategoryExtra().getExclusive()) {
                this.f139055a.a((BeautyCategory) t2);
            } else {
                arrayList.add(t);
            }
        }
        for (BeautyCategory beautyCategory : arrayList) {
            this.f139055a.a(beautyCategory);
            bVar.a(beautyCategory.getBeautyList());
        }
        if (!aVar.element || !i()) {
            z = false;
        } else {
            z = true;
        }
        boolean h2 = h();
        com.ss.android.ugc.aweme.tools.beauty.b.c.c cVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.c) this.f139059e.a(com.ss.android.ugc.aweme.tools.beauty.b.c.c.class);
        if (cVar != null) {
            z2 = cVar.h();
        } else {
            z2 = true;
        }
        if (!z || !h2 || !z2) {
            return false;
        }
        return true;
    }

    public final void a() {
        Boolean bool;
        com.ss.android.ugc.aweme.tools.beauty.a.a aVar;
        T t;
        com.ss.android.ugc.aweme.tools.beauty.a.a aVar2;
        com.ss.android.ugc.aweme.tools.beauty.a.a aVar3;
        ComposerBeauty composerBeauty;
        com.ss.android.ugc.aweme.tools.beauty.a.a aVar4;
        ComposerBeauty composerBeauty2;
        com.ss.android.ugc.aweme.tools.beauty.b.c.c cVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.c) this.f139059e.a(com.ss.android.ugc.aweme.tools.beauty.b.c.c.class);
        f fVar = new f(this);
        com.ss.android.ugc.aweme.tools.beauty.a.a aVar5 = null;
        if (cVar != null) {
            bool = Boolean.valueOf(cVar.a());
        } else {
            bool = null;
        }
        if (h.f.b.l.a((Object) bool, (Object) true)) {
            if (cVar != null) {
                aVar4 = cVar.e();
            } else {
                aVar4 = null;
            }
            Iterator<T> it = aVar4.f138761a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (cVar != null) {
                    composerBeauty2 = cVar.c();
                } else {
                    composerBeauty2 = null;
                }
                if (h.f.b.l.a((Object) next, (Object) composerBeauty2)) {
                    aVar5 = next;
                    break;
                }
            }
            ComposerBeauty composerBeauty3 = (ComposerBeauty) aVar5;
            if (composerBeauty3 != null) {
                fVar.a(composerBeauty3);
            }
        } else if (h.f.b.l.a((Object) bool, (Object) false)) {
            if (cVar != null) {
                aVar = cVar.d();
            } else {
                aVar = null;
            }
            Iterator<T> it2 = aVar.f138761a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t = null;
                    break;
                }
                t = it2.next();
                if (cVar != null) {
                    composerBeauty = cVar.b();
                } else {
                    composerBeauty = null;
                }
                if (h.f.b.l.a((Object) t, (Object) composerBeauty)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                fVar.a(t2);
                if (cVar != null) {
                    aVar2 = cVar.d();
                } else {
                    aVar2 = null;
                }
                int indexOf = aVar2.f138761a.indexOf(t2);
                if (indexOf >= 0) {
                    if (cVar != null) {
                        aVar3 = cVar.d();
                    } else {
                        aVar3 = null;
                    }
                    if (indexOf < aVar3.f138761a.size()) {
                        if (cVar != null) {
                            aVar5 = cVar.d();
                        }
                        aVar5.a(t2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements h.f.a.b<List<? extends ComposerBeauty>, h.z> {
        final /* synthetic */ z.a $isSelected;

        static {
            Covode.recordClassIndex(90943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(z.a aVar) {
            super(1);
            this.$isSelected = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(List<? extends ComposerBeauty> list) {
            a(list);
            return h.z.f158842a;
        }

        public final void a(List<ComposerBeauty> list) {
            ComposerBeauty composerBeauty;
            T t;
            h.f.b.l.d(list, "");
            ArrayList<ComposerBeauty> arrayList = new ArrayList();
            for (T t2 : list) {
                T t3 = t2;
                if (t3.isCollectionType() && t3.getEnable()) {
                    arrayList.add(t2);
                }
            }
            for (ComposerBeauty composerBeauty2 : arrayList) {
                List<ComposerBeauty> childList = composerBeauty2.getChildList();
                if (childList != null) {
                    Iterator<T> it = childList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (t.getExtra().getDefault()) {
                            break;
                        }
                    }
                    T t4 = t;
                    if (t4 != null) {
                        if (!t4.getSelected()) {
                            this.$isSelected.element = false;
                        }
                    }
                }
                List<ComposerBeauty> childList2 = composerBeauty2.getChildList();
                if (!(childList2 == null || (composerBeauty = (ComposerBeauty) h.a.n.h((List) childList2)) == null || composerBeauty.getSelected())) {
                    this.$isSelected.element = false;
                }
            }
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<List<? extends ComposerBeauty>, h.z> {
        final /* synthetic */ z.a $isSelected;

        static {
            Covode.recordClassIndex(90944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(z.a aVar) {
            super(1);
            this.$isSelected = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(List<? extends ComposerBeauty> list) {
            a(list);
            return h.z.f158842a;
        }

        public final void a(List<ComposerBeauty> list) {
            T t;
            h.f.b.l.d(list, "");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.getExtra().getDefault()) {
                    break;
                }
            }
            T t2 = t;
            if (t2 == null) {
                ComposerBeauty composerBeauty = (ComposerBeauty) h.a.n.h((List) list);
                if (composerBeauty != null && !composerBeauty.getSelected()) {
                    this.$isSelected.element = false;
                }
            } else if (!t2.getSelected()) {
                this.$isSelected.element = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ z.a $isSingleBeautyDefaultValue;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(90945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, z.a aVar) {
            super(1);
            this.this$0 = dVar;
            this.$isSingleBeautyDefaultValue = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return h.z.f158842a;
        }

        public final void a(ComposerBeauty composerBeauty) {
            h.f.b.l.d(composerBeauty, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    if (h.g.a.a(this.this$0.f139055a.a(composerBeauty, t.getTag(), this.this$0.a(Integer.valueOf(t.getValue())).floatValue()) * 100.0f) != this.this$0.a(Integer.valueOf(t.getValue() * 100)).intValue()) {
                        this.$isSingleBeautyDefaultValue.element = false;
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.d$d  reason: collision with other inner class name */
    static final class C3672d extends h.f.b.m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(90946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3672d(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return h.z.f158842a;
        }

        public final void a(ComposerBeauty composerBeauty) {
            boolean z;
            T t;
            boolean z2;
            h.f.b.l.d(composerBeauty, "");
            List<ComposerBeauty> childList = composerBeauty.getChildList();
            if (childList != null) {
                Iterator<T> it = childList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    T t2 = t;
                    if (t2.getExtra().getDefault() && t2.getEnable()) {
                        break;
                    }
                }
                T t3 = t;
                if (t3 != null) {
                    List<ComposerBeauty> childList2 = composerBeauty.getChildList();
                    if (childList2 != null) {
                        for (T t4 : childList2) {
                            if (!h.f.b.l.a((Object) t3, (Object) t4) || !t4.getEnable()) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            t4.setSelected(z2);
                        }
                    }
                    if (t3.getSelected()) {
                        this.this$0.f139055a.g(t3);
                        this.this$0.f139055a.l(t3);
                        this.this$0.f139055a.c(t3);
                        this.this$0.a((ComposerBeauty) t3);
                    }
                    this.this$0.a(t3, null);
                    return;
                }
            }
            List<ComposerBeauty> childList3 = composerBeauty.getChildList();
            if (!(childList3 == null || childList3.isEmpty())) {
                ComposerBeauty composerBeauty2 = childList3.get(0);
                List<ComposerBeauty> childList4 = composerBeauty.getChildList();
                if (childList4 != null) {
                    for (T t5 : childList4) {
                        if (!h.f.b.l.a((Object) composerBeauty2, (Object) t5) || !t5.getEnable()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        t5.setSelected(z);
                    }
                }
                if (composerBeauty2.getSelected()) {
                    this.this$0.f139055a.g(composerBeauty2);
                    this.this$0.f139055a.l(composerBeauty2);
                    this.this$0.f139055a.c(composerBeauty2);
                    this.this$0.a(composerBeauty2);
                }
                this.this$0.a(composerBeauty2, null);
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(90948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return h.z.f158842a;
        }

        public final void a(ComposerBeauty composerBeauty) {
            h.f.b.l.d(composerBeauty, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    h.a b2 = com.ss.android.ugc.aweme.tools.beauty.h.b(new h.a(t.getDoubleDirection(), 100, 0, t.getMax(), t.getMin(), (float) t.getValue(), 0, 396));
                    com.ss.android.ugc.aweme.tools.beauty.b.c.e eVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.e) this.this$0.f139059e.a(com.ss.android.ugc.aweme.tools.beauty.b.c.e.class);
                    int intValue = this.this$0.a(Integer.valueOf(b2.f139011h)).intValue();
                    if (eVar != null) {
                        eVar.a(intValue);
                    }
                    composerBeauty.setProgressValue(intValue);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(90956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            a(composerBeauty);
            return h.z.f158842a;
        }

        public final void a(ComposerBeauty composerBeauty) {
            h.f.b.l.d(composerBeauty, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (!(items == null || items.isEmpty() || items == null)) {
                for (T t : items) {
                    this.this$0.f139055a.b(composerBeauty, t.getTag(), this.this$0.a(Integer.valueOf(t.getValue())).floatValue());
                }
            }
        }
    }

    public static final class o implements m.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f139063a;

        static {
            Covode.recordClassIndex(90957);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(d dVar) {
            this.f139063a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.g.m.c
        public final void a(List<BeautyComposerInfo> list) {
            h.f.b.l.d(list, "");
            f.a aVar = this.f139063a.f139056b;
            if (aVar != null) {
                aVar.a(list, 10000);
            }
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.g.m.c
        public final void a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2) {
            h.f.b.l.d(list, "");
            h.f.b.l.d(list2, "");
            f.a aVar = this.f139063a.f139056b;
            if (aVar != null) {
                aVar.a(list, list2, 10000);
            }
        }
    }

    public final void b(ComposerBeauty composerBeauty) {
        h.f.b.l.d(composerBeauty, "");
        this.f139055a.a(composerBeauty, new o(this));
    }

    static final class h extends h.f.b.m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(90950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            h.f.b.l.d(composerBeauty2, "");
            this.this$0.a(composerBeauty2, Float.valueOf(0.0f));
            return h.z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(90951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            h.f.b.l.d(composerBeauty2, "");
            this.this$0.f139055a.c(composerBeauty2);
            return h.z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ Map.Entry $entry;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(90953);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(Map.Entry entry, d dVar) {
            super(1);
            this.$entry = entry;
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            h.f.b.l.d(composerBeauty2, "");
            this.this$0.a(composerBeauty2, (Float) this.$entry.getValue());
            return h.z.f158842a;
        }
    }

    public final Number a(Number number) {
        com.ss.android.ugc.aweme.tools.beauty.b.a.f fVar;
        com.ss.android.ugc.aweme.tools.beauty.b.a.e eVar = this.f139060f;
        if (eVar == null || (fVar = eVar.f138862f) == null || !fVar.f138867d) {
            return number;
        }
        return 0;
    }

    static final class g extends h.f.b.m implements h.f.a.b<ComposerBeauty, h.z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(90949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty) {
            ComposerBeauty composerBeauty2 = composerBeauty;
            h.f.b.l.d(composerBeauty2, "");
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty2.getBeautifyExtra().getItems();
            if (items != null) {
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    this.this$0.f139055a.b(composerBeauty2, it.next().getTag(), 0.0f);
                }
            }
            return h.z.f158842a;
        }
    }

    private final boolean c(ComposerBeauty composerBeauty) {
        z.a aVar = new z.a();
        aVar.element = true;
        c cVar = new c(this, aVar);
        boolean isCollectionType = composerBeauty.isCollectionType();
        if (isCollectionType) {
            List<ComposerBeauty> childList = composerBeauty.getChildList();
            if (childList != null) {
                Iterator<T> it = childList.iterator();
                while (it.hasNext()) {
                    cVar.a(it.next());
                }
            }
        } else if (!isCollectionType) {
            cVar.a(composerBeauty);
        }
        return aVar.element;
    }

    public final void a(ComposerBeauty composerBeauty) {
        h.f.b.l.d(composerBeauty, "");
        com.ss.android.ugc.aweme.tools.beauty.b.c.c cVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.c) this.f139059e.a(com.ss.android.ugc.aweme.tools.beauty.b.c.c.class);
        if (cVar != null) {
            cVar.b(composerBeauty);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<ComposerBeauty, h.f.a.b<? super ComposerBeauty, ? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f139061a = new j();

        static {
            Covode.recordClassIndex(90952);
        }

        j() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty, h.f.a.b<? super ComposerBeauty, ? extends h.z> bVar) {
            a(composerBeauty, bVar);
            return h.z.f158842a;
        }

        public static void a(ComposerBeauty composerBeauty, h.f.a.b<? super ComposerBeauty, h.z> bVar) {
            h.f.b.l.d(composerBeauty, "");
            h.f.b.l.d(bVar, "");
            if (composerBeauty.isCollectionType()) {
                List<ComposerBeauty> childList = composerBeauty.getChildList();
                if (childList != null) {
                    Iterator<T> it = childList.iterator();
                    while (it.hasNext()) {
                        bVar.invoke(it.next());
                    }
                    return;
                }
                return;
            }
            bVar.invoke(composerBeauty);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<ComposerBeauty, h.f.a.b<? super ComposerBeauty, ? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f139062a = new l();

        static {
            Covode.recordClassIndex(90954);
        }

        l() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(ComposerBeauty composerBeauty, h.f.a.b<? super ComposerBeauty, ? extends h.z> bVar) {
            a(composerBeauty, bVar);
            return h.z.f158842a;
        }

        public static void a(ComposerBeauty composerBeauty, h.f.a.b<? super ComposerBeauty, h.z> bVar) {
            h.f.b.l.d(composerBeauty, "");
            h.f.b.l.d(bVar, "");
            if (composerBeauty.isCollectionType()) {
                List<ComposerBeauty> childList = composerBeauty.getChildList();
                if (childList != null) {
                    for (T t : childList) {
                        if (t.getSelected()) {
                            if (t != null) {
                                bVar.invoke(t);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            bVar.invoke(composerBeauty);
        }
    }

    public final void a(ComposerBeauty composerBeauty, Float f2) {
        float floatValue;
        h.f.b.l.d(composerBeauty, "");
        b(composerBeauty);
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (!(items == null || items.isEmpty() || items == null)) {
            for (T t : items) {
                if (this.f139055a.g().a(composerBeauty) && com.ss.android.ugc.aweme.tools.beauty.d.f(composerBeauty)) {
                    if (f2 != null) {
                        floatValue = f2.floatValue();
                    } else {
                        floatValue = a(Integer.valueOf(t.getValue())).floatValue();
                    }
                    f.a aVar = this.f139056b;
                    if (aVar != null) {
                        aVar.a(composerBeauty.getEffect().getUnzipPath(), t.getTag(), floatValue / 100.0f);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(d dVar, ComposerBeauty composerBeauty, List list) {
        String str;
        com.ss.android.ugc.aweme.tools.beauty.a.a d2;
        ComposerBeauty b2;
        h.f.b.l.d(composerBeauty, "");
        h.f.b.l.d(list, "");
        com.ss.android.ugc.aweme.tools.beauty.b.c.c cVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.c) dVar.f139059e.a(com.ss.android.ugc.aweme.tools.beauty.b.c.c.class);
        com.ss.android.ugc.aweme.tools.beauty.b.c.e eVar = (com.ss.android.ugc.aweme.tools.beauty.b.c.e) dVar.f139059e.a(com.ss.android.ugc.aweme.tools.beauty.b.c.e.class);
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            ComposerBeauty composerBeauty2 = (ComposerBeauty) it.next();
            if (!h.f.b.l.a(composerBeauty, composerBeauty2) || !composerBeauty.getEnable()) {
                z = false;
            }
            composerBeauty2.setSelected(z);
        }
        String categoryId = composerBeauty.getCategoryId();
        if (cVar == null || (b2 = cVar.b()) == null) {
            str = null;
        } else {
            str = b2.getCategoryId();
        }
        if (h.f.b.l.a((Object) categoryId, (Object) str)) {
            if (composerBeauty.getExtra().isNone() || !composerBeauty.getEnable()) {
                if (eVar != null) {
                    eVar.a(false);
                }
            } else if (eVar != null) {
                eVar.a(true);
            }
            if (cVar != null) {
                cVar.a(composerBeauty);
            }
        }
        if (composerBeauty.getSelected()) {
            dVar.f139055a.f(composerBeauty);
            dVar.f139055a.k(composerBeauty);
            dVar.f139055a.c(composerBeauty);
            if (cVar != null && (d2 = cVar.d()) != null) {
                d2.notifyDataSetChanged();
            }
        }
    }

    public d(com.ss.android.ugc.aweme.tools.beauty.g.m mVar, f.a aVar, f.b bVar, a aVar2, g gVar, com.ss.android.ugc.aweme.tools.beauty.b.a.e eVar) {
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(aVar2, "");
        h.f.b.l.d(gVar, "");
        this.f139055a = mVar;
        this.f139056b = aVar;
        this.f139057c = bVar;
        this.f139058d = aVar2;
        this.f139059e = gVar;
        this.f139060f = eVar;
    }
}
