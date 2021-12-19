package com.bytedance.android.live.broadcast.api.blockword;

import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordGetExtra;
import com.bytedance.android.live.broadcast.api.c.b;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    final BlockWordApi f7501a;

    /* renamed from: b  reason: collision with root package name */
    String f7502b;

    /* renamed from: c  reason: collision with root package name */
    boolean f7503c;

    /* renamed from: d  reason: collision with root package name */
    String f7504d = "";

    /* renamed from: e  reason: collision with root package name */
    long f7505e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC0101a f7506f;

    /* renamed from: com.bytedance.android.live.broadcast.api.blockword.a$a  reason: collision with other inner class name */
    public interface AbstractC0101a {
        static {
            Covode.recordClassIndex(3688);
        }

        void a(com.bytedance.android.live.broadcast.api.blockword.model.a aVar);

        void a(Throwable th);

        void a(List<com.bytedance.android.live.broadcast.api.blockword.model.a> list, long j2, long j3);

        void b(com.bytedance.android.live.broadcast.api.blockword.model.a aVar);

        void b(Throwable th);

        void c(Throwable th);
    }

    static {
        Covode.recordClassIndex(3687);
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f7511a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.broadcast.api.blockword.model.a f7512b;

        static {
            Covode.recordClassIndex(3691);
        }

        d(a aVar, com.bytedance.android.live.broadcast.api.blockword.model.a aVar2) {
            this.f7511a = aVar;
            this.f7512b = aVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f7511a.f7506f.b(this.f7512b);
            c.a.b("ttlive_delete_sensitive_word").a("sensitive_word", this.f7512b.f7520b).a();
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f7516a;

        static {
            Covode.recordClassIndex(3694);
        }

        g(a aVar) {
            this.f7516a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            AbstractC0101a aVar = this.f7516a.f7506f;
            l.b(th, "");
            aVar.c(th);
            b.a.a("ttlive_fetch_sensitive_word", th).a();
        }
    }

    public a(AbstractC0101a aVar) {
        l.d(aVar, "");
        this.f7506f = aVar;
        Object a2 = com.bytedance.android.live.network.e.a().a(BlockWordApi.class);
        l.b(a2, "");
        this.f7501a = (BlockWordApi) a2;
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f7507a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.broadcast.api.blockword.model.a f7508b;

        static {
            Covode.recordClassIndex(3689);
        }

        b(a aVar, com.bytedance.android.live.broadcast.api.blockword.model.a aVar2) {
            this.f7507a = aVar;
            this.f7508b = aVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Integer num = ((com.bytedance.android.live.broadcast.api.blockword.model.b) ((com.bytedance.android.live.network.response.d) obj).data).f7521a;
            if (num != null) {
                this.f7508b.f7519a = num.intValue();
                this.f7507a.f7506f.a(this.f7508b);
                c.a.b("ttlive_add_sensitive_word").a("sensitive_word", this.f7508b.f7520b).a();
            }
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f7509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.broadcast.api.blockword.model.a f7510b;

        static {
            Covode.recordClassIndex(3690);
        }

        c(a aVar, com.bytedance.android.live.broadcast.api.blockword.model.a aVar2) {
            this.f7509a = aVar;
            this.f7510b = aVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            AbstractC0101a aVar = this.f7509a.f7506f;
            l.b(th, "");
            aVar.a(th);
            b.a.a("ttlive_add_sensitive_word", th).a("sensitive_word", this.f7510b.f7520b).a();
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f7513a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.broadcast.api.blockword.model.a f7514b;

        static {
            Covode.recordClassIndex(3692);
        }

        e(a aVar, com.bytedance.android.live.broadcast.api.blockword.model.a aVar2) {
            this.f7513a = aVar;
            this.f7514b = aVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            AbstractC0101a aVar = this.f7513a.f7506f;
            l.b(th, "");
            aVar.b(th);
            b.a.a("ttlive_delete_sensitive_word", th).a("sensitive_word", this.f7514b.f7520b).a();
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f7515a;

        static {
            Covode.recordClassIndex(3693);
        }

        f(a aVar) {
            this.f7515a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.b bVar = (com.bytedance.android.live.network.response.b) obj;
            List<com.bytedance.android.live.broadcast.api.blockword.model.a> list = bVar.data.f7522a;
            if (list != null) {
                this.f7515a.f7506f.a(list, ((BlockWordGetExtra) bVar.extra).maxCount, ((BlockWordGetExtra) bVar.extra).maxLength);
                c.a.b("ttlive_fetch_sensitive_word").a("list_size", Integer.valueOf(list.size())).a();
            }
        }
    }
}
