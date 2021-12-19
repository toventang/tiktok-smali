package com.ss.android.ugc.aweme.sticker.types.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.panel.k;
import com.ss.android.ugc.aweme.sticker.panel.l;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.ComposerHelper;
import com.ss.android.ugc.effectmanager.effect.model.ComposerNode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.n;
import h.f.b.a.e;
import h.f.b.f;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public final class a extends com.ss.android.ugc.aweme.sticker.presenter.handler.b implements l {

    /* renamed from: a  reason: collision with root package name */
    public final List<ComposerNode> f136027a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<ComposerNode> f136028b;

    /* renamed from: c  reason: collision with root package name */
    public final t<List<ComposerNode>> f136029c;

    /* renamed from: d  reason: collision with root package name */
    public h<? extends b> f136030d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.appcompat.app.d f136031e;

    /* renamed from: f  reason: collision with root package name */
    public final o f136032f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.asve.recorder.effect.composer.b f136033g;

    /* renamed from: h  reason: collision with root package name */
    public final k f136034h;

    /* renamed from: i  reason: collision with root package name */
    private Effect f136035i;

    /* renamed from: j  reason: collision with root package name */
    private final h.f.a.a<String> f136036j;

    static {
        Covode.recordClassIndex(88863);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(l.a aVar) {
        h.f.b.l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void b(l.a aVar) {
        h.f.b.l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void cw_() {
    }

    public static final class c implements e, List<ComposerNode> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f136039a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ List<ComposerNode> f136040b;

        static {
            Covode.recordClassIndex(88867);
        }

        @Override // java.util.List
        public final boolean addAll(int i2, Collection<? extends ComposerNode> collection) {
            h.f.b.l.d(collection, "");
            return this.f136040b.addAll(i2, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends ComposerNode> collection) {
            h.f.b.l.d(collection, "");
            return this.f136040b.addAll(collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            h.f.b.l.d(collection, "");
            return this.f136040b.containsAll(collection);
        }

        public final boolean isEmpty() {
            return this.f136040b.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<ComposerNode> iterator() {
            return this.f136040b.iterator();
        }

        @Override // java.util.List
        public final ListIterator<ComposerNode> listIterator() {
            return this.f136040b.listIterator();
        }

        @Override // java.util.List
        public final ListIterator<ComposerNode> listIterator(int i2) {
            return this.f136040b.listIterator(i2);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            h.f.b.l.d(collection, "");
            return this.f136040b.removeAll(collection);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            h.f.b.l.d(collection, "");
            return this.f136040b.retainAll(collection);
        }

        @Override // java.util.List
        public final List<ComposerNode> subList(int i2, int i3) {
            return this.f136040b.subList(i2, i3);
        }

        public final Object[] toArray() {
            return f.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) f.a(this, tArr);
        }

        public final /* bridge */ int size() {
            return this.f136040b.size();
        }

        public final void clear() {
            this.f136039a.f136027a.clear();
            this.f136039a.f136029c.setValue(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f136039a = aVar;
            this.f136040b = aVar.f136027a;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.List
        public final /* synthetic */ ComposerNode get(int i2) {
            ComposerNode composerNode = this.f136040b.get(i2);
            h.f.b.l.b(composerNode, "");
            return composerNode;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.List
        public final /* synthetic */ ComposerNode remove(int i2) {
            ComposerNode remove = this.f136040b.remove(i2);
            h.f.b.l.b(remove, "");
            return remove;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.util.List, java.util.Collection
        public final /* synthetic */ boolean add(ComposerNode composerNode) {
            h.f.b.l.d(composerNode, "");
            boolean add = this.f136039a.f136027a.add(composerNode);
            this.f136039a.f136029c.setValue(this);
            return add;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return false;
            }
            h.f.b.l.d(obj, "");
            return this.f136040b.contains(obj);
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return -1;
            }
            h.f.b.l.d(obj, "");
            return this.f136040b.indexOf(obj);
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return -1;
            }
            h.f.b.l.d(obj, "");
            return this.f136040b.lastIndexOf(obj);
        }

        @Override // java.util.List
        public final boolean remove(Object obj) {
            if (!(obj instanceof ComposerNode)) {
                return false;
            }
            h.f.b.l.d(obj, "");
            boolean remove = this.f136039a.f136027a.remove(obj);
            this.f136039a.f136029c.setValue(this);
            return remove;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
        @Override // java.util.List
        public final /* synthetic */ void add(int i2, ComposerNode composerNode) {
            h.f.b.l.d(composerNode, "");
            this.f136040b.add(i2, composerNode);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
        @Override // java.util.List
        public final /* synthetic */ ComposerNode set(int i2, ComposerNode composerNode) {
            h.f.b.l.d(composerNode, "");
            ComposerNode composerNode2 = this.f136040b.set(i2, composerNode);
            h.f.b.l.b(composerNode2, "");
            return composerNode2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        h<? extends b> hVar;
        b bVar;
        h<? extends b> hVar2 = this.f136030d;
        if (!(hVar2 == null || !hVar2.isInitialized() || (hVar = this.f136030d) == null || (bVar = (b) hVar.getValue()) == null)) {
            bVar.c();
        }
        this.f136028b.clear();
    }

    static final class b extends m implements h.f.a.a<c> {
        final /* synthetic */ View $stickerView;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(88865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, View view) {
            super(0);
            this.this$0 = aVar;
            this.$stickerView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            androidx.appcompat.app.d dVar = this.this$0.f136031e;
            o oVar = this.this$0.f136032f;
            View view = this.$stickerView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
            return new c(dVar, oVar, (ViewGroup) view, this.this$0.f136029c, this.this$0.f136034h, new h.f.a.b<ComposerNode, z>(this.this$0) {
                /* class com.ss.android.ugc.aweme.sticker.types.b.a.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(88866);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(ComposerNode composerNode) {
                    ComposerNode composerNode2 = composerNode;
                    h.f.b.l.d(composerNode2, "");
                    a aVar = (a) this.receiver;
                    if (aVar.f136028b.contains(composerNode2)) {
                        aVar.f136028b.remove(composerNode2);
                        com.ss.android.ugc.asve.recorder.effect.composer.b bVar = aVar.f136033g;
                        List<ComposerNode> list = aVar.f136028b;
                        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                        for (T t : list) {
                            String unzipPath = t.effect.getUnzipPath();
                            if (unzipPath == null) {
                                h.f.b.l.b();
                            }
                            String extra = t.effect.getExtra();
                            if (extra == null) {
                                extra = "";
                            }
                            arrayList.add(new ComposerInfo(unzipPath, extra));
                        }
                        bVar.b(arrayList, 20000);
                    } else if (p.a(composerNode2.UI_name, "clear", true)) {
                        aVar.b();
                        aVar.f136033g.h();
                    } else {
                        aVar.f136032f.a(composerNode2.effect, new C3546a(aVar, composerNode2));
                    }
                    return z.f158842a;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        h<? extends b> hVar;
        b bVar;
        h<? extends b> hVar2 = this.f136030d;
        if (!(hVar2 == null || !hVar2.isInitialized() || (hVar = this.f136030d) == null || (bVar = (b) hVar.getValue()) == null)) {
            bVar.b();
        }
        b();
        this.f136035i = null;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        h.f.b.l.d(aVar, "");
        return g.z(aVar.f135378a);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(View view) {
        h.f.b.l.d(view, "");
        if (this.f136030d == null) {
            this.f136030d = i.a(h.m.NONE, new b(this, view));
        }
    }

    static final class d extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ ComposerNode $composerNode;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(88868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, ComposerNode composerNode) {
            super(1);
            this.this$0 = aVar;
            this.$composerNode = composerNode;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            com.ss.android.ugc.asve.recorder.effect.composer.c g2 = this.this$0.f136033g.g();
            String unzipPath = this.$composerNode.effect.getUnzipPath();
            String str = this.$composerNode.tag_name;
            h.f.b.l.b(str, "");
            g2.a(unzipPath, str, ((float) intValue) / 100.0f).a();
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.b.a$a  reason: collision with other inner class name */
    public static final class C3546a implements IFetchEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f136037a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ComposerNode f136038b;

        static {
            Covode.recordClassIndex(88864);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            h.f.b.l.d(exceptionResult, "");
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            String str;
            b bVar;
            Effect effect2 = effect;
            this.f136037a.f136028b.add(this.f136038b);
            com.ss.android.ugc.asve.recorder.effect.composer.b bVar2 = this.f136037a.f136033g;
            List<ComposerNode> list = this.f136037a.f136028b;
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                String unzipPath = next.effect.getUnzipPath();
                if (unzipPath == null) {
                    h.f.b.l.b();
                }
                String extra = next.effect.getExtra();
                if (extra != null) {
                    str = extra;
                }
                arrayList.add(new ComposerInfo(unzipPath, str));
            }
            bVar2.b(arrayList, 20000);
            com.ss.android.ugc.asve.recorder.effect.composer.c g2 = this.f136037a.f136033g.g();
            if (effect2 == null) {
                h.f.b.l.b();
            }
            String unzipPath2 = effect2.getUnzipPath();
            if (unzipPath2 == null) {
                h.f.b.l.b();
            }
            String str2 = this.f136038b.tag_name;
            h.f.b.l.b(str2, str);
            g2.a(unzipPath2, str2, this.f136038b.default_value / 100.0f).a();
            h<? extends b> hVar = this.f136037a.f136030d;
            if (hVar != null && (bVar = (b) hVar.getValue()) != null) {
                ComposerNode composerNode = this.f136038b;
                bVar.a(composerNode, new d(this.f136037a, composerNode));
            }
        }

        C3546a(a aVar, ComposerNode composerNode) {
            this.f136037a = aVar;
            this.f136038b = composerNode;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        b bVar2;
        b bVar3;
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        h<? extends b> hVar = this.f136030d;
        if (!(hVar == null || (bVar3 = (b) hVar.getValue()) == null)) {
            bVar3.a();
        }
        Effect effect = aVar.f135378a;
        ComposerNode parseComposerMaterial = ComposerHelper.parseComposerMaterial(effect.getUnzipPath(), this.f136036j.invoke(), new File(effect.getUnzipPath()).getParent());
        h<? extends b> hVar2 = this.f136030d;
        if (!(hVar2 == null || (bVar2 = (b) hVar2.getValue()) == null)) {
            bVar2.a(parseComposerMaterial);
        }
        this.f136035i = effect;
    }

    public a(h.f.a.a<String> aVar, androidx.appcompat.app.d dVar, o oVar, com.ss.android.ugc.asve.recorder.effect.composer.b bVar, k kVar) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(kVar, "");
        this.f136036j = aVar;
        this.f136031e = dVar;
        this.f136032f = oVar;
        this.f136033g = bVar;
        this.f136034h = kVar;
        c cVar = new c(this);
        this.f136028b = cVar;
        t<List<ComposerNode>> tVar = new t<>();
        tVar.setValue(cVar);
        this.f136029c = tVar;
    }
}
