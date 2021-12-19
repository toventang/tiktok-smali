package com.google.android.gms.internal.h;

import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.h;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static int f50615a = Runtime.getRuntime().availableProcessors();

    static {
        Covode.recordClassIndex(31592);
    }

    private static Bundle b(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static int a(Bundle bundle) {
        if (bundle == null) {
            return 6;
        }
        Object a2 = a(bundle, "RESPONSE_CODE");
        if (a2 == null) {
            return 0;
        }
        if (a2 instanceof Integer) {
            return ((Integer) a2).intValue();
        }
        String valueOf = String.valueOf(a2.getClass().getName());
        if (valueOf.length() != 0) {
            "Unexpected type for bundle response code: ".concat(valueOf);
        } else {
            new String("Unexpected type for bundle response code: ");
        }
        return 6;
    }

    public static String b(Bundle bundle) {
        Object a2;
        if (bundle == null || (a2 = a(bundle, "DEBUG_MESSAGE")) == null) {
            return "";
        }
        if (a2 instanceof String) {
            return (String) a2;
        }
        String valueOf = String.valueOf(a2.getClass().getName());
        if (valueOf.length() != 0) {
            "Unexpected type for debug message: ".concat(valueOf);
        } else {
            new String("Unexpected type for debug message: ");
        }
        return "";
    }

    public static h a(Intent intent) {
        if (intent == null) {
            h.a a2 = h.a();
            a2.f5854a = 6;
            a2.f5855b = "An internal error occurred.";
            return a2.a();
        }
        h.a a3 = h.a();
        a3.f5854a = a(b(intent));
        a3.f5855b = b(b(intent));
        return a3.a();
    }

    public static List<Purchase> c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase a2 = a(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (a2 == null) {
                return null;
            }
            arrayList.add(a2);
        } else {
            int i2 = 0;
            while (i2 < stringArrayList.size() && i2 < stringArrayList2.size()) {
                Purchase a3 = a(stringArrayList.get(i2), stringArrayList2.get(i2));
                if (a3 != null) {
                    arrayList.add(a3);
                }
                i2++;
            }
        }
        return arrayList;
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private static Purchase a(String str, String str2) {
        Purchase purchase = null;
        if (str == null || str2 == null) {
            return null;
        }
        try {
            purchase = new Purchase(str, str2);
            return purchase;
        } catch (JSONException e2) {
            String.valueOf(String.valueOf(e2)).length();
            return purchase;
        }
    }
}
