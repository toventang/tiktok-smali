package com.ss.android.ugc.aweme.aabplugin.core.base;

import android.app.Activity;
import android.content.Intent;
import b.i;
import c.b.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.aabplugin.core.base.a.b;
import com.ss.android.ugc.aweme.aabplugin.core.base.n;
import com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity;
import com.ss.android.ugc.aweme.activity.processor.f;
import com.ss.android.ugc.aweme.activity.processor.w;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Timer;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public abstract class m<T extends n> {

    /* renamed from: a  reason: collision with root package name */
    protected final int f62494a = -1;

    /* renamed from: b  reason: collision with root package name */
    protected final int f62495b = 1001;

    /* renamed from: c  reason: collision with root package name */
    protected final int f62496c = 8;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.aabplugin.core.base.a.b f62497d = new com.ss.android.ugc.aweme.aabplugin.core.base.a.b(new a(this));

    /* renamed from: e  reason: collision with root package name */
    public final q f62498e = new s();

    /* renamed from: f  reason: collision with root package name */
    protected boolean f62499f;

    /* renamed from: g  reason: collision with root package name */
    public volatile T f62500g;

    /* renamed from: h  reason: collision with root package name */
    protected volatile int f62501h;

    /* renamed from: i  reason: collision with root package name */
    public volatile com.bytedance.m.b.a f62502i;

    /* renamed from: j  reason: collision with root package name */
    public final String f62503j;

    static {
        Covode.recordClassIndex(38458);
    }

    public abstract void b();

    public abstract boolean b(com.bytedance.ies.foundation.activity.a aVar);

    public abstract void c();

    public void a() {
        this.f62497d.a();
        this.f62499f = false;
        this.f62502i = null;
        this.f62500g = null;
    }

    static final class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f62504a;

        static {
            Covode.recordClassIndex(38459);
        }

        a(m mVar) {
            this.f62504a = mVar;
        }

        @Override // com.ss.android.ugc.aweme.aabplugin.core.base.a.b.a
        public final void a() {
            m mVar = this.f62504a;
            T t = mVar.f62500g;
            if (t != null) {
                com.ss.android.ugc.aweme.aabplugin.core.base.a.c.a(t, 3, null);
                t.a(n.b.TIMEOUT);
                mVar.f62497d.a();
                a.a();
                a.b(t);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f62505a;

        static {
            Covode.recordClassIndex(38460);
        }

        b(String str) {
            this.f62505a = str;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            Activity validTopActivity = ActivityStack.getValidTopActivity();
            if (validTopActivity == null) {
                return null;
            }
            validTopActivity.getLocalClassName();
            Intent intent = new Intent(validTopActivity, DFInstallBlankActivity.class);
            intent.putExtra("module_name", this.f62505a);
            intent.putExtra("is_hold_permission_dialog", true);
            com.ss.android.ugc.tiktok.security.a.a.a(intent, validTopActivity);
            validTopActivity.startActivity(intent);
            validTopActivity.overridePendingTransition(0, 0);
            return z.f158842a;
        }
    }

    public final void d() {
        T t = this.f62500g;
        if (t != null) {
            int i2 = this.f62501h;
            try {
                JSONObject a2 = com.ss.android.ugc.aweme.aabplugin.core.base.a.c.a(t);
                a2.put("status", i2);
                r.b("df_cancel_progress_dialog", a2);
                com.bytedance.apm.b.a("df_cancel_progress_dialog", com.ss.android.ugc.aweme.aabplugin.core.base.a.c.a(i2), a2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (t.f62511e != n.b.RUNNING || !t.f62508b.f35055c) {
                a.a();
                a.b(t);
                return;
            }
            n.b(t, 8);
            t.a();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {
        final /* synthetic */ com.bytedance.ies.foundation.activity.a $ameSSActivity;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(38461);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar, com.bytedance.ies.foundation.activity.a aVar) {
            super(1);
            this.this$0 = mVar;
            this.$ameSSActivity = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(new h.f.a.a<com.bytedance.ies.foundation.base.a>(this) {
                /* class com.ss.android.ugc.aweme.aabplugin.core.base.m.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(38462);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.bytedance.ies.foundation.base.a invoke() {
                    return new f(new w(this) {
                        /* class com.ss.android.ugc.aweme.aabplugin.core.base.m.c.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f62506a;

                        static {
                            Covode.recordClassIndex(38463);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f62506a = r1;
                        }

                        @Override // com.ss.android.ugc.aweme.activity.processor.w
                        public final void a(int i2, int i3, Intent intent) {
                            int i4;
                            if (i2 == this.f62506a.this$0.this$0.f62496c) {
                                this.f62506a.this$0.$ameSSActivity.finish();
                                T t = this.f62506a.this$0.this$0.f62500g;
                                if (t != null) {
                                    try {
                                        JSONObject a2 = com.ss.android.ugc.aweme.aabplugin.core.base.a.c.a(t);
                                        a2.put("result_code", i3);
                                        r.b("df_click_permission_dialog", a2);
                                        if (i3 == 0) {
                                            i4 = 5;
                                        } else {
                                            i4 = 6;
                                        }
                                        com.bytedance.apm.b.a("df_click_permission_dialog", i4, a2);
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                    if (i3 == -1) {
                                        t.a(n.b.UNKNOWN);
                                    } else {
                                        a.a();
                                        a.b(t);
                                    }
                                    t.f62508b.f35063k.a(i3);
                                }
                            }
                        }
                    });
                }
            });
            return z.f158842a;
        }
    }

    public void a(T t) {
        l.d(t, "");
        t.a(n.b.UNKNOWN);
        this.f62500g = t;
        this.f62501h = this.f62494a;
        this.f62502i = null;
    }

    public m(String str) {
        l.d(str, "");
        this.f62503j = str;
    }

    public final boolean a(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        try {
            aVar.activityConfiguration(new c(this, aVar));
            return b(aVar);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void b(n nVar) {
        l.d(nVar, "");
        T t = this.f62500g;
        if (t != null && nVar.f62510d >= t.f62510d) {
            n.b(t, 10);
            l.d(nVar, "");
            t.f62508b = nVar.f62508b;
            t.f62507a = nVar.f62507a;
            t.o = nVar.o;
        }
        this.f62498e.a(0, this.f62500g);
    }

    /* access modifiers changed from: protected */
    public final synchronized void b(com.bytedance.m.b.a aVar) {
        boolean z;
        String str;
        long j2;
        l.d(aVar, "");
        T t = this.f62500g;
        if (t != null) {
            if (t.f62510d == 0) {
                z = true;
            } else {
                z = false;
            }
            if (aVar.f41329c == 2) {
                long j3 = this.f62497d.f62473d;
                if (j3 > 0) {
                    j2 = System.currentTimeMillis() - j3;
                } else {
                    j2 = -1;
                }
                aVar.f41332f = j2;
            }
            int i2 = this.f62501h;
            try {
                JSONObject a2 = com.ss.android.ugc.aweme.aabplugin.core.base.a.c.a(t);
                a2.put("pre_status", i2);
                a2.put("status", aVar.f41329c);
                a2.put("is_silent_install", t.f62507a);
                if (aVar.f41329c == 2) {
                    long j4 = aVar.f41331e;
                    long j5 = aVar.f41330d;
                    a2.put("bytes_downloaded", j4);
                    a2.put("bytes_to_download", j5);
                    if (j4 == j5) {
                        a2.put("download_duration", aVar.f41332f);
                    }
                } else if (aVar.f41329c == 6 || aVar.f41329c == 0) {
                    a2.put("error_code", aVar.f41333g);
                    if (aVar.f41335i != null) {
                        str = aVar.f41335i.getMessage();
                    } else {
                        str = "";
                    }
                    a2.put("error_msg", str);
                    a2.put("available_size", d.b(com.bytedance.ies.ugc.appcontext.d.a()));
                    a2.put("total_size", d.c(com.bytedance.ies.ugc.appcontext.d.a()));
                    a2.put("is_external_storage", com.ss.android.ugc.aweme.aabplugin.core.base.a.a.a());
                }
                r.b("df_state_change", a2);
                com.bytedance.apm.b.a("df_state_change", aVar.f41329c, a2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            int i3 = this.f62501h;
            l.d(t, "");
            l.d(aVar, "");
            try {
                JSONObject jSONObject = new JSONObject(t.c());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put("pre_status", i3);
                jSONObject.put("status", aVar.f41329c);
                jSONObject.put("is_silent_install", t.f62507a);
                if (aVar.f41329c == 2) {
                    long j6 = aVar.f41331e;
                    long j7 = aVar.f41330d;
                    jSONObject2.put("bytes_downloaded", j6);
                    jSONObject2.put("bytes_to_download", j7);
                    if (j6 == j7) {
                        jSONObject2.put("download_duration", aVar.f41332f);
                    }
                } else if (aVar.f41329c == 6 || aVar.f41329c == 0) {
                    jSONObject.put("error_code", aVar.f41333g);
                    jSONObject.put("is_external_storage", com.ss.android.ugc.aweme.aabplugin.core.base.a.a.a());
                    jSONObject2.put("available_size", d.b(com.bytedance.ies.ugc.appcontext.d.a()));
                    jSONObject2.put("total_size", d.c(com.bytedance.ies.ugc.appcontext.d.a()));
                }
                com.bytedance.apm.b.a("df_sdk_state_change", jSONObject, jSONObject2, (JSONObject) null);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            this.f62502i = aVar;
            a a3 = a.a();
            switch (aVar.f41329c) {
                case 0:
                    t.a(n.b.UNKNOWN);
                    this.f62501h = 0;
                    break;
                case 1:
                    if (this.f62501h != 1) {
                        this.f62498e.a(0, t);
                    }
                    t.a(n.b.PENDING);
                    this.f62501h = 1;
                    break;
                case 2:
                    if (this.f62501h != 2) {
                        com.ss.android.ugc.aweme.aabplugin.core.base.a.b bVar = this.f62497d;
                        long currentTimeMillis = System.currentTimeMillis();
                        bVar.f62473d = currentTimeMillis;
                        bVar.f62472c = currentTimeMillis;
                        if (t.f62508b.f35056d) {
                            com.ss.android.ugc.aweme.aabplugin.core.base.a.b bVar2 = this.f62497d;
                            if (bVar2.f62471b != null) {
                                bVar2.f62471b.cancel();
                            }
                            bVar2.f62471b = new Timer();
                            bVar2.f62471b.schedule(new b.C1367b(), 0, com.bytedance.ies.ugc.aweme.plugin.b.a.f35117c / 10);
                        }
                    }
                    this.f62497d.f62472c = System.currentTimeMillis();
                    t.a(aVar.f41331e, aVar.f41330d);
                    this.f62498e.a(1, t);
                    t.a(n.b.RUNNING);
                    this.f62501h = 2;
                    break;
                case 3:
                    t.a(n.b.DOWNLOADED);
                    this.f62501h = 3;
                    break;
                case 4:
                    if (this.f62501h != 4) {
                        if (t.f62508b.f35056d) {
                            this.f62497d.a();
                        }
                        this.f62497d.f62472c = System.currentTimeMillis();
                    }
                    t.a(aVar.f41331e, aVar.f41330d);
                    this.f62498e.a(2, t);
                    t.a(n.b.RUNNING);
                    this.f62501h = 4;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (this.f62501h != 5) {
                        n.a(t, 0);
                    }
                    t.a(n.b.SUCCEEDED);
                    this.f62501h = 5;
                    a3.a(this.f62503j);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (this.f62501h != 6) {
                        if (!t.f62507a) {
                            if (aVar.f41333g == -10) {
                                if (t.f62509c == null || t.f62509c.f35100d == null) {
                                    com.ss.android.ugc.aweme.aabplugin.core.base.a.f.a((int) R.string.ft6);
                                } else {
                                    com.ss.android.ugc.aweme.aabplugin.core.base.a.f.a(t.f62509c.f35100d);
                                }
                            } else if (t.f62509c == null || t.f62509c.f35099c == null) {
                                com.ss.android.ugc.aweme.aabplugin.core.base.a.f.a((int) R.string.c49);
                            } else {
                                com.ss.android.ugc.aweme.aabplugin.core.base.a.f.a(t.f62509c.f35099c);
                            }
                        }
                        t.a(aVar.f41333g, z);
                        if (t.f62508b.f35054b) {
                            int i4 = aVar.f41333g;
                            if (i4 != -100) {
                                switch (i4) {
                                    case -15:
                                    case -14:
                                    case -5:
                                    case -2:
                                    case 0:
                                        break;
                                }
                            }
                            long j8 = t.f62508b.f35058f;
                            if (j8 == 0) {
                                a3.c(t);
                            } else {
                                a3.a(t, j8);
                            }
                        }
                    }
                    t.a(n.b.FAILED);
                    this.f62501h = 6;
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    if (this.f62501h != 7) {
                        if (t.f62511e == n.b.TIMEOUT) {
                            if (t.f62508b.f35056d && !this.f62499f) {
                                t.a(n.b.UNKNOWN);
                                if (a3.d(t)) {
                                    this.f62499f = true;
                                    return;
                                }
                                a3.a(t, com.bytedance.ies.ugc.aweme.plugin.b.a.f35115a);
                            }
                            if (!t.f62507a) {
                                if (t.f62509c == null || t.f62509c.f35102f == null) {
                                    com.ss.android.ugc.aweme.aabplugin.core.base.a.f.a((int) R.string.da_);
                                } else {
                                    com.ss.android.ugc.aweme.aabplugin.core.base.a.f.a(t.f62509c.f35102f);
                                }
                            }
                        } else if (t.f62508b.f35055c) {
                            a3.a(t, com.bytedance.ies.ugc.aweme.plugin.b.a.f35115a);
                        }
                        t.a(9, z);
                    }
                    t.a(n.b.CANCELED);
                    this.f62501h = 7;
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    t.a(n.b.RUNNING);
                    this.f62501h = 8;
                    this.f62497d.a();
                    if (!t.f62508b.f35053a) {
                        a.b(t);
                        break;
                    } else {
                        i.b(new b(this.f62503j), i.f4826c);
                        return;
                    }
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    t.a(n.b.RUNNING);
                    this.f62501h = 9;
                    break;
            }
            if (t.f62511e.isFinished()) {
                this.f62498e.a(3, t);
                a();
                a a4 = a.a();
                a4.c();
                a4.b();
            }
        }
    }
}
