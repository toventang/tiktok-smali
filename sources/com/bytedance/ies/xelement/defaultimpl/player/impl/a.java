package com.bytedance.ies.xelement.defaultimpl.player.impl;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.b.e;
import com.bytedance.ies.xelement.b.g;
import com.bytedance.ies.xelement.b.k;
import com.bytedance.ies.xelement.b.l;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.q;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.j;
import com.bytedance.ies.xelement.defaultimpl.player.impl.entity.XAudioList;
import com.bytedance.ies.xelement.defaultimpl.player.impl.entity.XAudioSrc;
import h.f.b.m;
import h.h;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class a implements com.bytedance.ies.xelement.b.e {

    /* renamed from: g  reason: collision with root package name */
    public static final C0910a f36977g = new C0910a((byte) 0);
    private static final String t = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public e.a f36978a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.ies.xelement.defaultimpl.player.engine.api.c f36979b;

    /* renamed from: c  reason: collision with root package name */
    public l f36980c = l.DEFAULT;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.ies.xelement.b.a f36981d;

    /* renamed from: e  reason: collision with root package name */
    public f f36982e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f36983f;

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a f36984h;

    /* renamed from: i  reason: collision with root package name */
    private com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.a f36985i;

    /* renamed from: j  reason: collision with root package name */
    private List<String> f36986j;

    /* renamed from: k  reason: collision with root package name */
    private final h f36987k;

    /* renamed from: l  reason: collision with root package name */
    private final h f36988l;

    /* renamed from: m  reason: collision with root package name */
    private final h f36989m;
    private c n;
    private com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h o;
    private i p;
    private boolean q;
    private boolean r;
    private final Context s;

    private final c.AnonymousClass1 l() {
        return (c.AnonymousClass1) this.f36987k.getValue();
    }

    private final ArrayList<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c> m() {
        return (ArrayList) this.f36988l.getValue();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.a$a  reason: collision with other inner class name */
    public static final class C0910a {
        static {
            Covode.recordClassIndex(22242);
        }

        private C0910a() {
        }

        public /* synthetic */ C0910a(byte b2) {
            this();
        }
    }

    public static final class e extends com.google.gson.b.a<List<? extends String>> {
        static {
            Covode.recordClassIndex(22247);
        }

        e() {
        }
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void a(String str) {
        h.f.b.l.c(str, "");
        XAudioList xAudioList = (XAudioList) a(str, XAudioList.class);
        this.o = xAudioList != null ? xAudioList.toPlaylist() : null;
        o();
    }

    static final class b extends m implements h.f.a.a<com.google.gson.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f36990a = new b();

        static {
            Covode.recordClassIndex(22243);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.google.gson.f invoke() {
            return new com.google.gson.f();
        }
    }

    static final class c extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new Object(this) {
                /* class com.bytedance.ies.xelement.defaultimpl.player.impl.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f36991a;

                static {
                    Covode.recordClassIndex(22245);
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c
                public final void a(f fVar) {
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
                public final void b() {
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
                public final void b(long j2) {
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
                public final void d() {
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
                public final void e() {
                    e.a aVar = this.f36991a.this$0.f36978a;
                    if (aVar != null) {
                        aVar.a(k.PLAYBACK_STATE_ENDED);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f36991a = r1;
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
                public final void a(long j2) {
                    e.a aVar = this.f36991a.this$0.f36978a;
                    if (aVar != null) {
                        aVar.a((int) j2);
                    }
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c
                public final void a_(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h hVar) {
                    e.a aVar = this.f36991a.this$0.f36978a;
                    if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
                public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.l lVar) {
                    h.f.b.l.c(lVar, "");
                    e.a aVar = this.f36991a.this$0.f36978a;
                    if (aVar != null) {
                        aVar.a(lVar);
                    }
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c
                public final void a_(i iVar) {
                    h.f.b.l.c(iVar, "");
                    h.f.b.l.c(iVar, "");
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
                public final void a(n nVar) {
                    com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar;
                    e.a aVar = this.f36991a.this$0.f36978a;
                    if (aVar != null) {
                        aVar.a(this.f36991a.this$0.k());
                    }
                    if (this.f36991a.this$0.f36983f && (cVar = this.f36991a.this$0.f36979b) != null) {
                        cVar.c(null);
                    }
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
                public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b bVar) {
                    String str;
                    h.f.b.l.c(bVar, "");
                    e.a aVar = this.f36991a.this$0.f36978a;
                    if (aVar != null) {
                        aVar.a(bVar.getCode(), bVar.getMsg());
                    }
                    com.bytedance.ies.xelement.b.a aVar2 = this.f36991a.this$0.f36981d;
                    String desc = this.f36991a.this$0.f36980c.getDesc();
                    boolean z = this.f36991a.this$0.f36983f;
                    f fVar = this.f36991a.this$0.f36982e;
                    if (fVar != null) {
                        str = fVar.toString();
                    } else {
                        str = null;
                    }
                    aVar2.a(-1, desc, z, "play error final", str, -1);
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
                public final void a(o oVar) {
                    h.f.b.l.c(oVar, "");
                    e.a aVar = this.f36991a.this$0.f36978a;
                    if (aVar != null) {
                        aVar.a(a.a(oVar));
                    }
                }

                @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d
                public final void a(q qVar) {
                    e.a aVar;
                    h.f.b.l.c(qVar, "");
                    if (qVar == q.SEEK_SUCCESS && (aVar = this.f36991a.this$0.f36978a) != null) {
                        aVar.b(this.f36991a.this$0.g());
                    }
                }
            };
        }
    }

    static final class d extends m implements h.f.a.a<ArrayList<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f36992a = new d();

        static {
            Covode.recordClassIndex(22246);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ArrayList<com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c> invoke() {
            return new ArrayList();
        }
    }

    private final void n() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar;
        i iVar = this.p;
        if (iVar != null && (cVar = this.f36979b) != null) {
            cVar.a(iVar);
        }
    }

    private final void o() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h hVar = this.o;
        if (hVar != null && (cVar = this.f36979b) != null) {
            cVar.a(hVar);
        }
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void d() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar = this.f36979b;
        if (cVar != null) {
            cVar.d(null);
        }
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void e() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar = this.f36979b;
        if (cVar != null) {
            cVar.f(null);
        }
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final int f() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar = this.f36979b;
        if (cVar != null) {
            return (int) cVar.d();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final int g() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar = this.f36979b;
        if (cVar != null) {
            return (int) cVar.c();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final long h() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar = this.f36979b;
        if (cVar != null) {
            return cVar.e();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final long i() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar = this.f36979b;
        if (cVar != null) {
            return cVar.f();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final k j() {
        o oVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar = this.f36979b;
        if (cVar != null) {
            oVar = cVar.b();
        } else {
            oVar = null;
        }
        return a(oVar);
    }

    static {
        Covode.recordClassIndex(22241);
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final String k() {
        f m2;
        String id;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar = this.f36979b;
        if (cVar == null || (m2 = cVar.m()) == null || (id = m2.getId()) == null) {
            return "";
        }
        return id;
    }

    private final void q() {
        c cVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar2 = this.f36979b;
        if (cVar2 != null && (cVar = this.n) != null) {
            com.bytedance.ies.xelement.b.c cVar3 = cVar.f36996a;
            if (cVar3 != null) {
                cVar2.a((com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c) new com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.a(cVar3));
            }
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.b<f, n> bVar = cVar.f36999d;
            if (bVar != null) {
                cVar2.a(bVar);
            }
            r();
            s();
        }
    }

    private final void r() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar;
        c cVar2 = this.n;
        if (cVar2 != null && (cVar = this.f36979b) != null) {
            com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a aVar = this.f36984h;
            if (aVar == null) {
                aVar = new com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.a(this.s, cVar2.f36997b, cVar2.f36996a, cVar2.f36998c);
                this.f36984h = aVar;
            }
            if (this.q) {
                cVar.a((com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c) aVar);
            } else {
                cVar.b((com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c) aVar);
            }
        }
    }

    private final void t() {
        boolean z = this.r;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar = this.f36979b;
        if (cVar != null) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.a aVar = this.f36985i;
            if (aVar == null) {
                Context a2 = a(this.s);
                h.f.b.l.a((Object) a2, "");
                aVar = new com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.a(a2);
                this.f36985i = aVar;
            }
            if (z) {
                cVar.a((com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c) aVar);
            } else {
                cVar.b((com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c) aVar);
            }
        }
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void b() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar = this.f36979b;
        if (cVar != null) {
            cVar.f(new com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c("STOP_FROM_PAGE_EXIT"));
            cVar.a((com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h) null);
            cVar.a();
            g gVar = g.f36700a;
            String str = t;
            gVar.a(str, str + " detached.");
        }
        m().clear();
        this.f36985i = null;
        this.f36979b = null;
        this.f36984h = null;
    }

    private final void p() {
        List<f> b2;
        String str;
        f fVar = this.f36982e;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h hVar = this.o;
        if (hVar != null && (b2 = hVar.b()) != null) {
            int i2 = 0;
            Iterator<f> it = b2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String id = it.next().getId();
                if (fVar != null) {
                    str = fVar.getId();
                } else {
                    str = null;
                }
                if (!h.f.b.l.a((Object) id, (Object) str)) {
                    i2++;
                } else if (i2 != -1) {
                    if (fVar != null) {
                        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar = this.f36979b;
                        if (cVar != null) {
                            cVar.a((com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b) fVar, (f) null);
                        }
                    } else {
                        fVar = null;
                    }
                    this.f36982e = fVar;
                    return;
                }
            }
        }
        this.o = new j(fVar);
        o();
    }

    private final void s() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar;
        c cVar2 = this.n;
        if (cVar2 != null && (cVar = this.f36979b) != null) {
            List<String> list = this.f36986j;
            Iterator<T> it = m().iterator();
            while (it.hasNext()) {
                cVar.b((com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c) it.next());
            }
            m().clear();
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    c.a aVar = cVar2.f37000e.get(it2.next());
                    if (aVar != null) {
                        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c a2 = aVar.a();
                        m().add(a2);
                        cVar.a(a2);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void c() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar = this.f36979b;
        String str = null;
        if (cVar != null) {
            cVar.c(null);
        }
        if (this.f36979b == null) {
            f fVar = this.f36982e;
            if (fVar != null) {
                str = fVar.getPlayUrl();
            } else {
                com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h hVar = this.o;
                if (hVar != null) {
                    str = hVar.a();
                }
            }
            this.f36981d.a(-6, this.f36980c.getDesc(), this.f36983f, "player not attach or already be detached", str, -1);
        }
        if (this.f36982e == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", "-4");
            jSONObject.put("playerType", this.f36980c.getDesc());
            jSONObject.put("autoPlay", String.valueOf(this.f36983f));
            jSONObject.put("message", "src is empty");
            jSONObject.put("src", "");
            jSONObject.put("playStatus", "-1");
            this.f36981d.b(jSONObject);
            g.f36700a.a("AUDIO_MONITOR_TAG", "eventName: x_audio_error, error msg :src is empty");
        }
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void a() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.a.a aVar = new com.bytedance.ies.xelement.defaultimpl.player.engine.a.a(this.s, this.f36981d);
        this.f36979b = aVar;
        aVar.a((com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.c) l());
        aVar.a((com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.d) l());
        a(this.f36980c);
        q();
        n();
        t();
        o();
        p();
        g gVar = g.f36700a;
        String str = t;
        gVar.a(str, str + " attached.");
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void a(boolean z) {
        this.f36983f = z;
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void a(e.a aVar) {
        h.f.b.l.c(aVar, "");
        this.f36978a = aVar;
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void b(boolean z) {
        this.q = z;
        r();
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void c(boolean z) {
        this.r = z;
        t();
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void a(int i2) {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar = this.f36979b;
        if (cVar != null) {
            cVar.a((long) i2, (com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.m) null);
        }
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void b(String str) {
        h.f.b.l.c(str, "");
        this.f36982e = (f) a(str, XAudioSrc.class);
        p();
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void c(String str) {
        h.f.b.l.c(str, "");
        Type type = new e().type;
        h.f.b.l.a((Object) type, "");
        this.f36986j = (List) a(str, type);
        s();
    }

    public static k a(o oVar) {
        if (oVar != null) {
            int i2 = b.f36995c[oVar.ordinal()];
            if (i2 == 1) {
                return k.PLAYBACK_STATE_START;
            }
            if (i2 == 2) {
                return k.PLAYBACK_STATE_PLAYING;
            }
            if (i2 == 3) {
                return k.PLAYBACK_STATE_PAUSED;
            }
            if (i2 == 4) {
                return k.PLAYBACK_STATE_STOPPED;
            }
            if (i2 == 5) {
                return k.PLAYBACK_STATE_ERROR;
            }
        }
        return k.PLAYBACK_STATE_STOPPED;
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void a(com.bytedance.ies.xelement.b.f fVar) {
        h.f.b.l.c(fVar, "");
        if (!(fVar instanceof c)) {
            fVar = null;
        }
        c cVar = (c) fVar;
        if (cVar != null) {
            this.n = cVar;
            q();
        }
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void a(com.bytedance.ies.xelement.b.h hVar) {
        i iVar;
        h.f.b.l.c(hVar, "");
        int i2 = b.f36993a[hVar.ordinal()];
        if (i2 == 1) {
            iVar = i.SINGLE_LOOP;
        } else if (i2 == 2) {
            iVar = i.SEQUENCE;
        } else if (i2 == 3) {
            iVar = i.LIST_LOOP;
        } else {
            throw new h.n();
        }
        this.p = iVar;
        n();
    }

    @Override // com.bytedance.ies.xelement.b.e
    public final void a(l lVar) {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.i aVar;
        h.f.b.l.c(lVar, "");
        this.f36980c = lVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c cVar = this.f36979b;
        if (cVar != null) {
            int i2 = b.f36994b[lVar.ordinal()];
            if (i2 == 1 || i2 == 2) {
                aVar = new com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.a();
            } else {
                aVar = new com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.d();
            }
            cVar.a(aVar);
        }
    }

    private final <T> T a(String str, Type type) {
        try {
            return (T) ((com.google.gson.f) this.f36989m.getValue()).a(str, type);
        } catch (Throwable unused) {
            this.f36981d.a(-7, this.f36980c.getDesc(), this.f36983f, "json format error", str, -1);
            return null;
        }
    }

    public a(Context context, com.lynx.tasm.behavior.j jVar, int i2) {
        h.f.b.l.c(context, "");
        h.f.b.l.c(jVar, "");
        this.s = context;
        this.f36981d = new com.bytedance.ies.xelement.b.a(jVar, i2);
        this.f36987k = h.i.a((h.f.a.a) new c(this));
        this.f36988l = h.i.a((h.f.a.a) d.f36992a);
        this.f36989m = h.i.a((h.f.a.a) b.f36990a);
        this.q = true;
        this.r = true;
    }
}
