package com.facebook.share.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.facebook.AccessToken;
import com.facebook.internal.ad;
import com.facebook.internal.e;
import com.facebook.internal.h;
import com.facebook.internal.i;
import com.facebook.internal.j;
import com.facebook.internal.x;
import com.facebook.share.a;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.i;
import com.facebook.share.internal.k;
import com.facebook.share.internal.l;
import com.facebook.share.internal.m;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class a extends j<ShareContent, a.C1192a> implements com.facebook.share.a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f49024d = a.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private static final int f49025e = e.b.Share.toRequestCode();

    /* renamed from: c  reason: collision with root package name */
    boolean f49026c;

    /* renamed from: f  reason: collision with root package name */
    private boolean f49027f = true;

    /* renamed from: com.facebook.share.a.a$a  reason: collision with other inner class name */
    class C1193a extends j<ShareContent, a.C1192a>.a {
        static {
            Covode.recordClassIndex(30642);
        }

        @Override // com.facebook.internal.j.a
        public final Object a() {
            return c.NATIVE;
        }

        private C1193a() {
            super();
        }

        /* access modifiers changed from: private */
        public com.facebook.internal.a a(final ShareContent shareContent) {
            i.a(shareContent);
            final com.facebook.internal.a c2 = a.this.c();
            final boolean z = a.this.f49026c;
            com.facebook.internal.i.a(c2, new i.a() {
                /* class com.facebook.share.a.a.C1193a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(30643);
                }

                @Override // com.facebook.internal.i.a
                public final Bundle a() {
                    return com.facebook.share.internal.e.a(c2.b(), shareContent, z);
                }

                @Override // com.facebook.internal.i.a
                public final Bundle b() {
                    return com.facebook.share.internal.c.a(c2.b(), shareContent, z);
                }
            }, a.b((Class<? extends ShareContent>) shareContent.getClass()));
            return c2;
        }

        /* synthetic */ C1193a(a aVar, byte b2) {
            this();
        }

        @Override // com.facebook.internal.j.a
        public final /* synthetic */ boolean a(Object obj, boolean z) {
            if (!(obj instanceof ShareCameraEffectContent) || !a.a((Class<? extends ShareContent>) obj.getClass())) {
                return false;
            }
            return true;
        }
    }

    class b extends j<ShareContent, a.C1192a>.a {
        static {
            Covode.recordClassIndex(30644);
        }

        @Override // com.facebook.internal.j.a
        public final Object a() {
            return c.FEED;
        }

        private b() {
            super();
        }

        /* access modifiers changed from: private */
        public com.facebook.internal.a a(ShareContent shareContent) {
            Bundle bundle;
            a aVar = a.this;
            aVar.a(aVar.a(), shareContent, c.FEED);
            com.facebook.internal.a c2 = a.this.c();
            if (shareContent instanceof ShareLinkContent) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
                com.facebook.share.internal.i.b(shareLinkContent);
                bundle = new Bundle();
                ad.a(bundle, StringSet.name, shareLinkContent.f49112b);
                ad.a(bundle, "description", shareLinkContent.f49111a);
                ad.a(bundle, "link", ad.a(shareLinkContent.f49097h));
                ad.a(bundle, "picture", ad.a(shareLinkContent.f49113c));
                ad.a(bundle, "quote", shareLinkContent.f49114d);
                if (shareLinkContent.f49102m != null) {
                    ad.a(bundle, "hashtag", shareLinkContent.f49102m.f49109a);
                }
            } else {
                ShareFeedContent shareFeedContent = (ShareFeedContent) shareContent;
                bundle = new Bundle();
                ad.a(bundle, "to", shareFeedContent.f49059a);
                ad.a(bundle, "link", shareFeedContent.f49060b);
                ad.a(bundle, "picture", shareFeedContent.f49064f);
                ad.a(bundle, "source", shareFeedContent.f49065g);
                ad.a(bundle, StringSet.name, shareFeedContent.f49061c);
                ad.a(bundle, "caption", shareFeedContent.f49062d);
                ad.a(bundle, "description", shareFeedContent.f49063e);
            }
            com.facebook.internal.i.a(c2, "feed", bundle);
            return c2;
        }

        /* synthetic */ b(a aVar, byte b2) {
            this();
        }

        @Override // com.facebook.internal.j.a
        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z) {
            if ((obj instanceof ShareLinkContent) || (obj instanceof ShareFeedContent)) {
                return true;
            }
            return false;
        }
    }

    class d extends j<ShareContent, a.C1192a>.a {
        static {
            Covode.recordClassIndex(30646);
        }

        @Override // com.facebook.internal.j.a
        public final Object a() {
            return c.NATIVE;
        }

        private d() {
            super();
        }

        /* access modifiers changed from: private */
        public com.facebook.internal.a a(final ShareContent shareContent) {
            a aVar = a.this;
            aVar.a(aVar.a(), shareContent, c.NATIVE);
            com.facebook.share.internal.i.a(shareContent);
            final com.facebook.internal.a c2 = a.this.c();
            final boolean z = a.this.f49026c;
            com.facebook.internal.i.a(c2, new i.a() {
                /* class com.facebook.share.a.a.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(30647);
                }

                @Override // com.facebook.internal.i.a
                public final Bundle a() {
                    return com.facebook.share.internal.e.a(c2.b(), shareContent, z);
                }

                @Override // com.facebook.internal.i.a
                public final Bundle b() {
                    return com.facebook.share.internal.c.a(c2.b(), shareContent, z);
                }
            }, a.b((Class<? extends ShareContent>) shareContent.getClass()));
            return c2;
        }

        /* synthetic */ d(a aVar, byte b2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
            if (r1 != false) goto L_0x0033;
         */
        @Override // com.facebook.internal.j.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ boolean a(java.lang.Object r5, boolean r6) {
            /*
                r4 = this;
                com.facebook.share.model.ShareContent r5 = (com.facebook.share.model.ShareContent) r5
                r3 = 0
                if (r5 == 0) goto L_0x000d
                boolean r0 = r5 instanceof com.facebook.share.model.ShareCameraEffectContent
                if (r0 != 0) goto L_0x000d
                boolean r0 = r5 instanceof com.facebook.share.model.ShareStoryContent
                if (r0 == 0) goto L_0x000e
            L_0x000d:
                return r3
            L_0x000e:
                r2 = 1
                if (r6 != 0) goto L_0x0033
                com.facebook.share.model.ShareHashtag r0 = r5.f49102m
                if (r0 == 0) goto L_0x003e
                com.facebook.share.internal.j r0 = com.facebook.share.internal.j.HASHTAG
                boolean r1 = com.facebook.internal.i.a(r0)
            L_0x001b:
                boolean r0 = r5 instanceof com.facebook.share.model.ShareLinkContent
                if (r0 == 0) goto L_0x0031
                r0 = r5
                com.facebook.share.model.ShareLinkContent r0 = (com.facebook.share.model.ShareLinkContent) r0
                java.lang.String r0 = r0.f49114d
                boolean r0 = com.facebook.internal.ad.a(r0)
                if (r0 != 0) goto L_0x0031
                com.facebook.share.internal.j r0 = com.facebook.share.internal.j.LINK_SHARE_QUOTES
                boolean r0 = com.facebook.internal.i.a(r0)
                r1 = r1 & r0
            L_0x0031:
                if (r1 == 0) goto L_0x000d
            L_0x0033:
                java.lang.Class r0 = r5.getClass()
                boolean r0 = com.facebook.share.a.a.a(r0)
                if (r0 == 0) goto L_0x000d
                return r2
            L_0x003e:
                r1 = 1
                goto L_0x001b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.a.a.d.a(java.lang.Object, boolean):boolean");
        }
    }

    class e extends j<ShareContent, a.C1192a>.a {
        static {
            Covode.recordClassIndex(30648);
        }

        @Override // com.facebook.internal.j.a
        public final Object a() {
            return c.NATIVE;
        }

        private e() {
            super();
        }

        /* access modifiers changed from: private */
        public com.facebook.internal.a a(final ShareContent shareContent) {
            if (com.facebook.share.internal.i.f49074a == null) {
                com.facebook.share.internal.i.f49074a = new i.a((byte) 0);
            }
            com.facebook.share.internal.i.a(shareContent, com.facebook.share.internal.i.f49074a);
            final com.facebook.internal.a c2 = a.this.c();
            final boolean z = a.this.f49026c;
            com.facebook.internal.i.a(c2, new i.a() {
                /* class com.facebook.share.a.a.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(30649);
                }

                @Override // com.facebook.internal.i.a
                public final Bundle a() {
                    return com.facebook.share.internal.e.a(c2.b(), shareContent, z);
                }

                @Override // com.facebook.internal.i.a
                public final Bundle b() {
                    return com.facebook.share.internal.c.a(c2.b(), shareContent, z);
                }
            }, a.b((Class<? extends ShareContent>) shareContent.getClass()));
            return c2;
        }

        /* synthetic */ e(a aVar, byte b2) {
            this();
        }

        @Override // com.facebook.internal.j.a
        public final /* synthetic */ boolean a(Object obj, boolean z) {
            if (!(obj instanceof ShareStoryContent) || !a.a((Class<? extends ShareContent>) obj.getClass())) {
                return false;
            }
            return true;
        }
    }

    class f extends j<ShareContent, a.C1192a>.a {
        static {
            Covode.recordClassIndex(30650);
        }

        @Override // com.facebook.internal.j.a
        public final Object a() {
            return c.WEB;
        }

        private f() {
            super();
        }

        /* access modifiers changed from: private */
        public com.facebook.internal.a a(ShareContent shareContent) {
            Bundle bundle;
            a aVar = a.this;
            aVar.a(aVar.a(), shareContent, c.WEB);
            com.facebook.internal.a c2 = a.this.c();
            com.facebook.share.internal.i.b(shareContent);
            String str = null;
            if (shareContent instanceof ShareLinkContent) {
                bundle = m.a((ShareLinkContent) shareContent);
            } else {
                if (shareContent instanceof SharePhotoContent) {
                    SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
                    UUID b2 = c2.b();
                    SharePhotoContent.a a2 = new SharePhotoContent.a().a(sharePhotoContent);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < sharePhotoContent.f49159a.size(); i2++) {
                        SharePhoto sharePhoto = sharePhotoContent.f49159a.get(i2);
                        Bitmap bitmap = sharePhoto.f49151b;
                        if (bitmap != null) {
                            x.a a3 = x.a(b2, bitmap);
                            SharePhoto.a a4 = new SharePhoto.a().a(sharePhoto);
                            a4.f49156c = Uri.parse(a3.f48693b);
                            a4.f49155b = null;
                            sharePhoto = a4.a();
                            arrayList2.add(a3);
                        }
                        arrayList.add(sharePhoto);
                    }
                    a2.a(arrayList);
                    x.a(arrayList2);
                    bundle = m.a(a2.a());
                } else {
                    bundle = m.a((ShareOpenGraphContent) shareContent);
                }
                if (!(shareContent instanceof SharePhotoContent)) {
                    if (shareContent instanceof ShareOpenGraphContent) {
                        str = "share_open_graph";
                    }
                    com.facebook.internal.i.a(c2, str, bundle);
                    return c2;
                }
            }
            str = "share";
            com.facebook.internal.i.a(c2, str, bundle);
            return c2;
        }

        /* synthetic */ f(a aVar, byte b2) {
            this();
        }

        @Override // com.facebook.internal.j.a
        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z) {
            ShareContent shareContent = (ShareContent) obj;
            if (shareContent == null || !a.a(shareContent)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.facebook.internal.j
    public final com.facebook.internal.a c() {
        return new com.facebook.internal.a(this.f48606b);
    }

    static {
        Covode.recordClassIndex(30640);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.share.a.a$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f49028a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 30641(0x77b1, float:4.2937E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.share.a.a$c[] r0 = com.facebook.share.a.a.c.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.share.a.a.AnonymousClass1.f49028a = r2
                com.facebook.share.a.a$c r0 = com.facebook.share.a.a.c.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.share.a.a.AnonymousClass1.f49028a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.share.a.a$c r0 = com.facebook.share.a.a.c.WEB     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.share.a.a.AnonymousClass1.f49028a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.share.a.a$c r0 = com.facebook.share.a.a.c.NATIVE     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.a.a.AnonymousClass1.<clinit>():void");
        }
    }

    public enum c {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED;

        static {
            Covode.recordClassIndex(30645);
        }
    }

    @Override // com.facebook.internal.j
    public final List<j<ShareContent, a.C1192a>.a> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d(this, (byte) 0));
        arrayList.add(new b(this, (byte) 0));
        arrayList.add(new f(this, (byte) 0));
        arrayList.add(new C1193a(this, (byte) 0));
        arrayList.add(new e(this, (byte) 0));
        return arrayList;
    }

    public static boolean a(Class<? extends ShareContent> cls) {
        h b2 = b(cls);
        if (b2 == null || !com.facebook.internal.i.a(b2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.app.Activity r3) {
        /*
            r2 = this;
            int r1 = com.facebook.share.a.a.f49025e
            r2.<init>(r3, r1)
            r0 = 1
            r2.f49027f = r0
            java.lang.Class<com.facebook.share.internal.k> r0 = com.facebook.share.internal.k.class
            boolean r0 = com.facebook.internal.a.b.a.a(r0)
            if (r0 != 0) goto L_0x001f
            com.facebook.share.internal.k$4 r0 = new com.facebook.share.internal.k$4     // Catch:{ all -> 0x0019 }
            r0.<init>(r1)     // Catch:{ all -> 0x0019 }
            com.facebook.internal.e.a(r1, r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r1 = move-exception
            java.lang.Class<com.facebook.share.internal.k> r0 = com.facebook.share.internal.k.class
            com.facebook.internal.a.b.a.a(r1, r0)
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.a.a.<init>(android.app.Activity):void");
    }

    public static boolean a(ShareContent shareContent) {
        Class<?> cls = shareContent.getClass();
        if (!ShareLinkContent.class.isAssignableFrom(cls) && !ShareOpenGraphContent.class.isAssignableFrom(cls) && (!SharePhotoContent.class.isAssignableFrom(cls) || !AccessToken.a())) {
            return false;
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            try {
                k.a((ShareOpenGraphContent) shareContent);
            } catch (Exception unused) {
                ad.d(f49024d);
                return false;
            }
        }
        return true;
    }

    public static h b(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return com.facebook.share.internal.j.SHARE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return com.facebook.share.internal.j.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return com.facebook.share.internal.j.VIDEO;
        }
        if (ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return com.facebook.share.internal.f.OG_ACTION_DIALOG;
        }
        if (ShareMediaContent.class.isAssignableFrom(cls)) {
            return com.facebook.share.internal.j.MULTIMEDIA;
        }
        if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
            return com.facebook.share.internal.a.SHARE_CAMERA_EFFECT;
        }
        if (ShareStoryContent.class.isAssignableFrom(cls)) {
            return l.SHARE_STORY_ASSET;
        }
        return null;
    }

    public final void a(Context context, ShareContent shareContent, c cVar) {
        String str;
        if (this.f49027f) {
            cVar = c.AUTOMATIC;
        }
        int i2 = AnonymousClass1.f49028a[cVar.ordinal()];
        String str2 = "unknown";
        if (i2 == 1) {
            str = "automatic";
        } else if (i2 == 2) {
            str = "web";
        } else if (i2 != 3) {
            str = str2;
        } else {
            str = "native";
        }
        h b2 = b((Class<? extends ShareContent>) shareContent.getClass());
        if (b2 == com.facebook.share.internal.j.SHARE_DIALOG) {
            str2 = "status";
        } else if (b2 == com.facebook.share.internal.j.PHOTOS) {
            str2 = UGCMonitor.TYPE_PHOTO;
        } else if (b2 == com.facebook.share.internal.j.VIDEO) {
            str2 = "video";
        } else if (b2 == com.facebook.share.internal.f.OG_ACTION_DIALOG) {
            str2 = "open_graph";
        }
        com.facebook.a.m mVar = new com.facebook.a.m(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        mVar.d();
    }
}
