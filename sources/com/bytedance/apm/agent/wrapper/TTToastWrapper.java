package com.bytedance.apm.agent.wrapper;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Pair;
import android.view.WindowManager;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TTToastWrapper {
    static {
        Covode.recordClassIndex(14395);
    }

    public static boolean initToastHook(Toast toast) {
        if (Build.VERSION.SDK_INT != 24 && Build.VERSION.SDK_INT != 25) {
            return true;
        }
        reflectAndoridNTNHandler(toast);
        return true;
    }

    /* access modifiers changed from: package-private */
    public static class ProxyTNHandler extends Handler {
        private Method handleHideMethod;
        private Method handleShowMethod;
        private Object tnObject;

        static {
            Covode.recordClassIndex(14397);
        }

        private static Object com_bytedance_apm_agent_wrapper_TTToastWrapper$ProxyTNHandler_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_apm_agent_wrapper_TTToastWrapper$ProxyTNHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_apm_agent_wrapper_TTToastWrapper$ProxyTNHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        ProxyTNHandler(Object obj) {
            this.tnObject = obj;
            try {
                Method declaredMethod = obj.getClass().getDeclaredMethod("handleShow", IBinder.class);
                this.handleShowMethod = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = obj.getClass().getDeclaredMethod("handleHide", new Class[0]);
                this.handleHideMethod = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            }
        }

        public void handleMessage(Message message) {
            Method method;
            int i2 = message.what;
            if (i2 == 0) {
                Object obj = message.obj;
                Method method2 = this.handleShowMethod;
                if (method2 != null) {
                    try {
                        com_bytedance_apm_agent_wrapper_TTToastWrapper$ProxyTNHandler_java_lang_reflect_Method_invoke(method2, this.tnObject, new Object[]{obj});
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e3) {
                        e3.printStackTrace();
                    } catch (WindowManager.BadTokenException e4) {
                        e4.printStackTrace();
                    }
                }
            } else if (i2 == 1) {
                Method method3 = this.handleHideMethod;
                if (method3 != null) {
                    try {
                        com_bytedance_apm_agent_wrapper_TTToastWrapper$ProxyTNHandler_java_lang_reflect_Method_invoke(method3, this.tnObject, new Object[0]);
                    } catch (IllegalAccessException e5) {
                        e5.printStackTrace();
                    } catch (InvocationTargetException e6) {
                        e6.printStackTrace();
                    }
                }
            } else if (i2 == 2 && (method = this.handleHideMethod) != null) {
                try {
                    com_bytedance_apm_agent_wrapper_TTToastWrapper$ProxyTNHandler_java_lang_reflect_Method_invoke(method, this.tnObject, new Object[0]);
                } catch (IllegalAccessException e7) {
                    e7.printStackTrace();
                } catch (InvocationTargetException e8) {
                    e8.printStackTrace();
                }
            }
            super.handleMessage(message);
        }
    }

    private static boolean reflectAndoridNTNHandler(Toast toast) {
        Field field;
        Field declaredField;
        try {
            if (toast.getClass().getSuperclass() == null || !Toast.class.getName().equals(toast.getClass().getSuperclass().getName())) {
                field = toast.getClass().getDeclaredField("mTN");
            } else {
                field = toast.getClass().getSuperclass().getDeclaredField("mTN");
            }
            if (field == null) {
                return false;
            }
            field.setAccessible(true);
            Object obj = field.get(toast);
            if (obj == null || (declaredField = obj.getClass().getDeclaredField("mHandler")) == null) {
                return false;
            }
            declaredField.setAccessible(true);
            declaredField.set(obj, new ProxyTNHandler(obj));
            return true;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return false;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public static Toast makeText(Context context, int i2, int i3) {
        return makeText(context, ((Object) context.getResources().getText(i2)) + "__wrapper", i3);
    }

    public static Toast makeText(Context context, CharSequence charSequence, int i2) {
        Toast makeText = Toast.makeText(context, ((Object) charSequence) + "__wrapper", i2);
        initToastHook(makeText);
        return makeText;
    }
}
