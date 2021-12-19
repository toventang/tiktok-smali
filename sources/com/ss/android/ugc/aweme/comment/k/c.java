package com.ss.android.ugc.aweme.comment.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.i.a;
import com.bytedance.jedi.a.j.b;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import com.ss.android.ugc.aweme.comment.model.GifEmojiResponse;
import f.a.t;
import h.a.n;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Collection;
import java.util.List;

public final class c extends b {

    /* renamed from: b  reason: collision with root package name */
    private final b f72074b;

    /* renamed from: c  reason: collision with root package name */
    private final a f72075c;

    static {
        Covode.recordClassIndex(44270);
    }

    public c() {
        b bVar = new b();
        this.f72074b = bVar;
        a aVar = new a();
        this.f72075c = aVar;
        a(bVar, aVar, new a());
    }

    public static final class a extends m implements h.f.a.b<a.c<d, List<? extends GifEmoji>, String, List<? extends GifEmoji>>, z> {
        static {
            Covode.recordClassIndex(44271);
        }

        public a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(a.c<d, List<? extends GifEmoji>, String, List<? extends GifEmoji>> cVar) {
            invoke((a.c<d, List<GifEmoji>, String, List<GifEmoji>>) cVar);
            return z.f158842a;
        }

        public final void invoke(a.c<d, List<GifEmoji>, String, List<GifEmoji>> cVar) {
            l.c(cVar, "");
            cVar.a(new h.f.a.m<d, List<? extends GifEmoji>, String>(this) {
                /* class com.ss.android.ugc.aweme.comment.k.c.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(44272);
                }

                {
                    this.this$0 = r2;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.ugc.aweme.comment.k.d */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [h.z, java.lang.String] */
                /* JADX WARNING: Unknown variable types count: 1 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.String invoke(com.ss.android.ugc.aweme.comment.k.d r3, java.util.List<? extends com.ss.android.ugc.aweme.comment.model.GifEmoji> r4) {
                    /*
                        r2 = this;
                        java.lang.Class<com.ss.android.ugc.aweme.comment.k.d> r1 = com.ss.android.ugc.aweme.comment.k.d.class
                        java.lang.Class<java.lang.String> r0 = java.lang.String.class
                        boolean r0 = h.f.b.l.a(r1, r0)
                        if (r0 == 0) goto L_0x0010
                        java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
                        java.util.Objects.requireNonNull(r3, r0)
                        return r3
                    L_0x0010:
                        java.lang.Class<java.lang.String> r1 = java.lang.String.class
                        java.lang.Class<h.z> r0 = h.z.class
                        boolean r0 = h.f.b.l.a(r1, r0)
                        if (r0 == 0) goto L_0x001d
                        h.z r0 = h.z.f158842a
                        return r0
                    L_0x001d:
                        java.lang.RuntimeException r0 = new java.lang.RuntimeException
                        r0.<init>()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.k.c.a.AnonymousClass1.invoke(java.lang.Object, java.util.List):java.lang.Object");
                }
            });
            cVar.a(new q<d, List<? extends GifEmoji>, List<? extends GifEmoji>, List<? extends GifEmoji>>(this) {
                /* class com.ss.android.ugc.aweme.comment.k.c.a.AnonymousClass2 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(44273);
                }

                {
                    this.this$0 = r2;
                }

                /* JADX DEBUG: Failed to insert an additional move for type inference into block B:5:0x000d */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<com.ss.android.ugc.aweme.comment.model.GifEmoji>, java.util.List<? extends com.ss.android.ugc.aweme.comment.model.GifEmoji>] */
                /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r3v3, types: [h.a.z] */
                public final List<GifEmoji> invoke(d dVar, List<? extends GifEmoji> list, List<? extends GifEmoji> list2) {
                    if (dVar.f72077b != 0) {
                        if (list2 == null) {
                            list2 = h.a.z.INSTANCE;
                        }
                        if (list != 0 || (list = h.a.z.INSTANCE) != 0) {
                            return n.d((Collection) list2, (Iterable) list);
                        }
                        throw new RuntimeException();
                    } else if (list != 0) {
                        return list;
                    } else {
                        return null;
                    }
                }
            });
        }
    }

    public final t<GifEmojiResponse> a(String str, int i2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        t<GifEmojiResponse> a2 = this.f72074b.c(new d(str, i2, str2)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a2, "");
        return a2;
    }
}
