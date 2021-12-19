package com.ss.android.ugc.aweme.fe.method.upload;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import b.g;
import b.i;
import c.b.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.fe.method.a;
import com.ss.android.ugc.aweme.fe.method.m;
import com.ss.android.ugc.aweme.fe.method.upload.I18nGetUploadConfigService;
import com.ss.android.ugc.aweme.fe.method.upload.config.I18nUploadAuthConfig;
import com.ss.android.ugc.aweme.fe.method.upload.config.UploadConfig;
import com.ss.android.ugc.aweme.fe.method.upload.h;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.bduploader.BDVideoUploader;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f91348a;

    /* renamed from: b  reason: collision with root package name */
    public a.C2200a f91349b;

    /* renamed from: c  reason: collision with root package name */
    public m f91350c;

    /* renamed from: i  reason: collision with root package name */
    private I18nGetUploadConfigService.UploadConfigService f91351i = new I18nGetUploadConfigService().f91324a;

    static {
        Covode.recordClassIndex(57496);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.fe.method.upload.h
    public final void a(String str) {
        if (str != null) {
            a(new BDVideoUploader());
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService();
            this.f91351i.getUploadAuthConfig().a(new b(this, str), i.f4826c, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.a$a  reason: collision with other inner class name */
    static final class C2203a<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f91352a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f91353b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f91354c;

        static {
            Covode.recordClassIndex(57497);
        }

        C2203a(a aVar, int i2, String str) {
            this.f91352a = aVar;
            this.f91353b = i2;
            this.f91354c = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0100  */
        @Override // b.g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(b.i r12) {
            /*
            // Method dump skipped, instructions count: 415
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.upload.a.C2203a.then(b.i):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f91355a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f91356b;

        static {
            Covode.recordClassIndex(57498);
        }

        b(a aVar, String str) {
            this.f91355a = aVar;
            this.f91356b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(i<I18nUploadAuthConfig> iVar) {
            String str;
            String str2;
            String str3;
            String str4;
            if (iVar != null) {
                if (!iVar.c() && iVar.d().status_code == 0) {
                    UploadConfig uploadConfig = iVar.d().getUploadConfig();
                    if (uploadConfig != null) {
                        long a2 = e.a(this.f91355a.f91348a.get(), Uri.parse(this.f91356b));
                        if (a2 > ((long) uploadConfig.getMaxFileSize())) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(this.f91355a.f91348a.get()).a(R.string.h_q).a();
                            this.f91355a.a(0, "uploadFailed");
                        } else {
                            BDVideoUploader b2 = this.f91355a.b();
                            try {
                                Uri parse = Uri.parse(this.f91356b);
                                l.b(parse, "");
                                b2.setMediaDataReader(new i(this.f91355a.f91348a.get(), parse, a2));
                                UploadConfig.STSAuthConfig authorizationV2 = uploadConfig.getAuthorizationV2();
                                if (authorizationV2 != null) {
                                    str = authorizationV2.getAccessKeyId();
                                } else {
                                    str = null;
                                }
                                b2.setTopAccessKey(str);
                                UploadConfig.STSAuthConfig authorizationV22 = uploadConfig.getAuthorizationV2();
                                if (authorizationV22 != null) {
                                    str2 = authorizationV22.getSecretAccessKey();
                                } else {
                                    str2 = null;
                                }
                                b2.setTopSecretKey(str2);
                                UploadConfig.STSAuthConfig authorizationV23 = uploadConfig.getAuthorizationV2();
                                if (authorizationV23 != null) {
                                    str3 = authorizationV23.getSessionToken();
                                } else {
                                    str3 = null;
                                }
                                b2.setTopSessionToken(str3);
                                UploadConfig.STSAuthConfig authorizationV24 = uploadConfig.getAuthorizationV2();
                                if (authorizationV24 != null) {
                                    str4 = authorizationV24.getSpaceName();
                                } else {
                                    str4 = null;
                                }
                                b2.setSpaceName(str4);
                                b2.setFileRetryCount(uploadConfig.getFileRetryCount());
                                b2.setEnableHttps(uploadConfig.getEnableHttps());
                                b2.setRWTimeout(uploadConfig.getSliceTimeout());
                                b2.setSliceReTryCount(uploadConfig.getSliceRetryCount());
                                b2.setSliceSize(uploadConfig.getSliceSize());
                                b2.setSocketNum(uploadConfig.getSocketNumber());
                                b2.setMaxFailTime(uploadConfig.getMaxFailTime());
                                b2.setUploadDomain(uploadConfig.getVideoHostName());
                                b2.setListener(new h.b());
                                b2.start();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            this.f91355a.f91349b.a(this.f91355a.f91348a.get(), this.f91355a);
                        }
                    }
                    return null;
                } else if (!iVar.c()) {
                    if (iVar.d().status_code != 0) {
                        a aVar = this.f91355a;
                        int i2 = iVar.d().status_code;
                        String str5 = iVar.d().message;
                        l.b(str5, "");
                        aVar.a(i2, str5);
                    }
                    this.f91355a.b().close();
                    return null;
                }
            }
            this.f91355a.a(0, "uploadFailed");
            try {
                this.f91355a.b().close();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            return null;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.method.upload.h
    public final void a(String str, int i2) {
        l.d(str, "");
        this.f91351i.getUploadPlayUrlResponse(str, 3).a(new C2203a(this, i2, str), i.f4824a, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(WeakReference<Activity> weakReference, a.C2200a aVar, m mVar) {
        super(weakReference, aVar, mVar);
        l.d(weakReference, "");
        l.d(aVar, "");
        l.d(mVar, "");
        this.f91348a = weakReference;
        this.f91349b = aVar;
        this.f91350c = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r10 != 900) goto L_0x0019;
     */
    @Override // com.ss.android.ugc.aweme.fe.method.upload.h, com.ss.android.ugc.aweme.fe.method.upload.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r10, int r11, android.content.Intent r12) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.upload.a.a(int, int, android.content.Intent):boolean");
    }
}
