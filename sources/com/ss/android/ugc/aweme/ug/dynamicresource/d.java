package com.ss.android.ugc.aweme.ug.dynamicresource;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.kakao.usermgmt.StringSet;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.ug.dynamicresource.e;
import h.f.b.l;
import h.z;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;

public final class d implements l {

    /* renamed from: a  reason: collision with root package name */
    static final ConcurrentHashMap<String, h> f141788a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    static final PriorityBlockingQueue<h> f141789b = new PriorityBlockingQueue<>();

    /* renamed from: c  reason: collision with root package name */
    static volatile boolean f141790c;

    /* renamed from: d  reason: collision with root package name */
    static volatile boolean f141791d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f141792e = new d();

    private d() {
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.l
    public final void a(ImageView imageView, String str) {
        l.d(imageView, "");
        l.d(str, "");
        l.d(imageView, "");
        l.d(str, "");
        e.a aVar = new e.a(imageView, null);
        l.d(str, "");
        l.d(Bitmap.class, "");
        l.d(aVar, "");
        h hVar = f141788a.get(str);
        if (hVar != null) {
            Object b2 = b(str, Bitmap.class);
            if (b2 != null) {
                b(str, "async", "async_hit_cache");
                aVar.a(b2);
                return;
            }
            l.d(aVar, "");
            l.d(Bitmap.class, "");
            hVar.f141813l.put(aVar, Bitmap.class);
            if (hVar.f141810i != g.DOWNLOADING) {
                l.b(hVar, "");
                a(hVar, "async");
                return;
            }
            return;
        }
        aVar.a(null);
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.l
    public final void a() {
        i.b(c.f141796a, i.f4824a);
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.l
    public final w b() {
        return new BootFinishTask();
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.l
    public final boolean c() {
        return com.ss.android.ugc.aweme.ug.e.a.a();
    }

    static {
        Covode.recordClassIndex(92676);
    }

    private static h d() {
        String str;
        h hVar;
        while (true) {
            try {
                PriorityBlockingQueue<h> priorityBlockingQueue = f141789b;
                if (priorityBlockingQueue.isEmpty()) {
                    break;
                }
                h poll = priorityBlockingQueue.poll();
                if (!(poll == null || (str = poll.f141802a) == null || (hVar = f141788a.get(str)) == null || !hVar.f141808g || hVar.f141805d.getValue() <= f.NO_PRELOAD.getValue())) {
                    if (!(hVar.f141810i == g.DOWNLOADING && hVar.f141810i == g.SUCCESS) && !hVar.c()) {
                        return hVar;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f141796a = new c();

        static {
            Covode.recordClassIndex(92679);
        }

        c() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Iterator<Map.Entry<String, IDynamicResourceConfig>> it = b.f141780a.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<String, IDynamicResourceConfig> next = it.next();
                    com.ss.android.ugc.aweme.ug.d.a[] aVarArr = (com.ss.android.ugc.aweme.ug.d.a[]) SettingsManager.a().a("ug_dynamic_resource_list", com.ss.android.ugc.aweme.ug.d.a[].class, com.ss.android.ugc.aweme.ug.d.b.f141773a);
                    if (aVarArr != null) {
                        try {
                            for (com.ss.android.ugc.aweme.ug.d.a aVar : aVarArr) {
                                if (l.a((Object) aVar.f141769a, (Object) next.getKey())) {
                                    h hVar = d.f141788a.get(aVar.f141769a);
                                    if (hVar == null || (true ^ l.a((Object) hVar.f141806e, (Object) aVar.f141771c))) {
                                        IDynamicResourceConfig value = next.getValue();
                                        l.d(value, "");
                                        l.d(aVar, "");
                                        hVar = new h(value.a(), value.b(), aVar.f141770b, value.c(), aVar.f141771c, aVar.f141772d, value.d());
                                        hVar.c();
                                    }
                                    d.f141788a.put(aVar.f141769a, hVar);
                                    d.f141789b.add(hVar);
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        } catch (NoSuchElementException e2) {
                            e2.printStackTrace();
                        }
                    }
                } else {
                    if (d.f141790c) {
                        d.f141790c = false;
                        d.b("boot_finish_miss");
                    }
                    if (!d.f141791d) {
                        f.e().a(new BackgroundTask()).a(new IdleTask()).a();
                    }
                    d.f141791d = true;
                    return z.f158842a;
                }
            }
        }
    }

    public static void b(String str) {
        l.d(str, "");
        h d2 = d();
        if (d2 != null) {
            a(d2, str);
        }
    }

    public static final class b extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f141794a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f141795b;

        static {
            Covode.recordClassIndex(92678);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            if (downloadInfo != null) {
                d.a(this.f141794a.f141802a, "success", this.f141795b);
                d.a(this.f141794a.f141802a);
                return;
            }
            d.a(this.f141794a.f141802a, "fail", this.f141795b);
            d.a(this.f141794a.f141802a);
        }

        b(h hVar, String str) {
            this.f141794a = hVar;
            this.f141795b = str;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            l.d(baseException, "");
            d.a(this.f141794a.f141802a, "fail", this.f141795b);
            d.a(this.f141794a.f141802a);
        }
    }

    public static void a(String str) {
        h hVar = f141788a.get(str);
        if (hVar != null) {
            if (!hVar.c()) {
                hVar.a(g.FAIL);
                hVar.f141812k++;
                f141789b.add(hVar);
            } else {
                hVar.f141812k = 0;
            }
            for (Map.Entry<a<?>, Class<?>> entry : hVar.f141813l.entrySet()) {
                Class<?> value = entry.getValue();
                a<?> key = entry.getKey();
                if (l.a(value, String.class)) {
                    Objects.requireNonNull(key, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.dynamicresource.DynamicResourceCallback<kotlin.String>");
                    key.a(c(str, String.class));
                } else if (l.a(value, Bitmap.class)) {
                    Objects.requireNonNull(key, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.dynamicresource.DynamicResourceCallback<android.graphics.Bitmap>");
                    key.a(c(str, Bitmap.class));
                } else if (l.a(value, File.class)) {
                    Objects.requireNonNull(key, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.dynamicresource.DynamicResourceCallback<java.io.File>");
                    key.a(c(str, File.class));
                } else {
                    key.a(null);
                }
            }
            hVar.f141813l.clear();
            a(hVar.a(), hVar.b());
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(239);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(239);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(239);
        return delete;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f141793a;

        static {
            Covode.recordClassIndex(92677);
        }

        a(String str) {
            this.f141793a = str;
        }

        public final boolean accept(File file, String str) {
            return !l.a((Object) str, (Object) this.f141793a);
        }
    }

    private static <T> T b(String str, Class<T> cls) {
        h hVar = f141788a.get(str);
        if (hVar == null || !hVar.c()) {
            return null;
        }
        return (T) d(hVar.f141811j, cls);
    }

    private static <T> T a(Integer num, Class<T> cls) {
        MethodCollector.i(231);
        T t = null;
        if (num != null) {
            try {
                num.intValue();
                if (l.a(cls, Bitmap.class)) {
                    t = (T) BitmapFactory.decodeResource(com.bytedance.ies.ugc.appcontext.d.a().getResources(), num.intValue());
                }
            } catch (Exception unused) {
            }
        }
        MethodCollector.o(231);
        return t;
    }

    private static <T> T c(String str, Class<T> cls) {
        Integer num;
        String str2;
        T t = (T) b(str, cls);
        if (t != null) {
            b(str, "async", "async_re_download_success");
            return t;
        }
        h hVar = f141788a.get(str);
        if (hVar != null) {
            num = hVar.f141809h;
        } else {
            num = null;
        }
        T t2 = (T) a(num, cls);
        if (t2 != null) {
            str2 = "async_re_download_fallback";
        } else {
            str2 = "async_re_download_fail";
        }
        b(str, "async", str2);
        return t2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T d(String str, Class<T> cls) {
        MethodCollector.i(229);
        if (l.a(cls, String.class)) {
            MethodCollector.o(229);
            return str;
        } else if (l.a(cls, Bitmap.class)) {
            T t = (T) BitmapFactory.decodeFile(str);
            MethodCollector.o(229);
            return t;
        } else if (l.a(cls, File.class)) {
            T t2 = (T) new File(str);
            MethodCollector.o(229);
            return t2;
        } else {
            MethodCollector.o(229);
            return null;
        }
    }

    public static <T> T a(String str, Class<T> cls) {
        Integer num;
        String str2;
        l.d(str, "");
        l.d(cls, "");
        T t = (T) b(str, cls);
        if (t != null) {
            b(str, "sync", "sync_hit_cache");
            return t;
        }
        ConcurrentHashMap<String, h> concurrentHashMap = f141788a;
        h hVar = concurrentHashMap.get(str);
        if (hVar != null) {
            l.b(hVar, "");
            a(hVar, "sync");
        }
        h hVar2 = concurrentHashMap.get(str);
        if (hVar2 != null) {
            num = hVar2.f141809h;
        } else {
            num = null;
        }
        T t2 = (T) a(num, cls);
        if (t2 != null) {
            str2 = "sync_hit_fallback";
        } else {
            str2 = "sync_miss";
        }
        b(str, "sync", str2);
        return t2;
    }

    private static void a(h hVar, String str) {
        a(hVar.f141802a, "start", str);
        b bVar = new b(hVar, str);
        try {
            com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(hVar.f141804c);
            with.f83081f = hVar.a();
            com.ss.android.ugc.aweme.download.component_api.a a2 = with.a(3);
            a2.f83078c = hVar.b();
            com.ss.android.ugc.aweme.download.component_api.a a3 = a2.a("dynamic_resource_download");
            a3.D = bVar;
            a3.f();
            hVar.a(g.DOWNLOADING);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void a(String str, String str2) {
        File[] listFiles;
        File file = new File(str);
        if (file.exists() && (listFiles = file.listFiles(new a(str2))) != null) {
            for (File file2 : listFiles) {
                a(file2);
            }
        }
    }

    public static void a(String str, String str2, String str3) {
        r.a("heli_download_resource", new com.ss.android.ugc.aweme.app.f.d().a("key", str).a("status", str2).a("launch_type", str3).f66730a);
    }

    private static void b(String str, String str2, String str3) {
        r.a("heli_get_resource", new com.ss.android.ugc.aweme.app.f.d().a("key", str).a(StringSet.type, str2).a("result", str3).f66730a);
    }
}
