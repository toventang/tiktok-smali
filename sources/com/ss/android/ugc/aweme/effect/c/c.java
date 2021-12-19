package com.ss.android.ugc.aweme.effect.c;

import android.app.Activity;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.widget.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class c implements MessageCenter.Listener {

    /* renamed from: f  reason: collision with root package name */
    public static final a f88931f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f88932a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f88933b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, b> f88934c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public int f88935d;

    /* renamed from: e  reason: collision with root package name */
    public final Activity f88936e;

    static {
        Covode.recordClassIndex(55930);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55931);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public c(Activity activity) {
        l.d(activity, "");
        this.f88936e = activity;
    }

    public final void a(int i2) {
        MessageCenter.removeListener(this);
        this.f88933b = false;
        this.f88932a = 0;
        for (Map.Entry<Integer, b> entry : this.f88934c.entrySet()) {
            if (entry.getKey().intValue() == i2) {
                entry.getValue().f88918b = false;
                entry.getValue().f88917a = 0;
            }
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i2, int i3, int i4, String str) {
        if (i2 == 81) {
            String.valueOf(this.f88932a);
            for (Map.Entry<Integer, b> entry : this.f88934c.entrySet()) {
                if (entry.getKey().intValue() == this.f88935d) {
                    entry.getValue().f88917a++;
                }
            }
            b bVar = this.f88934c.get(Integer.valueOf(this.f88935d));
            if (bVar != null && bVar.f88917a == 3 && !bVar.f88919c) {
                d.a(this.f88936e, (int) R.string.d64).b();
                bVar.f88919c = true;
                this.f88934c.put(Integer.valueOf(this.f88935d), bVar);
            }
        }
    }
}
