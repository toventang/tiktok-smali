package com.lynx.jsbridge;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.d;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.k;
import com.lynx.tasm.behavior.l;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.utils.m;
import java.util.Iterator;

public class LynxIntersectionObserverModule extends LynxContextModule {
    static {
        Covode.recordClassIndex(34736);
    }

    public LynxIntersectionObserverModule(j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: package-private */
    @d
    public void disconnect(final int i2) {
        m.a(new d(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.AnonymousClass5 */

            static {
                Covode.recordClassIndex(34741);
            }

            @Override // com.lynx.react.bridge.d
            public final void a() {
                k a2 = LynxIntersectionObserverModule.this.mLynxContext.c().a(i2);
                if (a2 != null) {
                    a2.f55911f.clear();
                    l lVar = a2.f55907b.get();
                    int i2 = a2.f55906a;
                    Iterator<k> it = lVar.f55928a.iterator();
                    while (it.hasNext()) {
                        k next = it.next();
                        if (next.f55906a == i2) {
                            lVar.f55928a.remove(next);
                            return;
                        }
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    @d
    public void relativeToViewport(final int i2, final ReadableMap readableMap) {
        m.a(new d(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.AnonymousClass3 */

            static {
                Covode.recordClassIndex(34739);
            }

            @Override // com.lynx.react.bridge.d
            public final void a() {
                k a2 = LynxIntersectionObserverModule.this.mLynxContext.c().a(i2);
                if (a2 != null) {
                    ReadableMap readableMap = readableMap;
                    a2.f55910e = null;
                    a2.a(readableMap);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    @d
    public void createIntersectionObserver(final int i2, final String str, final ReadableMap readableMap) {
        m.a(new d(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34737);
            }

            @Override // com.lynx.react.bridge.d
            public final void a() {
                l c2 = LynxIntersectionObserverModule.this.mLynxContext.c();
                if (c2.a(i2) == null) {
                    int i2 = -1;
                    if (!str.isEmpty()) {
                        i2 = Integer.parseInt(str);
                    }
                    c2.a(new k(c2, i2, i2, readableMap));
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    @d
    public void observe(final int i2, final String str, final int i3) {
        m.a(new d(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.AnonymousClass4 */

            static {
                Covode.recordClassIndex(34740);
            }

            @Override // com.lynx.react.bridge.d
            public final void a() {
                LynxBaseUI a2;
                k a3 = LynxIntersectionObserverModule.this.mLynxContext.c().a(i2);
                if (a3 != null) {
                    String str = str;
                    int i2 = i3;
                    if (str.startsWith("#") && (a2 = a3.f55907b.get().a().a(str.substring(1), a3.f55909d)) != null) {
                        for (int i3 = 0; i3 < a3.f55911f.size(); i3++) {
                            if (a3.f55911f.get(i3).f55925a == a2) {
                                return;
                            }
                        }
                        k.b bVar = new k.b((byte) 0);
                        bVar.f55925a = a2;
                        bVar.f55926b = i2;
                        a3.f55911f.add(bVar);
                        a3.a(bVar, a3.b(), true);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    @d
    public void relativeTo(final int i2, final String str, final ReadableMap readableMap) {
        m.a(new d(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.AnonymousClass2 */

            static {
                Covode.recordClassIndex(34738);
            }

            @Override // com.lynx.react.bridge.d
            public final void a() {
                k a2 = LynxIntersectionObserverModule.this.mLynxContext.c().a(i2);
                if (a2 != null) {
                    String str = str;
                    ReadableMap readableMap = readableMap;
                    if (str.startsWith("#")) {
                        a2.f55910e = a2.f55907b.get().a().a(str.substring(1), a2.f55909d);
                        a2.a(readableMap);
                    }
                }
            }
        });
    }
}
