package com.ss.android.ugc.aweme.tools.beauty.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final Keva f138957c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f138958d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final n<com.ss.android.ugc.aweme.tools.beauty.b> f138959a = new n<>();

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.beauty.a f138960b = com.ss.android.ugc.aweme.tools.beauty.a.FEMALE;

    /* renamed from: e  reason: collision with root package name */
    private final BeautyFilterConfig f138961e;

    /* renamed from: f  reason: collision with root package name */
    private final f f138962f;

    public static final class a {
        static {
            Covode.recordClassIndex(90875);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends com.google.gson.b.a<List<com.ss.android.ugc.aweme.tools.beauty.b>> {
        static {
            Covode.recordClassIndex(90876);
        }

        b() {
        }
    }

    static {
        Covode.recordClassIndex(90874);
        Keva repo = Keva.getRepo("ulike_repo");
        l.b(repo, "");
        f138957c = repo;
    }

    private final String c() {
        return this.f138961e.getSequenceKey() + this.f138960b.getFlag() + "_key_beauty_sequence";
    }

    private final List<com.ss.android.ugc.aweme.tools.beauty.b> d() {
        String string = f138957c.getString(c(), null);
        com.ss.android.ugc.aweme.dependence.beauty.a.c("get sequence: ".concat(String.valueOf(string)));
        try {
            return (List) this.f138962f.a(string, new b().type);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final synchronized void a() {
        MethodCollector.i(12274);
        this.f138959a.clear();
        List<com.ss.android.ugc.aweme.tools.beauty.b> d2 = d();
        if (d2 != null) {
            com.ss.android.ugc.aweme.dependence.beauty.a.c("init sequence: ".concat(String.valueOf(d2)));
            this.f138959a.addAll(n.g((Iterable) d2));
            MethodCollector.o(12274);
            return;
        }
        MethodCollector.o(12274);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        MethodCollector.i(12425);
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                arrayList.addAll(this.f138959a);
            } catch (Throwable th) {
                MethodCollector.o(12425);
                throw th;
            }
        }
        String b2 = this.f138962f.b(arrayList);
        l.b(b2, "");
        com.ss.android.ugc.aweme.dependence.beauty.a.c("save sequence:".concat(String.valueOf(b2)));
        f138957c.storeString(c(), b2);
        MethodCollector.o(12425);
    }

    public final void a(com.ss.android.ugc.aweme.tools.beauty.a aVar) {
        l.d(aVar, "");
        this.f138960b = aVar;
    }

    public final void a(com.ss.android.ugc.aweme.tools.beauty.b bVar) {
        MethodCollector.i(12275);
        l.d(bVar, "");
        synchronized (this) {
            try {
                this.f138959a.add(bVar);
            } catch (Throwable th) {
                MethodCollector.o(12275);
                throw th;
            }
        }
        b();
        MethodCollector.o(12275);
    }

    public g(BeautyFilterConfig beautyFilterConfig, f fVar) {
        l.d(beautyFilterConfig, "");
        l.d(fVar, "");
        this.f138961e = beautyFilterConfig;
        this.f138962f = fVar;
        a();
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements Comparator<ComposerBeauty> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f138963a;

        static {
            Covode.recordClassIndex(90877);
        }

        c(g gVar) {
            this.f138963a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(ComposerBeauty composerBeauty, ComposerBeauty composerBeauty2) {
            return this.f138963a.f138959a.indexOf(new com.ss.android.ugc.aweme.tools.beauty.b(composerBeauty.getEffect().getEffectId())) - this.f138963a.f138959a.indexOf(new com.ss.android.ugc.aweme.tools.beauty.b(composerBeauty2.getEffect().getEffectId()));
        }
    }

    public final synchronized void a(List<ComposerBeauty> list, h.f.a.b<? super ComposerBeauty, Boolean> bVar) {
        T t;
        T t2;
        T t3;
        MethodCollector.i(12559);
        l.d(list, "");
        l.d(bVar, "");
        com.ss.android.ugc.aweme.dependence.beauty.a.c("sort sequence: " + this.f138959a);
        n.a((List) list, (Comparator) new c(this));
        Iterator<ComposerBeauty> it = list.iterator();
        while (true) {
            com.ss.android.ugc.aweme.tools.beauty.b bVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            ComposerBeauty next = it.next();
            if (bVar.invoke(next).booleanValue()) {
                Iterator<com.ss.android.ugc.aweme.tools.beauty.b> it2 = this.f138959a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    com.ss.android.ugc.aweme.tools.beauty.b next2 = it2.next();
                    if (l.a((Object) next.getEffect().getEffectId(), (Object) next2.f138834a)) {
                        bVar2 = next2;
                        break;
                    }
                }
                if (bVar2 == null) {
                    it.remove();
                }
            }
        }
        int indexOf = this.f138959a.indexOf(new com.ss.android.ugc.aweme.tools.beauty.b("EFFECT_ID_TYPE_FILTER", 2));
        if (indexOf >= 0 && indexOf < this.f138959a.size()) {
            ComposerBeauty composerBeauty = new ComposerBeauty(new Effect(null, 1, null), new ComposerBeautyExtra(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, false, 0, null, null, null, 16777215, null), new ComposerBeautyExtraBeautify(null, null, 3, null), null, false, false, null, null, null, null, false, false, false, 0, 0, false, false, false, 0, 0, 0, new BeautyCategoryExtra(null, false, false, false, null, false, false, false, null, null, null, null, null, false, 16383, null), false, 6291448, null);
            composerBeauty.getEffect().setEffectId("EFFECT_ID_TYPE_FILTER");
            if (indexOf == this.f138959a.size() - 1) {
                list.add(composerBeauty);
                MethodCollector.o(12559);
                return;
            }
            boolean z = false;
            if (indexOf == 0) {
                int size = this.f138959a.size();
                int i2 = 1;
                while (true) {
                    if (i2 < size) {
                        if (z) {
                            break;
                        }
                        Object obj = this.f138959a.get(i2);
                        l.b(obj, "");
                        com.ss.android.ugc.aweme.tools.beauty.b bVar3 = (com.ss.android.ugc.aweme.tools.beauty.b) obj;
                        Iterator<T> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                t3 = null;
                                break;
                            }
                            t3 = it3.next();
                            if (l.a((Object) t3.getEffect().getEffectId(), (Object) bVar3.f138834a)) {
                                break;
                            }
                        }
                        T t4 = t3;
                        if (t4 != null) {
                            list.add(list.indexOf(t4), composerBeauty);
                            z = true;
                        }
                        i2++;
                    } else if (!z) {
                        list.add(composerBeauty);
                        MethodCollector.o(12559);
                        return;
                    }
                }
            } else {
                int i3 = indexOf - 1;
                while (true) {
                    if (i3 <= 0) {
                        if (z) {
                            break;
                        }
                        Object obj2 = this.f138959a.get(i3);
                        l.b(obj2, "");
                        com.ss.android.ugc.aweme.tools.beauty.b bVar4 = (com.ss.android.ugc.aweme.tools.beauty.b) obj2;
                        Iterator<T> it4 = list.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it4.next();
                            if (l.a((Object) t2.getEffect().getEffectId(), (Object) bVar4.f138834a)) {
                                break;
                            }
                        }
                        T t5 = t2;
                        if (t5 != null) {
                            list.add(list.indexOf(t5) + 1, composerBeauty);
                            z = true;
                        }
                        i3++;
                    } else if (!z) {
                        int i4 = indexOf + 1;
                        int size2 = this.f138959a.size();
                        while (true) {
                            if (i4 < size2) {
                                if (z) {
                                    break;
                                }
                                Object obj3 = this.f138959a.get(i4);
                                l.b(obj3, "");
                                com.ss.android.ugc.aweme.tools.beauty.b bVar5 = (com.ss.android.ugc.aweme.tools.beauty.b) obj3;
                                Iterator<T> it5 = list.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    t = it5.next();
                                    if (l.a((Object) t.getEffect().getEffectId(), (Object) bVar5.f138834a)) {
                                        break;
                                    }
                                }
                                T t6 = t;
                                if (t6 != null) {
                                    list.add(list.indexOf(t6), composerBeauty);
                                    z = true;
                                }
                                i4++;
                            } else if (!z) {
                                list.add(composerBeauty);
                            }
                        }
                    }
                }
            }
        }
        MethodCollector.o(12559);
    }
}
