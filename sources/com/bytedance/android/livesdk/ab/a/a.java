package com.bytedance.android.livesdk.ab.a;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final i f13433a = i.b();

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f13434b;

    public final Map<String, String> a(View view, String str) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(StringSet.type, "action");
            hashMap.put("action", str);
            if (view == null) {
                return hashMap;
            }
            hashMap.put("class_name", view.toString());
            StringBuffer stringBuffer = new StringBuffer();
            boolean z = true;
            String str2 = (String) view.getTag(-16777215);
            if (str2 != null) {
                stringBuffer.append("page_name:").append(str2);
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (parent.getParent() == null || !(parent instanceof View) || !TextUtils.isEmpty(str2)) {
                    break;
                }
                View view2 = (View) parent;
                if (view2.getTag(-16777215) != null) {
                    stringBuffer.append("page_name:").append((String) view2.getTag(-16777215));
                    break;
                }
                parent = parent.getParent();
            }
            JSONObject jSONObject = new JSONObject();
            String a2 = a(view);
            if (!TextUtils.isEmpty(a2)) {
                hashMap.put("id", a2);
                stringBuffer.append("|id:").append(a2);
                z = false;
            }
            if (view.getParent() != null) {
                if (view.getParent() instanceof RecyclerView) {
                    int indexOfChild = ((RecyclerView) view.getParent()).indexOfChild(view);
                    stringBuffer.append("|RecyclerView|position:").append(indexOfChild);
                    a(jSONObject, "position", indexOfChild);
                    if (view instanceof ViewGroup) {
                        a(jSONObject, "children_info", a(0, (ViewGroup) view));
                    }
                } else if (view.getParent() instanceof ListView) {
                    int indexOfChild2 = ((ListView) view.getParent()).indexOfChild(view);
                    stringBuffer.append("|ListView|position:").append(indexOfChild2);
                    a(jSONObject, "position", indexOfChild2);
                    if (view instanceof ViewGroup) {
                        a(jSONObject, "children_info", a(0, (ViewGroup) view));
                    }
                }
            }
            String b2 = b(view);
            if (!TextUtils.isEmpty(b2)) {
                a(jSONObject, "text", b2);
                stringBuffer.append("|text:").append(b2);
                z = false;
            }
            String c2 = c(view);
            if (!TextUtils.isEmpty(c2)) {
                a(jSONObject, "tag", c2);
                stringBuffer.append("|tag:").append(c2);
                z = false;
            }
            String d2 = d(view);
            if (!TextUtils.isEmpty(d2)) {
                a(jSONObject, "description", d2);
                stringBuffer.append("|description:").append(d2);
                z = false;
            }
            if (jSONObject.length() > 0) {
                z = false;
            }
            if (z && (view instanceof ViewGroup)) {
                a(jSONObject, "children_info", a(0, (ViewGroup) view));
            }
            hashMap.put("params", jSONObject.toString());
            hashMap.put("path", stringBuffer.toString());
            return hashMap;
        } catch (Throwable unused) {
        }
    }

    static {
        Covode.recordClassIndex(7468);
    }

    public static a a() {
        MethodCollector.i(11051);
        if (f13434b == null) {
            synchronized (a.class) {
                try {
                    if (f13434b == null) {
                        f13434b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11051);
                    throw th;
                }
            }
        }
        a aVar = f13434b;
        MethodCollector.o(11051);
        return aVar;
    }

    private static JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String d(View view) {
        if (view != null) {
            return (String) view.getContentDescription();
        }
        return "";
    }

    private static String b(View view) {
        if (view instanceof TextView) {
            return ((TextView) view).getText().toString();
        }
        return "";
    }

    private static String c(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag();
            if (obj == null) {
                return "";
            }
        } else {
            obj = "";
        }
        return String.valueOf(obj);
    }

    private static String a(View view) {
        String str = "";
        if (view == null || view.getId() <= 0 || view.getContext() == null) {
            return str;
        }
        try {
            str = "R.id." + view.getContext().getResources().getResourceEntryName(view.getId());
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static JSONObject a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    private String a(int i2, ViewGroup viewGroup) {
        StringBuffer stringBuffer = new StringBuffer();
        if (viewGroup == null) {
            return stringBuffer.toString();
        }
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            stringBuffer.append("|index:").append(i2).append(i3);
            String b2 = b(childAt);
            if (!TextUtils.isEmpty(b2)) {
                stringBuffer.append("|text:").append(b2);
            }
            if (!TextUtils.isEmpty(c(childAt))) {
                stringBuffer.append("|tag:").append(b2);
            }
            String d2 = d(childAt);
            if (!TextUtils.isEmpty(d2)) {
                stringBuffer.append("|description:").append(d2);
            }
            if (childAt instanceof ViewGroup) {
                stringBuffer.append(a(i3, (ViewGroup) childAt));
            }
        }
        return stringBuffer.toString();
    }

    public static void a(String str, String str2, Map map) {
        a(str, str2, 1, a(map));
    }

    public static void a(JSONObject jSONObject, String str, int i2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, i2);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, str2);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(String str, String str2, int i2, JSONObject jSONObject) {
        JSONObject a2;
        if (jSONObject != null && (a2 = a(jSONObject.toString())) != null) {
            a(a2, "service", str2);
            a(a2, "status_code", i2);
            f13433a.b(str, a2);
        }
    }
}
