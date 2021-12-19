package com.bytedance.common.utility.e;

import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final b f26935a = new c();

    /* access modifiers changed from: package-private */
    public interface b {
        static {
            Covode.recordClassIndex(15902);
        }

        void a(SharedPreferences.Editor editor);
    }

    /* renamed from: com.bytedance.common.utility.e.a$a  reason: collision with other inner class name */
    static class C0578a implements b {
        static {
            Covode.recordClassIndex(15901);
        }

        C0578a() {
        }

        @Override // com.bytedance.common.utility.e.a.b
        public final void a(SharedPreferences.Editor editor) {
            editor.commit();
        }
    }

    static class c implements b {
        static {
            Covode.recordClassIndex(15903);
        }

        c() {
        }

        @Override // com.bytedance.common.utility.e.a.b
        public final void a(SharedPreferences.Editor editor) {
            editor.apply();
        }
    }

    static {
        Covode.recordClassIndex(15900);
        int i2 = Build.VERSION.SDK_INT;
    }

    public static void a(SharedPreferences.Editor editor) {
        if (editor != null) {
            f26935a.a(editor);
        }
    }
}
