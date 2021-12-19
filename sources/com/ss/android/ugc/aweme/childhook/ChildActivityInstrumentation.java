package com.ss.android.ugc.aweme.childhook;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import java.lang.reflect.Method;

public class ChildActivityInstrumentation extends Instrumentation {
    private static final String APPLINK = DeepLinkServiceImpl.g().d();
    private static final String DEEPLINK = DeepLinkServiceImpl.g().c();
    private final Instrumentation mBaseInstrumentation;

    static {
        Covode.recordClassIndex(43328);
    }

    public ChildActivityInstrumentation(Instrumentation instrumentation) {
        this.mBaseInstrumentation = instrumentation;
    }

    public void callActivityOnDestroy(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnDestroy(activity);
        } else {
            super.callActivityOnDestroy(activity);
        }
    }

    public void callActivityOnPause(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnPause(activity);
        } else {
            super.callActivityOnPause(activity);
        }
    }

    public void callActivityOnRestart(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnRestart(activity);
        } else {
            super.callActivityOnRestart(activity);
        }
    }

    public void callActivityOnResume(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnResume(activity);
        } else {
            super.callActivityOnResume(activity);
        }
    }

    public void callActivityOnStart(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnStart(activity);
        } else {
            super.callActivityOnStart(activity);
        }
    }

    public void callActivityOnStop(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnStop(activity);
        } else {
            super.callActivityOnStop(activity);
        }
    }

    public void callActivityOnUserLeaving(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnUserLeaving(activity);
        } else {
            super.callActivityOnUserLeaving(activity);
        }
    }

    public void callApplicationOnCreate(Application application) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callApplicationOnCreate(application);
        } else {
            super.callApplicationOnCreate(application);
        }
    }

    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnCreate(activity, bundle);
        } else {
            super.callActivityOnCreate(activity, bundle);
        }
    }

    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnNewIntent(activity, intent);
        } else {
            super.callActivityOnNewIntent(activity, intent);
        }
    }

    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnRestoreInstanceState(activity, bundle);
        } else {
            super.callActivityOnRestoreInstanceState(activity, bundle);
        }
    }

    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnSaveInstanceState(activity, bundle);
        } else {
            super.callActivityOnSaveInstanceState(activity, bundle);
        }
    }

    public boolean onException(Object obj, Throwable th) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            return instrumentation.onException(obj, th);
        }
        return super.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            return instrumentation.newApplication(classLoader, str, context);
        }
        return super.newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        if (str.equals("com.ss.android.ugc.aweme.main.MainActivity")) {
            str = e.a();
        } else if (str.equals(DEEPLINK) || str.equals(APPLINK)) {
            str = "com.ss.android.ugc.aweme.kids.homepage.deeplink.KidsDeepLinkHandlerActivity";
        } else if (str.equals("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity")) {
            str = e.a();
            intent.putExtra("key_init_page_index", 1);
        } else if (!a.a(intent)) {
            str = "com.ss.android.ugc.aweme.child.ChildEmptyFinishActivity";
        }
        return this.mBaseInstrumentation.newActivity(classLoader, str, intent);
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i2, Bundle bundle) {
        Exception e2;
        if (!a.a(intent)) {
            return new Instrumentation.ActivityResult(0, new Intent());
        }
        try {
            Method declaredMethod = Instrumentation.class.getDeclaredMethod("execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class);
            declaredMethod.setAccessible(true);
            try {
                return (Instrumentation.ActivityResult) declaredMethod.invoke(this.mBaseInstrumentation, context, iBinder, iBinder2, activity, intent, Integer.valueOf(i2), bundle);
            } catch (Exception e3) {
                e2 = e3;
                e2.printStackTrace();
                b.a(e2, "execStartActivity");
                return new Instrumentation.ActivityResult(0, new Intent());
            }
        } catch (Exception e4) {
            e2 = e4;
            e2.printStackTrace();
            b.a(e2, "execStartActivity");
            return new Instrumentation.ActivityResult(0, new Intent());
        }
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            return instrumentation.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        }
        return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }
}
