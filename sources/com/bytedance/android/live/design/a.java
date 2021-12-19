package com.bytedance.android.live.design;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9355a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9356b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9357c;

    static {
        Covode.recordClassIndex(4770);
    }

    private a() {
    }

    /* renamed from: com.bytedance.android.live.design.a$a  reason: collision with other inner class name */
    public static class C0139a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9358a = new a((byte) 0);

        static {
            Covode.recordClassIndex(4771);
        }
    }

    public final boolean a() {
        if (!this.f9355a) {
            return false;
        }
        if (!this.f9357c) {
            try {
                androidx.emoji.a.a.a();
                this.f9357c = true;
            } catch (IllegalStateException unused) {
            }
        }
        return this.f9357c;
    }

    /* synthetic */ a(byte b2) {
        this();
    }
}
