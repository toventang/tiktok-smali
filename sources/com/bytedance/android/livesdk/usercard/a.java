package com.bytedance.android.livesdk.usercard;

import android.view.View;
import com.bytedance.covode.number.Covode;

public abstract class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    static boolean f21792a = true;

    /* renamed from: c  reason: collision with root package name */
    private static final Runnable f21793c = b.f21830a;

    /* renamed from: b  reason: collision with root package name */
    public long f21794b;

    public abstract void a();

    public a() {
        this((byte) 0);
    }

    static {
        Covode.recordClassIndex(12839);
    }

    private a(byte b2) {
        this.f21794b = 500;
    }

    public final void onClick(View view) {
        if (f21792a) {
            f21792a = false;
            view.postDelayed(f21793c, this.f21794b);
            a();
        }
    }
}
