package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cz.a.f;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.draft.n;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.publish.a.a;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.hf;
import com.ss.android.ugc.aweme.video.e;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class cr implements f, n {

    /* renamed from: k  reason: collision with root package name */
    public static Boolean f125294k = false;
    public static boolean t = false;
    private static cr u;

    /* renamed from: a  reason: collision with root package name */
    public c f125295a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f125296b;

    /* renamed from: c  reason: collision with root package name */
    public c f125297c;

    /* renamed from: d  reason: collision with root package name */
    public List<AVChallenge> f125298d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public String f125299e;

    /* renamed from: f  reason: collision with root package name */
    public int f125300f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f125301g = false;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f125302h = false;

    /* renamed from: i  reason: collision with root package name */
    public Boolean f125303i = false;

    /* renamed from: j  reason: collision with root package name */
    public Boolean f125304j = false;

    /* renamed from: l  reason: collision with root package name */
    public a f125305l;

    /* renamed from: m  reason: collision with root package name */
    public AVChallenge f125306m = null;
    public Boolean n = false;
    public Boolean o = false;
    public String p = null;
    public String q;
    public RecordScene r;
    public volatile boolean s = false;
    private int v;

    @Override // com.ss.android.ugc.aweme.cz.a.f
    public final c b() {
        return this.f125295a;
    }

    public final void a(Collection<AVChallenge> collection) {
        if (collection != null) {
            this.f125298d.clear();
            this.f125298d.addAll(collection);
        }
    }

    public final void d() {
        this.o = false;
    }

    public final void e() {
        this.o = true;
    }

    public final String f() {
        String str = this.q;
        if (str != null) {
            return str;
        }
        return "";
    }

    public final void g() {
        this.f125298d.clear();
    }

    static {
        Covode.recordClassIndex(82268);
    }

    public static boolean h() {
        return AVServiceImpl.a().isPublishing(null);
    }

    public final boolean c() {
        Boolean bool = this.n;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private cr() {
        g.a().c().a(this);
    }

    public static cr a() {
        MethodCollector.i(3020);
        if (u == null) {
            synchronized (cr.class) {
                try {
                    if (u == null) {
                        u = new cr();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3020);
                    throw th;
                }
            }
        }
        cr crVar = u;
        MethodCollector.o(3020);
        return crVar;
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final void a(int i2) {
        g.a();
        this.v = i2;
        b(i2);
    }

    public static void a(RecordScene recordScene) {
        if (recordScene != null && recordScene.extractFramesModel != null) {
            e.e(recordScene.extractFramesModel.getExtractFramesDir());
            e.c(recordScene.extractFramesModel.getExtractFramesDir());
        }
    }

    private void b(int i2) {
        if (i2 == 9 || i2 == 10 || i2 == 12) {
            this.q = "";
        }
    }

    public static boolean a(Context context) {
        boolean h2 = h();
        if (!h2 && g.a().o().c()) {
            h2 = g.a().o().d() > 0;
        }
        if (h2) {
            g.a().o().k().a("open_camera", "check is already published: no ");
            new com.ss.android.ugc.aweme.tux.a.i.a(b(context)).a(R.string.fal).a();
            return false;
        }
        g.a().o().k().a("open_camera", "check is already published: yes ");
        return true;
    }

    public final void a(AVChallenge aVChallenge) {
        if (aVChallenge != null && aVChallenge.getCid() != null) {
            this.f125298d.clear();
            if (this.f125306m != null && "challenge".equals(this.f125299e) && !aVChallenge.getCid().equals(this.f125306m.getCid())) {
                this.f125298d.add(this.f125306m);
            }
            this.f125298d.add(aVChallenge);
        }
    }

    @Override // com.ss.android.ugc.aweme.cz.a.f
    public final void a(c cVar) {
        Object valueOf;
        this.f125295a = cVar;
        StringBuilder sb = new StringBuilder("PublishManager, set music, ");
        if (cVar == null) {
            valueOf = "null";
        } else {
            valueOf = Long.valueOf(cVar.id);
        }
        bj.d(sb.append(valueOf).append(" stacktrack: ").append(hf.a(8)).toString());
        this.f125296b = false;
    }

    public final void a(a aVar) {
        this.f125305l = (a) Objects.requireNonNull(aVar);
    }

    @Override // com.ss.android.ugc.aweme.draft.n
    public final void a(c cVar, boolean z) {
        if (!z) {
            this.q = "";
        }
    }

    public final void a(c cVar, boolean z) {
        Object valueOf;
        this.f125295a = cVar;
        StringBuilder sb = new StringBuilder("PublishManager, set music, ");
        if (cVar == null) {
            valueOf = "null";
        } else {
            valueOf = Long.valueOf(cVar.id);
        }
        bj.d(sb.append(valueOf).append(" stacktrack: ").append(hf.a(8)).append(" isPhotoMvMode:").append(z).toString());
        this.f125296b = z;
    }
}
