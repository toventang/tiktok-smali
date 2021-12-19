package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.share.c;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.IIMAdapterService;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.IMAdapterServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.port.in.bg;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.ss.android.ugc.aweme.services.function.IFunctionKey;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.d.f;
import com.ss.android.ugc.aweme.share.d.g;
import com.ss.android.ugc.aweme.share.improve.a;
import com.ss.android.ugc.aweme.share.improve.a.a.d;
import com.ss.android.ugc.aweme.share.improve.a.ac;
import com.ss.android.ugc.aweme.share.improve.a.ai;
import com.ss.android.ugc.aweme.share.improve.a.al;
import com.ss.android.ugc.aweme.share.improve.a.ao;
import com.ss.android.ugc.aweme.share.improve.a.ap;
import com.ss.android.ugc.aweme.share.improve.a.aq;
import com.ss.android.ugc.aweme.share.improve.a.ar;
import com.ss.android.ugc.aweme.share.improve.a.as;
import com.ss.android.ugc.aweme.share.improve.e.a;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.MusicSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.PlaylistSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.QnASharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.j;
import com.ss.android.ugc.aweme.share.improve.pkg.k;
import com.ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity;
import com.ss.android.ugc.aweme.share.s;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.m;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.sharer.ui.i;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.z;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class ShareServiceImpl implements ShareService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123258a = new a((byte) 0);

    static {
        Covode.recordClassIndex(80970);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80971);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final f c() {
        return g.f123464c;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final i a(Activity activity, Fragment fragment, Aweme aweme, s<ag> sVar, Bundle bundle) {
        l.d(activity, "");
        l.d(fragment, "");
        l.d(aweme, "");
        l.d(sVar, "");
        l.d(bundle, "");
        l.d(activity, "");
        l.d(fragment, "");
        l.d(aweme, "");
        l.d(sVar, "");
        l.d(bundle, "");
        String string = bundle.getString("event_type", "");
        int i2 = bundle.getInt("page_type");
        l.b(string, "");
        AwemeSharePackage a2 = AwemeSharePackage.a.a(aweme, activity, i2, string, null, 16);
        a2.f124595i.putAll(bundle);
        e.b a3 = new e.b().a(a2);
        a.C3219a.a(a3, false, com.bytedance.ies.ugc.appcontext.f.j(), true);
        a3.o = false;
        a3.f124671j = R.string.d5u;
        if (z.c(aweme)) {
            a3.o = true;
            a2.f124595i.putString("is_friend_private", "true");
        } else {
            a3.f124665d = true;
        }
        new c(aweme, true, activity, a3, sVar, string, i2, "share_board").a();
        c.a(a3, string, aweme);
        i a4 = ShareDependService.a.a().a(activity, a3.a(), R.style.wp);
        a4.show();
        return a4;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final void a(Activity activity, Music music, com.ss.android.ugc.aweme.sharer.ui.g gVar, List<? extends Aweme> list, String str) {
        l.d(activity, "");
        l.d(gVar, "");
        l.d(activity, "");
        l.d(gVar, "");
        if (music != null && music.getShareInfo() != null) {
            if (list == null) {
                list = h.a.z.INSTANCE;
            }
            l.d(music, "");
            l.d(activity, "");
            l.d(list, "");
            SharePackage.a a2 = new SharePackage.a().a("music");
            String mid = music.getMid();
            l.b(mid, "");
            SharePackage.a b2 = a2.b(mid);
            ShareInfo shareInfo = music.getShareInfo();
            l.b(shareInfo, "");
            String shareTitle = shareInfo.getShareTitle();
            l.b(shareTitle, "");
            SharePackage.a c2 = b2.c(shareTitle);
            ShareInfo shareInfo2 = music.getShareInfo();
            l.b(shareInfo2, "");
            String shareDesc = shareInfo2.getShareDesc();
            l.b(shareDesc, "");
            SharePackage.a d2 = c2.d(shareDesc);
            ShareInfo shareInfo3 = music.getShareInfo();
            l.b(shareInfo3, "");
            String c3 = com.ss.android.ugc.aweme.share.improve.c.b.c(com.ss.android.ugc.aweme.share.improve.c.b.b(shareInfo3.getShareUrl()));
            if (c3 == null) {
                c3 = "";
            }
            MusicSharePackage musicSharePackage = new MusicSharePackage(d2.e(c3));
            Bundle bundle = musicSharePackage.f124595i;
            bundle.putString("app_name", activity.getString(R.string.uh));
            bundle.putString("thumb_url", com.ss.android.ugc.aweme.base.e.a(music.getCoverThumb()));
            bundle.putSerializable("video_cover", music.getCoverMedium());
            bundle.putString("music_id", music.getMid());
            bundle.putString("process_id", str);
            bundle.putString("music_name", music.getMusicName());
            bundle.putInt("user_count", music.getUserCount());
            bundle.putSerializable("cover_thumb", music.getCoverThumb());
            com.ss.android.ugc.aweme.share.improve.c.a.a(bundle, "aweme_cover_list", list);
            musicSharePackage.f124595i.putString("enter_from", "single_song");
            musicSharePackage.f124595i.putString("enter_method", "button");
            e.b bVar = new e.b();
            bVar.a(musicSharePackage);
            com.ss.android.ugc.aweme.share.m.i.a(bVar, ShareDependService.a.a().a(musicSharePackage, ""));
            com.ss.android.ugc.aweme.share.improve.e.b.a(bVar, true, activity, true);
            bVar.a(new com.ss.android.ugc.aweme.share.improve.b.b());
            bVar.a(new ap(music));
            if (SmartRouter.canOpen("//qrcodev2")) {
                bVar.a(new com.ss.android.ugc.aweme.share.improve.a.a.b(music));
            }
            bVar.a(gVar);
            ShareDependService.a.a().a(activity, bVar.a(), R.style.wk).show();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final void a(Activity activity, ShareInfo shareInfo, String str, String str2, com.ss.android.ugc.aweme.sharer.ui.g gVar) {
        String str3 = "";
        l.d(gVar, str3);
        l.d(gVar, str3);
        if (activity != null && shareInfo != null && str != null) {
            SharePackage.a b2 = new SharePackage.a().a("playlist").b(str);
            String shareTitle = shareInfo.getShareTitle();
            l.b(shareTitle, str3);
            SharePackage.a c2 = b2.c(shareTitle);
            String shareDesc = shareInfo.getShareDesc();
            l.b(shareDesc, str3);
            SharePackage.a d2 = c2.d(shareDesc);
            String shareUrl = shareInfo.getShareUrl();
            if (shareUrl != null) {
                str3 = shareUrl;
            }
            PlaylistSharePackage playlistSharePackage = new PlaylistSharePackage(d2.e(str3));
            Bundle bundle = playlistSharePackage.f124595i;
            bundle.putString("app_name", activity.getString(R.string.uh));
            bundle.putString("process_id", str2);
            playlistSharePackage.f124595i.putString("enter_from", "single_song");
            playlistSharePackage.f124595i.putString("enter_method", "button");
            e.b bVar = new e.b();
            bVar.a(playlistSharePackage);
            com.ss.android.ugc.aweme.share.improve.e.b.a(bVar, true, activity, true);
            bVar.a(new com.ss.android.ugc.aweme.share.improve.b.b());
            bVar.o = false;
            bVar.x = true;
            bVar.a(gVar);
            ShareDependService.a.a().a(activity, bVar.a(), R.style.wk).show();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final void a(Activity activity, com.ss.android.ugc.aweme.sticker.model.g gVar, String str, List<? extends Aweme> list, String str2) {
        String str3;
        String str4;
        String shareDesc;
        l.d(activity, "");
        l.d(activity, "");
        if (gVar != null && gVar.shareInfo != null) {
            l.d(gVar, "");
            l.d(activity, "");
            SharePackage.a a2 = new SharePackage.a().a("sticker");
            String str5 = gVar.id;
            l.b(str5, "");
            SharePackage.a b2 = a2.b(str5);
            ShareInfo shareInfo = gVar.shareInfo;
            String str6 = " ";
            if (shareInfo == null || (str3 = shareInfo.getShareTitle()) == null) {
                str3 = str6;
            }
            SharePackage.a c2 = b2.c(str3);
            ShareInfo shareInfo2 = gVar.shareInfo;
            if (!(shareInfo2 == null || (shareDesc = shareInfo2.getShareDesc()) == null)) {
                str6 = shareDesc;
            }
            SharePackage.a d2 = c2.d(str6);
            ShareInfo shareInfo3 = gVar.shareInfo;
            String b3 = com.ss.android.ugc.aweme.share.improve.c.b.b(shareInfo3 != null ? shareInfo3.getShareUrl() : null);
            if (b3 == null) {
                b3 = "";
            }
            StickerSharePackage stickerSharePackage = new StickerSharePackage(d2.e(b3));
            Bundle bundle = stickerSharePackage.f124595i;
            bundle.putString("app_name", activity.getString(R.string.uh));
            bundle.putSerializable("video_cover", gVar.iconUrl);
            bundle.putString("sticker_id", gVar.id);
            bundle.putString("sticker_name", gVar.name);
            bundle.putLong("user_count", gVar.userCount);
            if (str == null) {
                str4 = "";
            } else {
                str4 = str;
            }
            bundle.putString("group_id", str4);
            bundle.putString("user_id", gVar.ownerId);
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString("log_pb", str2);
            com.ss.android.ugc.aweme.share.improve.c.a.a(bundle, "aweme_cover_list", list);
            stickerSharePackage.f124595i.putString("enter_from", "prop_page");
            stickerSharePackage.f124595i.putString("enter_method", "button");
            StickerSharePackage.a.C3226a aVar = new StickerSharePackage.a.C3226a(gVar);
            e.b bVar = new e.b();
            com.ss.android.ugc.aweme.share.m.i.a(bVar, ShareDependService.b.a(ShareDependService.a.a(), stickerSharePackage, null, 6));
            ah.f123352a.a((ShareService) bVar, (e.b) activity, (Activity) true);
            bVar.a(stickerSharePackage);
            bVar.a(new com.ss.android.ugc.aweme.share.improve.b.b());
            if (!TextUtils.isEmpty(gVar.ownerId)) {
                bVar.a(new ar(gVar));
            }
            bVar.a(new d(gVar, str));
            bVar.a(aVar);
            ShareDependService.b.a(ShareDependService.a.a(), activity, bVar.a()).show();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final void a(Activity activity, com.ss.android.ugc.aweme.qna.model.b bVar, com.ss.android.ugc.aweme.sharer.ui.g gVar, String str) {
        String str2;
        l.d(activity, "");
        l.d(bVar, "");
        l.d(gVar, "");
        l.d(activity, "");
        l.d(bVar, "");
        l.d(gVar, "");
        SharePackage.a c2 = new SharePackage.a().a("qna").b(String.valueOf(bVar.f119476b)).c(bVar.f119477c);
        ShareInfo shareInfo = bVar.f119479e;
        String str3 = null;
        if (shareInfo == null || (str2 = shareInfo.getShareDesc()) == null) {
            str2 = "";
        }
        SharePackage.a d2 = c2.d(str2);
        ShareInfo shareInfo2 = bVar.f119479e;
        if (shareInfo2 != null) {
            str3 = shareInfo2.getShareUrl();
        }
        String c3 = com.ss.android.ugc.aweme.share.improve.c.b.c(com.ss.android.ugc.aweme.share.improve.c.b.b(str3));
        if (c3 == null) {
            c3 = "";
        }
        QnASharePackage qnASharePackage = new QnASharePackage(d2.e(c3));
        qnASharePackage.f124595i.putLong("qna_id", bVar.f119476b);
        qnASharePackage.f124595i.putString("qna_name", bVar.f119477c);
        qnASharePackage.f124595i.putInt("user_count", bVar.f119478d);
        qnASharePackage.f124595i.putString("app_name", activity.getString(R.string.uh));
        qnASharePackage.f124595i.putString("process_id", str);
        com.ss.android.ugc.aweme.share.improve.c.a.a(qnASharePackage.f124595i, "aweme_cover_list", bVar.f119480f);
        qnASharePackage.f124595i.putString("enter_from", "qa_detail");
        qnASharePackage.f124595i.putString("enter_method", "button");
        e.b bVar2 = new e.b();
        bVar2.a(qnASharePackage);
        boolean z = bVar.f119479e != null;
        com.ss.android.ugc.aweme.share.m.i.a(bVar2, ShareDependService.a.a().a(qnASharePackage, ""));
        com.ss.android.ugc.aweme.share.improve.e.b.a(bVar2, z, activity, z);
        if (QnaService.a().enablePublicQna()) {
            ai aiVar = new ai(bVar);
            l.d(bVar2, "");
            bVar2.a(aiVar);
        }
        bVar2.a(new aq(bVar));
        if (z) {
            if (SmartRouter.canOpen("//qrcodev2")) {
                bVar2.a(new com.ss.android.ugc.aweme.share.improve.a.a.c(bVar));
            }
            bVar2.a(new com.ss.android.ugc.aweme.share.improve.b.b());
        }
        bVar2.a(gVar);
        ShareDependService.a.a().a(activity, bVar2.a(), R.style.wk).show();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final void a(Handler handler, Activity activity, User user, List<? extends Aweme> list) {
        String str;
        l.d(activity, "");
        l.d(activity, "");
        if (user != null && user.getShareInfo() != null) {
            UserSharePackage a2 = UserSharePackage.a.a(user, activity, list);
            String str2 = in.g(user) ? "personal_homepage" : "others_homepage";
            a2.f124595i.putString("enter_from", str2);
            a2.f124595i.putString("enter_method", "button");
            e.b bVar = new e.b();
            com.ss.android.ugc.aweme.share.m.i.a(bVar, ShareDependService.b.a(ShareDependService.a.a(), a2, str2, 4));
            ah.f123352a.a((ShareService) bVar, (e.b) activity, (Activity) true);
            GeneralPermission generalPermission = user.getGeneralPermission();
            if (generalPermission != null) {
                str = generalPermission.getShareProfileToast();
            } else {
                str = null;
            }
            boolean z = false;
            if (!TextUtils.isEmpty(str)) {
                bVar.o = false;
            }
            if (com.ss.android.ugc.aweme.account.b.g().isMe(user.getUid()) || !user.isSecret()) {
                bVar.a(new com.ss.android.ugc.aweme.share.improve.b.b());
            } else {
                bVar.f124665d = true;
                bVar.o = false;
            }
            if (handler != null) {
                bVar.a(new as(user));
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                if (g2.isLogin()) {
                    bVar.a(new com.ss.android.ugc.aweme.share.improve.a.f(user, handler));
                }
                IIMAdapterService d2 = IMAdapterServiceImpl.d();
                l.b(d2, "");
                if (d2.b() || IMAdapterServiceImpl.d().c()) {
                    z = true;
                }
                if (!user.isBlock && IMAdapterServiceImpl.d().a() && !in.d() && !z) {
                    bVar.a(new ac(handler));
                }
                SharePrefCache inst = SharePrefCache.inst();
                l.b(inst, "");
                aj<Boolean> removeFollowerSwitch = inst.getRemoveFollowerSwitch();
                l.b(removeFollowerSwitch, "");
                Boolean c2 = removeFollowerSwitch.c();
                l.b(c2, "");
                if (c2.booleanValue() && user.getFollowerStatus() == 1) {
                    bVar.a(new al(handler));
                }
            }
            bVar.a(a2);
            bVar.a(new UserSharePackage.a.C3227a(a2, str2, activity, user, handler));
            e a3 = bVar.a();
            if (!activity.isFinishing()) {
                ShareDependService.b.a(ShareDependService.a.a(), activity, a3).show();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final void a(Activity activity, Challenge challenge, List<? extends Aweme> list, String str, boolean z, String str2, String str3, String str4) {
        l.d(activity, "");
        l.d(activity, "");
        if (challenge != null && challenge.getShareInfo() != null) {
            l.d(challenge, "");
            l.d(activity, "");
            SharePackage.a a2 = new SharePackage.a().a("challenge");
            String cid = challenge.getCid();
            l.b(cid, "");
            SharePackage.a b2 = a2.b(cid);
            ShareInfo shareInfo = challenge.getShareInfo();
            l.b(shareInfo, "");
            String shareTitle = shareInfo.getShareTitle();
            l.b(shareTitle, "");
            SharePackage.a c2 = b2.c(shareTitle);
            ShareInfo shareInfo2 = challenge.getShareInfo();
            l.b(shareInfo2, "");
            String shareDesc = shareInfo2.getShareDesc();
            l.b(shareDesc, "");
            SharePackage.a d2 = c2.d(shareDesc);
            ShareInfo shareInfo3 = challenge.getShareInfo();
            l.b(shareInfo3, "");
            String c3 = com.ss.android.ugc.aweme.share.improve.c.b.c(com.ss.android.ugc.aweme.share.improve.c.b.b(shareInfo3.getShareUrl()));
            if (c3 == null) {
                c3 = "";
            }
            ChallengeSharePackage challengeSharePackage = new ChallengeSharePackage(d2.e(c3));
            Bundle bundle = challengeSharePackage.f124595i;
            bundle.putString("app_name", activity.getString(R.string.uh));
            User author = challenge.getAuthor();
            String str5 = null;
            bundle.putString("uid_for_share", author != null ? author.getUid() : null);
            bundle.putString("challenge_id", challenge.getCid());
            bundle.putString("process_id", str3);
            bundle.putString("challenge_name", challenge.getChallengeName());
            bundle.putLong("view_count", challenge.getDisplayCount());
            bundle.putBoolean("is_commerce", challenge.isCommerce());
            com.ss.android.ugc.aweme.share.improve.c.a.a(bundle, "cover_thumb", list);
            challengeSharePackage.f124595i.putString("enter_from", "challenge");
            challengeSharePackage.f124595i.putString("enter_method", "button");
            challengeSharePackage.f124595i.putString("extra_parent_tag_id", str4);
            ChallengeSharePackage.a.C3222a aVar = new ChallengeSharePackage.a.C3222a(challenge);
            e.b bVar = new e.b();
            com.ss.android.ugc.aweme.share.m.i.a(bVar, ShareDependService.b.a(ShareDependService.a.a(), challengeSharePackage, "challenge", 4));
            ah.f123352a.a((ShareService) bVar, (e.b) activity, (Activity) true);
            bVar.a(new com.ss.android.ugc.aweme.share.improve.b.b());
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            String curUserId = g2.getCurUserId();
            User author2 = challenge.getAuthor();
            if (author2 != null) {
                str5 = author2.getUid();
            }
            if (TextUtils.isEmpty(curUserId) || TextUtils.isEmpty(str5) || !TextUtils.equals(curUserId, str5)) {
                bVar.a(new ao(challenge));
            }
            if (!FunctionSupportService.INSTANCE.notSupport(IFunctionKey.QR_CODE)) {
                bVar.a(new com.ss.android.ugc.aweme.share.improve.a.a.a(challenge, z, str, str2, str3));
            }
            bVar.a(aVar);
            bVar.a(challengeSharePackage);
            ShareDependService.b.a(ShareDependService.a.a(), activity, bVar.a()).show();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ee  */
    @Override // com.ss.android.ugc.aweme.share.ShareService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.app.Activity r9, com.ss.android.ugc.aweme.feed.model.LiveEvent r10, com.ss.android.ugc.aweme.sharer.ui.f r11, com.bytedance.ies.web.a.a r12) {
        /*
        // Method dump skipped, instructions count: 498
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ShareServiceImpl.a(android.app.Activity, com.ss.android.ugc.aweme.feed.model.LiveEvent, com.ss.android.ugc.aweme.sharer.ui.f, com.bytedance.ies.web.a.a):void");
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final boolean a(String str, String str2, Context context) {
        l.d(str, "");
        l.d(str2, "");
        l.d(context, "");
        com.ss.android.ugc.aweme.sharer.b a2 = a.C3201a.a(str);
        if (a2 != null) {
            return a2.a((h) new m(str2), context);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final boolean a() {
        return com.bytedance.ies.abmock.b.a().a(false, "download_video_with_mute", false);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", com.ss.android.ugc.aweme.share.d.c.f123454f);
        Aweme aweme = com.ss.android.ugc.aweme.share.d.c.f123453e;
        r.a("download_cancel", a2.a("group_id", aweme != null ? aweme.getAid() : null).a("is_downloading", com.ss.android.ugc.aweme.share.d.c.b() ? 1 : 0).f66730a);
        com.ss.android.ugc.trill.share.base.b.z = true;
        com.ss.android.ugc.aweme.share.d.c.f123451c = true;
        if (com.ss.android.ugc.aweme.share.d.c.f123449a) {
            l.d(context, "");
            Downloader.getInstance(context).cancel(com.ss.android.ugc.aweme.video.local.a.f143446c);
            com.ss.android.ugc.aweme.share.d.c.f123449a = false;
            RuntimeBehaviorServiceImpl.c().a("download_cancel");
        } else if (com.ss.android.ugc.aweme.share.d.c.f123450b) {
            IWaterMarkService b2 = com.ss.android.ugc.aweme.share.d.b.f123446d.b();
            if (b2 != null) {
                b2.cancelWaterMark();
            }
            com.ss.android.ugc.aweme.share.d.c.f123450b = false;
            RuntimeBehaviorServiceImpl.c().a("water_mark_cancel");
        }
        com.ss.android.ugc.aweme.video.e.c(com.ss.android.ugc.aweme.share.d.b.f123444b);
        com.ss.android.ugc.aweme.video.e.c(com.ss.android.ugc.aweme.share.d.b.f123445c);
        ShareDependService.a.a().a(false);
        com.ss.android.ugc.aweme.feed.share.a.a.b bVar = com.ss.android.ugc.aweme.share.d.b.f123443a;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final void a(e.b bVar, Activity activity, boolean z) {
        l.d(bVar, "");
        com.ss.android.ugc.aweme.share.improve.e.b.a(bVar, z, activity, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r5 != null) goto L_0x0027;
     */
    @Override // com.ss.android.ugc.aweme.share.ShareService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.aweme.shortvideo.c r5, java.lang.String r6) {
        /*
            r4 = this;
            r3 = 1
            r0 = 0
            if (r5 == 0) goto L_0x003c
            if (r6 == 0) goto L_0x003c
            java.util.List<java.lang.String> r0 = com.ss.android.ugc.aweme.share.v.f124392a
            if (r0 == 0) goto L_0x003c
            boolean r0 = r5.isMuteShare()
            if (r0 == 0) goto L_0x003c
            java.util.List<java.lang.String> r2 = com.ss.android.ugc.aweme.share.v.f124392a
            if (r2 != 0) goto L_0x0017
            h.f.b.l.b()
        L_0x0017:
            java.lang.String r1 = r6.toLowerCase()
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x003c
            r1 = 1
        L_0x0027:
            boolean r0 = r5.isPreventDownload()
            if (r0 == 0) goto L_0x0040
            boolean r0 = com.ss.android.ugc.aweme.language.d.i()
            if (r0 == 0) goto L_0x0040
            com.ss.android.ugc.aweme.share.ShareService r0 = com.ss.android.ugc.aweme.share.ah.f123352a
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0040
        L_0x003b:
            return r3
        L_0x003c:
            r1 = 0
            if (r5 == 0) goto L_0x0040
            goto L_0x0027
        L_0x0040:
            r3 = r1
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ShareServiceImpl.a(com.ss.android.ugc.aweme.shortvideo.c, java.lang.String):boolean");
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final boolean a(Aweme aweme) {
        ACLCommonShare downloadGeneral;
        ACLCommonShare downloadMaskPanel;
        if (aweme == null) {
            return false;
        }
        if (l.a((Object) c.f123414a, (Object) "long_press_download")) {
            AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
            if (awemeACLShareInfo == null || (downloadMaskPanel = awemeACLShareInfo.getDownloadMaskPanel()) == null || !downloadMaskPanel.getMute()) {
                return false;
            }
            return true;
        }
        AwemeACLShare awemeACLShareInfo2 = aweme.getAwemeACLShareInfo();
        if (awemeACLShareInfo2 == null || (downloadGeneral = awemeACLShareInfo2.getDownloadGeneral()) == null || !downloadGeneral.getMute()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final bg b() {
        return new com.ss.android.ugc.aweme.share.silent.h();
    }

    public static ShareService d() {
        MethodCollector.i(10865);
        Object a2 = com.ss.android.ugc.b.a(ShareService.class, false);
        if (a2 != null) {
            ShareService shareService = (ShareService) a2;
            MethodCollector.o(10865);
            return shareService;
        }
        if (com.ss.android.ugc.b.dX == null) {
            synchronized (ShareService.class) {
                try {
                    if (com.ss.android.ugc.b.dX == null) {
                        com.ss.android.ugc.b.dX = new ShareServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10865);
                    throw th;
                }
            }
        }
        ShareServiceImpl shareServiceImpl = (ShareServiceImpl) com.ss.android.ugc.b.dX;
        MethodCollector.o(10865);
        return shareServiceImpl;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f123259a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.feed.ui.bg f123260b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f123261c;

        static {
            Covode.recordClassIndex(80972);
        }

        b(Activity activity, com.ss.android.ugc.aweme.feed.ui.bg bgVar, Aweme aweme) {
            this.f123259a = activity;
            this.f123260b = bgVar;
            this.f123261c = aweme;
        }

        public final void run() {
            Aweme aweme;
            View view;
            if (!this.f123259a.isFinishing() && (aweme = this.f123261c) != null && aweme.getAuthor() != null && aweme.getVideo() != null) {
                this.f123260b.f94349f = this.f123259a;
                this.f123260b.c();
                com.ss.android.ugc.aweme.feed.ui.bg bgVar = this.f123260b;
                bgVar.f94352i = AwemeService.b().a(this.f123261c);
                com.ss.android.ugc.aweme.base.e.a(bgVar.f94351h, bgVar.f94352i.getVideo().getCover(), (int) n.b(bgVar.f94349f, 49.0f), (int) n.b(bgVar.f94349f, 59.0f));
                if (bgVar.f94352i != null && bgVar.f94352i.isPrivate() && (view = bgVar.f94348e) != null) {
                    TextView textView = (TextView) view.findViewById(R.id.f_5);
                    TextView textView2 = (TextView) view.findViewById(R.id.eyb);
                    User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
                    if (textView != null && textView2 != null && currentUser != null) {
                        Context context = textView.getContext();
                        if (com.ss.android.ugc.aweme.profile.experiment.l.f116366a) {
                            textView.setText(context.getString(R.string.evy));
                            textView2.setText(context.getString(R.string.evx));
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final void b(Activity activity) {
        l.d(activity, "");
        l.d(activity, "");
        Intent intent = new Intent(activity, UserQRCodeActivity.class);
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final ShareChannelBar a(Activity activity) {
        MethodCollector.i(10705);
        l.d(activity, "");
        l.d(activity, "");
        View inflate = activity.getLayoutInflater().inflate(R.layout.azf, (ViewGroup) null);
        if (inflate != null) {
            ShareChannelBar shareChannelBar = (ShareChannelBar) inflate;
            MethodCollector.o(10705);
            return shareChannelBar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar");
        MethodCollector.o(10705);
        throw nullPointerException;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final void a(Context context, boolean z) {
        if (context != null) {
            b.i.b(new com.ss.android.ugc.aweme.livewallpaper.f.g(context, z), b.i.f4824a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0150  */
    @Override // com.ss.android.ugc.aweme.share.ShareService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.share.c.b a(android.app.Activity r16, com.ss.android.ugc.aweme.feed.model.Aweme r17) {
        /*
        // Method dump skipped, instructions count: 373
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ShareServiceImpl.a(android.app.Activity, com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.share.c.b");
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final SharePackage c(Activity activity, com.bytedance.android.livesdkapi.depend.e.c cVar, com.bytedance.android.livesdkapi.depend.e.b bVar) {
        l.d(activity, "");
        l.d(cVar, "");
        l.d(bVar, "");
        return LiveSharePackage.a.a(cVar, activity);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final com.ss.android.ugc.aweme.share.c.b a(Activity activity, Aweme aweme, int i2) {
        l.d(activity, "");
        l.d(aweme, "");
        com.ss.android.ugc.aweme.feed.ui.bg bgVar = new com.ss.android.ugc.aweme.feed.ui.bg();
        if (i2 > 0) {
            bgVar.f94344a = i2;
        }
        com.ss.android.b.a.a.a.a(new b(activity, bgVar, aweme), 150);
        return bgVar;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final o a(User user, Activity activity, com.ss.android.ugc.aweme.profile.e eVar) {
        String str;
        int i2;
        MethodCollector.i(11628);
        l.d(activity, "");
        l.d(eVar, "");
        l.d(activity, "");
        l.d(eVar, "");
        if (user == null || user.getShareInfo() == null) {
            MethodCollector.o(11628);
            return null;
        }
        UserSharePackage a2 = UserSharePackage.a.a(user, activity, null);
        if (in.g(user)) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        a2.f124595i.putString("enter_from", str);
        a2.f124595i.putString("enter_method", "button");
        e.b bVar = new e.b();
        if (!ShareDependService.a.a().c()) {
            com.ss.android.ugc.aweme.share.m.i.a(bVar, ShareDependService.b.a(ShareDependService.a.a(), a2, str, 4));
        }
        ah.f123352a.a((ShareService) bVar, (e.b) activity, (Activity) true);
        bVar.f124671j = R.string.fuc;
        bVar.o = false;
        LayoutInflater from = LayoutInflater.from(activity);
        if (com.ss.android.ugc.c.a.f145540a && in.g(user)) {
            i2 = R.layout.azv;
        } else if (UserSharePackage.a.a(user)) {
            i2 = R.layout.azu;
        } else {
            i2 = R.layout.azx;
        }
        bVar.p = from.inflate(i2, (ViewGroup) null);
        if (com.ss.android.ugc.aweme.account.b.g().isMe(user.getUid()) || !user.isSecret()) {
            bVar.a(new com.ss.android.ugc.aweme.share.improve.b.b());
            r.a("share_person_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "click_head").a("enter_from", str).a("author_id", user.getUid()).f66730a);
        } else {
            bVar.f124665d = true;
        }
        bVar.a(a2);
        bVar.a(new UserSharePackage.a.b(a2, str, activity, user));
        com.ss.android.ugc.a aVar = new com.ss.android.ugc.a(user, activity, eVar, bVar.a(), (byte) 0);
        MethodCollector.o(11628);
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final Dialog b(Activity activity, com.bytedance.android.livesdkapi.depend.e.c cVar, com.bytedance.android.livesdkapi.depend.e.b bVar) {
        AwemeRawAd awemeRawAd;
        l.d(activity, "");
        l.d(cVar, "");
        l.d(bVar, "");
        LiveSharePackage a2 = LiveSharePackage.a.a(cVar, activity);
        l.d(activity, "");
        l.d(cVar, "");
        ArrayList arrayList = new ArrayList();
        if (cVar.I) {
            if (cVar.O) {
                arrayList.add(new j(new com.ss.android.ugc.aweme.share.improve.pkg.l(activity, cVar), 10));
            } else {
                arrayList.add(new j(new com.ss.android.ugc.aweme.share.improve.pkg.h(activity, cVar), 10));
            }
        }
        if (cVar.J) {
            if (cVar.O) {
                arrayList.add(new j(new com.ss.android.ugc.aweme.share.improve.pkg.c(cVar), 15));
            } else {
                arrayList.add(new j(new com.ss.android.ugc.aweme.share.improve.pkg.g(cVar), 15));
            }
        }
        Aweme b2 = AwemeService.b().b(cVar.M);
        if (!(b2 == null || !b2.isAd() || b2.getAwemeRawAd() == null || (awemeRawAd = b2.getAwemeRawAd()) == null || !awemeRawAd.isShowDisplayWhyThisAd())) {
            arrayList.add(new j(new com.ss.android.ugc.aweme.share.improve.pkg.f(cVar), 21));
        }
        e a3 = LiveSharePackage.a.a(activity, cVar, arrayList, bVar, a2);
        s.a.C3238a aVar = new s.a.C3238a(a3.f124658j, a3.f124661m, a3.f124650b, LiveSharePackage.a.a(activity, cVar));
        l.d(activity, "");
        l.d(a2, "");
        l.d(aVar, "");
        return new s(activity, aVar, new com.ss.android.ugc.aweme.feed.ui.masklayer2.h(a2, aVar));
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final Dialog a(Activity activity, com.bytedance.android.livesdkapi.depend.e.c cVar, com.bytedance.android.livesdkapi.depend.e.b bVar) {
        boolean z;
        l.d(activity, "");
        l.d(cVar, "");
        l.d(bVar, "");
        l.d(activity, "");
        l.d(cVar, "");
        l.d(bVar, "");
        LiveSharePackage a2 = LiveSharePackage.a.a(cVar, activity);
        ArrayList arrayList = new ArrayList();
        if (cVar.f22967c != -1) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            l.b(createIUserServicebyMonsterPlugin, "");
            if (!l.a((Object) createIUserServicebyMonsterPlugin.getCurrentUserID(), (Object) String.valueOf(cVar.f22968d))) {
                if (TextUtils.equals(cVar.z, "live_links")) {
                    arrayList.add(new j(new com.ss.android.ugc.aweme.share.improve.pkg.e(activity, cVar), 10));
                } else if (cVar.O) {
                    arrayList.add(new j(new com.ss.android.ugc.aweme.share.improve.pkg.l(activity, cVar), 10));
                } else {
                    arrayList.add(new j(new k(activity, cVar), 10));
                }
            }
            arrayList.add(new j(new com.ss.android.ugc.aweme.share.improve.pkg.d(activity, cVar), 20));
            com.bytedance.android.livesdkapi.service.d a3 = com.bytedance.android.livesdkapi.f.a();
            if (a3 != null && a3.v()) {
                arrayList.add(new j(new com.ss.android.ugc.aweme.share.improve.pkg.m(activity, cVar), 30));
            }
            if (cVar.r) {
                arrayList.add(new j(new com.ss.android.ugc.aweme.share.improve.pkg.i(cVar), 40));
            }
            com.bytedance.android.livesdkapi.service.d a4 = com.bytedance.android.livesdkapi.f.a();
            if (a4 != null) {
                z = a4.w();
            } else {
                z = false;
            }
            com.bytedance.android.livesdkapi.service.d a5 = com.bytedance.android.livesdkapi.f.a();
            if (a5 != null && a5.a(cVar.z, cVar.A) && z) {
                if (cVar.O) {
                    arrayList.add(new j(new com.ss.android.ugc.aweme.share.improve.pkg.c(cVar), 15));
                } else {
                    arrayList.add(new j(new com.ss.android.ugc.aweme.share.improve.pkg.b(cVar), 15));
                }
            }
        }
        return ShareDependService.a.a().a(activity, LiveSharePackage.a.a(activity, cVar, arrayList, bVar, a2), R.style.wp);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final SharePackage a(Context context, Aweme aweme, String str, String str2) {
        l.d(context, "");
        l.d(aweme, "");
        if (str == null) {
            str = "";
        }
        return AwemeSharePackage.a.a(aweme, context, 0, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareService
    public final Dialog b(Activity activity, Fragment fragment, Aweme aweme, com.ss.android.ugc.aweme.feed.i.s<ag> sVar, Bundle bundle) {
        l.d(activity, "");
        l.d(fragment, "");
        l.d(aweme, "");
        l.d(sVar, "");
        l.d(bundle, "");
        return new com.ss.android.ugc.aweme.share.business.a(activity, fragment, aweme, sVar, bundle).a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0349, code lost:
        if (r2.getPrivateStatus() == 1) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0551, code lost:
        if (com.ss.android.ugc.aweme.utils.in.a(r6.getAuthorUid()) == false) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0282, code lost:
        if (r0.o.isFinishing() == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x032e, code lost:
        if (((com.bytedance.ies.uikit.a.b) r2).ab_() != false) goto L_0x0284;
     */
    @Override // com.ss.android.ugc.aweme.share.ShareService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog a(android.app.Activity r24, androidx.fragment.app.Fragment r25, com.ss.android.ugc.aweme.feed.model.Aweme r26, boolean r27, com.ss.android.ugc.aweme.feed.i.s<com.ss.android.ugc.aweme.feed.i.ag> r28, android.os.Bundle r29) {
        /*
        // Method dump skipped, instructions count: 1484
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ShareServiceImpl.a(android.app.Activity, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, com.ss.android.ugc.aweme.feed.i.s, android.os.Bundle):android.app.Dialog");
    }
}
