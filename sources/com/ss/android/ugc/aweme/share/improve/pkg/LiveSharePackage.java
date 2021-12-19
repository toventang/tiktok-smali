package com.ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.c.c;
import com.ss.android.ugc.aweme.share.ui.a;
import com.ss.android.ugc.aweme.share.ui.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.d;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.sharer.ui.f;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.cr;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class LiveSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123967a = new a((byte) 0);

    static {
        Covode.recordClassIndex(81393);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81394);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static final class c implements d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f123973a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.livesdkapi.depend.e.c f123974b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f123975c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ SharePackage f123976d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.livesdkapi.depend.e.b f123977e;

            static {
                Covode.recordClassIndex(81397);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.d
            public final boolean b(SharePackage sharePackage) {
                l.d(sharePackage, "");
                l.d(sharePackage, "");
                return true;
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.d
            public final void a(SharePackage sharePackage) {
                l.d(sharePackage, "");
                this.f123977e.a("chat_merge", "link", sharePackage.f124595i);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.d
            public final void a(String str, SharePackage sharePackage) {
                l.d(str, "");
                l.d(sharePackage, "");
                l.d(str, "");
                l.d(sharePackage, "");
            }

            c(Activity activity, com.bytedance.android.livesdkapi.depend.e.c cVar, List list, SharePackage sharePackage, com.bytedance.android.livesdkapi.depend.e.b bVar) {
                this.f123973a = activity;
                this.f123974b = cVar;
                this.f123975c = list;
                this.f123976d = sharePackage;
                this.f123977e = bVar;
            }
        }

        private static UrlModel a(ImageModel imageModel) {
            if (imageModel == null) {
                return null;
            }
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(imageModel.getUri());
            urlModel.setUrlList(imageModel.getUrls());
            urlModel.setUrlKey(imageModel.getUri());
            urlModel.setWidth(imageModel.width);
            urlModel.setHeight(imageModel.height);
            return urlModel;
        }

        private static IMUser a(User user) {
            IMUser iMUser = new IMUser();
            iMUser.setUid(String.valueOf(user.getId()));
            iMUser.setSecUid(user.getSecUid());
            iMUser.setNickName(user.getNickName());
            iMUser.setAvatarThumb(a(user.getAvatarThumb()));
            boolean z = true;
            if (user.getSecret() != 1) {
                z = false;
            }
            iMUser.setSecret(z);
            return iMUser;
        }

        public static final class b implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f123968a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.livesdkapi.depend.e.c f123969b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f123970c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ SharePackage f123971d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.livesdkapi.depend.e.b f123972e;

            static {
                Covode.recordClassIndex(81396);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void a(SharePackage sharePackage, Context context) {
                l.d(sharePackage, "");
                l.d(context, "");
                f.a.b(sharePackage, context);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void b(SharePackage sharePackage, Context context) {
                l.d(sharePackage, "");
                l.d(context, "");
                f.a.a(sharePackage, context);
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.f
            public final void a(h hVar, SharePackage sharePackage, Context context) {
                l.d(hVar, "");
                l.d(sharePackage, "");
                l.d(context, "");
                if (hVar instanceof com.ss.android.ugc.aweme.share.improve.a.d) {
                    this.f123972e.a(hVar.c(), "link", sharePackage.f124595i);
                }
            }

            @Override // com.ss.android.ugc.aweme.sharer.ui.b
            public final void a(com.ss.android.ugc.aweme.sharer.b bVar, boolean z, SharePackage sharePackage, Context context) {
                Bundle bundle;
                l.d(bVar, "");
                l.d(context, "");
                if (z) {
                    com.bytedance.android.livesdkapi.depend.e.b bVar2 = this.f123972e;
                    String a2 = bVar.a();
                    if (sharePackage != null) {
                        bundle = sharePackage.f124595i;
                    } else {
                        bundle = null;
                    }
                    bVar2.a(a2, "qr_code", bundle);
                    return;
                }
                this.f123972e.a(new Throwable());
            }

            b(Activity activity, com.bytedance.android.livesdkapi.depend.e.c cVar, List list, SharePackage sharePackage, com.bytedance.android.livesdkapi.depend.e.b bVar) {
                this.f123968a = activity;
                this.f123969b = cVar;
                this.f123970c = list;
                this.f123971d = sharePackage;
                this.f123972e = bVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$a$a  reason: collision with other inner class name */
        public static final class C3224a<T> implements Comparator {
            static {
                Covode.recordClassIndex(81395);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return h.b.a.a(Integer.valueOf(t.f124043b), Integer.valueOf(t2.f124043b));
            }
        }

        public static LiveSharePackage a(com.bytedance.android.livesdkapi.depend.e.c cVar, Context context) {
            UrlModel a2;
            String str;
            String str2;
            l.d(cVar, "");
            l.d(context, "");
            SharePackage.a a3 = new SharePackage.a().a("live");
            String c2 = com.ss.android.ugc.aweme.share.improve.c.b.c(cVar.f22976l);
            if (c2 == null) {
                c2 = "";
            }
            SharePackage.a e2 = a3.e(c2);
            String str3 = cVar.f22977m;
            if (str3 == null) {
                str3 = "";
            }
            SharePackage.a c3 = e2.c(str3);
            String string = context.getResources().getString(R.string.e9u);
            l.b(string, "");
            LiveSharePackage liveSharePackage = new LiveSharePackage(c3.d(string).b(String.valueOf(cVar.f22967c)));
            Bundle bundle = liveSharePackage.f124595i;
            if (!TextUtils.isEmpty(cVar.M)) {
                bundle.putString("aid", cVar.M);
            }
            bundle.putSerializable("thumb_for_share", a(cVar.f22971g));
            if (cVar.f22974j == null) {
                a2 = a(cVar.f22973i);
            } else {
                a2 = a(cVar.f22974j);
            }
            bundle.putSerializable("video_cover", a2);
            bundle.putString("author_name", cVar.f22975k);
            if (cVar.f22970f == null) {
                bundle.putString("author_id", null);
            } else {
                bundle.putString("author_id", cVar.f22970f.toString());
            }
            bundle.putString("app_name", context.getString(R.string.uh));
            String str4 = cVar.o;
            if (str4 == null || p.a((CharSequence) str4)) {
                str = e.a(a(cVar.f22972h));
            } else {
                str = cVar.o;
            }
            bundle.putString("thumb_url", str);
            bundle.putString("uid_for_share", String.valueOf(cVar.f22968d));
            bundle.putString("sec_user_id", cVar.w);
            bundle.putLong("group_id", cVar.f22967c);
            bundle.putLong("item_id", cVar.f22967c);
            bundle.putString("share_text", liveSharePackage.f124593g);
            bundle.putString("live_id", String.valueOf(cVar.f22968d));
            bundle.putString("room_title", cVar.f22977m);
            bundle.putString("request_id", cVar.t);
            if (cVar.q) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            bundle.putString("user_type", str2);
            bundle.putString("request_page", cVar.B);
            bundle.putString("previous_page", "live");
            bundle.putBoolean("is_share_live", true);
            return liveSharePackage;
        }

        public static List<com.ss.android.ugc.aweme.im.service.model.f> a(Context context, com.bytedance.android.livesdkapi.depend.e.c cVar) {
            l.d(context, "");
            l.d(cVar, "");
            ArrayList arrayList = new ArrayList();
            List<User> unmodifiableList = Collections.unmodifiableList(cVar.K);
            l.b(unmodifiableList, "");
            if (!(!unmodifiableList.isEmpty())) {
                unmodifiableList = null;
            }
            if (unmodifiableList != null) {
                UrlModel urlModel = new UrlModel();
                String string = context.getResources().getString(R.string.ftx, Integer.valueOf(unmodifiableList.size()));
                l.b(string, "");
                String string2 = context.getResources().getString(R.string.fty);
                l.b(string2, "");
                l.b(unmodifiableList, "");
                ArrayList arrayList2 = new ArrayList(n.a((Iterable) unmodifiableList, 10));
                for (User user : unmodifiableList) {
                    l.b(user, "");
                    arrayList2.add(a(user));
                }
                arrayList.add(new com.ss.android.ugc.aweme.im.service.model.f(urlModel, string, string2, arrayList2, "top_supporters"));
            }
            List<User> unmodifiableList2 = Collections.unmodifiableList(cVar.L);
            l.b(unmodifiableList2, "");
            if ((!unmodifiableList2.isEmpty()) && unmodifiableList2 != null) {
                UrlModel urlModel2 = new UrlModel();
                String string3 = context.getResources().getString(R.string.ftv, Integer.valueOf(unmodifiableList2.size()));
                l.b(string3, "");
                String string4 = context.getResources().getString(R.string.ftw);
                l.b(string4, "");
                l.b(unmodifiableList2, "");
                ArrayList arrayList3 = new ArrayList(n.a((Iterable) unmodifiableList2, 10));
                for (User user2 : unmodifiableList2) {
                    l.b(user2, "");
                    arrayList3.add(a(user2));
                }
                arrayList.add(new com.ss.android.ugc.aweme.im.service.model.f(urlModel2, string3, string4, arrayList3, "recently_shared"));
            }
            return arrayList;
        }

        public static com.ss.android.ugc.aweme.sharer.ui.e a(Activity activity, com.bytedance.android.livesdkapi.depend.e.c cVar, List<j> list, com.bytedance.android.livesdkapi.depend.e.b bVar, SharePackage sharePackage) {
            l.d(activity, "");
            l.d(cVar, "");
            l.d(list, "");
            l.d(bVar, "");
            l.d(sharePackage, "");
            e.b bVar2 = new e.b();
            ah.f123352a.a(bVar2, activity, false);
            bVar2.o = true;
            bVar2.a(new com.ss.android.ugc.aweme.share.improve.b.b());
            bVar2.a("instagram");
            bVar2.a("instagram_story");
            List<com.bytedance.android.livesdkapi.depend.e.a> list2 = cVar.y;
            if (list2 != null) {
                for (T t : list2) {
                    l.b(t, "");
                    list.add(new j(new n(t, cVar), t.d()));
                }
            }
            if (list.size() > 1) {
                n.a((List) list, (Comparator) new C3224a());
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                bVar2.a(it.next().f124042a);
            }
            bVar2.a(sharePackage);
            bVar2.a(new b(activity, cVar, list, sharePackage, bVar));
            bVar2.a(new c(activity, cVar, list, sharePackage, bVar));
            return bVar2.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveSharePackage f123978a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f123979b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f123980c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f123981d;

        static {
            Covode.recordClassIndex(81398);
        }

        b(LiveSharePackage liveSharePackage, com.ss.android.ugc.aweme.sharer.b bVar, Context context, h.f.a.b bVar2) {
            this.f123978a = liveSharePackage;
            this.f123979b = bVar;
            this.f123980c = context;
            this.f123981d = bVar2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            final String str2 = (String) obj;
            Bundle bundle = this.f123978a.f124595i;
            Object obj2 = null;
            if (bundle != null) {
                str = bundle.getString("author_name");
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.share.ui.a.f124376a = str;
            if (bundle != null) {
                obj2 = com.ss.android.ugc.aweme.share.ui.a.a(bundle, "video_cover");
            }
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
            com.ss.android.ugc.aweme.share.ui.a.f124377b = (UrlModel) obj2;
            com.ss.android.ugc.aweme.sharer.b bVar = this.f123979b;
            Context context = this.f123980c;
            AnonymousClass1 r1 = new h.f.a.b<String, z>(this) {
                /* class com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(81399);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(String str) {
                    String str2 = str;
                    l.d(str2, "");
                    com.ss.android.ugc.aweme.sharer.b bVar = this.this$0.f123979b;
                    Uri a2 = cr.a(this.this$0.f123980c, new File(str2));
                    l.b(a2, "");
                    bVar.a(new com.ss.android.ugc.aweme.sharer.l(a2, str2, str2, 28), this.this$0.f123980c);
                    this.this$0.f123981d.invoke(true);
                    return z.f158842a;
                }
            };
            l.d(bVar, "");
            l.d(context, "");
            l.d(r1, "");
            com.ss.android.ugc.aweme.share.ui.b bVar2 = new com.ss.android.ugc.aweme.share.ui.b(context, (char) 0);
            a.C3242a aVar = new a.C3242a(bVar2, context, r1);
            l.d(aVar, "");
            bVar2.f124388c = aVar;
            String str3 = com.ss.android.ugc.aweme.share.ui.a.f124376a;
            UrlModel urlModel = com.ss.android.ugc.aweme.share.ui.a.f124377b;
            bVar2.f124386a = str3;
            bVar2.f124387b = urlModel;
            if (bVar2.f124386a != null) {
                TuxTextView tuxTextView = (TuxTextView) bVar2.a(R.id.cdu);
                l.b(tuxTextView, "");
                tuxTextView.setText("@" + bVar2.f124386a);
            }
            v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(bVar2.f124387b)).a("LiveShareCodeView");
            a2.f39906b = bVar2.f124389d;
            a2.u = Bitmap.Config.ARGB_8888;
            a2.a(new b.c(bVar2));
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final boolean a(com.ss.android.ugc.aweme.sharer.b bVar, Context context, h.f.a.b<? super Boolean, z> bVar2) {
        l.d(bVar, "");
        l.d(context, "");
        l.d(bVar2, "");
        ah.f123353b.a(bVar.a(), 0);
        if (bVar instanceof com.ss.android.ugc.aweme.share.improve.f.b) {
            return false;
        }
        String a2 = bVar.a();
        if (a2.hashCode() != 284397090 || !a2.equals("snapchat")) {
            return false;
        }
        try {
            c.b(this.f124594h, this.f124590d, bVar).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).e(new b(this, bVar, context, bVar2));
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }
}
