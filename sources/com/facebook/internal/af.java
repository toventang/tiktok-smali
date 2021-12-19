package com.facebook.internal;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.j;
import com.facebook.l;
import com.facebook.m;
import com.facebook.r;
import com.facebook.share.internal.k;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.tiktok.security.b.h;
import com.ss.android.ugc.tiktok.security.b.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

public class af extends Dialog {

    /* renamed from: k  reason: collision with root package name */
    private static final int f48527k = R.style.vf;

    /* renamed from: m  reason: collision with root package name */
    private static volatile int f48528m;

    /* renamed from: a  reason: collision with root package name */
    public String f48529a;

    /* renamed from: b  reason: collision with root package name */
    public String f48530b;

    /* renamed from: c  reason: collision with root package name */
    public c f48531c;

    /* renamed from: d  reason: collision with root package name */
    public WebView f48532d;

    /* renamed from: e  reason: collision with root package name */
    public ProgressDialog f48533e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f48534f;

    /* renamed from: g  reason: collision with root package name */
    public FrameLayout f48535g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f48536h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f48537i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f48538j;

    /* renamed from: l  reason: collision with root package name */
    private d f48539l;
    private WindowManager.LayoutParams n;

    public interface c {
        static {
            Covode.recordClassIndex(29280);
        }

        void a(Bundle bundle, j jVar);
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        j jVar;
        if (this.f48531c != null && !this.f48536h) {
            this.f48536h = true;
            if (th instanceof j) {
                jVar = (j) th;
            } else {
                jVar = new j(th);
            }
            this.f48531c.a(null, jVar);
            dismiss();
        }
    }

