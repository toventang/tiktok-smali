package com.ss.android.ugc.aweme.cw;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.concurrent.FutureTask;

/* access modifiers changed from: package-private */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Field f79185a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile Field f79186b;

    static {
        Covode.recordClassIndex(49138);
    }

    p() {
    }

    static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    static Object b(Object obj) {
        MethodCollector.i(6779);
        try {
            if (f79185a == null) {
                synchronized (p.class) {
                    try {
                        if (f79185a == null) {
                            Field declaredField = obj.getClass().getDeclaredField("callable");
                            f79185a = declaredField;
                            declaredField.setAccessible(true);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(6779);
                        throw th;
                    }
                }
            }
            Object obj2 = f79185a.get(obj);
            MethodCollector.o(6779);
            return obj2;
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(6779);
            return null;
        }
    }

    private static Object c(Object obj) {
        MethodCollector.i(6786);
        try {
            if (f79186b == null) {
                synchronized (p.class) {
                    try {
                        if (f79186b == null) {
                            Field declaredField = obj.getClass().getDeclaredField("task");
                            f79186b = declaredField;
                            declaredField.setAccessible(true);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(6786);
                        throw th;
                    }
                }
            }
            Object obj2 = f79186b.get(obj);
            MethodCollector.o(6786);
            return obj2;
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(6786);
            return null;
        }
    }

    private static boolean a(Class cls) {
        String name = cls.getName();
        if ("java.lang.Integer".equals(name) || "java.lang.Boolean".equals(name) || "java.lang.Long".equals(name) || "java.lang.Float".equals(name) || "java.lang.Double".equals(name) || "java.lang.String".equals(name) || "sun.misc.Unsafe".equals(name) || "bolts.TaskCompletionSource".equals(name) || "java.util.ArrayList".equals(name) || name.contains("android.os.Handler") || name.contains("com.bytedance.common.utility.collection.WeakHandler") || name.contains("java.util.concurrent.Executors$RunnableAdapter") || name.contains("bolts.Task") || cls.isPrimitive()) {
            return true;
        }
        return false;
    }

    static String a(Object obj) {
        Object c2;
        Object b2;
        if ((obj instanceof FutureTask) && (b2 = b(obj)) != null) {
            obj = b2;
        }
        if ("java.util.concurrent.Executors$RunnableAdapter".equals(obj.getClass().getName()) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        StringBuilder sb = new StringBuilder();
        if (!a((Class) obj.getClass())) {
            String obj2 = obj.toString();
            int indexOf = obj2.indexOf("@");
            if (indexOf > 0) {
                obj2 = obj2.substring(0, indexOf);
            }
            sb.append(obj2).append(",");
        }
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        try {
            for (Field field : declaredFields) {
                field.setAccessible(true);
                Object obj3 = field.get(obj);
                if (obj3 != null) {
                    Class<?> cls = obj3.getClass();
                    if (!a((Class) cls)) {
                        String name = cls.getName();
                        int indexOf2 = name.indexOf("@");
                        if (indexOf2 > 0) {
                            name = name.substring(0, indexOf2);
                        }
                        sb.append(name).append(",");
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return sb.toString().replaceAll("class ", "");
    }

    static String a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (!className.contains("libcore.io") && !className.contains("java.io") && !className.contains("android.database.sqlite") && !className.contains("android.database.AbstractCursor") && !className.contains("dalvik.system") && !className.contains("android.os") && !className.contains("com.ss.android.ugc.conan") && !className.contains("com.lody.whale")) {
                    String methodName = stackTraceElement.getMethodName();
                    if (!methodName.equals("getThreadStackTrace") && !methodName.equals("getStackTrace")) {
                        sb.append("\tat ").append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
                    }
                }
            }
        }
        return sb.toString();
    }
}
