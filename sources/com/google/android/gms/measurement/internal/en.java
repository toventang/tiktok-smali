package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class en {

    /* renamed from: a  reason: collision with root package name */
    private final String f51532a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f51533b = new Bundle();

    /* renamed from: c  reason: collision with root package name */
    private boolean f51534c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f51535d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ em f51536e;

    static {
        Covode.recordClassIndex(32208);
    }

    public final Bundle a() {
        if (!this.f51534c) {
            this.f51534c = true;
            String string = this.f51536e.f().getString(this.f51532a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        String string2 = jSONObject.getString("n");
                        String string3 = jSONObject.getString("t");
                        char c2 = 65535;
                        int hashCode = string3.hashCode();
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals("s")) {
                                    c2 = 0;
                                }
                            } else if (string3.equals("l")) {
                                c2 = 2;
                            }
                        } else if (string3.equals("d")) {
                            c2 = 1;
                        }
                        if (c2 == 0) {
                            bundle.putString(string2, jSONObject.getString("v"));
                        } else if (c2 == 1) {
                            bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                        } else if (c2 != 2) {
                            try {
                                this.f51536e.q().f51468c.a("Unrecognized persisted bundle type. Type", string3);
                            } catch (NumberFormatException | JSONException unused) {
                                this.f51536e.q().f51468c.a("Error reading value from SharedPreferences. Value dropped");
                            }
                        } else {
                            bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                        }
                    }
                    this.f51535d = bundle;
                } catch (JSONException unused2) {
                    this.f51536e.q().f51468c.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f51535d == null) {
                this.f51535d = this.f51533b;
            }
        }
        return this.f51535d;
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f51536e.f().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f51532a);
        } else {
            edit.putString(this.f51532a, b(bundle));
        }
        edit.apply();
        this.f51535d = bundle;
    }

    private final String b(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        for (String str : bundle.keySet()) {
            Object a2 = a(bundle, str);
            if (a2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str);
                    jSONObject.put("v", String.valueOf(a2));
                    if (a2 instanceof String) {
                        jSONObject.put("t", "s");
                    } else if (a2 instanceof Long) {
                        jSONObject.put("t", "l");
                    } else if (a2 instanceof Double) {
                        jSONObject.put("t", "d");
                    } else {
                        this.f51536e.q().f51468c.a("Cannot serialize bundle value to SharedPreferences. Type", a2.getClass());
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e2) {
                    this.f51536e.q().f51468c.a("Cannot serialize bundle value to SharedPreferences", e2);
                }
            }
        }
        return jSONArray.toString();
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public en(em emVar, String str) {
        this.f51536e = emVar;
        r.a(str);
        this.f51532a = str;
    }
}
