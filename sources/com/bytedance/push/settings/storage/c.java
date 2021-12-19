package com.bytedance.push.settings.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    public final String f42328a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f42329b;

    static {
        Covode.recordClassIndex(25858);
    }

    final class a implements SharedPreferences.Editor {

        /* renamed from: b  reason: collision with root package name */
        private final Context f42331b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, String> f42332c = new ConcurrentHashMap();

        /* renamed from: d  reason: collision with root package name */
        private final SharedPreferences.Editor f42333d;

        static {
            Covode.recordClassIndex(25859);
        }

        public final SharedPreferences.Editor clear() {
            throw new UnsupportedOperationException("clear not support");
        }

        public final void apply() {
            this.f42333d.apply();
            a();
        }

        public final boolean commit() {
            boolean commit = this.f42333d.commit();
            a();
            return commit;
        }

        private void a() {
            for (Map.Entry<String, String> entry : this.f42332c.entrySet()) {
                PushProvider.a(this.f42331b, c.this.f42328a, entry.getKey(), entry.getValue()).run();
            }
            this.f42332c.clear();
        }

        public final SharedPreferences.Editor remove(String str) {
            this.f42333d.remove(str);
            this.f42332c.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            throw new UnsupportedOperationException("not support putStringSet");
        }

        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f42333d.putBoolean(str, z);
            if (z == c.this.a(str, false)) {
                this.f42332c.remove(str);
            } else {
                this.f42332c.put(str, "boolean");
            }
            return this;
        }

        public final SharedPreferences.Editor putFloat(String str, float f2) {
            this.f42333d.putFloat(str, f2);
            if (f2 == c.this.a(str, 0.0f)) {
                this.f42332c.remove(str);
            } else {
                this.f42332c.put(str, "float");
            }
            return this;
        }

        public final SharedPreferences.Editor putInt(String str, int i2) {
            this.f42333d.putInt(str, i2);
            if (i2 == c.this.a(str, 0)) {
                this.f42332c.remove(str);
            } else {
                this.f42332c.put(str, "integer");
            }
            return this;
        }

        public final SharedPreferences.Editor putLong(String str, long j2) {
            this.f42333d.putLong(str, j2);
            if (j2 == c.this.a(str, 0L)) {
                this.f42332c.remove(str);
            } else {
                this.f42332c.put(str, "long");
            }
            return this;
        }

        public final SharedPreferences.Editor putString(String str, String str2) {
            this.f42333d.putString(str, str2);
            if (TextUtils.equals(c.this.a(str, (String) null), str2)) {
                this.f42332c.remove(str);
            } else {
                this.f42332c.put(str, "string");
            }
            return this;
        }

        a(Context context, SharedPreferences.Editor editor) {
            this.f42331b = context;
            this.f42333d = editor;
        }
    }

    @Override // com.bytedance.push.settings.storage.g, com.bytedance.push.settings.storage.i
    public final /* synthetic */ SharedPreferences.Editor a() {
        return new a(this.f42329b, super.a());
    }

    c(Context context, String str) {
        super(context, str);
        this.f42328a = str;
        this.f42329b = context;
    }
}
