package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.utils.d.a;
import com.ss.android.ugc.aweme.utils.d.b;
import com.ss.android.ugc.aweme.utils.d.c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixFocusedViewLeak implements w {
    static {
        Covode.recordClassIndex(68977);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        Application application = (Application) context;
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT <= 25) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(a.f142795a));
            if (c.a() && Build.VERSION.SDK_INT >= 23) {
                arrayList.add("mLastSrvView");
            }
            application.registerActivityLifecycleCallbacks(new b(arrayList) {
                /* class com.ss.android.ugc.aweme.utils.d.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ List f142796a;

                static {
                    Covode.recordClassIndex(93417);
                }

                {
                    this.f142796a = r1;
                }

                @Override // com.ss.android.ugc.aweme.utils.d.b
                public final void onActivityDestroyed(Activity activity) {
                    super.onActivityDestroyed(activity);
                    List<String> list = this.f142796a;
                    if (activity != null && list != null) {
                        try {
                            Context applicationContext = activity.getApplicationContext();
                            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                                if (applicationContext == null) {
                                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                                }
                            }
                            InputMethodManager inputMethodManager = (InputMethodManager) a.a(applicationContext, "input_method");
                            if (inputMethodManager != null) {
                                for (String str : list) {
                                    try {
                                        Field declaredField = inputMethodManager.getClass().getDeclaredField(str);
                                        if (declaredField != null) {
                                            if (!declaredField.isAccessible()) {
                                                declaredField.setAccessible(true);
                                            }
                                            Object obj = declaredField.get(inputMethodManager);
                                            if (obj != null) {
                                                if (obj instanceof View) {
                                                    if (((View) obj).getContext() == activity) {
                                                        declaredField.set(inputMethodManager, null);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            });
        }
    }
}
