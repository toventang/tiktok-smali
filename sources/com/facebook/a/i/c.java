package com.facebook.a.i;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.bytedance.covode.number.Covode;
import com.facebook.a.b.a.f;
import com.facebook.internal.a.b.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class c {

    /* renamed from: a  reason: collision with root package name */
    static final String f46842a = c.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    private static final List<Class<? extends View>> f46843b = new ArrayList(Arrays.asList(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class));

    c() {
    }

    static {
        Covode.recordClassIndex(28528);
    }

    static String b(View view) {
        if (a.a(c.class)) {
            return null;
        }
        try {
            String e2 = f.e(view);
            if (!e2.isEmpty()) {
                return e2;
            }
            return TextUtils.join(" ", c(view));
        } catch (Throwable th) {
            a.a(th, c.class);
            return null;
        }
    }

    private static List<String> c(View view) {
        if (a.a(c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : f.b(view)) {
                String e2 = f.e(view2);
                if (!e2.isEmpty()) {
                    arrayList.add(e2);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            a.a(th, c.class);
            return null;
        }
    }

    static List<View> a(View view) {
        if (a.a(c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> cls : f46843b) {
                if (cls.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            for (View view2 : f.b(view)) {
                arrayList.addAll(a(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            a.a(th, c.class);
            return null;
        }
    }

    static JSONObject a(View view, View view2) {
        if (a.a(c.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            if (!a.a(c.class)) {
                try {
                    String e2 = f.e(view);
                    String f2 = f.f(view);
                    jSONObject.put("classname", view.getClass().getSimpleName());
                    jSONObject.put("classtypebitmask", f.d(view));
                    if (!e2.isEmpty()) {
                        jSONObject.put("text", e2);
                    }
                    if (!f2.isEmpty()) {
                        jSONObject.put("hint", f2);
                    }
                    if (view instanceof EditText) {
                        jSONObject.put("inputtype", ((EditText) view).getInputType());
                    }
                } catch (JSONException unused2) {
                } catch (Throwable th) {
                    a.a(th, c.class);
                }
            }
            JSONArray jSONArray = new JSONArray();
            for (View view3 : f.b(view)) {
                jSONArray.put(a(view3, view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            a.a(th2, c.class);
            return null;
        }
    }
}
