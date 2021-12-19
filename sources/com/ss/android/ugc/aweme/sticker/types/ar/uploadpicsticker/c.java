package com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.m.p;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static List<String> f135961a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f135962b;

    /* renamed from: c  reason: collision with root package name */
    static boolean f135963c = true;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f135964d = true;

    /* renamed from: e  reason: collision with root package name */
    public static final c f135965e = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(88832);
    }

    public static final boolean a(Effect effect) {
        String sdkExtra;
        if (effect != null && (sdkExtra = effect.getSdkExtra()) != null && p.a((CharSequence) sdkExtra, (CharSequence) "pl", false) && p.a((CharSequence) sdkExtra, (CharSequence) "alg", false)) {
            try {
                return new JSONObject(effect.getSdkExtra()).has("pl");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x003e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    public static a a(Effect effect, boolean z) {
        String sdkExtra;
        int i2;
        int i3;
        boolean z2;
        Exception e2;
        int i4;
        if (!(effect == null || (sdkExtra = effect.getSdkExtra()) == null)) {
            boolean z3 = false;
            if (p.a((CharSequence) sdkExtra, (CharSequence) "pl", false) && p.a((CharSequence) sdkExtra, (CharSequence) "alg", false)) {
                boolean z4 = true;
                int i5 = 1;
                boolean z5 = true;
                try {
                    JSONObject optJSONObject = new JSONObject(sdkExtra).optJSONObject("pl");
                    if (optJSONObject != null) {
                        try {
                            if (!optJSONObject.has("min_count") || !optJSONObject.has("max_count") || !z) {
                                i4 = 0;
                                i2 = 0;
                            } else {
                                try {
                                    i2 = optJSONObject.optInt("min_count");
                                    try {
                                        i5 = optJSONObject.optInt("max_count");
                                        z3 = true;
                                        i4 = i5;
                                    } catch (Exception e3) {
                                        e2 = e3;
                                        z5 = i5;
                                    }
                                } catch (Exception e4) {
                                    e2 = e4;
                                    i2 = 0;
                                    z2 = true;
                                    z4 = z5;
                                    e2.printStackTrace();
                                    z3 = z4 ? 1 : 0;
                                    i3 = 0;
                                    return new a(z3, z2, i2, i3);
                                }
                            }
                            z2 = z3;
                            z3 = true;
                            i3 = i4;
                        } catch (Exception e5) {
                            e2 = e5;
                            i2 = 0;
                            z2 = false;
                            e2.printStackTrace();
                            z3 = z4 ? 1 : 0;
                            i3 = 0;
                            return new a(z3, z2, i2, i3);
                        }
                    } else {
                        i3 = 0;
                        i2 = 0;
                        z2 = false;
                    }
                } catch (Exception e6) {
                    e2 = e6;
                    i2 = 0;
                    z2 = false;
                    z4 = false;
                    e2.printStackTrace();
                    z3 = z4 ? 1 : 0;
                    i3 = 0;
                    return new a(z3, z2, i2, i3);
                }
                return new a(z3, z2, i2, i3);
            }
        }
        return null;
    }
}
