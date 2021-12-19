package org.apache.http.conn.util;

import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

public class InetAddressUtils {
    private static final Pattern IPV4_PATTERN = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    private static final Pattern IPV6_HEX_COMPRESSED_PATTERN = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    private static final Pattern IPV6_STD_PATTERN = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    static {
        Covode.recordClassIndex(106412);
    }

    public static boolean isIPv4Address(String str) {
        return IPV4_PATTERN.matcher(str).matches();
    }

    public static boolean isIPv6Address(String str) {
        if (isIPv6StdAddress(str) || isIPv6HexCompressedAddress(str)) {
            return true;
        }
        return false;
    }

    public static boolean isIPv6HexCompressedAddress(String str) {
        return IPV6_HEX_COMPRESSED_PATTERN.matcher(str).matches();
    }

    public static boolean isIPv6StdAddress(String str) {
        return IPV6_STD_PATTERN.matcher(str).matches();
    }
}
