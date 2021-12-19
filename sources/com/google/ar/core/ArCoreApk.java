package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.ar.core.exceptions.FatalException;

public class ArCoreApk {
    static {
        Covode.recordClassIndex(32984);
    }

    protected ArCoreApk() {
    }

    public static ArCoreApk getInstance() {
        return z.f53484a;
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static class Availability extends Enum<Availability> {
        private static final /* synthetic */ Availability[] $VALUES = $values();
        public static final Availability SUPPORTED_APK_TOO_OLD = new v();
        public static final Availability SUPPORTED_INSTALLED = new w();
        public static final Availability SUPPORTED_NOT_INSTALLED = new u();
        public static final Availability UNKNOWN_CHECKING = new r();
        public static final Availability UNKNOWN_ERROR = new q();
        public static final Availability UNKNOWN_TIMED_OUT = new s();
        public static final Availability UNSUPPORTED_DEVICE_NOT_CAPABLE = new t();
        final int nativeCode;

        private static /* synthetic */ Availability[] $values() {
            return new Availability[]{UNKNOWN_ERROR, UNKNOWN_CHECKING, UNKNOWN_TIMED_OUT, UNSUPPORTED_DEVICE_NOT_CAPABLE, SUPPORTED_NOT_INSTALLED, SUPPORTED_APK_TOO_OLD, SUPPORTED_INSTALLED};
        }

        /* synthetic */ Availability(String str, int i2, int i3, a aVar) {
            this(str, i2, i3);
        }

        public boolean isSupported() {
            return false;
        }

        public boolean isTransient() {
            return false;
        }

        public boolean isUnknown() {
            return false;
        }

        public boolean isUnsupported() {
            return false;
        }

        public static Availability[] values() {
            return (Availability[]) $VALUES.clone();
        }

        static {
            Covode.recordClassIndex(32985);
        }

        public static Availability valueOf(String str) {
            return (Availability) Enum.valueOf(Availability.class, str);
        }

        static Availability forNumber(int i2) {
            Availability[] values = values();
            for (Availability availability : values) {
                if (availability.nativeCode == i2) {
                    return availability;
                }
            }
            StringBuilder sb = new StringBuilder(59);
            sb.append("Unexpected value for native Availability, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private Availability(String str, int i2, int i3) {
            this.nativeCode = i3;
        }
    }

    public enum InstallBehavior {
        REQUIRED(0),
        OPTIONAL(1);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32986);
        }

        static InstallBehavior forNumber(int i2) {
            InstallBehavior[] values = values();
            for (InstallBehavior installBehavior : values) {
                if (installBehavior.nativeCode == i2) {
                    return installBehavior;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native InstallBehavior, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private InstallBehavior(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum InstallStatus {
        INSTALLED(0),
        INSTALL_REQUESTED(1);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32987);
        }

        static InstallStatus forNumber(int i2) {
            InstallStatus[] values = values();
            for (InstallStatus installStatus : values) {
                if (installStatus.nativeCode == i2) {
                    return installStatus;
                }
            }
            StringBuilder sb = new StringBuilder(60);
            sb.append("Unexpected value for native InstallStatus, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private InstallStatus(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum UserMessageType {
        APPLICATION(0),
        FEATURE(1),
        USER_ALREADY_INFORMED(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32988);
        }

        static UserMessageType forNumber(int i2) {
            UserMessageType[] values = values();
            for (UserMessageType userMessageType : values) {
                if (userMessageType.nativeCode == i2) {
                    return userMessageType;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native UserMessageType, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private UserMessageType(int i2) {
            this.nativeCode = i2;
        }
    }

    public Availability checkAvailability(Context context) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z, InstallBehavior installBehavior, UserMessageType userMessageType) {
        throw new UnsupportedOperationException("Stub");
    }
}
