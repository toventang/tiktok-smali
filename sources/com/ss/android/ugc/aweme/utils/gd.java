package com.ss.android.ugc.aweme.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.block.g;
import com.bytedance.apm.trace.b.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.at.i;
import com.ss.android.ugc.aweme.at.k;
import h.f.b.l;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class gd implements cz {

    /* renamed from: d  reason: collision with root package name */
    public static final a f142973d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public i f142974a;

    /* renamed from: b  reason: collision with root package name */
    public final String f142975b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f142976c = false;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.apm.trace.b.b f142977e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f142978f;

    /* renamed from: g  reason: collision with root package name */
    private long f142979g;

    /* renamed from: h  reason: collision with root package name */
    private long f142980h;

    /* renamed from: i  reason: collision with root package name */
    private dl f142981i;

    static {
        Covode.recordClassIndex(93563);
    }

    @Override // com.ss.android.ugc.aweme.utils.cz
    public final void c() {
        this.f142981i = null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(93564);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.cz
    public final void a() {
        g.a(this.f142975b);
        if (!this.f142978f) {
            this.f142978f = true;
            this.f142979g = SystemClock.uptimeMillis();
            com.bytedance.apm.trace.b.b bVar = this.f142977e;
            if (bVar != null) {
                bVar.a();
            }
            dl dlVar = this.f142981i;
            if (dlVar != null) {
                dlVar.a(this.f142975b);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.cz
    public final void b() {
        g.b(this.f142975b);
        if (this.f142978f) {
            this.f142978f = false;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f142980h = uptimeMillis;
            i iVar = this.f142974a;
            if (iVar != null) {
                iVar.f67066a = uptimeMillis - this.f142979g;
            }
            com.bytedance.apm.trace.b.b bVar = this.f142977e;
            if (bVar != null) {
                bVar.b();
            }
            dl dlVar = this.f142981i;
            if (dlVar != null) {
                dlVar.b(this.f142975b);
            }
            this.f142979g = 0;
            this.f142980h = 0;
        }
    }

    public static final class d extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ gd f142984a;

        static {
            Covode.recordClassIndex(93567);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(gd gdVar) {
            this.f142984a = gdVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            if (i2 != 0) {
                this.f142984a.a();
            } else {
                this.f142984a.b();
            }
        }
    }

    public static final class e extends ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ gd f142985a;

        static {
            Covode.recordClassIndex(93568);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(gd gdVar) {
            this.f142985a = gdVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            if (i2 != 0) {
                this.f142985a.a();
            } else {
                this.f142985a.b();
            }
        }
    }

    static final class b implements b.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ gd f142982a;

        static {
            Covode.recordClassIndex(93565);
        }

        b(gd gdVar) {
            this.f142982a = gdVar;
        }

        @Override // com.bytedance.apm.trace.b.b.d
        public final void a(double d2) {
            i iVar = this.f142982a.f142974a;
            if (iVar != null) {
                iVar.f67067b = d2;
            }
        }
    }

    static final class c implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ gd f142983a;

        static {
            Covode.recordClassIndex(93566);
        }

        c(gd gdVar) {
            this.f142983a = gdVar;
        }

        @Override // com.bytedance.apm.trace.b.b.c
        public final void a(JSONObject jSONObject) {
            i iVar = this.f142983a.f142974a;
            if (iVar != null) {
                iVar.a(jSONObject);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.cz
    public final cz a(dl dlVar) {
        l.d(dlVar, "");
        this.f142981i = dlVar;
        return this;
    }

    public gd(String str) {
        l.d(str, "");
        this.f142975b = str;
        this.f142977e = new com.bytedance.apm.trace.b.b(str, i.a.a(str));
        this.f142974a = new i(str);
        com.bytedance.apm.trace.b.b bVar = this.f142977e;
        if (bVar != null) {
            bVar.a(new b(this));
        }
        com.bytedance.apm.trace.b.b bVar2 = this.f142977e;
        if (bVar2 != null) {
            bVar2.a(new c(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.cz
    public final void a(RecyclerView recyclerView) {
        if (!TextUtils.equals(this.f142975b, "user_profile")) {
            k.a(this.f142975b);
        }
        if (recyclerView != null) {
            recyclerView.a(new d(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.cz
    public final void a(com.ss.android.ugc.aweme.common.widget.b bVar) {
        k.a(this.f142975b);
        if (bVar != null) {
            bVar.a(new e(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.cz
    public final cz a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        i iVar = this.f142974a;
        if (iVar != null) {
            l.d(str, "");
            l.d(str2, "");
            iVar.f67068c.put(str, str2);
        }
        return this;
    }
}
