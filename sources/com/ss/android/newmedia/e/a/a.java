package com.ss.android.newmedia.e.a;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import b.i;
import c.b.e;
import com.bytedance.common.c.b;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.uikit.dialog.b;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.newmedia.d;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Objects;

public final class a {

    /* renamed from: a */
    public boolean f59953a = true;

    /* renamed from: b */
    private WeakReference<Context> f59954b;

    /* renamed from: c */
    private boolean f59955c = true;

    /* renamed from: d */
    private boolean f59956d = true;

    /* renamed from: e */
    private boolean f59957e = true;

    /* renamed from: f */
    private boolean f59958f = true;

    /* renamed from: g */
    private boolean f59959g = true;

    /* renamed from: h */
    private boolean f59960h = true;

    /* renamed from: i */
    private boolean f59961i = true;

    static {
        Covode.recordClassIndex(37050);
    }

    public static a a(Context context) {
        return new a(context);
    }

    private a(Context context) {
        this.f59954b = new WeakReference<>(context);
    }

    public final void a(WebView webView) {
        WebSettings settings;
        boolean z;
        String sb;
        if (webView != null && this.f59954b.get() != null && (settings = webView.getSettings()) != null) {
            try {
                settings.setJavaScriptEnabled(this.f59955c);
            } catch (Exception unused) {
            }
            try {
                if (this.f59956d) {
                    settings.setSupportZoom(true);
                    settings.setBuiltInZoomControls(true);
                    com.bytedance.common.c.a.a(settings);
                } else {
                    settings.setSupportZoom(false);
                }
            } catch (Throwable unused2) {
            }
            settings.setTextZoom(100);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(this.f59957e);
            settings.setDomStorageEnabled(this.f59959g);
            if (!SettingsManager.a().a("allow_file_access", true) || !this.f59960h) {
                z = false;
            } else {
                z = true;
            }
            settings.setAllowFileAccess(z);
            settings.setBlockNetworkImage(!this.f59961i);
            if (!this.f59953a) {
                try {
                    webView.setLayerType(1, null);
                } catch (Throwable unused3) {
                }
            }
            b.a(webView.getSettings(), true);
            if (!this.f59958f) {
                webView.setOnLongClickListener(null);
                webView.setLongClickable(false);
            } else {
                webView.setLongClickable(true);
                webView.setOnLongClickListener(new View.OnLongClickListener() {
                    /* class com.ss.android.newmedia.e.a.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(37051);
                    }

                    public final boolean onLongClick(View view) {
                        WebView webView;
                        WebView.HitTestResult hitTestResult;
                        if ((view instanceof WebView) && (hitTestResult = (webView = (WebView) view).getHitTestResult()) != null && webView.getSettings() != null && (hitTestResult.getType() == 5 || hitTestResult.getType() == 8)) {
                            final String extra = hitTestResult.getExtra();
                            final Context context = webView.getContext();
                            if (!(extra == null || context == null || !d.a(extra))) {
                                b.a aVar = new b.a(context);
                                aVar.a(new String[]{context.getString(R.string.heg)}, new DialogInterface.OnClickListener() {
                                    /* class com.ss.android.newmedia.e.a.a.AnonymousClass1.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(37052);
                                    }

                                    public final void a() {
                                        i.b(new b(context, extra), i.f4824a).a(new c(context), i.f4826c, null);
                                    }

                                    static final /* synthetic */ Boolean a(Context context, String str) {
                                        boolean z = false;
                                        if (context != null) {
                                            try {
                                                String guessFileName = URLUtil.guessFileName(str, null, "image/jpeg");
                                                Uri a2 = e.a(context, guessFileName, "image/jpeg");
                                                com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
                                                with.f83078c = guessFileName;
                                                with.f83081f = a2.toString();
                                                if (with.a("ss_web_settings").f() != 0) {
                                                    z = true;
                                                }
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        return Boolean.valueOf(z);
                                    }

                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        if (androidx.core.content.b.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
                                            com.ss.android.ugc.aweme.ce.b.a(o.a(context), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.AbstractC1579b() {
                                                /* class com.ss.android.newmedia.e.a.a.AnonymousClass1.AnonymousClass1.AnonymousClass1 */

                                                static {
                                                    Covode.recordClassIndex(37053);
                                                }

                                                @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
                                                public final void a(String[] strArr, int[] iArr) {
                                                    if (iArr.length <= 0 || iArr[0] != 0) {
                                                        Toast makeText = Toast.makeText(context, (int) R.string.ghw, 1);
                                                        if (Build.VERSION.SDK_INT == 25) {
                                                            ic.a(makeText);
                                                        }
                                                        makeText.show();
                                                        return;
                                                    }
                                                    AnonymousClass1.this.a();
                                                }
                                            });
                                        } else {
                                            a();
                                        }
                                    }
                                });
                                aVar.c();
                                return true;
                            }
                        }
                        return false;
                    }
                });
            }
            Context context = webView.getContext();
            l.b(context, "");
            l.d(context, "");
            l.d(webView, "");
            String a2 = e.a(context, webView);
            if (a2 == null) {
                a2 = "";
            }
            StringBuilder append = new StringBuilder().append(a2).append(" trill_").append(com.bytedance.ies.ugc.appcontext.d.e()).append(" JsSdk/1.0 NetType/");
            Context a3 = com.bytedance.ies.ugc.appcontext.d.a();
            if (TextUtils.isEmpty(j.f107227f) || !j.b() || j.c()) {
                j.f107227f = NetworkUtils.getNetworkAccessType(a3);
            }
            String str = j.f107227f;
            l.b(str, "");
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String upperCase = str.toUpperCase();
            l.b(upperCase, "");
            String sb2 = append.append(upperCase).append(" Channel/").append(com.bytedance.ies.ugc.appcontext.d.s).append(" AppName/").append(com.bytedance.ies.ugc.appcontext.d.b()).append(" app_version/").append(com.bytedance.ies.ugc.appcontext.d.f()).toString();
            Locale c2 = CrossPlatformLegacyServiceImpl.f().c();
            if (Build.VERSION.SDK_INT >= 21) {
                sb = sb2 + " ByteLocale/" + c2.toLanguageTag();
            } else {
                StringBuilder append2 = new StringBuilder().append(sb2).append(" ByteLocale/");
                String locale = c2.toString();
                l.b(locale, "");
                sb = append2.append(p.a(locale, "_", "-")).toString();
            }
            String str2 = (sb + " ByteFullLocale/" + CrossPlatformLegacyServiceImpl.f().d()) + " Region/" + com.ss.android.ugc.aweme.language.d.g();
            if (!m.a(str2)) {
                WebSettings settings2 = webView.getSettings();
                l.b(settings2, "");
                com.a.a(settings2, str2);
            }
            com.bytedance.common.c.d.a(webView.getSettings(), 0);
            com.bytedance.common.c.d.f26747a.a(webView);
        }
    }
}
