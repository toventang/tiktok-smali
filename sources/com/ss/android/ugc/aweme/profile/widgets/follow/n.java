package com.ss.android.ugc.aweme.profile.widgets.follow;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import f.a.t;
import h.f.b.l;
import java.util.Map;

public final class n implements com.bytedance.assem.arch.a.a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final m f117817a = new a(this);

    /* renamed from: b  reason: collision with root package name */
    public final IUserService f117818b;

    static {
        Covode.recordClassIndex(76317);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ m a() {
        return this.f117817a;
    }

    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f117819a;

        static {
            Covode.recordClassIndex(76318);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(n nVar) {
            this.f117819a = nVar;
        }

        @Override // com.ss.android.ugc.aweme.profile.widgets.follow.m
        public final t<BaseResponse> a(String str, String str2) {
            return this.f117819a.f117818b.a(str, str2);
        }

        @Override // com.ss.android.ugc.aweme.profile.widgets.follow.m
        public final Object a(String str, String str2, int i2, int i3, int i4, String str3, int i5, String str4, Map<String, String> map) {
            return this.f117819a.f117818b.a(str, str2, i2, i3, i4, str3, i5, str4, map);
        }
    }

    public n(IUserService iUserService) {
        l.d(iUserService, "");
        this.f117818b = iUserService;
    }
}
