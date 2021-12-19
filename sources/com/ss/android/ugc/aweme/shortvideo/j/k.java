package com.ss.android.ugc.aweme.shortvideo.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.d.a.b;
import java.util.ArrayList;
import java.util.List;

public final class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public String f128600a;

    /* renamed from: b  reason: collision with root package name */
    public String f128601b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f128602c;

    /* renamed from: d  reason: collision with root package name */
    public List<AVTextExtraStruct> f128603d;

    /* renamed from: e  reason: collision with root package name */
    public int f128604e;

    /* renamed from: f  reason: collision with root package name */
    public List<AVChallenge> f128605f;

    /* renamed from: g  reason: collision with root package name */
    public int f128606g;

    /* renamed from: h  reason: collision with root package name */
    public a f128607h;

    /* renamed from: i  reason: collision with root package name */
    public StickerChallenge f128608i;

    /* renamed from: j  reason: collision with root package name */
    public CompileProbeResult f128609j;

    /* renamed from: k  reason: collision with root package name */
    public String f128610k;

    /* renamed from: l  reason: collision with root package name */
    public int f128611l;

    /* renamed from: m  reason: collision with root package name */
    public List<String> f128612m;
    public List<User> n;
    public int o;
    public int p;
    public boolean q;
    public String r;
    public String s;
    public boolean t;
    public int u;
    public int v;
    public List<InteractionTagUserInfo> w;
    public List<String> x = new ArrayList();

    static {
        Covode.recordClassIndex(84316);
    }

    public k(String str, String str2, boolean z, List<AVTextExtraStruct> list, int i2, List<AVChallenge> list2, a aVar, StickerChallenge stickerChallenge, CompileProbeResult compileProbeResult, List<String> list3, boolean z2) {
        this.f128600a = str;
        this.f128601b = str2;
        this.f128602c = z;
        this.f128603d = list;
        this.f128604e = i2;
        this.f128605f = list2;
        this.f128607h = aVar;
        this.f128608i = stickerChallenge;
        this.f128609j = compileProbeResult;
        this.f128612m = list3;
        this.t = z2;
        this.u = 8;
    }
}
