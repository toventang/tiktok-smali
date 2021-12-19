package com.lynx.tasm.navigator;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.d;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.utils.m;
import java.util.HashMap;

public class NavigationModule extends LynxModule {
    public static String NAME = "NavigationModule";

    @d
    public String getString() {
        return NAME;
    }

    static {
        Covode.recordClassIndex(35356);
    }

    @d
    public void goBack() {
        m.a(new Runnable() {
            /* class com.lynx.tasm.navigator.NavigationModule.AnonymousClass4 */

            static {
                Covode.recordClassIndex(35360);
            }

            public final void run() {
                a c2 = c.f56794a.c();
                if (c2 == null) {
                    return;
                }
                if (!c2.f56776a.isEmpty()) {
                    c2.a((LynxView) c2.f56779d.remove(c2.f56776a.pop()));
                    return;
                }
                b a2 = c2.a();
                if (a2 != null) {
                    a2.v();
                }
            }
        });
    }

    public NavigationModule(Context context) {
        super(context);
    }

    @d
    public void registerRoute(final ReadableMap readableMap) {
        m.a(new Runnable() {
            /* class com.lynx.tasm.navigator.NavigationModule.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35357);
            }

            public final void run() {
                c cVar = c.f56794a;
                ReadableMap readableMap = readableMap;
                a c2 = cVar.c();
                if (c2 != null) {
                    c2.f56778c = readableMap.toHashMap();
                }
            }
        });
    }

    public NavigationModule(Context context, Object obj) {
        super(context, obj);
    }

    @d
    public void navigateTo(final String str, final ReadableMap readableMap) {
        m.a(new Runnable() {
            /* class com.lynx.tasm.navigator.NavigationModule.AnonymousClass2 */

            static {
                Covode.recordClassIndex(35358);
            }

            public final void run() {
                a c2;
                HashMap<String, Object> hashMap = new HashMap<>();
                ReadableMap readableMap = readableMap;
                if (readableMap != null) {
                    hashMap = readableMap.toHashMap();
                }
                c cVar = c.f56794a;
                String str = str;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if ((cVar.f56795b == null || !cVar.f56795b.a()) && (c2 = cVar.c()) != null) {
                    d dVar = new d(c2.a(str), hashMap);
                    c2.a(dVar, new g(dVar, str) {
                        /* class com.lynx.tasm.navigator.a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ d f56781a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f56782b;

                        static {
                            Covode.recordClassIndex(35362);
                        }

                        @Override // com.lynx.tasm.navigator.g
                        public final void a(LynxView lynxView) {
                            if (lynxView != null) {
                                if (!a.this.f56776a.isEmpty()) {
                                    a.b((LynxView) a.this.f56779d.get(a.this.f56776a.peek()));
                                } else {
                                    a.b(a.this.b());
                                }
                                a.this.f56776a.push(this.f56781a);
                                b a2 = a.this.a();
                                if (a2 != null) {
                                    a2.a(lynxView);
                                }
                            }
                        }

                        {
                            this.f56781a = r2;
                            this.f56782b = r3;
                        }
                    });
                }
            }
        });
    }

    @d
    public void replace(final String str, final ReadableMap readableMap) {
        m.a(new Runnable() {
            /* class com.lynx.tasm.navigator.NavigationModule.AnonymousClass3 */

            static {
                Covode.recordClassIndex(35359);
            }

            public final void run() {
                a c2;
                HashMap<String, Object> hashMap = new HashMap<>();
                ReadableMap readableMap = readableMap;
                if (readableMap != null) {
                    hashMap = readableMap.toHashMap();
                }
                c cVar = c.f56794a;
                String str = str;
                if (!TextUtils.isEmpty(str) && (c2 = cVar.c()) != null) {
                    d dVar = new d(c2.a(str), hashMap);
                    c2.a(dVar, new g(dVar, str) {
                        /* class com.lynx.tasm.navigator.a.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ d f56784a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f56785b;

                        static {
                            Covode.recordClassIndex(35363);
                        }

                        @Override // com.lynx.tasm.navigator.g
                        public final void a(LynxView lynxView) {
                            if (lynxView != null) {
                                if (!a.this.f56776a.isEmpty()) {
                                    d pop = a.this.f56776a.pop();
                                    a.this.a((LynxView) a.this.f56779d.remove(pop));
                                } else {
                                    a aVar = a.this;
                                    aVar.a(aVar.b());
                                }
                                a.this.f56776a.push(this.f56784a);
                                b a2 = a.this.a();
                                if (a2 != null) {
                                    a2.a(lynxView);
                                }
                            }
                        }

                        {
                            this.f56784a = r2;
                            this.f56785b = r3;
                        }
                    });
                }
            }
        });
    }
}
