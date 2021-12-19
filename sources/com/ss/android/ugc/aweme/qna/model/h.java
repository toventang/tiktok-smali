package com.ss.android.ugc.aweme.qna.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.vm.d;
import java.util.List;

public final class h extends f {

    /* renamed from: a  reason: collision with root package name */
    public final d f119508a;

    /* renamed from: b  reason: collision with root package name */
    public final k f119509b;

    /* renamed from: c  reason: collision with root package name */
    public final String f119510c;

    /* renamed from: d  reason: collision with root package name */
    public final String f119511d;

    /* renamed from: e  reason: collision with root package name */
    public final String f119512e;

    /* renamed from: f  reason: collision with root package name */
    public final List<User> f119513f;

    /* renamed from: j  reason: collision with root package name */
    public final String f119514j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f119515k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f119516l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f119517m;
    public boolean n;
    public final List<String> o;

    static {
        Covode.recordClassIndex(77667);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    private h(int i2, String str, d dVar, k kVar, String str2, String str3, String str4, List<? extends User> list, String str5, Boolean bool, boolean z, List<String> list2) {
        super(i2, str);
        this.f119508a = dVar;
        this.f119509b = kVar;
        this.f119510c = str2;
        this.f119511d = str3;
        this.f119512e = str4;
        this.f119513f = list;
        this.f119514j = str5;
        this.f119515k = bool;
        this.f119516l = false;
        this.f119517m = false;
        this.n = z;
        this.o = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i2, String str, d dVar, k kVar, String str2, String str3, String str4, List list, String str5, Boolean bool, boolean z, List list2, int i3) {
        this(i2, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : dVar, (i3 & 8) != 0 ? null : kVar, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : list, (i3 & 256) != 0 ? null : str5, (i3 & 512) != 0 ? null : bool, (i3 & 4096) != 0 ? false : z, (i3 & 8192) == 0 ? list2 : null);
    }
}
