package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.content.Context;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.i;
import com.ss.android.ugc.tools.utils.k;
import h.a.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f125947a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final a f125948b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(82751);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private g() {
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f125949a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f125950b;

        static {
            Covode.recordClassIndex(82752);
        }

        b(int i2, String str) {
            this.f125949a = i2;
            this.f125950b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<com.ss.android.ugc.aweme.shortvideo.c> call() {
            try {
                return l.f115658a.b().a(this.f125949a, this.f125950b);
            } catch (Exception e2) {
                i.a(false, e2);
                e2.printStackTrace();
                return null;
            }
        }
    }

    static {
        Covode.recordClassIndex(82750);
    }

    public static final class d implements IFoundationAVService.IFetchResourcesListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f125954a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f125955b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f125956c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f125957d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f125958e;

        static {
            Covode.recordClassIndex(82754);
        }

        public static final class a implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f125959a;

            static {
                Covode.recordClassIndex(82755);
            }

            /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g$d$a$a  reason: collision with other inner class name */
            public static final class C3279a extends com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f125960a;

                static {
                    Covode.recordClassIndex(82756);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                C3279a(a aVar) {
                    this.f125960a = aVar;
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b
                public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
                    if (!z) {
                        i iVar = this.f125960a.f125959a.f125955b;
                        if (iVar != null) {
                            iVar.b();
                        }
                    } else if (this.f125960a.f125959a.f125955b != null) {
                    }
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b
                public final void b(com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
                    if (z) {
                        i iVar = this.f125960a.f125959a.f125955b;
                        if (iVar != null) {
                            iVar.a(cVar);
                            return;
                        }
                        return;
                    }
                    i iVar2 = this.f125960a.f125959a.f125955b;
                    if (iVar2 != null) {
                        iVar2.c();
                    }
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(d dVar) {
                this.f125959a = dVar;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.c
            public final void a(Exception exc) {
                i iVar = this.f125959a.f125955b;
                if (iVar != null) {
                    iVar.b(exc);
                }
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.c
            public final void a(List<? extends com.ss.android.ugc.aweme.shortvideo.c> list) {
                com.ss.android.ugc.aweme.shortvideo.c cVar = null;
                if (k.a(list)) {
                    i iVar = this.f125959a.f125955b;
                    if (iVar != null) {
                        iVar.b(null);
                        return;
                    }
                    return;
                }
                i iVar2 = this.f125959a.f125955b;
                if (iVar2 != null) {
                    iVar2.a(list);
                }
                Context context = this.f125959a.f125958e;
                if (list != null) {
                    cVar = (com.ss.android.ugc.aweme.shortvideo.c) list.get(0);
                }
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a.a(context, cVar, new C3279a(this));
            }
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            h.f.b.l.d(exc, "");
            i iVar = this.f125955b;
            if (iVar != null) {
                iVar.a(exc);
            }
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            h.f.b.l.d(strArr, "");
            i iVar = this.f125955b;
            if (iVar != null) {
                iVar.a();
            }
            this.f125954a.a(this.f125956c, this.f125957d, new a(this));
        }

        d(g gVar, i iVar, int i2, String str, Context context) {
            this.f125954a = gVar;
            this.f125955b = iVar;
            this.f125956c = i2;
            this.f125957d = str;
            this.f125958e = context;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f125951a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.c f125952b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f125953c;

        static {
            Covode.recordClassIndex(82753);
        }

        c(g gVar, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.c cVar, int i2) {
            this.f125951a = gVar;
            this.f125952b = cVar;
            this.f125953c = i2;
        }

        @Override // b.g
        public final Object then(b.i<List<com.ss.android.ugc.aweme.shortvideo.c>> iVar) {
            if (iVar == null || iVar.d() == null) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.c cVar = this.f125952b;
                if (cVar != null) {
                    cVar.a(new Exception());
                }
            } else if (k.a(iVar.d())) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.c cVar2 = this.f125952b;
                if (cVar2 != null) {
                    cVar2.a(new Exception());
                }
            } else {
                List<com.ss.android.ugc.aweme.shortvideo.c> d2 = iVar.d();
                h.f.b.l.b(d2, "");
                List<com.ss.android.ugc.aweme.shortvideo.c> g2 = n.g((Collection) d2);
                for (com.ss.android.ugc.aweme.shortvideo.c cVar3 : g2) {
                    f.a(cVar3);
                }
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.c cVar4 = this.f125952b;
                if (cVar4 != null) {
                    cVar4.a(g.a(g2, this.f125953c));
                }
                i.a(true, null);
            }
            return null;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x0013 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.c>, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<com.ss.android.ugc.aweme.shortvideo.c>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    private static List<com.ss.android.ugc.aweme.shortvideo.c> b(List<? extends com.ss.android.ugc.aweme.shortvideo.c> list, int i2) {
        int i3;
        int minSeg;
        if (!k.a(list)) {
            if (list == 0) {
                h.f.b.l.b();
            }
            if (list.size() > 10) {
                Collections.shuffle(list);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    i3 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    com.ss.android.ugc.aweme.shortvideo.c cVar = (com.ss.android.ugc.aweme.shortvideo.c) it.next();
                    if (cVar.getStickPointMusicAlg() == null) {
                        minSeg = 0;
                    } else {
                        minSeg = cVar.getStickPointMusicAlg().getMinSeg();
                    }
                    if ((cVar.getStickPointMusicAlg() == null || (i3 = cVar.getStickPointMusicAlg().getMaxSeg()) <= 0) && minSeg <= 0) {
                        arrayList.add(cVar);
                    } else if (minSeg <= i2 && i3 >= i2) {
                        arrayList.add(cVar);
                    }
                }
                if (arrayList.size() <= 10) {
                    return arrayList;
                }
                list = new ArrayList<>(10);
                do {
                    list.add(arrayList.get(i3));
                    i3++;
                } while (i3 < 10);
            }
        }
        return list;
    }

    public static List<com.ss.android.ugc.aweme.shortvideo.c> a(List<com.ss.android.ugc.aweme.shortvideo.c> list, int i2) {
        List<com.ss.android.ugc.aweme.shortvideo.c> b2;
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        List<com.ss.android.ugc.aweme.shortvideo.c> list2 = null;
        if (cVar != null) {
            f.a(cVar);
            if (k.a(list)) {
                list2 = new ArrayList<>();
            } else {
                if (list == null) {
                    h.f.b.l.b();
                }
                Iterator<com.ss.android.ugc.aweme.shortvideo.c> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.ss.android.ugc.aweme.shortvideo.c next = it.next();
                    if (next.getId() == cVar.getId()) {
                        list.remove(next);
                        break;
                    }
                }
                List<com.ss.android.ugc.aweme.shortvideo.c> b3 = b(list, i2);
                if (b3 != null) {
                    list2 = n.g((Collection) b3);
                }
            }
            if (cVar.path != null) {
                String str = cVar.path;
                if (!str.startsWith(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString()) && !str.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !str.startsWith(MediaStore.Video.Media.EXTERNAL_CONTENT_URI.toString()) && list2 != null) {
                    list2.add(0, cVar);
                }
            }
            return list2;
        } else if (!k.a(list) && (b2 = b(list, i2)) != null) {
            return n.g((Collection) b2);
        } else {
            return null;
        }
    }

    public final void a(int i2, String str, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.c cVar) {
        b.i.b(new b(i2, str), b.i.f4824a).a(new c(this, cVar, i2), b.i.f4826c, null);
    }
}
