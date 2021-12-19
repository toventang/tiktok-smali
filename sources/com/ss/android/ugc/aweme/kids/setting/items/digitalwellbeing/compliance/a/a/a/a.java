package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.a.a.a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(68384);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.a.a.a.a$a  reason: collision with other inner class name */
    public static class C2743a {

        /* renamed from: a  reason: collision with root package name */
        private Class<? extends Fragment> f106918a;

        /* renamed from: b  reason: collision with root package name */
        private Bundle f106919b;

        static {
            Covode.recordClassIndex(68385);
        }

        public final Fragment a() {
            try {
                Fragment fragment = (Fragment) this.f106918a.newInstance();
                if (!this.f106919b.isEmpty()) {
                    fragment.setArguments(this.f106919b);
                }
                return fragment;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        private C2743a(Class<? extends Fragment> cls) {
            this.f106918a = cls;
            this.f106919b = new Bundle();
        }

        /* synthetic */ C2743a(Class cls, byte b2) {
            this(cls);
        }

        public final C2743a a(String str, int i2) {
            this.f106919b.putInt(str, i2);
            return this;
        }

        public final C2743a a(String str, boolean z) {
            this.f106919b.putBoolean(str, z);
            return this;
        }
    }

    public static C2743a a(Class<? extends Fragment> cls) {
        return new C2743a(cls, (byte) 0);
    }
}
