package com.bytedance.webx;

import android.content.Context;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.a.a;
import com.bytedance.webx.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static b f45997a;

    /* renamed from: i  reason: collision with root package name */
    private static Context f45998i;

    /* renamed from: j  reason: collision with root package name */
    private static Map<String, List<Pair<Class<? extends f>, d>>> f45999j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private static Map<String, Map<Class<? extends f>, h>> f46000k = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public String f46001b;

    /* renamed from: c  reason: collision with root package name */
    public Class<? extends f> f46002c;

    /* renamed from: d  reason: collision with root package name */
    public LinkedHashSet<Class<? extends a>> f46003d;

    /* renamed from: e  reason: collision with root package name */
    public LinkedHashSet<Class<? extends a>> f46004e;

    /* renamed from: f  reason: collision with root package name */
    public LinkedHashSet<c> f46005f;

    /* renamed from: g  reason: collision with root package name */
    public HashMap<Class<? extends a>, LinkedHashSet<c>> f46006g;

    /* renamed from: h  reason: collision with root package name */
    public HashSet<a.b> f46007h;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f46015a;

        static {
            Covode.recordClassIndex(28134);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(28135);
        }

        void a(a aVar);
    }

    public static abstract class d {

        /* renamed from: b  reason: collision with root package name */
        public Class f46034b;

        static {
            Covode.recordClassIndex(28136);
        }

        /* access modifiers changed from: protected */
        public abstract void a(a aVar);
    }

    static {
        Covode.recordClassIndex(28131);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        LinkedHashSet<Class<? extends a>> f46008a = new LinkedHashSet<>();

        /* renamed from: b  reason: collision with root package name */
        LinkedHashSet<Class<? extends a>> f46009b = new LinkedHashSet<>();

        /* renamed from: c  reason: collision with root package name */
        LinkedHashSet<c> f46010c = new LinkedHashSet<>();

        /* renamed from: d  reason: collision with root package name */
        HashMap<Class<? extends a>, LinkedHashSet<c>> f46011d = new HashMap<>();

        /* renamed from: e  reason: collision with root package name */
        HashSet<a.b> f46012e = new HashSet<>();

        /* renamed from: com.bytedance.webx.h$a$a  reason: collision with other inner class name */
        public interface AbstractC1142a {
            static {
                Covode.recordClassIndex(28133);
            }

            String a();
        }

        static {
            Covode.recordClassIndex(28132);
        }

        public final a a(Class<? extends a> cls) {
            LinkedHashSet<Class<? extends a>> linkedHashSet;
            if (e.b.class.isAssignableFrom(cls)) {
                linkedHashSet = this.f46008a;
            } else if (e.a.class.isAssignableFrom(cls)) {
                linkedHashSet = this.f46009b;
            } else {
                throw new Error();
            }
            linkedHashSet.add(cls);
            return this;
        }
    }

    public static void a(Context context) {
        if (f45998i == null) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            f45998i = applicationContext;
            f45997a = new b();
        }
    }

    public static h a(String str, Class<? extends f> cls) {
        MethodCollector.i(8874);
        Map<Class<? extends f>, h> map = f46000k.get(str);
        if (map == null) {
            synchronized (h.class) {
                try {
                    map = f46000k.get(str);
                    if (map == null) {
                        map = new Hashtable<>();
                        f46000k.put(str, map);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8874);
                    throw th;
                }
            }
        }
        h hVar = map.get(cls);
        if (hVar != null) {
            MethodCollector.o(8874);
            return hVar;
        }
        synchronized (h.class) {
            try {
                h hVar2 = map.get(cls);
                if (hVar2 != null) {
                    return hVar2;
                }
                a aVar = new a();
                List<Pair<Class<? extends f>, d>> list = f45999j.get(str);
                if (list == null) {
                    MethodCollector.o(8874);
                    return null;
                }
                for (Pair<Class<? extends f>, d> pair : list) {
                    if (((Class) pair.first).equals(cls)) {
                        d dVar = (d) pair.second;
                        dVar.f46034b = cls;
                        dVar.a(aVar);
                        dVar.f46034b = null;
                    }
                }
                h hVar3 = new h(str, cls, aVar.f46008a, aVar.f46009b, (byte) 0);
                hVar3.f46005f = aVar.f46010c;
                hVar3.f46006g = aVar.f46011d;
                hVar3.f46007h = aVar.f46012e;
                map.put(cls, hVar3);
                MethodCollector.o(8874);
                return hVar3;
            } finally {
                MethodCollector.o(8874);
            }
        }
    }

    public static <T extends f> void a(String str, Class<T> cls, d dVar) {
        MethodCollector.i(8873);
        List<Pair<Class<? extends f>, d>> list = f45999j.get(str);
        if (list == null) {
            synchronized (h.class) {
                try {
                    list = f45999j.get(str);
                    if (list == null) {
                        list = new ArrayList<>();
                        f45999j.put(str, list);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8873);
                    throw th;
                }
            }
        }
        Pair<Class<? extends f>, d> pair = new Pair<>(cls, dVar);
        synchronized (h.class) {
            try {
                list.add(pair);
            } finally {
                MethodCollector.o(8873);
            }
        }
    }

    private <T extends f> h(String str, Class<T> cls, LinkedHashSet<Class<? extends a>> linkedHashSet, LinkedHashSet<Class<? extends a>> linkedHashSet2) {
        this.f46001b = str;
        this.f46002c = cls;
        this.f46003d = linkedHashSet;
        this.f46004e = linkedHashSet2;
    }

    private /* synthetic */ h(String str, Class cls, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, byte b2) {
        this(str, cls, linkedHashSet, linkedHashSet2);
    }
}
