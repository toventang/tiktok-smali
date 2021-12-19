package com.bytedance.frameworks.baselib.network.http.g;

import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f29364a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b  reason: collision with root package name */
    static final Pattern f29365b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c  reason: collision with root package name */
    static final Pattern f29366c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    static {
        Covode.recordClassIndex(17121);
    }
}
