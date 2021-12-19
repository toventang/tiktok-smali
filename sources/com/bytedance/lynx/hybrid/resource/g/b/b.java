package com.bytedance.lynx.hybrid.resource.g.b;

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
import com.bytedance.lynx.hybrid.resource.b.d;
import com.bytedance.lynx.hybrid.resource.b.f;
import com.bytedance.lynx.hybrid.resource.config.g;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.bytedance.lynx.hybrid.resource.f;
import com.bytedance.lynx.hybrid.resource.h;
import com.bytedance.lynx.hybrid.service.IResourceService;
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

public final class b implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f41188b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    IResourceService f41189a;

    /* renamed from: c  reason: collision with root package name */
    private final a f41190c = new a();

    /* renamed from: d  reason: collision with root package name */
    private File f41191d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.geckox.statistic.a f41192e = c.f41197a;

    static {
        Covode.recordClassIndex(25230);
    }

    @Override // com.bytedance.lynx.hybrid.resource.h
    public final String a() {
        return "2.3.2";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(25231);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.e
    public final boolean a(String str, String str2, String str3) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            String absolutePath = a(str, f.a(f.b.f41155a.a(this.f41189a), str2).isRelativePath()).getAbsolutePath();
            l.a((Object) absolutePath, "");
            if (d(absolutePath, str2, str3) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.e
    public final void a(IResourceService iResourceService) {
        this.f41189a = iResourceService;
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.g.b.b$b  reason: collision with other inner class name */
    public static final class C1005b extends com.bytedance.geckox.f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f41193a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f41194b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f41195c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f41196d;

        static {
            Covode.recordClassIndex(25232);
        }

        private final String b(String str) {
            return this.f41193a.b(com.bytedance.lynx.hybrid.resource.b.f.a(f.b.f41155a.a(this.f41193a.f41189a), this.f41194b.t).getOfflineDir(), this.f41194b.t, str);
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(LocalPackageModel localPackageModel) {
            String str;
            super.a(localPackageModel);
            g gVar = this.f41195c;
            if (gVar != null) {
                List<String> list = this.f41196d;
                if (localPackageModel == null || (str = localPackageModel.getChannel()) == null) {
                    str = this.f41194b.f41111g;
                }
                b(str);
                gVar.a(list);
            }
        }

        @Override // com.bytedance.geckox.f.a
        public final void b(UpdatePackage updatePackage, Throwable th) {
            g gVar = this.f41195c;
            if (gVar != null) {
                List<String> list = this.f41196d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                gVar.a(list, th);
            }
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(UpdatePackage updatePackage, Throwable th) {
            g gVar = this.f41195c;
            if (gVar != null) {
                List<String> list = this.f41196d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                gVar.a(list, th);
            }
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(String str, long j2) {
            l.c(str, "");
            com.bytedance.lynx.hybrid.j.c.a("onUpdateSuccess", com.bytedance.lynx.hybrid.j.b.I, "GeckoXResLoadStrategy");
            b(str);
            g gVar = this.f41195c;
            if (gVar != null) {
                gVar.a(this.f41196d);
            }
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(String str, Throwable th) {
            g gVar = this.f41195c;
            if (gVar != null) {
                List<String> list = this.f41196d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                gVar.a(list, th);
            }
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(Map<String, List<Pair<String, Long>>> map, Throwable th) {
            g gVar = this.f41195c;
            if (gVar != null) {
                List<String> list = this.f41196d;
                if (th == null) {
                    th = new Throwable("geckox update failed");
                }
                gVar.a(list, th);
            }
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
            List<UpdatePackage> list;
            super.a(map, map2);
            List list2 = this.f41196d;
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : list2) {
                if (map2 != null && (list = map2.get(this.f41194b.t)) != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (l.a((Object) next.getChannel(), obj)) {
                            if (next != null) {
                            }
                        }
                    }
                }
                arrayList.add(obj);
            }
            for (String str : arrayList) {
                g gVar = this.f41195c;
                if (gVar != null) {
                    List<String> list3 = this.f41196d;
                    b(str);
                    gVar.a(list3);
                }
            }
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(int i2, Map<String, List<Pair<String, Long>>> map, Throwable th) {
            super.a(i2, map, th);
            g gVar = this.f41195c;
            if (gVar != null) {
                List<String> list = this.f41196d;
                if (th == null) {
                    th = new Throwable("geckox request intercept");
                }
                gVar.a(list, th);
            }
        }

        C1005b(b bVar, j jVar, g gVar, List list) {
            this.f41193a = bVar;
            this.f41194b = jVar;
            this.f41195c = gVar;
            this.f41196d = list;
        }
    }

    private final com.bytedance.geckox.c a(j jVar) {
        String str;
        String str2;
        MethodCollector.i(8964);
        String str3 = jVar.t;
        a aVar = this.f41190c;
        IResourceService iResourceService = this.f41189a;
        if (iResourceService == null || (str = iResourceService.b()) == null) {
            str = "";
        }
        com.bytedance.geckox.c a2 = aVar.a(str3, str);
        if (a2 == null) {
            a2 = b(jVar);
            a aVar2 = this.f41190c;
            IResourceService iResourceService2 = this.f41189a;
            if (iResourceService2 == null || (str2 = iResourceService2.b()) == null) {
                str2 = "";
            }
            l.c(str3, "");
            l.c(str2, "");
            synchronized (aVar2.f41187a) {
                try {
                    Map<String, com.bytedance.geckox.c> map = aVar2.f41187a.get(str2);
                    if (map == null) {
                        map = new LinkedHashMap<>();
                    }
                    map.put(str3, a2);
                    aVar2.f41187a.put(str2, map);
                } finally {
                    MethodCollector.o(8964);
                }
            }
        }
        return a2;
    }

    private final com.bytedance.geckox.c b(j jVar) {
        String c2;
        com.bytedance.geckox.k.c aVar;
        com.bytedance.geckox.b.a.a aVar2;
        long j2;
        com.bytedance.lynx.hybrid.resource.config.c a2 = f.b.f41155a.a(this.f41189a);
        Application application = f.b.f41155a.f41151b;
        if (com.bytedance.lynx.hybrid.resource.config.c.c().length() == 0) {
            c2 = "000";
        } else {
            c2 = com.bytedance.lynx.hybrid.resource.config.c.c();
        }
        String str = jVar.t;
        File a3 = a(com.bytedance.lynx.hybrid.resource.b.f.a(a2, str).getOfflineDir(), com.bytedance.lynx.hybrid.resource.b.f.a(a2, str).isRelativePath());
        Object networkImpl = com.bytedance.lynx.hybrid.resource.b.f.a(a2, str).getNetworkImpl();
        if (networkImpl == null) {
            networkImpl = a2.f41101m;
        }
        if (networkImpl instanceof com.bytedance.geckox.k.c) {
            aVar = (com.bytedance.geckox.k.c) networkImpl;
        } else {
            aVar = new com.bytedance.geckox.k.a();
        }
        com.bytedance.lynx.hybrid.h.a aVar3 = jVar.n;
        if (aVar3 != null) {
            aVar2 = (com.bytedance.geckox.b.a.a) aVar3.a(com.bytedance.geckox.b.a.a.class);
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
            e.a c3 = new e.a(applicationContext).c(a2.f41096h);
            String a4 = com.bytedance.lynx.hybrid.resource.config.c.a();
            if (a4.length() <= 0 || a4 == null) {
                j2 = 0;
            } else {
                j2 = Long.parseLong(a4);
            }
            e.a a5 = c3.a(j2).a(com.bytedance.lynx.hybrid.resource.config.c.b()).a(aVar).a(aVar2).a(this.f41192e);
            com.bytedance.lynx.hybrid.resource.b.f.a(f.b.f41155a.a(this.f41189a), jVar.t).getServerMonitor();
            e.a a6 = a5.a().d(com.bytedance.lynx.hybrid.resource.config.c.d()).b(str).a(str).b(c2).a(com.bytedance.lynx.hybrid.resource.b.f.a(a2, str).getLoopCheck()).a(a3);
            if (aVar2 != null) {
                a6.a(aVar2);
            }
            return com.bytedance.geckox.c.a(a6.b());
        } catch (Exception e2) {
            com.bytedance.lynx.hybrid.j.c.a("registerGeckoClientSpi: " + Log.getStackTraceString(e2), com.bytedance.lynx.hybrid.j.b.E, "Gecko");
            return null;
        }
    }

    static final class c implements com.bytedance.geckox.statistic.a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f41197a = new c();

        static {
            Covode.recordClassIndex(25233);
        }

        c() {
        }

        @Override // com.bytedance.geckox.statistic.a
        public final void a(String str, JSONObject jSONObject) {
            if (!TextUtils.isEmpty(str) && jSONObject != null) {
                com.bytedance.lynx.hybrid.j.c.a("event:" + str + ",data:" + jSONObject, com.bytedance.lynx.hybrid.j.b.D, "GeckoXDepender");
            }
        }
    }

    private final File a(String str, boolean z) {
        if (!z) {
            return new File(str);
        }
        if (this.f41191d == null) {
            Application application = f.b.f41155a.f41151b;
            if (application == null) {
                l.a();
            }
            this.f41191d = application.getFilesDir();
        }
        try {
            File file = new File(this.f41191d, str);
            if (file.exists()) {
                return file;
            }
            file.mkdirs();
            return file;
        } catch (Exception unused) {
            return new File(str);
        }
    }

    private static com.bytedance.lynx.hybrid.resource.d.a b(String str, String str2) {
        com.bytedance.lynx.hybrid.resource.d.a aVar = new com.bytedance.lynx.hybrid.resource.d.a("", "", false);
        if (com.bytedance.lynx.hybrid.resource.b.f.a(str) && com.bytedance.lynx.hybrid.resource.b.f.a(str2)) {
            try {
                Pattern compile = Pattern.compile(str2 + "/(([^/]+)/([^?]*))");
                if (str == null) {
                    str = "";
                }
                Matcher matcher = compile.matcher(str);
                if (matcher.find() && matcher.groupCount() == 3) {
                    String group = matcher.group(2);
                    String group2 = matcher.group(3);
                    if (com.bytedance.lynx.hybrid.resource.b.f.a(group) && com.bytedance.lynx.hybrid.resource.b.f.a(group2)) {
                        if (group == null) {
                            group = "";
                        }
                        l.c(group, "");
                        aVar.f41119a = group;
                        if (group2 == null) {
                            group2 = "";
                        }
                        l.c(group2, "");
                        aVar.f41120b = group2;
                        aVar.f41121c = true;
                    }
                }
            } catch (Exception e2) {
                com.bytedance.lynx.hybrid.j.c.a("ChannelBundleModel parse error: " + e2.getMessage(), com.bytedance.lynx.hybrid.j.b.W, "GeckoXDepender");
            }
        }
        return aVar;
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.e
    public final Map<String, String> a(String str, String str2) {
        File[] listFiles;
        l.c(str, "");
        l.c(str2, "");
        File a2 = a(str, com.bytedance.lynx.hybrid.resource.b.f.a(f.b.f41155a.a(this.f41189a), str2).isRelativePath());
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
                    Long d2 = d(absolutePath, str2, name);
                    if (d2 != null && d2.longValue() > 0) {
                        File file3 = new File(file2.getAbsolutePath() + File.separator + d2 + File.separator + "res" + File.separator + "preload.json");
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

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0161, code lost:
        if (r1 != null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d6, code lost:
        if (r1 != null) goto L_0x01d8;
     */
    @Override // com.bytedance.lynx.hybrid.resource.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.lynx.hybrid.resource.config.j a(android.net.Uri r13, com.bytedance.lynx.hybrid.resource.config.j r14) {
        /*
        // Method dump skipped, instructions count: 513
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.resource.g.b.b.a(android.net.Uri, com.bytedance.lynx.hybrid.resource.config.j):com.bytedance.lynx.hybrid.resource.config.j");
    }

    @Override // com.bytedance.lynx.hybrid.resource.h
    public final long c(String str, String str2, String str3) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            String absolutePath = a(str, com.bytedance.lynx.hybrid.resource.b.f.a(f.b.f41155a.a(this.f41189a), str2).isRelativePath()).getAbsolutePath();
            l.a((Object) absolutePath, "");
            Long d2 = d(absolutePath, str2, str3);
            if (d2 != null) {
                return d2.longValue();
            }
        }
        return 0;
    }

    private static Long d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        com.bytedance.lynx.hybrid.j.c.a("getLatestChannelVersion:rootdir:" + str + ",accessKey:" + str2 + ",channel:" + str3, com.bytedance.lynx.hybrid.j.b.D, "GeckoXDepender");
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
            Long a2 = m.a(file2);
            com.bytedance.lynx.hybrid.j.c.a("getLatestChannelVersion:".concat(String.valueOf(a2)), com.bytedance.lynx.hybrid.j.b.D, "GeckoXDepender");
            return a2;
        } catch (Throwable unused) {
            com.bytedance.lynx.hybrid.j.c.a("getLatestChannelVersion:error", com.bytedance.lynx.hybrid.j.b.D, "GeckoXDepender");
            return null;
        }
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
            Long a2 = m.a(file3);
            if (a2 == null) {
                return null;
            }
            String str3 = absolutePath + File.separator + str2 + File.separator + a2.longValue() + File.separator + "res";
            com.bytedance.lynx.hybrid.j.c.a("getChannelPath:".concat(String.valueOf(str3)), com.bytedance.lynx.hybrid.j.b.D, "GeckoXDepender");
            return str3;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.e
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
                    return a(a(str, com.bytedance.lynx.hybrid.resource.b.f.a(f.b.f41155a.a(this.f41189a), str2).isRelativePath()), str2, str3);
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
                        File file = new File(a(str, com.bytedance.lynx.hybrid.resource.b.f.a(f.b.f41155a.a(this.f41189a), str2).isRelativePath()), str2);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        String absolutePath = file.getAbsolutePath();
                        l.a((Object) absolutePath, "");
                        File file2 = new File(absolutePath, str4);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        Long a2 = m.a(file2);
                        if (a2 == null) {
                            return null;
                        }
                        String str5 = absolutePath + File.separator + str4 + File.separator + a2.longValue() + File.separator + "res";
                        if (sb.length() <= 0) {
                            z3 = false;
                        }
                        if (z3) {
                            str5 = str5 + sb.toString();
                        }
                        com.bytedance.lynx.hybrid.j.c.a("getRnResPath:".concat(String.valueOf(str5)), com.bytedance.lynx.hybrid.j.b.D, "GeckoXDepender");
                        return str5;
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

    @Override // com.bytedance.lynx.hybrid.resource.config.e
    public final void a(j jVar, List<String> list, g gVar) {
        l.c(jVar, "");
        l.c(list, "");
        C1005b bVar = new C1005b(this, jVar, gVar, list);
        com.bytedance.geckox.c a2 = a(jVar);
        if (a2 != null) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new CheckRequestBodyModel.TargetChannel(list.get(0)));
            hashMap.put(jVar.t, arrayList);
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            String str = jVar.t;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String businessVersion = com.bytedance.lynx.hybrid.resource.b.f.a(f.b.f41155a.a(this.f41189a), str).getBusinessVersion();
            if (businessVersion == null) {
                businessVersion = com.bytedance.lynx.hybrid.resource.config.c.b();
            }
            linkedHashMap2.put("business_version", businessVersion);
            linkedHashMap.put(str, linkedHashMap2);
            OptionCheckUpdateParams listener = optionCheckUpdateParams.setCustomParam(linkedHashMap).setListener(bVar);
            if ((jVar instanceof d) && ((d) jVar).z == 1) {
                l.a((Object) listener, "");
                listener.setChannelUpdatePriority(3);
            }
            l.a((Object) listener, "");
            a2.a((String) null, hashMap, listener);
        } else if (gVar != null) {
            gVar.a(list, new Throwable("GeckoXClient is null"));
        }
    }
}
