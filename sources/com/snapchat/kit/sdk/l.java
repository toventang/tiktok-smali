package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.p;
import com.snapchat.kit.sdk.core.security.KeyValueStore;

public final class l implements KeyValueStore {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f57341a;

    /* renamed from: b  reason: collision with root package name */
    private final f f57342b;

    static {
        Covode.recordClassIndex(35849);
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public final void clearEntry(String str) {
        this.f57341a.edit().remove(str).apply();
    }

    public l(SharedPreferences sharedPreferences, f fVar) {
        this.f57341a = sharedPreferences;
        this.f57342b = fVar;
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public final String getString(String str, String str2) {
        return this.f57341a.getString(str, str2);
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public final void put(String str, Object obj) {
        putString(str, this.f57342b.b(obj));
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public final void putString(String str, String str2) {
        this.f57341a.edit().putString(str, str2).apply();
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public final <T> T get(String str, Class<T> cls) {
        String string = getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return (T) this.f57342b.a(string, (Class) cls);
        } catch (p unused) {
            clearEntry(str);
            return null;
        }
    }
}
