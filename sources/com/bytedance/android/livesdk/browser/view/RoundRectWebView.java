package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import com.a;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.security.c.b;
import java.util.Map;

public class RoundRectWebView extends SSWebView {
    private boolean needCleanRadius;
    private Paint paint;
    private Path path;
    private float radius;
    private float radiusBottomLeft;
    private float radiusBottomRight;
    private float radiusTopLeft;
    private float radiusTopRight;
    private RectF rect;

    static {
        Covode.recordClassIndex(8221);
    }

    public boolean RoundRectWebView__canGoBack$___twin___() {
        return super.canGoBack();
    }

    @Override // com.bytedance.android.livesdk.browser.view.SSWebView
    public boolean canGoBack() {
        return com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_canGoBack(this);
    }

    @Override // com.bytedance.android.livesdk.browser.view.SSWebView
    public void goBack() {
        com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_goBack(this);
    }

    @Override // com.bytedance.android.livesdk.browser.view.SSWebView
    public void loadUrl(String str) {
        com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(this, str);
    }

    @Override // com.bytedance.android.livesdk.browser.view.SSWebView, android.webkit.WebView
    public void loadUrl(String str, Map map) {
        com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(this, str, map);
    }

    public void RoundRectWebView__goBack$___twin___() {
        i.f23764a.p(this);
        super.goBack();
    }

    public void destroy() {
        i.f23764a.l(this);
        super.destroy();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        i.f23764a.r(this);
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.android.livesdk.browser.view.SSWebView
    public void reload() {
        i.f23764a.n(this);
        super.reload();
    }

    private void init() {
        i.f23764a.j(this);
        this.path = new Path();
        this.rect = new RectF();
        Paint paint2 = new Paint(1);
        this.paint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.paint.setColor(0);
        this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static boolean com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_canGoBack(RoundRectWebView roundRectWebView) {
        if (!roundRectWebView.RoundRectWebView__canGoBack$___twin___() || !com.ss.android.ugc.tiktok.security.b.i.a(roundRectWebView)) {
            return false;
        }
        return true;
    }

    public static void com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_goBack(RoundRectWebView roundRectWebView) {
        if (!com.ss.android.ugc.tiktok.security.b.i.b(roundRectWebView)) {
            roundRectWebView.RoundRectWebView__goBack$___twin___();
        }
    }

    public void RoundRectWebView__loadUrl$___twin___(String str) {
        i.f23764a.g(this, str);
        super.loadUrl(str);
    }

    public void setRadius(float f2) {
        this.radius = f2;
        this.needCleanRadius = true;
        invalidate();
    }

    public RoundRectWebView(Context context) {
        super(context);
        init();
        if (b.a()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                a.a(settings, sb.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.radius != 0.0f) {
            this.rect.set(0.0f, (float) getScrollY(), (float) getWidth(), (float) (getScrollY() + getHeight()));
            this.path.reset();
            this.path.setFillType(Path.FillType.INVERSE_WINDING);
            Path path2 = this.path;
            RectF rectF = this.rect;
            float f2 = this.radius;
            path2.addRoundRect(rectF, f2, f2, Path.Direction.CW);
            canvas.drawPath(this.path, this.paint);
        } else if (this.radiusTopLeft != 0.0f || this.radiusTopRight != 0.0f || this.radiusBottomRight != 0.0f || this.radiusBottomLeft != 0.0f) {
            this.rect.set(0.0f, (float) getScrollY(), (float) getWidth(), (float) (getScrollY() + getHeight()));
            this.path.reset();
            this.path.setFillType(Path.FillType.INVERSE_WINDING);
            float f3 = this.radiusTopLeft;
            float f4 = this.radiusTopRight;
            float f5 = this.radiusBottomRight;
            float f6 = this.radiusBottomLeft;
            this.path.addRoundRect(this.rect, new float[]{f3, f3, f4, f4, f5, f5, f6, f6}, Path.Direction.CW);
            canvas.drawPath(this.path, this.paint);
        } else if (this.needCleanRadius) {
            this.rect.set(0.0f, (float) getScrollY(), (float) getWidth(), (float) (getScrollY() + getHeight()));
            this.path.reset();
            this.path.setFillType(Path.FillType.INVERSE_WINDING);
            this.path.addRoundRect(this.rect, 0.0f, 0.0f, Path.Direction.CW);
            canvas.drawPath(this.path, this.paint);
        }
    }

    public RoundRectWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public static void com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(RoundRectWebView roundRectWebView, String str) {
        String a2 = com.ss.android.ugc.tiktok.security.b.i.f149045a.a(roundRectWebView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        roundRectWebView.RoundRectWebView__loadUrl$___twin___(str);
    }

    public void RoundRectWebView__loadUrl$___twin___(String str, Map<String, String> map) {
        i.f23764a.g(this, str);
        super.loadUrl(str, map);
    }

    public static void com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl(RoundRectWebView roundRectWebView, String str, Map map) {
        String a2 = com.ss.android.ugc.tiktok.security.b.i.f149045a.a(roundRectWebView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        roundRectWebView.RoundRectWebView__loadUrl$___twin___(str, map);
    }

    public RoundRectWebView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init();
        if (b.a()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                a.a(settings, sb.toString());
            }
        }
    }

    public void setRadius(float f2, float f3, float f4, float f5) {
        this.radius = 0.0f;
        this.radiusTopLeft = f2;
        this.radiusTopRight = f3;
        this.radiusBottomRight = f4;
        this.radiusBottomLeft = f5;
        this.needCleanRadius = true;
        invalidate();
    }
}
