package com.bytedance.b.b.a.d;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import org.json.JSONArray;

/* access modifiers changed from: package-private */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    SharedPreferences f25919a;

    /* renamed from: b  reason: collision with root package name */
    JSONArray f25920b = new JSONArray();

    /* renamed from: c  reason: collision with root package name */
    public String f25921c;

    /* renamed from: d  reason: collision with root package name */
    public long f25922d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f25923e;

    static {
        Covode.recordClassIndex(15119);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.b.b.a.d.b$b  reason: collision with other inner class name */
    public enum EnumC0554b {
        SERVER_DROP("server drop message"),
        FULL_DISK("disk is full");
        
        private String reason;

        public final String toString() {
            return this.reason;
        }

        static {
            Covode.recordClassIndex(15121);
        }

        private EnumC0554b(String str) {
            this.reason = str;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f25924a = new b();

        static {
            Covode.recordClassIndex(15120);
        }
    }

    b() {
    }

    /* access modifiers changed from: package-private */
    public final JSONArray a() {
        b();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (int i2 = 0; i2 < this.f25920b.length(); i2++) {
            try {
                if (i2 < 10) {
                    jSONArray.put(this.f25920b.get(i2));
                } else {
                    jSONArray2.put(this.f25920b.get(i2));
                }
            } catch (Exception unused) {
            }
        }
        this.f25920b = jSONArray2;
        this.f25919a.edit().putString("drop_data_items", this.f25920b.toString()).commit();
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        if (!this.f25923e) {
            this.f25923e = true;
            SharedPreferences a2 = d.a(com.bytedance.b.k.a.f26313g, com.bytedance.b.e.a.a.d() + "_drop_message", 0);
            this.f25919a = a2;
            String string = a2.getString("drop_data_items", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f25920b = new JSONArray(string);
                } catch (Exception unused) {
                }
            }
        }
    }
}
