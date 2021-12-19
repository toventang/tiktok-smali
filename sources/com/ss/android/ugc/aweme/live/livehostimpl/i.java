package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import com.bytedance.android.livesdk.model.ab;
import com.bytedance.android.livesdkapi.g.d;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.m;
import com.bytedance.android.livesdkapi.host.n;
import com.bytedance.android.livesdkapi.view.a;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.drawee.view.c;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.BanAppealServiceImpl;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.live.ILiveHostOuterService;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import com.ss.android.ugc.aweme.live.g;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.f;
import com.ss.android.ugc.aweme.sticker.IStickerViewService;
import com.ss.android.ugc.aweme.tools.live.sticker.StickerViewServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import f.a.b.b;
import f.a.t;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class i implements IHostApp {

    /* renamed from: a  reason: collision with root package name */
    private int f108473a = -1;

    static {
        Covode.recordClassIndex(69512);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final d avatarBorderController() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void checkAndShowGuide(e eVar, String str, String str2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void checkBindHelpShow(e eVar, String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void enterRecorderActivity(Activity activity) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final String getBgBroadcastServiceName() {
        return "com.ss.android.ugc.aweme.live.livehostimpl.BgBroadcastService";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final Uri getUriForFile(Context context, File file) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void initImageLib() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final com.bytedance.android.livesdkapi.g.e liveCircleView(Context context) {
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final Dialog showDialog(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, a aVar, CharSequence charSequence4, a aVar2, com.bytedance.android.livesdkapi.host.b.a aVar3) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void startBindMobileFullFragment(Activity activity, String str, String str2, m mVar) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void startBindPhoneDialogFragment(Activity activity, String str, String str2, m mVar) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final boolean startVideoRecordActivity(Activity activity, String str) {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void transCloudControlCommand(JSONObject jSONObject) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final int getCurrentPage() {
        return this.f108473a;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final Activity getTopActivity() {
        return ActivityStack.getTopActivity();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final boolean getPushLiveState() {
        IProfileService g2 = ProfileServiceImpl.g();
        if (g2 != null) {
            return g2.c();
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void hideStickerView() {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null) {
            createIStickerViewServicebyMonsterPlugin.hideStickerView();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final boolean isAppForeground() {
        return ActivityLifeObserver.getInstance().isForeground();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final boolean isInMusicallyRegion() {
        if (!com.ss.android.ugc.aweme.language.d.c()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final boolean isShowStickerView() {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null) {
            return createIStickerViewServicebyMonsterPlugin.isShowStickerView();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final List<Class> getLiveActivityClass() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((g) com.bytedance.l.a.b(g.class)).b().a());
        return arrayList;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void setCurrentPage(int i2) {
        this.f108473a = i2;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void tryDownloadGiftImage(String str) {
        com.ss.android.ugc.aweme.base.e.b(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void tryDownloadImage(String str) {
        com.ss.android.ugc.aweme.base.e.b(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final Class getHostActivity(int i2) {
        return ((g) com.bytedance.l.a.a(g.class)).a(i2);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final boolean isNotificationEnabled(Context context) {
        IProfileService g2 = ProfileServiceImpl.g();
        if (g2 != null) {
            return g2.b(context);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void openWallet(Activity activity) {
        ILiveHostOuterService q = LiveHostOuterService.q();
        if (q != null) {
            q.b(activity, "page_charge");
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final b registerAppEnterForeBackgroundCallback(com.bytedance.android.livesdkapi.depend.a aVar) {
        return f.h().d(new q(aVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        if (r4 != 3) goto L_0x000b;
     */
    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface getHostTypeface(int r4) {
        /*
            r3 = this;
            r2 = 3
            r1 = 2
            r0 = 1
            if (r4 == 0) goto L_0x000b
            if (r4 == r0) goto L_0x0017
            if (r4 == r1) goto L_0x0015
            if (r4 == r2) goto L_0x000c
        L_0x000b:
            r2 = 1
        L_0x000c:
            com.bytedance.ies.dmt.ui.widget.util.a r0 = com.bytedance.ies.dmt.ui.widget.util.a.a()
            android.graphics.Typeface r0 = r0.a(r2)
            return r0
        L_0x0015:
            r2 = 4
            goto L_0x000c
        L_0x0017:
            r2 = 2
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.i.getHostTypeface(int):android.graphics.Typeface");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void registerLifeCycleCallback(com.bytedance.android.livesdkapi.depend.b bVar) {
        bVar.a(f.f34637l);
        f.a().d(new j(bVar));
        t<Activity> b2 = f.b();
        bVar.getClass();
        b2.d(new k(bVar));
        t<Activity> c2 = f.c();
        bVar.getClass();
        c2.d(new l(bVar));
        t<Activity> d2 = f.d();
        bVar.getClass();
        d2.d(new m(bVar));
        t<Activity> e2 = f.e();
        bVar.getClass();
        e2.d(new n(bVar));
        t<Activity> f2 = f.f();
        bVar.getClass();
        f2.d(new o(bVar));
        f.h().d(new p(bVar));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void jumpToAgsStatusPage(Context context, String str) {
        IBanAppealService f2 = BanAppealServiceImpl.f();
        if (f2 != null) {
            f2.a(context, str);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void bindGifImage(View view, String str, Bitmap.Config config) {
        if (view instanceof SimpleDraweeView) {
            c cVar = (c) view;
            REQUEST request = null;
            if (str != null && !str.isEmpty()) {
                com.facebook.imagepipeline.common.b a2 = new ImageDecodeOptionsBuilder().setBitmapConfig(config).a(1).a();
                com.facebook.imagepipeline.o.c a3 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
                a3.f48448e = com.facebook.imagepipeline.common.e.f47753d;
                a3.f48449f = a2;
                request = (REQUEST) a3.a();
            }
            com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
            b2.f47322j = true;
            b2.f47315c = request;
            cVar.setController(b2.e());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r1 == null) goto L_0x0038;
     */
    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<java.lang.String, android.graphics.drawable.Drawable> getBreathShareAnimShareRes(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r2 = 0
            if (r4 != 0) goto L_0x0004
            return r2
        L_0x0004:
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.ss.android.ugc.aweme.share.ShareExtServiceImpl.e()
            android.app.Activity r4 = (android.app.Activity) r4
            android.graphics.drawable.Drawable r1 = r0.a(r4, r5)
            if (r1 != 0) goto L_0x0041
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.ss.android.ugc.aweme.share.ShareExtServiceImpl.e()
            android.graphics.drawable.Drawable r1 = r0.a(r4)
            java.lang.String r5 = com.ss.android.ugc.aweme.feed.ai.c()
            com.ss.android.ugc.aweme.sharer.b r0 = com.ss.android.ugc.aweme.share.improve.a.C3201a.a(r5, r4)
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "other"
            boolean r0 = com.bytedance.common.utility.m.a(r5, r0)
            if (r0 != 0) goto L_0x003e
        L_0x002e:
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.ss.android.ugc.aweme.share.ShareExtServiceImpl.e()
            android.graphics.drawable.Drawable r1 = r0.a(r4, r6)
            if (r1 != 0) goto L_0x0042
        L_0x0038:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        L_0x003e:
            if (r1 != 0) goto L_0x0041
            goto L_0x002e
        L_0x0041:
            r6 = r5
        L_0x0042:
            r2 = r6
            goto L_0x0038
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.i.getBreathShareAnimShareRes(android.content.Context, java.lang.String, java.lang.String):android.util.Pair");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void showStickerView(androidx.appcompat.app.d dVar, androidx.fragment.app.i iVar, final String str, FrameLayout frameLayout, final n nVar) {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null) {
            createIStickerViewServicebyMonsterPlugin.setPixelLoopStickerPresenterSupplier(new q<com.ss.android.ugc.aweme.sticker.n.a>() {
                /* class com.ss.android.ugc.aweme.live.livehostimpl.i.AnonymousClass1 */

                /* renamed from: c  reason: collision with root package name */
                private com.ss.android.ugc.aweme.sticker.n.a f108476c;

                static {
                    Covode.recordClassIndex(69513);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.google.c.a.q
                public final /* synthetic */ com.ss.android.ugc.aweme.sticker.n.a b() {
                    if (this.f108476c == null) {
                        this.f108476c = new com.ss.android.ugc.aweme.sticker.n.a() {
                            /* class com.ss.android.ugc.aweme.live.livehostimpl.i.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(69514);
                            }

                            @Override // com.ss.android.ugc.aweme.sticker.n.a
                            public final int a(String str, String str2) {
                                return nVar.a(str, str2);
                            }
                        };
                    }
                    return this.f108476c;
                }
            });
            createIStickerViewServicebyMonsterPlugin.showStickerView(dVar, iVar, str, frameLayout, new IStickerViewService.a() {
                /* class com.ss.android.ugc.aweme.live.livehostimpl.i.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(69515);
                }

                @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService.a
                public final void a() {
                    nVar.a(str);
                }

                @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService.a
                public final void b() {
                    nVar.b(str);
                }

                @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService.a
                public final void a(IStickerService.FaceSticker faceSticker) {
                    nVar.a(ak.a(faceSticker));
                }

                @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService.a
                public final void b(IStickerService.FaceSticker faceSticker) {
                    nVar.b(ak.a(faceSticker));
                }

                @Override // com.ss.android.ugc.aweme.sticker.IStickerViewService.a
                public final void a(String str) {
                    nVar.c(str);
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void showNotificationTipDialog(String str, String str2, String str3, int i2, View view, final String str4, final IHostApp.a aVar, boolean z, final ab abVar) {
        IProfileService g2 = ProfileServiceImpl.g();
        if (g2 != null) {
            g2.a(str, str2, str3, i2, z, view, new com.ss.android.ugc.aweme.profile.f() {
                /* class com.ss.android.ugc.aweme.live.livehostimpl.i.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(69516);
                }

                @Override // com.ss.android.ugc.aweme.profile.f
                public final String c() {
                    return str4;
                }

                @Override // com.ss.android.ugc.aweme.profile.f
                public final void b() {
                    abVar.a();
                }

                @Override // com.ss.android.ugc.aweme.profile.f
                public final f.a a() {
                    return new f.a(aVar.f23241a, aVar.f23242b, aVar.f23243c, aVar.f23244d, aVar.f23245e);
                }

                @Override // com.ss.android.ugc.aweme.profile.f
                public final void a(int i2) {
                    abVar.a(i2);
                }
            });
        }
    }
}
