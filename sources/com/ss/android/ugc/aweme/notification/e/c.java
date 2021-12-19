package com.ss.android.ugc.aweme.notification.e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ba;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.common.ac;
import com.ss.android.ugc.aweme.common.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.hl;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.q;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c implements IAccountUserService.a {

    /* renamed from: a  reason: collision with root package name */
    public static final d f113394a = new d((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final c f113395b;

    /* renamed from: c  reason: collision with root package name */
    private static final h f113396c = i.a((h.f.a.a) e.f113431a);

    /* renamed from: d  reason: collision with root package name */
    private static HandlerC2905c f113397d;

    /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c  reason: collision with other inner class name */
    public static final class HandlerC2905c extends Handler implements com.ss.android.ugc.aweme.notice.api.services.a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f113402c = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public boolean f113403a;

        /* renamed from: b  reason: collision with root package name */
        public final String f113404b;

        /* renamed from: d  reason: collision with root package name */
        private final h.h f113405d = h.i.a((h.f.a.a) f.f113413a);

        /* renamed from: e  reason: collision with root package name */
        private final h.h f113406e = h.i.a((h.f.a.a) g.f113414a);

        /* renamed from: f  reason: collision with root package name */
        private final h.h f113407f = h.i.a((h.f.a.a) l.f113422a);

        /* renamed from: g  reason: collision with root package name */
        private final h.h f113408g = h.i.a((h.f.a.a) b.f113412a);

        /* renamed from: h  reason: collision with root package name */
        private final h.h f113409h = h.i.a((h.f.a.a) m.f113423a);

        /* renamed from: i  reason: collision with root package name */
        private final h.h f113410i = h.i.a((h.f.a.a) o.f113424a);

        /* renamed from: j  reason: collision with root package name */
        private final h.h f113411j = h.i.a((h.f.a.a) k.f113421a);

        static {
            Covode.recordClassIndex(72914);
        }

        public final LruCache<String, b> b() {
            return (LruCache) this.f113405d.getValue();
        }

        public final LruCache<String, b> c() {
            return (LruCache) this.f113406e.getValue();
        }

        public final LruCache<String, b> d() {
            return (LruCache) this.f113407f.getValue();
        }

        public final LruCache<String, Integer> e() {
            return (LruCache) this.f113408g.getValue();
        }

        public final CopyOnWriteArrayList<a> f() {
            return (CopyOnWriteArrayList) this.f113409h.getValue();
        }

        public final CopyOnWriteArraySet<String> g() {
            return (CopyOnWriteArraySet) this.f113410i.getValue();
        }

        public final CopyOnWriteArraySet<String> h() {
            return (CopyOnWriteArraySet) this.f113411j.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$a */
        public static final class a {
            static {
                Covode.recordClassIndex(72916);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$b */
        static final class b extends h.f.b.m implements h.f.a.a<LruCache<String, Integer>> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f113412a = new b();

            static {
                Covode.recordClassIndex(72917);
            }

            b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LruCache<String, Integer> invoke() {
                return new LruCache(50);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$f */
        static final class f extends h.f.b.m implements h.f.a.a<LruCache<String, b>> {

            /* renamed from: a  reason: collision with root package name */
            public static final f f113413a = new f();

            static {
                Covode.recordClassIndex(72921);
            }

            f() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LruCache<String, b> invoke() {
                return new LruCache(12);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$k */
        static final class k extends h.f.b.m implements h.f.a.a<CopyOnWriteArraySet<String>> {

            /* renamed from: a  reason: collision with root package name */
            public static final k f113421a = new k();

            static {
                Covode.recordClassIndex(72930);
            }

            k() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ CopyOnWriteArraySet<String> invoke() {
                return new CopyOnWriteArraySet();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$m */
        static final class m extends h.f.b.m implements h.f.a.a<CopyOnWriteArrayList<a>> {

            /* renamed from: a  reason: collision with root package name */
            public static final m f113423a = new m();

            static {
                Covode.recordClassIndex(72932);
            }

            m() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ CopyOnWriteArrayList<a> invoke() {
                return new CopyOnWriteArrayList();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$o */
        static final class o extends h.f.b.m implements h.f.a.a<CopyOnWriteArraySet<String>> {

            /* renamed from: a  reason: collision with root package name */
            public static final o f113424a = new o();

            static {
                Covode.recordClassIndex(72934);
            }

            o() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ CopyOnWriteArraySet<String> invoke() {
                return new CopyOnWriteArraySet();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$g */
        static final class g extends h.f.b.m implements h.f.a.a<LruCache<String, b>> {

            /* renamed from: a  reason: collision with root package name */
            public static final g f113414a = new g();

            static {
                Covode.recordClassIndex(72922);
            }

            g() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LruCache<String, b> invoke() {
                return new LruCache(c.a().f113428d);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$l */
        static final class l extends h.f.b.m implements h.f.a.a<LruCache<String, b>> {

            /* renamed from: a  reason: collision with root package name */
            public static final l f113422a = new l();

            static {
                Covode.recordClassIndex(72931);
            }

            l() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LruCache<String, b> invoke() {
                return new LruCache(c.a().f113429e);
            }
        }

        public final b.i<z> i() {
            return d.a(new h(this));
        }

        public final b.i<z> j() {
            return d.a(new C2906c(this));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$c  reason: collision with other inner class name */
        public static final class C2906c extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ HandlerC2905c this$0;

            static {
                Covode.recordClassIndex(72918);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2906c(HandlerC2905c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                HandlerC2905c.a(this.this$0.c());
                HandlerC2905c.a(this.this$0.d());
                this.this$0.c().size();
                this.this$0.d().size();
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        public final Keva a() {
            return Keva.getRepo("preload_notice_video_" + this.f113404b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$d */
        public static final class d extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ BaseNotice $notice;
            final /* synthetic */ HandlerC2905c this$0;

            static {
                Covode.recordClassIndex(72919);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(HandlerC2905c cVar, BaseNotice baseNotice) {
                super(0);
                this.this$0 = cVar;
                this.$notice = baseNotice;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                int i2;
                BaseNotice baseNotice = this.$notice;
                if (baseNotice != null && HandlerC2905c.a(baseNotice)) {
                    String c2 = HandlerC2905c.c(this.$notice);
                    if (hl.a(c2)) {
                        Integer num = this.this$0.e().get(c2);
                        if (num != null) {
                            i2 = num.intValue();
                        } else {
                            i2 = 0;
                        }
                        this.this$0.e().put(c2, Integer.valueOf(i2 + 1));
                        HandlerC2905c cVar = this.this$0;
                        try {
                            cVar.a().storeString("notice_click_times", dg.a().b(cVar.e().snapshot()));
                            q.m223constructorimpl(0);
                        } catch (Throwable th) {
                            q.m223constructorimpl(r.a(th));
                        }
                    }
                }
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$h */
        public static final class h extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ HandlerC2905c this$0;

            static {
                Covode.recordClassIndex(72923);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            h(HandlerC2905c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                com.ss.android.ugc.aweme.common.f.b("NoticeVideoManager", "release:" + this.this$0.f113404b);
                this.this$0.b().evictAll();
                this.this$0.c().evictAll();
                this.this$0.d().evictAll();
                this.this$0.e().evictAll();
                this.this$0.f().clear();
                this.this$0.g().clear();
                this.this$0.h().clear();
                this.this$0.f113403a = false;
                this.this$0.removeCallbacksAndMessages(null);
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$e */
        public static final class e extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ BaseNotice $notice;
            final /* synthetic */ int $position;
            final /* synthetic */ HandlerC2905c this$0;

            static {
                Covode.recordClassIndex(72920);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(HandlerC2905c cVar, BaseNotice baseNotice, int i2) {
                super(0);
                this.this$0 = cVar;
                this.$notice = baseNotice;
                this.$position = i2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
                if (r2 < com.ss.android.ugc.aweme.notification.e.c.a().f113427c) goto L_0x000a;
             */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ h.z invoke() {
                /*
                // Method dump skipped, instructions count: 249
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.e.c.HandlerC2905c.e.invoke():java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$i */
        static final class i extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ HandlerC2905c this$0;

            static {
                Covode.recordClassIndex(72924);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            i(HandlerC2905c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                final List k2;
                if (this.this$0.g().isEmpty()) {
                    com.ss.android.ugc.aweme.common.f.b("NoticeVideoManager", "requestData but aid list empty");
                } else {
                    List g2 = h.a.n.g((Collection) this.this$0.g());
                    List g3 = h.a.n.g((Collection) g2);
                    this.this$0.g().clear();
                    this.this$0.h().addAll(g2);
                    ArrayList arrayList = new ArrayList();
                    while (!g2.isEmpty()) {
                        if (g2.size() >= 10) {
                            k2 = h.a.n.k(g2.subList(0, 10));
                        } else {
                            k2 = h.a.n.k(g2);
                        }
                        g2.removeAll(k2);
                        t b2 = t.a(new j(k2)).b(f.a.h.a.b(f.a.k.a.f158006c));
                        h.f.b.l.b(b2, "");
                        t d2 = b2.d(new f.a.d.g(this) {
                            /* class com.ss.android.ugc.aweme.notification.e.c.HandlerC2905c.i.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ i f113415a;

                            static {
                                Covode.recordClassIndex(72925);
                            }

                            {
                                this.f113415a = r1;
                            }

                            @Override // f.a.d.g
                            public final /* synthetic */ Object apply(Object obj) {
                                h.f.b.l.d(obj, "");
                                this.f113415a.this$0.h().removeAll(k2);
                                return obj;
                            }
                        });
                        h.f.b.l.b(d2, "");
                        arrayList.add(d2);
                    }
                    com.ss.android.ugc.aweme.common.f.b("NoticeVideoManager", "requestData, aids:" + g3 + ", requests:" + arrayList.size());
                    t.a(arrayList).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new f.a.d.f(this) {
                        /* class com.ss.android.ugc.aweme.notification.e.c.HandlerC2905c.i.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ i f113417a;

                        static {
                            Covode.recordClassIndex(72926);
                        }

                        {
                            this.f113417a = r1;
                        }

                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Object obj) {
                            List<? extends Aweme> list = (List) obj;
                            StringBuilder sb = new StringBuilder("requestData onNext:");
                            h.f.b.l.b(list, "");
                            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(it.next().getAid());
                            }
                            com.ss.android.ugc.aweme.common.f.b("NoticeVideoManager", sb.append(arrayList).toString());
                            this.f113417a.this$0.a(list);
                        }
                    }, AnonymousClass3.f113418a, new f.a.d.a(this) {
                        /* class com.ss.android.ugc.aweme.notification.e.c.HandlerC2905c.i.AnonymousClass4 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ i f113419a;

                        static {
                            Covode.recordClassIndex(72928);
                        }

                        {
                            this.f113419a = r1;
                        }

                        @Override // f.a.d.a
                        public final void a() {
                            com.ss.android.ugc.aweme.common.f.b("NoticeVideoManager", "requestData finished, " + this.f113419a.this$0.g().size() + ", " + this.f113419a.this$0.h().size() + ", " + this.f113419a.this$0.c().size() + ", " + this.f113419a.this$0.d().size());
                        }
                    });
                }
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$n */
        public static final class n extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ List $list;
            final /* synthetic */ HandlerC2905c this$0;

            static {
                Covode.recordClassIndex(72933);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            n(HandlerC2905c cVar, List list) {
                super(0);
                this.this$0 = cVar;
                this.$list = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                LruCache<String, b> d2;
                LruCache<String, b> c2;
                this.$list.size();
                this.this$0.f();
                for (Aweme aweme : this.$list) {
                    String aid = aweme.getAid();
                    int i2 = 0;
                    if (!(aid == null || aid.length() == 0)) {
                        HandlerC2905c cVar = this.this$0;
                        String aid2 = aweme.getAid();
                        h.f.b.l.b(aid2, "");
                        Iterator<a> it = cVar.f().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (!h.f.b.l.a((Object) it.next().f113398a, (Object) aid2)) {
                                i2++;
                            } else if (i2 >= 0 && i2 < c.a().f113428d) {
                                d2 = this.this$0.c();
                                c2 = this.this$0.d();
                            }
                        }
                        d2 = this.this$0.d();
                        c2 = this.this$0.c();
                        aweme.getAid();
                        d2.put(aweme.getAid(), new b(aweme, System.currentTimeMillis()));
                        b bVar = c2.get(aweme.getAid());
                        if (bVar != null) {
                            h.f.b.l.d(aweme, "");
                            bVar.f113400a = aweme;
                            bVar.f113401b = System.currentTimeMillis();
                        }
                    }
                }
                return z.f158842a;
            }
        }

        public final b.i<z> a(List<? extends Aweme> list) {
            return d.a(new n(this, list));
        }

        public static boolean a(BaseNotice baseNotice) {
            Long g2;
            String str = baseNotice.nid;
            if (str == null || (g2 = p.g(str)) == null || g2.longValue() <= 0) {
                return false;
            }
            return true;
        }

        public final b.i<z> b(BaseNotice baseNotice) {
            return d.a(new d(this, baseNotice));
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.c$c$j */
        static final class j<T> implements w {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f113420a;

            static {
                Covode.recordClassIndex(72929);
            }

            j(List list) {
                this.f113420a = list;
            }

            @Override // f.a.w
            public final void subscribe(v<List<Aweme>> vVar) {
                h.f.b.l.d(vVar, "");
                try {
                    Object obj = ba.a().a(this.f113420a.toString()).f79632a;
                    if (obj == null) {
                        obj = new ArrayList();
                    }
                    ac.a(vVar, obj);
                } catch (Throwable th) {
                    com.ss.android.ugc.aweme.common.f.a("NoticeVideoManager", "requestDataReal error", th);
                    ac.a(vVar, new ArrayList());
                }
            }
        }

        private static String b(String str) {
            if (!hl.a(str)) {
                return null;
            }
            if (str == null) {
                h.f.b.l.b();
            }
            if (!p.b(str, "aweme://aweme/detail/", false)) {
                return null;
            }
            Matcher matcher = Pattern.compile("\\d+\\d").matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
            return null;
        }

        public final void handleMessage(Message message) {
            h.f.b.l.d(message, "");
            if (message.what == 0) {
                removeMessages(0);
                if (!this.f113403a) {
                    d.a(new i(this));
                } else {
                    sendEmptyMessageDelayed(0, c.a().f113430f / 2);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HandlerC2905c(String str) {
            super(Looper.getMainLooper());
            h.f.b.l.d(str, "");
            this.f113404b = str;
            d.a(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.notification.e.c.HandlerC2905c.AnonymousClass1 */
                final /* synthetic */ HandlerC2905c this$0;

                static {
                    Covode.recordClassIndex(72915);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    HandlerC2905c cVar = this.this$0;
                    try {
                        cVar.e().evictAll();
                        Map map = (Map) dg.a(cVar.a().getString("notice_click_times", ""), Map.class);
                        h.f.b.l.b(map, "");
                        for (Map.Entry entry : map.entrySet()) {
                            LruCache<String, Integer> e2 = cVar.e();
                            String valueOf = String.valueOf(entry.getKey());
                            Object value = entry.getValue();
                            if (value != null) {
                                e2.put(valueOf, Integer.valueOf(((Number) value).intValue()));
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                            }
                        }
                        new StringBuilder("readClickTimesFile:").append(map).append('}');
                        q.m223constructorimpl(0);
                    } catch (Throwable th) {
                        q.m223constructorimpl(r.a(th));
                    }
                    return z.f158842a;
                }
            });
        }

        public static void a(LruCache<String, b> lruCache) {
            Map<String, b> snapshot = lruCache.snapshot();
            h.f.b.l.b(snapshot, "");
            for (Map.Entry<String, b> entry : snapshot.entrySet()) {
                if (System.currentTimeMillis() - entry.getValue().f113401b > c.a().f113426b) {
                    com.ss.android.ugc.aweme.common.f.b("NoticeVideoManager", "remove expired:" + entry.getKey());
                    lruCache.remove(entry.getKey());
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            if (h.z.f158842a == null) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
            if (h.z.f158842a == null) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
            if (r0 == null) goto L_0x0013;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static /* synthetic */ java.lang.String c(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r4) {
            /*
            // Method dump skipped, instructions count: 151
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.e.c.HandlerC2905c.c(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice):java.lang.String");
        }

        @Override // com.ss.android.ugc.aweme.notice.api.services.a
        public final Aweme a(String str) {
            h.f.b.l.d(str, "");
            b bVar = c().get(str);
            if (bVar == null && (bVar = d().get(str)) == null && (bVar = b().get(str)) == null) {
                return null;
            }
            return bVar.f113400a;
        }

        @Override // com.ss.android.ugc.aweme.notice.api.services.a
        public final void a(Aweme aweme) {
            h.f.b.l.d(aweme, "");
            a(h.a.n.c(aweme));
        }

        public final void a(boolean z) {
            this.f113403a = z;
            if (!z) {
                sendEmptyMessageDelayed(0, c.a().f113430f / 2);
            }
        }
    }

    public static d a() {
        return (d) f113396c.getValue();
    }

    private c() {
    }

    public static final void c() {
        HandlerC2905c cVar = f113397d;
        if (cVar != null) {
            cVar.i();
        }
        f113397d = null;
    }

    public static final class d {
        @com.google.gson.a.c(a = "enabled")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f113425a;
        @com.google.gson.a.c(a = "expire_duration")

        /* renamed from: b  reason: collision with root package name */
        public final long f113426b;
        @com.google.gson.a.c(a = "trigger_preload_condition")

        /* renamed from: c  reason: collision with root package name */
        public final int f113427c;
        @com.google.gson.a.c(a = "preserved_cache_count")

        /* renamed from: d  reason: collision with root package name */
        public final int f113428d;
        @com.google.gson.a.c(a = "rolling_cache_count")

        /* renamed from: e  reason: collision with root package name */
        public final int f113429e;
        @com.google.gson.a.c(a = "request_alignment_delay")

        /* renamed from: f  reason: collision with root package name */
        public final long f113430f;

        static {
            Covode.recordClassIndex(72935);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f113425a == dVar.f113425a && this.f113426b == dVar.f113426b && this.f113427c == dVar.f113427c && this.f113428d == dVar.f113428d && this.f113429e == dVar.f113429e && this.f113430f == dVar.f113430f;
        }

        public final String toString() {
            return "Meta(isEnabled=" + this.f113425a + ", expireDuration=" + this.f113426b + ", triggerPreloadCondition=" + this.f113427c + ", preservedCacheCount=" + this.f113428d + ", rollingCacheCount=" + this.f113429e + ", alignmentDelay=" + this.f113430f + ")";
        }

        private d() {
            this.f113425a = false;
            this.f113426b = 180;
            this.f113427c = 2;
            this.f113428d = 10;
            this.f113429e = 20;
            this.f113430f = 400;
        }

        public final int hashCode() {
            boolean z = this.f113425a;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            long j2 = this.f113426b;
            long j3 = this.f113430f;
            return (((((((((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f113427c) * 31) + this.f113428d) * 31) + this.f113429e) * 31) + ((int) (j3 ^ (j3 >>> 32)));
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f113431a = new e();

        static {
            Covode.recordClassIndex(72936);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            Object a2 = com.bytedance.ies.abmock.b.a().a(true, "preload_notice_video", d.class, c.f113394a);
            if (a2 == null) {
                return c.f113394a;
            }
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(72911);
        c cVar = new c();
        f113395b = cVar;
        com.ss.android.ugc.aweme.account.b.g().addUserChangeListener(cVar);
    }

    public static final HandlerC2905c b() {
        String str = null;
        if (!a().f113425a) {
            return null;
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        String curUserId = g2.getCurUserId();
        if (curUserId == null || curUserId.length() == 0) {
            c();
        } else {
            HandlerC2905c cVar = f113397d;
            if (cVar != null) {
                str = cVar.f113404b;
            }
            if (!l.a((Object) str, (Object) curUserId)) {
                c();
                f113397d = new HandlerC2905c(curUserId);
            }
        }
        return f113397d;
    }

    public static final class a implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        public final String f113398a;

        /* renamed from: b  reason: collision with root package name */
        public int f113399b = Integer.MAX_VALUE;

        static {
            Covode.recordClassIndex(72912);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f113398a, aVar.f113398a) && this.f113399b == aVar.f113399b;
        }

        public final int hashCode() {
            String str = this.f113398a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.f113399b;
        }

        public final String toString() {
            return "AidPosInfo(aid=" + this.f113398a + ", minPosition=" + this.f113399b + ")";
        }

        public a(String str) {
            l.d(str, "");
            this.f113398a = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return this.f113399b - aVar2.f113399b;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Aweme f113400a;

        /* renamed from: b  reason: collision with root package name */
        public long f113401b;

        static {
            Covode.recordClassIndex(72913);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f113400a, bVar.f113400a) && this.f113401b == bVar.f113401b;
        }

        public final int hashCode() {
            Aweme aweme = this.f113400a;
            int hashCode = aweme != null ? aweme.hashCode() : 0;
            long j2 = this.f113401b;
            return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            return "CacheInfo(data=" + this.f113400a + ", updateTime=" + this.f113401b + ")";
        }

        public b(Aweme aweme, long j2) {
            l.d(aweme, "");
            this.f113400a = aweme;
            this.f113401b = j2;
        }
    }

    public static SmartRoute a(SmartRoute smartRoute, String str) {
        l.d(smartRoute, "");
        l.d(str, "");
        if (a().f113425a) {
            smartRoute.withParam("video_from", "from_notification_page");
        }
        return smartRoute;
    }

    public static u a(u uVar, String str) {
        l.d(uVar, "");
        l.d(str, "");
        if (a().f113425a && p.b(str, "aweme://aweme/detail/", false)) {
            uVar.a("video_from", "from_notification_page");
        }
        return uVar;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService.a
    public final void a(int i2, User user, User user2) {
        String str;
        String str2;
        String str3;
        HandlerC2905c cVar = f113397d;
        String str4 = null;
        if (cVar != null) {
            str = cVar.f113404b;
        } else {
            str = null;
        }
        if (user2 != null) {
            str2 = user2.getUid();
        } else {
            str2 = null;
        }
        if (!l.a((Object) str, (Object) str2)) {
            StringBuilder sb = new StringBuilder("user changed:");
            HandlerC2905c cVar2 = f113397d;
            if (cVar2 != null) {
                str3 = cVar2.f113404b;
            } else {
                str3 = null;
            }
            StringBuilder append = sb.append(str3).append(", ");
            if (user2 != null) {
                str4 = user2.getUid();
            }
            f.c("NoticeVideoManager", append.append(str4).toString());
            c();
        }
    }
}
