package com.ss.android.ugc.aweme.share.business;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.b.a;
import com.ss.android.ugc.aweme.share.improve.a.n;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.improve.e.a;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.i;
import h.z;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f123383a;

    /* renamed from: b  reason: collision with root package name */
    public final String f123384b;

    /* renamed from: c  reason: collision with root package name */
    public final String f123385c;

    /* renamed from: d  reason: collision with root package name */
    public final String f123386d;

    /* renamed from: e  reason: collision with root package name */
    public final String f123387e;

    /* renamed from: f  reason: collision with root package name */
    public final String f123388f;

    /* renamed from: g  reason: collision with root package name */
    public final String f123389g;

    /* renamed from: h  reason: collision with root package name */
    public final String f123390h;

    /* renamed from: i  reason: collision with root package name */
    public final String f123391i;

    /* renamed from: j  reason: collision with root package name */
    public final String f123392j;

    /* renamed from: k  reason: collision with root package name */
    public final String f123393k;

    /* renamed from: l  reason: collision with root package name */
    public final String f123394l;

    /* renamed from: m  reason: collision with root package name */
    public final String f123395m;
    public final String n;
    public final Activity o;
    public final Fragment p;
    public final Aweme q;
    public final boolean r;
    public final s<ag> s;
    public final Bundle t;
    private final h.h u = i.a((h.f.a.a) new a(this));
    private final List<String> v;

    static {
        Covode.recordClassIndex(81030);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.views.i a() {
        return (com.ss.android.ugc.aweme.views.i) this.u.getValue();
    }

    public static final class h implements com.ss.android.ugc.aweme.sharer.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f123406a;

        static {
            Covode.recordClassIndex(81040);
        }

        @Override // com.ss.android.ugc.aweme.sharer.a.a
        public final Activity a() {
            return this.f123406a;
        }

        public h(Activity activity) {
            this.f123406a = activity;
        }
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.views.i> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(81031);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.views.i invoke() {
            return new com.ss.android.ugc.aweme.views.i(this.this$0.o);
        }
    }

    public static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ Dialog $dialog;

        static {
            Covode.recordClassIndex(81037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Dialog dialog) {
            super(0);
            this.$dialog = dialog;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Dialog dialog = this.$dialog;
            if (dialog != null) {
                dialog.dismiss();
            }
            return z.f158842a;
        }
    }

    public final void c() {
        try {
            a().dismiss();
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
    }

    public final boolean b() {
        if (TextUtils.equals(this.f123384b, "homepage_follow") || TextUtils.equals(this.f123384b, "homepage_friends") || TextUtils.equals(this.f123384b, "general_search")) {
            return true;
        }
        if (TextUtils.equals(this.f123384b, "personal_homepage") && TextUtils.isEmpty(this.f123390h)) {
            return true;
        }
        if (!TextUtils.equals(this.f123384b, "others_homepage") || !TextUtils.isEmpty(this.f123390h)) {
            return false;
        }
        return true;
    }

    public static final class c implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f123398a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f123399b;

        static {
            Covode.recordClassIndex(81033);
        }

        public c(b bVar, z.e eVar) {
            this.f123398a = bVar;
            this.f123399b = eVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            T t = this.f123399b.element;
            if (t != null) {
                b.a(t.getVisibility(), this.f123398a.q);
            }
        }
    }

    public static final class f implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f123403a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.ui.i f123404b;

        static {
            Covode.recordClassIndex(81038);
        }

        public f(b bVar, com.ss.android.ugc.aweme.sharer.ui.i iVar) {
            this.f123403a = bVar;
            this.f123404b = iVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            ShareChannelBar shareChannelBar = (ShareChannelBar) this.f123404b.findViewById(R.id.e1p);
            l.b(shareChannelBar, "");
            b.a(shareChannelBar.getVisibility(), this.f123403a.q);
        }
    }

    public static final class d extends com.ss.android.ugc.aweme.sharer.ui.bar.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f123400a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.ui.e f123401b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Dialog f123402c;

        static {
            Covode.recordClassIndex(81034);
        }

        static final class a extends m implements h.f.a.b<Boolean, h.z> {
            final /* synthetic */ com.ss.android.ugc.aweme.sharer.b $channel;
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(81035);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, com.ss.android.ugc.aweme.sharer.b bVar) {
                super(1);
                this.this$0 = dVar;
                this.$channel = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(Boolean bool) {
                Dialog dialog;
                boolean booleanValue = bool.booleanValue();
                com.ss.android.ugc.aweme.sharer.ui.f fVar = this.this$0.f123401b.f124660l;
                if (fVar != null) {
                    fVar.a(this.$channel, booleanValue, this.this$0.f123401b.f124657i, this.this$0.f123400a.o);
                }
                if (com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
                    this.this$0.f123400a.c();
                }
                if (!this.$channel.c() && (dialog = this.this$0.f123402c) != null) {
                    dialog.dismiss();
                }
                return h.z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.bar.e
        public final void a(com.ss.android.ugc.aweme.sharer.b bVar) {
            l.d(bVar, "");
            if (com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
                try {
                    this.f123400a.a().show();
                } catch (NullPointerException e2) {
                    e2.printStackTrace();
                }
            }
            if (!this.f123401b.f124657i.a(bVar, this.f123400a.o, new a(this, bVar))) {
                this.f123401b.f124657i.a(bVar, new C3197b(this, bVar));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.business.b$d$b  reason: collision with other inner class name */
        static final class C3197b extends m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.h, h.z> {
            final /* synthetic */ com.ss.android.ugc.aweme.sharer.b $channel;
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(81036);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3197b(d dVar, com.ss.android.ugc.aweme.sharer.b bVar) {
                super(1);
                this.this$0 = dVar;
                this.$channel = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.sharer.h hVar) {
                Dialog dialog;
                com.ss.android.ugc.aweme.sharer.h hVar2 = hVar;
                l.d(hVar2, "");
                this.$channel.a(hVar2, this.this$0.f123400a.o);
                if (com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
                    this.this$0.f123400a.c();
                }
                com.ss.android.ugc.aweme.sharer.ui.f fVar = this.this$0.f123401b.f124660l;
                if (fVar != null) {
                    fVar.a(this.$channel, true, this.this$0.f123401b.f124657i, this.this$0.f123400a.o);
                }
                if (!this.$channel.c() && (dialog = this.this$0.f123402c) != null) {
                    dialog.dismiss();
                }
                return h.z.f158842a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(b bVar, com.ss.android.ugc.aweme.sharer.ui.e eVar, Dialog dialog, Context context, SharePackage sharePackage) {
            super(context, sharePackage);
            this.f123400a = bVar;
            this.f123401b = eVar;
            this.f123402c = dialog;
        }
    }

    public static final class g extends m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f123405a = new g();

        static {
            Covode.recordClassIndex(81039);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sharer.b bVar) {
            boolean z;
            com.ss.android.ugc.aweme.sharer.b bVar2 = bVar;
            l.d(bVar2, "");
            if (a.C3219a.a().isEmpty() || l.a((Object) bVar2.a(), (Object) "download")) {
                z = true;
            } else {
                z = a.C3219a.a().contains(bVar2.a());
            }
            return Boolean.valueOf(z);
        }
    }

    public static String a(Aweme aweme) {
        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
        if (interactionTagInfo != null) {
            int interestLevel = interactionTagInfo.getInterestLevel();
            if (interestLevel == InteractionTagInterestLevel.LOW.getLevel()) {
                return "low_interest";
            }
            if (interestLevel == InteractionTagInterestLevel.HIGH.getLevel()) {
                return "high_interest";
            }
        }
        return "";
    }

    private static String b(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        if (aweme.isLive()) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (roomFeedCellStruct == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null) {
                return null;
            }
            return String.valueOf(newLiveRoomData.id);
        } else if (aweme.getAuthor() == null) {
            return null;
        } else {
            User author = aweme.getAuthor();
            l.b(author, "");
            if (author.isLive()) {
                return String.valueOf(aweme.getAuthor().roomId);
            }
            return null;
        }
    }

    private static String c(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        if (aweme.isLive()) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (roomFeedCellStruct == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null) {
                return null;
            }
            return String.valueOf(newLiveRoomData.getAnchorId());
        } else if (aweme.getAuthor() == null) {
            return null;
        } else {
            User author = aweme.getAuthor();
            l.b(author, "");
            if (!author.isLive()) {
                return null;
            }
            User author2 = aweme.getAuthor();
            l.b(author2, "");
            return author2.getUid().toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.business.b$b  reason: collision with other inner class name */
    public static final class C3196b extends com.ss.android.ugc.aweme.sharer.ui.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f123396a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemeSharePackage f123397b;

        static {
            Covode.recordClassIndex(81032);
        }

        public C3196b(b bVar, AwemeSharePackage awemeSharePackage) {
            this.f123396a = bVar;
            this.f123397b = awemeSharePackage;
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.g, com.ss.android.ugc.aweme.sharer.ui.f
        public final void a(SharePackage sharePackage, Context context) {
            l.d(sharePackage, "");
            l.d(context, "");
            this.f123396a.s.a(new ag(28));
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.g, com.ss.android.ugc.aweme.sharer.ui.f
        public final void a(com.ss.android.ugc.aweme.sharer.ui.h hVar, SharePackage sharePackage, Context context) {
            l.d(hVar, "");
            l.d(sharePackage, "");
            l.d(context, "");
            if (hVar instanceof com.ss.android.ugc.aweme.share.improve.a.h) {
                this.f123396a.t.putString("share_form", "url_form");
                this.f123396a.a(hVar.c(), true, sharePackage, context, this.f123396a.q);
            }
            if (hVar instanceof n) {
                this.f123396a.a(hVar.c(), true, sharePackage, context, this.f123396a.q);
            }
            if (l.a((Object) hVar.c(), (Object) "live_photo")) {
                this.f123396a.a(hVar.c(), true, sharePackage, context, this.f123396a.q);
            }
        }

        @Override // com.ss.android.ugc.aweme.sharer.ui.b, com.ss.android.ugc.aweme.sharer.ui.g
        public final void a(com.ss.android.ugc.aweme.sharer.b bVar, boolean z, SharePackage sharePackage, Context context) {
            l.d(bVar, "");
            l.d(context, "");
            this.f123396a.t.putString("share_form", this.f123397b.f124595i.getString("share_form"));
            this.f123396a.t.putString("share_url", this.f123397b.f124595i.getString("share_url"));
            this.f123396a.a(bVar.a(), z, sharePackage, context, this.f123396a.q);
            ai.b("outside_channel");
            if (z) {
                if (l.a((Object) bVar.a(), (Object) "copy")) {
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.share.e.a(1));
                } else if (!l.a((Object) bVar.a(), (Object) "chat_merge")) {
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.share.e.a(2));
                }
            }
            if ((bVar instanceof com.ss.android.ugc.aweme.share.improve.b.b) || (bVar instanceof com.ss.android.ugc.aweme.share.improve.f.c)) {
                Bundle bundle = new Bundle();
                bundle.putString("enter_from", this.f123396a.f123384b);
                bundle.putString("enter_method", "share");
                s<ag> sVar = this.f123396a.s;
                ag agVar = new ag(62);
                agVar.f93452c = bundle;
                sVar.a(agVar);
            }
        }
    }

    private static com.ss.android.ugc.aweme.sharer.b a(com.ss.android.ugc.aweme.sharer.b bVar, ACLCommonShare aCLCommonShare) {
        return new com.ss.android.ugc.aweme.share.improve.f.c(bVar, aCLCommonShare);
    }

    private static com.ss.android.ugc.aweme.sharer.b b(com.ss.android.ugc.aweme.sharer.b bVar, ACLCommonShare aCLCommonShare) {
        return new com.ss.android.ugc.aweme.share.improve.f.c(bVar, aCLCommonShare);
    }

    public static void a(int i2, Aweme aweme) {
        if (i2 == 0) {
            a.C3194a.a("ug_share_video_show", aweme, null);
        }
    }

    public final void a(String str, com.ss.android.ugc.aweme.sharer.d dVar, e.b bVar) {
        com.ss.android.ugc.aweme.sharer.b a2 = com.ss.android.ugc.aweme.sharer.c.a(str, dVar);
        if (a2 != null) {
            ACLCommonShare a3 = h.a.a(this.q, a2.a());
            if (a3 == null || a3.getShowType() != 0) {
                bVar.a(b(a2, a3));
            }
        }
    }

    public final void b(String str, com.ss.android.ugc.aweme.sharer.d dVar, e.b bVar) {
        com.ss.android.ugc.aweme.sharer.b a2 = com.ss.android.ugc.aweme.sharer.c.a(str, dVar);
        if (a2 != null) {
            ACLCommonShare a3 = h.a.a(this.q, a2.a());
            if (a3 == null || a3.getShowType() != 0) {
                bVar.a(a(a2, a3));
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0304  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r14, boolean r15, com.ss.android.ugc.aweme.sharer.ui.SharePackage r16, android.content.Context r17, com.ss.android.ugc.aweme.feed.model.Aweme r18) {
        /*
        // Method dump skipped, instructions count: 836
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.business.b.a(java.lang.String, boolean, com.ss.android.ugc.aweme.sharer.ui.SharePackage, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public b(Activity activity, Fragment fragment, Aweme aweme, boolean z, s<ag> sVar, Bundle bundle) {
        l.d(activity, "");
        l.d(fragment, "");
        l.d(aweme, "");
        l.d(sVar, "");
        l.d(bundle, "");
        this.o = activity;
        this.p = fragment;
        this.q = aweme;
        this.r = z;
        this.s = sVar;
        this.t = bundle;
        this.f123383a = bundle.getInt("page_type");
        this.f123384b = bundle.getString("event_type", "");
        this.f123385c = bundle.getString("enter_method", "");
        this.f123386d = bundle.getString("play_list_id", "");
        this.f123387e = bundle.getString("play_list_id_key", "");
        this.f123388f = bundle.getString("play_list_type", "");
        this.f123389g = bundle.getString("tab_name", "");
        this.f123390h = bundle.getString("from", "");
        this.f123391i = bundle.getString("creation_id", "");
        this.f123392j = bundle.getString("tag_id", "");
        this.f123393k = bundle.getString("extra_parent_tag_id", "");
        this.f123394l = bundle.getString("previousPage", "");
        this.f123395m = bundle.getString("previousPagePosition", "");
        this.n = bundle.getString("category_name", "");
        com.google.c.c.z of = com.google.c.c.z.of("instagram", "instagram_story", "snapchat", "zalo", "whatsapp", "kakaotalk");
        l.b(of, "");
        this.v = of;
    }
}
