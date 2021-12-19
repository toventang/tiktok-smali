package dmt.av.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.tools.c;
import com.ss.android.vesdk.x;
import com.ss.android.vesdk.z;

public final class VEEditorAutoStartStopArbiter implements au {

    /* renamed from: a  reason: collision with root package name */
    public boolean f156721a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f156722b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f156723c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f156724d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f156725e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f156726f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f156727g = true;

    /* renamed from: h  reason: collision with root package name */
    private Context f156728h;

    /* renamed from: i  reason: collision with root package name */
    private BroadcastReceiver f156729i;

    /* renamed from: j  reason: collision with root package name */
    private g f156730j;

    public interface a {
        static {
            Covode.recordClassIndex(104098);
        }

        void g();
    }

    static {
        Covode.recordClassIndex(104094);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        if (!this.f156722b && !this.f156724d) {
            a();
        }
        this.f156727g = false;
    }

    public final void b() {
        if (!this.f156721a) {
            try {
                if (this.f156730j.f() != x.j.STARTED) {
                    this.f156730j.t();
                }
            } catch (Exception e2) {
                c.f149151f.b(e2.toString());
            }
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        if (!this.f156722b && !this.f156724d && !this.f156725e && this.f156726f && !this.f156723c) {
            b();
        }
        this.f156727g = true;
    }

    public final void a() {
        if (!this.f156721a) {
            try {
                if (this.f156730j.f() != x.j.PAUSED) {
                    this.f156730j.u();
                }
            } catch (z e2) {
                if (e2.getRetCd() != -105) {
                    throw e2;
                }
            }
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        if (this.f156729i != null) {
            try {
                c.f149151f.d("Unregister Receiver " + this.f156728h + " " + this.f156729i);
                this.f156728h.unregisterReceiver(this.f156729i);
                this.f156729i = null;
            } catch (Exception e2) {
                c.f149151f.b(e2.toString());
            }
        } else {
            c.f149151f.b("Receiver not registered");
        }
        this.f156727g = false;
    }

    public final void a(boolean z) {
        a(z, false);
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = this.f156721a;
        if (z3 != z) {
            if (z3) {
                if (!z2) {
                    this.f156730j.t();
                }
                Context context = this.f156728h;
                if (context instanceof a) {
                    ((a) context).g();
                }
            } else {
                this.f156730j.u();
            }
            this.f156721a = z;
        }
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.VEEditorAutoStartStopArbiter.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public VEEditorAutoStartStopArbiter(Context context, final m mVar, g gVar, SurfaceView surfaceView, final boolean z) {
        this.f156726f = z;
        this.f156728h = context;
        this.f156730j = gVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.f156729i = new BroadcastReceiver() {
            /* class dmt.av.video.VEEditorAutoStartStopArbiter.AnonymousClass1 */

            static {
                Covode.recordClassIndex(104095);
            }

            public final void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF") && !VEEditorAutoStartStopArbiter.this.f156722b && !VEEditorAutoStartStopArbiter.this.f156724d) {
                    VEEditorAutoStartStopArbiter.this.a();
                }
            }
        };
        int i2 = Build.VERSION.SDK_INT;
        ((ViewGroup) surfaceView.getParent()).getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() {
            /* class dmt.av.video.VEEditorAutoStartStopArbiter.AnonymousClass2 */

            static {
                Covode.recordClassIndex(104096);
            }

            public final void onWindowFocusChanged(boolean z) {
                if (z && mVar.getLifecycle().a().isAtLeast(i.b.RESUMED) && !VEEditorAutoStartStopArbiter.this.f156722b && z && !VEEditorAutoStartStopArbiter.this.f156723c) {
                    VEEditorAutoStartStopArbiter.this.b();
                }
            }
        });
        b(this.f156728h, this.f156729i, intentFilter);
        c.f149151f.d("Register Receiver " + this.f156728h + " " + this.f156729i);
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback2() {
            /* class dmt.av.video.VEEditorAutoStartStopArbiter.AnonymousClass3 */

            static {
                Covode.recordClassIndex(104097);
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
            }
        });
        mVar.getLifecycle().a(this);
    }
}
