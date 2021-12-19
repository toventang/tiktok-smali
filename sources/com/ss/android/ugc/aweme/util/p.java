package com.ss.android.ugc.aweme.util;

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

public final class p {

    /* renamed from: j  reason: collision with root package name */
    public static final a f142534j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f142535a = true;

    /* renamed from: b  reason: collision with root package name */
    public String f142536b;

    /* renamed from: c  reason: collision with root package name */
    public long f142537c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f142538d;

    /* renamed from: e  reason: collision with root package name */
    public String f142539e;

    /* renamed from: f  reason: collision with root package name */
    public int f142540f;

    /* renamed from: g  reason: collision with root package name */
    public AtomicInteger f142541g = new AtomicInteger(-2);

    /* renamed from: h  reason: collision with root package name */
    public final TextView f142542h;

    /* renamed from: i  reason: collision with root package name */
    public final TextSwitcher f142543i;

    /* renamed from: k  reason: collision with root package name */
    private final h f142544k = i.a((h.f.a.a) b.f142547a);

    /* renamed from: l  reason: collision with root package name */
    private final List<Object> f142545l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private final h f142546m = i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(93218);
    }

    public final Handler a() {
        return (Handler) this.f142544k.getValue();
    }

    public final Runnable b() {
        return (Runnable) this.f142546m.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(93219);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(93221);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new Runnable(this) {
                /* class com.ss.android.ugc.aweme.util.p.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f142548a;

                static {
                    Covode.recordClassIndex(93222);
                }

                public final void run() {
                    int andSet = this.f142548a.this$0.f142541g.getAndSet(-2);
                    if (andSet != -2) {
                        this.f142548a.this$0.f142540f = andSet;
                    } else {
                        this.f142548a.this$0.f142540f++;
                    }
                    List<String> list = this.f142548a.this$0.f142538d;
                    if (list == null || list.isEmpty()) {
                        this.f142548a.this$0.a().removeCallbacks(this);
                        return;
                    }
                    this.f142548a.this$0.a(this.f142548a.this$0.f142540f, true);
                    long j2 = this.f142548a.this$0.f142537c;
                    if (j2 > 0) {
                        this.f142548a.this$0.a().postDelayed(this, j2);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f142548a = r1;
                }
            };
        }
    }

    static final class b extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f142547a = new b();

        static {
            Covode.recordClassIndex(93220);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public final void a(List<String> list) {
        this.f142538d = list;
        this.f142540f = -1;
    }

    public static /* synthetic */ void a(p pVar) {
        pVar.a(0, false);
        long j2 = pVar.f142537c;
        if (pVar.f142535a) {
            List<String> list = pVar.f142538d;
            if (list != null && list.size() > 1) {
                pVar.a().removeCallbacks(pVar.b());
                if (j2 < 0) {
                    j2 = 0;
                }
                pVar.a().postDelayed(pVar.b(), j2);
            }
            pVar.f142535a = false;
        }
    }

    public p(TextView textView, TextSwitcher textSwitcher) {
        l.d(textSwitcher, "");
        this.f142542h = textView;
        this.f142543i = textSwitcher;
    }

    public final void a(int i2, boolean z) {
        List<String> list = this.f142538d;
        if (list != null && !list.isEmpty()) {
            this.f142540f = i2;
            if (i2 < 0 || i2 >= list.size()) {
                this.f142540f = 0;
            }
            String str = list.get(this.f142540f);
            this.f142536b = str;
            if (z) {
                this.f142543i.setText(str);
            } else {
                this.f142543i.setCurrentText(str);
            }
            Iterator<T> it = this.f142545l.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
