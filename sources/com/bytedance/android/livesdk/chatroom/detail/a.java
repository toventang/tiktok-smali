package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.media.AudioManager;
import androidx.core.app.d;
import androidx.lifecycle.i;
import com.bytedance.android.live.n.e;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.event.i;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.covode.number.Covode;

public class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public int f15219a;

    /* renamed from: b  reason: collision with root package name */
    final AudioManager.OnAudioFocusChangeListener f15220b = new AudioManager.OnAudioFocusChangeListener() {
        /* class com.bytedance.android.livesdk.chatroom.detail.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(8432);
        }

        public final void onAudioFocusChange(int i2) {
            com.bytedance.android.live.core.c.a.a(3, "AudioFocusController", "change audio:" + i2 + ", mFocusRespondEnabled:" + a.this.f15221c);
            a.this.f15219a = i2;
            if (a.this.f15221c) {
                if (i2 == -2 || i2 == -3) {
                    a.this.f15222d = System.currentTimeMillis();
                    a aVar = a.this;
                    aVar.a(true, aVar.f15223e, a.this.f15224f);
                    com.bytedance.android.livesdk.an.a.a().a(new i(true, true));
                } else if (i2 == 1) {
                    if (!(a.this.f15223e instanceof androidx.fragment.app.e) || ((d) a.this.f15223e).getLifecycle().a().isAtLeast(i.b.RESUMED)) {
                        a.this.f15222d = -1;
                        a aVar2 = a.this;
                        aVar2.a(false, aVar2.f15223e, a.this.f15224f);
                    }
                } else if (i2 == -1) {
                    a.this.f15222d = System.currentTimeMillis();
                    a aVar3 = a.this;
                    aVar3.a(true, aVar3.f15223e, a.this.f15224f);
                    com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.event.i(true, true));
                }
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public boolean f15221c = false;

    /* renamed from: d  reason: collision with root package name */
    public long f15222d = -1;

    /* renamed from: e  reason: collision with root package name */
    public Context f15223e;

    /* renamed from: f  reason: collision with root package name */
    public String f15224f;

    /* renamed from: g  reason: collision with root package name */
    private final g f15225g;

    static {
        Covode.recordClassIndex(8431);
    }

    @Override // com.bytedance.android.live.n.e
    public final void a(Context context) {
        a(context, g.a.a(context));
    }

    public final void b(Context context) {
        b(context, g.a.a(context));
    }

    public a(g gVar) {
        this.f15225g = gVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.f15221c = z;
        if (z && this.f15219a == -1) {
            this.f15222d = System.currentTimeMillis();
            a(true, this.f15223e, this.f15224f);
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.event.i(true, true));
        }
    }

    public final void b(Context context, String str) {
        a(true, context, str);
        com.bytedance.android.livesdk.utils.d.b(this.f15220b);
        com.bytedance.android.livesdk.utils.d.b();
    }

    public final void a(Context context, String str) {
        this.f15223e = context;
        this.f15224f = str;
        com.bytedance.android.livesdk.utils.d.a(this.f15220b);
        boolean z = true;
        if (com.bytedance.android.livesdk.utils.d.a() == 1) {
            this.f15222d = -1;
            z = false;
        } else if (this.f15221c) {
            this.f15222d = System.currentTimeMillis();
        } else {
            this.f15222d = -1;
            z = false;
        }
        a(z, context, str);
    }

    public final void a(boolean z, Context context, String str) {
        g gVar = this.f15225g;
        if (gVar == null) {
            return;
        }
        if (gVar instanceof k) {
            ((k) gVar).a(z, str);
        } else {
            gVar.a(z, context);
        }
    }
}
