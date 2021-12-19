package com.bytedance.j.a.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.bullet.service.base.e.d;
import com.bytedance.ies.bullet.service.base.resourceloader.config.a;
import com.bytedance.ies.bullet.service.base.resourceloader.config.e;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import h.a.n;
import h.e.c;
import h.f.b.l;
import h.m.p;
import h.w;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f38950a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static c f38951b;

    private b() {
    }

    static {
        Covode.recordClassIndex(23854);
    }

    private static String a(String str) {
        Uri.Builder path = new Uri.Builder().scheme("local_file").authority("relative").path(str);
        l.a((Object) path, "");
        String uri = path.build().toString();
        l.a((Object) uri, "");
        return uri;
    }

    private static String a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return p.j(str, str2);
    }

    private static String a(a aVar, String str) {
        T t;
        List<String> list = aVar.f38948f;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (p.b(str, (String) t, false)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                int length = t2.length();
                if (str != null) {
                    String substring = str.substring(length);
                    l.a((Object) substring, "");
                    return p.a(substring, '?');
                }
                throw new w("null cannot be cast to non-null type");
            }
        }
        return null;
    }

    public static String a(IResourceLoaderService iResourceLoaderService, Uri uri, o oVar, d dVar) {
        Uri uri2;
        String queryParameter;
        a aVar;
        ap apVar;
        a aVar2;
        a aVar3;
        MethodCollector.i(3552);
        if (uri != null) {
            if (uri.isHierarchical()) {
                uri2 = uri;
            } else {
                uri2 = null;
            }
            if (!(uri2 == null || (queryParameter = uri2.getQueryParameter("groupId")) == null)) {
                String queryParameter2 = uri.getQueryParameter("cardId");
                String queryParameter3 = uri.getQueryParameter("gecko_format");
                j jVar = new j();
                jVar.s = oVar;
                String queryParameter4 = uri.getQueryParameter("accessKey");
                if (queryParameter4 != null) {
                    l.a((Object) queryParameter4, "");
                    jVar.f(queryParameter4);
                }
                jVar.d("sub_source");
                jVar.w = dVar;
                o oVar2 = jVar.s;
                if (oVar2 == null || (aVar = (a) oVar2.a_(a.class)) == null) {
                    aVar = new a(true);
                }
                aVar.a(n.c(e.GECKO, e.BUILTIN));
                jVar.a(aVar);
                c cVar = f38951b;
                if (!(cVar == null || queryParameter2 == null || (aVar3 = cVar.f38953b.get(queryParameter2)) == null)) {
                    String uri3 = uri.toString();
                    l.a((Object) uri3, "");
                    String a2 = a(iResourceLoaderService, aVar3, uri3, queryParameter + "_resource", queryParameter3, jVar);
                    if (a2 != null) {
                        String uri4 = Uri.fromFile(new File(a2)).toString();
                        MethodCollector.o(3552);
                        return uri4;
                    }
                }
                if (iResourceLoaderService != null) {
                    l.a((Object) queryParameter, "");
                    String a3 = a(queryParameter);
                    jVar.a(queryParameter);
                    jVar.d("sub_source");
                    apVar = iResourceLoaderService.loadSync(a3, jVar);
                } else {
                    apVar = null;
                }
                if (apVar != null) {
                    File file = new File(apVar.o + File.separator + "config.json");
                    if (!file.exists()) {
                        file = null;
                    }
                    if (file != null) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            c a4 = d.a(fileInputStream);
                            if (a4 != null) {
                                f38951b = a4;
                                if (!(queryParameter2 == null || (aVar2 = a4.f38953b.get(queryParameter2)) == null)) {
                                    String uri5 = uri.toString();
                                    l.a((Object) uri5, "");
                                    String a5 = a(iResourceLoaderService, aVar2, uri5, queryParameter + "_resource", queryParameter3, jVar);
                                    if (a5 != null) {
                                        String uri6 = Uri.fromFile(new File(a5)).toString();
                                        c.a(fileInputStream, null);
                                        MethodCollector.o(3552);
                                        return uri6;
                                    }
                                }
                            }
                            c.a(fileInputStream, null);
                        } catch (Throwable th) {
                            c.a(fileInputStream, th);
                            MethodCollector.o(3552);
                            throw th;
                        }
                    }
                }
            }
        }
        MethodCollector.o(3552);
        return null;
    }

    private static String a(IResourceLoaderService iResourceLoaderService, a aVar, String str, String str2, String str3, j jVar) {
        String a2 = a(aVar, str);
        if (a2 != null) {
            String a3 = a(a2, str3);
            if (iResourceLoaderService != null) {
                String a4 = a(str2);
                jVar.d("sub_source");
                ap loadSync = iResourceLoaderService.loadSync(a4, jVar);
                if (loadSync != null) {
                    File file = new File(loadSync.o + File.separator + a3);
                    if (file.exists()) {
                        return file.getAbsolutePath();
                    }
                }
            }
        }
        return null;
    }
}
