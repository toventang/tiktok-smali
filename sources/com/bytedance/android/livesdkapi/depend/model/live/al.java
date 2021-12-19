package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.user.j;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.model.a.h;
import com.bytedance.android.livesdk.model.bz;
import com.bytedance.android.livesdk.model.ca;
import com.bytedance.android.livesdk.model.cb;
import com.bytedance.android.livesdk.model.cc;
import com.bytedance.android.livesdk.model.cd;
import com.bytedance.android.livesdk.model.cg;
import com.bytedance.android.livesdk.model.ch;
import com.bytedance.android.livesdk.model.ci;
import com.bytedance.android.livesdk.model.cj;
import com.bytedance.android.livesdk.model.cl;
import com.bytedance.android.livesdk.model.cp;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.model.v;
import java.util.ArrayList;

public final class al implements b<Room> {
    static {
        Covode.recordClassIndex(13705);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ Room a(f fVar) {
        return b(fVar);
    }

    public static Room b(f fVar) {
        Room room = new Room();
        room.decorationList = new ArrayList();
        room.feedRoomLabelList = new ArrayList();
        room.stickerList = new ArrayList();
        room.topFanTickets = new ArrayList();
        room.shortTouchItems = new ArrayList();
        room.filterRule = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                room.init();
                return room;
            } else if (b2 == 1) {
                room.id = g.b(fVar);
            } else if (b2 == 2) {
                room.idStr = fVar.d();
            } else if (b2 == 3) {
                room.status = (int) g.b(fVar);
            } else if (b2 == 4) {
                room.ownerUserId = g.b(fVar);
            } else if (b2 == 5) {
                room.title = fVar.d();
            } else if (b2 != 6) {
                if (b2 != 7) {
                    if (b2 == 28) {
                        room.streamUrl = ao.b(fVar);
                    } else if (b2 == 29) {
                        room.mosaicStatus = (int) g.b(fVar);
                    } else if (b2 == 42) {
                        room.feedRoomLabel = com.bytedance.android.live.base.model.f.b(fVar);
                    } else if (b2 == 43) {
                        room.labels = fVar.d();
                    } else if (b2 == 83) {
                        room.background = com.bytedance.android.live.base.model.f.b(fVar);
                    } else if (b2 == 84) {
                        room.layout = g.b(fVar);
                    } else if (b2 == 90) {
                        room.unusedEffect = g.a(fVar);
                    } else if (b2 != 91) {
                        switch (b2) {
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                break;
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                room.finishTime = g.b(fVar);
                                break;
                            case 32:
                                room.linkMicInfoGson = ai.b(fVar);
                                break;
                            case 46:
                                room.owner = j.b(fVar);
                                break;
                            case 48:
                                room.hasCommerceGoods = g.a(fVar);
                                break;
                            case 72:
                                room.mRoomAuthStatus = cg.b(fVar);
                                break;
                            case 93:
                                room.finish_url = fVar.d();
                                break;
                            case 101:
                                room.roomLayout = (int) g.b(fVar);
                                break;
                            case 111:
                                room.likeCount = g.b(fVar);
                                break;
                            case 120:
                                room.anchorTabType = (long) fVar.e();
                                break;
                            case 122:
                                room.officialChannelInfo = cd.b(fVar);
                                break;
                            case 139:
                                room.mNameMode = (int) g.b(fVar);
                                break;
                            case 145:
                                room.commerceStruct = w.b(fVar);
                                break;
                            case 147:
                                room.streamCover = com.bytedance.android.live.base.model.f.b(fVar);
                                break;
                            case 149:
                                room.questionVersion = fVar.e();
                                break;
                            case 155:
                                room.answeringQuestion = fVar.d();
                                break;
                            case 157:
                                room.warningTag = cp.b(fVar);
                                break;
                            case 158:
                                room.maskLayer = cc.b(fVar);
                                break;
                            case 159:
                                room.liveRoomMode = fVar.e();
                                break;
                            case 163:
                                room.finishUrlLynx = fVar.d();
                                break;
                            case 165:
                                room.likeInfo = ca.b(fVar);
                                break;
                            case 166:
                                room.shortTouchItems.add(cj.b(fVar));
                                break;
                            case 167:
                                room.filterRule.add(ae.b(fVar));
                                break;
                            case 168:
                                room.stickerList.add(ch.b(fVar));
                                break;
                            case 169:
                                room.mBoostCardRoomStatus = af.b(fVar);
                                break;
                            case 170:
                                room.feedRoomLabelList.add(y.b(fVar));
                                break;
                            case 172:
                                room.haveWishList = g.a(fVar);
                                break;
                            case 174:
                                room.multiLiveUserSettings = h.b(fVar);
                                break;
                            default:
                                switch (b2) {
                                    case 16:
                                        room.platform = (int) g.b(fVar);
                                        continue;
                                    case 17:
                                        room.clientVersion = String.valueOf(g.b(fVar));
                                        continue;
                                    case LiveRechargeAgeThresholdSetting.DEFAULT:
                                        room.withLinkMic = g.a(fVar);
                                        continue;
                                    default:
                                        switch (b2) {
                                            case v.U /*{ENCODED_INT: 20}*/:
                                                room.cover = com.bytedance.android.live.base.model.f.b(fVar);
                                                continue;
                                            case 21:
                                                room.dynamicCover = com.bytedance.android.live.base.model.f.b(fVar);
                                                continue;
                                            case 22:
                                                room.dynamicCoverLow = com.bytedance.android.live.base.model.f.b(fVar);
                                                continue;
                                            case 23:
                                                room.shareUrl = fVar.d();
                                                continue;
                                            case 24:
                                                room.anchorShareText = fVar.d();
                                                continue;
                                            case 25:
                                                room.userShareText = fVar.d();
                                                continue;
                                            case 26:
                                                room.streamId = g.b(fVar);
                                                continue;
                                            default:
                                                switch (b2) {
                                                    case 34:
                                                        room.decorationList.add(ch.b(fVar));
                                                        continue;
                                                    case 35:
                                                        room.topFanTickets.add(cl.b(fVar));
                                                        continue;
                                                    case 36:
                                                        room.stats = ci.b(fVar);
                                                        continue;
                                                    default:
                                                        switch (b2) {
                                                            case 51:
                                                                room.liveTypeAudio = g.a(fVar);
                                                                continue;
                                                            case 52:
                                                                room.isThirdParty = g.a(fVar);
                                                                continue;
                                                            case 53:
                                                                room.isScreenshot = g.a(fVar);
                                                                continue;
                                                            default:
                                                                switch (b2) {
                                                                    case 151:
                                                                        room.liveEventInfo = cb.b(fVar);
                                                                        continue;
                                                                    case 152:
                                                                        room.hashtag = bz.b(fVar);
                                                                        continue;
                                                                    case 153:
                                                                        room.baLinkStruct = t.b(fVar);
                                                                        continue;
                                                                    default:
                                                                        g.c(fVar);
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
                    } else {
                        room.giftMessageStyle = (int) g.b(fVar);
                    }
                }
                room.createTime = g.b(fVar);
            } else {
                room.userCount = (int) g.b(fVar);
            }
        }
    }
}
