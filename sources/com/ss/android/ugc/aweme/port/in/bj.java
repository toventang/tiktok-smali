package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.a.c;

public interface bj {
    static {
        Covode.recordClassIndex(74570);
    }

    int a();

    Dialog a(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2);

    Drawable a(Context context);

    c a(Activity activity);

    boolean a(String str);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static String f115605a = "regular";

        /* renamed from: b  reason: collision with root package name */
        public static String f115606b = "bold";

        /* renamed from: c  reason: collision with root package name */
        public static String f115607c = "boldItalic";

        /* renamed from: d  reason: collision with root package name */
        public static String f115608d = "italic";

        /* renamed from: e  reason: collision with root package name */
        public static String f115609e = "light";

        /* renamed from: f  reason: collision with root package name */
        public static String f115610f = "lightItalic";

        /* renamed from: g  reason: collision with root package name */
        public static String f115611g = "medium";

        /* renamed from: h  reason: collision with root package name */
        public static String f115612h = "mediumItalic";

        static {
            Covode.recordClassIndex(74571);
        }
    }
}
