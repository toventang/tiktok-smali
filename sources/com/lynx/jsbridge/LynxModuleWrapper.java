package com.lynx.jsbridge;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.base.LLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class LynxModuleWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final LynxModule f55490a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<MethodDescriptor> f55491b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<AttributeDescriptor> f55492c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final String f55493d;

    static {
        Covode.recordClassIndex(34744);
    }

    public LynxModule getModule() {
        return this.f55490a;
    }

    public String getName() {
        return this.f55493d;
    }

    public Collection<AttributeDescriptor> getAttributeDescriptor() {
        if (this.f55492c.isEmpty()) {
            try {
                HashSet hashSet = new HashSet();
                Field[] declaredFields = this.f55490a.getClass().getDeclaredFields();
                for (Field field : declaredFields) {
                    if (((c) field.getAnnotation(c.class)) != null) {
                        String name = field.getName();
                        if (!hashSet.contains(name)) {
                            hashSet.add(name);
                            AttributeDescriptor attributeDescriptor = new AttributeDescriptor();
                            attributeDescriptor.f55468a = name;
                            attributeDescriptor.f55469b = new JavaOnlyArray();
                            try {
                                attributeDescriptor.f55469b.add(field.get(this.f55490a));
                            } catch (IllegalAccessException e2) {
                                LLog.a(6, "LynxModuleWrapper", e2.toString());
                            }
                            this.f55492c.add(attributeDescriptor);
                        } else {
                            throw new IllegalArgumentException("Java Module " + getName() + " attribute name already registered: " + name);
                        }
                    }
                }
            } catch (RuntimeException e3) {
                LLog.a(6, "LynxModuleWrapper", e3.toString());
            }
        }
        return this.f55492c;
    }

    public Collection<MethodDescriptor> getMethodDescriptors() {
        if (this.f55491b.isEmpty()) {
            try {
                HashSet hashSet = new HashSet();
                Method[] declaredMethods = this.f55490a.getClass().getDeclaredMethods();
                for (Method method : declaredMethods) {
                    if (((d) method.getAnnotation(d.class)) != null) {
                        String name = method.getName();
                        if (!hashSet.contains(name)) {
                            hashSet.add(name);
                            MethodDescriptor methodDescriptor = new MethodDescriptor();
                            e eVar = new e(method);
                            methodDescriptor.f55503c = name;
                            methodDescriptor.f55502b = eVar.a();
                            methodDescriptor.f55501a = method;
                            this.f55491b.add(methodDescriptor);
                        } else {
                            throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                        }
                    }
                }
            } catch (RuntimeException e2) {
                LLog.a(6, "LynxModuleWrapper", e2.toString());
            }
        }
        return this.f55491b;
    }

    public LynxModuleWrapper(String str, LynxModule lynxModule) {
        this.f55493d = str;
        this.f55490a = lynxModule;
    }
}
