package com.bytedance.ies.dmt.ui.dialog.dialogmanager;

import com.bytedance.covode.number.Covode;
import java.util.List;

public interface b {

    public enum a {
        TERMS_PRIVACY_COOKIE,
        SWIPE_UP_GUIDE,
        AGE_GATE,
        POLICY_NOTICE,
        PRIVATE_ACCOUNT_TIP,
        TERMS_CONSENT,
        PERSONALIZED_AD,
        UNDER_16_ALERT,
        GRADIENT_PUNISH_WARNING,
        FRIEND_INVITATION,
        LOCATION_PERMISSION_HINT,
        LOCATION_PERMISSION,
        SOCIAL_REC_FRIENDS,
        GROUP_CHAT_INVITE,
        FRIENDSLIST_PERMISSION,
        SEARCH_ICON_TIPS,
        TWO_FACTOR_AUTH,
        SAVE_LOGIN_INFO;

        static {
            Covode.recordClassIndex(19946);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.dialog.dialogmanager.b$b  reason: collision with other inner class name */
    public enum EnumC0733b {
        EVENT_INIT;
        
        private int value;

        /* renamed from: com.bytedance.ies.dmt.ui.dialog.dialogmanager.b$b$a */
        static final class a {

            /* renamed from: a  reason: collision with root package name */
            static int f33437a;

            /* renamed from: b  reason: collision with root package name */
            public static final a f33438b = new a();

            private a() {
            }

            static {
                Covode.recordClassIndex(19948);
            }
        }

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(19947);
        }

        public final void setValue(int i2) {
            this.value = i2;
        }

        private EnumC0733b() {
            this.value = r3;
            a.f33437a = r3 + 1;
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(19949);
        }

        void a();

        void a(List<Integer> list);

        void a(List<Integer> list, int i2);
    }

    public enum d {
        TERMS_PRIVACY_COOKIE,
        SWITCH_ACCOUNT_PENDING,
        AGE_GATE,
        POLICY_NOTICE;

        static {
            Covode.recordClassIndex(19950);
        }
    }

    static {
        Covode.recordClassIndex(19945);
    }
}
