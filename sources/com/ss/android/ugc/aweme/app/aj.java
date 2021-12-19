package com.ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class aj<T> {

    /* renamed from: a  reason: collision with root package name */
    protected T f66561a;

    /* renamed from: b  reason: collision with root package name */
    public String f66562b;

    /* renamed from: c  reason: collision with root package name */
    protected Type f66563c;

    static {
        Covode.recordClassIndex(40918);
    }

    public final void a() {
        a(this.f66561a);
    }

    public final T b() {
        SharedPreferences sharePref = SharePrefCache.inst().getSharePref();
        try {
            if (this.f66561a != null) {
                return c();
            }
            Type type = this.f66563c;
            if (type == null || !(type instanceof Class)) {
                return null;
            }
            Class cls = (Class) type;
            if (!sharePref.contains(this.f66562b)) {
                return null;
            }
            if (cls == String.class) {
                return (T) sharePref.getString(this.f66562b, "");
            }
            if (cls == Integer.class) {
                return (T) Integer.valueOf(sharePref.getInt(this.f66562b, -1000));
            }
            if (cls == Float.class) {
                return (T) Float.valueOf(sharePref.getFloat(this.f66562b, -1000.0f));
            }
            if (cls == Long.class) {
                return (T) Long.valueOf(sharePref.getLong(this.f66562b, -1000));
            }
            if (cls == Boolean.class) {
                return (T) Boolean.valueOf(sharePref.getBoolean(this.f66562b, false));
            }
            if (Set.class.isAssignableFrom(cls)) {
                return (T) sharePref.getStringSet(this.f66562b, new HashSet());
            }
            throw new AssertionError();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public T c() {
        T t;
        SharedPreferences sharePref = SharePrefCache.inst().getSharePref();
        try {
            Class<?> cls = this.f66561a.getClass();
            if (cls == String.class) {
                t = (T) sharePref.getString(this.f66562b, this.f66561a);
            } else if (cls == Integer.class) {
                t = (T) Integer.valueOf(sharePref.getInt(this.f66562b, this.f66561a.intValue()));
            } else if (cls == Float.class) {
                t = (T) Float.valueOf(sharePref.getFloat(this.f66562b, this.f66561a.floatValue()));
            } else if (cls == Long.class) {
                t = (T) Long.valueOf(sharePref.getLong(this.f66562b, this.f66561a.longValue()));
            } else if (cls == Boolean.class) {
                t = (T) Boolean.valueOf(sharePref.getBoolean(this.f66562b, this.f66561a.booleanValue()));
            } else if (Set.class.isAssignableFrom(cls)) {
                t = (T) sharePref.getStringSet(this.f66562b, this.f66561a);
            } else {
                throw new AssertionError();
            }
            if (t == null) {
                a(this.f66561a);
                t = this.f66561a;
            }
            return t.getClass() != this.f66561a.getClass() ? this.f66561a : t;
        } catch (Exception e2) {
            e2.printStackTrace();
            return this.f66561a;
        }
    }

    public final void b(T t) {
        c(t);
    }

    private void c(T t) {
        if (t != null) {
            a(t);
        }
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        if (t != null) {
            SharedPreferences.Editor edit = SharePrefCache.inst().getSharePref().edit();
            if (t instanceof String) {
                edit.putString(this.f66562b, t);
            } else if (t instanceof Integer) {
                edit.putInt(this.f66562b, t.intValue());
            } else if (t instanceof Float) {
                edit.putFloat(this.f66562b, t.floatValue());
            } else if (t instanceof Long) {
                edit.putLong(this.f66562b, t.longValue());
            } else if (t instanceof Boolean) {
                edit.putBoolean(this.f66562b, t.booleanValue());
            } else if (t instanceof Set) {
                edit.putStringSet(this.f66562b, t);
            }
            edit.apply();
        }
    }

    public aj(String str, T t) {
        Objects.requireNonNull(t);
        this.f66561a = t;
        this.f66562b = str;
    }

    public final void b(SharedPreferences.Editor editor, T t) {
        if (editor != null) {
            a(editor, t);
            return;
        }
        throw new IllegalArgumentException("editor can not be null!");
    }

    public aj(String str, Type type) {
        Objects.requireNonNull(type);
        this.f66561a = null;
        this.f66562b = str;
        this.f66563c = type;
    }

    /* access modifiers changed from: protected */
    public void a(SharedPreferences.Editor editor, T t) {
        if (t instanceof String) {
            editor.putString(this.f66562b, t);
        } else if (t instanceof Integer) {
            editor.putInt(this.f66562b, t.intValue());
        } else if (t instanceof Float) {
            editor.putFloat(this.f66562b, t.floatValue());
        } else if (t instanceof Long) {
            editor.putLong(this.f66562b, t.longValue());
        } else if (t instanceof Boolean) {
            editor.putBoolean(this.f66562b, t.booleanValue());
        } else if (t instanceof Set) {
            editor.putStringSet(this.f66562b, t);
        }
    }
}
