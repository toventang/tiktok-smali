package com.bytedance.android.livesdk.aj;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.h.v;
import com.bytedance.android.live.i.a.b;
import com.bytedance.android.live.i.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class d implements com.bytedance.android.live.i.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static String f13821a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<Activity> f13822b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<ViewGroup> f13823c;

    /* renamed from: d  reason: collision with root package name */
    public WeakReference<b.a> f13824d;

    public static class b implements GLSurfaceView.Renderer {
        static {
            Covode.recordClassIndex(7687);
        }

        public void onDrawFrame(GL10 gl10) {
        }

        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        }
    }

    static {
        Covode.recordClassIndex(7684);
    }

    public static final class a implements b.AbstractC0153b<com.bytedance.android.live.i.a.b> {
        static {
            Covode.recordClassIndex(7686);
        }

        @Override // com.bytedance.android.live.i.b.b.AbstractC0153b
        public final b.AbstractC0153b.a<com.bytedance.android.live.i.a.b> a(b.AbstractC0153b.a<com.bytedance.android.live.i.a.b> aVar) {
            aVar.f9912a = (R) new d();
            aVar.f9913b = true;
            return aVar;
        }
    }

    @Override // com.bytedance.android.live.i.a.b
    public final String a(Context context) {
        String a2;
        String str = f13821a;
        if (str != null) {
            return str;
        }
        if (!(context == null || (a2 = com.bytedance.ies.f.b.a(context, com.bytedance.ies.f.b.f33816b).a("hardware_info_gpu_name", (String) null)) == null)) {
            f13821a = a2;
        }
        return f13821a;
    }

    public static void a(b.a aVar, String str) {
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.bytedance.android.live.i.a.b
    public final void a(Activity activity, View view, b.a aVar) {
        MethodCollector.i(3386);
        String str = f13821a;
        if (str != null) {
            a(aVar, str);
            MethodCollector.o(3386);
        } else if (activity == null) {
            MethodCollector.o(3386);
        } else {
            String a2 = a(activity);
            if (a2 != null) {
                a(aVar, a2);
                MethodCollector.o(3386);
            } else if (!(view instanceof ViewGroup)) {
                MethodCollector.o(3386);
            } else if (this.f13822b != null) {
                MethodCollector.o(3386);
            } else {
                this.f13822b = new WeakReference<>(activity);
                ViewGroup viewGroup = (ViewGroup) view;
                this.f13823c = new WeakReference<>(viewGroup);
                this.f13824d = new WeakReference<>(aVar);
                final GLSurfaceView gLSurfaceView = new GLSurfaceView(activity);
                gLSurfaceView.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
                gLSurfaceView.setRenderer(new b() {
                    /* class com.bytedance.android.livesdk.aj.d.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(7685);
                    }

                    @Override // com.bytedance.android.livesdk.aj.d.b
                    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
                        String str;
                        String glGetString = gl10.glGetString(7937);
                        String glGetString2 = gl10.glGetString(7936);
                        if (TextUtils.isEmpty(glGetString) || TextUtils.isEmpty(glGetString2)) {
                            str = null;
                        } else {
                            str = glGetString2 + " " + glGetString;
                        }
                        try {
                            if (d.this.f13822b != null) {
                                Activity activity = d.this.f13822b.get();
                                if (activity != null) {
                                    activity.runOnUiThread(new e(this, str, activity, gLSurfaceView));
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        d.this.f13822b = null;
                        d.this.f13823c = null;
                        d.this.f13824d = null;
                    }
                });
                gLSurfaceView.setId(v.a());
                viewGroup.addView(gLSurfaceView);
                MethodCollector.o(3386);
            }
        }
    }
}
