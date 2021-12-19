package com.google.android.play.core.b;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

public final class an {
    static {
        Covode.recordClassIndex(32795);
    }

    public static <T> am<T> a(Object obj, String str, Class<T> cls) {
        return new am<>(obj, a(obj, str), cls);
    }

    public static <R, P0> R a(Class cls, Class<R> cls2, Class<P0> cls3, P0 p0) {
        try {
            return cls2.cast(a(a((Class<?>) cls, "isDexOptNeeded", (Class<?>[]) new Class[]{cls3}), (Object) null, new Object[]{p0}));
        } catch (Exception e2) {
            throw new ao(a.a("Failed to invoke static method %s on type %s", new Object[]{"isDexOptNeeded", cls}), e2);
        }
    }

    public static <R, P0, P1> R a(Class cls, Class<R> cls2, Class<P0> cls3, P0 p0, Class<P1> cls4, P1 p1) {
        try {
            return cls2.cast(a(a((Class<?>) cls, "optimizedPathFor", (Class<?>[]) new Class[]{cls3, cls4}), (Object) null, new Object[]{p0, p1}));
        } catch (Exception e2) {
            throw new ao(a.a("Failed to invoke static method %s on type %s", new Object[]{"optimizedPathFor", cls}), e2);
        }
    }

    public static <R, P0> R a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0) {
        try {
            return cls.cast(a(a(obj, str, cls2), obj, new Object[]{p0}));
        } catch (Exception e2) {
            throw new ao(a.a("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e2);
        }
    }

    public static <R, P0, P1, P2> R a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0, Class<P1> cls3, P1 p1, Class<P2> cls4, P2 p2) {
        try {
            return cls.cast(a(a(obj, str, cls2, cls3, cls4), obj, new Object[]{p0, p1, p2}));
        } catch (Exception e2) {
            throw new ao(a.a("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e2);
        }
    }

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_google_android_play_core_internal_br_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_google_android_play_core_internal_br_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private static Field a(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new ao(a.a("Failed to find a field named %s on an object of instance %s", new Object[]{str, obj.getClass().getName()}));
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new ao(a.a("Could not find a method named %s with parameters %s in type %s", new Object[]{str, Arrays.asList(clsArr), cls}));
    }

    private static Method a(Object obj, String str, Class<?>... clsArr) {
        return a(obj.getClass(), str, clsArr);
    }

    public static void a(PackageManager packageManager, ComponentName componentName, int i2) {
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i2 | 512);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i3 = 0;
                    while (true) {
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i3];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    break;
                                }
                                ComponentInfo componentInfo = componentInfoArr2[i4];
                                if (!componentInfo.name.equals(className)) {
                                    i4++;
                                } else if (componentInfo.isEnabled()) {
                                    return;
                                }
                            }
                        }
                        i3++;
                        if (i3 >= 3) {
                            break;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    public static void a(ax axVar, InputStream inputStream, OutputStream outputStream, long j2) {
        MethodCollector.i(7287);
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(a.a("%x", new Object[]{Integer.valueOf(readInt)}));
            aw awVar = new aw(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
            MethodCollector.o(7287);
            throw awVar;
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j3 = 0;
            while (true) {
                long j4 = j2 - j3;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        IOException iOException = new IOException("Patch file overrun");
                        MethodCollector.o(7287);
                        throw iOException;
                    } else if (read2 != 0) {
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                a(bArr, dataInputStream, outputStream, read2, j4);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                a(bArr, dataInputStream, outputStream, read2, j4);
                                break;
                            case 249:
                                long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    a(bArr, axVar, outputStream, readUnsignedShort, read2, j4);
                                    break;
                                } else {
                                    IOException iOException2 = new IOException("Unexpected end of patch");
                                    MethodCollector.o(7287);
                                    throw iOException2;
                                }
                            case 250:
                                read2 = dataInputStream.readUnsignedShort();
                                a(bArr, axVar, outputStream, (long) dataInputStream.readUnsignedShort(), read2, j4);
                                break;
                            case 251:
                                read2 = dataInputStream.readInt();
                                a(bArr, axVar, outputStream, (long) dataInputStream.readUnsignedShort(), read2, j4);
                                break;
                            case 252:
                                long readInt2 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    a(bArr, axVar, outputStream, readInt2, read2, j4);
                                    break;
                                } else {
                                    IOException iOException3 = new IOException("Unexpected end of patch");
                                    MethodCollector.o(7287);
                                    throw iOException3;
                                }
                            case 253:
                                read2 = dataInputStream.readUnsignedShort();
                                a(bArr, axVar, outputStream, (long) dataInputStream.readInt(), read2, j4);
                                break;
                            case 254:
                                read2 = dataInputStream.readInt();
                                a(bArr, axVar, outputStream, (long) dataInputStream.readInt(), read2, j4);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                a(bArr, axVar, outputStream, readLong, read2, j4);
                                break;
                            default:
                                a(bArr, dataInputStream, outputStream, read2, j4);
                                break;
                        }
                        j3 += (long) read2;
                    } else {
                        return;
                    }
                } finally {
                    outputStream.flush();
                    MethodCollector.o(7287);
                }
            }
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unexpected version=");
            sb.append(read);
            aw awVar2 = new aw(sb.toString());
            MethodCollector.o(7287);
            throw awVar2;
        }
    }

    public static <T> void a(T t) {
        Objects.requireNonNull(t, "Cannot return null from a non-@Nullable @Provides method");
    }

    public static <T> void a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    private static void a(byte[] bArr, ax axVar, OutputStream outputStream, long j2, int i2, long j3) {
        int i3 = i2;
        MethodCollector.i(7160);
        if (i3 < 0) {
            IOException iOException = new IOException("copyLength negative");
            MethodCollector.o(7160);
            throw iOException;
        } else if (j2 >= 0) {
            long j4 = (long) i3;
            if (j4 <= j3) {
                try {
                    InputStream b2 = new ay(axVar, j2, j4).b();
                    while (i3 > 0) {
                        try {
                            int min = Math.min(i3, 16384);
                            int i4 = 0;
                            while (i4 < min) {
                                int read = b2.read(bArr, i4, min - i4);
                                if (read != -1) {
                                    i4 += read;
                                } else {
                                    IOException iOException2 = new IOException("truncated input stream");
                                    MethodCollector.o(7160);
                                    throw iOException2;
                                }
                            }
                            outputStream.write(bArr, 0, min);
                            i3 -= min;
                        } catch (Throwable th) {
                            bf.a(th, th);
                        }
                    }
                    b2.close();
                    MethodCollector.o(7160);
                    return;
                } catch (EOFException e2) {
                    IOException iOException3 = new IOException("patch underrun", e2);
                    MethodCollector.o(7160);
                    throw iOException3;
                }
            } else {
                IOException iOException4 = new IOException("Output length overrun");
                MethodCollector.o(7160);
                throw iOException4;
            }
        } else {
            IOException iOException5 = new IOException("inputOffset negative");
            MethodCollector.o(7160);
            throw iOException5;
        }
        MethodCollector.o(7160);
        throw th;
    }

    private static void a(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i2, long j2) {
        MethodCollector.i(7088);
        if (i2 < 0) {
            IOException iOException = new IOException("copyLength negative");
            MethodCollector.o(7088);
            throw iOException;
        } else if (((long) i2) <= j2) {
            while (i2 > 0) {
                try {
                    int min = Math.min(i2, 16384);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i2 -= min;
                } catch (EOFException unused) {
                    IOException iOException2 = new IOException("patch underrun");
                    MethodCollector.o(7088);
                    throw iOException2;
                }
            }
            MethodCollector.o(7088);
        } else {
            IOException iOException3 = new IOException("Output length overrun");
            MethodCollector.o(7088);
            throw iOException3;
        }
    }

    public static <T> am b(Object obj, String str, Class<T> cls) {
        return new am(obj, a(obj, str), cls, (byte) 0);
    }
}
