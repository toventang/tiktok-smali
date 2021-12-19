package org.apache.http;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class ProtocolVersion implements Serializable, Cloneable {
    private static final long serialVersionUID = 8950662842175091068L;
    protected final int major;
    protected final int minor;
    protected final String protocol;

    static {
        Covode.recordClassIndex(106373);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }

    public final int hashCode() {
        return (this.protocol.hashCode() ^ (this.major * 100000)) ^ this.minor;
    }

    public String toString() {
        return this.protocol + '/' + Integer.toString(this.major) + '.' + Integer.toString(this.minor);
    }

    public final boolean greaterEquals(ProtocolVersion protocolVersion) {
        if (!isComparable(protocolVersion) || compareToVersion(protocolVersion) < 0) {
            return false;
        }
        return true;
    }

    public boolean isComparable(ProtocolVersion protocolVersion) {
        if (protocolVersion == null || !this.protocol.equals(protocolVersion.protocol)) {
            return false;
        }
        return true;
    }

    public final boolean lessEquals(ProtocolVersion protocolVersion) {
        if (!isComparable(protocolVersion) || compareToVersion(protocolVersion) > 0) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolVersion)) {
            return false;
        }
        ProtocolVersion protocolVersion = (ProtocolVersion) obj;
        if (this.protocol.equals(protocolVersion.protocol) && this.major == protocolVersion.major && this.minor == protocolVersion.minor) {
            return true;
        }
        return false;
    }

    public int compareToVersion(ProtocolVersion protocolVersion) {
        if (protocolVersion == null) {
            throw new IllegalArgumentException("Protocol version must not be null.");
        } else if (this.protocol.equals(protocolVersion.protocol)) {
            int major2 = getMajor() - protocolVersion.getMajor();
            if (major2 == 0) {
                return getMinor() - protocolVersion.getMinor();
            }
            return major2;
        } else {
            throw new IllegalArgumentException("Versions for different protocols cannot be compared. " + this + " " + protocolVersion);
        }
    }

    public ProtocolVersion forVersion(int i2, int i3) {
        if (i2 == this.major && i3 == this.minor) {
            return this;
        }
        return new ProtocolVersion(this.protocol, i2, i3);
    }

    public ProtocolVersion(String str, int i2, int i3) {
        if (str == null) {
            throw new IllegalArgumentException("Protocol name must not be null.");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Protocol major version number must not be negative.");
        } else if (i3 >= 0) {
            this.protocol = str;
            this.major = i2;
            this.minor = i3;
        } else {
            throw new IllegalArgumentException("Protocol minor version number may not be negative");
        }
    }
}
