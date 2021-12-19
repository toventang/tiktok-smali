package com.google.b.a.g.a;

import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f53597a = new c("-_.!~*'()@:$&,;=", false);

    /* renamed from: b  reason: collision with root package name */
    public static final b f53598b = new c("-_.!~*'():$&,;=", false);

    /* renamed from: c  reason: collision with root package name */
    public static final b f53599c = new c("-_.!~*'()@:$,;/?:", false);

    /* renamed from: d  reason: collision with root package name */
    private static final b f53600d = new c("-_.*", true);

    /* renamed from: e  reason: collision with root package name */
    private static final b f53601e = new c("-_.!~*'()@:$&,;=+/?", false);

    static {
        Covode.recordClassIndex(33169);
    }

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }
}
