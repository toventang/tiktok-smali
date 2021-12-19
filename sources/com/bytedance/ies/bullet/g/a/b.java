package com.bytedance.ies.bullet.g.a;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.e;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.utils.m;
import com.bytedance.ies.bullet.kit.a.d;
import com.bytedance.ies.bullet.kit.a.g;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.resourceloader.config.f;
import com.bytedance.ies.bullet.service.base.resourceloader.config.i;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import h.f.b.l;
import h.m.p;
import h.w;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class b implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f32162b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    IResourceLoaderService f32163a;

    /* renamed from: c  reason: collision with root package name */
    private final a f32164c = new a();

    /* renamed from: d  reason: collision with root package name */
    private File f32165d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.geckox.statistic.a f32166e = c.f32171a;

    static {
        Covode.recordClassIndex(18857);
    }

    @Override // com.bytedance.ies.bullet.kit.a.d
    public final String a() {
        return "2.4.1-rc.9.2-bugfix";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18858);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.d
    public final void a(j jVar, List<String> list, f fVar) {
        l.c(jVar, "");
        l.c(list, "");
        C0682b bVar = new C0682b(this, jVar, fVar, list);
        com.bytedance.geckox.c a2 = a(jVar);
        if (a2 != null) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new CheckRequestBodyModel.TargetChannel(list.get(0)));
            hashMap.put(jVar.y, arrayList);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            String str = jVar.y;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            i a3 = g.b.f32252a.a(this.f32163a);
            String businessVersion = com.bytedance.ies.bullet.kit.a.a.f.a(a3, str).getBusinessVersion();
            if (businessVersion == null) {
                businessVersion = a3.f32630k;
            }
            linkedHashMap2.put("business_version", businessVersion);
            linkedHashMap.put(str, linkedHashMap2);
            OptionCheckUpdateParams listener = optionCheckUpdateParams.setCustomParam(linkedHashMap).setListener(bVar);
            if (jVar instanceof com.bytedance.ies.bullet.kit.a.a.d) {
                if (((com.bytedance.ies.bullet.kit.a.a.d) jVar).f32189f == 1) {
                    l.a((Object) listener, "");
                    listener.setChannelUpdatePriority(3);
                    listener.setEnableThrottle(false);
                } else {
                    l.a((Object) listener, "");
                    listener.setLazyUpdate(true);
                }
            }
            l.a((Object) listener, "");
            a2.a((String) null, hashMap, listener);
        } else if (fVar != null) {
            fVar.a(list, new Throwable("GeckoXClient is null"));
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.d
    public final void a(IResourceLoaderService iResourceLoaderService) {
        this.f32163a = iResourceLoaderService;
    }

    /* renamed from: com.bytedance.ies.bullet.g.a.b$b  reason: collision with other inner class name */
    public static final class C0682b extends com.bytedance.geckox.f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f32167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f32168b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f32169c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f32170d;

        static {
            Covode.recordClassIndex(18859);
        }

        private final String b(String str) {
            return this.f32167a.b(com.bytedance.ies.bullet.kit.a.a.f.a(g.b.f32252a.a(this.f32167a.f32163a), this.f32168b.y).getOfflineDir(), this.f32168b.y, str);
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(LocalPackageModel localPackageModel) {
            String str;
            super.a(localPackageModel);
            f fVar = this.f32169c;
            if (fVar != null) {
                List<String> list = this.f32170d;
                if (localPackageModel == null || (str = localPackageModel.getChannel()) == null) {
                    str = this.f32168b.f32638l;
                }
                b(str);
                fVar.a(list);
            }
        }

        @Override // com.bytedance.geckox.f.a
        public final void b(UpdatePackage updatePackage, Throwable th) {
            f fVar = this.f32169c;
            if (fVar != null) {
                List<String> list = this.f32170d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                fVar.a(list, th);
            }
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(UpdatePackage updatePackage, Throwable th) {
            f fVar = this.f32169c;
            if (fVar != null) {
                List<String> list = this.f32170d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                fVar.a(list, th);
            }
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(String str, long j2) {
            l.c(str, "");
            b(str);
            f fVar = this.f32169c;
            if (fVar != null) {
                fVar.a(this.f32170d);
            }
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(String str, Throwable th) {
            f fVar = this.f32169c;
            if (fVar != null) {
                List<String> list = this.f32170d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                fVar.a(list, th);
            }
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(Map<String, List<Pair<String, Long>>> map, Throwable th) {
            f fVar = this.f32169c;
            if (fVar != null) {
                List<String> list = this.f32170d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                fVar.a(list, th);
            }
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
            boolean z;
            List<Pair<String, Long>> list;
            super.a(map, map2);
            if (map2 == null || map2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                List list2 = this.f32170d;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (!(map == null || (list = map.get(this.f32168b.y)) == null)) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (l.a(obj, ((Pair) next).first)) {
                                if (next != null) {
                                }
                            }
                        }
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next();
                    f fVar = this.f32169c;
                    if (fVar != null) {
                        fVar.a(this.f32170d, new Throwable("invalid channel"));
                    }
                }
                return;
            }
            List list3 = this.f32170d;
            ArrayList<String> arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                List<UpdatePackage> list4 = map2.get(this.f32168b.y);
                if (list4 != null) {
                    Iterator<T> it3 = list4.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        T next2 = it3.next();
                        if (l.a((Object) next2.getChannel(), obj2)) {
                            if (next2 != null) {
                            }
                        }
                    }
                }
                arrayList2.add(obj2);
            }
            for (String str : arrayList2) {
                f fVar2 = this.f32169c;
                if (fVar2 != null) {
                    List<String> list5 = this.f32170d;
                    b(str);
                    fVar2.a(list5);
                }
            }
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(int i2, Map<String, List<Pair<String, Long>>> map, Throwable th) {
            super.a(i2, map, th);
            f fVar = this.f32169c;
            if (fVar != null) {
                List<String> list = this.f32170d;
                if (th == null) {
                    th = new Throwable("geckox request intercept");
                }
                fVar.a(list, th);
            }
        }

        C0682b(b bVar, j jVar, f fVar, List list) {
            this.f32167a = bVar;
            this.f32168b = jVar;
            this.f32169c = fVar;
            this.f32170d = list;
        }
    }

    private final com.bytedance.geckox.c a(j jVar) {
        String str;
        String str2;
        MethodCollector.i(7876);
        String str3 = jVar.y;
        a aVar = this.f32164c;
        IResourceLoaderService iResourceLoaderService = this.f32163a;
        if (iResourceLoaderService == null || (str = iResourceLoaderService.c()) == null) {
            str = "";
        }
        com.bytedance.geckox.c a2 = aVar.a(str3, str);
        if (a2 == null) {
            a2 = b(jVar);
            a aVar2 = this.f32164c;
            IResourceLoaderService iResourceLoaderService2 = this.f32163a;
            if (iResourceLoaderService2 == null || (str2 = iResourceLoaderService2.c()) == null) {
                str2 = "";
            }
            l.c(str3, "");
            l.c(str2, "");
            synchronized (aVar2.f32161a) {
                try {
                    Map<String, com.bytedance.geckox.c> map = aVar2.f32161a.get(str2);
                    if (map == null) {
                        map = new LinkedHashMap<>();
                    }
                    map.put(str3, a2);
                    aVar2.f32161a.put(str2, map);
                } finally {
                    MethodCollector.o(7876);
                }
            }
        }
        return a2;
    }

    private final com.bytedance.geckox.c b(j jVar) {
        String str;
        com.bytedance.geckox.k.c aVar;
        com.bytedance.geckox.b.a.a aVar2;
        i a2 = g.b.f32252a.a(this.f32163a);
        Application application = g.b.f32252a.f32250b;
        if (a2.f32631l.length() == 0) {
            str = "000";
        } else {
            str = a2.f32631l;
        }
        String str2 = jVar.y;
        File a3 = a(com.bytedance.ies.bullet.kit.a.a.f.a(a2, str2).getOfflineDir(), com.bytedance.ies.bullet.kit.a.a.f.a(a2, str2).isRelativePath());
        Object networkImpl = com.bytedance.ies.bullet.kit.a.a.f.a(a2, str2).getNetworkImpl();
        if (networkImpl == null) {
            networkImpl = a2.q;
        }
        if (networkImpl instanceof com.bytedance.geckox.k.c) {
            aVar = (com.bytedance.geckox.k.c) networkImpl;
        } else {
            aVar = new com.bytedance.geckox.k.a();
        }
        o oVar = jVar.s;
        if (oVar != null) {
            aVar2 = (com.bytedance.geckox.b.a.a) oVar.a_(com.bytedance.geckox.b.a.a.class);
        } else {
            aVar2 = null;
        }
        try {
            if (application == null) {
                l.a();
            }
            Context applicationContext = application.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
            }
            e.a aVar3 = new e.a(applicationContext);
            aVar3.f29805k = a2.f32626g;
            e.a a4 = aVar3.a(Long.parseLong(a2.f32629j));
            a4.f29803i = a2.f32630k;
            a4.f29795a = aVar;
            a4.f29801g = aVar2;
            a4.f29800f = this.f32166e;
            com.bytedance.ies.bullet.kit.a.a.f.a(g.b.f32252a.a(this.f32163a), jVar.y).getServerMonitor();
            a4.f29807m = a2.f32627h;
            e.a a5 = a4.b(str2).a(str2);
            a5.f29804j = str;
            a5.o = com.bytedance.ies.bullet.kit.a.a.f.a(a2, str2).getLoopCheck();
            a5.f29806l = a3;
            if (aVar2 != null) {
                a5.f29801g = aVar2;
            }
            return com.bytedance.geckox.c.a(a5.b());
        } catch (Exception e2) {
            Log.getStackTraceString(e2);
            return null;
        }
    }

    static final class c implements com.bytedance.geckox.statistic.a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f32171a = new c();

        static {
            Covode.recordClassIndex(18860);
        }

        c() {
        }

        @Override // com.bytedance.geckox.statistic.a
        public final void a(String str, JSONObject jSONObject) {
            TextUtils.isEmpty(str);
        }
    }

    private final File a(String str, boolean z) {
        if (!z) {
            return new File(str);
        }
        if (this.f32165d == null) {
            Application application = g.b.f32252a.f32250b;
            if (application == null) {
                l.a();
            }
            this.f32165d = application.getFilesDir();
        }
        try {
            File file = new File(this.f32165d, str);
            if (file.exists()) {
                return file;
            }
            file.mkdirs();
            return file;
        } catch (Exception unused) {
            return new File(str);
        }
    }

    private static com.bytedance.ies.bullet.service.base.d b(String str, String str2) {
        String str3 = "";
        com.bytedance.ies.bullet.service.base.d dVar = new com.bytedance.ies.bullet.service.base.d(str3, str3);
        if (com.bytedance.ies.bullet.kit.a.a.f.a(str) && com.bytedance.ies.bullet.kit.a.a.f.a(str2)) {
            try {
                Pattern compile = Pattern.compile(str2 + "/(([^/]+)/([^?]*))");
                if (str == null) {
                    str = str3;
                }
                Matcher matcher = compile.matcher(str);
                if (matcher.find() && matcher.groupCount() == 3) {
                    String group = matcher.group(2);
                    String group2 = matcher.group(3);
                    if (com.bytedance.ies.bullet.kit.a.a.f.a(group) && com.bytedance.ies.bullet.kit.a.a.f.a(group2)) {
                        if (group == null) {
                            group = str3;
                        }
                        dVar.a(group);
                        if (group2 != null) {
                            str3 = group2;
                        }
                        dVar.b(str3);
                        dVar.f32587c = true;
                    }
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0161, code lost:
        if (r8 != null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0200, code lost:
        if (r1 != null) goto L_0x0202;
     */
    @Override // com.bytedance.ies.bullet.kit.a.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.bullet.service.base.resourceloader.config.j a(android.net.Uri r13, com.bytedance.ies.bullet.service.base.resourceloader.config.j r14) {
        /*
        // Method dump skipped, instructions count: 555
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.g.a.b.a(android.net.Uri, com.bytedance.ies.bullet.service.base.resourceloader.config.j):com.bytedance.ies.bullet.service.base.resourceloader.config.j");
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.d
    public final Map<String, String> a(String str, String str2) {
        File[] listFiles;
        l.c(str, "");
        l.c(str2, "");
        File a2 = a(str, com.bytedance.ies.bullet.kit.a.a.f.a(g.b.f32252a.a(this.f32163a), str2).isRelativePath());
        File file = new File(a2, str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (file.isDirectory() && file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                l.a((Object) file2, "");
                if (file2.isDirectory()) {
                    String absolutePath = a2.getAbsolutePath();
                    l.a((Object) absolutePath, "");
                    String name = file2.getName();
                    l.a((Object) name, "");
                    Long c2 = c(absolutePath, str2, name);
                    if (c2 != null && c2.longValue() > 0) {
                        File file3 = new File(file2.getAbsolutePath() + File.separator + c2 + File.separator + "res" + File.separator + "preload.json");
                        if (file3.exists() && file3.canRead()) {
                            String name2 = file2.getName();
                            l.a((Object) name2, "");
                            String absolutePath2 = file3.getAbsolutePath();
                            l.a((Object) absolutePath2, "");
                            linkedHashMap.put(name2, absolutePath2);
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static Long c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        try {
            File file = new File(str, str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            String absolutePath = file.getAbsolutePath();
            l.a((Object) absolutePath, "");
            File file2 = new File(absolutePath, str3);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            return m.a(file2);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.d
    public final boolean a_(String str, String str2, String str3) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || a(a(str, com.bytedance.ies.bullet.kit.a.a.f.a(g.b.f32252a.a(this.f32163a), str2).isRelativePath()), str2, str3) == null) {
            return false;
        }
        return true;
    }

    private static String a(File file, String str, String str2) {
        boolean z;
        boolean z2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        if (p.a((CharSequence) str2, "/", 0, false, 6) == 0) {
            if (str2 != null) {
                str2 = str2.substring(1);
                l.a((Object) str2, "");
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        if (p.a((CharSequence) str2, "/") == str2.length() - 1) {
            str2 = str2.substring(0, p.a((CharSequence) str2, "/"));
            l.a((Object) str2, "");
        }
        try {
            File file2 = new File(file, str);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            String absolutePath = file2.getAbsolutePath();
            l.a((Object) absolutePath, "");
            File file3 = new File(absolutePath, str2);
            if (!file3.exists()) {
                file3.mkdirs();
            }
            return com.bytedance.geckox.utils.l.a(file, str, str2);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.a.d
    public final long a(String str, String str2, String str3) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            String absolutePath = a(str, com.bytedance.ies.bullet.kit.a.a.f.a(g.b.f32252a.a(this.f32163a), str2).isRelativePath()).getAbsolutePath();
            l.a((Object) absolutePath, "");
            Long c2 = c(absolutePath, str2, str3);
            if (c2 != null) {
                return c2.longValue();
            }
        }
        return 0;
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.d
    public final String b(String str, String str2, String str3) {
        boolean z;
        boolean z2;
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        boolean z3 = true;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (str3.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (p.a((CharSequence) str3, "/", 0, false, 6) != 0) {
                    return a(a(str, com.bytedance.ies.bullet.kit.a.a.f.a(g.b.f32252a.a(this.f32163a), str2).isRelativePath()), str2, str3);
                }
                StringBuilder sb = new StringBuilder();
                Object[] array = new h.m.l("/").split(str3, 0).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    if (strArr.length <= 1) {
                        return null;
                    }
                    String str4 = strArr[1];
                    int length = strArr.length;
                    for (int i2 = 2; i2 < length; i2++) {
                        sb.append(File.separator).append(strArr[i2]);
                    }
                    if (TextUtils.isEmpty(str4)) {
                        return null;
                    }
                    try {
                        File a2 = a(str, com.bytedance.ies.bullet.kit.a.a.f.a(g.b.f32252a.a(this.f32163a), str2).isRelativePath());
                        if (!a2.exists()) {
                            a2.mkdirs();
                        }
                        String absolutePath = new File(a2, str2).getAbsolutePath();
                        l.a((Object) absolutePath, "");
                        File file = new File(absolutePath, str4);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        String a3 = com.bytedance.geckox.utils.l.a(a2, str2, str4);
                        if (sb.length() <= 0) {
                            z3 = false;
                        }
                        if (z3) {
                            a3 = a3 + sb.toString();
                        }
                        return a3;
                    } catch (Throwable unused) {
                        return null;
                    }
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
        return null;
    }
}
