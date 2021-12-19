package com.kakao.auth.authorization.authcode;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.example.a.c;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.exception.KakaoWebviewException;
import com.kakao.network.ServerProtocol;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.helper.SystemInfo;
import com.kakao.util.helper.log.Logger;
import com.ss.android.ugc.tiktok.security.b.h;
import com.ss.android.ugc.tiktok.security.b.i;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class KakaoWebViewActivity extends Activity {
    public final Map<String, String> headers = new HashMap();
    public ValueCallback<Uri> imageCallback;
    public ValueCallback<Uri[]> lollipopImageCallback;
    private ProgressBar progressBar;
    private ResultReceiver resultReceiver;
    public boolean shouldProceedWithSslError;
    private String url;
    private boolean useWebViewTimers;
    public WebView webView;

    static {
        Covode.recordClassIndex(34293);
    }

    public void KakaoWebViewActivity__onStop$___twin___() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        a.d(this);
        com_kakao_auth_authorization_authcode_KakaoWebViewActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    public void finish() {
        overridePendingTransition(0, 0);
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        a.c(this);
        if (this.useWebViewTimers) {
            this.webView.pauseTimers();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        a.b(this);
        super.onResume();
        if (this.useWebViewTimers) {
            this.webView.resumeTimers();
        }
    }

    private void sendCancelToListener() {
        sendErrorToListener(new KakaoException(KakaoException.ErrorType.CANCELED_OPERATION, getString(R.string.w_)));
    }

    public void onBackPressed() {
        if (!ServerProtocol.authAuthority().equals(Uri.parse(this.webView.getUrl()).getHost()) || !this.webView.canGoBack()) {
            sendCancelToListener();
            super.onBackPressed();
            return;
        }
        this.webView.goBack();
    }

    /* access modifiers changed from: package-private */
    public void openImageChooserActivity() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        startActivityForResult(Intent.createChooser(intent, getString(R.string.cjt)), 9999);
    }

    private void initUi() {
        this.webView = (WebView) findViewById(R.id.fm8);
        this.progressBar = (ProgressBar) findViewById(R.id.dc1);
        this.webView.setBackgroundResource(17170443);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        com_kakao_auth_authorization_authcode_KakaoWebViewActivity_com_ss_android_ugc_tiktok_security_lancet_web_WebViewCSRFLancet_setWebViewClient(this.webView, new KakaoWebViewClient());
        this.webView.setWebChromeClient(new KakaoWebChromeClient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setSaveFormData(KakaoSDK.getAdapter().getSessionConfig().isSaveFormData());
        this.webView.getSettings().setSavePassword(false);
        setProgressBarVisibility(0);
        com_kakao_auth_authorization_authcode_KakaoWebViewActivity_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl(this.webView, this.url, this.headers);
    }

    /* access modifiers changed from: package-private */
    public class KakaoWebChromeClient extends WebChromeClient {
        static {
            Covode.recordClassIndex(34295);
        }

        private KakaoWebChromeClient() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.d("KakaoAccountWebView: " + consoleMessage.message() + " -- (" + consoleMessage.lineNumber() + "/" + consoleMessage.sourceId() + ")");
            return true;
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
            KakaoWebViewActivity.this.imageCallback = valueCallback;
            KakaoWebViewActivity.this.openImageChooserActivity();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            KakaoWebViewActivity.this.lollipopImageCallback = valueCallback;
            KakaoWebViewActivity.this.openImageChooserActivity();
            return true;
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            KakaoWebViewActivity.this.imageCallback = valueCallback;
            KakaoWebViewActivity.this.openImageChooserActivity();
        }

        public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            new AlertDialog.Builder(KakaoWebViewActivity.this).setMessage(str2).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                /* class com.kakao.auth.authorization.authcode.KakaoWebViewActivity.KakaoWebChromeClient.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34296);
                }

                public void onClick(DialogInterface dialogInterface, int i2) {
                    jsResult.confirm();
                }
            }).setCancelable(false).create().show();
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0085  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00d4  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00e0  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x010f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onJsConfirm(android.webkit.WebView r10, java.lang.String r11, java.lang.String r12, final android.webkit.JsResult r13) {
            /*
            // Method dump skipped, instructions count: 273
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kakao.auth.authorization.authcode.KakaoWebViewActivity.KakaoWebChromeClient.onJsConfirm(android.webkit.WebView, java.lang.String, java.lang.String, android.webkit.JsResult):boolean");
        }
    }

    /* access modifiers changed from: package-private */
    public class KakaoWebViewClient extends WebViewClient {
        static {
            Covode.recordClassIndex(34299);
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return c.a(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return com_kakao_auth_authorization_authcode_KakaoWebViewActivity$KakaoWebViewClient_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_shouldOverrideUrlLoading(this, webView, str);
        }

        private KakaoWebViewClient() {
        }

        private boolean handleShouldOverrideUrlLoading(String str) {
            if (str.startsWith("kakao") && (str.contains("://oauth") || str.contains("://ageauth"))) {
                KakaoWebViewActivity.this.sendSuccessToListener(str);
                KakaoWebViewActivity.this.finish();
                return true;
            } else if (str.contains(ServerProtocol.authAuthority()) || str.contains(ServerProtocol.apiAuthority()) || str.contains(ServerProtocol.accountAuthority()) || str.contains(ServerProtocol.accountsAuthority())) {
                com_kakao_auth_authorization_authcode_KakaoWebViewActivity$KakaoWebViewClient_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl(KakaoWebViewActivity.this.webView, str, KakaoWebViewActivity.this.headers);
                return true;
            } else if (KakaoWebViewActivity.this.isCameraAccessibleScheme(str)) {
                KakaoWebViewActivity.this.processCameraAccessibleScript(KakaoWebViewActivity.this.createCameraAccessibleScript(Uri.parse(str)));
                return true;
            } else {
                try {
                    com_kakao_auth_authorization_authcode_KakaoWebViewActivity$KakaoWebViewClient_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(KakaoWebViewActivity.this, new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                } catch (ActivityNotFoundException e2) {
                    if (e2.getLocalizedMessage() == null) {
                        return true;
                    }
                    Logger.d(e2.getLocalizedMessage());
                    return true;
                }
            }
        }

        public static void com_kakao_auth_authorization_authcode_KakaoWebViewActivity$KakaoWebViewClient_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(KakaoWebViewActivity kakaoWebViewActivity, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, kakaoWebViewActivity);
            kakaoWebViewActivity.startActivity(intent);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            KakaoWebViewActivity.this.setProgressBarVisibility(8);
        }

        public boolean KakaoWebViewActivity$KakaoWebViewClient__shouldOverrideUrlLoading$___twin___(WebView webView, String str) {
            Logger.d("(Deprecated) Redirect URL: ".concat(String.valueOf(str)));
            return handleShouldOverrideUrlLoading(str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Logger.d("Redirect URL:" + webResourceRequest.getUrl());
            return handleShouldOverrideUrlLoading(webResourceRequest.getUrl().toString());
        }

        public static boolean com_kakao_auth_authorization_authcode_KakaoWebViewActivity$KakaoWebViewClient_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_shouldOverrideUrlLoading(KakaoWebViewClient kakaoWebViewClient, WebView webView, String str) {
            if (i.b(webView, str)) {
                return true;
            }
            return kakaoWebViewClient.KakaoWebViewActivity$KakaoWebViewClient__shouldOverrideUrlLoading$___twin___(webView, str);
        }

        public static void com_kakao_auth_authorization_authcode_KakaoWebViewActivity$KakaoWebViewClient_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl(WebView webView, String str, Map map) {
            MethodCollector.i(8092);
            String a2 = h.f149026a.a(webView, str);
            if (!TextUtils.isEmpty(a2)) {
                str = a2;
            }
            webView.loadUrl(str, map);
            MethodCollector.o(8092);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d("Webview loading URL: ".concat(String.valueOf(str)));
            super.onPageStarted(webView, str, bitmap);
            KakaoWebViewActivity.this.setProgressBarVisibility(0);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            String str = null;
            if (!(webResourceError == null || webResourceError.getDescription() == null)) {
                str = webResourceError.getDescription().toString();
            }
            Logger.w("onReceivedError: %s, %s", str, webResourceRequest.getUrl().toString());
        }

        public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
            KakaoWebViewActivity.this.setProgressBarVisibility(8);
            AlertDialog.Builder builder = new AlertDialog.Builder(KakaoWebViewActivity.this);
            builder.setTitle(KakaoWebViewActivity.this.getString(R.string.gi3));
            builder.setMessage(KakaoWebViewActivity.this.getString(R.string.d42));
            builder.setNegativeButton(KakaoWebViewActivity.this.getString(R.string.a7w), new DialogInterface.OnClickListener() {
                /* class com.kakao.auth.authorization.authcode.KakaoWebViewActivity.KakaoWebViewClient.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34300);
                }

                public void onClick(DialogInterface dialogInterface, int i2) {
                }
            });
            AlertDialog create = builder.create();
            create.setOnDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.kakao.auth.authorization.authcode.KakaoWebViewActivity.KakaoWebViewClient.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(34301);
                }

                public void onDismiss(DialogInterface dialogInterface) {
                    if (!KakaoWebViewActivity.this.shouldProceedWithSslError) {
                        sslErrorHandler.cancel();
                        KakaoWebViewActivity.this.sendErrorToListener(new KakaoWebviewException(-11, sslError.toString(), null));
                        KakaoWebViewActivity.this.finish();
                    }
                }
            });
            if (!KakaoWebViewActivity.this.isFinishing()) {
                create.show();
            }
        }

        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            if (Build.VERSION.SDK_INT < 23) {
                super.onReceivedError(webView, i2, str, str2);
                Logger.w("(deprecated) onReceivedError: %s, %s", str, str2);
            }
        }
    }

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, KakaoWebViewActivity.class);
        intent.addFlags(805371904);
        return intent;
    }

    public void setProgressBarVisibility(int i2) {
        if (!isFinishing()) {
            this.progressBar.setVisibility(i2);
        }
    }

    private void applyFullscreenOptions(Bundle bundle) {
        getWindow().getDecorView().setSystemUiVisibility(bundle.getInt("key.system.ui.visibility"));
        getWindow().addFlags(bundle.getInt("key.window.flags"));
    }

    public static void com_kakao_auth_authorization_authcode_KakaoWebViewActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(KakaoWebViewActivity kakaoWebViewActivity) {
        kakaoWebViewActivity.KakaoWebViewActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                kakaoWebViewActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_kakao_auth_authorization_authcode_KakaoWebViewActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(KakaoWebViewActivity kakaoWebViewActivity) {
        com_kakao_auth_authorization_authcode_KakaoWebViewActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(kakaoWebViewActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                kakaoWebViewActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        parseIntent(intent);
        setProgressBarVisibility(0);
        com_kakao_auth_authorization_authcode_KakaoWebViewActivity_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl(this.webView, this.url, this.headers);
    }

    /* access modifiers changed from: package-private */
    public void processCameraAccessibleScript(String str) {
        if (str == null) {
            Logger.w("Callback function was not provide. Ignoring custom scheme (%s)", this.url);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        this.webView.evaluateJavascript(str, new ValueCallback<String>() {
            /* class com.kakao.auth.authorization.authcode.KakaoWebViewActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34294);
            }

            public void onReceiveValue(String str) {
                Logger.d("received value from javascript: %s", str);
            }
        });
    }

    public void sendSuccessToListener(String str) {
        if (this.resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putString("key.redirect.url", str);
            this.resultReceiver.send(0, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public String createCameraAccessibleScript(Uri uri) {
        int i2;
        String queryParameter = uri.getQueryParameter("callback");
        if (queryParameter == null) {
            return null;
        }
        if (b.a(this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        return com.a.a(Locale.US, "%s(%d)", new Object[]{queryParameter, Integer.valueOf(i2)});
    }

    /* access modifiers changed from: package-private */
    public boolean isCameraAccessibleScheme(String str) {
        if (str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"kakao".equals(parse.getScheme()) || !"cameraAccessible".equals(parse.getHost())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        try {
            requestWindowFeature(1);
            super.onCreate(bundle);
            parseIntent(getIntent());
            setContentView(R.layout.bh);
            initUi();
        } catch (Exception e2) {
            sendErrorToListener(e2);
            finish();
        }
    }

    public void sendErrorToListener(Throwable th) {
        if (this.resultReceiver != null) {
            Bundle bundle = new Bundle();
            if (!(th instanceof KakaoException)) {
                th = new KakaoException(th.getMessage(), th);
            }
            bundle.putSerializable("key.exception", th);
            this.resultReceiver.send(1, bundle);
        }
    }

    private void parseIntent(Intent intent) {
        this.url = com_kakao_auth_authorization_authcode_KakaoWebViewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "key.url");
        this.useWebViewTimers = intent.getBooleanExtra("key.use.webview.timers", false);
        this.resultReceiver = (ResultReceiver) intent.getParcelableExtra("key.result.receiver");
        Bundle bundle = (Bundle) intent.getParcelableExtra("key.extra.headers");
        this.headers.put("KA", SystemInfo.getKAHeader());
        if (bundle != null && !bundle.isEmpty()) {
            for (String str : bundle.keySet()) {
                this.headers.put(str, bundle.getString(str));
            }
        }
        Bundle bundle2 = (Bundle) intent.getParcelableExtra("key.fullscreen.options");
        if (bundle2 != null) {
            applyFullscreenOptions(bundle2);
        }
    }

    public static String com_kakao_auth_authorization_authcode_KakaoWebViewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void com_kakao_auth_authorization_authcode_KakaoWebViewActivity_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl(WebView webView2, String str) {
        MethodCollector.i(13265);
        String a2 = h.f149026a.a(webView2, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        webView2.loadUrl(str);
        MethodCollector.o(13265);
    }

    public static void com_kakao_auth_authorization_authcode_KakaoWebViewActivity_com_ss_android_ugc_tiktok_security_lancet_web_WebViewCSRFLancet_setWebViewClient(WebView webView2, WebViewClient webViewClient) {
        if (com.ss.android.ugc.tiktok.security.c.b.a() && webViewClient != null) {
            WebSettings settings = webView2.getSettings();
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
        webView2.setWebViewClient(c.a(webViewClient));
    }

    public static void com_kakao_auth_authorization_authcode_KakaoWebViewActivity_com_ss_android_ugc_tiktok_security_lancet_web_WebViewLancet_loadUrl(WebView webView2, String str, Map map) {
        MethodCollector.i(12908);
        String a2 = h.f149026a.a(webView2, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        webView2.loadUrl(str, map);
        MethodCollector.o(12908);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        Uri uri;
        super.onActivityResult(i2, i3, intent);
        if (Build.VERSION.SDK_INT >= 21) {
            onActivityResultForLollipop(i2, i3, intent);
        } else if (i2 == 9999 && this.imageCallback != null) {
            if (i3 != -1 || intent == null) {
                uri = null;
            } else {
                uri = intent.getData();
            }
            this.imageCallback.onReceiveValue(uri);
            this.imageCallback = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void onActivityResultForLollipop(int i2, int i3, Intent intent) {
        Uri[] uriArr;
        if (i2 == 9999 && this.lollipopImageCallback != null) {
            if (i3 == -1) {
                String dataString = intent.getDataString();
                ClipData clipData = intent.getClipData();
                if (clipData != null) {
                    uriArr = new Uri[clipData.getItemCount()];
                    for (int i4 = 0; i4 < clipData.getItemCount(); i4++) {
                        uriArr[i4] = clipData.getItemAt(i4).getUri();
                    }
                } else {
                    uriArr = null;
                }
                if (dataString != null) {
                    uriArr = new Uri[]{Uri.parse(dataString)};
                }
            } else {
                uriArr = null;
            }
            this.lollipopImageCallback.onReceiveValue(uriArr);
            this.lollipopImageCallback = null;
        }
    }
}
