package com.ss.android.ugc.aweme.discover.widget;

import android.os.Handler;
import android.os.Looper;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f82827j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f82828a = true;

    /* renamed from: b  reason: collision with root package name */
    public String f82829b;

    /* renamed from: c  reason: collision with root package name */
    public long f82830c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f82831d;

    /* renamed from: e  reason: collision with root package name */
    public String f82832e;

    /* renamed from: f  reason: collision with root package name */
    public int f82833f;

    /* renamed from: g  reason: collision with root package name */
    public AtomicInteger f82834g = new AtomicInteger(-2);

    /* renamed from: h  reason: collision with root package name */
    public final List<AbstractC1947b> f82835h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final TextView f82836i;

    /* renamed from: k  reason: collision with root package name */
    private final h f82837k = i.a((h.f.a.a) c.f82840a);

    /* renamed from: l  reason: collision with root package name */
    private final h f82838l = i.a((h.f.a.a) new d(this));

    /* renamed from: m  reason: collision with root package name */
    private final TextSwitcher f82839m;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.b$b  reason: collision with other inner class name */
    public interface AbstractC1947b {
        static {
            Covode.recordClassIndex(51624);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(51622);
    }

    private final Runnable c() {
        return (Runnable) this.f82838l.getValue();
    }

    public final Handler a() {
        return (Handler) this.f82837k.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51623);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(51626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new Runnable(this) {
                /* class com.ss.android.ugc.aweme.discover.widget.b.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f82841a;

                static {
                    Covode.recordClassIndex(51627);
                }

                public final void run() {
                    int andSet = this.f82841a.this$0.f82834g.getAndSet(-2);
                    if (andSet != -2) {
                        this.f82841a.this$0.f82833f = andSet;
                    } else {
                        this.f82841a.this$0.f82833f++;
                    }
                    List<String> list = this.f82841a.this$0.f82831d;
                    if (list == null || list.isEmpty()) {
                        this.f82841a.this$0.a().removeCallbacks(this);
                        return;
                    }
                    this.f82841a.this$0.a(this.f82841a.this$0.f82833f, true);
                    long j2 = this.f82841a.this$0.f82830c;
                    if (j2 > 0) {
                        this.f82841a.this$0.a().postDelayed(this, j2);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f82841a = r1;
                }
            };
        }
    }

    static final class c extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f82840a = new c();

        static {
            Covode.recordClassIndex(51625);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public final void b() {
        a().removeCallbacks(c());
        this.f82828a = true;
    }

    private final void d() {
        Iterator<T> it = this.f82835h.iterator();
        while (it.hasNext()) {
            it.next().a(this.f82833f);
        }
    }

    /* access modifiers changed from: private */
    public void a(long j2) {
        if (this.f82828a) {
            List<String> list = this.f82831d;
            if (list != null && list.size() > 1) {
                a().removeCallbacks(c());
                if (j2 < 0) {
                    j2 = 0;
                }
                a().postDelayed(c(), j2);
            }
            this.f82828a = false;
        }
    }

    public b(TextView textView, TextSwitcher textSwitcher) {
        l.d(textSwitcher, "");
        this.f82836i = textView;
        this.f82839m = textSwitcher;
    }

    public final void a(int i2, boolean z) {
        List<String> list = this.f82831d;
        if (list != null && !list.isEmpty()) {
            this.f82833f = i2;
            if (i2 < 0 || i2 >= list.size()) {
                this.f82833f = 0;
            }
            String str = list.get(this.f82833f);
            this.f82829b = str;
            if (z) {
                this.f82839m.setText(str);
            } else {
                this.f82839m.setCurrentText(str);
            }
            d();
        }
    }
}
