package com.facebook.a;

import android.content.Intent;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.covode.number.Covode;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.a.g;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ae;
import com.facebook.internal.q;
import com.facebook.internal.r;
import com.facebook.internal.w;
import com.facebook.m;
import com.facebook.u;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    static final String f46695a = e.class.getName();

    /* renamed from: b  reason: collision with root package name */
    public static final ScheduledExecutorService f46696b;

    /* renamed from: c  reason: collision with root package name */
    private static final Integer f46697c = 100;

    /* renamed from: d  reason: collision with root package name */
    private static volatile d f46698d = new d();

    /* renamed from: e  reason: collision with root package name */
    private static ScheduledFuture f46699e;

    /* renamed from: f  reason: collision with root package name */
    private static final Runnable f46700f = new Runnable() {
        /* class com.facebook.a.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(28458);
        }

        public final void run() {
            if (!a.a(this)) {
                try {
                    e.b();
                    if (h.a() != g.a.EXPLICIT_ONLY) {
                        e.b(j.TIMER);
                    }
                } catch (Throwable th) {
                    a.a(th, this);
                }
            }
        }
    };

    e() {
    }

    static /* synthetic */ ScheduledFuture b() {
        if (a.a(e.class)) {
            return null;
        }
        try {
            f46699e = null;
            return null;
        } catch (Throwable th) {
            a.a(th, e.class);
            return null;
        }
    }

    static /* synthetic */ d c() {
        if (a.a(e.class)) {
            return null;
        }
        try {
            return f46698d;
        } catch (Throwable th) {
            a.a(th, e.class);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(28457);
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        f46696b = (ScheduledExecutorService) com.ss.android.ugc.aweme.cw.g.a(a2.a());
    }

    public static Set<a> a() {
        if (a.a(e.class)) {
            return null;
        }
        try {
            return f46698d.a();
        } catch (Throwable th) {
            a.a(th, e.class);
            return null;
        }
    }

    static /* synthetic */ d a(d dVar) {
        if (a.a(e.class)) {
            return null;
        }
        try {
            f46698d = dVar;
            return dVar;
        } catch (Throwable th) {
            a.a(th, e.class);
            return null;
        }
    }

    static void b(j jVar) {
        if (!a.a(e.class)) {
            try {
                f46698d.a(f.a());
                try {
                    l a2 = a(jVar, f46698d);
                    if (a2 != null) {
                        Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                        intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", a2.f46873a);
                        intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", a2.f46874b);
                        ae.a();
                        LocalBroadcastManager.getInstance(m.f48921g).sendBroadcast(intent);
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                a.a(th, e.class);
            }
        }
    }

    public static void a(final j jVar) {
        if (!a.a(e.class)) {
            try {
                f46696b.execute(new Runnable() {
                    /* class com.facebook.a.e.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(28460);
                    }

                    public final void run() {
                        if (!a.a(this)) {
                            try {
                                e.b(jVar);
                            } catch (Throwable th) {
                                a.a(th, this);
                            }
                        }
                    }
                });
            } catch (Throwable th) {
                a.a(th, e.class);
            }
        }
    }

    private static List<GraphRequest> a(d dVar, l lVar) {
        if (a.a(e.class)) {
            return null;
        }
        try {
            ae.a();
            boolean c2 = m.c(m.f48921g);
            ArrayList arrayList = new ArrayList();
            for (a aVar : dVar.a()) {
                GraphRequest a2 = a(aVar, dVar.a(aVar), c2, lVar);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            a.a(th, e.class);
            return null;
        }
    }

    private static l a(j jVar, d dVar) {
        if (a.a(e.class)) {
            return null;
        }
        try {
            l lVar = new l();
            List<GraphRequest> a2 = a(dVar, lVar);
            if (a2.size() <= 0) {
                return null;
            }
            w.a(u.APP_EVENTS, f46695a, "Flushing %d events due to %s.", Integer.valueOf(lVar.f46873a), jVar.toString());
            for (GraphRequest graphRequest : a2) {
                GraphRequest.a(graphRequest);
            }
            return lVar;
        } catch (Throwable th) {
            a.a(th, e.class);
            return null;
        }
    }

    private static GraphRequest a(final a aVar, final o oVar, boolean z, final l lVar) {
        if (a.a(e.class)) {
            return null;
        }
        try {
            String applicationId = aVar.getApplicationId();
            boolean z2 = false;
            q a2 = r.a(applicationId, false);
            final GraphRequest a3 = GraphRequest.a((AccessToken) null, com.a.a("%s/activities", new Object[]{applicationId}), (JSONObject) null, (GraphRequest.b) null);
            Bundle bundle = a3.f46548j;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("access_token", aVar.getAccessTokenString());
            String d2 = h.d();
            if (d2 != null) {
                bundle.putString("device_token", d2);
            }
            String e2 = h.e();
            if (e2 != null) {
                bundle.putString("install_referrer", e2);
            }
            a3.f46548j = bundle;
            if (a2 != null) {
                z2 = a2.f48640a;
            }
            ae.a();
            int a4 = oVar.a(a3, m.f48921g, z2, z);
            if (a4 == 0) {
                return null;
            }
            lVar.f46873a += a4;
            a3.a((GraphRequest.b) new GraphRequest.b() {
                /* class com.facebook.a.e.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(28461);
                }

                @Override // com.facebook.GraphRequest.b
                public final void a(com.facebook.r rVar) {
                    String str;
                    a aVar = aVar;
                    GraphRequest graphRequest = a3;
                    o oVar = oVar;
                    l lVar = lVar;
                    if (!a.a(e.class)) {
                        try {
                            FacebookRequestError facebookRequestError = rVar.f49019d;
                            String str2 = "Success";
                            k kVar = k.SUCCESS;
                            boolean z = true;
                            if (facebookRequestError != null) {
                                if (facebookRequestError.f46526d == -1) {
                                    str2 = "Failed: No Connectivity";
                                    kVar = k.NO_CONNECTIVITY;
                                } else {
                                    str2 = com.a.a("Failed:\n  Response: %s\n  Error %s", new Object[]{rVar.toString(), facebookRequestError.toString()});
                                    kVar = k.SERVER_ERROR;
                                }
                            }
                            if (m.a(u.APP_EVENTS)) {
                                try {
                                    str = new JSONArray((String) graphRequest.f46550l).toString(2);
                                } catch (JSONException unused) {
                                    str = "<Can't encode events for debug logging>";
                                }
                                w.a(u.APP_EVENTS, e.f46695a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", graphRequest.f46544f.toString(), str2, str);
                            }
                            if (facebookRequestError == null) {
                                z = false;
                            }
                            oVar.a(z);
                            if (kVar == k.NO_CONNECTIVITY) {
                                m.c().execute(new Runnable(aVar, oVar) {
                                    /* class com.facebook.a.e.AnonymousClass5 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ a f46706a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ o f46707b;

                                    static {
                                        Covode.recordClassIndex(28462);
                                    }

                                    public final void run() {
                                        if (!a.a(this)) {
                                            try {
                                                f.a(this.f46706a, this.f46707b);
                                            } catch (Throwable th) {
                                                a.a(th, this);
                                            }
                                        }
                                    }

                                    {
                                        this.f46706a = r1;
                                        this.f46707b = r2;
                                    }
                                });
                            }
                            if (kVar != k.SUCCESS && lVar.f46874b != k.NO_CONNECTIVITY) {
                                lVar.f46874b = kVar;
                            }
                        } catch (Throwable th) {
                            a.a(th, e.class);
                        }
                    }
                }
            });
            return a3;
        } catch (Throwable th) {
            a.a(th, e.class);
            return null;
        }
    }
}
