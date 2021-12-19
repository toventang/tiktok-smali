package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class b {
    static {
        Covode.recordClassIndex(654);
    }

    public Bundle a() {
        return null;
    }

    protected b() {
    }

    static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final ActivityOptions f2133a;

        static {
            Covode.recordClassIndex(655);
        }

        @Override // androidx.core.app.b
        public final Bundle a() {
            return this.f2133a.toBundle();
        }

        a(ActivityOptions activityOptions) {
            this.f2133a = activityOptions;
        }
    }

    public static b a(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        return new a(ActivityOptions.makeCustomAnimation(context, R.anim.ch, R.anim.ch));
    }

    public static b a(Activity activity, e<View, String>... eVarArr) {
        if (Build.VERSION.SDK_INT < 21) {
            return new b();
        }
        Pair[] pairArr = null;
        if (eVarArr != null) {
            pairArr = new Pair[eVarArr.length];
            for (int i2 = 0; i2 < eVarArr.length; i2++) {
                pairArr[i2] = Pair.create(eVarArr[i2].f2397a, eVarArr[i2].f2398b);
            }
        }
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    public static b a(View view, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        return new a(ActivityOptions.makeScaleUpAnimation(view, i2, i3, 0, 0));
    }

    public static b a(Activity activity, View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
        }
        return new b();
    }

    public static b b(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            return new a(ActivityOptions.makeClipRevealAnimation(view, 0, 0, i2, i3));
        }
        return new b();
    }
}
