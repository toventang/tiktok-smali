package com.ss.android.ugc.aweme.profile.ui;

import android.os.SystemClock;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class b extends cs implements aq {

    /* renamed from: a  reason: collision with root package name */
    public static final a f116908a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f116909b;

    static {
        Covode.recordClassIndex(75500);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75501);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.b$b  reason: collision with other inner class name */
    public static final class C2974b {

        /* renamed from: a  reason: collision with root package name */
        static long f116917a = -1;

        /* renamed from: b  reason: collision with root package name */
        static String f116918b;

        /* renamed from: c  reason: collision with root package name */
        static String f116919c = "";

        /* renamed from: d  reason: collision with root package name */
        public static final C2974b f116920d = new C2974b();

        private C2974b() {
        }

        static {
            Covode.recordClassIndex(75502);
        }

        public static void a(String str) {
            l.d(str, "");
            f116919c = str;
        }

        public static void a(String str, String str2) {
            f116918b = str;
            if (str2 == null) {
                str2 = "";
            }
            f116919c = str2;
            f116917a = SystemClock.uptimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f116909b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }
}
