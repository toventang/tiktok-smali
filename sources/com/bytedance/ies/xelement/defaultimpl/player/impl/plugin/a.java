package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.b.c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.i;
import com.bytedance.ies.xelement.defaultimpl.player.impl.entity.XAudioSrc;
import h.f.b.l;
import h.f.b.m;
import h.j.e;
import h.z;
import java.util.Iterator;
import java.util.List;

public final class a extends com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a implements c.a, f, g {

    /* renamed from: b  reason: collision with root package name */
    public static final C0911a f37004b = new C0911a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final h.f.a.a<z> f37005c = new b(this);

    /* renamed from: d  reason: collision with root package name */
    private final c f37006d;

    static {
        Covode.recordClassIndex(22254);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.g
    public final h a(h hVar) {
        return hVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final n b(n nVar) {
        return nVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean d(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean f() {
        return false;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.a$a  reason: collision with other inner class name */
    public static final class C0911a {
        static {
            Covode.recordClassIndex(22255);
        }

        private C0911a() {
        }

        public /* synthetic */ C0911a(byte b2) {
            this();
        }
    }

    private final boolean g() {
        c cVar = this.f37006d;
        if (cVar == null || !cVar.bk_()) {
            return false;
        }
        return true;
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(22256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c cVar;
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar = this.this$0.f36963a;
            if (!(bVar == null || (cVar = bVar.f36968e) == null)) {
                cVar.f(new com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c("STOP_FROM_BACKGROUND_CHANGED"));
            }
            com.bytedance.ies.xelement.b.g.f36700a.c("MusicActionBackgroundPlayableController", "background play fail");
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.xelement.b.c.a
    public final void c() {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c cVar;
        o b2;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c cVar2;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar2;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar3 = this.f36963a;
        if (bVar3 == null || (bVar2 = bVar3.f36969f) == null) {
            fVar = null;
        } else {
            fVar = bVar2.m();
        }
        if (b(fVar)) {
            com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar4 = this.f36963a;
            if (bVar4 == null || (cVar = bVar4.f36968e) == null || (b2 = cVar.b()) == null || !b2.isPlayingState()) {
                a(this);
            } else if (a(this) && (bVar = this.f36963a) != null && (cVar2 = bVar.f36968e) != null) {
                cVar2.c(null);
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void a() {
        super.a();
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar = this.f36963a;
        if (bVar != null) {
            bVar.f36966c.b(this);
            bVar.f36967d.b(this);
        }
        c cVar = this.f37006d;
        if (cVar != null) {
            cVar.b(this);
        }
    }

    private static /* synthetic */ boolean a(a aVar) {
        return aVar.a(aVar.f37005c);
    }

    private static XAudioSrc d(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar) {
        if (!(fVar instanceof XAudioSrc)) {
            fVar = null;
        }
        return (XAudioSrc) fVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean c(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        return a((com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c) null);
    }

    public a(c cVar) {
        this.f37006d = cVar;
    }

    private static boolean b(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar) {
        if (!c(fVar)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.g
    public final i a(i iVar) {
        l.c(iVar, "");
        l.c(iVar, "");
        return iVar;
    }

    private static boolean c(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar) {
        Boolean mCanBackgroundPlay;
        XAudioSrc d2 = d(fVar);
        if (d2 == null || (mCanBackgroundPlay = d2.getMCanBackgroundPlay()) == null) {
            return true;
        }
        return mCanBackgroundPlay.booleanValue();
    }

    private final boolean a(h.f.a.a<z> aVar) {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar2;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar3 = this.f36963a;
        if (bVar3 == null || (bVar2 = bVar3.f36969f) == null) {
            fVar = null;
        } else {
            fVar = bVar2.m();
        }
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f a2 = a(fVar, false);
        if (a2 == null) {
            aVar.invoke();
            return false;
        }
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar4 = this.f36963a;
        if (bVar4 == null || (bVar = bVar4.f36969f) == null) {
            return true;
        }
        bVar.a(a2, null);
        return true;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.a
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar) {
        l.c(bVar, "");
        super.a(bVar);
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar2 = this.f36963a;
        if (bVar2 != null) {
            bVar2.f36966c.a(this);
            bVar2.f36967d.a(this);
        }
        c cVar = this.f37006d;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.f
    public final boolean a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar2 = this.f36963a;
        if (bVar2 == null || (bVar = bVar2.f36969f) == null) {
            fVar = null;
        } else {
            fVar = bVar.m();
        }
        if (!g() || !b(fVar)) {
            return false;
        }
        new StringBuilder("This song ").append(fVar).append(" not support playing background.");
        return true;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.g
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar, com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        String str;
        if (!g() || !b(fVar)) {
            return fVar;
        }
        if (cVar != null) {
            str = cVar.f36975a;
        } else {
            str = null;
        }
        return a(fVar, l.a((Object) str, (Object) "operation_from_media_session_skip_to_prev"));
    }

    private final com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar, boolean z) {
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.b bVar;
        h k2;
        String str;
        com.bytedance.ies.xelement.defaultimpl.player.engine.api.b.b bVar2 = this.f36963a;
        if (bVar2 != null && (bVar = bVar2.f36969f) != null && (k2 = bVar.k()) != null) {
            List<com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f> b2 = k2.b();
            Iterator<com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f> it = b2.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                String id = it.next().getId();
                if (fVar != null) {
                    str = fVar.getId();
                } else {
                    str = null;
                }
                if (l.a((Object) id, (Object) str)) {
                    break;
                }
                i2++;
            }
            if (z) {
                e a2 = e.a.a(i2 - 1, 0, -1);
                int i3 = a2.f158747a;
                int i4 = a2.f158748b;
                int i5 = a2.f158749c;
                if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
                    while (true) {
                        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar2 = (com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f) h.a.n.b((List) b2, i3);
                        if (!c(fVar2)) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            return fVar2;
                        }
                    }
                }
                e a3 = e.a.a(b2.size() - 1, i2 + 1, -1);
                int i6 = a3.f158747a;
                int i7 = a3.f158748b;
                int i8 = a3.f158749c;
                if (i8 < 0 ? i6 >= i7 : i6 <= i7) {
                    while (true) {
                        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar3 = (com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f) h.a.n.b((List) b2, i6);
                        if (!c(fVar3)) {
                            if (i6 == i7) {
                                break;
                            }
                            i6 += i8;
                        } else {
                            return fVar3;
                        }
                    }
                }
            } else {
                h.j.g a4 = h.j.h.a(i2 + 1, b2.size());
                int i9 = a4.f158747a;
                int i10 = a4.f158748b;
                if (i9 <= i10) {
                    while (true) {
                        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar4 = (com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f) h.a.n.b((List) b2, i9);
                        if (!c(fVar4)) {
                            if (i9 == i10) {
                                break;
                            }
                            i9++;
                        } else {
                            return fVar4;
                        }
                    }
                }
                h.j.g a5 = h.j.h.a(0, i2);
                int i11 = a5.f158747a;
                int i12 = a5.f158748b;
                if (i11 <= i12) {
                    while (true) {
                        com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f fVar5 = (com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f) h.a.n.b((List) b2, i11);
                        if (!c(fVar5)) {
                            if (i11 == i12) {
                                break;
                            }
                            i11++;
                        } else {
                            return fVar5;
                        }
                    }
                }
            }
        }
        return null;
    }
}
