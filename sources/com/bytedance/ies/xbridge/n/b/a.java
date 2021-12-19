package com.bytedance.ies.xbridge.n.b;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.w;
import java.util.Locale;

public final class a extends com.bytedance.ies.xbridge.n.a.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36321a = "XConfigureStatusBarMethod";

    /* renamed from: com.bytedance.ies.xbridge.n.b.a$a  reason: collision with other inner class name */
    public enum EnumC0869a {
        DARK("dark"),
        LIGHT("light"),
        UNKNOWN(null);
        
        public static final C0870a Companion = new C0870a((byte) 0);
        private final String style;

        /* renamed from: com.bytedance.ies.xbridge.n.b.a$a$a  reason: collision with other inner class name */
        public static final class C0870a {
            static {
                Covode.recordClassIndex(21755);
            }

            private C0870a() {
            }

            public /* synthetic */ C0870a(byte b2) {
                this();
            }

            public static EnumC0869a a(String str) {
                if (str == null) {
                    return EnumC0869a.UNKNOWN;
                }
                try {
                    Locale locale = Locale.US;
                    l.a((Object) locale, "");
                    String upperCase = str.toUpperCase(locale);
                    l.a((Object) upperCase, "");
                    return EnumC0869a.valueOf(upperCase);
                } catch (Throwable unused) {
                    return EnumC0869a.UNKNOWN;
                }
            }
        }

        public final String getStyle() {
            return this.style;
        }

        static {
            Covode.recordClassIndex(21754);
        }

        private EnumC0869a(String str) {
            this.style = str;
        }
    }

    static {
        Covode.recordClassIndex(21753);
    }

    @Override // com.bytedance.ies.xbridge.n.a.a
    public final void a(com.bytedance.ies.xbridge.n.d.a aVar, a.AbstractC0865a aVar2, e eVar) {
        Window window;
        boolean z;
        Window window2;
        MethodCollector.i(10625);
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(eVar, "");
        Context context = (Context) a(Context.class);
        if (context == null) {
            aVar2.a(0, "Context not provided in host");
            MethodCollector.o(10625);
            return;
        }
        Activity a2 = com.bytedance.ies.xbridge.o.a.a(context);
        String str = aVar.f36328a;
        Boolean bool = aVar.f36330c;
        try {
            EnumC0869a a3 = EnumC0869a.C0870a.a(str);
            if (a3 == EnumC0869a.UNKNOWN) {
                aVar2.a(-3, "StatusBar style can only be dark or light,  style: ".concat(String.valueOf(a3)));
                MethodCollector.o(10625);
                return;
            }
            if (a2 != null) {
                window = a2.getWindow();
            } else {
                window = null;
            }
            if (a3 == EnumC0869a.DARK) {
                z = true;
            } else {
                z = false;
            }
            if (!(a2 == null || window == null)) {
                try {
                    if (Build.VERSION.SDK_INT >= 23) {
                        View decorView = window.getDecorView();
                        l.a((Object) decorView, "");
                        int systemUiVisibility = decorView.getSystemUiVisibility();
                        if (!z) {
                            decorView.setSystemUiVisibility(systemUiVisibility & -8193);
                        } else {
                            decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                        }
                        window.clearFlags(67108864);
                        window.addFlags(Integer.MIN_VALUE);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (bool == null) {
                l.a();
            }
            if (bool.booleanValue()) {
                if (!(a2 == null || (window2 = a2.getWindow()) == null)) {
                    window2.clearFlags(1024);
                }
            } else if (a2 != null) {
                a2.getWindow().setFlags(1024, 1024);
                try {
                    Context applicationContext = a2.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                        if (applicationContext == null) {
                            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                        }
                    }
                    l.a((Object) applicationContext, "");
                    Class<?> loadClass = applicationContext.getClassLoader().loadClass("android.os.SystemProperties");
                    Object invoke = loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, "ro.miui.notch", 0);
                    if (invoke == null) {
                        w wVar = new w("null cannot be cast to non-null type");
                        MethodCollector.o(10625);
                        throw wVar;
                    } else if (((Integer) invoke).intValue() == 1 && Build.VERSION.SDK_INT < 28) {
                        try {
                            Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(a2.getWindow(), 768);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            String str2 = aVar.f36329b;
            if (!(a2 == null || str2 == null || str2.length() == 0 || str2.length() != 9)) {
                String substring = str2.substring(7, 9);
                l.a((Object) substring, "");
                if (substring != null) {
                    String upperCase = substring.toUpperCase();
                    l.a((Object) upperCase, "");
                    StringBuilder append = new StringBuilder().append("#".concat(String.valueOf(upperCase)));
                    String obj = str2.subSequence(1, 7).toString();
                    if (obj != null) {
                        String upperCase2 = obj.toUpperCase();
                        l.a((Object) upperCase2, "");
                        int parseColor = Color.parseColor(append.append(upperCase2).toString());
                        l.c(a2, "");
                        int i2 = Build.VERSION.SDK_INT;
                        a2.getWindow().addFlags(67108864);
                        View view = new View(a2);
                        l.c(a2, "");
                        view.setLayoutParams(new LinearLayout.LayoutParams(-1, a2.getResources().getDimensionPixelSize(a2.getResources().getIdentifier("status_bar_height", "dimen", "android"))));
                        view.setBackgroundColor(parseColor);
                        Window window3 = a2.getWindow();
                        l.a((Object) window3, "");
                        View decorView2 = window3.getDecorView();
                        if (decorView2 != null) {
                            ((ViewGroup) decorView2).addView(view);
                            View findViewById = a2.findViewById(R.id.adh);
                            if (findViewById != null) {
                                ViewGroup viewGroup = (ViewGroup) findViewById;
                                View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                                if (childAt != null) {
                                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                                    viewGroup2.setFitsSystemWindows(true);
                                    viewGroup2.setClipToPadding(true);
                                } else {
                                    w wVar2 = new w("null cannot be cast to non-null type");
                                    MethodCollector.o(10625);
                                    throw wVar2;
                                }
                            } else {
                                w wVar3 = new w("null cannot be cast to non-null type");
                                MethodCollector.o(10625);
                                throw wVar3;
                            }
                        } else {
                            w wVar4 = new w("null cannot be cast to non-null type");
                            MethodCollector.o(10625);
                            throw wVar4;
                        }
                    } else {
                        w wVar5 = new w("null cannot be cast to non-null type");
                        MethodCollector.o(10625);
                        throw wVar5;
                    }
                } else {
                    w wVar6 = new w("null cannot be cast to non-null type");
                    MethodCollector.o(10625);
                    throw wVar6;
                }
            }
            aVar2.a(new b(), "");
            MethodCollector.o(10625);
        } catch (Exception e5) {
            e5.getMessage();
        }
    }
}
