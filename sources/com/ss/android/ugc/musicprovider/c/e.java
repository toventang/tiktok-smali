package com.ss.android.ugc.musicprovider.c;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.music.e.h;
import com.ss.android.ugc.aweme.music.service.c;
import com.ss.ttvideoengine.aj;
import com.toutiao.proxyserver.a.a;
import com.toutiao.proxyserver.v;
import h.f.b.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class e implements c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f148607b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.musicprovider.interfaces.b f148608a;

    /* renamed from: c  reason: collision with root package name */
    private aj f148609c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.musicprovider.interfaces.c f148610d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.musicprovider.interfaces.a f148611e;

    /* renamed from: f  reason: collision with root package name */
    private long f148612f;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.musicprovider.a.a f148613g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.music.e.b f148614h;

    /* renamed from: i  reason: collision with root package name */
    private final String f148615i;

    static {
        Covode.recordClassIndex(97939);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97940);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ e() {
        this("");
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f148616a;

        static {
            Covode.recordClassIndex(97941);
        }

        b(e eVar) {
            this.f148616a = eVar;
        }

        public final void run() {
            com.ss.android.ugc.musicprovider.interfaces.b bVar = this.f148616a.f148608a;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a() {
        try {
            com.ss.android.ugc.aweme.music.e.b bVar = this.f148614h;
            if (bVar != null) {
                bVar.a();
            }
            aj ajVar = this.f148609c;
            if (ajVar != null) {
                ajVar.l();
            }
            aj ajVar2 = this.f148609c;
            if (ajVar2 != null) {
                ajVar2.m();
            }
        } catch (Exception e2) {
            a(e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void b() {
        try {
            com.ss.android.ugc.aweme.music.e.b bVar = this.f148614h;
            if (bVar != null) {
                bVar.a();
            }
            aj ajVar = this.f148609c;
            if (ajVar != null) {
                ajVar.l();
            }
        } catch (Exception e2) {
            a(e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void d() {
        try {
            com.ss.android.ugc.aweme.music.e.b bVar = this.f148614h;
            if (bVar != null) {
                bVar.a();
            }
            aj ajVar = this.f148609c;
            if (ajVar != null) {
                ajVar.k();
            }
        } catch (Exception e2) {
            a(e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void c() {
        try {
            a();
            aj ajVar = this.f148609c;
            if (ajVar != null) {
                ajVar.m();
            }
            this.f148609c = null;
            d dVar = d.f148585j;
            com.ss.android.ugc.musicprovider.interfaces.c cVar = this.f148610d;
            if (cVar != null && l.a(dVar.f148594h, cVar)) {
                dVar.f148594h = null;
            }
            d dVar2 = d.f148585j;
            com.ss.android.ugc.musicprovider.interfaces.a aVar = this.f148611e;
            if (aVar != null && l.a(dVar2.f148593g, aVar)) {
                dVar2.f148593g = null;
            }
            d dVar3 = d.f148585j;
            com.ss.android.ugc.musicprovider.interfaces.b bVar = this.f148608a;
            if (bVar != null && l.a(dVar3.f148592f, bVar)) {
                dVar3.f148592f = null;
            }
            d.f148585j.f148591e = "";
        } catch (Exception e2) {
            a(e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a(com.ss.android.ugc.musicprovider.interfaces.a aVar) {
        this.f148611e = aVar;
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a(com.ss.android.ugc.musicprovider.interfaces.b bVar) {
        this.f148608a = bVar;
    }

    private final void a(Exception exc) {
        b(exc);
        d.f148585j.a(new b(this));
    }

    public e(String str) {
        this.f148615i = str;
        d dVar = d.f148585j;
        if (dVar.f148587a == null) {
            dVar.f148587a = new aj(d.a(), 0);
            aj ajVar = dVar.f148587a;
            if (ajVar != null) {
                ajVar.a(dVar.f148595i);
            }
        }
        this.f148609c = dVar.f148587a;
        this.f148614h = h.a();
    }

    private final void b(Exception exc) {
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f148612f;
        com.ss.android.ugc.musicprovider.a.a aVar = this.f148613g;
        if (aVar != null && exc != null) {
            String obj = aVar.f148532b.toString();
            aj ajVar = this.f148609c;
            String str2 = null;
            if (ajVar != null) {
                str = ajVar.r();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.music.ui.b.c.a(-1, elapsedRealtime, obj, str, exc.getMessage(), this.f148615i);
            String str3 = aVar.f148536f;
            String obj2 = aVar.f148532b.toString();
            aj ajVar2 = this.f148609c;
            if (ajVar2 != null) {
                str2 = ajVar2.r();
            }
            com.ss.android.ugc.aweme.music.ui.b.b.a(str3, obj2, str2, exc.getMessage());
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a(com.ss.android.ugc.musicprovider.interfaces.c cVar) {
        this.f148610d = cVar;
    }

    @Override // com.ss.android.ugc.aweme.music.service.c
    public final void a(com.ss.android.ugc.musicprovider.a.a aVar, boolean z) {
        aj ajVar;
        l.d(aVar, "");
        try {
            com.ss.android.ugc.aweme.music.e.b bVar = this.f148614h;
            if (bVar != null) {
                bVar.a();
            }
            a.C4113a.f154764a.f154762a.set(1);
            a.C4113a.f154764a.f154763b.set(0);
            boolean isEmpty = TextUtils.isEmpty(aVar.f148531a);
            boolean a2 = com.bytedance.common.utility.collection.b.a((Collection) aVar.f148532b);
            if ((!isEmpty || !a2) && (ajVar = this.f148609c) != null) {
                ajVar.m();
                ajVar.h(z);
                this.f148612f = SystemClock.elapsedRealtime();
                d.f148585j.f148590d = this.f148612f;
                HashMap<String, String> hashMap = aVar.f148535e;
                if (hashMap != null) {
                    for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                        ajVar.a(entry.getKey(), entry.getValue());
                    }
                }
                if (!isEmpty) {
                    ajVar.f(aVar.f148531a);
                } else if (!a2) {
                    String str = aVar.f148536f;
                    if (str == null || str.length() == 0) {
                        com.ss.android.ugc.aweme.framework.a.a.a(3, "TTMusicPlayer", "music id is null");
                    }
                    com.ss.android.ugc.aweme.music.e.e.a(aVar.f148536f, aVar.f148532b.toString(), "play");
                    v a3 = v.a();
                    String str2 = aVar.f148536f;
                    List<String> list = aVar.f148532b;
                    l.b(list, "");
                    Object[] array = list.toArray(new String[0]);
                    if (array != null) {
                        String[] strArr = (String[]) array;
                        ajVar.h(a3.a(str2, true, (String[]) Arrays.copyOf(strArr, strArr.length)));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                this.f148613g = aVar;
                d.f148585j.f148594h = this.f148610d;
                d.f148585j.f148593g = this.f148611e;
                d.f148585j.f148592f = this.f148608a;
                d.f148585j.f148589c = this.f148613g;
                d.f148585j.f148591e = this.f148615i;
                ajVar.k();
            }
        } catch (Exception e2) {
            a(e2);
        }
    }
}
