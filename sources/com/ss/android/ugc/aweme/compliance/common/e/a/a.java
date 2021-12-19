package com.ss.android.ugc.aweme.compliance.common.e.a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(47822);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.e.a.a$a  reason: collision with other inner class name */
    public static class C1780a {

        /* renamed from: a  reason: collision with root package name */
        private Class<? extends Fragment> f77327a;

        /* renamed from: b  reason: collision with root package name */
        private Bundle f77328b;

        static {
            Covode.recordClassIndex(47823);
        }

        public final Fragment a() {
            try {
                Fragment fragment = (Fragment) this.f77327a.newInstance();
                if (!this.f77328b.isEmpty()) {
                    fragment.setArguments(this.f77328b);
                }
                return fragment;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        private C1780a(Class<? extends Fragment> cls) {
            this.f77327a = cls;
            this.f77328b = new Bundle();
        }

        /* synthetic */ C1780a(Class cls, byte b2) {
            this(cls);
        }

        public final C1780a a(String str, int i2) {
            this.f77328b.putInt(str, i2);
            return this;
        }

        public final C1780a a(String str, boolean z) {
            this.f77328b.putBoolean(str, z);
            return this;
        }
    }

    public static C1780a a(Class<? extends Fragment> cls) {
        return new C1780a(cls, (byte) 0);
    }
}
