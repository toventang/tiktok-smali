package com.bytedance.android.live.base.model.user;

import com.appsflyer.BuildConfig;
import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.android.livesdk.model.bd;
import com.bytedance.android.livesdk.model.be;
import com.bytedance.android.livesdk.model.bf;
import com.bytedance.android.livesdk.model.bg;
import com.bytedance.android.livesdk.model.bh;
import com.bytedance.android.livesdk.model.bk;
import com.bytedance.android.livesdk.model.bo;
import com.bytedance.android.livesdk.model.cn;
import com.bytedance.android.livesdk.model.co;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

public final class j implements b<User> {
    static {
        Covode.recordClassIndex(3642);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ User a(f fVar) {
        return b(fVar);
    }

    public static User b(f fVar) {
        User user = new User();
        user.topFans = new ArrayList();
        user.userBadges = new ArrayList();
        user.commerceWebcastConfigIds = new ArrayList();
        user.borders = new ArrayList();
        user.badgeImageList = new ArrayList();
        user.mediaBadgeImageList = new ArrayList();
        user.newUserBadges = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return user;
            } else if (b2 == 1) {
                user.id = g.b(fVar);
            } else if (b2 != 3) {
                if (b2 != 5) {
                    if (b2 == 52) {
                        user.personalCard = com.bytedance.android.live.base.model.f.b(fVar);
                    } else if (b2 == 53) {
                        user.authenticationInfo = bg.b(fVar);
                    } else if (b2 == 1012) {
                        user.avatarJpg = com.bytedance.android.live.base.model.f.b(fVar);
                    } else if (b2 == 1013) {
                        user.backgroundImgUrl = fVar.d();
                    } else if (b2 == 1023) {
                        user.foldStrangerChat = Boolean.valueOf(g.a(fVar));
                    } else if (b2 != 1024) {
                        switch (b2) {
                            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                break;
                            case 21:
                                user.badgeImageList.add(com.bytedance.android.live.base.model.f.b(fVar));
                                break;
                            case 22:
                                user.followInfo = e.b(fVar);
                                break;
                            case 23:
                                user.userHonor = co.b(fVar);
                                break;
                            case 24:
                                user.fansClub = bo.b(fVar);
                                break;
                            case 25:
                                user.border = bk.b(fVar);
                                break;
                            case 26:
                                user.specialId = fVar.d();
                                break;
                            case 27:
                                user.avatarBorder = com.bytedance.android.live.base.model.f.b(fVar);
                                break;
                            case 28:
                                user.medal = com.bytedance.android.live.base.model.f.b(fVar);
                                break;
                            case 29:
                                user.userBadges.add(com.bytedance.android.live.base.model.f.b(fVar));
                                break;
                            case 30:
                                user.newUserBadges.add(com.bytedance.android.live.base.model.f.b(fVar));
                                break;
                            case 31:
                                user.topVipNo = (int) g.b(fVar);
                                break;
                            case 32:
                                user.userAttr = cn.b(fVar);
                                break;
                            case 33:
                                user.ownRoom = i.b(fVar);
                                break;
                            case 34:
                                user.payScore = Long.valueOf(g.b(fVar));
                                break;
                            case 35:
                                user.fanTicketCount = g.b(fVar);
                                break;
                            case 36:
                                user.anchorInfo = be.b(fVar);
                                break;
                            case 37:
                                user.linkMicStats = fVar.e();
                                break;
                            case 38:
                                user.displayId = fVar.d();
                                break;
                            case 39:
                                user.enableShowCommerceSale = g.a(fVar);
                                break;
                            case 40:
                                user.withFusionShopEntry = Boolean.valueOf(g.a(fVar));
                                break;
                            case 41:
                                user.payScores = g.b(fVar);
                                break;
                            case 42:
                                user.anchorLevel = bf.b(fVar);
                                break;
                            case 43:
                                user.verifiedContent = fVar.d();
                                break;
                            case BuildConfig.VERSION_CODE:
                                user.authorInfo = bh.b(fVar);
                                break;
                            case 45:
                                user.topFans.add(b(fVar));
                                break;
                            case 46:
                                user.secUid = fVar.d();
                                break;
                            case 47:
                                user.userRole = fVar.e();
                                break;
                            case 49:
                                user.rewardInfo = bd.b(fVar);
                                break;
                            case 57:
                                user.mediaBadgeImageList.add(com.bytedance.android.live.base.model.f.b(fVar));
                                break;
                            case 1033:
                                user.pushCommentStatus = Boolean.valueOf(g.a(fVar));
                                break;
                            case 1034:
                                user.pushDigg = Boolean.valueOf(g.a(fVar));
                                break;
                            case 1035:
                                user.pushFollow = Boolean.valueOf(g.a(fVar));
                                break;
                            case 1036:
                                user.pushFriendAction = Boolean.valueOf(g.a(fVar));
                                break;
                            case 1037:
                                user.pushIchat = Boolean.valueOf(g.a(fVar));
                                break;
                            case 1038:
                                user.pushStatus = Boolean.valueOf(g.a(fVar));
                                break;
                            case 1039:
                                user.pushVideoPost = Boolean.valueOf(g.a(fVar));
                                break;
                            case 1040:
                                user.pushVideoRecommend = Boolean.valueOf(g.a(fVar));
                                break;
                            case 1043:
                                user.verifiedReason = fVar.d();
                                break;
                            case 1044:
                                user.enableCarManagementPermission = g.a(fVar);
                                break;
                            default:
                                switch (b2) {
                                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                        user.avatarThumb = com.bytedance.android.live.base.model.f.b(fVar);
                                        continue;
                                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                        user.avatarMedium = com.bytedance.android.live.base.model.f.b(fVar);
                                        continue;
                                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                        user.avatarLarge = com.bytedance.android.live.base.model.f.b(fVar);
                                        continue;
                                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                        user.isVerified = g.a(fVar);
                                        continue;
                                    default:
                                        switch (b2) {
                                            case 15:
                                                user.status = fVar.e();
                                                continue;
                                            case 16:
                                                user.createTime = g.b(fVar);
                                                continue;
                                            case 17:
                                                user.modifyTime = g.b(fVar);
                                                continue;
                                            case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                                                user.secret = fVar.e();
                                                continue;
                                            case 19:
                                                user.shareQrcodeUri = fVar.d();
                                                continue;
                                            default:
                                                switch (b2) {
                                                    case AudiencePingIntervalSetting.DEFAULT /*{ENCODED_INT: 60}*/:
                                                        user.commerceWebcastConfigIds.add(Long.valueOf(g.b(fVar)));
                                                        continue;
                                                    case 61:
                                                        user.borders.add(bk.b(fVar));
                                                        continue;
                                                    case 62:
                                                        user.comboBadgeInfo = h.b(fVar);
                                                        continue;
                                                    case 63:
                                                        user.subscribeInfo = g.b(fVar);
                                                        continue;
                                                    default:
                                                        switch (b2) {
                                                            case 1002:
                                                                user.allowFindByContacts = Boolean.valueOf(g.a(fVar));
                                                                continue;
                                                            case 1003:
                                                                user.allowOthersDownloadVideo = Boolean.valueOf(g.a(fVar));
                                                                continue;
                                                            case 1004:
                                                                user.allowOthersDownloadWhenSharingVideo = Boolean.valueOf(g.a(fVar));
                                                                continue;
                                                            case 1005:
                                                                user.allowShareShowProfile = Boolean.valueOf(g.a(fVar));
                                                                continue;
                                                            case 1006:
                                                                user.allowShowInGossip = Boolean.valueOf(g.a(fVar));
                                                                continue;
                                                            case 1007:
                                                                user.allowShowMyAction = Boolean.valueOf(g.a(fVar));
                                                                continue;
                                                            case 1008:
                                                                user.allowStrangeComment = Boolean.valueOf(g.a(fVar));
                                                                continue;
                                                            case 1009:
                                                                user.allowUnfollowerComment = Boolean.valueOf(g.a(fVar));
                                                                continue;
                                                            case 1010:
                                                                user.allowUseLinkmic = Boolean.valueOf(g.a(fVar));
                                                                continue;
                                                            default:
                                                                switch (b2) {
                                                                    case 1016:
                                                                        user.blockStatus = Integer.valueOf(fVar.e());
                                                                        continue;
                                                                    case 1017:
                                                                        user.commentRestrict = Integer.valueOf(fVar.e());
                                                                        continue;
                                                                    case 1018:
                                                                        user.constellation = fVar.d();
                                                                        continue;
                                                                    case 1019:
                                                                        user.disableIchat = Integer.valueOf(fVar.e());
                                                                        continue;
                                                                    case 1020:
                                                                        user.enableIchatImg = Long.valueOf(g.b(fVar));
                                                                        continue;
                                                                    case 1021:
                                                                        user.exp = Integer.valueOf(fVar.e());
                                                                        continue;
                                                                    default:
                                                                        switch (b2) {
                                                                            case 1027:
                                                                                user.ichatRestrictType = Integer.valueOf(fVar.e());
                                                                                continue;
                                                                            case 1028:
                                                                                user.idStr = fVar.d();
                                                                                continue;
                                                                            case 1029:
                                                                                user.isFollower = Boolean.valueOf(g.a(fVar));
                                                                                continue;
                                                                            case 1030:
                                                                                user.isFollowing = Boolean.valueOf(g.a(fVar));
                                                                                continue;
                                                                            case 1031:
                                                                                user.needProfileGuide = Boolean.valueOf(g.a(fVar));
                                                                                continue;
                                                                            default:
                                                                                g.c(fVar);
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                    } else {
                        user.followStatus = Long.valueOf(g.b(fVar));
                    }
                }
                user.signature = fVar.d();
            } else {
                user.nickName = fVar.d();
            }
        }
    }
}
