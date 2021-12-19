package com.ss.android.ugc.aweme.tools.extract.a;

import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.e.k;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f139988a = new b();

    public interface a {
        static {
            Covode.recordClassIndex(91483);
        }

        void a(HashMap<String, Integer> hashMap);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.a.b$b  reason: collision with other inner class name */
    public interface AbstractC3694b {
        static {
            Covode.recordClassIndex(91484);
        }

        void a(boolean z);
    }

    /* access modifiers changed from: package-private */
    public interface c {
        static {
            Covode.recordClassIndex(91485);
        }

        void a(String str, int i2);
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(91482);
    }

    public static final class e implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.c f139993a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbstractC3694b f139994b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f139995c;

        static {
            Covode.recordClassIndex(91487);
        }

        @Override // com.ss.android.ugc.aweme.tools.extract.a.b.a
        public final void a(HashMap<String, Integer> hashMap) {
            l.d(hashMap, "");
            Collection<Integer> values = hashMap.values();
            l.b(values, "");
            int i2 = 0;
            for (T t : values) {
                if (t != null && t.intValue() == 0) {
                    this.f139993a.element++;
                }
                l.b(t, "");
                i2 += t.intValue();
            }
            this.f139993a.element += (i2 / LiveNetAdaptiveHurryTimeSetting.DEFAULT) + 1;
            if (this.f139993a.element == 0) {
                this.f139994b.a(false);
            } else if (Math.abs(this.f139995c - this.f139993a.element) > 3) {
                this.f139994b.a(false);
            } else {
                this.f139994b.a(true);
            }
        }

        public e(z.c cVar, AbstractC3694b bVar, int i2) {
            this.f139993a = cVar;
            this.f139994b = bVar;
            this.f139995c = i2;
        }
    }

    public static final class f implements com.facebook.d.e<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f139996a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f139997b;

        static {
            Covode.recordClassIndex(91488);
        }

        @Override // com.facebook.d.e
        public final void onCancellation(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
        }

        @Override // com.facebook.d.e
        public final void onFailure(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
        }

        @Override // com.facebook.d.e
        public final void onProgressUpdate(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
        }

        @Override // com.facebook.d.e
        public final void onNewResult(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
            com.facebook.common.h.a<com.facebook.imagepipeline.j.c> d2;
            com.facebook.imagepipeline.j.c a2;
            int duration;
            if (cVar != null && (d2 = cVar.d()) != null && (a2 = d2.a()) != null && (a2 instanceof com.facebook.imagepipeline.j.a)) {
                com.facebook.imagepipeline.j.a aVar = (com.facebook.imagepipeline.j.a) a2;
                com.facebook.imagepipeline.a.a.e d3 = aVar.d();
                l.b(d3, "");
                com.facebook.imagepipeline.a.a.c cVar2 = d3.f47649a;
                l.b(cVar2, "");
                if (cVar2.getDuration() <= 0) {
                    duration = 1;
                } else {
                    com.facebook.imagepipeline.a.a.e d4 = aVar.d();
                    l.b(d4, "");
                    com.facebook.imagepipeline.a.a.c cVar3 = d4.f47649a;
                    l.b(cVar3, "");
                    duration = cVar3.getDuration();
                }
                this.f139996a.a(this.f139997b, duration);
            }
        }

        f(c cVar, String str) {
            this.f139996a = cVar;
            this.f139997b = str;
        }
    }

    public static ArrayList<String> a(String str) {
        l.d(str, "");
        File[] listFiles = new File(str).listFiles();
        ArrayList<String> arrayList = new ArrayList<>();
        l.b(listFiles, "");
        ArrayList<File> arrayList2 = new ArrayList();
        for (File file : listFiles) {
            l.b(file, "");
            String absolutePath = file.getAbsolutePath();
            l.b(absolutePath, "");
            if (p.e((CharSequence) absolutePath, (CharSequence) "custom_sticker")) {
                arrayList2.add(file);
            }
        }
        for (File file2 : arrayList2) {
            l.b(file2, "");
            arrayList.add(file2.getAbsolutePath());
        }
        return arrayList;
    }

    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f139989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f139990b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f139991c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f139992d;

        static {
            Covode.recordClassIndex(91486);
        }

        @Override // com.ss.android.ugc.aweme.tools.extract.a.b.c
        public final void a(String str, int i2) {
            l.d(str, "");
            this.f139990b.put(this.f139989a, Integer.valueOf(i2));
            if (this.f139990b.size() == this.f139991c) {
                this.f139992d.a(this.f139990b);
            }
        }

        d(String str, HashMap hashMap, int i2, a aVar) {
            this.f139989a = str;
            this.f139990b = hashMap;
            this.f139991c = i2;
            this.f139992d = aVar;
        }
    }

    public static void a(List<String> list, a aVar) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        int size = list.size();
        for (T t : list) {
            if (!com.ss.android.ugc.aweme.video.e.b((String) t)) {
                hashMap.put(t, 0);
                if (hashMap.size() == size) {
                    aVar.a(hashMap);
                }
            } else {
                b bVar = f139988a;
                d dVar = new d(t, hashMap, size, aVar);
                com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a2 = k.a().e().a(com.facebook.imagepipeline.o.c.a(Uri.fromFile(new File((String) t))).a(), bVar);
                l.b(a2, "");
                a2.a(new f(dVar, t), Executors.newCachedThreadPool());
            }
        }
    }
}
