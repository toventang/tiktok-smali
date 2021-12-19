package com.bytedance.android.livesdk.utils;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class aq {

    /* renamed from: a  reason: collision with root package name */
    private static int f22246a;

    static {
        Covode.recordClassIndex(13139);
    }

    private static boolean a(View view) {
        if (view.getId() != -1) {
            return true;
        }
        return false;
    }

    private static String b(View view) {
        if (view.getContext() == null || view.getContext().getResources() == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(128);
        int i2 = f22246a;
        f22246a = i2 + 1;
        sb.append(i2);
        if (view instanceof ProgressBar) {
            sb.append("#ProgressBar#");
        }
        return sb.toString();
    }

    public static JSONObject a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        JSONObject jSONObject = new JSONObject();
        if (a((View) viewGroup)) {
            arrayList.add(Integer.valueOf(viewGroup.getId()));
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(b(viewGroup), a(viewGroup, arrayList, hashSet));
            jSONObject.put("view_info", jSONObject2);
            if (!b.a((Collection) hashSet)) {
                jSONObject.put("repeat_id", TextUtils.join(", ", hashSet));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static JSONObject a(ViewGroup viewGroup, List<Integer> list, HashSet<Integer> hashSet) {
        if (viewGroup == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", viewGroup.getId());
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (a(childAt)) {
                    if (list.contains(Integer.valueOf(childAt.getId()))) {
                        hashSet.add(Integer.valueOf(childAt.getId()));
                    } else {
                        list.add(Integer.valueOf(childAt.getId()));
                    }
                }
                if (childAt instanceof ViewGroup) {
                    jSONObject.put(b(childAt), a((ViewGroup) childAt, list, hashSet));
                } else {
                    jSONObject.put(b(childAt), String.valueOf(childAt.getId()));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
