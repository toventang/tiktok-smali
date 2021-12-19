package com.ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.d.e;
import com.ss.android.ugc.aweme.share.improve.d.h;
import com.ss.android.ugc.aweme.share.improve.d.j;
import com.ss.android.ugc.aweme.share.improve.d.m;
import com.ss.android.ugc.aweme.sharer.k;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.story.b.h;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.d.g;
import f.a.o;
import f.a.q;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class AwemeSharePackage extends KtfDefaultSharePackage {

    /* renamed from: b */
    public static final a f123929b = new a((byte) 0);

    /* renamed from: a */
    public Aweme f123930a;

    static {
        Covode.recordClassIndex(81366);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81367);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static AwemeSharePackage a(Aweme aweme, Context context, int i2, String str, String str2) {
            String str3;
            boolean z;
            String str4;
            UrlModel cover;
            List<String> urlList;
            List<String> list;
            String str5;
            String str6;
            String str7;
            int i3;
            UrlModel urlModel;
            String str8;
            String str9;
            String str10;
            boolean z2;
            String str11;
            String socialInfo;
            AwemeStatus status;
            UrlModel downloadAddr;
            UrlModel originCover;
            List<String> urlList2;
            l.d(aweme, "");
            l.d(context, "");
            l.d(str, "");
            l.d(str2, "");
            aweme.setShareInfo(com.ss.android.ugc.aweme.share.improve.c.c.a(aweme.getShareInfo()));
            SharePackage.a a2 = new SharePackage.a().a("aweme");
            User author = aweme.getAuthor();
            UrlModel urlModel2 = null;
            if (author == null || (str3 = author.getUid()) == null) {
                str3 = "";
            }
            SharePackage.a b2 = a2.b(str3);
            String string = context.getString(R.string.uh);
            l.b(string, "");
            SharePackage.a a3 = b2.a("app_name", string);
            ShareInfo shareInfo = aweme.getShareInfo();
            l.b(shareInfo, "");
            String shareTitle = shareInfo.getShareTitle();
            if (shareTitle == null) {
                shareTitle = "";
            }
            SharePackage.a c2 = a3.c(shareTitle);
            ShareInfo shareInfo2 = aweme.getShareInfo();
            l.b(shareInfo2, "");
            String shareDesc = shareInfo2.getShareDesc();
            if (shareDesc == null) {
                shareDesc = "";
            }
            SharePackage.a d2 = c2.d(shareDesc);
            ShareInfo shareInfo3 = aweme.getShareInfo();
            l.b(shareInfo3, "");
            String shareUrl = shareInfo3.getShareUrl();
            if (shareUrl == null) {
                shareUrl = aweme.getShareUrl();
            }
            String c3 = com.ss.android.ugc.aweme.share.improve.c.b.c(com.ss.android.ugc.aweme.share.improve.c.b.b(shareUrl));
            if (c3 == null) {
                c3 = "";
            }
            AwemeSharePackage awemeSharePackage = new AwemeSharePackage(d2.e(c3));
            awemeSharePackage.a(aweme);
            Bundle bundle = awemeSharePackage.f124595i;
            bundle.putString("aid", aweme.getAid());
            bundle.putInt("has_ad", aweme.getHasAd());
            bundle.putString("is_from_trending_card", aweme.isFromTrendingCard());
            bundle.putString("trending_event_name", aweme.getTrendingName());
            bundle.putString("trending_event_id", aweme.getTrendingId());
            ShareInfo shareInfo4 = aweme.getShareInfo();
            l.b(shareInfo4, "");
            if (shareInfo4.getBoolPersist() == 1) {
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean("bool_persist", z);
            bundle.putInt("page_type", i2);
            bundle.putString("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.a(aweme, i2)));
            bundle.putString("enter_from", str);
            bundle.putString("enter_method", "icon");
            Video video = aweme.getVideo();
            if (video == null || (originCover = video.getOriginCover()) == null || (urlList2 = originCover.getUrlList()) == null) {
                str4 = null;
            } else {
                str4 = (String) n.h((List) urlList2);
            }
            if (!hl.a(str4)) {
                Video video2 = aweme.getVideo();
                if (video2 == null || (cover = video2.getCover()) == null || (urlList = cover.getUrlList()) == null) {
                    str4 = null;
                } else {
                    str4 = (String) n.h((List) urlList);
                }
            }
            bundle.putString("thumb_url", str4);
            Video video3 = aweme.getVideo();
            if (video3 == null || (downloadAddr = video3.getDownloadAddr()) == null || (list = downloadAddr.getUrlList()) == null) {
                list = z.INSTANCE;
            }
            bundle.putStringArrayList("video_play_list", new ArrayList<>(list));
            User author2 = aweme.getAuthor();
            if (author2 == null || (str5 = author2.getUid()) == null) {
                str5 = "";
            }
            bundle.putString("uid_for_share", str5);
            User author3 = aweme.getAuthor();
            if (author3 == null || (str6 = author3.getSecUid()) == null) {
                str6 = "";
            }
            bundle.putString("sec_user_id", str6);
            User author4 = aweme.getAuthor();
            if (author4 == null || (str7 = author4.getUid()) == null) {
                str7 = "";
            }
            bundle.putString("author_id", str7);
            bundle.putString("city_info", "");
            bundle.putString("distance_info", "");
            bundle.putString("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.b(aweme)));
            AwemeStatus status2 = aweme.getStatus();
            if ((status2 == null || status2.getPrivateStatus() != 1) && ((status = aweme.getStatus()) == null || !status.isDelete())) {
                i3 = 0;
            } else {
                i3 = -1;
            }
            bundle.putInt("item_id", i3);
            AwemeStatus status3 = aweme.getStatus();
            if (status3 == null) {
                bundle.putString("item_id_string", aweme.getAid());
            } else if (status3.isDelete()) {
                bundle.putString("item_id_string", "delete");
            } else if (status3.getPrivateStatus() == 1) {
                bundle.putString("item_id_string", "private");
            } else {
                bundle.putString("item_id_string", aweme.getAid());
            }
            Video video4 = aweme.getVideo();
            if (video4 != null) {
                urlModel = video4.getCover();
            } else {
                urlModel = null;
            }
            bundle.putSerializable("video_cover", urlModel);
            User author5 = aweme.getAuthor();
            if (author5 == null || (str8 = author5.getNickname()) == null) {
                str8 = "";
            }
            bundle.putString("add_utm_params", str8);
            User author6 = aweme.getAuthor();
            if (author6 != null) {
                urlModel2 = author6.getAvatarThumb();
            }
            bundle.putSerializable("thumb_for_share", urlModel2);
            bundle.putInt("aweme_type", aweme.getAwemeType());
            bundle.putString("story_collection_id", com.ss.android.ugc.aweme.story.d.a.b(aweme));
            bundle.putInt("follow_status", h.a(aweme.getAuthor()));
            User author7 = aweme.getAuthor();
            if (author7 == null || (str9 = author7.getNickname()) == null) {
                str9 = "";
            }
            bundle.putString("author_name", str9);
            User author8 = aweme.getAuthor();
            if (author8 == null || (str10 = author8.getUniqueId()) == null) {
                str10 = "";
            }
            bundle.putString("author_username", str10);
            User author9 = aweme.getAuthor();
            if (author9 != null) {
                z2 = author9.isAdFake();
            } else {
                z2 = false;
            }
            bundle.putBoolean("is_ad_fake", z2);
            if (aweme.isImage()) {
                List<ImageInfo> imageInfos = aweme.getImageInfos();
                if (imageInfos == null || imageInfos.isEmpty()) {
                    bundle.putInt("aweme_width", 124);
                    bundle.putInt("aweme_height", 165);
                } else {
                    ImageInfo imageInfo = (ImageInfo) n.g((List) imageInfos);
                    l.b(imageInfo, "");
                    bundle.putInt("aweme_width", imageInfo.getWidth());
                    bundle.putInt("aweme_height", imageInfo.getHeight());
                    bundle.putSerializable("video_cover", imageInfo.getLabelLarge());
                }
            } else {
                Video video5 = aweme.getVideo();
                if (video5 == null) {
                    bundle.putInt("aweme_width", 124);
                    bundle.putInt("aweme_height", 165);
                } else {
                    bundle.putInt("aweme_width", video5.getWidth());
                    bundle.putInt("aweme_height", video5.getHeight());
                    bundle.putSerializable("video_cover", video5.getOriginCover());
                }
            }
            bundle.putBoolean("is_fullscreen", i.f79764a);
            bundle.putString("request_id", com.ss.android.ugc.aweme.metrics.ac.b(awemeSharePackage.a()));
            Video video6 = aweme.getVideo();
            if (!(video6 == null || video6.getPlayAddr() == null)) {
                Video video7 = aweme.getVideo();
                l.b(video7, "");
                VideoUrlModel playAddr = video7.getPlayAddr();
                l.b(playAddr, "");
                String uri = playAddr.getUri();
                l.b(uri, "");
                List c4 = p.c(uri, new String[]{"_"});
                if (!c4.isEmpty()) {
                    bundle.putString("aweme_vid", (String) n.g(c4));
                }
            }
            if (aweme.getVideo() != null) {
                Video video8 = aweme.getVideo();
                l.b(video8, "");
                bundle.putInt("aweme_width", video8.getWidth());
                Video video9 = aweme.getVideo();
                l.b(video9, "");
                bundle.putInt("aweme_height", video9.getHeight());
                Video video10 = aweme.getVideo();
                l.b(video10, "");
                bundle.putInt("aweme_duration", video10.getDuration());
                Video video11 = aweme.getVideo();
                l.b(video11, "");
                bundle.putInt("aweme_length", video11.getVideoLength());
            }
            bundle.putString("desc", aweme.getDesc());
            User author10 = aweme.getAuthor();
            if (author10 == null || !author10.isStar()) {
                str11 = "0";
            } else {
                str11 = "1";
            }
            bundle.putString("is_star", str11);
            bundle.putInt("is_long_item", 0);
            bundle.putBoolean("is_highlighted", aweme.isHighlighted());
            bundle.putInt("rank_index", aweme.getOriginalPos());
            User author11 = aweme.getAuthor();
            if (!(author11 == null || (socialInfo = author11.getSocialInfo()) == null)) {
                bundle.putString("social_info", socialInfo);
            }
            if (com.ss.android.ugc.aweme.story.d.a.d(aweme)) {
                Story story = aweme.getStory();
                if (story != null) {
                    bundle.putLong("expired_at", story.getExpiredAt());
                }
                bundle.putInt("source_type", 2);
            }
            InteractPermission interactPermission = aweme.getInteractPermission();
            if (interactPermission != null) {
                bundle.putInt("upvote_permission", interactPermission.getUpvote());
            }
            return awemeSharePackage;
        }

        public static /* synthetic */ AwemeSharePackage a(Aweme aweme, Context context, int i2, String str, String str2, int i3) {
            if ((i3 & 4) != 0) {
                i2 = 0;
            }
            if ((i3 & 8) != 0) {
                str = "";
            }
            if ((i3 & 16) != 0) {
                str2 = "";
            }
            return a(aweme, context, i2, str, str2);
        }
    }

    public final Aweme a() {
        Aweme aweme = this.f123930a;
        if (aweme == null) {
            l.a("aweme");
        }
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.KtfDefaultSharePackage
    public final Aweme b() {
        Aweme aweme = this.f123930a;
        if (aweme == null) {
            l.a("aweme");
        }
        return aweme;
    }

    public final void a(Aweme aweme) {
        l.d(aweme, "");
        this.f123930a = aweme;
    }

    static final class c<T> implements f {

        /* renamed from: a */
        final /* synthetic */ h.f.a.b f123937a;

        static {
            Covode.recordClassIndex(81371);
        }

        c(h.f.a.b bVar) {
            this.f123937a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h.f.a.b bVar = this.f123937a;
            l.b(obj, "");
            bVar.invoke(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AwemeSharePackage(SharePackage.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    /* access modifiers changed from: package-private */
    public static final class b<T, R> implements g {

        /* renamed from: a */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f123931a;

        /* renamed from: b */
        final /* synthetic */ String f123932b;

        static {
            Covode.recordClassIndex(81368);
        }

        b(com.ss.android.ugc.aweme.sharer.b bVar, String str) {
            this.f123931a = bVar;
            this.f123932b = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            l.d(str, "");
            String a2 = this.f123931a.a();
            if (a2.hashCode() == 96619420 && a2.equals("email")) {
                return f.a.n.a((q) new q(this) {
                    /* class com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.b.AnonymousClass1 */

                    /* renamed from: a */
                    final /* synthetic */ b f123933a;

                    static {
                        Covode.recordClassIndex(81369);
                    }

                    {
                        this.f123933a = r1;
                    }

                    @Override // f.a.q
                    public final void a(o<com.ss.android.ugc.aweme.sharer.h> oVar) {
                        l.d(oVar, "");
                        String str = str;
                        l.b(str, "");
                        oVar.a(new k(str, d.a().getString(R.string.f7o), this.f123933a.f123932b));
                    }
                });
            }
            return f.a.n.a((q) new q(this) {
                /* class com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.b.AnonymousClass2 */

                /* renamed from: a */
                final /* synthetic */ b f123935a;

                static {
                    Covode.recordClassIndex(81370);
                }

                {
                    this.f123935a = r1;
                }

                @Override // f.a.q
                public final void a(o<com.ss.android.ugc.aweme.sharer.h> oVar) {
                    l.d(oVar, "");
                    String str = str;
                    l.b(str, "");
                    oVar.a(new k(str, this.f123935a.f123932b, null, 4));
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final void a(com.ss.android.ugc.aweme.sharer.b bVar, h.f.a.b<? super com.ss.android.ugc.aweme.sharer.h, h.z> bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        String a2 = com.ss.android.ugc.aweme.share.m.h.f124087a.a(bVar, this.f124590d, this.f124593g);
        if (com.ss.android.ugc.aweme.sharer.ui.a.a.a()) {
            com.ss.android.ugc.aweme.share.improve.c.c.b(this.f124594h, this.f124590d, bVar).a(new b(bVar, a2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).e(new c(bVar2));
            return;
        }
        String a3 = com.ss.android.ugc.aweme.share.improve.c.c.a(this.f124594h, this.f124590d, bVar);
        String a4 = bVar.a();
        if (a4.hashCode() == 96619420 && a4.equals("email")) {
            bVar2.invoke(new k(a3, d.a().getString(R.string.f7o), a2));
        } else {
            bVar2.invoke(new k(a3, a2, null, 4));
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final boolean a(com.ss.android.ugc.aweme.sharer.ui.h hVar, Context context) {
        File file;
        l.d(hVar, "");
        l.d(context, "");
        if (l.a((Object) hVar.c(), (Object) "download")) {
            Context a2 = d.a();
            if (!TextUtils.isEmpty(null)) {
                file = a2.getExternalFilesDir(null);
            } else {
                if (com.ss.android.ugc.aweme.lancet.d.f107196d == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                    com.ss.android.ugc.aweme.lancet.d.f107196d = a2.getExternalFilesDir(null);
                }
                file = com.ss.android.ugc.aweme.lancet.d.f107196d;
            }
            if (file != null || com.ss.android.ugc.aweme.share.improve.c.b.b(context)) {
                return false;
            }
            com.ss.android.ugc.aweme.share.improve.c.c.a(context);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage, com.ss.android.ugc.aweme.share.improve.pkg.KtfDefaultSharePackage
    public final void a(Context context, com.ss.android.ugc.aweme.sharer.b bVar, h.f.a.a<h.z> aVar) {
        l.d(context, "");
        Aweme aweme = this.f123930a;
        if (aweme == null) {
            l.a("aweme");
        }
        AwemeStatus status = aweme.getStatus();
        l.b(status, "");
        if (status.isInReviewing()) {
            Aweme aweme2 = this.f123930a;
            if (aweme2 == null) {
                l.a("aweme");
            }
            AwemeStatus status2 = aweme2.getStatus();
            l.b(status2, "");
            if (status2.isSelfSee()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.gj9).a();
                return;
            }
        }
        super.a(context, bVar, aVar);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.ugc.aweme.sharer.ui.SharePackage
    public final boolean a(com.ss.android.ugc.aweme.sharer.b bVar, Context context, h.f.a.b<? super Boolean, h.z> bVar2) {
        com.ss.android.ugc.aweme.share.improve.d.o lVar;
        l.d(bVar, "");
        l.d(context, "");
        l.d(bVar2, "");
        ShareDependService.a.a().a(bVar);
        if (this.f123930a == null) {
            return false;
        }
        if (l.a((Object) bVar.a(), (Object) "chat_merge") || (bVar instanceof com.ss.android.ugc.aweme.share.improve.b.f)) {
            ShareExtService shareExtService = ah.f123353b;
            Aweme aweme = this.f123930a;
            if (aweme == null) {
                l.a("aweme");
            }
            if (!shareExtService.a(aweme, context)) {
                bVar2.invoke(true);
                return true;
            }
        }
        if (!(!l.a((Object) bVar.a(), (Object) "chat_merge")) || (bVar instanceof com.ss.android.ugc.aweme.share.improve.b.f)) {
            if (bVar instanceof com.ss.android.ugc.aweme.share.improve.f.b) {
                this.f124595i.putString("share_form", "url_form");
            }
            return false;
        }
        if (h.a.a(bVar.a())) {
            Aweme aweme2 = this.f123930a;
            if (aweme2 == null) {
                l.a("aweme");
            }
            ACLCommonShare b2 = h.a.b(aweme2, bVar.a());
            if (b2 != null) {
                r.a("share_video_acl", new com.ss.android.ugc.aweme.app.f.d().a("code", b2.getCode()).a("show_type", b2.getShowType()).a("toast_msg", b2.getToastMsg()).a("extra", b2.getExtra()).a("transcode", b2.getTranscode()).a("mute", Boolean.valueOf(b2.getMute())).a("popup_msg", b2.getPopupMsg()).f66730a);
            }
        }
        l.d(bVar, "");
        String a2 = bVar.a();
        switch (a2.hashCode()) {
            case -1837180097:
                if (a2.equals("whatsapp_status")) {
                    lVar = new com.ss.android.ugc.aweme.share.improve.d.l(bVar);
                    break;
                }
                lVar = new com.ss.android.ugc.aweme.share.improve.d.k();
                break;
            case -1436108013:
                if (a2.equals("messenger")) {
                    lVar = new com.ss.android.ugc.aweme.share.improve.d.g(bVar);
                    break;
                }
                lVar = new com.ss.android.ugc.aweme.share.improve.d.k();
                break;
            case -816556504:
                if (a2.equals("instagram_story")) {
                    lVar = new e(bVar);
                    break;
                }
                lVar = new com.ss.android.ugc.aweme.share.improve.d.k();
                break;
            case 114009:
                if (a2.equals("sms")) {
                    lVar = new com.ss.android.ugc.aweme.share.improve.d.i(bVar);
                    break;
                }
                lVar = new com.ss.android.ugc.aweme.share.improve.d.k();
                break;
            case 3731178:
                if (a2.equals("zalo")) {
                    lVar = new com.ss.android.ugc.aweme.share.improve.d.n(bVar);
                    break;
                }
                lVar = new com.ss.android.ugc.aweme.share.improve.d.k();
                break;
            case 28903346:
                if (a2.equals("instagram")) {
                    lVar = new com.ss.android.ugc.aweme.share.improve.d.d(bVar);
                    break;
                }
                lVar = new com.ss.android.ugc.aweme.share.improve.d.k();
                break;
            case 96619420:
                if (a2.equals("email")) {
                    lVar = new com.ss.android.ugc.aweme.share.improve.d.a(bVar);
                    break;
                }
                lVar = new com.ss.android.ugc.aweme.share.improve.d.k();
                break;
            case 284397090:
                if (a2.equals("snapchat")) {
                    lVar = new j(bVar);
                    break;
                }
                lVar = new com.ss.android.ugc.aweme.share.improve.d.k();
                break;
            case 486515695:
                if (a2.equals("kakaotalk")) {
                    lVar = new com.ss.android.ugc.aweme.share.improve.d.f(bVar);
                    break;
                }
                lVar = new com.ss.android.ugc.aweme.share.improve.d.k();
                break;
            case 497130182:
                if (a2.equals("facebook")) {
                    lVar = new com.ss.android.ugc.aweme.share.improve.d.c(bVar);
                    break;
                }
                lVar = new com.ss.android.ugc.aweme.share.improve.d.k();
                break;
            case 1620810375:
                if (a2.equals("facebook_lite")) {
                    lVar = new com.ss.android.ugc.aweme.share.improve.d.b(bVar);
                    break;
                }
                lVar = new com.ss.android.ugc.aweme.share.improve.d.k();
                break;
            case 1934780818:
                if (a2.equals("whatsapp")) {
                    lVar = new m(bVar);
                    break;
                }
                lVar = new com.ss.android.ugc.aweme.share.improve.d.k();
                break;
            default:
                lVar = new com.ss.android.ugc.aweme.share.improve.d.k();
                break;
        }
        return lVar.a(context, this, bVar2);
    }
}
