package com.ss.android.ugc.aweme.editSticker.text.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewModel;
import com.ss.android.ugc.aweme.editSticker.text.c.b;
import com.ss.android.ugc.aweme.editSticker.text.c.d;
import com.ss.android.ugc.aweme.editSticker.text.view.q;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public d f88397a;

    /* renamed from: b  reason: collision with root package name */
    public float f88398b;

    /* renamed from: c  reason: collision with root package name */
    public float f88399c;

    /* renamed from: d  reason: collision with root package name */
    public float f88400d;

    /* renamed from: e  reason: collision with root package name */
    public float f88401e;

    /* renamed from: f  reason: collision with root package name */
    public long f88402f;

    /* renamed from: g  reason: collision with root package name */
    public float f88403g;

    /* renamed from: h  reason: collision with root package name */
    public float f88404h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f88405i;

    /* renamed from: j  reason: collision with root package name */
    public int f88406j = 2;

    /* renamed from: k  reason: collision with root package name */
    public final int f88407k = 200;

    /* renamed from: l  reason: collision with root package name */
    public int f88408l = 3000;

    /* renamed from: m  reason: collision with root package name */
    public int f88409m;
    public int n;
    public boolean o;
    public SafeHandler p;
    public q q;
    public boolean r;
    public boolean s;
    public com.ss.android.ugc.aweme.editSticker.text.c.a t;
    public b u;
    public com.ss.android.ugc.aweme.editSticker.c.b v = com.ss.android.ugc.aweme.editSticker.c.a.f88100a;
    private Runnable w = new a(this, (byte) 0);
    private a x;
    private EditTextStickerViewModel y;

    static {
        Covode.recordClassIndex(55588);
    }

    public final boolean a() {
        if (this.f88406j == 3) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f88406j != 2) {
            return true;
        }
        return false;
    }

    private EditTextStickerViewModel e() {
        if (this.y == null) {
            this.y = (EditTextStickerViewModel) t.a((androidx.fragment.app.e) this.q.getContext()).a(EditTextStickerViewModel.class);
        }
        return this.y;
    }

    public final boolean c() {
        if (this.q.getData() != null) {
            return this.q.getData().getHasReadTextAudio();
        }
        return false;
    }

    public final boolean d() {
        a aVar = this.x;
        if (aVar != null) {
            return aVar.a();
        }
        return e().i();
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        static {
            Covode.recordClassIndex(55589);
        }

        public final void run() {
            e.this.f88405i = false;
            if (e.this.q != null) {
                e.this.q.invalidate();
            }
            boolean c2 = e.this.c();
            if (e.this.t != null) {
                e.this.t.a(false, true, c2);
            }
        }

        private a() {
        }

        /* synthetic */ a(e eVar, byte b2) {
            this();
        }
    }

    public e(a aVar) {
        this.x = aVar;
    }

    public final void a(boolean z) {
        this.f88405i = z;
        Runnable runnable = this.w;
        if (runnable != null) {
            this.q.removeCallbacks(runnable);
            this.w = null;
        }
        if (z && this.p != null && this.w == null) {
            a aVar = new a(this, (byte) 0);
            this.w = aVar;
            this.q.postDelayed(aVar, (long) this.f88408l);
        }
        this.q.invalidate();
        boolean c2 = c();
        com.ss.android.ugc.aweme.editSticker.text.c.a aVar2 = this.t;
        if (aVar2 != null) {
            aVar2.a(z, false, c2);
        }
    }

    public final boolean a(float f2, float f3) {
        this.f88402f = System.currentTimeMillis();
        float f4 = f2 - ((float) this.f88409m);
        float f5 = f3 - ((float) this.n);
        this.f88400d = f4;
        this.f88401e = f5;
        boolean z = false;
        if (this.s) {
            this.f88406j = 2;
            this.s = false;
        }
        if (this.f88406j == 2 || d()) {
            boolean b2 = this.q.b(f4, f5);
            this.o = b2;
            if (b2) {
                this.f88406j = 3;
                this.f88403g = f4;
                this.f88404h = f5;
                z = true;
                d dVar = this.f88397a;
                if (dVar != null) {
                    dVar.e(this.q);
                }
            }
        }
        return z;
    }
}
