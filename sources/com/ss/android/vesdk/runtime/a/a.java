package com.ss.android.vesdk.runtime.a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f151421a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f151422b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences.Editor f151423c;

    static {
        Covode.recordClassIndex(99574);
    }

    private a() {
    }

    /* renamed from: com.ss.android.vesdk.runtime.a.a$a  reason: collision with other inner class name */
    public enum EnumC4060a {
        INSTANCE;
        
        public a mInstance = new a((byte) 0);

        static {
            Covode.recordClassIndex(99575);
        }

        private EnumC4060a(String str) {
        }
    }

    private synchronized void a() {
        MethodCollector.i(1938);
        if (this.f151423c == null) {
            this.f151423c = this.f151422b.edit();
        }
        MethodCollector.o(1938);
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final <T> T a(String str, T t) {
        return t instanceof String ? (T) this.f151422b.getString(str, t) : t instanceof Integer ? (T) Integer.valueOf(this.f151422b.getInt(str, t.intValue())) : t instanceof Boolean ? (T) Boolean.valueOf(this.f151422b.getBoolean(str, t.booleanValue())) : t instanceof Float ? (T) Float.valueOf(this.f151422b.getFloat(str, t.floatValue())) : t instanceof Long ? (T) Long.valueOf(this.f151422b.getLong(str, t.longValue())) : (T) this.f151422b.getString(str, null);
    }

    public final void a(String str, Object obj, boolean z) {
        a();
        if (obj instanceof String) {
            this.f151423c.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            this.f151423c.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            this.f151423c.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.f151423c.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            this.f151423c.putLong(str, ((Long) obj).longValue());
        } else {
            this.f151423c.putString(str, obj.toString());
        }
        if (z) {
            this.f151423c.apply();
        } else {
            this.f151423c.commit();
        }
    }
}
