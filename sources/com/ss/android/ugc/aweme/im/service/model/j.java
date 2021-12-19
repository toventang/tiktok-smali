package com.ss.android.ugc.aweme.im.service.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import java.util.List;

public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public IMContact f103913a;

    /* renamed from: b  reason: collision with root package name */
    public List<IMContact> f103914b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f103915c;

    /* renamed from: d  reason: collision with root package name */
    public String f103916d;

    /* renamed from: e  reason: collision with root package name */
    public String f103917e;

    /* renamed from: f  reason: collision with root package name */
    public String f103918f;

    /* renamed from: g  reason: collision with root package name */
    public String f103919g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f103920h;

    /* renamed from: i  reason: collision with root package name */
    public String f103921i;

    /* renamed from: j  reason: collision with root package name */
    public int f103922j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f103923k;

    static {
        Covode.recordClassIndex(66570);
    }

    public j(IMContact iMContact, boolean z, String str, String str2, String str3, String str4) {
        this.f103913a = iMContact;
        this.f103915c = z;
        this.f103916d = str;
        this.f103917e = str2;
        this.f103918f = str3;
        this.f103919g = str4;
        this.f103921i = null;
    }

    public j(List<IMContact> list, IMContact iMContact, int i2, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2) {
        this.f103914b = list;
        this.f103913a = iMContact;
        this.f103922j = i2;
        this.f103915c = z;
        this.f103916d = str;
        this.f103917e = str2;
        this.f103918f = str3;
        this.f103919g = str4;
        this.f103920h = z2;
        this.f103921i = str5;
    }
}
