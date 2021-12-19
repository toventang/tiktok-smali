package com.ss.android.ugc.aweme.discover.c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.discover.adapter.i;
import com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;
import h.z;

public final class d implements u<p<? extends Integer, ? extends Long>> {

    /* renamed from: a  reason: collision with root package name */
    public MusicPlayHelper f80904a;

    /* renamed from: b  reason: collision with root package name */
    public Animation f80905b;

    /* renamed from: c  reason: collision with root package name */
    public String f80906c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.a<z> f80907d;

    /* renamed from: e  reason: collision with root package name */
    public Music f80908e;

    /* renamed from: f  reason: collision with root package name */
    public String f80909f;

    /* renamed from: g  reason: collision with root package name */
    public String f80910g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f80911h;

    /* renamed from: i  reason: collision with root package name */
    public e f80912i;

    /* renamed from: j  reason: collision with root package name */
    public i f80913j;

    /* renamed from: k  reason: collision with root package name */
    public final a f80914k;

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final C1888a f80916a = C1888a.f80917a;

        static {
            Covode.recordClassIndex(50299);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.c.d$a$a  reason: collision with other inner class name */
        public static final class C1888a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ C1888a f80917a = new C1888a();

            private C1888a() {
            }

            static {
                Covode.recordClassIndex(50300);
            }
        }
    }

    static {
        Covode.recordClassIndex(50297);
    }

    private final void a() {
        long j2;
        this.f80911h.clearAnimation();
        MusicPlayHelper musicPlayHelper = this.f80904a;
        Music music = this.f80908e;
        long j3 = -1;
        if (music != null) {
            j2 = music.getId();
        } else {
            j2 = -1;
        }
        if (musicPlayHelper.a(j2)) {
            this.f80911h.setImageResource(2131233583);
            this.f80904a.a(this.f80912i, this);
            return;
        }
        MusicPlayHelper musicPlayHelper2 = this.f80904a;
        Music music2 = this.f80908e;
        if (music2 != null) {
            j3 = music2.getId();
        }
        if (musicPlayHelper2.b(j3)) {
            this.f80911h.setImageResource(2131233591);
            this.f80911h.startAnimation(this.f80905b);
            return;
        }
        this.f80911h.setImageResource(2131233592);
        this.f80904a.a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(p<? extends Integer, ? extends Long> pVar) {
        a();
    }

    public final void a(Music music) {
        this.f80908e = music;
        a();
    }

    public final void b(String str) {
        l.d(str, "");
        this.f80909f = str;
    }

    public final void c(String str) {
        l.d(str, "");
        this.f80910g = str;
    }

    public final void a(String str) {
        l.d(str, "");
        this.f80906c = str;
    }

    public final boolean b(Music music) {
        long j2;
        MusicPlayHelper musicPlayHelper = this.f80904a;
        long j3 = -1;
        if (music != null) {
            j2 = music.getId();
        } else {
            j2 = -1;
        }
        if (musicPlayHelper.a(j2)) {
            return true;
        }
        MusicPlayHelper musicPlayHelper2 = this.f80904a;
        if (music != null) {
            j3 = music.getId();
        }
        if (musicPlayHelper2.b(j3)) {
            return true;
        }
        return false;
    }

    private d(ImageView imageView, e eVar, i iVar) {
        l.d(imageView, "");
        l.d(eVar, "");
        MethodCollector.i(3243);
        this.f80911h = imageView;
        this.f80912i = eVar;
        this.f80913j = iVar;
        this.f80914k = null;
        ac a2 = ae.a(eVar, (ad.b) null).a(MusicPlayHelper.class);
        l.b(a2, "");
        this.f80904a = (MusicPlayHelper) a2;
        this.f80905b = AnimationUtils.loadAnimation(this.f80912i, R.anim.db);
        this.f80906c = "";
        this.f80909f = "";
        this.f80910g = "";
        this.f80911h.setVisibility(0);
        this.f80911h.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.discover.c.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f80915a;

            static {
                Covode.recordClassIndex(50298);
            }

            {
                this.f80915a = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
            /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r10) {
                /*
                // Method dump skipped, instructions count: 169
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.c.d.AnonymousClass1.onClick(android.view.View):void");
            }
        });
        MethodCollector.o(3243);
    }

    private /* synthetic */ d(ImageView imageView, e eVar, i iVar, byte b2) {
        this(imageView, eVar, iVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(ImageView imageView, e eVar, i iVar, h.f.a.a<z> aVar) {
        this(imageView, eVar, iVar, (byte) 0);
        l.d(imageView, "");
        l.d(eVar, "");
        l.d(aVar, "");
        this.f80907d = aVar;
    }
}
