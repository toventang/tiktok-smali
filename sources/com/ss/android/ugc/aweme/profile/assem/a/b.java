package com.ss.android.ugc.aweme.profile.assem.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.api.AddVideoApi;
import com.ss.android.ugc.aweme.utils.em;

public final class b implements com.bytedance.assem.arch.a.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final a f116029a = new a(this);

    static {
        Covode.recordClassIndex(74835);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ a a() {
        return this.f116029a;
    }

    public static final class a implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f116030a;

        static {
            Covode.recordClassIndex(74836);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f116030a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.profile.assem.a.a
        public final Object a(long j2, String str, int i2) {
            String str2;
            AddVideoApi addVideoApi = AddVideoApi.f115974a;
            int[] a2 = em.a(101);
            String str3 = null;
            if (a2 != null) {
                str2 = String.valueOf(a2[0]) + "_" + String.valueOf(a2[1]);
            } else {
                str2 = null;
            }
            int[] a3 = em.a(200);
            if (a3 != null) {
                str3 = String.valueOf(a3[0]) + "_" + String.valueOf(a3[1]);
            }
            return addVideoApi.getMyPublishVideos(0, str2, str3, 1, j2, str, i2);
        }
    }
}
