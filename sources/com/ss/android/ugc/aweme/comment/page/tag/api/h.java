package com.ss.android.ugc.aweme.comment.page.tag.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import h.f.b.l;

public final class h implements com.bytedance.assem.arch.a.a<g> {

    /* renamed from: a  reason: collision with root package name */
    public VideoTagApi f72233a;

    /* renamed from: b  reason: collision with root package name */
    public final g f72234b = new a(this);

    static {
        Covode.recordClassIndex(44523);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ g a() {
        return this.f72234b;
    }

    public final VideoTagApi b() {
        VideoTagApi videoTagApi = this.f72233a;
        if (videoTagApi == null) {
            l.a("videoTagApi");
        }
        return videoTagApi;
    }

    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f72235a;

        static {
            Covode.recordClassIndex(44524);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(h hVar) {
            this.f72235a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.comment.page.tag.api.g
        public final t<b> a(long j2) {
            return this.f72235a.b().mentionAwemeCheck(j2);
        }

        @Override // com.ss.android.ugc.aweme.comment.page.tag.api.g
        public final t<BaseResponse> a(String str, String str2, long j2) {
            return this.f72235a.b().tagUpdate(str, str2, j2);
        }

        @Override // com.ss.android.ugc.aweme.comment.page.tag.api.g
        public final t<b> a(String str, String str2, boolean z, long j2) {
            return this.f72235a.b().mentionCheck(str, str2, z, j2);
        }
    }
}
