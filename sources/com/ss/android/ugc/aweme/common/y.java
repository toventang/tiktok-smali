package com.ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class y {

    /* renamed from: d  reason: collision with root package name */
    public static final a f76614d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f76615a;

    /* renamed from: b  reason: collision with root package name */
    public String f76616b;

    /* renamed from: c  reason: collision with root package name */
    public int f76617c;

    static {
        Covode.recordClassIndex(47300);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47301);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static y a(String str) {
            l.d(str, "");
            return a(str, 1, 66667);
        }

        public static y b(String str) {
            l.d(str, "");
            return a(str, 1, 66667);
        }

        public static y c(String str) {
            l.d(str, "");
            return a(str, 1, 66667);
        }

        public static y a(String str, int i2) {
            l.d(str, "");
            return a(str, i2, 66667);
        }

        public static y a(String str, boolean z) {
            l.d(str, "");
            return a(str, z ? 1 : 0, 66666);
        }

        public static y a(String str, int i2, int i3) {
            y yVar = new y();
            yVar.f76615a = i3;
            yVar.f76616b = str;
            yVar.f76617c = i2;
            return yVar;
        }
    }
}
