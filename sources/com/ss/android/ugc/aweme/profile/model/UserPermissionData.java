package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import h.f.b.g;
import h.f.b.l;
import h.m.p;
import java.io.Serializable;
import java.util.HashMap;
import java.util.NoSuchElementException;

public final class UserPermissionData {

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class UserPermissionRequestType extends Enum<UserPermissionRequestType> {
        private static final /* synthetic */ UserPermissionRequestType[] $VALUES;
        public static final Companion Companion = new Companion(null);
        public static final UserPermissionRequestType DEFAULT_TYPE;
        private int type;

        static {
            Covode.recordClassIndex(75285);
            DEFAULT_TYPE default_type = new DEFAULT_TYPE("DEFAULT_TYPE", 0);
            DEFAULT_TYPE = default_type;
            $VALUES = new UserPermissionRequestType[]{default_type};
        }

        public static UserPermissionRequestType valueOf(String str) {
            return (UserPermissionRequestType) Enum.valueOf(UserPermissionRequestType.class, str);
        }

        public static UserPermissionRequestType[] values() {
            return (UserPermissionRequestType[]) $VALUES.clone();
        }

        public static final class Companion {
            static {
                Covode.recordClassIndex(75286);
            }

            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final UserPermissionRequestType fromInt(int i2) {
                UserPermissionRequestType[] values = UserPermissionRequestType.values();
                for (UserPermissionRequestType userPermissionRequestType : values) {
                    if (userPermissionRequestType.getType() == i2) {
                        return userPermissionRequestType;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        public final int getType() {
            return this.type;
        }

        public final void setType(int i2) {
            this.type = i2;
        }

        static final class DEFAULT_TYPE extends UserPermissionRequestType {
            static {
                Covode.recordClassIndex(75287);
            }

            public final String toString() {
                return "DEFAULT_TYPE";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            DEFAULT_TYPE(String str, int i2) {
                super(str, i2, 0, null);
            }
        }

        private UserPermissionRequestType(String str, int i2, int i3) {
            this.type = i3;
        }

        public /* synthetic */ UserPermissionRequestType(String str, int i2, int i3, g gVar) {
            this(str, i2, i3);
        }
    }

    static {
        Covode.recordClassIndex(75283);
    }

    public static final class UserPermissionInfo implements Serializable {
        @c(a = "age_gate_region")
        private String ageGateRegion = "";
        @c(a = "permissions")
        private String permissions = "";

        static {
            Covode.recordClassIndex(75284);
        }

        public final String getAgeGateRegion() {
            return this.ageGateRegion;
        }

        public final String getPermissions() {
            return this.permissions;
        }

        public final HashMap<String, Boolean> permissionsMap() {
            Object a2 = new f().a(this.permissions, (Class) new HashMap().getClass());
            l.b(a2, "");
            return (HashMap) a2;
        }

        public final String toString() {
            String str;
            String str2;
            if (!p.a((CharSequence) this.ageGateRegion)) {
                str = "age_gate_region=" + this.ageGateRegion + ',';
            } else {
                str = "";
            }
            StringBuilder append = new StringBuilder("{").append(str).append("permissions=\"");
            String str3 = this.permissions;
            if (str3 != null) {
                str2 = p.a(str3, "\"", "");
            } else {
                str2 = null;
            }
            return append.append(str2).append('\"').append("}").toString();
        }

        public final void setPermissions(String str) {
            this.permissions = str;
        }

        public final void setAgeGateRegion(String str) {
            l.d(str, "");
            this.ageGateRegion = str;
        }
    }
}
