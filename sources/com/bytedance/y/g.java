package com.bytedance.y;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    final ReentrantReadWriteLock f46212a = new ReentrantReadWriteLock();

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f46213b = null;

    /* renamed from: c  reason: collision with root package name */
    final int f46214c;

    /* renamed from: d  reason: collision with root package name */
    SharedPreferences f46215d = null;

    /* renamed from: e  reason: collision with root package name */
    Context f46216e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f46217f = 0;

    /* renamed from: g  reason: collision with root package name */
    private final String f46218g;

    static {
        Covode.recordClassIndex(28245);
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        return this.f46218g + "_whole";
    }

    public final void a() {
        SharedPreferences sharedPreferences;
        this.f46212a.writeLock().lock();
        if (this.f46213b != null) {
            this.f46213b = new JSONObject();
        }
        if ((this.f46214c & 2) > 0 && (sharedPreferences = this.f46215d) != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
        }
        this.f46212a.writeLock().unlock();
    }

    public final JSONObject b() {
        a(this.f46216e);
        this.f46212a.readLock().lock();
        JSONObject jSONObject = null;
        try {
            if (this.f46213b != null) {
                jSONObject = new JSONObject(this.f46213b.toString());
            }
        } catch (JSONException e2) {
            d.b("Storage", e2.toString());
        } catch (Throwable th) {
            this.f46212a.readLock().unlock();
            throw th;
        }
        this.f46212a.readLock().unlock();
        return jSONObject;
    }

    public final long a(String str) {
        long j2;
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i2 = 0;
        a(this.f46216e);
        if ((this.f46214c & 1) > 0) {
            this.f46212a.readLock().lock();
            JSONObject jSONObject = this.f46213b;
            if (jSONObject == null || jSONObject.isNull(str)) {
                j2 = 0;
            } else {
                j2 = this.f46213b.optLong(str);
                i2 = this.f46213b.length();
            }
            this.f46212a.readLock().unlock();
            if (!(i2 == 0 && j2 == 0)) {
                return j2;
            }
        } else {
            j2 = 0;
        }
        if ((this.f46214c & 2) <= 0 || (sharedPreferences = this.f46215d) == null) {
            return j2;
        }
        long j3 = sharedPreferences.getLong(str, 0);
        d.a("Storage", "get long from SP, key = " + str + ", retValue = " + j3);
        return j3;
    }

    public final JSONArray b(String str) {
        JSONArray jSONArray;
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        a(this.f46216e);
        if ((this.f46214c & 1) > 0) {
            this.f46212a.readLock().lock();
            JSONObject jSONObject = this.f46213b;
            if (jSONObject == null || jSONObject.isNull(str)) {
                jSONArray = null;
            } else {
                jSONArray = this.f46213b.optJSONArray(str);
            }
            this.f46212a.readLock().unlock();
        } else {
            jSONArray = null;
        }
        if (jSONArray == null && (this.f46214c & 2) > 0 && (sharedPreferences = this.f46215d) != null) {
            String string = sharedPreferences.getString(str, "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    jSONArray = new JSONArray(string);
                    d.a("Storage", "get JSONArray from SP, key= " + str + ", retValue = " + jSONArray);
                } catch (JSONException e2) {
                    d.b("Storage", e2.toString());
                    return null;
                }
            }
        }
        return jSONArray;
    }

    public final synchronized boolean a(Context context) {
        MethodCollector.i(4921);
        if (this.f46217f == 2) {
            MethodCollector.o(4921);
            return true;
        }
        this.f46216e = context;
        if (context == null) {
            d.b("Storage", "try to load local. Context is null");
            MethodCollector.o(4921);
            return false;
        }
        this.f46217f = 1;
        d.a("Storage", "loading local settings, name = " + this.f46218g);
        if ((this.f46214c & 2) > 0) {
            SharedPreferences a2 = d.a(this.f46216e, "com.bd.vod.ST.settings." + this.f46218g, 0);
            this.f46215d = a2;
            if ((this.f46214c & 1) <= 0 || a2 == null) {
                this.f46212a.writeLock().lock();
                if (this.f46213b == null) {
                    this.f46213b = new JSONObject();
                }
                this.f46212a.writeLock().unlock();
            } else {
                String string = a2.getString(c(), "");
                if (!TextUtils.isEmpty(string)) {
                    this.f46212a.writeLock().lock();
                    try {
                        this.f46213b = new JSONObject(string);
                        this.f46212a.writeLock().unlock();
                    } catch (JSONException e2) {
                        d.b("Storage", e2.toString());
                        this.f46217f = 0;
                        this.f46212a.writeLock().unlock();
                        MethodCollector.o(4921);
                        return false;
                    } catch (Throwable th) {
                        this.f46212a.writeLock().unlock();
                        MethodCollector.o(4921);
                        throw th;
                    }
                }
            }
        } else {
            this.f46212a.writeLock().lock();
            if (this.f46213b == null) {
                this.f46213b = new JSONObject();
            }
            this.f46212a.writeLock().unlock();
        }
        this.f46217f = 2;
        d.a("Storage", "load local settings, name = " + this.f46218g);
        MethodCollector.o(4921);
        return true;
    }

    public g(String str, int i2) {
        this.f46218g = str;
        this.f46214c = i2;
    }

    public final int b(String str, int i2) {
        int i3;
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return i2;
        }
        int i4 = 0;
        a(this.f46216e);
        if ((this.f46214c & 1) > 0) {
            this.f46212a.readLock().lock();
            JSONObject jSONObject = this.f46213b;
            if (jSONObject == null || jSONObject.isNull(str)) {
                i3 = i2;
            } else {
                i3 = this.f46213b.optInt(str);
                i4 = this.f46213b.length();
            }
            this.f46212a.readLock().unlock();
            if (i4 != 0) {
                return i3;
            }
        } else {
            i3 = i2;
        }
        if ((this.f46214c & 2) <= 0 || i3 != i2 || (sharedPreferences = this.f46215d) == null) {
            return i3;
        }
        int i5 = sharedPreferences.getInt(str, i2);
        d.a("Storage", "get int from SP, key = " + str + ", retValue = " + i5);
        return i5;
    }

    public final void a(String str, int i2) {
        SharedPreferences sharedPreferences;
        if (!TextUtils.isEmpty(str)) {
            a(this.f46216e);
            if ((this.f46214c & 1) > 0) {
                this.f46212a.writeLock().lock();
                try {
                    JSONObject jSONObject = this.f46213b;
                    if (jSONObject != null) {
                        jSONObject.put(str, i2);
                    }
                } catch (JSONException e2) {
                    d.b("Storage", e2.toString());
                } catch (Throwable th) {
                    this.f46212a.writeLock().unlock();
                    throw th;
                }
                this.f46212a.writeLock().unlock();
            }
            if ((this.f46214c & 2) > 0 && (sharedPreferences = this.f46215d) != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(str, i2);
                edit.apply();
            }
        }
    }

    public final void a(String str, long j2) {
        SharedPreferences sharedPreferences;
        if (!TextUtils.isEmpty(str)) {
            a(this.f46216e);
            if ((this.f46214c & 1) > 0) {
                this.f46212a.writeLock().lock();
                try {
                    JSONObject jSONObject = this.f46213b;
                    if (jSONObject != null) {
                        jSONObject.put(str, j2);
                    }
                } catch (JSONException e2) {
                    d.b("Storage", e2.toString());
                } catch (Throwable th) {
                    this.f46212a.writeLock().unlock();
                    throw th;
                }
                this.f46212a.writeLock().unlock();
            }
            if ((this.f46214c & 2) > 0 && (sharedPreferences = this.f46215d) != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(str, j2);
                edit.apply();
            }
        }
    }
}
