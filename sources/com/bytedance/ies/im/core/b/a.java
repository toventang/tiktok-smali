package com.bytedance.ies.im.core.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ag;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.an;
import com.bytedance.im.core.d.ar;
import com.bytedance.im.core.d.ay;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a implements com.bytedance.ies.im.core.api.b.a.d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33999a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h.h f34000b = h.i.a((h.f.a.a) C0750a.f34001a);

    public static CopyOnWriteArraySet<com.bytedance.ies.im.core.api.b.a.d> a() {
        return (CopyOnWriteArraySet) f34000b.getValue();
    }

    private a() {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, int i2, ar arVar) {
        h.f.b.l.d(arVar, "");
        a(new d(list, i2, arVar));
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, int i2, String str) {
        a(new h(list, i2, str));
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, boolean z) {
        a(new g(list, z));
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, Map<String, Map<String, String>> map) {
        Integer num;
        Integer num2;
        a(new l(list, map));
        StringBuilder sb = new StringBuilder("onUpdateMessage with ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        StringBuilder append = sb.append(num).append(" && ");
        if (map != null) {
            num2 = Integer.valueOf(map.size());
        } else {
            num2 = null;
        }
        com.bytedance.im.core.c.f.a("GlobalMsgObserver", append.append(num2).toString(), (Throwable) null);
    }

    /* renamed from: com.bytedance.ies.im.core.b.a$a  reason: collision with other inner class name */
    static final class C0750a extends m implements h.f.a.a<CopyOnWriteArraySet<com.bytedance.ies.im.core.api.b.a.d>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0750a f34001a = new C0750a();

        static {
            Covode.recordClassIndex(20239);
        }

        C0750a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArraySet<com.bytedance.ies.im.core.api.b.a.d> invoke() {
            return new CopyOnWriteArraySet();
        }
    }

    static {
        Covode.recordClassIndex(20238);
    }

    static final class c extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.a.d, z> {
        final /* synthetic */ ai $message;

        static {
            Covode.recordClassIndex(20241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ai aiVar) {
            super(1);
            this.$message = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.a.d dVar) {
            com.bytedance.ies.im.core.api.b.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            dVar2.a(this.$message);
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.a.d, z> {
        final /* synthetic */ ai $message;
        final /* synthetic */ int $statusCode;

        static {
            Covode.recordClassIndex(20240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2, ai aiVar) {
            super(1);
            this.$statusCode = i2;
            this.$message = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.a.d dVar) {
            com.bytedance.ies.im.core.api.b.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            dVar2.a(this.$statusCode, this.$message);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.a.d, z> {
        final /* synthetic */ ar $extra;
        final /* synthetic */ List $list;
        final /* synthetic */ int $msgSource;

        static {
            Covode.recordClassIndex(20242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(List list, int i2, ar arVar) {
            super(1);
            this.$list = list;
            this.$msgSource = i2;
            this.$extra = arVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.a.d dVar) {
            com.bytedance.ies.im.core.api.b.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            dVar2.a(this.$list, this.$msgSource, this.$extra);
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.a.d, z> {
        final /* synthetic */ ai $msg;
        final /* synthetic */ Map $newPropertyItemListMap;
        final /* synthetic */ Map $oldPropertyItemListMap;

        static {
            Covode.recordClassIndex(20243);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ai aiVar, Map map, Map map2) {
            super(1);
            this.$msg = aiVar;
            this.$oldPropertyItemListMap = map;
            this.$newPropertyItemListMap = map2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.a.d dVar) {
            com.bytedance.ies.im.core.api.b.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            dVar2.a(this.$msg, this.$oldPropertyItemListMap, this.$newPropertyItemListMap);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.a.d, z> {
        final /* synthetic */ List $list;
        final /* synthetic */ boolean $success;

        static {
            Covode.recordClassIndex(20244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(List list, boolean z) {
            super(1);
            this.$list = list;
            this.$success = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.a.d dVar) {
            com.bytedance.ies.im.core.api.b.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            dVar2.b(this.$list, this.$success);
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.a.d, z> {
        final /* synthetic */ List $list;
        final /* synthetic */ boolean $success;

        static {
            Covode.recordClassIndex(20245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(List list, boolean z) {
            super(1);
            this.$list = list;
            this.$success = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.a.d dVar) {
            com.bytedance.ies.im.core.api.b.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            dVar2.a(this.$list, this.$success);
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.a.d, z> {
        final /* synthetic */ int $direction;
        final /* synthetic */ String $from;
        final /* synthetic */ List $list;

        static {
            Covode.recordClassIndex(20246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(List list, int i2, String str) {
            super(1);
            this.$list = list;
            this.$direction = i2;
            this.$from = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.a.d dVar) {
            com.bytedance.ies.im.core.api.b.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            dVar2.a(this.$list, this.$direction, this.$from);
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.a.d, z> {
        final /* synthetic */ ai $message;
        final /* synthetic */ ay $metrics;
        final /* synthetic */ int $statusCode;

        static {
            Covode.recordClassIndex(20247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(int i2, ai aiVar, ay ayVar) {
            super(1);
            this.$statusCode = i2;
            this.$message = aiVar;
            this.$metrics = ayVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.a.d dVar) {
            com.bytedance.ies.im.core.api.b.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            dVar2.a(this.$statusCode, this.$message, this.$metrics);
            return z.f158842a;
        }
    }

    static final class j extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.a.d, z> {
        final /* synthetic */ boolean $hasChanged;
        final /* synthetic */ ai $message;

        static {
            Covode.recordClassIndex(20248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ai aiVar, boolean z) {
            super(1);
            this.$message = aiVar;
            this.$hasChanged = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.a.d dVar) {
            com.bytedance.ies.im.core.api.b.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            dVar2.a(this.$message, this.$hasChanged);
            return z.f158842a;
        }
    }

    static final class k extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.a.d, z> {
        final /* synthetic */ an $modifyMsgPropertyMsg;
        final /* synthetic */ int $statusCode;

        static {
            Covode.recordClassIndex(20249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(int i2, an anVar) {
            super(1);
            this.$statusCode = i2;
            this.$modifyMsgPropertyMsg = anVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.a.d dVar) {
            com.bytedance.ies.im.core.api.b.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            dVar2.a(this.$statusCode, this.$modifyMsgPropertyMsg);
            return z.f158842a;
        }
    }

    static final class l extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.a.d, z> {
        final /* synthetic */ List $list;
        final /* synthetic */ Map $oldMsgExtMap;

        static {
            Covode.recordClassIndex(20250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(List list, Map map) {
            super(1);
            this.$list = list;
            this.$oldMsgExtMap = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.a.d dVar) {
            com.bytedance.ies.im.core.api.b.a.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            dVar2.a(this.$list, this.$oldMsgExtMap);
            return z.f158842a;
        }
    }

    private static void a(h.f.a.b<? super com.bytedance.ies.im.core.api.b.a.d, z> bVar) {
        Iterator<T> it = a().iterator();
        while (it.hasNext()) {
            bVar.invoke(it.next());
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(ai aiVar) {
        a(new c(aiVar));
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void b(List<ai> list, boolean z) {
        a(new f(list, z));
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(int i2, ai aiVar) {
        a(new b(i2, aiVar));
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(int i2, an anVar) {
        a(new k(i2, anVar));
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(ai aiVar, boolean z) {
        a(new j(aiVar, z));
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(int i2, ai aiVar, ay ayVar) {
        a(new i(i2, aiVar, ayVar));
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(ai aiVar, Map<String, List<ag>> map, Map<String, List<ag>> map2) {
        a(new e(aiVar, map, map2));
    }
}
