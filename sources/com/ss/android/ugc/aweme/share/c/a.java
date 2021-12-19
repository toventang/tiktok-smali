package com.ss.android.ugc.aweme.share.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;

public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f123417a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f123418b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f123419c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f123420d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f123421e;

    static {
        Covode.recordClassIndex(81052);
        String shareDir = AVExternalServiceImpl.a().configService().cacheConfig().shareDir();
        f123417a = shareDir;
        f123418b = shareDir + "tmp/";
        f123419c = shareDir + "pic/";
        f123420d = shareDir + "out/";
        f123421e = shareDir + "openPlatform/";
    }
}
