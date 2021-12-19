package com.bytedance.android.livesdk.chatroom.model.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static int f15686c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static int f15687d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static int f15688e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final a f15689f = new a((byte) 0);
    @c(a = "total_time")

    /* renamed from: a  reason: collision with root package name */
    public int f15690a = 60;
    @c(a = "enable_type")

    /* renamed from: b  reason: collision with root package name */
    public int f15691b;

    public static final class a {
        static {
            Covode.recordClassIndex(8669);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean a() {
        if (this.f15691b > 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f15691b == f15686c) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f15691b == f15687d) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f15691b == f15688e) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(8668);
    }
}
