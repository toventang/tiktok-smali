package com.snapchat.kit.sdk.core.controller;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.controller.FirebaseStateController;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;

public final class b implements FirebaseStateController, LoginStateController {

    /* renamed from: a  reason: collision with root package name */
    final WeakHashMap<LoginStateController.OnLoginStartListener, Void> f57112a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f57113b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakHashMap<LoginStateController.OnLoginStateChangedListener, Void> f57114c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<FirebaseStateController.OnFirebaseCustomTokenResultListener, Void> f57115d = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(35590);
    }

    /* access modifiers changed from: package-private */
    public final Collection<LoginStateController.OnLoginStateChangedListener> a() {
        return new ArrayList(this.f57114c.keySet());
    }

    /* access modifiers changed from: package-private */
    public final Collection<FirebaseStateController.OnFirebaseCustomTokenResultListener> b() {
        return new ArrayList(this.f57115d.keySet());
    }

    public final void c() {
        this.f57113b.post(new Runnable() {
            /* class com.snapchat.kit.sdk.core.controller.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35591);
            }

            public final void run() {
                for (LoginStateController.OnLoginStartListener onLoginStartListener : new ArrayList(b.this.f57112a.keySet())) {
                    onLoginStartListener.onLoginStart();
                }
            }
        });
    }

    public final void d() {
        this.f57113b.post(new Runnable() {
            /* class com.snapchat.kit.sdk.core.controller.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(35592);
            }

            public final void run() {
                for (LoginStateController.OnLoginStateChangedListener onLoginStateChangedListener : b.this.a()) {
                    onLoginStateChangedListener.onLoginFailed();
                }
            }
        });
    }

    public final void e() {
        this.f57113b.post(new Runnable() {
            /* class com.snapchat.kit.sdk.core.controller.b.AnonymousClass4 */

            static {
                Covode.recordClassIndex(35594);
            }

            public final void run() {
                for (LoginStateController.OnLoginStateChangedListener onLoginStateChangedListener : b.this.a()) {
                    onLoginStateChangedListener.onLogout();
                }
            }
        });
    }

    @Override // com.snapchat.kit.sdk.core.controller.FirebaseStateController
    public final void addOnFirebaseCustomTokenResultListener(FirebaseStateController.OnFirebaseCustomTokenResultListener onFirebaseCustomTokenResultListener) {
        this.f57115d.put(onFirebaseCustomTokenResultListener, null);
    }

    @Override // com.snapchat.kit.sdk.core.controller.LoginStateController
    public final void addOnLoginStartListener(LoginStateController.OnLoginStartListener onLoginStartListener) {
        this.f57112a.put(onLoginStartListener, null);
    }

    @Override // com.snapchat.kit.sdk.core.controller.LoginStateController
    public final void addOnLoginStateChangedListener(LoginStateController.OnLoginStateChangedListener onLoginStateChangedListener) {
        this.f57114c.put(onLoginStateChangedListener, null);
    }

    @Override // com.snapchat.kit.sdk.core.controller.FirebaseStateController
    public final void removeOnFirebaseCustomTokenResultListener(FirebaseStateController.OnFirebaseCustomTokenResultListener onFirebaseCustomTokenResultListener) {
        this.f57115d.remove(onFirebaseCustomTokenResultListener);
    }

    @Override // com.snapchat.kit.sdk.core.controller.LoginStateController
    public final void removeOnLoginStartListener(LoginStateController.OnLoginStartListener onLoginStartListener) {
        this.f57112a.remove(onLoginStartListener);
    }

    @Override // com.snapchat.kit.sdk.core.controller.LoginStateController
    public final void removeOnLoginStateChangedListener(LoginStateController.OnLoginStateChangedListener onLoginStateChangedListener) {
        this.f57114c.remove(onLoginStateChangedListener);
    }

    b(Handler handler) {
        this.f57113b = handler;
    }

    public final void a(final a aVar) {
        this.f57113b.post(new Runnable() {
            /* class com.snapchat.kit.sdk.core.controller.b.AnonymousClass6 */

            static {
                Covode.recordClassIndex(35596);
            }

            public final void run() {
                for (FirebaseStateController.OnFirebaseCustomTokenResultListener onFirebaseCustomTokenResultListener : b.this.b()) {
                    onFirebaseCustomTokenResultListener.onFailure(aVar);
                }
            }
        });
    }
}
