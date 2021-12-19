package com.bytedance.android.livesdk.newvideogift.a;

import android.content.Context;
import android.os.Handler;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.f.j;
import com.bytedance.android.livesdk.livesetting.gift.GiftPlayerAutoReleaseSwitchSetting;
import com.bytedance.android.livesdk.newvideogift.a.j;
import com.bytedance.android.livesdkapi.depend.d.a.c;
import com.bytedance.android.livesdkapi.depend.d.a.d;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Context f19865a;

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f19866b;

    /* renamed from: c  reason: collision with root package name */
    public c f19867c;

    /* renamed from: d  reason: collision with root package name */
    public d f19868d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.d.a.a f19869e;

    /* renamed from: f  reason: collision with root package name */
    a f19870f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f19871g = new c(this);

    /* renamed from: h  reason: collision with root package name */
    public boolean f19872h = true;

    /* renamed from: i  reason: collision with root package name */
    public long f19873i;

    /* renamed from: j  reason: collision with root package name */
    public long f19874j;

    /* renamed from: k  reason: collision with root package name */
    public long f19875k;

    /* renamed from: l  reason: collision with root package name */
    private long f19876l = 15000;

    public interface a {
        static {
            Covode.recordClassIndex(11770);
        }
    }

    static {
        Covode.recordClassIndex(11768);
    }

    public final void b() {
        if (GiftPlayerAutoReleaseSwitchSetting.INSTANCE.getValue().f19785a) {
            j.a().removeCallbacks(this.f19871g);
            long j2 = GiftPlayerAutoReleaseSwitchSetting.INSTANCE.getValue().f19786b;
            Handler a2 = j.a();
            Runnable runnable = this.f19871g;
            if (j2 <= 0) {
                j2 = this.f19876l;
            }
            a2.postDelayed(runnable, j2);
        }
    }

    public final void a() {
        if (Thread.currentThread() != null) {
            com.bytedance.android.live.core.c.a.a(3, "GiftCtlManager", Thread.currentThread().getStackTrace());
        }
        com.bytedance.android.live.core.c.a.a(3, "GiftCtlManager", "controller release() called with [" + this.f19869e + "]");
        j.a().removeCallbacks(this.f19871g);
        com.bytedance.android.livesdkapi.depend.d.a.a aVar = this.f19869e;
        if (aVar != null) {
            aVar.b();
            this.f19869e.d();
            this.f19869e.e();
            this.f19869e.b(this.f19866b);
        }
        this.f19869e = null;
        e.a().b(this.f19865a.hashCode());
    }

    public b(Context context, FrameLayout frameLayout, final c cVar, a aVar, d dVar) {
        this.f19865a = context;
        this.f19866b = frameLayout;
        this.f19868d = dVar;
        this.f19870f = aVar;
        this.f19867c = new c() {
            /* class com.bytedance.android.livesdk.newvideogift.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(11769);
            }

            @Override // com.bytedance.android.livesdkapi.depend.d.a.c
            public final void a() {
                b.this.f19872h = false;
                c cVar = cVar;
                if (cVar != null) {
                    cVar.a();
                }
            }

            @Override // com.bytedance.android.livesdkapi.depend.d.a.c
            public final void b() {
                b.this.f19872h = true;
                c cVar = cVar;
                if (cVar != null) {
                    cVar.b();
                }
                b.this.b();
                j.a(j.a.playcontroller_end, b.this.f19873i, b.this.f19874j, b.this.f19875k);
            }

            @Override // com.bytedance.android.livesdkapi.depend.d.a.c
            public final void a(float f2, float f3, float f4, float f5) {
                c cVar = cVar;
                if (cVar != null) {
                    cVar.a(f2, f3, f4, f5);
                }
            }
        };
    }
}
