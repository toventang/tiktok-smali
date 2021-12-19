package com.ss.android.ugc.aweme.account.login.v2.base;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.j.h;
import java.util.LinkedHashMap;
import java.util.Map;

public enum j {
    NONE(-1),
    SIGN_UP(0),
    LOGIN(1),
    SET_OR_RESET_PASSWORD(2),
    BIND_PHONE(3),
    MODIFY_PHONE(4),
    RECOVER_ACCOUNT(5),
    CHANGE_PASSWORD(9),
    BIND_EMAIL(6),
    VERIFY(7),
    CHANGE_EMAIL(8),
    ONE_KEY_LOGIN(10),
    TWO_STEP_VERIFICATION(11),
    LOGIN_FLOW(12),
    GUEST_MODE(13),
    UNBIND_PHONE(14),
    UNBIND_EMAIL(15);
    
    public static final a Companion = new a((byte) 0);
    public static final Map<Integer, j> VALUES_MAP;
    private final int value;

    public static final class a {
        static {
            Covode.recordClassIndex(39791);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(39790);
        j[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.b(ag.a(values.length), 16));
        for (j jVar : values) {
            linkedHashMap.put(Integer.valueOf(jVar.value), jVar);
        }
        VALUES_MAP = linkedHashMap;
    }

    private j(int i2) {
        this.value = i2;
    }
}
