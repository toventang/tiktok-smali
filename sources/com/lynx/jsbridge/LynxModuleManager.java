package com.lynx.jsbridge;

import android.content.Context;
import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LynxModuleManager {

    /* renamed from: a  reason: collision with root package name */
    Map<String, LynxModuleWrapper> f55487a;

    /* renamed from: b  reason: collision with root package name */
    Context f55488b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, f> f55489c = new HashMap();

    static {
        Covode.recordClassIndex(34743);
    }

    public LynxModuleManager(Context context) {
        this.f55488b = context;
    }

    private static void a(Exception exc) {
        LLog.a(6, "LynxModuleManager", "get Module failed".concat(String.valueOf(exc)));
    }

    private LynxModuleWrapper moduleWrapperForName(String str) {
        LynxModuleWrapper a2 = a(str);
        if (a2 != null) {
            return a2;
        }
        LynxEnv b2 = LynxEnv.b();
        if (b2.f55543m == null) {
            b2.f55543m = new LynxModuleManager(b2.f55531a);
        }
        return b2.f55543m.a(str);
    }

    public final void a(List<f> list) {
        if (!(list == null || list.size() == 0)) {
            for (f fVar : list) {
                String str = fVar.f55516a;
                f fVar2 = this.f55489c.get(str);
                if (fVar2 != null) {
                    LLog.a(6, "LynxModuleManager", "Duplicated LynxModule For Name: " + str + ", " + fVar2 + " will be override");
                }
                this.f55489c.put(str, fVar);
            }
        }
    }

    private LynxModuleWrapper a(String str) {
        LynxModule lynxModule;
        if (str == null) {
            LLog.a(6, "LynxModuleManager", "getModule failed, name is null");
            return null;
        }
        if (this.f55487a == null) {
            this.f55487a = new a();
        }
        if (this.f55487a.get(str) != null) {
            return this.f55487a.get(str);
        }
        f fVar = this.f55489c.get(str);
        if (fVar == null) {
            return null;
        }
        Class<? extends LynxModule> cls = fVar.f55517b;
        try {
            if (LynxContextModule.class.isAssignableFrom(cls)) {
                if (!(this.f55488b instanceof j)) {
                    throw new Exception(cls.getCanonicalName() + " must be created with LynxContext");
                } else if (fVar.f55518c == null) {
                    Constructor<?>[] constructors = cls.getConstructors();
                    int length = constructors.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        Constructor<?> constructor = constructors[i2];
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        if (parameterTypes.length != 1 || !j.class.equals(parameterTypes[0])) {
                            if (parameterTypes.length == 2 && j.class.equals(parameterTypes[0]) && Object.class.equals(parameterTypes[1])) {
                                lynxModule = (LynxModule) constructor.newInstance((j) this.f55488b, null);
                                break;
                            }
                            i2++;
                        } else {
                            lynxModule = (LynxModule) constructor.newInstance((j) this.f55488b);
                            break;
                        }
                    }
                    LLog.a(2, "LynxModuleManager", "getModule" + str + "failed");
                    return null;
                } else {
                    lynxModule = (LynxModule) cls.getConstructor(j.class, Object.class).newInstance((j) this.f55488b, fVar.f55518c);
                }
            } else if (fVar.f55518c == null) {
                Constructor<?>[] constructors2 = cls.getConstructors();
                int length2 = constructors2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        break;
                    }
                    Constructor<?> constructor2 = constructors2[i3];
                    Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
                    if (parameterTypes2.length != 1 || !Context.class.equals(parameterTypes2[0])) {
                        if (parameterTypes2.length == 2 && Context.class.equals(parameterTypes2[0]) && Object.class.equals(parameterTypes2[1])) {
                            lynxModule = (LynxModule) constructor2.newInstance(this.f55488b, null);
                            break;
                        }
                        i3++;
                    } else {
                        lynxModule = (LynxModule) constructor2.newInstance(this.f55488b);
                        break;
                    }
                }
            } else {
                lynxModule = (LynxModule) cls.getConstructor(Context.class, Object.class).newInstance(this.f55488b, fVar.f55518c);
            }
            if (lynxModule == null) {
                LLog.a(2, "LynxModuleManager", "getModule" + str + "failed");
                return null;
            }
            LynxModuleWrapper lynxModuleWrapper = new LynxModuleWrapper(str, lynxModule);
            this.f55487a.put(str, lynxModuleWrapper);
            return lynxModuleWrapper;
        } catch (InstantiationException e2) {
            a(e2);
        } catch (IllegalAccessException e3) {
            a(e3);
        } catch (NoSuchMethodException e4) {
            a(e4);
        } catch (InvocationTargetException e5) {
            a(e5);
        } catch (Exception e6) {
            a(e6);
        }
    }

    public final void a(String str, Class<? extends LynxModule> cls, Object obj) {
        f fVar = new f();
        fVar.f55516a = str;
        fVar.f55517b = cls;
        fVar.f55518c = obj;
        f fVar2 = this.f55489c.get(str);
        if (fVar2 != null) {
            LLog.a(6, "LynxModuleManager", "Duplicated LynxModule For Name: " + str + ", " + fVar2 + " will be override");
        }
        this.f55489c.put(str, fVar);
        LLog.a(2, "LynxModuleManager", "registered module with name: " + str + " class" + cls);
    }
}
