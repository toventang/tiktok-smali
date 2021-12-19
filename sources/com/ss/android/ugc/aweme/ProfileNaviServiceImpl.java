package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.u;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.model.api.request.ProfileNaviImageListRequest;
import com.ss.android.ugc.aweme.model.api.request.ProfileNaviInfoRequest;
import com.ss.android.ugc.aweme.model.api.request.b;
import com.ss.android.ugc.aweme.model.q;
import com.ss.android.ugc.aweme.model.r;
import com.ss.android.ugc.aweme.profile.ak;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.view.ProfileNaviActivity;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class ProfileNaviServiceImpl implements IProfileNaviService {

    static final class f implements WeakHandler.IHandler {

        /* renamed from: a  reason: collision with root package name */
        public static final f f62425a = new f();

        static {
            Covode.recordClassIndex(38406);
        }

        f() {
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
        }
    }

    static {
        Covode.recordClassIndex(38399);
    }

    public static IProfileNaviService a() {
        MethodCollector.i(3924);
        Object a2 = com.ss.android.ugc.b.a(IProfileNaviService.class, false);
        if (a2 != null) {
            IProfileNaviService iProfileNaviService = (IProfileNaviService) a2;
            MethodCollector.o(3924);
            return iProfileNaviService;
        }
        if (com.ss.android.ugc.b.t == null) {
            synchronized (IProfileNaviService.class) {
                try {
                    if (com.ss.android.ugc.b.t == null) {
                        com.ss.android.ugc.b.t = new ProfileNaviServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3924);
                    throw th;
                }
            }
        }
        ProfileNaviServiceImpl profileNaviServiceImpl = (ProfileNaviServiceImpl) com.ss.android.ugc.b.t;
        MethodCollector.o(3924);
        return profileNaviServiceImpl;
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviServiceImpl f62413a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f62414b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f62415c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f62416d;

        static {
            Covode.recordClassIndex(38403);
        }

        c(ProfileNaviServiceImpl profileNaviServiceImpl, String str, int i2, h.f.a.b bVar) {
            this.f62413a = profileNaviServiceImpl;
            this.f62414b = str;
            this.f62415c = i2;
            this.f62416d = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f62413a.a(this.f62414b, this.f62415c + 1, this.f62416d);
            }
        }
    }

    static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.model.api.a.b, z> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ h.f.a.b $fileCreatedCallback;
        final /* synthetic */ ProfileNaviServiceImpl this$0;

        static {
            Covode.recordClassIndex(38400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ProfileNaviServiceImpl profileNaviServiceImpl, Activity activity, Bitmap bitmap, h.f.a.b bVar) {
            super(1);
            this.this$0 = profileNaviServiceImpl;
            this.$activity = activity;
            this.$bitmap = bitmap;
            this.$fileCreatedCallback = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.model.api.a.b bVar) {
            File a2;
            com.ss.android.ugc.aweme.model.api.a.b bVar2 = bVar;
            if (!(bVar2 == null || (a2 = u.a(this.$activity, this.$bitmap)) == null)) {
                this.$fileCreatedCallback.invoke(a2);
                w.a(a2, new C1364a(this, bVar2), 0);
            }
            return z.f158842a;
        }

        /* renamed from: com.ss.android.ugc.aweme.ProfileNaviServiceImpl$a$a  reason: collision with other inner class name */
        static final class C1364a extends m implements h.f.a.m<AvatarUri, Boolean, z> {
            final /* synthetic */ com.ss.android.ugc.aweme.model.api.a.b $it;
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(38401);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1364a(a aVar, com.ss.android.ugc.aweme.model.api.a.b bVar) {
                super(2);
                this.this$0 = aVar;
                this.$it = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(AvatarUri avatarUri, Boolean bool) {
                UrlModel urlModel;
                String str;
                AvatarUri avatarUri2 = avatarUri;
                if (!bool.booleanValue() && avatarUri2 != null) {
                    UrlModel urlModel2 = new UrlModel();
                    urlModel2.setUrlList(avatarUri2.urlList);
                    urlModel2.setUri(avatarUri2.uri);
                    com.ss.android.ugc.aweme.model.api.a.b bVar = this.$it;
                    List<com.ss.android.ugc.aweme.model.api.a.a> animationList = bVar.getAnimationList();
                    if (animationList == null || animationList.isEmpty()) {
                        urlModel = null;
                    } else {
                        List<com.ss.android.ugc.aweme.model.api.a.a> animationList2 = bVar.getAnimationList();
                        if (animationList2 == null) {
                            l.b();
                        }
                        urlModel = ((com.ss.android.ugc.aweme.model.api.a.a) n.g((List) animationList2)).getUrl();
                    }
                    ak akVar = new ak();
                    akVar.f115963d = urlModel2.getUri();
                    akVar.a(urlModel2.getUri());
                    com.ss.android.ugc.aweme.account.b.g().updateCurAvatar(urlModel2, urlModel2, urlModel2);
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    User curUser = g2.getCurUser();
                    l.b(curUser, "");
                    curUser.setAvatarVideoUri(urlModel2);
                    if (urlModel != null) {
                        akVar.a(urlModel.getUri());
                        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                        l.b(g3, "");
                        User curUser2 = g3.getCurUser();
                        l.b(curUser2, "");
                        curUser2.setAvatarVideoUri(urlModel);
                    }
                    Map<String, String> a2 = akVar.a();
                    l.b(a2, "");
                    a2.put("page_from", "0");
                    q qVar = r.f110811a;
                    if (!(qVar == null || (str = qVar.f110805a) == null)) {
                        a2.put("navi_id", str);
                    }
                    if (urlModel != null) {
                        a2.put("video_icon", urlModel.getUri());
                    }
                    com.ss.android.ugc.aweme.account.b.g().updateUserInfo(new WeakHandler(f.f62425a), a2);
                }
                return z.f158842a;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviServiceImpl f62409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f62410b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f62411c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f62412d;

        static {
            Covode.recordClassIndex(38402);
        }

        b(ProfileNaviServiceImpl profileNaviServiceImpl, h.f.a.b bVar, String str, int i2) {
            this.f62409a = profileNaviServiceImpl;
            this.f62410b = bVar;
            this.f62411c = str;
            this.f62412d = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.model.api.b.d dVar = (com.ss.android.ugc.aweme.model.api.b.d) obj;
            if (dVar == null) {
                return;
            }
            if (dVar.error_code == 0) {
                com.ss.android.ugc.aweme.model.api.a.b bVar = dVar.f110707a;
                if (bVar != null) {
                    this.f62410b.invoke(bVar);
                    return;
                }
                return;
            }
            this.f62409a.a(this.f62411c, this.f62412d + 1, this.f62410b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviServiceImpl f62421a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f62422b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f62423c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f62424d;

        static {
            Covode.recordClassIndex(38405);
        }

        e(ProfileNaviServiceImpl profileNaviServiceImpl, int i2, int i3, h.f.a.m mVar) {
            this.f62421a = profileNaviServiceImpl;
            this.f62422b = i2;
            this.f62423c = i3;
            this.f62424d = mVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                int i2 = this.f62422b;
                if (i2 < 3) {
                    this.f62421a.a(this.f62423c, i2 + 1, this.f62424d);
                } else {
                    this.f62424d.invoke(1, null);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviServiceImpl f62417a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f62418b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f62419c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f62420d;

        static {
            Covode.recordClassIndex(38404);
        }

        d(ProfileNaviServiceImpl profileNaviServiceImpl, h.f.a.m mVar, int i2, int i3) {
            this.f62417a = profileNaviServiceImpl;
            this.f62418b = mVar;
            this.f62419c = i2;
            this.f62420d = i3;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<String> urlList;
            List<String> urlList2;
            com.ss.android.ugc.aweme.model.api.b.c cVar = (com.ss.android.ugc.aweme.model.api.b.c) obj;
            if (cVar == null) {
                return;
            }
            if (cVar.error_code == 0) {
                List<com.ss.android.ugc.aweme.model.api.a.d> list = cVar.f110706b;
                if (list == null || list.isEmpty()) {
                    this.f62418b.invoke(0, null);
                    return;
                }
                LinkedList linkedList = new LinkedList();
                for (com.ss.android.ugc.aweme.model.api.a.d dVar : cVar.f110706b) {
                    l.d(dVar, "");
                    com.ss.android.ugc.aweme.model.api.a.e eVar = new com.ss.android.ugc.aweme.model.api.a.e();
                    eVar.f110699a = dVar.getNaviId();
                    eVar.f110702d = dVar.getBackgroundColorHex();
                    eVar.f110700b = (dVar.getStaticImageUrlModel() == null || (urlList2 = dVar.getStaticImageUrlModel().getUrlList()) == null || urlList2.isEmpty()) ? null : dVar.getStaticImageUrlModel().getUrlList().get(0);
                    eVar.f110701c = (dVar.getDynamicImageUrlModel() == null || (urlList = dVar.getDynamicImageUrlModel().getUrlList()) == null || urlList.isEmpty()) ? null : dVar.getDynamicImageUrlModel().getUrlList().get(0);
                    linkedList.add(eVar);
                }
                this.f62418b.invoke(0, linkedList);
                return;
            }
            int i2 = this.f62419c;
            if (i2 < 3) {
                this.f62417a.a(this.f62420d, i2 + 1, this.f62418b);
            } else {
                this.f62418b.invoke(Integer.valueOf(cVar.error_code), null);
            }
        }
    }

    private static Intent b(Activity activity, String str) {
        Intent intent = new Intent(activity, ProfileNaviActivity.class);
        intent.putExtra("enter_from", str);
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final bu a(Activity activity, String str) {
        l.d(activity, "");
        l.d(str, "");
        return new com.ss.android.ugc.aweme.view.d.a(activity, str, (byte) 0);
    }

    private static void a(Activity activity, Intent intent, Bundle bundle) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent, bundle);
    }

    private static void a(Activity activity, View view, Intent intent) {
        androidx.core.app.b a2 = androidx.core.app.b.a(activity, view, "transition");
        l.b(a2, "");
        a(activity, intent, a2.a());
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final void b(Activity activity, View view, String str) {
        l.d(activity, "");
        l.d(view, "");
        l.d(str, "");
        Intent b2 = b(activity, str);
        b2.putExtra("entry_point", 1);
        a(activity, view, b2);
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final void a(int i2, int i3, h.f.a.m<? super Integer, ? super List<? extends bt>, z> mVar) {
        l.d(mVar, "");
        if (i3 > 0) {
            com.ss.android.ugc.aweme.model.b.b();
            return;
        }
        b.a aVar = new b.a();
        aVar.f110745b = i2;
        com.ss.android.ugc.aweme.model.api.request.b bVar = new com.ss.android.ugc.aweme.model.api.request.b();
        bVar.f110741a = aVar.f110745b;
        bVar.f110742b = aVar.f110744a;
        l.d(bVar, "");
        l.b(ProfileNaviImageListRequest.f110722a.getNaviImageList(bVar.f110741a, bVar.f110742b).b(f.a.h.a.d(f.a.k.a.f158004a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this, mVar, i3, i2), new e(this, i3, i2, mVar)), "");
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final void a(Activity activity, View view, String str) {
        l.d(activity, "");
        l.d(view, "");
        l.d(str, "");
        a(activity, view, b(activity, str));
    }

    public final void a(String str, int i2, h.f.a.b<? super com.ss.android.ugc.aweme.model.api.a.b, z> bVar) {
        if (i2 >= 3) {
            bVar.invoke(null);
        } else {
            ProfileNaviInfoRequest.a.a(str).b(f.a.h.a.d(f.a.k.a.f158004a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this, bVar, str, i2), new c(this, str, i2, bVar));
        }
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final void a(Activity activity, View view, String str, String str2) {
        l.d(activity, "");
        l.d(view, "");
        l.d(str, "");
        l.d(str2, "");
        Intent b2 = b(activity, str2);
        b2.putExtra("edit_navi_id_key", str);
        a(activity, view, b2);
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final void a(Activity activity, String str, Bitmap bitmap, h.f.a.b<? super File, z> bVar) {
        l.d(activity, "");
        l.d(str, "");
        l.d(bitmap, "");
        l.d(bVar, "");
        a(str, 0, new a(this, activity, bitmap, bVar));
    }
}
