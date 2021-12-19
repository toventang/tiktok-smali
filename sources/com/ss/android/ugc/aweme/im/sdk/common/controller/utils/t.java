package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b;
import com.bytedance.ies.im.core.api.b.f;
import com.bytedance.ies.im.core.api.f.c;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ActionContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.EmojiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupGreetingContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupSystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareCompilationContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareMusicContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareQnAContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareSearchContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStickerContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareStoryContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareWebContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemCompatContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.VideoUpdateTipsContent;
import java.util.HashMap;

public final class t {
    static {
        Covode.recordClassIndex(65583);
    }

    public static void a() {
        b.a().c();
    }

    public static String a(BaseContent baseContent) {
        if (baseContent instanceof ShareAwemeContent) {
            return ((ShareAwemeContent) baseContent).getSendMethod();
        }
        return "";
    }

    public static void b(ai aiVar) {
        f.a.a().a(aiVar, (com.bytedance.im.core.a.a.b<ai>) null);
    }

    public static void a(ai aiVar) {
        if (aiVar != null) {
            f.a.a().b(aiVar);
        }
    }

    public static int a(c cVar) {
        String str;
        if (!(cVar instanceof BaseContent)) {
            return -1;
        }
        if (cVar instanceof TextContent) {
            return 7;
        }
        if (cVar instanceof GroupSystemContent) {
            return 1031;
        }
        if (cVar instanceof GroupGreetingContent) {
            return 1030;
        }
        if (cVar instanceof SystemContent) {
            return 1;
        }
        if (cVar instanceof SystemCompatContent) {
            return 1006;
        }
        if (cVar instanceof ShareQnAContent) {
            return 33;
        }
        if (cVar instanceof ShareMusicContent) {
            return 22;
        }
        if (cVar instanceof ShareAwemeContent) {
            if (cVar instanceof ShareStoryContent) {
                return 1025;
            }
            return 8;
        } else if (cVar instanceof EmojiContent) {
            return 5;
        } else {
            if (cVar instanceof VideoUpdateTipsContent) {
                return 14;
            }
            if (cVar instanceof CommentContent) {
                return 40;
            }
            if (cVar instanceof ShareChallengeContent) {
                return 19;
            }
            if (cVar instanceof ShareLiveContent) {
                return 1021;
            }
            if (cVar instanceof ShareLiveEventContent) {
                return 1034;
            }
            if (cVar instanceof ShareUserContent) {
                return 25;
            }
            if (cVar instanceof ShareWebContent) {
                return 26;
            }
            if (cVar instanceof ShareSearchContent) {
                return 1036;
            }
            if (cVar instanceof ShareCompilationContent) {
                return 71;
            }
            if (cVar instanceof ShareStickerContent) {
                return 72;
            }
            if (cVar instanceof ActionContent) {
                return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            }
            if (cVar instanceof GroupInviteCardContent) {
                return 1033;
            }
            if (!com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.f102230c.f103815a) {
                HashMap hashMap = new HashMap();
                if (cVar != null) {
                    try {
                        str = j.a(cVar);
                    } catch (Exception e2) {
                        hashMap.put("error", e2.getMessage());
                    }
                } else {
                    str = "";
                }
                hashMap.put("error", str);
                c.a("error_msg_content", hashMap);
                return -1;
            }
            throw new IllegalArgumentException("Message Type is NONE!!!");
        }
    }

    public static String a(String str) {
        if (TextUtils.equals(str, "aweme")) {
            return "video";
        }
        if (TextUtils.equals(str, "pic")) {
            return "pic";
        }
        if (TextUtils.equals(str, "gif")) {
            return "gif";
        }
        if (TextUtils.equals(str, "text")) {
            return "text";
        }
        if (TextUtils.equals(str, "music")) {
            return "music_card";
        }
        if (TextUtils.equals(str, "challenge")) {
            return "tag_card";
        }
        if (TextUtils.equals(str, "ranking")) {
            return "hot_search_card";
        }
        if (TextUtils.equals(str, "game")) {
            return "game";
        }
        if (TextUtils.equals(str, "user")) {
            return "profile";
        }
        if (TextUtils.equals(str, "live")) {
            return "live";
        }
        if (TextUtils.equals(str, "web")) {
            return "webview";
        }
        if (TextUtils.equals(str, "qna")) {
            return "question_detail";
        }
        return "";
    }

    public static void a(ai aiVar, com.bytedance.im.core.a.a.b<ai> bVar) {
        if (aiVar != null) {
            f.a.a().a(aiVar, false, bVar);
        }
    }

    public static boolean b(ai aiVar, BaseContent baseContent) {
        if (baseContent == null || aiVar == null || aiVar.getExt() == null || !TextUtils.equals(aiVar.getExt().get("awe:from:commerce"), "1") || aiVar.getMsgType() != 26 || !baseContent.isCard) {
            return false;
        }
        return true;
    }

    public static String a(ai aiVar, BaseContent baseContent) {
        String str;
        int msgType = aiVar.getMsgType();
        if (msgType != 5) {
            if (msgType != 19) {
                if (msgType == 33) {
                    return "question_detail";
                }
                if (msgType == 40) {
                    return "share_comment";
                }
                if (msgType == 74) {
                    return "redpacket";
                }
                if (msgType != 1021) {
                    if (msgType == 1025) {
                        return "share_story";
                    }
                    if (msgType == 1034) {
                        return "live_event";
                    }
                    if (msgType == 1036) {
                        return "share_search";
                    }
                    if (msgType == 7) {
                        if (baseContent instanceof TextContent) {
                            str = ((TextContent) baseContent).getText();
                        } else {
                            str = "";
                        }
                        d.a();
                        int c2 = com.ss.android.ugc.aweme.emoji.i.b.b.c(str);
                        if (c2 == 1) {
                            return "emoji";
                        }
                        if (c2 == 0) {
                            return "text";
                        }
                        if (c2 == 2) {
                            return "text_emoji";
                        }
                        return "";
                    } else if (msgType == 8) {
                        return "share_video";
                    } else {
                        if (msgType != 21) {
                            if (msgType != 22) {
                                if (msgType == 71) {
                                    return "share";
                                }
                                if (msgType != 72) {
                                    switch (msgType) {
                                        case 24:
                                            return "mini_app";
                                        case 25:
                                            break;
                                        case 26:
                                            String str2 = aiVar.getLocalExt().get("message_type");
                                            if (str2 != null) {
                                                return str2;
                                            }
                                            return "unknown";
                                        default:
                                            return "unknown";
                                    }
                                }
                            }
                        }
                    }
                }
                return "live_room";
            }
            return "page";
        } else if (baseContent.getType() == 501) {
            return "favoriate_emoji";
        } else {
            if (baseContent.getType() == 502) {
                return "giphy";
            }
            if (baseContent.getType() == 504) {
                return "greet_emoji";
            }
            if (!com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.d().isMtCase()) {
                return "emoji";
            }
            return "sticker";
        }
    }
}
