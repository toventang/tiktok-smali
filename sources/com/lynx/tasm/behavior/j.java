package com.lynx.tasm.behavior;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.b.b;
import com.lynx.tasm.c;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.d.a;
import com.lynx.tasm.g;
import com.lynx.tasm.o;
import com.lynx.tasm.utils.d;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class j extends ContextWrapper implements e {

    /* renamed from: a  reason: collision with root package name */
    private LayoutInflater f55893a;

    /* renamed from: b  reason: collision with root package name */
    public f f55894b;

    /* renamed from: c  reason: collision with root package name */
    public JavaOnlyMap f55895c;

    /* renamed from: d  reason: collision with root package name */
    public ReadableMap f55896d;

    /* renamed from: e  reason: collision with root package name */
    public c f55897e;

    /* renamed from: f  reason: collision with root package name */
    public w f55898f;

    /* renamed from: g  reason: collision with root package name */
    public g f55899g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference<JSProxy> f55900h;

    /* renamed from: i  reason: collision with root package name */
    public UIBody f55901i;

    /* renamed from: j  reason: collision with root package name */
    public WeakReference<q> f55902j;

    /* renamed from: k  reason: collision with root package name */
    public WeakReference<l> f55903k;

    /* renamed from: l  reason: collision with root package name */
    public String f55904l;

    /* renamed from: m  reason: collision with root package name */
    public o f55905m;
    public WeakReference<LynxView> n;
    public WeakReference<t> o;
    public DisplayMetrics p;
    public boolean q;
    public boolean r = true;
    public boolean s;
    public com.lynx.tasm.provider.c t;
    public List<r> u;
    public WeakReference<b> v;
    private Map<String, a> w;
    private WeakReference<Context> x;

    static {
        Covode.recordClassIndex(34944);
    }

    @Override // com.lynx.tasm.behavior.e
    public abstract void a(Exception exc);

    public final void a(String str, String str2, String str3) {
        if (this.f55905m != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("src", str);
                jSONObject.put("error_msg", str3);
                jSONObject.put(StringSet.type, str2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            this.f55905m.a(new com.lynx.tasm.j(jSONObject.toString(), 301));
        }
    }

    public final Context a() {
        return this.x.get();
    }

    public final LynxView b() {
        return this.n.get();
    }

    public final l c() {
        return this.f55903k.get();
    }

    public final Long d() {
        JSProxy jSProxy = this.f55900h.get();
        if (jSProxy != null) {
            return Long.valueOf(jSProxy.f56539b);
        }
        return null;
    }

    public final com.lynx.jsbridge.b a(String str) {
        JSProxy jSProxy;
        WeakReference<JSProxy> weakReference = this.f55900h;
        if (weakReference == null || (jSProxy = weakReference.get()) == null) {
            return null;
        }
        return jSProxy.a(str);
    }

    public final ShadowNode b(int i2) {
        t tVar = this.o.get();
        if (tVar != null) {
            return tVar.f56049c.a(i2);
        }
        return null;
    }

    public final LynxBaseUI a(int i2) {
        q qVar = this.f55902j.get();
        if (qVar != null) {
            return qVar.a(i2);
        }
        return null;
    }

    public final a b(String str) {
        String a2 = d.a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        synchronized (d.class) {
            if (this.w == null) {
                this.w = new HashMap();
            }
            a aVar = this.w.get(a2);
            if (aVar != null) {
                return aVar;
            }
            a a3 = d.a(this, a2);
            if (a3 != null) {
                this.w.put(a2, a3);
            }
            return a3;
        }
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return a(getBaseContext(), str);
        }
        if (this.f55893a == null) {
            this.f55893a = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f55893a;
    }

    public final void a(ReadableMap readableMap) {
        if (this.f55895c == null) {
            this.f55895c = new JavaOnlyMap();
        }
        this.f55895c.merge(readableMap);
    }

    public final void a(LynxBaseUI lynxBaseUI) {
        w wVar = this.f55898f;
        if (wVar != null && wVar.f56473e != null) {
            wVar.f56473e.add(Integer.valueOf(lynxBaseUI.getSign()));
        }
    }

    public j(Context context, DisplayMetrics displayMetrics) {
        super(context);
        this.x = new WeakReference<>(context);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        this.p = displayMetrics2;
        displayMetrics2.setTo(displayMetrics);
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }

    public final LynxBaseUI a(String str, LynxBaseUI lynxBaseUI) {
        q qVar = this.f55902j.get();
        if (qVar != null) {
            return qVar.a(str, lynxBaseUI);
        }
        return null;
    }

    public final void a(String str, JavaOnlyArray javaOnlyArray) {
        com.lynx.jsbridge.b a2 = a("GlobalEventEmitter");
        if (a2 != null) {
            JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
            javaOnlyArray2.pushString(str);
            javaOnlyArray2.pushArray(javaOnlyArray);
            a2.a("emit", javaOnlyArray2);
        }
    }
}
