package org.apache.http.util;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class VersionInfo {
    private final String infoClassloader;
    private final String infoModule;
    private final String infoPackage;
    private final String infoRelease;
    private final String infoTimestamp;

    static {
        Covode.recordClassIndex(106435);
    }

    public final String getRelease() {
        return this.infoRelease;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.infoPackage.length() + 20 + this.infoModule.length() + this.infoRelease.length() + this.infoTimestamp.length() + this.infoClassloader.length());
        sb.append("VersionInfo(").append(this.infoPackage).append(':').append(this.infoModule);
        if (!"UNAVAILABLE".equals(this.infoRelease)) {
            sb.append(':').append(this.infoRelease);
        }
        if (!"UNAVAILABLE".equals(this.infoTimestamp)) {
            sb.append(':').append(this.infoTimestamp);
        }
        sb.append(')');
        if (!"UNAVAILABLE".equals(this.infoClassloader)) {
            sb.append('@').append(this.infoClassloader);
        }
        return sb.toString();
    }

    /* JADX INFO: finally extract failed */
    public static final VersionInfo loadVersionInfo(String str, ClassLoader classLoader) {
        if (str != null) {
            if (classLoader == null) {
                classLoader = Thread.currentThread().getContextClassLoader();
            }
            try {
                InputStream resourceAsStream = classLoader.getResourceAsStream(str.replace('.', '/') + "/version.properties");
                if (resourceAsStream == null) {
                    return null;
                }
                try {
                    Properties properties = new Properties();
                    properties.load(resourceAsStream);
                    try {
                        resourceAsStream.close();
                    } catch (IOException unused) {
                        if (properties == null) {
                            return null;
                        }
                    }
                    return fromMap(str, properties, classLoader);
                } catch (Throwable th) {
                    resourceAsStream.close();
                    throw th;
                }
            } catch (IOException unused2) {
                return null;
            }
        } else {
            throw new IllegalArgumentException("Package identifier must not be null.");
        }
    }

    protected static final VersionInfo fromMap(String str, Map<?, ?> map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        if (str != null) {
            String str5 = null;
            if (map != null) {
                str2 = (String) map.get("info.module");
                if (str2 != null && str2.length() <= 0) {
                    str2 = null;
                }
                str3 = (String) map.get("info.release");
                if (str3 != null && (str3.length() <= 0 || str3.equals("${pom.version}"))) {
                    str3 = null;
                }
                str4 = (String) map.get("info.timestamp");
                if (str4 != null && (str4.length() <= 0 || str4.equals("${mvn.timestamp}"))) {
                    str4 = null;
                }
            } else {
                str2 = null;
                str3 = null;
                str4 = null;
            }
            if (classLoader != null) {
                str5 = classLoader.toString();
            }
            return new VersionInfo(str, str2, str3, str4, str5);
        }
        throw new IllegalArgumentException("Package identifier must not be null.");
    }

    protected VersionInfo(String str, String str2, String str3, String str4, String str5) {
        if (str != null) {
            this.infoPackage = str;
            this.infoModule = str2 == null ? "UNAVAILABLE" : str2;
            this.infoRelease = str3 == null ? "UNAVAILABLE" : str3;
            this.infoTimestamp = str4 == null ? "UNAVAILABLE" : str4;
            this.infoClassloader = str5 == null ? "UNAVAILABLE" : str5;
            return;
        }
        throw new IllegalArgumentException("Package identifier must not be null.");
    }
}
