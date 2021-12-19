package com.facebook.a.b.a;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ad;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46635a = f.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference<View> f46636b = new WeakReference<>(null);

    /* renamed from: c  reason: collision with root package name */
    private static Method f46637c = null;

    static {
        Covode.recordClassIndex(28429);
    }

    public static ViewGroup a(View view) {
        if (a.a(f.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            a.a(th, f.class);
            return null;
        }
    }

    private static boolean l(View view) {
        if (a.a(f.class)) {
            return false;
        }
        try {
            return view.getClass().getName().equals("com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            a.a(th, f.class);
            return false;
        }
    }

    private static Class<?> a(String str) {
        if (a.a(f.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            a.a(th, f.class);
            return null;
        }
    }

    public static List<View> b(View view) {
        if (a.a(f.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    arrayList.add(viewGroup.getChildAt(i2));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            a.a(th, f.class);
            return null;
        }
    }

    public static String f(View view) {
        CharSequence charSequence;
        if (a.a(f.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else if (view instanceof TextView) {
                charSequence = ((TextView) view).getHint();
            } else {
                charSequence = null;
            }
            if (charSequence == null) {
                return "";
            }
            return charSequence.toString();
        } catch (Throwable th) {
            a.a(th, f.class);
            return null;
        }
    }

    public static View i(View view) {
        if (a.a(f.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!l(view)) {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                a.a(th, f.class);
            }
        }
        return null;
    }

    private static boolean j(View view) {
        if (a.a(f.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            Class<?> a2 = a("android.support.v4.view.NestedScrollingChild");
            if (a2 != null && a2.isInstance(parent)) {
                return true;
            }
            Class<?> a3 = a("androidx.core.view.NestedScrollingChild");
            if (a3 == null || !a3.isInstance(parent)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            a.a(th, f.class);
            return false;
        }
    }

    private static float[] m(View view) {
        if (a.a(f.class)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{(float) iArr[0], (float) iArr[1]};
        } catch (Throwable th) {
            a.a(th, f.class);
            return null;
        }
    }

    public static int d(View view) {
        int i2;
        if (a.a(f.class)) {
            return 0;
        }
        try {
            if (view instanceof ImageView) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            if (view.isClickable()) {
                i2 |= 32;
            }
            if (j(view)) {
                i2 |= 512;
            }
            if (view instanceof TextView) {
                int i3 = i2 | 1024 | 1;
                if (view instanceof Button) {
                    i3 |= 4;
                    if (view instanceof Switch) {
                        i3 |= 8192;
                    } else if (view instanceof CheckBox) {
                        i3 |= 32768;
                    }
                }
                if (view instanceof EditText) {
                    return i3 | 2048;
                }
                return i3;
            }
            if (!(view instanceof Spinner)) {
                if (!(view instanceof DatePicker)) {
                    if (view instanceof RatingBar) {
                        return i2 | 65536;
                    }
                    if (view instanceof RadioGroup) {
                        return i2 | 16384;
                    }
                    if (!(view instanceof ViewGroup) || !a(view, f46636b.get())) {
                        return i2;
                    }
                    return i2 | 64;
                }
            }
            return i2 | 4096;
        } catch (Throwable th) {
            a.a(th, f.class);
            return 0;
        }
    }

    public static View.OnClickListener g(View view) {
        Field declaredField;
        if (a.a(f.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnClickListener) declaredField.get(obj);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            a.a(th, f.class);
            return null;
        }
    }

    public static View.OnTouchListener h(View view) {
        Field declaredField;
        if (a.a(f.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnTouchListener) declaredField.get(obj);
        } catch (NoSuchFieldException e2) {
            ad.a(f46635a, (Exception) e2);
        } catch (ClassNotFoundException e3) {
            ad.a(f46635a, (Exception) e3);
        } catch (IllegalAccessException e4) {
            ad.a(f46635a, (Exception) e4);
        } catch (Throwable th) {
            a.a(th, f.class);
            return null;
        }
        return null;
    }

    private static JSONObject k(View view) {
        if (a.a(f.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            a.a(th, f.class);
            return null;
        }
    }

    public static JSONObject c(View view) {
        if (a.a(f.class)) {
            return null;
        }
        try {
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                f46636b = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (!a.a(f.class)) {
                    try {
                        String e2 = e(view);
                        String f2 = f(view);
                        Object tag = view.getTag();
                        CharSequence contentDescription = view.getContentDescription();
                        jSONObject.put("classname", view.getClass().getCanonicalName());
                        jSONObject.put("classtypebitmask", d(view));
                        jSONObject.put("id", view.getId());
                        if (!d.a(view)) {
                            jSONObject.put("text", ad.a(ad.b(e2), ""));
                        } else {
                            jSONObject.put("text", "");
                            jSONObject.put("is_user_input", true);
                        }
                        jSONObject.put("hint", ad.a(ad.b(f2), ""));
                        if (tag != null) {
                            jSONObject.put("tag", ad.a(ad.b(tag.toString()), ""));
                        }
                        if (contentDescription != null) {
                            jSONObject.put("description", ad.a(ad.b(contentDescription.toString()), ""));
                        }
                        jSONObject.put("dimension", k(view));
                    } catch (JSONException e3) {
                        ad.a(f46635a, (Exception) e3);
                    } catch (Throwable th) {
                        a.a(th, f.class);
                    }
                }
                JSONArray jSONArray = new JSONArray();
                List<View> b2 = b(view);
                for (int i2 = 0; i2 < b2.size(); i2++) {
                    jSONArray.put(c(b2.get(i2)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th2) {
            a.a(th2, f.class);
            return null;
        }
    }

    public static String e(View view) {
        CharSequence charSequence;
        Object selectedItem;
        if (a.a(f.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                charSequence = ((TextView) view).getText();
                if (view instanceof Switch) {
                    if (((Switch) view).isChecked()) {
                        charSequence = "1";
                    } else {
                        charSequence = "0";
                    }
                }
            } else {
                if (!(view instanceof Spinner)) {
                    int i2 = 0;
                    if (view instanceof DatePicker) {
                        DatePicker datePicker = (DatePicker) view;
                        charSequence = com.a.a("%04d-%02d-%02d", new Object[]{Integer.valueOf(datePicker.getYear()), Integer.valueOf(datePicker.getMonth()), Integer.valueOf(datePicker.getDayOfMonth())});
                    } else if (view instanceof TimePicker) {
                        TimePicker timePicker = (TimePicker) view;
                        charSequence = com.a.a("%02d:%02d", new Object[]{Integer.valueOf(timePicker.getCurrentHour().intValue()), Integer.valueOf(timePicker.getCurrentMinute().intValue())});
                    } else if (view instanceof RadioGroup) {
                        RadioGroup radioGroup = (RadioGroup) view;
                        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                        int childCount = radioGroup.getChildCount();
                        while (true) {
                            if (i2 >= childCount) {
                                break;
                            }
                            View childAt = radioGroup.getChildAt(i2);
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                charSequence = ((RadioButton) childAt).getText();
                                break;
                            }
                            i2++;
                        }
                    } else if (view instanceof RatingBar) {
                        charSequence = String.valueOf(((RatingBar) view).getRating());
                    }
                } else if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    charSequence = selectedItem.toString();
                }
                charSequence = null;
            }
            if (charSequence == null) {
                return "";
            }
            return charSequence.toString();
        } catch (Throwable th) {
            a.a(th, f.class);
            return null;
        }
    }

    public static boolean a(View view, View view2) {
        View a2;
        if (a.a(f.class)) {
            return false;
        }
        try {
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup") || (a2 = a(m(view), view2)) == null || a2.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            a.a(th, f.class);
            return false;
        }
    }

    private static View a(float[] fArr, View view) {
        Object invoke;
        View view2;
        if (a.a(f.class)) {
            return null;
        }
        try {
            if (!a.a(f.class)) {
                try {
                    if (f46637c == null) {
                        try {
                            Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                            f46637c = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (ClassNotFoundException e2) {
                            ad.a(f46635a, (Exception) e2);
                        } catch (NoSuchMethodException e3) {
                            ad.a(f46635a, (Exception) e3);
                        }
                    }
                } catch (Throwable th) {
                    a.a(th, f.class);
                }
            }
            Method method = f46637c;
            if (!(method == null || view == null)) {
                try {
                    Object[] objArr = {fArr, view};
                    Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_facebook_appevents_codeless_internal_ViewHierarchy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a2.first).booleanValue()) {
                        invoke = a2.second;
                    } else {
                        invoke = method.invoke(null, objArr);
                        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{null, objArr}, "com_facebook_appevents_codeless_internal_ViewHierarchy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    }
                    View view3 = (View) invoke;
                    if (view3 == null || view3.getId() <= 0 || (view2 = (View) view3.getParent()) == null) {
                        return null;
                    }
                    return view2;
                } catch (IllegalAccessException e4) {
                    ad.a(f46635a, (Exception) e4);
                } catch (InvocationTargetException e5) {
                    ad.a(f46635a, (Exception) e5);
                }
            }
            return null;
        } catch (Throwable th2) {
            a.a(th2, f.class);
            return null;
        }
    }
}
