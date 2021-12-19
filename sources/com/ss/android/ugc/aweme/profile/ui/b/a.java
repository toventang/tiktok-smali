package com.ss.android.ugc.aweme.profile.ui.b;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.jato.gcblocker.GcBlocker;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.d;
import com.ss.android.common.c.a;
import com.ss.android.ugc.aweme.experiment.fo;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.utils.cz;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.dl;
import com.ss.android.ugc.aweme.utils.fr;
import h.f.b.l;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static boolean f116910d;

    /* renamed from: e  reason: collision with root package name */
    public static final C2973a f116911e = new C2973a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f116912a;

    /* renamed from: b  reason: collision with root package name */
    public String f116913b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f116914c;

    /* renamed from: f  reason: collision with root package name */
    private final dl f116915f;

    static {
        Covode.recordClassIndex(75503);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.b.a$a  reason: collision with other inner class name */
    public static final class C2973a {
        static {
            Covode.recordClassIndex(75504);
        }

        private C2973a() {
        }

        public /* synthetic */ C2973a(byte b2) {
            this();
        }
    }

    public final void a() {
        cz b2 = da.a.b(b());
        if (b2 != null) {
            b2.a(this.f116915f);
        }
    }

    public final String b() {
        StringBuilder sb = new StringBuilder("profile_");
        String str = this.f116913b;
        if (str == null) {
            str = "";
        }
        return sb.append(str).toString();
    }

    public static final class b implements dl {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f116916a;

        static {
            Covode.recordClassIndex(75505);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f116916a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.dl
        public final void a(String str) {
            l.d(str, "");
            a.f116910d = true;
            if (fo.f90054a) {
                fr.a(5000);
            }
            if (fo.f90055b) {
                fr.b(5000);
            }
            if (fo.f90056c) {
                fr.c(5000);
            }
        }

        @Override // com.ss.android.ugc.aweme.utils.dl
        public final void b(String str) {
            String str2;
            l.d(str, "");
            a.f116910d = false;
            cz b2 = da.a.b(this.f116916a.b());
            if (b2 != null) {
                if (this.f116916a.f116912a) {
                    str2 = "personal_homepage";
                } else {
                    str2 = "others_homepage";
                }
                b2.a("enter_from", str2);
            }
            if (fo.f90054a) {
                p.f107614a.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.utils.fr.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(93539);
                    }

                    public final void run() {
                        GcBlocker.b();
                    }
                });
            }
            if (fo.f90055b) {
                p.f107614a.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.utils.fr.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(93542);
                    }

                    public final void run() {
                        a.a();
                    }
                });
            }
            if (fo.f90056c) {
                d.f41460d = false;
            }
        }
    }

    public a(boolean z, String str, RecyclerView recyclerView) {
        this.f116912a = z;
        this.f116913b = str;
        this.f116914c = recyclerView;
        b bVar = new b(this);
        this.f116915f = bVar;
        da.a.a(b()).a(bVar).a(recyclerView);
    }
}
