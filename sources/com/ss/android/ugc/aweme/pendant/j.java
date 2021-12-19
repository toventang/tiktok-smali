package com.ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import h.a.z;
import h.f.b.l;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class j implements c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f114690f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public f f114691a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f114692b;

    /* renamed from: c  reason: collision with root package name */
    public final List<l> f114693c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f114694d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f114695e = new Object();

    /* renamed from: g  reason: collision with root package name */
    private String f114696g = "";

    /* renamed from: h  reason: collision with root package name */
    private List<String> f114697h = z.INSTANCE;

    /* renamed from: i  reason: collision with root package name */
    private String f114698i = "";

    /* renamed from: j  reason: collision with root package name */
    private final Keva f114699j = Keva.getRepo("pendant_lottie_keva");

    /* renamed from: k  reason: collision with root package name */
    private String f114700k;

    static {
        Covode.recordClassIndex(73806);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73807);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f114701a;

        static {
            Covode.recordClassIndex(73808);
        }

        b(j jVar) {
            this.f114701a = jVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            f fVar = this.f114701a.f114691a;
            if (fVar != null) {
                z = fVar.f();
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.pendant.c
    public final String a() {
        if (this.f114692b) {
            f fVar = this.f114691a;
            if (fVar != null) {
                return fVar.d();
            }
            return null;
        }
        throw new Throwable("HAS NOT inited");
    }

    @Override // com.ss.android.ugc.aweme.pendant.c
    public final void b() {
        if (this.f114700k == null) {
            this.f114700k = this.f114699j.getString("previous_activity_id", "");
        }
        String str = this.f114700k;
        if (str == null) {
            l.b();
        }
        new f("newpendant", str, this.f114697h, this.f114698i).e();
    }

    static final class c<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f114702a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f114703b;

        static {
            Covode.recordClassIndex(73809);
        }

        c(j jVar, Context context) {
            this.f114702a = jVar;
            this.f114703b = context;
        }

        public static final class a implements l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f114704a;

            static {
                Covode.recordClassIndex(73810);
            }

            @Override // com.ss.android.ugc.aweme.pendant.l
            public final void a() {
                MethodCollector.i(4950);
                this.f114704a.f114702a.f114694d = false;
                synchronized (this.f114704a.f114702a.f114695e) {
                    try {
                        Iterator<T> it = this.f114704a.f114702a.f114693c.iterator();
                        while (it.hasNext()) {
                            it.next().a();
                        }
                        this.f114704a.f114702a.f114693c.clear();
                    } finally {
                        MethodCollector.o(4950);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.pendant.l
            public final void b() {
                MethodCollector.i(4951);
                this.f114704a.f114702a.f114694d = false;
                synchronized (this.f114704a.f114702a.f114695e) {
                    try {
                        Iterator<T> it = this.f114704a.f114702a.f114693c.iterator();
                        while (it.hasNext()) {
                            it.next().b();
                        }
                        this.f114704a.f114702a.f114693c.clear();
                    } finally {
                        MethodCollector.o(4951);
                    }
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(c cVar) {
                this.f114704a = cVar;
            }
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            l.b(iVar, "");
            Object d2 = iVar.d();
            l.b(d2, "");
            if (((Boolean) d2).booleanValue()) {
                this.f114702a.f114694d = false;
                for (l lVar : this.f114702a.f114693c) {
                    lVar.a();
                }
                this.f114702a.f114693c.clear();
            } else {
                a aVar = new a(this);
                f fVar = this.f114702a.f114691a;
                if (fVar != null) {
                    fVar.a(this.f114703b, aVar);
                }
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.pendant.c
    public final InputStream a(int i2) {
        if (this.f114692b) {
            f fVar = this.f114691a;
            if (fVar == null) {
                return null;
            }
            String str = "new_year_normal_button";
            if (i2 != 0) {
                if (i2 == 1) {
                    str = "new_year_normal_button_collapsed";
                } else if (i2 == 2) {
                    str = "campagin_reward_lottie";
                } else if (i2 == 3) {
                    str = "coin2";
                }
            }
            return fVar.a(str);
        }
        throw new Throwable("HAS NOT inited");
    }

    @Override // com.ss.android.ugc.aweme.pendant.c
    public final void a(Context context) {
        l.d(context, "");
        if (!this.f114692b) {
            throw new Throwable("HAS NOT inited");
        } else if (!this.f114694d) {
            this.f114694d = true;
            i.b(new b(this), i.f4824a).a(new c(this, context), i.f4826c, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.pendant.c
    public final void a(l lVar) {
        MethodCollector.i(5479);
        l.d(lVar, "");
        synchronized (this.f114695e) {
            try {
                this.f114693c.add(lVar);
            } finally {
                MethodCollector.o(5479);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.pendant.c
    public final void a(String str, List<String> list, String str2) {
        l.d(str, "");
        l.d(list, "");
        l.d(str2, "");
        if (!this.f114692b) {
            if (TextUtils.isEmpty(str)) {
                str = "default_activity";
            }
            this.f114696g = str;
            this.f114697h = list;
            this.f114698i = str2;
            this.f114692b = true;
            this.f114699j.storeString("previous_activity_id", str);
            this.f114691a = new f("newpendant", this.f114696g, list, str2);
            String string = this.f114699j.getString("previous_activity_id", "");
            this.f114700k = string;
            if (!TextUtils.isEmpty(string) && !TextUtils.equals(str, this.f114700k)) {
                b();
            }
        }
    }
}
