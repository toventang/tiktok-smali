package com.facebook.login.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.a.m;
import com.facebook.d;
import com.facebook.g;
import com.facebook.internal.ad;
import com.facebook.internal.e;
import com.facebook.internal.q;
import com.facebook.internal.r;
import com.facebook.internal.s;
import com.facebook.login.LoginManager;
import com.facebook.login.a.b;
import com.facebook.w;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class a extends g {

    /* renamed from: f  reason: collision with root package name */
    private static final String f48856f = a.class.getName();

    /* renamed from: c  reason: collision with root package name */
    public boolean f48857c;

    /* renamed from: d  reason: collision with root package name */
    public C1189a f48858d = new C1189a();

    /* renamed from: e  reason: collision with root package name */
    public String f48859e = "fb_login_view_usage";

    /* renamed from: g  reason: collision with root package name */
    private String f48860g;

    /* renamed from: h  reason: collision with root package name */
    private String f48861h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f48862i;

    /* renamed from: j  reason: collision with root package name */
    private b.EnumC1190b f48863j = b.EnumC1190b.BLUE;

    /* renamed from: k  reason: collision with root package name */
    private c f48864k;

    /* renamed from: l  reason: collision with root package name */
    private long f48865l = 6000;

    /* renamed from: m  reason: collision with root package name */
    private b f48866m;
    private d n;
    private LoginManager o;

    @Override // com.facebook.g
    public int getDefaultStyleResource() {
        return R.style.vm;
    }

    public enum c {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        
        public static c DEFAULT;
        private int intValue;
        private String stringValue;

        public final int getValue() {
            return this.intValue;
        }

        public final String toString() {
            return this.stringValue;
        }

        static {
            c cVar;
            Covode.recordClassIndex(29464);
            DEFAULT = cVar;
        }

        public static c fromInt(int i2) {
            c[] values = values();
            for (c cVar : values) {
                if (cVar.getValue() == i2) {
                    return cVar;
                }
            }
            return null;
        }

        private c(String str, int i2) {
            this.stringValue = str;
            this.intValue = i2;
        }
    }

    public long getToolTipDisplayTime() {
        return this.f48865l;
    }

    public c getToolTipMode() {
        return this.f48864k;
    }

    public String getAuthType() {
        return this.f48858d.f48876d;
    }

    public com.facebook.login.b getDefaultAudience() {
        return this.f48858d.f48873a;
    }

    public com.facebook.login.d getLoginBehavior() {
        return this.f48858d.f48875c;
    }

    /* access modifiers changed from: protected */
    public b getNewLoginClickListener() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public List<String> getPermissions() {
        return this.f48858d.f48874b;
    }

    static {
        Covode.recordClassIndex(29456);
    }

    private void b() {
        b bVar = this.f48866m;
        if (bVar != null) {
            bVar.b();
            this.f48866m = null;
        }
    }

    public LoginManager getLoginManager() {
        if (this.o == null) {
            this.o = LoginManager.a();
        }
        return this.o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.login.a.a$a  reason: collision with other inner class name */
    public static class C1189a {

        /* renamed from: a  reason: collision with root package name */
        public com.facebook.login.b f48873a = com.facebook.login.b.FRIENDS;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f48874b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public com.facebook.login.d f48875c = com.facebook.login.d.NATIVE_WITH_FALLBACK;

        /* renamed from: d  reason: collision with root package name */
        public String f48876d = "rerequest";

        static {
            Covode.recordClassIndex(29461);
        }

        C1189a() {
        }
    }

    @Override // com.facebook.g
    public int getDefaultRequestCode() {
        if (com.facebook.internal.a.b.a.a(this)) {
            return 0;
        }
        try {
            return e.b.Login.toRequestCode();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, this);
            return 0;
        }
    }

    @Override // com.facebook.g
    public void onAttachedToWindow() {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                super.onAttachedToWindow();
                d dVar = this.n;
                if (dVar != null && !dVar.f47173d) {
                    this.n.b();
                    a();
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    /* renamed from: com.facebook.login.a.a$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f48872a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 29460(0x7314, float:4.1282E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.login.a.a$c[] r0 = com.facebook.login.a.a.c.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.login.a.a.AnonymousClass3.f48872a = r2
                com.facebook.login.a.a$c r0 = com.facebook.login.a.a.c.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.login.a.a.AnonymousClass3.f48872a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.login.a.a$c r0 = com.facebook.login.a.a.c.DISPLAY_ALWAYS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.login.a.a.AnonymousClass3.f48872a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.login.a.a$c r0 = com.facebook.login.a.a.c.NEVER_DISPLAY     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.a.a.AnonymousClass3.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public class b implements View.OnClickListener {
        static {
            Covode.recordClassIndex(29462);
        }

        private LoginManager a() {
            if (com.facebook.internal.a.b.a.a(this)) {
                return null;
            }
            try {
                LoginManager a2 = LoginManager.a();
                a2.f48834b = a.this.getDefaultAudience();
                a2.f48833a = a.this.getLoginBehavior();
                a2.f48835c = a.this.getAuthType();
                return a2;
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
                return null;
            }
        }

        protected b() {
        }

        public void onClick(View view) {
            int i2;
            String string;
            if (!com.facebook.internal.a.b.a.a(this)) {
                try {
                    a aVar = a.this;
                    if (!com.facebook.internal.a.b.a.a(aVar)) {
                        try {
                            if (aVar.f47600b != null) {
                                aVar.f47600b.onClick(view);
                            }
                        } catch (Throwable th) {
                            com.facebook.internal.a.b.a.a(th, aVar);
                        }
                    }
                    AccessToken accessToken = com.facebook.b.a().f46926b;
                    int i3 = 0;
                    if (AccessToken.a()) {
                        Context context = a.this.getContext();
                        if (!com.facebook.internal.a.b.a.a(this)) {
                            try {
                                final LoginManager a2 = a();
                                if (a.this.f48857c) {
                                    String string2 = a.this.getResources().getString(R.string.ai4);
                                    String string3 = a.this.getResources().getString(R.string.ai0);
                                    Profile profile = w.a().f49235b;
                                    if (profile == null || profile.f46571f == null) {
                                        string = a.this.getResources().getString(R.string.ai7);
                                    } else {
                                        string = com.a.a(a.this.getResources().getString(R.string.ai6), new Object[]{profile.f46571f});
                                    }
                                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                                    builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new DialogInterface.OnClickListener() {
                                        /* class com.facebook.login.a.a.b.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(29463);
                                        }

                                        public final void onClick(DialogInterface dialogInterface, int i2) {
                                            a2.b();
                                        }
                                    }).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
                                    builder.create().show();
                                } else {
                                    a2.b();
                                }
                            } catch (Throwable th2) {
                                com.facebook.internal.a.b.a.a(th2, this);
                            }
                        }
                    } else if (!com.facebook.internal.a.b.a.a(this)) {
                        try {
                            LoginManager a3 = a();
                            if (a.this.getFragment() != null) {
                                Fragment fragment = a.this.getFragment();
                                a3.a(new s(fragment), a.this.f48858d.f48874b);
                            } else if (a.this.getNativeFragment() != null) {
                                android.app.Fragment nativeFragment = a.this.getNativeFragment();
                                a3.a(new s(nativeFragment), a.this.f48858d.f48874b);
                            } else {
                                Activity activity = a.this.getActivity();
                                a3.a(new LoginManager.a(activity), a3.a(a.this.f48858d.f48874b));
                            }
                        } catch (Throwable th3) {
                            com.facebook.internal.a.b.a.a(th3, this);
                        }
                    }
                    m mVar = new m(a.this.getContext());
                    Bundle bundle = new Bundle();
                    if (accessToken != null) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    bundle.putInt("logging_in", i2);
                    if (AccessToken.a()) {
                        i3 = 1;
                    }
                    bundle.putInt("access_token_expired", i3);
                    mVar.d();
                } catch (Throwable th4) {
                    com.facebook.internal.a.b.a.a(th4, this);
                }
            }
        }
    }

    public void onDetachedFromWindow() {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                super.onDetachedFromWindow();
                d dVar = this.n;
                if (dVar != null && dVar.f47173d) {
                    dVar.f47172c.unregisterReceiver(dVar.f47171b);
                    dVar.f47173d = false;
                }
                b();
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    public final void a() {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                Resources resources = getResources();
                if (isInEditMode() || !AccessToken.a()) {
                    String str = this.f48860g;
                    if (str != null) {
                        setText(str);
                        return;
                    }
                    String string = resources.getString(R.string.ai2);
                    int width = getWidth();
                    if (width != 0 && c(string) > width) {
                        string = resources.getString(R.string.ai1);
                    }
                    setText(string);
                    return;
                }
                String str2 = this.f48861h;
                if (str2 == null) {
                    str2 = resources.getString(R.string.ai5);
                }
                setText(str2);
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setLoginManager(LoginManager loginManager) {
        this.o = loginManager;
    }

    /* access modifiers changed from: package-private */
    public void setProperties(C1189a aVar) {
        this.f48858d = aVar;
    }

    public void setToolTipDisplayTime(long j2) {
        this.f48865l = j2;
    }

    public void setToolTipMode(c cVar) {
        this.f48864k = cVar;
    }

    public void setToolTipStyle(b.EnumC1190b bVar) {
        this.f48863j = bVar;
    }

    public void setAuthType(String str) {
        this.f48858d.f48876d = str;
    }

    public void setDefaultAudience(com.facebook.login.b bVar) {
        this.f48858d.f48873a = bVar;
    }

    public void setLoginBehavior(com.facebook.login.d dVar) {
        this.f48858d.f48875c = dVar;
    }

    public void setLoginText(String str) {
        this.f48860g = str;
        a();
    }

    public void setLogoutText(String str) {
        this.f48861h = str;
        a();
    }

    public void setPermissions(List<String> list) {
        this.f48858d.f48874b = list;
    }

    public void setPublishPermissions(List<String> list) {
        this.f48858d.f48874b = list;
    }

    public void setReadPermissions(List<String> list) {
        this.f48858d.f48874b = list;
    }

    public void setPermissions(String... strArr) {
        this.f48858d.f48874b = Arrays.asList(strArr);
    }

    public void setPublishPermissions(String... strArr) {
        this.f48858d.f48874b = Arrays.asList(strArr);
    }

    public void setReadPermissions(String... strArr) {
        this.f48858d.f48874b = Arrays.asList(strArr);
    }

    public a(Context context) {
        super(context, "fb_login_button_create", "fb_login_button_did_tap");
    }

    private int c(String str) {
        if (com.facebook.internal.a.b.a.a(this)) {
            return 0;
        }
        try {
            return getCompoundPaddingLeft() + getCompoundDrawablePadding() + a(str) + getCompoundPaddingRight();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, this);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                b bVar = new b(str, this);
                this.f48866m = bVar;
                bVar.a(this.f48863j);
                this.f48866m.a(this.f48865l);
                this.f48866m.a();
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    @Override // com.facebook.g
    public void onDraw(Canvas canvas) {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                super.onDraw(canvas);
                if (!this.f48862i && !isInEditMode()) {
                    this.f48862i = true;
                    if (!com.facebook.internal.a.b.a.a(this)) {
                        try {
                            int i2 = AnonymousClass3.f48872a[this.f48864k.ordinal()];
                            if (i2 == 1) {
                                final String a2 = ad.a(getContext());
                                com.facebook.m.c().execute(new Runnable() {
                                    /* class com.facebook.login.a.a.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(29457);
                                    }

                                    public final void run() {
                                        if (!com.facebook.internal.a.b.a.a(this)) {
                                            try {
                                                final q a2 = r.a(a2, false);
                                                a.this.getActivity().runOnUiThread(new Runnable() {
                                                    /* class com.facebook.login.a.a.AnonymousClass1.AnonymousClass1 */

                                                    static {
                                                        Covode.recordClassIndex(29458);
                                                    }

                                                    public final void run() {
                                                        if (!com.facebook.internal.a.b.a.a(this)) {
                                                            try {
                                                                a aVar = a.this;
                                                                q qVar = a2;
                                                                if (!com.facebook.internal.a.b.a.a(aVar) && qVar != null) {
                                                                    try {
                                                                        if (qVar.f48642c && aVar.getVisibility() == 0) {
                                                                            aVar.b(qVar.f48641b);
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        com.facebook.internal.a.b.a.a(th, aVar);
                                                                    }
                                                                }
                                                            } catch (Throwable th2) {
                                                                com.facebook.internal.a.b.a.a(th2, this);
                                                            }
                                                        }
                                                    }
                                                });
                                            } catch (Throwable th) {
                                                com.facebook.internal.a.b.a.a(th, this);
                                            }
                                        }
                                    }
                                });
                            } else if (i2 == 2) {
                                b(getResources().getString(R.string.aie));
                            }
                        } catch (Throwable th) {
                            com.facebook.internal.a.b.a.a(th, this);
                        }
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.a.b.a.a(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i2) {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                super.onVisibilityChanged(view, i2);
                if (i2 != 0) {
                    b();
                }
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom)))) + getCompoundPaddingBottom();
                Resources resources = getResources();
                String str = this.f48860g;
                if (str == null) {
                    str = resources.getString(R.string.ai2);
                    int c2 = c(str);
                    if (resolveSize(c2, i2) < c2) {
                        str = resources.getString(R.string.ai1);
                    }
                }
                int c3 = c(str);
                String str2 = this.f48861h;
                if (str2 == null) {
                    str2 = resources.getString(R.string.ai5);
                }
                setMeasuredDimension(resolveSize(Math.max(c3, c(str2)), i2), compoundPaddingTop);
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }

    @Override // com.facebook.g
    public final void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                super.a(context, attributeSet, i2, i3);
                setInternalOnClickListener(getNewLoginClickListener());
                if (!com.facebook.internal.a.b.a.a(this)) {
                    try {
                        this.f48864k = c.DEFAULT;
                        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.ou, R.attr.oy, R.attr.oz, R.attr.p4}, i2, i3);
                        try {
                            this.f48857c = obtainStyledAttributes.getBoolean(0, true);
                            this.f48860g = obtainStyledAttributes.getString(1);
                            this.f48861h = obtainStyledAttributes.getString(2);
                            this.f48864k = c.fromInt(obtainStyledAttributes.getInt(3, c.DEFAULT.getValue()));
                        } finally {
                            obtainStyledAttributes.recycle();
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.a.b.a.a(th, this);
                    }
                }
                if (isInEditMode()) {
                    setBackgroundColor(getResources().getColor(R.color.fk));
                    this.f48860g = "Continue with Facebook";
                } else {
                    this.n = new d() {
                        /* class com.facebook.login.a.a.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(29459);
                        }

                        @Override // com.facebook.d
                        public final void a() {
                            a.this.a();
                        }
                    };
                }
                a();
                setCompoundDrawablesWithIntrinsicBounds(androidx.appcompat.a.a.a.b(getContext(), R.drawable.wu), (Drawable) null, (Drawable) null, (Drawable) null);
            } catch (Throwable th2) {
                com.facebook.internal.a.b.a.a(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (!com.facebook.internal.a.b.a.a(this)) {
            try {
                super.onLayout(z, i2, i3, i4, i5);
                a();
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
            }
        }
    }
}