    public final void a(int i2) {
        MethodCollector.i(9076);
        LinearLayout linearLayout = new LinearLayout(getContext());
        AnonymousClass3 r1 = new WebView(getContext()) {
            /* class com.facebook.internal.af.AnonymousClass3 */

            static {
                Covode.recordClassIndex(29276);
            }

            public final void goBack() {
                if (!i.b(this)) {
                    super.goBack();
                }
            }

            public final boolean canGoBack() {
                if (!super.canGoBack() || !i.a(this)) {
                    return false;
                }
                return true;
            }

            public final void onWindowFocusChanged(boolean z) {
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                }
            }

            {
                MethodCollector.i(9787);
                if (com.ss.android.ugc.tiktok.security.c.b.a()) {
                    WebSettings settings = getSettings();
                    String userAgentString = settings.getUserAgentString();
                    if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                        StringBuilder sb = new StringBuilder(userAgentString);
                        if (!TextUtils.isEmpty(sb)) {
                            sb.append(" ");
                        }
                        sb.append("BytedanceWebview/d8a21c6");
                        com.a.a(settings, sb.toString());
                    }
                }
                MethodCollector.o(9787);
            }
        };
        this.f48532d = r1;
        r1.setVerticalScrollBarEnabled(false);
        this.f48532d.setHorizontalScrollBarEnabled(false);
        a(this.f48532d, new b(this, (byte) 0));
        this.f48532d.getSettings().setJavaScriptEnabled(true);
        a(this.f48532d, this.f48529a);
        this.f48532d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f48532d.setVisibility(4);
        this.f48532d.getSettings().setSavePassword(false);
        this.f48532d.getSettings().setSaveFormData(false);
        this.f48532d.setFocusable(true);
        this.f48532d.setFocusableInTouchMode(true);
        this.f48532d.setOnTouchListener(new View.OnTouchListener() {
            /* class com.facebook.internal.af.AnonymousClass4 */

            static {
                Covode.recordClassIndex(29277);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        linearLayout.setPadding(i2, i2, i2, i2);
        linearLayout.addView(this.f48532d);
        linearLayout.setBackgroundColor(-872415232);
        this.f48535g.addView(linearLayout);
        MethodCollector.o(9076);
    }

    public void onDetachedFromWindow() {
        this.f48537i = true;
        super.onDetachedFromWindow();
    }

    static {
        Covode.recordClassIndex(29273);
    }

    public void cancel() {
        if (this.f48531c != null && !this.f48536h) {
            a(new l());
        }
    }

    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f48532d;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f48537i && (progressDialog = this.f48533e) != null && progressDialog.isShowing()) {
            this.f48533e.dismiss();
        }
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        d dVar = this.f48539l;
        if (dVar != null) {
            dVar.cancel(true);
            this.f48533e.dismiss();
        }
        super.onStop();
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f48544a;

        /* renamed from: b  reason: collision with root package name */
        public String f48545b;

        /* renamed from: c  reason: collision with root package name */
        public int f48546c;

        /* renamed from: d  reason: collision with root package name */
        public c f48547d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f48548e;

        /* renamed from: f  reason: collision with root package name */
        private String f48549f;

        /* renamed from: g  reason: collision with root package name */
        private AccessToken f48550g;

        static {
            Covode.recordClassIndex(29278);
        }

        public af a() {
            AccessToken accessToken = this.f48550g;
            if (accessToken != null) {
                this.f48548e.putString("app_id", accessToken.f46501h);
                this.f48548e.putString("access_token", this.f48550g.f46498e);
            } else {
                this.f48548e.putString("app_id", this.f48545b);
            }
            return af.a(this.f48544a, this.f48549f, this.f48548e, this.f48546c, this.f48547d);
        }

        private void a(Context context, String str, Bundle bundle) {
            this.f48544a = context;
            this.f48549f = str;
            if (bundle != null) {
                this.f48548e = bundle;
            } else {
                this.f48548e = new Bundle();
            }
        }

        public a(Context context, String str, Bundle bundle) {
            this.f48550g = com.facebook.b.a().f46926b;
            if (!AccessToken.a()) {
                String a2 = ad.a(context);
                if (a2 != null) {
                    this.f48545b = a2;
                } else {
                    throw new j("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            a(context, str, bundle);
        }

        public a(Context context, String str, String str2, Bundle bundle) {
            str = str == null ? ad.a(context) : str;
            ae.a(str, "applicationId");
            this.f48545b = str;
            a(context, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        d dVar = this.f48539l;
        if (dVar == null || dVar.getStatus() != AsyncTask.Status.PENDING) {
            a();
            return;
        }
        this.f48539l.execute(new Void[0]);
        this.f48533e.show();
    }

    public void onAttachedToWindow() {
        AutofillManager autofillManager;
        WindowManager.LayoutParams layoutParams;
        this.f48537i = false;
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled() && (layoutParams = this.n) != null && layoutParams.token == null) {
            this.n.token = getOwnerActivity().getWindow().getAttributes().token;
            IBinder iBinder = this.n.token;
        }
        super.onAttachedToWindow();
    }

    class d extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a  reason: collision with root package name */
        public Exception[] f48552a;

        /* renamed from: c  reason: collision with root package name */
        private String f48554c;

        /* renamed from: d  reason: collision with root package name */
        private Bundle f48555d;

        static {
            Covode.recordClassIndex(29281);
        }

        private String[] a() {
            if (com.facebook.internal.a.b.a.a(this)) {
                return null;
            }
            try {
                String[] stringArray = this.f48555d.getStringArray("media");
                final String[] strArr = new String[stringArray.length];
                this.f48552a = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                AccessToken accessToken = com.facebook.b.a().f46926b;
                for (final int i2 = 0; i2 < stringArray.length; i2++) {
                    try {
                        if (isCancelled()) {
                            Iterator it = concurrentLinkedQueue.iterator();
                            while (it.hasNext()) {
                                ((AsyncTask) it.next()).cancel(true);
                            }
                            return null;
                        }
                        Uri parse = Uri.parse(stringArray[i2]);
                        if (ad.b(parse)) {
                            strArr[i2] = parse.toString();
                            countDownLatch.countDown();
                        } else {
                            concurrentLinkedQueue.add(k.a(accessToken, parse, new GraphRequest.b() {
                                /* class com.facebook.internal.af.d.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(29282);
                                }

                                @Override // com.facebook.GraphRequest.b
                                public final void a(r rVar) {
                                    try {
                                        FacebookRequestError facebookRequestError = rVar.f49019d;
                                        String str = "Error staging photo.";
                                        if (facebookRequestError != null) {
                                            String a2 = facebookRequestError.a();
                                            if (a2 != null) {
                                                str = a2;
                                            }
                                            throw new com.facebook.k(rVar, str);
                                        }
                                        JSONObject jSONObject = rVar.f49017b;
                                        if (jSONObject != null) {
                                            String optString = jSONObject.optString("uri");
                                            if (optString != null) {
                                                strArr[i2] = optString;
                                                countDownLatch.countDown();
                                                return;
                                            }
                                            throw new j(str);
                                        }
                                        throw new j(str);
                                    } catch (Exception e2) {
                                        d.this.f48552a[i2] = e2;
                                    }
                                }
                            }).a());
                        }
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((AsyncTask) it2.next()).cancel(true);
                        }
                        return null;
                    }
                }
                countDownLatch.await();
                return strArr;
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
                return null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (com.facebook.internal.a.b.a.a(this)) {
                return null;
            }
            try {
                return a();
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, this);
                return null;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(String[] strArr) {
            if (!com.facebook.internal.a.b.a.a(this)) {
                try {
                    String[] strArr2 = strArr;
                    if (!com.facebook.internal.a.b.a.a(this)) {
                        try {
                            af.this.f48533e.dismiss();
                            Exception[] excArr = this.f48552a;
                            for (Exception exc : excArr) {
                                if (exc != null) {
                                    af.this.a(exc);
                                    return;
                                }
                            }
                            if (strArr2 == null) {
                                af.this.a(new j("Failed to stage photos for web dialog"));
                                return;
                            }
                            List asList = Arrays.asList(strArr2);
                            if (asList.contains(null)) {
                                af.this.a(new j("Failed to stage photos for web dialog"));
                                return;
                            }
                            ad.a(this.f48555d, "media", new JSONArray((Collection) asList));
                            af.this.f48529a = ad.a(ab.a(), m.e() + "/dialog/" + this.f48554c, this.f48555d).toString();
                            af.this.a((af.this.f48534f.getDrawable().getIntrinsicWidth() / 2) + 1);
                        } catch (Throwable th) {
                            com.facebook.internal.a.b.a.a(th, this);
                        }
                    }
                } catch (Throwable th2) {
                    com.facebook.internal.a.b.a.a(th2, this);
                }
            }
        }

        d(String str, Bundle bundle) {
            this.f48554c = str;
            this.f48555d = bundle;
        }
    }

    public final void a() {
        int i2;
        int i3;
        Display defaultDisplay = ((WindowManager) a(getContext(), "window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            i2 = displayMetrics.widthPixels;
        } else {
            i2 = displayMetrics.heightPixels;
        }
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            i3 = displayMetrics.heightPixels;
        } else {
            i3 = displayMetrics.widthPixels;
        }
        getWindow().setLayout(Math.min(a(i2, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(a(i3, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    /* access modifiers changed from: package-private */
    public class b extends WebViewClient {
        static {
            Covode.recordClassIndex(29279);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return com.example.a.c.a(webView, renderProcessGoneDetail);
        }

        private b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean a(java.lang.String r8) {
            /*
            // Method dump skipped, instructions count: 207
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.af.b.a(java.lang.String):boolean");
        }

        /* synthetic */ b(af afVar, byte b2) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (i.b(webView, str)) {
                return true;
            }
            return a(str);
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!af.this.f48537i) {
                af.this.f48533e.dismiss();
            }
            af.this.f48535g.setBackgroundColor(0);
            af.this.f48532d.setVisibility(0);
            af.this.f48534f.setVisibility(0);
            af.this.f48538j = true;
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (!af.this.f48537i) {
                af.this.f48533e.show();
            }
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            af.this.a(new com.facebook.i(null, -11, null));
        }

        public final void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            af.this.a(new com.facebook.i(str, i2, str2));
        }
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.n = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    protected static void a(Context context) {
        ApplicationInfo applicationInfo;
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                if (TextUtils.equals(packageName, com.bytedance.ies.ugc.appcontext.d.a().getPackageName())) {
                    if (com.ss.android.ugc.aweme.lancet.c.b.f107191a == null) {
                        com.ss.android.ugc.aweme.lancet.c.b.f107191a = packageManager.getApplicationInfo(packageName, 128);
                    }
                    applicationInfo = com.ss.android.ugc.aweme.lancet.c.b.f107191a;
                } else {
                    applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                }
                if (applicationInfo != null && applicationInfo.metaData != null && f48528m == 0) {
                    int i2 = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                    if (i2 == 0) {
                        i2 = f48527k;
                    }
                    f48528m = i2;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        MethodCollector.i(9071);
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f48533e = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f48533e.setMessage(getContext().getString(R.string.ahz));
        this.f48533e.setCanceledOnTouchOutside(false);
        this.f48533e.setOnCancelListener(new DialogInterface.OnCancelListener() {
            /* class com.facebook.internal.af.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29274);
            }

            public final void onCancel(DialogInterface dialogInterface) {
                af.this.cancel();
            }
        });
        requestWindowFeature(1);
        this.f48535g = new FrameLayout(getContext());
        a();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        ImageView imageView = new ImageView(getContext());
        this.f48534f = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.facebook.internal.af.AnonymousClass2 */

            static {
                Covode.recordClassIndex(29275);
            }

            public final void onClick(View view) {
                if (!com.facebook.internal.a.b.a.a(this)) {
                    try {
                        af.this.cancel();
                    } catch (Throwable th) {
                        com.facebook.internal.a.b.a.a(th, this);
                    }
                }
            }
        });
        this.f48534f.setImageDrawable(getContext().getResources().getDrawable(2131231597));
        this.f48534f.setVisibility(4);
        if (this.f48529a != null) {
            a((this.f48534f.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f48535g.addView(this.f48534f, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f48535g);
        MethodCollector.o(9071);
    }

    /* access modifiers changed from: protected */
    public Bundle a(String str) {
        Uri parse = Uri.parse(str);
        Bundle c2 = ad.c(parse.getQuery());
        c2.putAll(ad.c(parse.getFragment()));
        return c2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected af(Context context, String str) {
        this(context, str, f48528m);
        ae.a();
    }

    private static void a(WebView webView, String str) {
        MethodCollector.i(9078);
        String a2 = h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        webView.loadUrl(str);
        MethodCollector.o(9078);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            WebView webView = this.f48532d;
            if (webView == null || !webView.canGoBack()) {
                cancel();
            } else {
                this.f48532d.goBack();
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9073);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(9073);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static void a(WebView webView, WebViewClient webViewClient) {
        if (com.ss.android.ugc.tiktok.security.c.b.a()) {
            WebSettings settings = webView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                settings.setUserAgentString(sb.toString());
            }
        }
        webView.setWebViewClient(com.example.a.c.a(webViewClient));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private af(android.content.Context r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            if (r4 != 0) goto L_0x0007
            com.facebook.internal.ae.a()
            int r4 = com.facebook.internal.af.f48528m
        L_0x0007:
            r1.<init>(r2, r4)
            java.lang.String r0 = "fbconnect://success"
            r1.f48530b = r0
            r0 = 0
            r1.f48536h = r0
            r1.f48537i = r0
            r1.f48538j = r0
            r1.f48529a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.af.<init>(android.content.Context, java.lang.String, int):void");
    }

    private static int a(int i2, float f2, int i3, int i4) {
        int i5 = (int) (((float) i2) / f2);
        double d2 = 0.5d;
        if (i5 <= i3) {
            d2 = 1.0d;
        } else if (i5 < i4) {
            double d3 = (double) (i4 - i5);
            double d4 = (double) (i4 - i3);
            Double.isNaN(d3);
            Double.isNaN(d4);
            d2 = 0.5d + ((d3 / d4) * 0.5d);
        }
        double d5 = (double) i2;
        Double.isNaN(d5);
        return (int) (d5 * d2);
    }

    public static af a(Context context, String str, Bundle bundle, int i2, c cVar) {
        a(context);
        return new af(context, str, bundle, i2, cVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private af(android.content.Context r5, java.lang.String r6, android.os.Bundle r7, int r8, com.facebook.internal.af.c r9) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.af.<init>(android.content.Context, java.lang.String, android.os.Bundle, int, com.facebook.internal.af$c):void");
    }
}
