package com.bytedance.ugc.glue;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;

public final class UGCViewUtils {
    static {
        Covode.recordClassIndex(27935);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static a f45845a;

        static {
            Covode.recordClassIndex(27936);
        }

        protected a() {
        }

        public static a a() {
            if (f45845a == null) {
                f45845a = new a();
            }
            return f45845a;
        }

        protected static Activity a(Context context) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            return null;
        }

        protected static Activity a(View view) {
            Activity activity = null;
            while (view != null) {
                activity = a(view.getContext());
                if (activity != null) {
                    break;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            }
            return activity;
        }
    }

    public static Activity getActivity(Context context) {
        a.a();
        return a.a(context);
    }

    public static String getDisplayNum(String str) {
        a.a();
        return String.valueOf(str);
    }

    public static Activity getActivity(View view) {
        a.a();
        return a.a(view);
    }

    public static String getDiggText(int i2) {
        a.a();
        return String.valueOf(String.valueOf(i2));
    }

    public static String getDisplayNum(int i2) {
        a.a();
        return String.valueOf(String.valueOf(i2));
    }

    public static e getFragmentActivity(View view) {
        Activity activity = getActivity(view);
        if (activity instanceof e) {
            return (e) activity;
        }
        return null;
    }
}
