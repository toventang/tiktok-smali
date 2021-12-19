package com.ss.android.ugc.aweme.emoji.sysemoji;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.utils.cs;
import com.ss.android.ugc.aweme.utils.dg;
import f.a.ae;
import h.a.n;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.r;
import h.z;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    static final am f89391a = an.a(bf.f159041b);

    /* renamed from: b  reason: collision with root package name */
    static volatile int f89392b;

    /* renamed from: c  reason: collision with root package name */
    static final List<i> f89393c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    static final Map<Integer, List<i>> f89394d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final h f89395e = new h();

    /* renamed from: f  reason: collision with root package name */
    private static Map<Integer, Boolean> f89396f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    private static volatile String f89397g = "";

    /* renamed from: h  reason: collision with root package name */
    private static final h.h f89398h = i.a((h.f.a.a) d.f89400a);

    public static boolean a(int i2, int i3) {
        int i4 = i2 & i3;
        return i4 == 4 || i4 == 1 || i4 == 2 || i4 == 7;
    }

    private static List<i> d() {
        return (List) f89398h.getValue();
    }

    private h() {
    }

    static final class d extends m implements h.f.a.a<List<i>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f89400a = new d();

        static {
            Covode.recordClassIndex(56170);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<i> invoke() {
            return h.b();
        }
    }

    static {
        Covode.recordClassIndex(56165);
    }

    public static void a() {
        boolean z;
        com.ss.android.ugc.aweme.emoji.utils.d a2 = com.ss.android.ugc.aweme.emoji.utils.d.a();
        l.b(a2, "");
        String d2 = a2.d();
        l.b(d2, "");
        if (d2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.ss.android.ugc.aweme.framework.a.a.a(3, null, "ImSysEmojiManager preloadResourceInfo lastCacheMd5 empty");
            return;
        }
        f89397g = d2;
        f89392b = 1;
        bz unused = kotlinx.coroutines.i.a(f89391a, null, null, new c(d2, null), 3);
    }

    private synchronized void e() {
        MethodCollector.i(699);
        if (d().isEmpty()) {
            d().addAll(b());
        }
        MethodCollector.o(699);
    }

    public final synchronized void c() {
        MethodCollector.i(698);
        List<i> list = f89393c;
        if (!list.isEmpty()) {
            MethodCollector.o(698);
        } else if (n.d()) {
            e();
            list.addAll(d());
            MethodCollector.o(698);
        } else {
            a();
            MethodCollector.o(698);
        }
    }

    public static List<i> b() {
        boolean z;
        MethodCollector.i(694);
        f89392b = 1;
        InputStream open = com.bytedance.ies.ugc.appcontext.d.a().getAssets().open("I18N_sys_emoji.json");
        l.b(open, "");
        ArrayList arrayList = new ArrayList();
        List<a> d2 = ((k) dg.a(cs.a(open, "UTF-8"), k.class)).getD();
        if (d2 != null) {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) d2, 10));
            for (T t : d2) {
                if (Build.VERSION.SDK_INT >= Integer.parseInt(t.getAnd())) {
                    z = true;
                } else {
                    z = false;
                }
                String str = null;
                if (z) {
                    i iVar = new i();
                    iVar.setBusinessType(t.getBusiness());
                    List<String> emoji = t.getEmoji();
                    if (emoji != null) {
                        str = emoji.get(0);
                    }
                    iVar.setPreviewEmoji(str);
                    iVar.setSupportSkinBusinessType(1);
                    iVar.setEmojiList(t.getEmoji());
                    iVar.setMiniSupportSysVersion(t.getAnd());
                    arrayList.add(iVar);
                    str = t;
                }
                arrayList2.add(str);
            }
        }
        MethodCollector.o(694);
        return arrayList;
    }

    public static final class a extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f89399a;

        static {
            Covode.recordClassIndex(56166);
        }

        a(l lVar) {
            this.f89399a = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x011e  */
        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo r13) {
            /*
            // Method dump skipped, instructions count: 290
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.sysemoji.h.a.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            Integer num;
            String str;
            super.onFailed(downloadInfo, baseException);
            StringBuilder sb = new StringBuilder("ImSysEmojiManager download failed: ");
            if (baseException != null) {
                num = Integer.valueOf(baseException.getErrorCode());
            } else {
                num = null;
            }
            StringBuilder append = sb.append(num).append(", ");
            if (baseException != null) {
                str = baseException.getMessage();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.framework.a.a.b(3, null, append.append(str).toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<i, Boolean> {
        final /* synthetic */ int $businessType;

        static {
            Covode.recordClassIndex(56167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(1);
            this.$businessType = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(i iVar) {
            i iVar2 = iVar;
            l.d(iVar2, "");
            return Boolean.valueOf(h.a(this.$businessType, iVar2.getBusinessType()));
        }
    }

    static final class f extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ int $businessType;
        final /* synthetic */ List $emojiList;
        final /* synthetic */ String $lastCacheMd5;
        int label;

        static {
            Covode.recordClassIndex(56172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, int i2, List list, h.c.d dVar) {
            super(2, dVar);
            this.$lastCacheMd5 = str;
            this.$businessType = i2;
            this.$emojiList = list;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new f(this.$lastCacheMd5, this.$businessType, this.$emojiList, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((f) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                f.f89384a.a(this.$lastCacheMd5, this.$emojiList);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static void a(l lVar) {
        f fVar = f.f89384a;
        int i2 = f89392b;
        if ((i2 == 1 || i2 == 2) && f89397g.length() > 0) {
            String[] strArr = new String[2];
            strArr[0] = f89397g;
            String md5 = lVar.getMd5();
            if (md5 == null) {
                l.b();
            }
            strArr[1] = md5;
            fVar.a(strArr);
            return;
        }
        String[] strArr2 = new String[1];
        String md52 = lVar.getMd5();
        if (md52 == null) {
            l.b();
        }
        strArr2[0] = md52;
        fVar.a(strArr2);
    }

    public static boolean b(int i2) {
        n.c();
        n.a();
        n.d();
        boolean z = true;
        if (f89396f.get(Integer.valueOf(i2)) == null) {
            if (!n.d() && (n.c() || !a(i2, n.a().f89407a))) {
                z = false;
            }
            f89396f.put(Integer.valueOf(i2), Boolean.valueOf(z));
            return z;
        }
        Boolean bool = f89396f.get(Integer.valueOf(i2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class c extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ String $lastCacheMd5;
        int label;

        static {
            Covode.recordClassIndex(56168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, h.c.d dVar) {
            super(2, dVar);
            this.$lastCacheMd5 = str;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.$lastCacheMd5, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
            // Method dump skipped, instructions count: 140
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.sysemoji.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class e implements ae<j> {
        static {
            Covode.recordClassIndex(56171);
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(j jVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            if (jVar2.f89401a == 0) {
                com.ss.android.ugc.aweme.emoji.utils.d a2 = com.ss.android.ugc.aweme.emoji.utils.d.a();
                l.b(a2, "");
                String d2 = a2.d();
                l.b(d2, "");
                if (d2.length() > 0) {
                    com.ss.android.ugc.aweme.framework.a.a.a(3, null, "ImSysEmojiManager refreshEmoji response.isUpdate == 0");
                    h.a();
                    return;
                }
            }
            com.ss.android.ugc.aweme.framework.a.a.a(3, null, "ImSysEmojiManager refreshEmoji success: ".concat(String.valueOf(jVar2)));
            l lVar = jVar2.f89402b;
            if (lVar == null || com.bytedance.x.c.c.a(lVar.getMd5()) || com.bytedance.x.c.c.a(lVar.getResourceUrl())) {
                com.ss.android.ugc.aweme.framework.a.a.b(3, null, "ImSysEmojiManager refreshEmoji fail: ".concat(String.valueOf(jVar2)));
                return;
            }
            com.ss.android.ugc.aweme.emoji.utils.d a3 = com.ss.android.ugc.aweme.emoji.utils.d.a();
            l.b(a3, "");
            if (l.a((Object) lVar.getMd5(), (Object) a3.d())) {
                String md5 = lVar.getMd5();
                if (md5 == null) {
                    l.b();
                }
                l.d(md5, "");
                File file = new File(f.a(md5));
                if (file.exists() && file.isDirectory()) {
                    lVar.getMd5();
                    h.a(lVar);
                    h.a();
                    return;
                }
            }
            a aVar = new a(lVar);
            com.ss.android.ugc.aweme.download.component_api.a a4 = DownloadServiceManager.INSTANCE.getDownloadService().with(lVar.getResourceUrl()).a(3);
            a4.f83081f = f.a();
            String md52 = lVar.getMd5();
            if (md52 == null) {
                l.b();
            }
            l.d(md52, "");
            a4.f83078c = md52 + ".zip";
            com.ss.android.ugc.aweme.download.component_api.a a5 = a4.a(true).a("emoji_im_sys_manager");
            a5.D = aVar;
            a5.f();
        }
    }

    public final synchronized List<i> a(int i2) {
        String str;
        List<i> list;
        MethodCollector.i(691);
        Map<Integer, List<i>> map = f89394d;
        boolean z = true;
        if (map.get(Integer.valueOf(i2)) == null || (list = map.get(Integer.valueOf(i2))) == null || !(!list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            List<i> list2 = f89393c;
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            }
            if (z || n.d()) {
                e();
                arrayList.addAll(d());
            } else {
                arrayList.addAll(list2);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator a2 = h.l.k.a(h.l.k.e(n.t(arrayList)), (h.f.a.b) new b(i2)).a();
            while (a2.hasNext()) {
                i iVar = (i) a2.next();
                if (iVar.getSupportSkinBusinessType() != i2) {
                    List<String> emojiList = iVar.getEmojiList();
                    if (emojiList == null || (str = emojiList.get(0)) == null) {
                        str = "";
                    }
                    iVar.setPreviewEmoji(str);
                }
                arrayList2.add(iVar);
            }
            f89394d.put(Integer.valueOf(i2), arrayList2);
            MethodCollector.o(691);
            return arrayList2;
        }
        List<i> list3 = map.get(Integer.valueOf(i2));
        if (list3 == null) {
            l.b();
        }
        List<i> list4 = list3;
        MethodCollector.o(691);
        return list4;
    }
}
