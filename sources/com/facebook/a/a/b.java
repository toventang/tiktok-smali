package com.facebook.a.a;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.facebook.a.b.a.f;
import com.facebook.internal.a.b.a;
import java.util.ArrayList;
import java.util.List;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46578a = b.class.getCanonicalName();

    b() {
    }

    static {
        Covode.recordClassIndex(28411);
    }

    static List<String> b(View view) {
        if (a.a(b.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup a2 = f.a(view);
            if (a2 != null) {
                for (View view2 : f.b(a2)) {
                    if (view != view2) {
                        arrayList.addAll(c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            a.a(th, b.class);
            return null;
        }
    }

    private static List<String> c(View view) {
        if (a.a(b.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String charSequence = ((TextView) view).getText().toString();
                if (!charSequence.isEmpty() && charSequence.length() < 100) {
                    arrayList.add(charSequence.toLowerCase());
                }
                return arrayList;
            }
            for (View view2 : f.b(view)) {
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            a.a(th, b.class);
            return null;
        }
    }

    static List<String> a(View view) {
        if (a.a(b.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(f.f(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String[] split = view.getResources().getResourceName(view.getId()).split("/");
                    if (split.length == 2) {
                        arrayList.add(split[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (!str.isEmpty() && str.length() <= 100) {
                    arrayList2.add(str.toLowerCase());
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            a.a(th, b.class);
            return null;
        }
    }

    static boolean a(String str, String str2) {
        if (a.a(b.class)) {
            return false;
        }
        try {
            return str.matches(str2);
        } catch (Throwable th) {
            a.a(th, b.class);
            return false;
        }
    }

    private static boolean a(String str, List<String> list) {
        if (a.a(b.class)) {
            return false;
        }
        try {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            a.a(th, b.class);
            return false;
        }
    }

    static boolean a(List<String> list, List<String> list2) {
        if (a.a(b.class)) {
            return false;
        }
        try {
            for (String str : list) {
                if (a(str, list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            a.a(th, b.class);
            return false;
        }
    }
}
