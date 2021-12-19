package com.bytedance.ies.bullet.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.a.e;
import com.bytedance.ies.bullet.c.a;
import com.bytedance.ies.bullet.c.c.a.o;
import com.bytedance.ies.bullet.c.c.a.q;
import com.bytedance.ies.bullet.c.c.g;
import com.bytedance.ies.bullet.c.c.h;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.c.m;
import com.bytedance.ies.bullet.c.c.y;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.c.j;
import com.bytedance.ies.bullet.service.base.b.f;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final d f31941a;

    public static class a implements e.a<a, b> {

        /* renamed from: d  reason: collision with root package name */
        public static final C0664a f31942d = new C0664a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final f.a f31943a = new f.a();

        /* renamed from: b  reason: collision with root package name */
        public final a.C0669a f31944b = new a.C0669a();

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, c> f31945c = new LinkedHashMap();

        /* renamed from: e  reason: collision with root package name */
        private final Map<Class<? extends com.bytedance.ies.bullet.c.c.d<m, com.bytedance.ies.bullet.c.c.e, i, g>>, com.bytedance.ies.bullet.c.c.d<m, com.bytedance.ies.bullet.c.c.e, i, g>> f31946e = new LinkedHashMap();

        /* renamed from: f  reason: collision with root package name */
        private Object f31947f;

        static {
            Covode.recordClassIndex(18682);
        }

        /* renamed from: com.bytedance.ies.bullet.a.b$a$a  reason: collision with other inner class name */
        public static final class C0664a {
            static {
                Covode.recordClassIndex(18683);
            }

            private C0664a() {
            }

            public /* synthetic */ C0664a(byte b2) {
                this();
            }
        }

        /* renamed from: com.bytedance.ies.bullet.a.b$a$b  reason: collision with other inner class name */
        public static final class C0665b implements com.bytedance.ies.bullet.ui.common.b.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f31948a;

            static {
                Covode.recordClassIndex(18684);
            }

            @Override // com.bytedance.ies.bullet.ui.common.b.d
            public final h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.ui.common.b.c> a() {
                return new h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.ui.common.b.c>(this) {
                    /* class com.bytedance.ies.bullet.a.b.a.C0665b.AnonymousClass1 */
                    final /* synthetic */ C0665b this$0;

                    static {
                        Covode.recordClassIndex(18685);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ com.bytedance.ies.bullet.ui.common.b.c invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
                        com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
                        l.c(bVar2, "");
                        return this.this$0.f31948a.e(bVar2);
                    }
                };
            }

            C0665b(c cVar) {
                this.f31948a = cVar;
            }
        }

        public static final class d implements com.bytedance.ies.bullet.c.c.a.l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f31949a;

            static {
                Covode.recordClassIndex(18687);
            }

            @Override // com.bytedance.ies.bullet.c.c.a.l
            public final h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, List<o>> a() {
                return new c(this);
            }

            @Override // com.bytedance.ies.bullet.c.c.a.l
            public final h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, List<q>> b() {
                return new C0666a(this);
            }

            @Override // com.bytedance.ies.bullet.c.c.a.l
            public final h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.e.b.a<com.bytedance.ies.bullet.c.c.a.c>> c() {
                return new C0667b(this);
            }

            d(c cVar) {
                this.f31949a = cVar;
            }

            /* renamed from: com.bytedance.ies.bullet.a.b$a$d$b  reason: collision with other inner class name */
            static final class C0667b extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.e.b.a<com.bytedance.ies.bullet.c.c.a.c>> {
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(18689);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0667b(d dVar) {
                    super(1);
                    this.this$0 = dVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.bytedance.ies.bullet.c.e.b.a<com.bytedance.ies.bullet.c.c.a.c> invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
                    com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
                    l.c(bVar2, "");
                    return this.this$0.f31949a.d(bVar2);
                }
            }

            static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, List<? extends o>> {
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(18690);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(d dVar) {
                    super(1);
                    this.this$0 = dVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ List<? extends o> invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
                    com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
                    l.c(bVar2, "");
                    return this.this$0.f31949a.a(bVar2);
                }
            }

            /* renamed from: com.bytedance.ies.bullet.a.b$a$d$a  reason: collision with other inner class name */
            static final class C0666a extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, ArrayList<q>> {
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(18688);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0666a(d dVar) {
                    super(1);
                    this.this$0 = dVar;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public ArrayList<q> invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
                    l.c(bVar, "");
                    ArrayList<q> arrayList = new ArrayList<>();
                    arrayList.addAll(this.this$0.f31949a.b(bVar));
                    try {
                        arrayList.addAll(this.this$0.f31949a.c(bVar));
                    } catch (AbstractMethodError unused) {
                    }
                    return arrayList;
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007e A[EDGE_INSN: B:26:0x007e->B:18:0x007e ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.ies.bullet.a.b a() {
            /*
            // Method dump skipped, instructions count: 140
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.a.b.a.a():com.bytedance.ies.bullet.a.b");
        }

        /* Return type fixed from 'com.bytedance.ies.bullet.a.e$a' to match base method */
        @Override // com.bytedance.ies.bullet.a.e.a
        public final /* bridge */ /* synthetic */ a a(Class cls) {
            return a((Class<?>) cls, false);
        }

        /* access modifiers changed from: package-private */
        public static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, List<? extends com.bytedance.ies.bullet.service.f.a.b.q>> {
            final /* synthetic */ c $this_toPackageRegistry;

            static {
                Covode.recordClassIndex(18686);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(c cVar) {
                super(1);
                this.$this_toPackageRegistry = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ List<? extends com.bytedance.ies.bullet.service.f.a.b.q> invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
                com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
                l.c(bVar2, "");
                return this.$this_toPackageRegistry.f(bVar2);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.util.Map<java.lang.Class<com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>>, com.bytedance.ies.bullet.c.c.h<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        public final a a(Object obj) {
            l.c(obj, "");
            for (Map.Entry<Class<? extends com.bytedance.ies.bullet.c.c.d<m, com.bytedance.ies.bullet.c.c.e, i, g>>, com.bytedance.ies.bullet.c.c.d<m, com.bytedance.ies.bullet.c.c.e, i, g>> entry : this.f31946e.entrySet()) {
                if ((entry.getValue() instanceof y) || (entry.getValue() instanceof com.bytedance.ies.bullet.c.c.a)) {
                    this.f31947f = obj;
                } else {
                    Class<? extends com.bytedance.ies.bullet.c.c.d<m, com.bytedance.ies.bullet.c.c.e, i, g>> key = entry.getKey();
                    try {
                        h<g> b2 = entry.getValue().b(obj);
                        if (b2 != null) {
                            a.C0669a aVar = this.f31944b;
                            l.c(key, "");
                            l.c(b2, "");
                            aVar.f31968c.put(key, b2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            return this;
        }

        public final a a(String str, Object obj) {
            l.c(str, "");
            l.c(obj, "");
            this.f31945c.put(str, obj);
            return this;
        }

        private final com.bytedance.ies.bullet.c.g a(c cVar, String str) {
            d dVar = new d(cVar);
            com.bytedance.ies.bullet.c.e.a.b bVar = new com.bytedance.ies.bullet.c.e.a.b();
            bVar.b(com.bytedance.ies.bullet.ui.common.b.d.class, new C0665b(cVar));
            j jVar = new j(dVar, bVar, new c(cVar));
            c cVar2 = this.f31945c.get(str);
            if (cVar2 != null) {
                for (Map.Entry<Class<? extends com.bytedance.ies.bullet.c.c.d<m, com.bytedance.ies.bullet.c.c.e, i, g>>, com.bytedance.ies.bullet.c.c.d<m, com.bytedance.ies.bullet.c.c.e, i, g>> entry : this.f31946e.entrySet()) {
                    Class<? extends com.bytedance.ies.bullet.c.c.d<m, com.bytedance.ies.bullet.c.c.e, i, g>> key = entry.getKey();
                    try {
                        com.bytedance.ies.bullet.c.c.l<m, com.bytedance.ies.bullet.c.c.e> a2 = entry.getValue().a(cVar2);
                        if (a2 != null) {
                            jVar.a(key, a2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            return jVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Map<java.lang.Class<? extends com.bytedance.ies.bullet.c.c.d<com.bytedance.ies.bullet.c.c.m, com.bytedance.ies.bullet.c.c.e, com.bytedance.ies.bullet.c.c.i, com.bytedance.ies.bullet.c.c.g>>, com.bytedance.ies.bullet.c.c.d<com.bytedance.ies.bullet.c.c.m, com.bytedance.ies.bullet.c.c.e, com.bytedance.ies.bullet.c.c.i, com.bytedance.ies.bullet.c.c.g>> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: java.util.Map<java.lang.Class<? extends com.bytedance.ies.bullet.c.c.d<com.bytedance.ies.bullet.c.c.m, com.bytedance.ies.bullet.c.c.e, com.bytedance.ies.bullet.c.c.i, com.bytedance.ies.bullet.c.c.g>>, com.bytedance.ies.bullet.c.c.d<com.bytedance.ies.bullet.c.c.m, com.bytedance.ies.bullet.c.c.e, com.bytedance.ies.bullet.c.c.i, com.bytedance.ies.bullet.c.c.g>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.ies.bullet.a.b.a a(java.lang.Class<?> r9, boolean r10) {
            /*
            // Method dump skipped, instructions count: 182
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.a.b.a.a(java.lang.Class, boolean):com.bytedance.ies.bullet.a.b$a");
        }
    }

    static {
        Covode.recordClassIndex(18681);
    }

    @Override // com.bytedance.ies.bullet.c.d.b
    public final d a() {
        return this.f31941a;
    }

    private b(d dVar) {
        this.f31941a = dVar;
    }

    public /* synthetic */ b(d dVar, byte b2) {
        this(dVar);
    }
}
