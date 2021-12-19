package com.ss.android.ugc.aweme.feed.cache;

import android.content.Context;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.aweme.utils.cs;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.m.d;
import h.z;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f92718a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f92719b;

    /* renamed from: c  reason: collision with root package name */
    public static final f f92720c = new f();

    private f() {
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ FeedItemList $data;

        static {
            Covode.recordClassIndex(58806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FeedItemList feedItemList) {
            super(0);
            this.$data = feedItemList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            Throwable th;
            MethodCollector.i(6763);
            File b2 = f.b();
            if (b2 == null) {
                MethodCollector.o(6763);
            } else if (f.a(b2)) {
                GsonProvider c2 = GsonHolder.c();
                l.b(c2, "");
                String b3 = c2.b().b(this.$data);
                if (TextUtils.isEmpty(b3)) {
                    f.c();
                    MethodCollector.o(6763);
                    return;
                }
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(b2);
                    try {
                        l.b(b3, "");
                        Charset charset = d.f158808a;
                        if (b3 != null) {
                            byte[] bytes = b3.getBytes(charset);
                            l.b(bytes, "");
                            fileOutputStream2.write(bytes);
                            f.f92719b = true;
                            cs.a(fileOutputStream2);
                            MethodCollector.o(6763);
                            return;
                        }
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        MethodCollector.o(6763);
                        throw nullPointerException;
                    } catch (Exception unused) {
                        fileOutputStream = fileOutputStream2;
                        try {
                            f.f92719b = false;
                            cs.a(fileOutputStream);
                            MethodCollector.o(6763);
                        } catch (Throwable th2) {
                            th = th2;
                            cs.a(fileOutputStream);
                            MethodCollector.o(6763);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream2;
                        cs.a(fileOutputStream);
                        MethodCollector.o(6763);
                        throw th;
                    }
                } catch (Exception unused2) {
                    f.f92719b = false;
                    cs.a(fileOutputStream);
                    MethodCollector.o(6763);
                }
            } else {
                MethodCollector.o(6763);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92721a;

        static {
            Covode.recordClassIndex(58807);
        }

        b(a aVar) {
            this.f92721a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f92721a.a();
            f.f92718a = false;
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(58805);
    }

    public static void c() {
        try {
            File d2 = d();
            if (d2 != null) {
                b(d2);
            }
        } catch (Throwable unused) {
        }
    }

    public static File b() {
        File a2 = a(com.bytedance.ies.ugc.appcontext.d.a());
        l.b(a2, "");
        String absolutePath = a2.getAbsolutePath();
        if (absolutePath == null) {
            return null;
        }
        return new File(absolutePath + File.separator + "extention_cached_feed.json");
    }

    private static File d() {
        File a2 = a(com.bytedance.ies.ugc.appcontext.d.a());
        l.b(a2, "");
        String absolutePath = a2.getAbsolutePath();
        if (absolutePath == null) {
            return null;
        }
        File file = new File(absolutePath + File.separator + "extention_cached_feed.json");
        if (file.exists()) {
            return file;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r1.getItems().size() > 0) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.feed.model.FeedItemList a() {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.cache.f.a():com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    public static boolean a(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            file.createNewFile();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    private static boolean b(File file) {
        MethodCollector.i(9278);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(9278);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(9278);
        return delete;
    }

    private static FeedItemList a(FeedItemList feedItemList) {
        Object obj;
        List<Aweme> items;
        ArrayList<Aweme> arrayList = new ArrayList();
        List<Aweme> items2 = feedItemList.getItems();
        if (items2 != null) {
            for (Aweme aweme : items2) {
                l.b(aweme, "");
                if (com.ss.android.ugc.aweme.feed.cache.a.a.a(aweme)) {
                    arrayList.add(aweme);
                    aweme.getAid();
                    aweme.getAid();
                }
            }
        }
        if (arrayList.isEmpty()) {
            return feedItemList;
        }
        List<Aweme> items3 = feedItemList.getItems();
        if (items3 != null) {
            items3.removeAll(arrayList);
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "request_detail_for_expire_cdn", false)) {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) arrayList, 10));
            for (Aweme aweme2 : arrayList) {
                arrayList2.add(aweme2.getAid());
            }
            try {
                List<Aweme> list = DetailFeedServiceImpl.b().a("[" + n.a(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62) + ']', null, null).f79632a;
                if (list != null) {
                    for (T t : list) {
                        l.b(t, "");
                        t.getAid();
                        t.getAid();
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (TextUtils.equals(((Aweme) obj).getAid(), t.getAid())) {
                                break;
                            }
                        }
                        Aweme aweme3 = (Aweme) obj;
                        if (!(aweme3 == null || (items = feedItemList.getItems()) == null)) {
                            items.add(aweme3);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        List<Aweme> items4 = feedItemList.getItems();
        if (items4 == null || items4.isEmpty()) {
            return feedItemList;
        }
        return null;
    }

    public static void a(FeedItemList feedItemList, boolean z) {
        a aVar = new a(feedItemList);
        if (z) {
            i.b(new b(aVar), i.f4824a);
            return;
        }
        aVar.a();
        f92718a = false;
    }
}
