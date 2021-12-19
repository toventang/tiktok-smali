package com.facebook.net;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.b.c;
import com.bytedance.frameworks.baselib.network.http.b.e;
import com.bytedance.frameworks.baselib.network.http.g.b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.conn.ConnectTimeoutException;

public final class f {
    static {
        Covode.recordClassIndex(29518);
    }

    public static int a(Throwable th) {
        int i2 = 1;
        if (th == null) {
            return 1;
        }
        String[] strArr = new String[1];
        int i3 = 40;
        if (th instanceof c) {
            i2 = ((c) th).getStatusCode();
        } else if (th instanceof b) {
            i2 = 20;
        } else {
            if (!(th instanceof ConnectTimeoutException)) {
                if (th instanceof SocketTimeoutException) {
                    if (m.a(th.getMessage()) || !th.getMessage().contains("connect timed out")) {
                        i2 = 3;
                    }
                } else if (th instanceof BindException) {
                    i2 = 7;
                } else if (th instanceof ConnectException) {
                    i2 = 8;
                } else if (th instanceof NoRouteToHostException) {
                    i2 = 9;
                } else if (th instanceof PortUnreachableException) {
                    i2 = 10;
                } else if (th instanceof SocketException) {
                    i2 = 5;
                    String message = th.getMessage();
                    if (message != null && message.indexOf("reset by peer") >= 0) {
                        i2 = 6;
                    }
                } else if (th instanceof UnknownHostException) {
                    i2 = 11;
                } else if (th instanceof e) {
                    i2 = 18;
                } else if (th instanceof com.bytedance.frameworks.baselib.network.http.b.b) {
                    i2 = 19;
                } else if ((th instanceof IOException) && "request canceled".equals(th.getMessage())) {
                    i2 = 40;
                }
            }
            i2 = 2;
        }
        boolean z = th instanceof IOException;
        if (!z || !"Canceled".equals(th.getMessage())) {
            i3 = i2;
        }
        if (z) {
            if ("network not available".equals(th.getMessage())) {
                return 41;
            }
            i3 = 4;
        } else if (i3 == 2) {
            try {
                String message2 = th.getMessage();
                Logger.debug();
                Matcher matcher = Pattern.compile("Connect to +([\\w\\.\\-]+)?/(\\[([a-zA-Z0-9:]+)\\]|(\\d{1,3}(\\.\\d{1,3}){3,3})):(\\d+) +timed out").matcher(message2);
                if (matcher.matches()) {
                    if (matcher.group(3) != null) {
                        matcher.group(3);
                    } else if (matcher.group(4) != null) {
                        matcher.group(4);
                    }
                }
                Logger.debug();
                return i3;
            } catch (Exception unused) {
                return i3;
            }
        } else if (i3 == 8) {
            Throwable cause = th.getCause();
            if (cause == null || !(cause instanceof ConnectException)) {
                return i3;
            }
            String message3 = cause.getMessage();
            Logger.debug();
            Matcher matcher2 = Pattern.compile("failed to connect to +([\\w\\.\\-]+)?/(\\[([a-zA-Z0-9:]+)\\]|(\\d{1,3}(\\.\\d{1,3}){3,3})) \\(port \\d+\\)( +after \\d+ms)?: +\\w+ failed: (E[A-Z]+) .*").matcher(message3);
            if (matcher2.matches()) {
                if (matcher2.group(3) != null) {
                    matcher2.group(3);
                } else if (matcher2.group(4) != null) {
                    matcher2.group(4);
                }
                String group = matcher2.group(7);
                if (group != null) {
                    if ("ECONNRESET".equals(group)) {
                        i3 = 12;
                    } else if ("ECONNREFUSED".equals(group)) {
                        i3 = 13;
                    } else if ("EHOSTUNREACH".equals(group)) {
                        i3 = 14;
                    } else if ("ENETUNREACH".equals(group)) {
                        i3 = 15;
                    } else if ("EADDRNOTAVAIL".equals(group)) {
                        i3 = 16;
                    } else if ("EADDRINUSE".equals(group)) {
                        i3 = 17;
                    }
                }
            }
            Logger.debug();
            return i3;
        } else if (i3 != 4) {
            return i3;
        }
        String message4 = th.getMessage();
        if (message4.indexOf(" EIO (I/O error)") > 0) {
            return 37;
        }
        if (!(th instanceof FileNotFoundException)) {
            if (message4.indexOf(" ENOENT ") <= 0) {
                if (message4.indexOf("No such file or directory") <= 0) {
                    if (message4.indexOf(" ENOSPC ") <= 0) {
                        if (message4.indexOf("No space left on device") <= 0) {
                            if (message4.indexOf(" EDQUOT ") > 0) {
                                return 34;
                            }
                            if (message4.indexOf(" EROFS ") > 0) {
                                return 35;
                            }
                            if (message4.indexOf(" EACCES ") > 0) {
                                return 36;
                            }
                            return i3;
                        }
                    }
                    return 32;
                }
            }
        }
        return 33;
    }
}
