package com.ss.android.ugc.aweme.request_combine.request;

import android.content.Context;
import b.i;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.ee;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.CollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.ss.android.ugc.aweme.request_combine.c.b;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import com.ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer;
import com.ss.android.ugc.aweme.utils.dw;
import com.ss.android.ugc.aweme.utils.fr;
import com.ss.android.ugc.aweme.utils.in;
import f.a.d.g;
import f.a.z;
import h.f.b.l;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class c implements IColdLaunchRequestCombiner {

    /* renamed from: a  reason: collision with root package name */
    static SettingCombineModel f120646a;

    /* renamed from: b  reason: collision with root package name */
    static ArrayList<com.ss.android.ugc.aweme.requestcombine.a> f120647b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public static HashMap<String, b> f120648c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public static final c f120649d = new c();

    private c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.c$c  reason: collision with other inner class name */
    public static final class RunnableC3117c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.b f120655a;

        static {
            Covode.recordClassIndex(78581);
        }

        RunnableC3117c(f.b bVar) {
            this.f120655a = bVar;
        }

        public final void run() {
            this.f120655a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.requestcombine.a f120656a;

        static {
            Covode.recordClassIndex(78582);
        }

        d(com.ss.android.ugc.aweme.requestcombine.a aVar) {
            this.f120656a = aVar;
        }

        public final void run() {
            this.f120656a.a();
        }
    }

    public static final class f implements z<SettingCombineModel> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f120658a;

        static {
            Covode.recordClassIndex(78584);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        static final class a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f120659a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f120660b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f120661c;

            static {
                Covode.recordClassIndex(78585);
            }

            a(f fVar, String str, int i2) {
                this.f120659a = fVar;
                this.f120660b = str;
                this.f120661c = i2;
            }

            private static boolean a() {
                try {
                    return f.a.f68431a.c();
                } catch (Exception unused) {
                    return false;
                }
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                if (!j.f107229h || !j.b() || j.c()) {
                    j.f107229h = a();
                }
                if (j.f107229h) {
                    com.bytedance.apm.b.a("combine_settings_monitor_service", 1, new com.ss.android.ugc.aweme.app.f.c().a("errorDesc", this.f120660b).a("requestCount", Integer.valueOf(this.f120661c)).a());
                }
                return h.z.f158842a;
            }
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f120662a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SettingCombineModel f120663b;

            static {
                Covode.recordClassIndex(78586);
            }

            b(f fVar, SettingCombineModel settingCombineModel) {
                this.f120662a = fVar;
                this.f120663b = settingCombineModel;
            }

            public final void run() {
                com.ss.android.ugc.aweme.request_combine.b.a.a(com.ss.android.ugc.aweme.request_combine.b.b.SETTINGS_COMBINE_API_FINISH);
                c.a(this.f120662a.f120658a, this.f120663b);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.request_combine.request.c$f$c  reason: collision with other inner class name */
        static final class RunnableC3118c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f120664a;

            static {
                Covode.recordClassIndex(78587);
            }

            RunnableC3118c(int i2) {
                this.f120664a = i2;
            }

            public final void run() {
                i.b(new Callable(this) {
                    /* class com.ss.android.ugc.aweme.request_combine.request.c.f.RunnableC3118c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ RunnableC3118c f120665a;

                    static {
                        Covode.recordClassIndex(78588);
                    }

                    {
                        this.f120665a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        com.bytedance.apm.b.a("combine_settings_monitor_service", 0, new com.ss.android.ugc.aweme.app.f.c().a("requestCount", Integer.valueOf(this.f120665a.f120664a)).a());
                        return h.z.f158842a;
                    }
                }, r.a());
            }
        }

        static final class d<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f120666a;

            static {
                Covode.recordClassIndex(78589);
            }

            d(int i2) {
                this.f120666a = i2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                com.bytedance.apm.b.a("combine_settings_monitor_service", 0, new com.ss.android.ugc.aweme.app.f.c().a("requestCount", Integer.valueOf(this.f120666a)).a());
                return h.z.f158842a;
            }
        }

        public f(Context context) {
            this.f120658a = context;
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
            com.ss.android.ugc.aweme.request_combine.b.a.a(com.ss.android.ugc.aweme.request_combine.b.b.SETTINGS_COMBINE_API_START);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            com.ss.android.ugc.aweme.request_combine.b.a.a(com.ss.android.ugc.aweme.request_combine.b.b.SETTINGS_COMBINE_API_FINISH);
            if ((th instanceof com.bytedance.frameworks.baselib.network.http.cronet.b.c) && ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) th).getStatusCode() == 509) {
                return;
            }
            if (!(th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) || ((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode() != 509) {
                f.b bVar = new f.b();
                for (b bVar2 : c.f120648c.values()) {
                    bVar2.a(bVar);
                }
                bVar.a();
                Iterator<T> it = c.f120647b.iterator();
                while (it.hasNext()) {
                    it.next().a(th);
                }
                i.b(new a(this, th.getMessage(), c.f120648c.size()), r.a());
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(SettingCombineModel settingCombineModel) {
            SettingCombineModel settingCombineModel2 = settingCombineModel;
            l.d(settingCombineModel2, "");
            if (com.ss.android.ugc.aweme.experiment.b.f89588c) {
                fr.a((long) InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
            if (ee.f89901a) {
                fr.c(3000);
            }
            if (ee.f89902b) {
                com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(new b(this, settingCombineModel2), 16);
                com.bytedance.aweme.b.a.f25788b.f25790a.post(new RunnableC3118c(c.f120648c.size()));
                return;
            }
            com.ss.android.ugc.aweme.request_combine.b.a.a(com.ss.android.ugc.aweme.request_combine.b.b.SETTINGS_COMBINE_API_FINISH);
            c.a(this.f120658a, settingCombineModel2);
            i.b(new d(c.f120648c.size()), r.a());
        }
    }

    private static boolean b() {
        try {
            com.ss.android.ugc.aweme.base.utils.f fVar = f.a.f68431a;
            l.b(fVar, "");
            return fVar.c();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f120650a;

        static {
            Covode.recordClassIndex(78579);
        }

        a(Context context) {
            this.f120650a = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Keva repoFromSp = Keva.getRepoFromSp(this.f120650a, "setting_repo_sp", 0);
            if (repoFromSp == null) {
                return null;
            }
            repoFromSp.storeInt("key_has_local_cache", 1);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f120651a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.b f120652b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f120653c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f120654d;

        static {
            Covode.recordClassIndex(78580);
        }

        b(b bVar, f.b bVar2, Context context, String str) {
            this.f120651a = bVar;
            this.f120652b = bVar2;
            this.f120653c = context;
            this.f120654d = str;
        }

        public final void run() {
            Integer num;
            if (!this.f120651a.a(c.f120646a)) {
                com.ss.android.ugc.aweme.request_combine.a b2 = this.f120651a.b();
                if (b2 == null || b2.httpCode != 509) {
                    this.f120651a.a(this.f120652b);
                    String str = this.f120654d;
                    l.b(str, "");
                    com.ss.android.ugc.aweme.request_combine.a b3 = this.f120651a.b();
                    if (b3 != null) {
                        num = Integer.valueOf(b3.httpCode);
                    } else {
                        num = null;
                    }
                    c.a(str, num);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final boolean a() {
        return com.ss.android.ugc.aweme.request_combine.a.a.a();
    }

    static {
        Covode.recordClassIndex(78578);
        if (com.bytedance.ies.abmock.j.a().c()) {
            a(new l());
        } else {
            a(new g());
            a(new f());
        }
        if (!in.e()) {
            a(new h());
        }
        a(new j());
        a(new k());
        a(new m());
        a(new e());
        a(new d());
        if (b.a.f120618a) {
            a(new i());
        }
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final void a(com.ss.android.ugc.aweme.requestcombine.a aVar) {
        if (aVar != null) {
            f120647b.add(aVar);
        }
    }

    private static void a(b bVar) {
        String a2 = bVar.a();
        if (a2 != null) {
            f120648c.put(a2, bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final com.ss.android.ugc.aweme.request_combine.a a(String str) {
        l.d(str, "");
        b bVar = f120648c.get(str);
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    public static final class e<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final e f120657a = new e();

        static {
            Covode.recordClassIndex(78583);
        }

        e() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            T t;
            String str;
            u uVar = (u) obj;
            l.d(uVar, "");
            com.google.gson.g a2 = dw.a();
            a2.a(new CollectionTypeAdapterFactory());
            a2.a(new MusicTypeAdapterFactory());
            a2.a(new UserTypeAdapterFactory());
            a2.a((Type) com.ss.android.ugc.aweme.sticker.model.a.class, (Object) new BackgroundVideoDeserializer());
            a2.a(new BaseResponseObjectTypeAdapterFactory());
            com.ss.android.ugc.aweme.base.api.a aVar = (com.ss.android.ugc.aweme.base.api.a) a2.b().a((String) uVar.f42630b, (Class) SettingCombineModel.class);
            List<com.bytedance.retrofit2.client.b> list = uVar.f42629a.f42476d;
            l.b(list, "");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                l.b(t2, "");
                if (l.a((Object) t2.f42471a, (Object) "x-tt-logid")) {
                    break;
                }
            }
            T t3 = t;
            if (!(t3 == null || (str = t3.f42472b) == null)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("x-tt-logid", str);
                com.bytedance.retrofit2.client.c cVar = uVar.f42629a;
                l.b(cVar, "");
                String str2 = cVar.f42473a;
                l.b(str2, "");
                linkedHashMap.put("url", str2);
                ISettingRequestExtraInfo a3 = SettingRequestExtraInfoImpl.a();
                if (a3 != null) {
                    a3.a(linkedHashMap);
                }
            }
            aVar.checkValid();
            return aVar;
        }
    }

    public static void a(String str, Integer num) {
        if (b()) {
            com.bytedance.apm.b.a("combine_settings_monitor_service", 2, new com.ss.android.ugc.aweme.app.f.c().a("errorCode", num).a("url", str).a());
        }
    }

    public static void a(Context context, SettingCombineModel settingCombineModel) {
        com.ss.android.ugc.aweme.request_combine.a b2;
        Integer num;
        if (ee.f89902b) {
            System.currentTimeMillis();
            i.b(new a(context), r.a());
            f120646a = settingCombineModel;
            f.b bVar = new f.b();
            for (Map.Entry<String, b> entry : f120648c.entrySet()) {
                com.bytedance.aweme.b.a.f25788b.f25790a.post(new b(entry.getValue(), bVar, context, entry.getKey()));
            }
            com.bytedance.aweme.b.a.f25788b.f25790a.post(new RunnableC3117c(bVar));
            Iterator<T> it = f120647b.iterator();
            while (it.hasNext()) {
                com.bytedance.aweme.b.a.f25788b.f25790a.post(new d(it.next()));
            }
            return;
        }
        System.currentTimeMillis();
        Keva repoFromSp = Keva.getRepoFromSp(context, "setting_repo_sp", 0);
        if (repoFromSp != null) {
            repoFromSp.storeInt("key_has_local_cache", 1);
        }
        f120646a = settingCombineModel;
        f.b bVar2 = new f.b();
        for (Map.Entry<String, b> entry2 : f120648c.entrySet()) {
            String key = entry2.getKey();
            b value = entry2.getValue();
            if (!value.a(f120646a) && ((b2 = value.b()) == null || b2.httpCode != 509)) {
                value.a(bVar2);
                l.b(key, "");
                com.ss.android.ugc.aweme.request_combine.a b3 = value.b();
                if (b3 != null) {
                    num = Integer.valueOf(b3.httpCode);
                } else {
                    num = null;
                }
                a(key, num);
            }
        }
        bVar2.a();
        Iterator<T> it2 = f120647b.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
    }
}
