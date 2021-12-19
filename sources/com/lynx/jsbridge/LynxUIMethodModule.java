package com.lynx.jsbridge;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.d;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.q;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.utils.LynxUIMethodsExecutor;
import com.lynx.tasm.behavior.utils.a;
import com.lynx.tasm.utils.m;

public class LynxUIMethodModule extends LynxContextModule {
    static {
        Covode.recordClassIndex(34746);
    }

    public LynxUIMethodModule(j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: package-private */
    @d
    public void invokeUIMethod(final String str, final ReadableArray readableArray, final String str2, final ReadableMap readableMap, final Callback callback) {
        m.a(new d(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxUIMethodModule.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34747);
            }

            @Override // com.lynx.react.bridge.d
            public final void a() {
                int i2;
                boolean z;
                if (!str.isEmpty()) {
                    i2 = Integer.parseInt(str);
                } else {
                    i2 = -1;
                }
                j jVar = LynxUIMethodModule.this.mLynxContext;
                ReadableArray readableArray = readableArray;
                String str = str2;
                ReadableMap readableMap = readableMap;
                AnonymousClass1 r5 = new Callback() {
                    /* class com.lynx.jsbridge.LynxUIMethodModule.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(34748);
                    }

                    @Override // com.lynx.react.bridge.Callback
                    public final void invoke(Object... objArr) {
                        if (callback != null) {
                            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                            javaOnlyMap.putInt("code", ((Integer) objArr[0]).intValue());
                            if (objArr.length > 1) {
                                javaOnlyMap.put("data", objArr[1]);
                            }
                            callback.invoke(javaOnlyMap);
                        }
                    }
                };
                q qVar = jVar.f55902j.get();
                if (qVar != null) {
                    LynxBaseUI b2 = qVar.b(i2);
                    String str2 = "component not found";
                    if (b2 != null) {
                        String str3 = "";
                        for (int i3 = 0; i3 < readableArray.size(); i3++) {
                            String string = readableArray.getString(i3);
                            if (readableMap == null || readableMap.size() <= 0 || !readableMap.hasKey("_isCallByRefId") || !readableMap.getBoolean("_isCallByRefId")) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (string.startsWith("#") || z) {
                                String substring = string.substring(1);
                                if (z) {
                                    b2 = qVar.b(string, b2);
                                } else {
                                    b2 = qVar.a(substring, b2);
                                }
                                if (b2 == null) {
                                    str2 = "not found ".concat(String.valueOf(string));
                                } else {
                                    if (b2.mIdSelector == null || !b2.mIdSelector.equals(substring)) {
                                        if (qVar.f55933c.r || (b2 instanceof UIGroup)) {
                                            str3 = string;
                                        } else {
                                            str2 = "You must set flatten to false with ".concat(String.valueOf(str3));
                                        }
                                    }
                                }
                            } else {
                                r5.invoke(5, string + " not support，only support id selector currently");
                                return;
                            }
                        }
                        Class<?> cls = b2.getClass();
                        a<?> aVar = LynxUIMethodsExecutor.f56444a.get(cls);
                        if (aVar == null) {
                            aVar = (a) LynxUIMethodsExecutor.a(cls);
                            if (aVar == null) {
                                String str4 = "MethodInvoker not generated for class: " + cls.getName() + ". You should add module lynxProcessor";
                                LLog.a(6, "MethodsExecutor", str4);
                                if (!LynxEnv.b().s || !LynxEnv.b().f55537g) {
                                    aVar = new LynxUIMethodsExecutor.FallbackLynxUIMethodInvoker<>(cls);
                                } else {
                                    throw new IllegalStateException(str4);
                                }
                            }
                            LynxUIMethodsExecutor.f56444a.put(cls, aVar);
                        }
                        aVar.invoke(b2, str, readableMap, r5);
                        return;
                    }
                    r5.invoke(2, str2);
                }
            }
        });
    }
}
