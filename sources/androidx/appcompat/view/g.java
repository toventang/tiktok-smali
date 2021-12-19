package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.w;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class g extends MenuInflater {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?>[] f1084a;

    /* renamed from: b  reason: collision with root package name */
    static final Class<?>[] f1085b;

    /* renamed from: c  reason: collision with root package name */
    final Object[] f1086c;

    /* renamed from: d  reason: collision with root package name */
    final Object[] f1087d;

    /* renamed from: e  reason: collision with root package name */
    Context f1088e;

    /* renamed from: f  reason: collision with root package name */
    Object f1089f;

    /* access modifiers changed from: package-private */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        private static final Class<?>[] f1090a = {MenuItem.class};

        /* renamed from: b  reason: collision with root package name */
        private Object f1091b;

        /* renamed from: c  reason: collision with root package name */
        private Method f1092c;

        static {
            Covode.recordClassIndex(316);
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1092c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1092c.invoke(this.f1091b, menuItem)).booleanValue();
                }
                this.f1092c.invoke(this.f1091b, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }

        public a(Object obj, String str) {
            this.f1091b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1092c = cls.getMethod(str, f1090a);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b {
        private String A;
        private String B;
        private CharSequence C;
        private CharSequence D;
        private ColorStateList E;
        private PorterDuff.Mode F;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1093a;

        /* renamed from: b  reason: collision with root package name */
        androidx.core.h.b f1094b;

        /* renamed from: d  reason: collision with root package name */
        private Menu f1096d;

        /* renamed from: e  reason: collision with root package name */
        private int f1097e;

        /* renamed from: f  reason: collision with root package name */
        private int f1098f;

        /* renamed from: g  reason: collision with root package name */
        private int f1099g;

        /* renamed from: h  reason: collision with root package name */
        private int f1100h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f1101i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f1102j;

        /* renamed from: k  reason: collision with root package name */
        private int f1103k;

        /* renamed from: l  reason: collision with root package name */
        private int f1104l;

        /* renamed from: m  reason: collision with root package name */
        private CharSequence f1105m;
        private CharSequence n;
        private int o;
        private char p;
        private int q;
        private char r;
        private int s;
        private int t;
        private boolean u;
        private boolean v;
        private boolean w;
        private int x;
        private int y;
        private String z;

        static {
            Covode.recordClassIndex(317);
        }

        public final void b() {
            this.f1093a = true;
            a(this.f1096d.add(this.f1097e, this.f1103k, this.f1104l, this.f1105m));
        }

        public final SubMenu c() {
            this.f1093a = true;
            SubMenu addSubMenu = this.f1096d.addSubMenu(this.f1097e, this.f1103k, this.f1104l, this.f1105m);
            a(addSubMenu.getItem());
            return addSubMenu;
        }

        public final void a() {
            this.f1097e = 0;
            this.f1098f = 0;
            this.f1099g = 0;
            this.f1100h = 0;
            this.f1101i = true;
            this.f1102j = true;
        }

        private static char a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        public final void a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f1088e.obtainStyledAttributes(attributeSet, new int[]{16842766, 16842960, 16843156, 16843230, 16843231, 16843232});
            this.f1097e = obtainStyledAttributes.getResourceId(1, 0);
            this.f1098f = obtainStyledAttributes.getInt(3, 0);
            this.f1099g = obtainStyledAttributes.getInt(4, 0);
            this.f1100h = obtainStyledAttributes.getInt(5, 0);
            this.f1101i = obtainStyledAttributes.getBoolean(2, true);
            this.f1102j = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        private void a(MenuItem menuItem) {
            boolean z2;
            MenuItem enabled = menuItem.setChecked(this.u).setVisible(this.v).setEnabled(this.w);
            boolean z3 = false;
            if (this.t > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            enabled.setCheckable(z2).setTitleCondensed(this.n).setIcon(this.o);
            int i2 = this.x;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.B != null) {
                if (!g.this.f1088e.isRestricted()) {
                    g gVar = g.this;
                    if (gVar.f1089f == null) {
                        gVar.f1089f = g.a(gVar.f1088e);
                    }
                    menuItem.setOnMenuItemClickListener(new a(gVar.f1089f, this.B));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.t >= 2) {
                if (menuItem instanceof j) {
                    ((j) menuItem).a(true);
                } else if (menuItem instanceof k) {
                    k kVar = (k) menuItem;
                    try {
                        if (kVar.f1242c == null) {
                            kVar.f1242c = ((androidx.core.a.a.b) kVar.f1170b).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        kVar.f1242c.invoke(kVar.f1170b, true);
                    } catch (Exception unused) {
                    }
                }
            }
            String str = this.z;
            if (str != null) {
                menuItem.setActionView((View) a(str, g.f1084a, g.this.f1086c));
                z3 = true;
            }
            int i3 = this.y;
            if (i3 > 0 && !z3) {
                menuItem.setActionView(i3);
            }
            androidx.core.h.b bVar = this.f1094b;
            if (bVar != null && (menuItem instanceof androidx.core.a.a.b)) {
                ((androidx.core.a.a.b) menuItem).a(bVar);
            }
            CharSequence charSequence = this.C;
            boolean z4 = menuItem instanceof androidx.core.a.a.b;
            if (z4) {
                ((androidx.core.a.a.b) menuItem).a(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.D;
            if (z4) {
                ((androidx.core.a.a.b) menuItem).b(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.p;
            int i4 = this.q;
            if (z4) {
                ((androidx.core.a.a.b) menuItem).setAlphabeticShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c2, i4);
            }
            char c3 = this.r;
            int i5 = this.s;
            if (z4) {
                ((androidx.core.a.a.b) menuItem).setNumericShortcut(c3, i5);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c3, i5);
            }
            PorterDuff.Mode mode = this.F;
            if (mode != null) {
                if (z4) {
                    ((androidx.core.a.a.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.E;
            if (colorStateList == null) {
                return;
            }
            if (z4) {
                ((androidx.core.a.a.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }

        public final void b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f1088e.obtainStyledAttributes(attributeSet, new int[]{16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.h_, R.attr.hr, R.attr.hs, R.attr.f356if, R.attr.pk, R.attr.w6, R.attr.w7, R.attr.a6h, R.attr.abs, R.attr.ajq});
            this.f1103k = obtainStyledAttributes.getResourceId(2, 0);
            this.f1104l = (obtainStyledAttributes.getInt(5, this.f1098f) & -65536) | (obtainStyledAttributes.getInt(6, this.f1099g) & 65535);
            this.f1105m = obtainStyledAttributes.getText(7);
            this.n = obtainStyledAttributes.getText(8);
            this.o = obtainStyledAttributes.getResourceId(0, 0);
            this.p = a(obtainStyledAttributes.getString(9));
            this.q = obtainStyledAttributes.getInt(16, 4096);
            this.r = a(obtainStyledAttributes.getString(10));
            this.s = obtainStyledAttributes.getInt(20, 4096);
            if (obtainStyledAttributes.hasValue(11)) {
                this.t = obtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
            } else {
                this.t = this.f1100h;
            }
            this.u = obtainStyledAttributes.getBoolean(3, false);
            this.v = obtainStyledAttributes.getBoolean(4, this.f1101i);
            boolean z2 = true;
            this.w = obtainStyledAttributes.getBoolean(1, this.f1102j);
            this.x = obtainStyledAttributes.getInt(21, -1);
            this.B = obtainStyledAttributes.getString(12);
            this.y = obtainStyledAttributes.getResourceId(13, 0);
            this.z = obtainStyledAttributes.getString(15);
            String string = obtainStyledAttributes.getString(14);
            this.A = string;
            if (string == null) {
                z2 = false;
            }
            if (z2 && this.y == 0 && this.z == null) {
                this.f1094b = (androidx.core.h.b) a(string, g.f1085b, g.this.f1087d);
            } else {
                this.f1094b = null;
            }
            this.C = obtainStyledAttributes.getText(17);
            this.D = obtainStyledAttributes.getText(22);
            if (obtainStyledAttributes.hasValue(19)) {
                this.F = w.a(obtainStyledAttributes.getInt(19, -1), this.F);
            } else {
                this.F = null;
            }
            if (obtainStyledAttributes.hasValue(18)) {
                this.E = obtainStyledAttributes.getColorStateList(18);
            } else {
                this.E = null;
            }
            obtainStyledAttributes.recycle();
            this.f1093a = false;
        }

        public b(Menu menu) {
            this.f1096d = menu;
            a();
        }

        private <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = g.this.f1088e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        Covode.recordClassIndex(315);
        Class<?>[] clsArr = {Context.class};
        f1084a = clsArr;
        f1085b = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f1088e = context;
        Object[] objArr = {context};
        this.f1086c = objArr;
        this.f1087d = objArr;
    }

    static Object a(Object obj) {
        while (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return obj;
    }

    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof androidx.core.a.a.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser layout = this.f1088e.getResources().getLayout(i2);
            a(layout, Xml.asAttributeSet(layout), menu);
            if (layout != null) {
                layout.close();
            }
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    private void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    int next = xmlPullParser.next();
                    String str = null;
                    boolean z = false;
                    boolean z2 = false;
                    while (next != 1) {
                        if (next != 2) {
                            if (next == 3) {
                                String name2 = xmlPullParser.getName();
                                if (z2 && name2.equals(str)) {
                                    str = null;
                                    z2 = false;
                                } else if (name2.equals("group")) {
                                    bVar.a();
                                } else if (name2.equals("item")) {
                                    if (!bVar.f1093a) {
                                        if (bVar.f1094b == null || !bVar.f1094b.c()) {
                                            bVar.b();
                                        } else {
                                            bVar.c();
                                        }
                                    }
                                } else if (name2.equals("menu")) {
                                    z = true;
                                }
                            }
                        } else if (!z2) {
                            String name3 = xmlPullParser.getName();
                            if (name3.equals("group")) {
                                bVar.a(attributeSet);
                            } else if (name3.equals("item")) {
                                bVar.b(attributeSet);
                            } else if (name3.equals("menu")) {
                                a(xmlPullParser, attributeSet, bVar.c());
                            } else {
                                str = name3;
                                z2 = true;
                            }
                        }
                        next = xmlPullParser.next();
                        if (z) {
                            return;
                        }
                    }
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(name)));
                }
            }
        }
        throw new RuntimeException("Unexpected end of document");
    }
}
