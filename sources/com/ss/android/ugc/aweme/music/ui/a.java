package com.ss.android.ugc.aweme.music.ui;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.f;
import com.ss.android.ugc.aweme.music.ui.o;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import f.a.d.g;
import f.a.t;
import h.f.b.l;
import java.util.Map;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public Effect f111817a;

    /* renamed from: b  reason: collision with root package name */
    public h f111818b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f111819c;

    /* renamed from: d  reason: collision with root package name */
    public String f111820d;

    /* renamed from: e  reason: collision with root package name */
    public final MusicModel f111821e;

    /* renamed from: f  reason: collision with root package name */
    private f.a.b.b f111822f;

    /* renamed from: g  reason: collision with root package name */
    private f.a.b.b f111823g;

    /* renamed from: h  reason: collision with root package name */
    private final f f111824h;

    static {
        Covode.recordClassIndex(71882);
    }

    public abstract void a(Map<String, String> map, g gVar);

    public abstract f.a.d.f<q> c();

    public abstract f.a.d.f<p> d();

    public final void b() {
        h hVar = this.f111818b;
        if (hVar != null) {
            hVar.a((g) null);
        }
    }

    public final void a() {
        f.a.b.b bVar = this.f111822f;
        if (bVar != null && (!bVar.isDisposed())) {
            bVar.dispose();
        }
        f.a.b.b bVar2 = this.f111823g;
        if (bVar2 != null && (!bVar2.isDisposed())) {
            bVar2.dispose();
        }
        b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.ui.a$a  reason: collision with other inner class name */
    public static final class C2861a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f111825a;

        static {
            Covode.recordClassIndex(71883);
        }

        C2861a(a aVar) {
            this.f111825a = aVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            q qVar = (q) obj;
            l.d(qVar, "");
            this.f111825a.f111817a = qVar.f112031e;
            return qVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f111830a;

        static {
            Covode.recordClassIndex(71885);
        }

        c(a aVar) {
            this.f111830a = aVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            q qVar = (q) obj;
            l.d(qVar, "");
            this.f111830a.f111817a = qVar.f112031e;
            return qVar;
        }
    }

    private final f.a.b.b a(f.a.l.c<p> cVar) {
        f.a.b.b d2 = cVar.d(d());
        l.b(d2, "");
        return d2;
    }

    /* access modifiers changed from: protected */
    public final void a(Map<String, String> map) {
        f.a.l.c<p> cVar = new f.a.l.c<>();
        l.b(cVar, "");
        this.f111822f = a(cVar);
        this.f111823g = a(cVar, map);
    }

    public final void a(g gVar, boolean z) {
        a(null, gVar, z, this.f111820d);
    }

    /* access modifiers changed from: package-private */
    public static final class b<T1, T2, R> implements f.a.d.c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f111828a = new b();

        static {
            Covode.recordClassIndex(71884);
        }

        b() {
        }

        @Override // f.a.d.c
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            q qVar = (q) obj;
            q qVar2 = (q) obj2;
            l.d(qVar, "");
            l.d(qVar2, "");
            String str = qVar.f112027a;
            if (str == null) {
                str = qVar2.f112027a;
            }
            MusicWaveBean musicWaveBean = qVar.f112028b;
            if (musicWaveBean == null) {
                musicWaveBean = qVar2.f112028b;
            }
            Integer num = qVar.f112029c;
            if (num == null) {
                num = qVar2.f112029c;
            }
            com.ss.android.ugc.musicprovider.a aVar = qVar.f112030d;
            if (aVar == null) {
                aVar = qVar2.f112030d;
            }
            Effect effect = qVar.f112031e;
            if (effect == null) {
                effect = qVar2.f112031e;
            }
            Integer num2 = qVar.f112032f;
            if (num2 == null) {
                num2 = qVar2.f112032f;
            }
            ExceptionResult exceptionResult = qVar.f112033g;
            if (exceptionResult == null) {
                exceptionResult = qVar2.f112033g;
            }
            return new q(str, musicWaveBean, num, aVar, effect, num2, exceptionResult);
        }
    }

    private final f.a.b.b a(f.a.l.c<p> cVar, Map<String, String> map) {
        f.a.b.b d2 = t.a(o.a(this.f111824h, this.f111821e, cVar), n.a(this.f111819c, this.f111820d, this.f111817a, cVar, map).d(new C2861a(this)), b.f111828a).d(c());
        l.b(d2, "");
        return d2;
    }

    public a(Context context, String str, MusicModel musicModel, f fVar) {
        l.d(context, "");
        l.d(fVar, "");
        this.f111819c = context;
        this.f111820d = str;
        this.f111821e = musicModel;
        this.f111824h = fVar;
    }

    public final void a(Map<String, String> map, g gVar, boolean z, String str) {
        String str2;
        String str3;
        if (this.f111818b != null && gVar == null) {
            this.f111820d = str;
        } else if ((this.f111822f == null || this.f111823g == null || (!l.a((Object) this.f111820d, (Object) str))) && !z) {
            Effect effect = this.f111817a;
            if (effect != null) {
                str3 = effect.getId();
            } else {
                str3 = null;
            }
            if (!TextUtils.equals(str3, str)) {
                this.f111817a = null;
            }
            this.f111820d = str;
            this.f111818b = new h(gVar);
            a(map);
        } else if ((this.f111822f == null || this.f111823g == null || (!l.a((Object) this.f111820d, (Object) str))) && z) {
            Effect effect2 = this.f111817a;
            if (effect2 != null) {
                str2 = effect2.getId();
            } else {
                str2 = null;
            }
            if (!TextUtils.equals(str2, str)) {
                this.f111817a = null;
            }
            this.f111820d = str;
            this.f111818b = new h(gVar);
            f.a.l.c<p> cVar = new f.a.l.c<>();
            l.b(cVar, "");
            this.f111822f = a(cVar);
            Context context = this.f111819c;
            String str4 = this.f111820d;
            Effect effect3 = this.f111817a;
            l.d(context, "");
            l.d(cVar, "");
            t a2 = t.a(new o.b(cVar, str4, effect3, context, map));
            l.b(a2, "");
            f.a.b.b d2 = a2.d(new c(this)).d(c());
            l.b(d2, "");
            this.f111823g = d2;
        } else {
            this.f111820d = str;
            f.a.b.b bVar = this.f111823g;
            if (bVar == null) {
                l.b();
            }
            if (bVar.isDisposed()) {
                h hVar = this.f111818b;
                if (hVar != null) {
                    hVar.a(gVar);
                }
                this.f111822f = null;
                this.f111823g = null;
            } else if (gVar == null || !z) {
                a(map, gVar);
            } else {
                h hVar2 = this.f111818b;
                if (hVar2 != null) {
                    hVar2.a(gVar);
                }
                f.a.b.b bVar2 = this.f111822f;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                f.a.b.b bVar3 = this.f111823g;
                if (bVar3 != null) {
                    bVar3.dispose();
                }
                this.f111822f = null;
                this.f111823g = null;
                gVar.a(this.f111820d, null);
            }
        }
    }
}
