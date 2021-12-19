package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;

public final class cv {

    /* renamed from: a  reason: collision with root package name */
    public static final a f142789a = new a((byte) 0);

    static {
        Covode.recordClassIndex(93406);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(93407);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static int a(String str) {
            if (str == null) {
                return 0;
            }
            switch (str.hashCode()) {
                case -2026708222:
                    if (str.equals("follow_rec")) {
                        return 12;
                    }
                    return 0;
                case -1286505224:
                    if (str.equals("message_fans")) {
                        return 7;
                    }
                    return 0;
                case -1165154881:
                    if (str.equals("face_to_face")) {
                        return 201901;
                    }
                    return 0;
                case -710131922:
                    if (str.equals("search_sug")) {
                        return 14;
                    }
                    return 0;
                case -612351174:
                    if (str.equals("phone_number")) {
                        return 4;
                    }
                    return 0;
                case -182649969:
                    if (str.equals("other_fans")) {
                        return 11;
                    }
                    return 0;
                case -121207376:
                    if (str.equals("discovery")) {
                        return 14;
                    }
                    return 0;
                case -6753043:
                    if (str.equals("share_user_info_card")) {
                        return 21;
                    }
                    return 0;
                case 3052376:
                    if (str.equals("chat")) {
                        return 8;
                    }
                    return 0;
                case 3135424:
                    if (str.equals("fans")) {
                        return 9;
                    }
                    return 0;
                case 3322092:
                    if (str.equals("live")) {
                        return 16;
                    }
                    return 0;
                case 3524221:
                    if (str.equals("scan")) {
                        return 17;
                    }
                    return 0;
                case 110541305:
                    if (str.equals("token")) {
                        return 6;
                    }
                    return 0;
                case 954925063:
                    if (str.equals("message")) {
                        return 8;
                    }
                    return 0;
                case 998835423:
                    if (str.equals("general_search")) {
                        return 14;
                    }
                    return 0;
                case 1234580717:
                    if (str.equals("discovery_recommend")) {
                        return 12;
                    }
                    return 0;
                case 1425879700:
                    if (str.equals("search_result")) {
                        return 14;
                    }
                    return 0;
                case 1605556258:
                    if (str.equals("other_following")) {
                        return 10;
                    }
                    return 0;
                case 1691937916:
                    if (str.equals("homepage_hot")) {
                        return 13;
                    }
                    return 0;
                case 1839865103:
                    if (str.equals("find_friends")) {
                        return 12;
                    }
                    return 0;
                default:
                    return 0;
            }
        }

        public static int a(String str, RelationDynamicLabel relationDynamicLabel) {
            if (TextUtils.equals(str, "homepage_hot")) {
                if (relationDynamicLabel == null || relationDynamicLabel.getType() != 5) {
                    return 13;
                }
                return 20;
            } else if (TextUtils.equals(str, "share_user_info_card")) {
                return 21;
            } else {
                if (relationDynamicLabel == null || relationDynamicLabel.getType() != 5) {
                    return 18;
                }
                return 20;
            }
        }
    }
}
