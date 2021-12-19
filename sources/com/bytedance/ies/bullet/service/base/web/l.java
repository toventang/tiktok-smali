package com.bytedance.ies.bullet.service.base.web;

import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import com.bytedance.covode.number.Covode;
import h.a.ag;
import java.util.Map;

public final class l {
    static {
        Covode.recordClassIndex(19402);
    }

    public static final class a implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebResourceRequest f32644a;

        static {
            Covode.recordClassIndex(19403);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.h
        public final boolean b() {
            return this.f32644a.isForMainFrame();
        }

        @Override // com.bytedance.ies.bullet.service.base.web.h
        public final Uri a() {
            Uri url = this.f32644a.getUrl();
            h.f.b.l.a((Object) url, "");
            return url;
        }

        @Override // com.bytedance.ies.bullet.service.base.web.h
        public final Map<String, String> c() {
            Map<String, String> requestHeaders = this.f32644a.getRequestHeaders();
            if (requestHeaders == null) {
                return ag.a();
            }
            return requestHeaders;
        }

        a(WebResourceRequest webResourceRequest) {
            this.f32644a = webResourceRequest;
        }
    }

    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebResourceError f32645a;

        static {
            Covode.recordClassIndex(19404);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.g
        public final int a() {
            return this.f32645a.getErrorCode();
        }

        @Override // com.bytedance.ies.bullet.service.base.web.g
        public final CharSequence b() {
            return this.f32645a.getDescription();
        }

        b(WebResourceError webResourceError) {
            this.f32645a = webResourceError;
        }
    }

    public static final class e implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebChromeClient.FileChooserParams f32648a;

        static {
            Covode.recordClassIndex(19407);
        }

        @Override // com.bytedance.ies.bullet.service.base.web.a
        public final String[] a() {
            return this.f32648a.getAcceptTypes();
        }

        e(WebChromeClient.FileChooserParams fileChooserParams) {
            this.f32648a = fileChooserParams;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RenderProcessGoneDetail f32646a;

        static {
            Covode.recordClassIndex(19405);
        }

        c(RenderProcessGoneDetail renderProcessGoneDetail) {
            this.f32646a = renderProcessGoneDetail;
        }
    }

    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PermissionRequest f32647a;

        static {
            Covode.recordClassIndex(19406);
        }

        d(PermissionRequest permissionRequest) {
            this.f32647a = permissionRequest;
        }
    }

    public static final h a(WebResourceRequest webResourceRequest) {
        h.f.b.l.c(webResourceRequest, "");
        return new a(webResourceRequest);
    }
}
