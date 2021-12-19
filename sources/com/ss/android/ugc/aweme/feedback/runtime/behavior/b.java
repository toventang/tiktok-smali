package com.ss.android.ugc.aweme.feedback.runtime.behavior;

import android.content.Context;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.d;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.e;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.g;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.h;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.j;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.k;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.l;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.m;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.o;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.p;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.q;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.a.n;
import h.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class b implements IRuntimeBehaviorService {

    /* renamed from: a  reason: collision with root package name */
    public static b f95406a = C2291b.f95409a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a> f95407b = n.b(new com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.c(), new p(), new o(), new com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.b(), new f(), new h(), new j(), new k(), new l(), new e(), new g(), new d(), new m(), new q());

    /* renamed from: c  reason: collision with root package name */
    public static final a f95408c = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(60420);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.b$b  reason: collision with other inner class name */
    static final class C2291b {

        /* renamed from: a  reason: collision with root package name */
        static final b f95409a = new b((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final C2291b f95410b = new C2291b();

        private C2291b() {
        }

        static {
            Covode.recordClassIndex(60421);
        }
    }

    private b() {
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f95411a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f95412b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f95413c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f95414d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a f95415e;

        static {
            Covode.recordClassIndex(60422);
        }

        c(b bVar, String str, String str2, long j2, com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a aVar) {
            this.f95411a = bVar;
            this.f95412b = str;
            this.f95413c = str2;
            this.f95414d = j2;
            this.f95415e = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.runtime.behavior.c cVar = new com.ss.android.ugc.aweme.runtime.behavior.c(this.f95412b, this.f95414d, this.f95413c);
            a aVar = a.f95401b;
            h.f.b.l.d(cVar, "");
            aVar.f95403a.i().a(cVar);
            String str = this.f95412b;
            a aVar2 = a.f95401b;
            h.f.b.l.d(str, "");
            aVar2.f95403a.i().b(str, this.f95414d - this.f95415e.b());
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final Map<String, String> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a aVar : f95407b) {
            String c2 = aVar.c();
            if (!TextUtils.isEmpty(c2)) {
                linkedHashMap.put(aVar.a(), c2);
            }
        }
        bj.a("RuntimeBehaviorManager loadResultSize:" + linkedHashMap.size());
        return linkedHashMap;
    }

    static {
        Covode.recordClassIndex(60419);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final boolean a() {
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            h.f.b.l.b(iESSettingsProxy, "");
            Boolean feedbackRecordEnable = iESSettingsProxy.getFeedbackRecordEnable();
            h.f.b.l.b(feedbackRecordEnable, "");
            return feedbackRecordEnable.booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void a(String str) {
        h.f.b.l.d(str, "");
        a(str, "");
    }

    private static com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a b(String str) {
        for (com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a aVar : f95407b) {
            if (aVar.a(str)) {
                return aVar;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void a(Context context) {
        h.f.b.l.d(context, "");
        com.ss.android.ugc.aweme.feedback.reply.a aVar = new com.ss.android.ugc.aweme.feedback.reply.a(context);
        if (aVar.f95389a != null) {
            i.b(new com.ss.android.ugc.aweme.feedback.reply.b(aVar), i.f4824a);
        }
    }

    public static List<com.ss.android.ugc.aweme.runtime.behavior.c> a(String str, long j2) {
        h.f.b.l.d(str, "");
        a aVar = a.f95401b;
        h.f.b.l.d(str, "");
        return aVar.f95403a.i().a(str, j2);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void a(String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        if (a()) {
            long currentTimeMillis = System.currentTimeMillis();
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a b2 = b(str);
            if (b2 != null) {
                i.b(new c(this, str, str2, currentTimeMillis, b2), i.f4824a);
                return;
            }
            throw new RuntimeException(str + " is not support type,please check your code or call zhaoxuan.li");
        }
    }
}
