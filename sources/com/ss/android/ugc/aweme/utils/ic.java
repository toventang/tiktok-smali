package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;
import android.widget.Toast;
import com.bytedance.common.utility.f;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class ic implements n.b {

    /* renamed from: a  reason: collision with root package name */
    private static Field f143091a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f143092b;

    static {
        Covode.recordClassIndex(93662);
        try {
            Field declaredField = Toast.class.getDeclaredField("mTN");
            f143091a = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = f143091a.getType().getDeclaredField("mHandler");
            f143092b = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            e2.printStackTrace();
        }
    }

    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private Handler f143093a;

        static {
            Covode.recordClassIndex(93663);
        }

        public a(Handler handler) {
            this.f143093a = handler;
        }

        public final void handleMessage(Message message) {
            this.f143093a.handleMessage(message);
        }

        public final void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (WindowManager.BadTokenException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                e2.printStackTrace();
            }
        }
    }

    public static void a(Toast toast) {
        try {
            Object obj = f143091a.get(toast);
            f143092b.set(obj, new a((Handler) f143092b.get(obj)));
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.common.utility.n.b
    public final boolean a(Context context, CharSequence charSequence, long j2) {
        if ((context instanceof f) || Build.VERSION.SDK_INT != 25) {
            return false;
        }
        Toast makeText = Toast.makeText(context, charSequence, (int) j2);
        a(makeText);
        if (Build.VERSION.SDK_INT == 25) {
            a(makeText);
        }
        makeText.show();
        return true;
    }
}
