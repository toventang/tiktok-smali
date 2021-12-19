package com.bytedance.tux.extension.player.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class a implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public static final C1100a f44925b = new C1100a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f44926a = true;

    /* renamed from: c  reason: collision with root package name */
    private final long f44927c = 300;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f44928d = new b(this);

    static {
        Covode.recordClassIndex(27420);
    }

    public abstract void a(View view);

    /* renamed from: com.bytedance.tux.extension.player.a.a$a  reason: collision with other inner class name */
    public static final class C1100a {
        static {
            Covode.recordClassIndex(27421);
        }

        private C1100a() {
        }

        public /* synthetic */ C1100a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f44929a;

        static {
            Covode.recordClassIndex(27422);
        }

        b(a aVar) {
            this.f44929a = aVar;
        }

        public final void run() {
            this.f44929a.f44926a = true;
        }
    }

    public void onClick(View view) {
        l.c(view, "");
        if (this.f44926a) {
            this.f44926a = false;
            view.postDelayed(this.f44928d, this.f44927c);
            a(view);
        }
    }
}
