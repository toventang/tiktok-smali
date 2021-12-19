package com.ss.android.ugc.aweme.qainvitation.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.api.QAInvitationAPI;
import f.a.d.f;
import f.a.v;
import f.a.w;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: j  reason: collision with root package name */
    public static final a f119126j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f119127a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f119128b = "";

    /* renamed from: c  reason: collision with root package name */
    public long f119129c;

    /* renamed from: d  reason: collision with root package name */
    public long f119130d;

    /* renamed from: e  reason: collision with root package name */
    public List<? extends IMUser> f119131e = z.INSTANCE;

    /* renamed from: f  reason: collision with root package name */
    public boolean f119132f;

    /* renamed from: g  reason: collision with root package name */
    public int f119133g;

    /* renamed from: h  reason: collision with root package name */
    public List<IMUser> f119134h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final f.a.b.a f119135i;

    static {
        Covode.recordClassIndex(77361);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77362);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f119136a;

        static {
            Covode.recordClassIndex(77363);
        }

        b(c cVar) {
            this.f119136a = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.c$b$b  reason: collision with other inner class name */
        static final class C3074b<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f119139a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f119140b;

            static {
                Covode.recordClassIndex(77365);
            }

            C3074b(b bVar, v vVar) {
                this.f119139a = bVar;
                this.f119140b = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                l.d(th, "");
                this.f119140b.a(this.f119139a.f119136a.f119134h);
                th.getMessage();
            }
        }

        @Override // f.a.w
        public final void subscribe(v<List<IMUser>> vVar) {
            l.d(vVar, "");
            this.f119136a.f119135i.a(QAInvitationAPI.a.a(this.f119136a.f119130d, this.f119136a.f119129c, this.f119136a.f119133g).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this, vVar), new C3074b(this, vVar)));
        }

        static final class a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f119137a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ v f119138b;

            static {
                Covode.recordClassIndex(77364);
            }

            a(b bVar, v vVar) {
                this.f119137a = bVar;
                this.f119138b = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
            /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                boolean z;
                int i2;
                com.ss.android.ugc.aweme.qainvitation.e.b bVar = (com.ss.android.ugc.aweme.qainvitation.e.b) obj;
                if (bVar != null) {
                    c cVar = this.f119137a.f119136a;
                    Integer num = bVar.f119145d;
                    if (num != null && num.intValue() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f119132f = z;
                    Integer num2 = bVar.f119144c;
                    if (num2 != null) {
                        i2 = num2.intValue();
                    } else {
                        i2 = 0;
                    }
                    cVar.f119133g = i2;
                    List<User> list = bVar.f119142a;
                    if (list != null && !list.isEmpty()) {
                        List<User> list2 = bVar.f119142a;
                        if (list2 == null) {
                            l.b();
                        }
                        cVar.f119134h.addAll(com.ss.android.ugc.aweme.qainvitation.g.a.a(list2));
                    }
                    this.f119138b.a(this.f119137a.f119136a.f119134h);
                    return;
                }
                this.f119138b.a(this.f119137a.f119136a.f119134h);
            }
        }
    }

    public c(f.a.b.a aVar) {
        l.d(aVar, "");
        this.f119135i = aVar;
    }
}
